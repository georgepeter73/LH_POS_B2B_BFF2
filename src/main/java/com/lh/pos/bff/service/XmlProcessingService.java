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
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class XmlProcessingService {
    @Autowired
    LoanApplicationRepository loanApplicationRepository;
    public void process(){
        try
        {
            Document document = get34Document();
            MESSAGE message = getMessage(document);
            save(message);
        }
        catch (Exception  e)
        {
            e.printStackTrace();
        }
    }
    private Document get34Document() throws ParserConfigurationException, IOException, SAXException {
        Resource resource = new ClassPathResource("sample.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(resource.getFile());
        return document;
    }
    private MESSAGE getMessage(Document document) throws XPathExpressionException {
        MESSAGE message = new MESSAGE();
        DEAL_SETS deal_sets = new DEAL_SETS();
        DEAL_SET deal_set = new DEAL_SET();
        DEALS deals = new DEALS();
        DEAL deal = new DEAL();
        COLLATERALS collaterals = new COLLATERALS();
        COLLATERAL collateral = new COLLATERAL();
        FIPS_INFORMATION fips_information = null;
        LIABILITIES liabilities = null;
        SUBJECT_PROPERTY subjectPropertyAddress = null;
        PROPERTY_DETAIL property_detail = null;
        Node dealNode = getDeal(document);
        LOANS loans = null;
        if(dealNode!=null) {
            subjectPropertyAddress = getSubjectPropertyAddress(dealNode);
            fips_information = getFipsInformation(dealNode);
            property_detail = getPropertyDetail(dealNode);
            liabilities = getLiabilities(dealNode);
            loans = getLoans(dealNode);

        }
        LOCATION_IDENTIFIER location_identifier = new LOCATION_IDENTIFIER();
        location_identifier.setFIPS_INFORMATION(fips_information);
        collaterals.setCOLLATERAL(collateral);
        collateral.setSUBJECT_PROPERTY(subjectPropertyAddress);
        subjectPropertyAddress.setLOCATION_IDENTIFIER(location_identifier);
        subjectPropertyAddress.setPROPERTY_DETAIL(property_detail);
        message.setDEAL_SETS(deal_sets);
        deal_sets.setDEAL_SET(deal_set);
        deal_set.setDEALS(deals);
        deals.setDEAL(deal);
        deal.setLIABILITIES(liabilities);
        deal.setCOLLATERALS(collaterals);
        deal.setLOANS(loans);
        return message;
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
    private LOANS getLoans(Node dealNode) throws XPathExpressionException {
        LOANS loans = new LOANS();
        LOAN loan = null;
        NodeList nodeList = getNodeList(dealNode,"./DEAL/LOANS");
       if(nodeList.getLength()>0){
           NodeList loanNodeList = nodeList.item(0).getChildNodes();
           for(int i=0;i<loanNodeList.getLength();i++){
               Node node = loanNodeList.item(i);
               if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LOAN"))
               {
                   Element eElement = (Element) node;
                   loan = getLoan(eElement);

               }
           }
           loans.setLOAN(loan);
       }
       return loans;
    }
    private LOAN getLoan(Node loanElement){
        LOAN loan = new LOAN();
        NodeList nodeList = loanElement.getChildNodes();
        AMORTIZATION amortization = null;
        CLOSING_INFORMATION closing_information = new CLOSING_INFORMATION();
        HOUSING_EXPENSES housing_expenses = new HOUSING_EXPENSES();
        LOAN_DETAIL loan_detail = new LOAN_DETAIL();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("AMORTIZATION"))
            {
                Element eElement = (Element) node;
                amortization = getAmortization(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("CLOSING_INFORMATION"))
            {
                Element eElement = (Element) node;
                closing_information = getClosingInformation(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("HOUSING_EXPENSES"))
            {
                Element eElement = (Element) node;
                housing_expenses = getHousingExpenses(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LOAN_DETAIL"))
            {
                Element eElement = (Element) node;
                loan_detail = getLoanDetail(eElement);

            }

        }
        loan.setHOUSING_EXPENSES(housing_expenses);
        loan.setCLOSING_INFORMATION(closing_information);
        loan.setAMORTIZATION(amortization);
        loan.setLOAN_DETAIL(loan_detail);
        return loan;
    }

    private LOAN_DETAIL getLoanDetail(Element loanDeatailElement){
        LOAN_DETAIL loan_detail = new LOAN_DETAIL();
        loan_detail.setConstructionLoanIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("BalloonIndicator").item(0).getTextContent()));
        loan_detail.setBuydownTemporarySubsidyFundingIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("BuydownTemporarySubsidyFundingIndicator").item(0).getTextContent()));
        loan_detail.setConstructionLoanIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("ConstructionLoanIndicator").item(0).getTextContent()));
        loan_detail.setConversionOfContractForDeedIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("ConversionOfContractForDeedIndicator").item(0).getTextContent()));
        loan_detail.setEnergyRelatedImprovementsIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("EnergyRelatedImprovementsIndicator").item(0).getTextContent()));
        loan_detail.setInterestOnlyIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("InterestOnlyIndicator").item(0).getTextContent()));
        loan_detail.setNegativeAmortizationIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("NegativeAmortizationIndicator").item(0).getTextContent()));
        loan_detail.setPrepaymentPenaltyIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("PrepaymentPenaltyIndicator").item(0).getTextContent()));
        loan_detail.setRenovationLoanIndicator(returnfalseIfBlank(loanDeatailElement.getElementsByTagName("RenovationLoanIndicator").item(0).getTextContent()));
        loan_detail.setTotalMortgagedPropertiesCount(returnZeroIfBlank(loanDeatailElement.getElementsByTagName("TotalMortgagedPropertiesCount").item(0).getTextContent()));
        return loan_detail;
    }
    private HOUSING_EXPENSES getHousingExpenses(Element housingExpensesElement){
        HOUSING_EXPENSES housing_expenses = new HOUSING_EXPENSES();
        HOUSING_EXPENSE housing_expense = new HOUSING_EXPENSE();
        List<HOUSING_EXPENSE> housingExpenseList = new ArrayList<>();
        NodeList nodeList = housingExpensesElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("HOUSING_EXPENSE"))
            {
                Element eElement = (Element) node;
                housing_expense = getHousingExpense(eElement);
                housingExpenseList.add(housing_expense);

            }
        }
        housing_expenses.setHOUSING_EXPENSE(housingExpenseList);
        return housing_expenses;

    }

    private HOUSING_EXPENSE getHousingExpense(Element housingExpenseElement){
        HOUSING_EXPENSE housing_expense = new HOUSING_EXPENSE();
        housing_expense.setHousingExpensePaymentAmount(returnDoubleZeroIfBlank(housingExpenseElement.getElementsByTagName("HousingExpensePaymentAmount").item(0).getTextContent()));
        housing_expense.setHousingExpenseType(housingExpenseElement.getElementsByTagName("HousingExpenseType").item(0).getTextContent());
        housing_expense.setHousingExpenseTimingType(housingExpenseElement.getElementsByTagName("HousingExpenseTimingType").item(0).getTextContent());
        return housing_expense;
    }
    private CLOSING_INFORMATION getClosingInformation(Element closingInformationElement){
        CLOSING_INFORMATION closing_information = new CLOSING_INFORMATION();
        CLOSING_INFORMATION_DETAIL closing_information_detail = new CLOSING_INFORMATION_DETAIL();
        NodeList nodeList = closingInformationElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("CLOSING_INFORMATION_DETAIL"))
            {
                Element eElement = (Element) node;
                closing_information_detail = getClosingInformationDetail(eElement);

            }
        }
        closing_information.setCLOSING_INFORMATION_DETAIL(closing_information_detail);
        return closing_information;

    }
    private CLOSING_INFORMATION_DETAIL getClosingInformationDetail(Element closingInformationDetailElement){
        CLOSING_INFORMATION_DETAIL closing_information_detail = new CLOSING_INFORMATION_DETAIL();
        closing_information_detail.setCashFromBorrowerAtClosingAmount(returnDoubleZeroIfBlank(closingInformationDetailElement.getElementsByTagName("CashFromBorrowerAtClosingAmount").item(0).getTextContent()));
        return closing_information_detail;
    }
    private AMORTIZATION getAmortization(Element amortizationElement){
        AMORTIZATION amortization = new AMORTIZATION();
        NodeList nodeList = amortizationElement.getChildNodes();
        AMORTIZATION_RULE amortization_rule = null;
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("AMORTIZATION_RULE"))
            {
                Element eElement = (Element) node;
                amortization_rule = getAmortizationRule(eElement);

            }
        }
        amortization.setAMORTIZATION_RULE(amortization_rule);
        return amortization;
    }
    private AMORTIZATION_RULE getAmortizationRule(Element amortizationRuleElement){
        AMORTIZATION_RULE amortization_rule = new AMORTIZATION_RULE();
        amortization_rule.setAmortizationType(amortizationRuleElement.getElementsByTagName("AmortizationType").item(0).getTextContent());
        amortization_rule.setLoanAmortizationPeriodCount(returnZeroIfBlank(amortizationRuleElement.getElementsByTagName("LoanAmortizationPeriodCount").item(0).getTextContent()));
        amortization_rule.setLoanAmortizationPeriodType(amortizationRuleElement.getElementsByTagName("LoanAmortizationPeriodType").item(0).getTextContent());
        return amortization_rule;
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


    private SUBJECT_PROPERTY getSubjectPropertyAddress(Node dealNode) throws XPathExpressionException {
        SUBJECT_PROPERTY subject_property = new SUBJECT_PROPERTY();
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
        subject_property.setADDRESS(address);
        return subject_property;
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




