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
import java.io.File;
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
    public MESSAGE readFile(File file){
        MESSAGE message = null;
        try
        {
            Document document = get34Document(file);
            message = getMessage(document);
            save(message);

        }
        catch (Exception  e)
        {
            e.printStackTrace();
        }
        return message;
    }
    private Document get34Document(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);
        return document;
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
        RELATIONSHIPS relationships = new RELATIONSHIPS();
        COLLATERALS collaterals = new COLLATERALS();
        COLLATERAL collateral = new COLLATERAL();
        LIABILITIES liabilities = null;
        SUBJECT_PROPERTY subjectProperty = null;
        Node dealNode = getDeal(document);
        PARTIES parties = null;
        LOANS loans = null;
        if(dealNode!=null) {
            subjectProperty = getSubjectProperty(dealNode);
            liabilities = getLiabilities(dealNode);
            loans = getLoans(dealNode);
            parties = getParties(dealNode);
            relationships = getRelationships(dealNode);

        }
        collaterals.setCOLLATERAL(collateral);
        collateral.setSUBJECT_PROPERTY(subjectProperty);
        message.setDEAL_SETS(deal_sets);
        deal_sets.setDEAL_SET(deal_set);
        deal_set.setDEALS(deals);
        deals.setDEAL(deal);
        deal.setLIABILITIES(liabilities);
        deal.setCOLLATERALS(collaterals);
        deal.setLOANS(loans);
        deal.setPARTIES(parties);
        deal.setRELATIONSHIPS(relationships);

        return message;
    }
    private RELATIONSHIPS getRelationships(Node dealNode){
        RELATIONSHIPS relationships = new RELATIONSHIPS();
        List<RELATIONSHIP> relationshipList = new ArrayList<>();
        Element dealNodeElement = (Element) dealNode;

        if(dealNodeElement.getElementsByTagName("RELATIONSHIPS").getLength()>0){
            Element relationshipsElement = (Element) dealNodeElement.getElementsByTagName("RELATIONSHIPS").item(0);
            NodeList relationShipNodeList = relationshipsElement.getElementsByTagName("RELATIONSHIP");
            for(int i=0;i<relationShipNodeList.getLength();i++){
                Element relationShipElement = (Element) relationShipNodeList.item(i);
                RELATIONSHIP relationship = new RELATIONSHIP();
                relationship.setArcrole(relationShipElement.getAttribute("xlink:arcrole"));
                relationship.setSequenceNumber(returnZeroIfBlank(relationShipElement.getAttribute("SequenceNumber")));
                relationship.setFrom(relationShipElement.getAttribute("xlink:from"));
                relationship.setTo(relationShipElement.getAttribute("xlink:to"));
                relationshipList.add(relationship);
            }


        }
        relationships.setRELATIONSHIP(relationshipList);
        return relationships;



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
    private PARTIES getParties(Node dealNode) throws XPathExpressionException {
        PARTIES parties = new PARTIES();
        List<PARTY> partyList = new ArrayList<>();
        PARTY party = null;
        NodeList nodeList = getNodeList(dealNode,"./DEAL/PARTIES");
        if(nodeList.getLength()>0){
            NodeList loanNodeList = nodeList.item(0).getChildNodes();
            for(int i=0;i<loanNodeList.getLength();i++){
                Node node = loanNodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("PARTY"))
                {
                    Element eElement = (Element) node;
                    party = getParty(eElement);
                    partyList.add(party);

                }
            }
            parties.setPARTY(partyList);
        }
        return parties;
    }
    private PARTY getParty(Element partyElement){
        PARTY party = new PARTY();
        INDIVIDUAL individual = new INDIVIDUAL();
        TAXPAYER_IDENTIFIERS taxpayerIdentifiers = new TAXPAYER_IDENTIFIERS();
        ROLES roles = new ROLES();

        NodeList nodeList = partyElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("INDIVIDUAL"))
            {
                Element eElement = (Element) node;
                individual = getIndividual(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("ROLES"))
            {
                Element eElement = (Element) node;
                roles = getRoles(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("TAXPAYER_IDENTIFIERS"))
            {
                Element eElement = (Element) node;
                taxpayerIdentifiers = getTaxpayerIdentifiers(eElement);


            }


        }
        party.setROLES(roles);
        party.setINDIVIDUAL(individual);
        party.setTAXPAYER_IDENTIFIERS(taxpayerIdentifiers);
        return party;

    }
    private TAXPAYER_IDENTIFIERS getTaxpayerIdentifiers(Element taxPayerIdentifierElement){
        TAXPAYER_IDENTIFIERS taxpayerIdentifiers = new TAXPAYER_IDENTIFIERS();
        TAXPAYER_IDENTIFIER taxpayerIdentifier = new TAXPAYER_IDENTIFIER();
        taxpayerIdentifier.setTaxpayerIdentifierValue(getTextContentFromElement(taxPayerIdentifierElement,"TaxpayerIdentifierType"));
        taxpayerIdentifier.setTaxpayerIdentifierType(getTextContentFromElement(taxPayerIdentifierElement,"TaxpayerIdentifierValue"));
        taxpayerIdentifiers.setTAXPAYER_IDENTIFIER(taxpayerIdentifier);
        return taxpayerIdentifiers;

    }
    private ROLES getRoles(Element rolesElement){
        ROLES roles = new ROLES();
        List<ROLE> roleList = new ArrayList<>();

        NodeList nodeList = rolesElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++) {
            Node node = nodeList.item(i);
           if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("ROLE"))
            {
                ROLE role = new ROLE();
                ROLE_DETAIL role_detail = new ROLE_DETAIL();
                PROPERTY_OWNER propertyOwner = new PROPERTY_OWNER();
                Element eElement = (Element) node;
                NodeList roleChildList = eElement.getChildNodes();
                for(int j=0;j<roleChildList.getLength();j++){
                    Node roleChildListNode = roleChildList.item(j);
                   if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("BORROWER")) {
                        Element borrowerElement = (Element) roleChildListNode;
                        BORROWER borrower = getBorrower(borrowerElement);
                        role.setBORROWER(borrower);


                    }
                    if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("ROLE_DETAIL")) {
                        Element roleDetailElement = (Element) roleChildListNode;
                        role_detail = getRoleDetail(roleDetailElement);
                        role.setROLE_DETAIL(role_detail);
                    }

                    if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("PROPERTY_OWNER")) {
                        Element propertyOwnerElement = (Element) roleChildListNode;
                        propertyOwner = getPropertyOwner(propertyOwnerElement);
                        role.setPROPERTY_OWNER(propertyOwner);
                    }

                }
                roleList.add(role);
                roles.setROLE(roleList);
            }

        }
        return roles;
    }
    private PROPERTY_OWNER getPropertyOwner(Element propertyOwnerElement){
        PROPERTY_OWNER propertyOwner = new PROPERTY_OWNER();
        propertyOwner.setPropertyOwnerStatusType(getTextContentFromElement(propertyOwnerElement,"PropertyOwnerStatusType"));
        propertyOwner.setRelationshipVestingType(getTextContentFromElement(propertyOwnerElement,"RelationshipVestingType"));
        return propertyOwner;

    }
      private ROLE_DETAIL getRoleDetail(Element roleDetailElement){
        ROLE_DETAIL role_detail = new ROLE_DETAIL();
        role_detail.setPartyRoleType(getTextContentFromElement(roleDetailElement,"PartyRoleType"));
        return role_detail;

    }

    private BORROWER getBorrower(Element borrowerElement){
       BORROWER borrower = new BORROWER();
       DECLARATION declaration = new DECLARATION();
       RESIDENCES residences = new RESIDENCES();
       CURRENT_INCOME current_income = new CURRENT_INCOME();
       GOVERNMENT_MONITORING government_monitoring = new GOVERNMENT_MONITORING();
       BORROWER_DETAIL borrower_detail = new BORROWER_DETAIL();
       EMPLOYERS employers = new EMPLOYERS();
       NodeList borrowerNodeList =  borrowerElement.getChildNodes();
       for(int i=0;i<borrowerNodeList.getLength();i++){
           Node borrowerListNode = borrowerNodeList.item(i);
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("BORROWER_DETAIL"))
           {
               Element eElement = (Element) borrowerListNode;
               borrower_detail = getBorrowerDetail(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("CURRENT_INCOME"))
           {
               Element eElement = (Element) borrowerListNode;
               current_income = getCurrentIncome(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("DECLARATION"))
           {
               Element eElement = (Element) borrowerListNode;
               declaration = getDeclaration(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("DEPENDENTS"))
           {
               Element eElement = (Element) borrowerListNode;
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("EMPLOYERS"))
           {
               Element eElement = (Element) borrowerListNode;
               employers = getEmployers(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("GOVERNMENT_MONITORING"))
           {
               Element eElement = (Element) borrowerListNode;
               government_monitoring = getGovernmentMonitoring(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("RESIDENCES"))
           {
               Element eElement = (Element) borrowerListNode;
               residences = getResidences(eElement);
           }

       }
       borrower.setCURRENT_INCOME(current_income);
       borrower.setDECLARATION(declaration);
       borrower.setGOVERNMENT_MONITORING(government_monitoring);
       borrower.setBORROWER_DETAIL(borrower_detail);
       borrower.setRESIDENCES(residences);
       borrower.setEMPLOYERS(employers);

       return borrower;
    }

    private EMPLOYERS getEmployers(Element employersElement){
        EMPLOYERS employers = new EMPLOYERS();
        List<EMPLOYER> employerList = new ArrayList<>();
        NodeList employerNodeList = employersElement.getElementsByTagName("EMPLOYER");
        for(int i=0;i<employerNodeList.getLength();i++){
            Element employerElement = (Element) employerNodeList.item(i);
            employerList.add(getEmployer(employerElement));
        }
        employers.setEMPLOYER(employerList);
        return employers;
    }
    private EMPLOYER getEmployer(Element employerElement){
        EMPLOYER employer = new EMPLOYER();
        ADDRESS address = new ADDRESS();
        EMPLOYMENT employment = new EMPLOYMENT();
        LEGAL_ENTITY legal_entity = new LEGAL_ENTITY();
        LEGAL_ENTITY_DETAIL legal_entity_detail = new LEGAL_ENTITY_DETAIL();
        CONTACTS contacts = new CONTACTS();
        CONTACT contact = new CONTACT();
        CONTACT_POINTS contact_points = new CONTACT_POINTS();
        CONTACT_POINT contact_point = new CONTACT_POINT();
        CONTACT_POINT_TELEPHONE contactPointTelephone = new CONTACT_POINT_TELEPHONE();
        employer.setLabel(employerElement.getAttribute("xlink:label"));
        employer.setSequenceNumber(returnZeroIfBlank(employerElement.getAttribute("SequenceNumber")));
        if(employerElement.getElementsByTagName("CONTACT_POINT_TELEPHONE").getLength()>0){
            Element contactPointTelephoneElement = (Element) employerElement.getElementsByTagName("CONTACT_POINT_TELEPHONE").item(0);
            contactPointTelephone.setContactPointTelephoneValue(getTextContentFromElement(contactPointTelephoneElement,"ContactPointTelephoneValue"));
        }
        if(employerElement.getElementsByTagName("LEGAL_ENTITY_DETAIL").getLength()>0){
            Element legalEntityDetailElement = (Element) employerElement.getElementsByTagName("LEGAL_ENTITY_DETAIL").item(0);
            legal_entity_detail.setFullName(getTextContentFromElement(legalEntityDetailElement,"FullName"));
        }
        if(employerElement.getElementsByTagName("ADDRESS").getLength()>0){
            Element addressElement = (Element) employerElement.getElementsByTagName("ADDRESS").item(0);
            address = getAddress(addressElement);

        }
        if(employerElement.getElementsByTagName("EMPLOYMENT").getLength()>0){
            Element employmentElement = (Element) employerElement.getElementsByTagName("EMPLOYMENT").item(0);
            employment = getEmployment(employmentElement);

        }
        contact_point.setCONTACT_POINT_TELEPHONE(contactPointTelephone);
        contact_points.setCONTACT_POINT(contact_point);
        contact.setCONTACT_POINTS(contact_points);
        contacts.setCONTACT(contact);
        legal_entity.setLEGAL_ENTITY_DETAIL(legal_entity_detail);
        legal_entity.setCONTACTS(contacts);
        employer.setLEGAL_ENTITY(legal_entity);
        employer.setADDRESS(address);
        employer.setEMPLOYMENT(employment);

        return employer;

    }
    private EMPLOYMENT getEmployment(Element employmentElement){
        EMPLOYMENT employment = new EMPLOYMENT();
        employment.setSpecialBorrowerEmployerRelationshipIndicator(returnfalseIfBlank(getTextContentFromElement(employmentElement,"EmploymentBorrowerSelfEmployedIndicator")));
        employment.setEmploymentClassificationType(getTextContentFromElement(employmentElement,"EmploymentClassificationType"));
        employment.setEmploymentPositionDescription(getTextContentFromElement(employmentElement,"EmploymentPositionDescription"));
        employment.setEmploymentStartDate(getTextContentFromElement(employmentElement,"EmploymentStartDate"));
        employment.setEmploymentStatusType(getTextContentFromElement(employmentElement,"EmploymentStatusType"));
        employment.setEmploymentTimeInLineOfWorkMonthsCount(returnZeroIfBlank(getTextContentFromElement(employmentElement,"EmploymentTimeInLineOfWorkMonthsCount")));
        employment.setSpecialBorrowerEmployerRelationshipIndicator(returnfalseIfBlank(getTextContentFromElement(employmentElement,"SpecialBorrowerEmployerRelationshipIndicator")));
        return employment;
    }
    private ADDRESS getAddress(Element addressElement){
        ADDRESS address = new ADDRESS();
        address.setAddressLineText(getTextContentFromElement(addressElement,"AddressLineText"));
        address.setCityName(getTextContentFromElement(addressElement,"CityName"));
        address.setCountryCode(getTextContentFromElement(addressElement,"CountryCode"));
        address.setPostalCode(getTextContentFromElement(addressElement,"PostalCode"));
        address.setStateCode(getTextContentFromElement(addressElement,"StateCode"));
        return address;
    }

    private CURRENT_INCOME getCurrentIncome(Element currentIncomeElement){
        CURRENT_INCOME current_income = new CURRENT_INCOME();
        CURRENT_INCOME_ITEMS currentIncomeItems = new CURRENT_INCOME_ITEMS();
        if(currentIncomeElement.getElementsByTagName("CURRENT_INCOME_ITEMS").getLength()>0){
            Element currentIncomeItemsElement = (Element) currentIncomeElement.getElementsByTagName("CURRENT_INCOME_ITEMS").item(0);
            currentIncomeItems = getCurrentIncomeItems(currentIncomeItemsElement);
        }

        current_income.setCURRENT_INCOME_ITEMS(currentIncomeItems);
        return current_income;

    }
    private CURRENT_INCOME_ITEMS getCurrentIncomeItems(Element currentIncomeItemsElement){
        CURRENT_INCOME_ITEMS currentIncomeItems = new CURRENT_INCOME_ITEMS();
        List<CURRENT_INCOME_ITEM> currentIncomeItems1 = new ArrayList<>();
        NodeList currentIncomeItemList = currentIncomeItemsElement.getElementsByTagName("CURRENT_INCOME_ITEM");
        for(int i=0;i<currentIncomeItemList.getLength();i++){
            Element currentIncomeItem = (Element) currentIncomeItemList.item(i);
            currentIncomeItems1.add(getCurrentIncomeItem(currentIncomeItem));
        }
        currentIncomeItems.setCURRENT_INCOME_ITEM(currentIncomeItems1);
        return currentIncomeItems;

    }

    private CURRENT_INCOME_ITEM getCurrentIncomeItem(Element currentIncomeItemElement){
        CURRENT_INCOME_ITEM currentIncomeItem = new CURRENT_INCOME_ITEM();
        CURRENT_INCOME_ITEM_DETAIL current_income_item_detail = new CURRENT_INCOME_ITEM_DETAIL();
        if(currentIncomeItemElement.getElementsByTagName("CURRENT_INCOME_ITEM_DETAIL").getLength()>0){
            Element currentIncomeItemDetail = (Element) currentIncomeItemElement.getElementsByTagName("CURRENT_INCOME_ITEM_DETAIL").item(0);
            current_income_item_detail.setCurrentIncomeMonthlyTotalAmount(returnDoubleZeroIfBlank(getTextContentFromElement(currentIncomeItemDetail,"CurrentIncomeMonthlyTotalAmount")));
            current_income_item_detail.setEmploymentIncomeIndicator(returnfalseIfBlank(getTextContentFromElement(currentIncomeItemDetail,"EmploymentIncomeIndicator")));
            current_income_item_detail.setIncomeType(getTextContentFromElement(currentIncomeItemDetail,"IncomeType"));
        }
        currentIncomeItem.setLabel(currentIncomeItemElement.getAttribute("xlink:label"));
        currentIncomeItem.setSequenceNumber(returnZeroIfBlank(currentIncomeItemElement.getAttribute("SequenceNumber")));
        currentIncomeItem.setCURRENT_INCOME_ITEM_DETAIL(current_income_item_detail);
        return currentIncomeItem;

    }


    private RESIDENCES getResidences(Element residencesElement){
        RESIDENCES residences = new RESIDENCES();
        RESIDENCE residence = new RESIDENCE();
        ADDRESS address = new ADDRESS();
        RESIDENCE_DETAIL residence_detail = new RESIDENCE_DETAIL();
        if(residencesElement.getElementsByTagName("RESIDENCE").getLength()>0){
            Element residenceElement = (Element) residencesElement.getElementsByTagName("RESIDENCE").item(0);
            if(residenceElement.getElementsByTagName("ADDRESS").getLength()>0){
                Element addressElement = (Element) residencesElement.getElementsByTagName("ADDRESS").item(0);
                address = getAddress(addressElement);
            }
            if(residenceElement.getElementsByTagName("RESIDENCE_DETAIL").getLength()>0){
                Element residenceDetailElement = (Element) residencesElement.getElementsByTagName("RESIDENCE_DETAIL").item(0);
                residence_detail.setBorrowerResidencyBasisType(getTextContentFromElement(residenceDetailElement,"BorrowerResidencyBasisType"));
                residence_detail.setBorrowerResidencyDurationMonthsCount(returnZeroIfBlank(getTextContentFromElement(residenceDetailElement,"BorrowerResidencyDurationMonthsCount")));
                residence_detail.setBorrowerResidencyType(getTextContentFromElement(residenceDetailElement,"BorrowerResidencyType"));
            }

        }
        residence.setRESIDENCE_DETAIL(residence_detail);
        residence.setADDRESS(address);

        residences.setRESIDENCE(residence);
        return residences;

    }
    private GOVERNMENT_MONITORING getGovernmentMonitoring(Element governmentMonitoringElement){
        GOVERNMENT_MONITORING government_monitoring = new GOVERNMENT_MONITORING();
        GOVERNMENT_MONITORING_DETAIL government_monitoring_detail = new GOVERNMENT_MONITORING_DETAIL();
        if(governmentMonitoringElement.getElementsByTagName("GOVERNMENT_MONITORING_DETAIL").getLength()>0){
            Element governmentMonitoringDetailElement = (Element) governmentMonitoringElement.getElementsByTagName("GOVERNMENT_MONITORING_DETAIL").item(0);
            government_monitoring_detail.setHMDAEthnicityRefusalIndicator(returnfalseIfBlank(getTextContentFromElement(governmentMonitoringDetailElement,"HMDAEthnicityRefusalIndicator")));
            government_monitoring_detail.setHMDAGenderRefusalIndicator(returnfalseIfBlank(getTextContentFromElement(governmentMonitoringDetailElement,"HMDAGenderRefusalIndicator")));
            government_monitoring_detail.setHMDARaceRefusalIndicator(returnfalseIfBlank(getTextContentFromElement(governmentMonitoringDetailElement,"HMDARaceRefusalIndicator")));

        }
        government_monitoring.setGOVERNMENT_MONITORING_DETAIL(government_monitoring_detail);
        return government_monitoring;

    }
    private DECLARATION getDeclaration(Element declarationElement){
        DECLARATION declaration = new DECLARATION();
        DECLARATION_DETAIL declaration_detail = new DECLARATION_DETAIL();
        if(declarationElement.getElementsByTagName("DECLARATION_DETAIL").getLength()>0){
            Element declarionDetailElement = (Element)declarationElement.getElementsByTagName("DECLARATION_DETAIL").item(0);
            declaration_detail.setBankruptcyIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"BankruptcyIndicator")));
            declaration_detail.setCitizenshipResidencyType(getTextContentFromElement(declarionDetailElement,"CitizenshipResidencyType"));
            declaration_detail.setHomeownerPastThreeYearsType(getTextContentFromElement(declarionDetailElement,"HomeownerPastThreeYearsType"));
            declaration_detail.setIntentToOccupyType(getTextContentFromElement(declarionDetailElement,"IntentToOccupyType"));
            declaration_detail.setOutstandingJudgmentsIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"OutstandingJudgmentsIndicator")));
            declaration_detail.setPartyToLawsuitIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PartyToLawsuitIndicator")));
            declaration_detail.setPresentlyDelinquentIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PresentlyDelinquentIndicator")));
            declaration_detail.setPriorPropertyDeedInLieuConveyedIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PriorPropertyDeedInLieuConveyedIndicator")));
            declaration_detail.setPriorPropertyForeclosureCompletedIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PriorPropertyForeclosureCompletedIndicator")));
            declaration_detail.setPriorPropertyShortSaleCompletedIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PriorPropertyShortSaleCompletedIndicator")));
            declaration_detail.setPropertyProposedCleanEnergyLienIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PropertyProposedCleanEnergyLienIndicator")));
            declaration_detail.setUndisclosedBorrowedFundsIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedBorrowedFundsIndicator")));
            declaration_detail.setUndisclosedComakerOfNoteIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedComakerOfNoteIndicator")));
            declaration_detail.setUndisclosedCreditApplicationIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedCreditApplicationIndicator")));
            declaration_detail.setUndisclosedMortgageApplicationIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedMortgageApplicationIndicator")));
        }
        declaration.setDECLARATION_DETAIL(declaration_detail);
        return declaration;
    }
    private BORROWER_DETAIL getBorrowerDetail(Element borrowerDetailElement){
        BORROWER_DETAIL borrower_detail = new BORROWER_DETAIL();
        borrower_detail.setBorrowerBirthDate(getTextContentFromElement(borrowerDetailElement,"BorrowerBirthDate"));
        borrower_detail.setCommunityPropertyStateResidentIndicator(returnfalseIfBlank(getTextContentFromElement(borrowerDetailElement,"CommunityPropertyStateResidentIndicator")));
        borrower_detail.setDependentCount(returnZeroIfBlank(getTextContentFromElement(borrowerDetailElement,"DependentCount")));
        borrower_detail.setDomesticRelationshipIndicator(returnfalseIfBlank(getTextContentFromElement(borrowerDetailElement,"DomesticRelationshipIndicator")));
        borrower_detail.setMaritalStatusType(getTextContentFromElement(borrowerDetailElement,"MaritalStatusType"));
        return borrower_detail;
    }




    private INDIVIDUAL getIndividual(Element individualElement){
        INDIVIDUAL individual = new INDIVIDUAL();
        NodeList nodeList = individualElement.getChildNodes();
        NAME name = new NAME();
       for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("CONTACT_POINTS"))
            {
                Element eElement = (Element) node;
            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("NAME"))
            {
                Element eElement = (Element) node;
                NodeList nodeList1 = eElement.getElementsByTagName("FirstName");
                NodeList nodeList2 =  eElement.getElementsByTagName("LastName");
                if(nodeList1.getLength()>0){
                    name.setFirstName(nodeList1.item(0).getTextContent());
                }
                if(nodeList1.getLength()>0){
                    name.setLastName(nodeList2.item(0).getTextContent());
                }


            }


        }
        individual.setNAME(name);
       return individual;

    }
    private LOAN getLoan(Node loanElement){
        LOAN loan = new LOAN();
        NodeList nodeList = loanElement.getChildNodes();
        AMORTIZATION amortization = null;
        CLOSING_INFORMATION closing_information = new CLOSING_INFORMATION();
        HOUSING_EXPENSES housing_expenses = new HOUSING_EXPENSES();
        LOAN_DETAIL loan_detail = new LOAN_DETAIL();
        TERMS_OF_LOAN terms_of_loan = new TERMS_OF_LOAN();
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
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("TERMS_OF_LOAN"))
            {
                Element eElement = (Element) node;
                terms_of_loan = getTermsOfLoan(eElement);

            }
        }
        loan.setHOUSING_EXPENSES(housing_expenses);
        loan.setCLOSING_INFORMATION(closing_information);
        loan.setAMORTIZATION(amortization);
        loan.setLOAN_DETAIL(loan_detail);
        loan.setTERMS_OF_LOAN(terms_of_loan);
        return loan;
    }
    private TERMS_OF_LOAN getTermsOfLoan(Element termsOfLoanElement){
        TERMS_OF_LOAN terms_of_loan = new TERMS_OF_LOAN();
        terms_of_loan.setBaseLoanAmount(returnDoubleZeroIfBlank(getTextContentFromElement(termsOfLoanElement,"BaseLoanAmount")));
        terms_of_loan.setLienPriorityType(getTextContentFromElement(termsOfLoanElement,"LienPriorityType"));
        terms_of_loan.setLoanPurposeType(getTextContentFromElement(termsOfLoanElement,"LoanPurposeType"));
        terms_of_loan.setMortgageType(getTextContentFromElement(termsOfLoanElement,"MortgageType"));
        terms_of_loan.setNoteAmount(returnDoubleZeroIfBlank(getTextContentFromElement(termsOfLoanElement,"NoteAmount")));
        terms_of_loan.setNoteRatePercent(returnDoubleZeroIfBlank(getTextContentFromElement(termsOfLoanElement,"NoteRatePercent")));

        return terms_of_loan;

    }


    private LOAN_DETAIL getLoanDetail(Element loanDeatailElement){
        LOAN_DETAIL loan_detail = new LOAN_DETAIL();
        loan_detail.setConstructionLoanIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"BalloonIndicator")));
        loan_detail.setBuydownTemporarySubsidyFundingIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"BuydownTemporarySubsidyFundingIndicator")));
        loan_detail.setConstructionLoanIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"ConstructionLoanIndicator")));
        loan_detail.setConversionOfContractForDeedIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"ConversionOfContractForDeedIndicator")));
        loan_detail.setEnergyRelatedImprovementsIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"EnergyRelatedImprovementsIndicator")));
        loan_detail.setInterestOnlyIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"InterestOnlyIndicator")));
        loan_detail.setNegativeAmortizationIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"NegativeAmortizationIndicator")));
        loan_detail.setPrepaymentPenaltyIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"PrepaymentPenaltyIndicator")));
        loan_detail.setRenovationLoanIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"RenovationLoanIndicator")));
        loan_detail.setTotalMortgagedPropertiesCount(returnZeroIfBlank(getTextContentFromElement(loanDeatailElement,"TotalMortgagedPropertiesCount")));

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
        housing_expense.setHousingExpensePaymentAmount(returnDoubleZeroIfBlank(getTextContentFromElement(housingExpenseElement,"HousingExpensePaymentAmount")));
        housing_expense.setHousingExpenseType(getTextContentFromElement(housingExpenseElement,"HousingExpenseType"));
        housing_expense.setHousingExpenseTimingType(getTextContentFromElement(housingExpenseElement,"HousingExpenseTimingType"));
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
        amortization_rule.setAmortizationType(getTextContentFromElement(amortizationRuleElement,"AmortizationType"));
        amortization_rule.setLoanAmortizationPeriodCount(returnZeroIfBlank(getTextContentFromElement(amortizationRuleElement,"LoanAmortizationPeriodCount")));
        amortization_rule.setLoanAmortizationPeriodType(getTextContentFromElement(amortizationRuleElement,"LoanAmortizationPeriodType"));
        return amortization_rule;
    }


    private SALES_CONTRACT_DETAIL getSalesContractDetail(Element salesContacDetailElement) throws XPathExpressionException {
        SALES_CONTRACT_DETAIL sales_contract_detail = new SALES_CONTRACT_DETAIL();
        sales_contract_detail.setSalesContractAmount(returnDoubleZeroIfBlank(getTextContentFromElement(salesContacDetailElement,"SalesContractAmount")));
        return sales_contract_detail;
    }

    private PROPERTY_DETAIL getPropertyDetail(Element  propertyDetailElement) throws XPathExpressionException {
        PROPERTY_DETAIL property_detail = new PROPERTY_DETAIL();
        property_detail.setCommunityPropertyStateIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"CommunityPropertyStateIndicator")));
        property_detail.setAttachmentType(getTextContentFromElement(propertyDetailElement,"AttachmentType"));
        property_detail.setFinancedUnitCount(returnZeroIfBlank(getTextContentFromElement(propertyDetailElement,"FinancedUnitCount")));
        property_detail.setPropertyEstateType(getTextContentFromElement(propertyDetailElement,"PropertyEstateType"));
        property_detail.setPropertyEstimatedValueAmount(returnDoubleZeroIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyEstimatedValueAmount")));
        property_detail.setPropertyExistingCleanEnergyLienIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyExistingCleanEnergyLienIndicator")));
        property_detail.setPropertyInProjectIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyInProjectIndicator")));
        property_detail.setPropertyMixedUsageIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyMixedUsageIndicator")));
        property_detail.setPropertyUsageType(getTextContentFromElement(propertyDetailElement,"PropertyUsageType"));
        property_detail.setPUDIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PUDIndicator")));
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
        liability_summary.setTotalSubjectPropertyPayoffsAndPaymentsAmount(returnDoubleZeroIfBlank(getTextContentFromElement(liabilitySummaryElement,"TotalSubjectPropertyPayoffsAndPaymentsAmount")));
        liability_summary.setTotalNonSubjectPropertyDebtsToBePaidOffAmount(returnDoubleZeroIfBlank(getTextContentFromElement(liabilitySummaryElement,"TotalNonSubjectPropertyDebtsToBePaidOffAmount")));
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
                liability_detail.setLiabilityType(getTextContentFromElement(eElement,"LiabilityAccountIdentifier"));
                liability_detail.setLiabilityExclusionIndicator(returnfalseIfBlank(getTextContentFromElement(eElement,"LiabilityExclusionIndicator")));
                liability_detail.setLiabilityMonthlyPaymentAmount(returnDoubleZeroIfBlank(getTextContentFromElement(eElement,"LiabilityMonthlyPaymentAmount")));
                liability_detail.setLiabilityPayoffStatusIndicator(returnfalseIfBlank(getTextContentFromElement(eElement,"LiabilityPayoffStatusIndicator")));
                liability_detail.setLiabilityType(getTextContentFromElement(eElement,"LiabilityType"));
                liability_detail.setLiabilityUnpaidBalanceAmount(returnDoubleZeroIfBlank(getTextContentFromElement(eElement,"LiabilityUnpaidBalanceAmount")));
            }
        }
        return liability_detail;
    }
    private SUBJECT_PROPERTY getSubjectProperty(Node dealNode) throws XPathExpressionException {
        SUBJECT_PROPERTY subject_property = new SUBJECT_PROPERTY();
        ADDRESS address = new ADDRESS();
        String expression = "./DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY";
        NodeList nodeList = getNodeList(dealNode,expression);
        LOCATION_IDENTIFIER location_identifier = new LOCATION_IDENTIFIER();
        PROPERTY_DETAIL property_detail = new PROPERTY_DETAIL();
        NodeList nodeList1 = nodeList.item(0).getChildNodes();
        SALES_CONTRACTS sales_contracts = new SALES_CONTRACTS();
        if(nodeList1.getLength()>0) {
            for (int temp = 0; temp < nodeList1.getLength(); temp++) {
                Node node = nodeList1.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("ADDRESS")) {
                    Element eElement = (Element) node;
                    address = getAddress(eElement);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LOCATION_IDENTIFIER")) {
                    Element eElement = (Element) node;
                    location_identifier = getLocationIdentifier(eElement);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("PROPERTY_DETAIL")) {
                    Element eElement = (Element) node;
                    property_detail = getPropertyDetail(eElement);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("SALES_CONTRACTS")) {
                    Element eElement = (Element) node;
                    sales_contracts = getSalesContacts(eElement);
                }
            }
        }

        subject_property.setLOCATION_IDENTIFIER(location_identifier);
        subject_property.setADDRESS(address);
        subject_property.setLOCATION_IDENTIFIER(location_identifier);
        subject_property.setPROPERTY_DETAIL(property_detail);
        subject_property.setSALES_CONTRACTS(sales_contracts);
        return subject_property;
    }
    private SALES_CONTRACTS getSalesContacts(Element salesContacts) throws XPathExpressionException {
        SALES_CONTRACTS sales_contracts = new SALES_CONTRACTS();
        NodeList nodeList = salesContacts.getElementsByTagName("SALES_CONTRACT");
        SALES_CONTRACT sales_contract = new SALES_CONTRACT();
        if(nodeList.getLength()>0) {
            Element salesContactElement = (Element)nodeList.item(0);
            sales_contract = getSalesContact(salesContactElement);
        }
        sales_contracts.setSALES_CONTRACT(sales_contract);
        return sales_contracts;
   }
   private SALES_CONTRACT getSalesContact(Element salesContactElement) throws XPathExpressionException {
       SALES_CONTRACT sales_contract = new SALES_CONTRACT();
       SALES_CONTRACT_DETAIL sales_contract_detail = new SALES_CONTRACT_DETAIL();
       NodeList nodeList = salesContactElement.getElementsByTagName("SALES_CONTRACT_DETAIL");
       if(nodeList.getLength()>0) {
           Element salesContactDetailElement = (Element)nodeList.item(0);
           sales_contract_detail = getSalesContractDetail(salesContactDetailElement);
       }
       sales_contract.setSALES_CONTRACT_DETAIL(sales_contract_detail);
       return sales_contract;
   }


    private LOCATION_IDENTIFIER getLocationIdentifier(Element locationIdentifierElement) throws XPathExpressionException {
        LOCATION_IDENTIFIER location_identifier = new LOCATION_IDENTIFIER();
        FIPS_INFORMATION fips_information = new FIPS_INFORMATION();
        NodeList nodeList = locationIdentifierElement.getElementsByTagName("FIPS_INFORMATION");
        if(nodeList.getLength() > 0){
            Element eElement = (Element) nodeList.item(0);
            fips_information = getFipsInformation(eElement);

        }
        location_identifier.setFIPS_INFORMATION(fips_information);
        return location_identifier;
    }


   private FIPS_INFORMATION getFipsInformation(Element fipsInformationElement)throws XPathExpressionException{
        FIPS_INFORMATION fips_information = new FIPS_INFORMATION();
        fips_information.setFIPSCountyCode(returnZeroIfBlank(getTextContentFromElement(fipsInformationElement,"FIPSCountyCode")));
        fips_information.setFIPSStateNumericCode(returnZeroIfBlank(getTextContentFromElement(fipsInformationElement,"FIPSStateNumericCode")));
        return fips_information;
    }

    /***
     * Utility Functions
     * @param s
     * @return
     */
    private String getTextContentFromElement(Element element, String elementName){
        String retValue = "";
        if(element.getElementsByTagName(elementName).getLength()>0){
            retValue = element.getElementsByTagName(elementName).item(0).getTextContent();
        }
        return retValue;
    }

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




