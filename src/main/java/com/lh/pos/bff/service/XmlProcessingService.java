package com.lh.pos.bff.service;

import com.lh.pos.bff.collection.LoanApplication;
import com.lh.pos.bff.dom.ADDRESS;
import com.lh.pos.bff.dom.FIPS_INFORMATION;
import com.lh.pos.bff.dom.MESSAGE;
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
            ADDRESS subjectPropertyAddress = getSubjectPropertyAddress(document);
            FIPS_INFORMATION fips_information = getFipsInformation(document);
            MESSAGE message = new MESSAGE();
            save(message);
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

    private ADDRESS getSubjectPropertyAddress(Document document) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/MESSAGE/DEAL_SETS/DEAL_SET/DEALS/DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY/ADDRESS";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);
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


    private FIPS_INFORMATION getFipsInformation(Document document)throws XPathExpressionException{
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/MESSAGE/DEAL_SETS/DEAL_SET/DEALS/DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY/LOCATION_IDENTIFIER/FIPS_INFORMATION";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);
        FIPS_INFORMATION fips_information = new FIPS_INFORMATION();
        for (int temp = 0; temp < nodeList.getLength(); temp++)
        {
            Node node = nodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                //Print each employee's detail
                Element eElement = (Element) node;
                fips_information.setFIPSCountyCode(returnZeroifBlank(eElement.getElementsByTagName("FIPSCountyCode").item(0).getTextContent()));
                fips_information.setFIPSStateNumericCode(returnZeroifBlank(eElement.getElementsByTagName("FIPSStateNumericCode").item(0).getTextContent()));
            }
        }
        return fips_information;
    }
    private int returnZeroifBlank(String s){
        if(s!=null && s.isBlank()){
            return 0;
        }else{
            return Integer.parseInt(s);
        }
    }
    }




