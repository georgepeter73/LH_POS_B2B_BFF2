package com.lh.pos.bff.service;

import com.lh.pos.bff.collection.LoanApplication;
import com.lh.pos.bff.dom.*;
import com.lh.pos.bff.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.util.ArrayList;
import java.util.List;


@Service
public class XmlProcessingService {
    @Autowired
    LoanApplicationRepository loanApplicationRepository;

    public void process(){
        JAXBContext jaxbContext;
        try
        {
            Resource resource = new ClassPathResource("sample.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(resource.getFile());
            Node dealNode = getDeal(document);
            if(dealNode!=null) {
                ADDRESS subjectPropertyAddress = getSubjectPropertyAddress(dealNode);
                FIPS_INFORMATION fips_information = getFipsInformation(dealNode);
                PROPERTY_DETAIL property_detail = getPropertyDetail(dealNode);
                LIABILITIES liabilities = getLiabilities(dealNode);
                System.out.println(liabilities.getLIABILITY().size());
            }
            //MESSAGE message = new MESSAGE();
            //save(message);
        }
        catch (Exception  e)
        {
            e.printStackTrace();
        }
    }

    private boolean save(MESSAGE message){
        LoanApplication loanApplication = new LoanApplication();
        loanApplication.setMessage(message);
        loanApplicationRepository.save(loanApplication);
        return true;

    }
    private Node getDeal(Document document)throws XPathExpressionException{
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/MESSAGE/DEAL_SETS/DEAL_SET/DEALS";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);
        if(nodeList.getLength()>0){
            return nodeList.item(0);
        }
        return null;
    }


    private SALES_CONTRACT_DETAIL getSalesContractDetail(Node dealNode) throws XPathExpressionException {
        NodeList nodeList = getNodeList(dealNode,"./DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY/SALES_CONTRACTS/SALES_CONTRACT/SALES_CONTRACT_DETAIL");
        SALES_CONTRACT_DETAIL sales_contract_detail = new SALES_CONTRACT_DETAIL();
        for (int temp = 0; temp < nodeList.getLength(); temp++)
        {
            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element eElement = (Element) node;
                sales_contract_detail.setSalesContractAmount(returnDoubleZeroIfBlank(eElement.getElementsByTagName("SalesContractAmount").item(0).getTextContent()));
            }
        }
        return sales_contract_detail;
    }

    private PROPERTY_DETAIL getPropertyDetail(Node dealNode) throws XPathExpressionException {
        NodeList nodeList = getNodeList(dealNode,"./DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY/PROPERTY_DETAIL");
        PROPERTY_DETAIL property_detail = new PROPERTY_DETAIL();
        for (int temp = 0; temp < nodeList.getLength(); temp++)
        {
            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element eElement = (Element) node;
                property_detail.setCommunityPropertyStateIndicator(returnfalseIfBlank(eElement.getElementsByTagName("CommunityPropertyStateIndicator").item(0).getTextContent()));
                property_detail.setAttachmentType(eElement.getElementsByTagName("AttachmentType").item(0).getTextContent());
                property_detail.setFinancedUnitCount(returnZeroIfBlank(eElement.getElementsByTagName("FinancedUnitCount").item(0).getTextContent()));
                property_detail.setPropertyEstateType(eElement.getElementsByTagName("PropertyEstateType").item(0).getTextContent());
                property_detail.setPropertyEstimatedValueAmount(returnDoubleZeroIfBlank(eElement.getElementsByTagName("PropertyEstimatedValueAmount").item(0).getTextContent()));
                property_detail.setPropertyExistingCleanEnergyLienIndicator(returnfalseIfBlank(eElement.getElementsByTagName("PropertyExistingCleanEnergyLienIndicator").item(0).getTextContent()));
                property_detail.setPropertyInProjectIndicator(returnfalseIfBlank(eElement.getElementsByTagName("PropertyInProjectIndicator").item(0).getTextContent()));
                property_detail.setPropertyMixedUsageIndicator(returnfalseIfBlank(eElement.getElementsByTagName("PropertyMixedUsageIndicator").item(0).getTextContent()));
                property_detail.setPropertyUsageType(eElement.getElementsByTagName("PropertyUsageType").item(0).getTextContent());
                property_detail.setPUDIndicator(returnfalseIfBlank(eElement.getElementsByTagName("PUDIndicator").item(0).getTextContent()));

            }
        }
        return property_detail;
    }
    private LIABILITIES getLiabilities(Node dealNode) throws XPathExpressionException {
        LIABILITIES liabilities = new LIABILITIES();
        LIABILITY_SUMMARY liability_summary = new LIABILITY_SUMMARY();
        List<LIABILITY> liabilityList = new ArrayList<>();
        NodeList nodeList = getNodeList(dealNode,"./DEAL/LIABILITIES");
        if(nodeList.getLength()>0) {
            NodeList liabilityNodeList = nodeList.item(0).getChildNodes();
            for (int temp = 0; temp < liabilityNodeList.getLength(); temp++)
            {
                Node node = liabilityNodeList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LIABILITY"))
                {
                    Element liabilityElement = (Element) node;
                    LIABILITY liability = getLiability(liabilityElement);
                    liabilityList.add(liability);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LIABILITY_SUMMARY"))
                {
                    Element liabilitySummaryElement = (Element) node;
                    liability_summary = getLiabilitySummary(liabilitySummaryElement);
                    liabilities.setLIABILITY_SUMMARY(liability_summary);
                }
            }
            liabilities.setLIABILITY(liabilityList);
        }
        return liabilities;

    }
    private LIABILITY_SUMMARY getLiabilitySummary(Element liabilitySummaryElement){
        LIABILITY_SUMMARY liability_summary = new LIABILITY_SUMMARY();
        liability_summary.setTotalSubjectPropertyPayoffsAndPaymentsAmount(returnDoubleZeroIfBlank(liabilitySummaryElement.getElementsByTagName("TotalSubjectPropertyPayoffsAndPaymentsAmount").item(0).getTextContent()));
        liability_summary.setTotalNonSubjectPropertyDebtsToBePaidOffAmount(returnDoubleZeroIfBlank(liabilitySummaryElement.getElementsByTagName("TotalNonSubjectPropertyDebtsToBePaidOffAmount").item(0).getTextContent()));
        return liability_summary;
    }
    private LIABILITY getLiability(Element liabilityElement){
        LIABILITY liability = new LIABILITY();
        liability.setSequenceNumber(returnZeroIfBlank(liabilityElement.getAttribute("SequenceNumber")));
        NodeList nodeList = liabilityElement.getElementsByTagName("LIABILITY_DETAIL");
        if(nodeList.getLength() > 0){
            LIABILITY_DETAIL liability_detail = getLiabilityDetail(nodeList);
            liability.setLIABILITY_DETAIL(liability_detail);
        }
        return liability;
    }
   private LIABILITY_DETAIL getLiabilityDetail(NodeList liabilityDetailNodeList){
        LIABILITY_DETAIL liability_detail = new LIABILITY_DETAIL();
       for (int temp = 0; temp < liabilityDetailNodeList.getLength(); temp++)
        {
            Node node = liabilityDetailNodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE )
            {
                Element eElement = (Element) node;
                liability_detail.setLiabilityType(eElement.getElementsByTagName("LiabilityAccountIdentifier").item(0).getTextContent());
                liability_detail.setLiabilityExclusionIndicator(returnfalseIfBlank(eElement.getElementsByTagName("LiabilityExclusionIndicator").item(0).getTextContent()));
                liability_detail.setLiabilityMonthlyPaymentAmount(returnDoubleZeroIfBlank(eElement.getElementsByTagName("LiabilityMonthlyPaymentAmount").item(0).getTextContent()));
                liability_detail.setLiabilityPayoffStatusIndicator(returnfalseIfBlank(eElement.getElementsByTagName("LiabilityPayoffStatusIndicator").item(0).getTextContent()));
                liability_detail.setLiabilityType(eElement.getElementsByTagName("LiabilityType").item(0).getTextContent());
                liability_detail.setLiabilityUnpaidBalanceAmount(returnDoubleZeroIfBlank(eElement.getElementsByTagName("LiabilityUnpaidBalanceAmount").item(0).getTextContent()));
            }
        }
        return liability_detail;
    }


    private ADDRESS getSubjectPropertyAddress(Node dealNode) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "./DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY/ADDRESS";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(dealNode, XPathConstants.NODESET);
        ADDRESS address = new ADDRESS();
        for (int temp = 0; temp < nodeList.getLength(); temp++)
        {
            Node node = nodeList.item(temp);
           if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                //Print each employee's detail
                Element eElement = (Element) node;
                address.setCountyName(eElement.getElementsByTagName("CountyName").item(0).getTextContent());
                address.setCityName(eElement.getElementsByTagName("CountyName").item(0).getTextContent());
                address.setAddressLineText(eElement.getElementsByTagName("AddressLineText").item(0).getTextContent());
            }
        }
        return address;
        }


    private FIPS_INFORMATION getFipsInformation(Node dealNode)throws XPathExpressionException{
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "./DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY/LOCATION_IDENTIFIER/FIPS_INFORMATION";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(dealNode, XPathConstants.NODESET);
        FIPS_INFORMATION fips_information = new FIPS_INFORMATION();
        for (int temp = 0; temp < nodeList.getLength(); temp++)
        {
            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                 Element eElement = (Element) node;
                fips_information.setFIPSCountyCode(returnZeroIfBlank(eElement.getElementsByTagName("FIPSCountyCode").item(0).getTextContent()));
                fips_information.setFIPSStateNumericCode(returnZeroIfBlank(eElement.getElementsByTagName("FIPSStateNumericCode").item(0).getTextContent()));
            }
        }
        return fips_information;
    }

    /***
     * Utility Functions
     * @param s
     * @return
     */

    private int returnZeroIfBlank(String s){
        if(s!=null && s.isBlank()){
            return 0;
        }else{
            return Integer.parseInt(s);
        }
    }
    private double returnDoubleZeroIfBlank(String s){
        if(s!=null && s.isBlank()){
            return 0;
        }else{
            return Double.parseDouble(s);
        }
    }
    private boolean returnfalseIfBlank(String s){
        if(s!=null && s.isBlank()){
            return false;
        }else{
            return Boolean.parseBoolean(s);
        }
    }
    private NodeList getNodeList(Node node,String expression) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(node, XPathConstants.NODESET);
        return nodeList;
    }


    }




