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
            postProcess(message);
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
            postProcess(message);
            save(message);

        }
        catch (Exception  e)
        {
            e.printStackTrace();
        }
        return message;
    }
    private void postProcess(MESSAGE message){
        if(message!=null && message.getDEAL_SETS()!=null &&
                message.getDEAL_SETS().getDEAL_SET()!=null &&
                message.getDEAL_SETS().getDEAL_SET().getDEALS()!=null &&
                message.getDEAL_SETS().getDEAL_SET().getDEALS().getDEAL()!=null) {
            DEAL deal = message.getDEAL_SETS().getDEAL_SET().getDEALS().getDEAL();
            if(deal.getLIABILITIES()!=null
                    && deal.getLIABILITIES().getLIABILITY()!=null
                    && deal.getPARTIES()!=null &&  deal.getPARTIES().getPARTY()!=null){
                List<LIABILITY> liabilities = deal.getLIABILITIES().getLIABILITY();
                List<PARTY> partyList = deal.getPARTIES().getPARTY();
                if (deal.getRELATIONSHIPS() != null && deal.getRELATIONSHIPS().getRELATIONSHIP() != null) {
                    for (RELATIONSHIP relationship : deal.getRELATIONSHIPS().getRELATIONSHIP()) {
                        String from = relationship.getFrom();
                        String to = relationship.getTo();
                        for (LIABILITY liability : liabilities) {
                            if (liability.getLabel().equals(from)) {
                                for (PARTY party : partyList) {
                                    List<ROLE> roleList = party.getROLES().getROLE();
                                    ;
                                    for (ROLE role : roleList) {
                                        if (role.getLabel().equalsIgnoreCase(to)) {
                                            role.getBORROWER().getLIABILITIES().add(liability);
                                        }

                                    }
                                }

                            }

                        }
                    }
                }
                //reset liabilities and relationships to avoid any duplicate data
                deal.getLIABILITIES().setLIABILITY(null);
                deal.setRELATIONSHIPS(null);
            }
        }
      }
      private ABOUT_VERSIONS getAboutVersions(Element aboutVersionsElement){
          ABOUT_VERSIONS aboutVersions1 = new ABOUT_VERSIONS();
          ABOUT_VERSION aboutVersion = new ABOUT_VERSION();
          aboutVersion.setCreatedDatetime(getTextContentFromElement(aboutVersionsElement,"CreatedDatetime"));
          aboutVersions1.setABOUT_VERSION(aboutVersion);
          return aboutVersions1;

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
        DEAL_SETS dealSets = new DEAL_SETS();
        DEAL_SET dealSet = new DEAL_SET();
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
        Element messageElement = (Element) getMessageNode(document);
        message.setDU(messageElement.getAttribute("xmlns:DU"));
        message.setULAD(messageElement.getAttribute("xmlns:ULAD"));
        message.setXlink(messageElement.getAttribute("xmlns:xlink"));
        message.setMISMOReferenceModelIdentifier(messageElement.getAttribute("MISMOReferenceModelIdentifier"));
        message.setXsi(messageElement.getAttribute("xmlns:xsi"));
        message.setXmlns(messageElement.getAttribute("xmlns"));
        message.setABOUT_VERSIONS(getAboutVersions(messageElement));

        if(dealNode!=null) {
            subjectProperty = getSubjectProperty(dealNode);
            liabilities = getLiabilities(dealNode);
            loans = getLoans(dealNode);
            parties = getParties(dealNode);
            relationships = getRelationships(dealNode);

        }
        collaterals.setCOLLATERAL(collateral);
        collateral.setSUBJECT_PROPERTY(subjectProperty);
        message.setDEAL_SETS(dealSets);
        dealSets.setDEAL_SET(dealSet);
        dealSet.setDEALS(deals);
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
    private Node getMessageNode(Document document) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "./MESSAGE";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);
        if(nodeList.getLength()>0){
            return nodeList.item(0);
        }
        return null;
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
                Element roleElement = (Element)node;
                ROLE role = new ROLE();
                ROLE_DETAIL roleDetail = new ROLE_DETAIL();
                PROPERTY_OWNER propertyOwner = new PROPERTY_OWNER();
                Element eElement = (Element) node;
                NodeList roleChildList = eElement.getChildNodes();
                role.setLabel(roleElement.getAttribute("xlink:label"));
                for(int j=0;j<roleChildList.getLength();j++){
                    Node roleChildListNode = roleChildList.item(j);
                   if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("BORROWER")) {
                        Element borrowerElement = (Element) roleChildListNode;
                        BORROWER borrower = getBorrower(borrowerElement);
                        role.setBORROWER(borrower);


                    }
                    if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("ROLE_DETAIL")) {
                        Element roleDetailElement = (Element) roleChildListNode;
                        roleDetail = getRoleDetail(roleDetailElement);
                        role.setROLE_DETAIL(roleDetail);
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
        ROLE_DETAIL roleDetail = new ROLE_DETAIL();
        roleDetail.setPartyRoleType(getTextContentFromElement(roleDetailElement,"PartyRoleType"));
        return roleDetail;

    }

    private BORROWER getBorrower(Element borrowerElement){
       BORROWER borrower = new BORROWER();
       DECLARATION declaration = new DECLARATION();
       RESIDENCES residences = new RESIDENCES();
       CURRENT_INCOME currentIncome = new CURRENT_INCOME();
       GOVERNMENT_MONITORING governmentMonitoring = new GOVERNMENT_MONITORING();
       BORROWER_DETAIL borrowerDetail = new BORROWER_DETAIL();
       EMPLOYERS employers = new EMPLOYERS();
       NodeList borrowerNodeList =  borrowerElement.getChildNodes();
       for(int i=0;i<borrowerNodeList.getLength();i++){
           Node borrowerListNode = borrowerNodeList.item(i);
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("BORROWER_DETAIL"))
           {
               Element eElement = (Element) borrowerListNode;
               borrowerDetail = getBorrowerDetail(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("CURRENT_INCOME"))
           {
               Element eElement = (Element) borrowerListNode;
               currentIncome = getCurrentIncome(eElement);
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
               governmentMonitoring = getGovernmentMonitoring(eElement);
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("RESIDENCES"))
           {
               Element eElement = (Element) borrowerListNode;
               residences = getResidences(eElement);
           }

       }
       borrower.setCURRENT_INCOME(currentIncome);
       borrower.setDECLARATION(declaration);
       borrower.setGOVERNMENT_MONITORING(governmentMonitoring);
       borrower.setBORROWER_DETAIL(borrowerDetail);
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
        LEGAL_ENTITY legalEntity = new LEGAL_ENTITY();
        LEGAL_ENTITY_DETAIL legalEntityDetail = new LEGAL_ENTITY_DETAIL();
        CONTACTS contacts = new CONTACTS();
        CONTACT contact = new CONTACT();
        CONTACT_POINTS contactPoints = new CONTACT_POINTS();
        CONTACT_POINT contactPoint = new CONTACT_POINT();
        CONTACT_POINT_TELEPHONE contactPointTelephone = new CONTACT_POINT_TELEPHONE();
        employer.setLabel(employerElement.getAttribute("xlink:label"));
        employer.setSequenceNumber(returnZeroIfBlank(employerElement.getAttribute("SequenceNumber")));
        if(employerElement.getElementsByTagName("CONTACT_POINT_TELEPHONE").getLength()>0){
            Element contactPointTelephoneElement = (Element) employerElement.getElementsByTagName("CONTACT_POINT_TELEPHONE").item(0);
            contactPointTelephone.setContactPointTelephoneValue(getTextContentFromElement(contactPointTelephoneElement,"ContactPointTelephoneValue"));
        }
        if(employerElement.getElementsByTagName("LEGAL_ENTITY_DETAIL").getLength()>0){
            Element legalEntityDetailElement = (Element) employerElement.getElementsByTagName("LEGAL_ENTITY_DETAIL").item(0);
            legalEntityDetail.setFullName(getTextContentFromElement(legalEntityDetailElement,"FullName"));
        }
        if(employerElement.getElementsByTagName("ADDRESS").getLength()>0){
            Element addressElement = (Element) employerElement.getElementsByTagName("ADDRESS").item(0);
            address = getAddress(addressElement);

        }
        if(employerElement.getElementsByTagName("EMPLOYMENT").getLength()>0){
            Element employmentElement = (Element) employerElement.getElementsByTagName("EMPLOYMENT").item(0);
            employment = getEmployment(employmentElement);

        }
        contactPoint.setCONTACT_POINT_TELEPHONE(contactPointTelephone);
        contactPoints.setCONTACT_POINT(contactPoint);
        contact.setCONTACT_POINTS(contactPoints);
        contacts.setCONTACT(contact);
        legalEntity.setLEGAL_ENTITY_DETAIL(legalEntityDetail);
        legalEntity.setCONTACTS(contacts);
        employer.setLEGAL_ENTITY(legalEntity);
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
        CURRENT_INCOME currentIncome = new CURRENT_INCOME();
        CURRENT_INCOME_ITEMS currentIncomeItems = new CURRENT_INCOME_ITEMS();
        if(currentIncomeElement.getElementsByTagName("CURRENT_INCOME_ITEMS").getLength()>0){
            Element currentIncomeItemsElement = (Element) currentIncomeElement.getElementsByTagName("CURRENT_INCOME_ITEMS").item(0);
            currentIncomeItems = getCurrentIncomeItems(currentIncomeItemsElement);
        }

        currentIncome.setCURRENT_INCOME_ITEMS(currentIncomeItems);
        return currentIncome;

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
        CURRENT_INCOME_ITEM_DETAIL currentIncomeItemDetail1 = new CURRENT_INCOME_ITEM_DETAIL();
        if(currentIncomeItemElement.getElementsByTagName("CURRENT_INCOME_ITEM_DETAIL").getLength()>0){
            Element currentIncomeItemDetail = (Element) currentIncomeItemElement.getElementsByTagName("CURRENT_INCOME_ITEM_DETAIL").item(0);
            currentIncomeItemDetail1.setCurrentIncomeMonthlyTotalAmount(returnDoubleZeroIfBlank(getTextContentFromElement(currentIncomeItemDetail,"CurrentIncomeMonthlyTotalAmount")));
            currentIncomeItemDetail1.setEmploymentIncomeIndicator(returnfalseIfBlank(getTextContentFromElement(currentIncomeItemDetail,"EmploymentIncomeIndicator")));
            currentIncomeItemDetail1.setIncomeType(getTextContentFromElement(currentIncomeItemDetail,"IncomeType"));
        }
        currentIncomeItem.setLabel(currentIncomeItemElement.getAttribute("xlink:label"));
        currentIncomeItem.setSequenceNumber(returnZeroIfBlank(currentIncomeItemElement.getAttribute("SequenceNumber")));
        currentIncomeItem.setCURRENT_INCOME_ITEM_DETAIL(currentIncomeItemDetail1);
        return currentIncomeItem;

    }


    private RESIDENCES getResidences(Element residencesElement){
        RESIDENCES residences = new RESIDENCES();
        RESIDENCE residence = new RESIDENCE();
        ADDRESS address = new ADDRESS();
        RESIDENCE_DETAIL residenceDetail = new RESIDENCE_DETAIL();
        if(residencesElement.getElementsByTagName("RESIDENCE").getLength()>0){
            Element residenceElement = (Element) residencesElement.getElementsByTagName("RESIDENCE").item(0);
            if(residenceElement.getElementsByTagName("ADDRESS").getLength()>0){
                Element addressElement = (Element) residencesElement.getElementsByTagName("ADDRESS").item(0);
                address = getAddress(addressElement);
            }
            if(residenceElement.getElementsByTagName("RESIDENCE_DETAIL").getLength()>0){
                Element residenceDetailElement = (Element) residencesElement.getElementsByTagName("RESIDENCE_DETAIL").item(0);
                residenceDetail.setBorrowerResidencyBasisType(getTextContentFromElement(residenceDetailElement,"BorrowerResidencyBasisType"));
                residenceDetail.setBorrowerResidencyDurationMonthsCount(returnZeroIfBlank(getTextContentFromElement(residenceDetailElement,"BorrowerResidencyDurationMonthsCount")));
                residenceDetail.setBorrowerResidencyType(getTextContentFromElement(residenceDetailElement,"BorrowerResidencyType"));
            }

        }
        residence.setRESIDENCE_DETAIL(residenceDetail);
        residence.setADDRESS(address);

        residences.setRESIDENCE(residence);
        return residences;

    }
    private GOVERNMENT_MONITORING getGovernmentMonitoring(Element governmentMonitoringElement){
        GOVERNMENT_MONITORING governmentMonitoring = new GOVERNMENT_MONITORING();
        GOVERNMENT_MONITORING_DETAIL governmentMonitoringDetail = new GOVERNMENT_MONITORING_DETAIL();
        if(governmentMonitoringElement.getElementsByTagName("GOVERNMENT_MONITORING_DETAIL").getLength()>0){
            Element governmentMonitoringDetailElement = (Element) governmentMonitoringElement.getElementsByTagName("GOVERNMENT_MONITORING_DETAIL").item(0);
            governmentMonitoringDetail.setHMDAEthnicityRefusalIndicator(returnfalseIfBlank(getTextContentFromElement(governmentMonitoringDetailElement,"HMDAEthnicityRefusalIndicator")));
            governmentMonitoringDetail.setHMDAGenderRefusalIndicator(returnfalseIfBlank(getTextContentFromElement(governmentMonitoringDetailElement,"HMDAGenderRefusalIndicator")));
            governmentMonitoringDetail.setHMDARaceRefusalIndicator(returnfalseIfBlank(getTextContentFromElement(governmentMonitoringDetailElement,"HMDARaceRefusalIndicator")));

        }
        governmentMonitoring.setGOVERNMENT_MONITORING_DETAIL(governmentMonitoringDetail);
        return governmentMonitoring;

    }
    private DECLARATION getDeclaration(Element declarationElement){
        DECLARATION declaration = new DECLARATION();
        DECLARATION_DETAIL declarationDetail = new DECLARATION_DETAIL();
        if(declarationElement.getElementsByTagName("DECLARATION_DETAIL").getLength()>0){
            Element declarionDetailElement = (Element)declarationElement.getElementsByTagName("DECLARATION_DETAIL").item(0);
            declarationDetail.setBankruptcyIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"BankruptcyIndicator")));
            declarationDetail.setCitizenshipResidencyType(getTextContentFromElement(declarionDetailElement,"CitizenshipResidencyType"));
            declarationDetail.setHomeownerPastThreeYearsType(getTextContentFromElement(declarionDetailElement,"HomeownerPastThreeYearsType"));
            declarationDetail.setIntentToOccupyType(getTextContentFromElement(declarionDetailElement,"IntentToOccupyType"));
            declarationDetail.setOutstandingJudgmentsIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"OutstandingJudgmentsIndicator")));
            declarationDetail.setPartyToLawsuitIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PartyToLawsuitIndicator")));
            declarationDetail.setPresentlyDelinquentIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PresentlyDelinquentIndicator")));
            declarationDetail.setPriorPropertyDeedInLieuConveyedIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PriorPropertyDeedInLieuConveyedIndicator")));
            declarationDetail.setPriorPropertyForeclosureCompletedIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PriorPropertyForeclosureCompletedIndicator")));
            declarationDetail.setPriorPropertyShortSaleCompletedIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PriorPropertyShortSaleCompletedIndicator")));
            declarationDetail.setPropertyProposedCleanEnergyLienIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"PropertyProposedCleanEnergyLienIndicator")));
            declarationDetail.setUndisclosedBorrowedFundsIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedBorrowedFundsIndicator")));
            declarationDetail.setUndisclosedComakerOfNoteIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedComakerOfNoteIndicator")));
            declarationDetail.setUndisclosedCreditApplicationIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedCreditApplicationIndicator")));
            declarationDetail.setUndisclosedMortgageApplicationIndicator(returnfalseIfBlank(getTextContentFromElement(declarionDetailElement,"UndisclosedMortgageApplicationIndicator")));
        }
        declaration.setDECLARATION_DETAIL(declarationDetail);
        return declaration;
    }
    private BORROWER_DETAIL getBorrowerDetail(Element borrowerDetailElement){
        BORROWER_DETAIL borrowerDetail = new BORROWER_DETAIL();
        borrowerDetail.setBorrowerBirthDate(getTextContentFromElement(borrowerDetailElement,"BorrowerBirthDate"));
        borrowerDetail.setCommunityPropertyStateResidentIndicator(returnfalseIfBlank(getTextContentFromElement(borrowerDetailElement,"CommunityPropertyStateResidentIndicator")));
        borrowerDetail.setDependentCount(returnZeroIfBlank(getTextContentFromElement(borrowerDetailElement,"DependentCount")));
        borrowerDetail.setDomesticRelationshipIndicator(returnfalseIfBlank(getTextContentFromElement(borrowerDetailElement,"DomesticRelationshipIndicator")));
        borrowerDetail.setMaritalStatusType(getTextContentFromElement(borrowerDetailElement,"MaritalStatusType"));
        return borrowerDetail;
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
        CLOSING_INFORMATION closingInformation = new CLOSING_INFORMATION();
        HOUSING_EXPENSES housingExpenses = new HOUSING_EXPENSES();
        LOAN_DETAIL loanDetail = new LOAN_DETAIL();
        TERMS_OF_LOAN termsOfLoan = new TERMS_OF_LOAN();
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
                closingInformation = getClosingInformation(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("HOUSING_EXPENSES"))
            {
                Element eElement = (Element) node;
                housingExpenses = getHousingExpenses(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LOAN_DETAIL"))
            {
                Element eElement = (Element) node;
                loanDetail = getLoanDetail(eElement);

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("TERMS_OF_LOAN"))
            {
                Element eElement = (Element) node;
                termsOfLoan = getTermsOfLoan(eElement);

            }
        }
        loan.setHOUSING_EXPENSES(housingExpenses);
        loan.setCLOSING_INFORMATION(closingInformation);
        loan.setAMORTIZATION(amortization);
        loan.setLOAN_DETAIL(loanDetail);
        loan.setTERMS_OF_LOAN(termsOfLoan);
        return loan;
    }
    private TERMS_OF_LOAN getTermsOfLoan(Element termsOfLoanElement){
        TERMS_OF_LOAN termsOfLoan = new TERMS_OF_LOAN();
        termsOfLoan.setBaseLoanAmount(returnDoubleZeroIfBlank(getTextContentFromElement(termsOfLoanElement,"BaseLoanAmount")));
        termsOfLoan.setLienPriorityType(getTextContentFromElement(termsOfLoanElement,"LienPriorityType"));
        termsOfLoan.setLoanPurposeType(getTextContentFromElement(termsOfLoanElement,"LoanPurposeType"));
        termsOfLoan.setMortgageType(getTextContentFromElement(termsOfLoanElement,"MortgageType"));
        termsOfLoan.setNoteAmount(returnDoubleZeroIfBlank(getTextContentFromElement(termsOfLoanElement,"NoteAmount")));
        termsOfLoan.setNoteRatePercent(returnDoubleZeroIfBlank(getTextContentFromElement(termsOfLoanElement,"NoteRatePercent")));

        return termsOfLoan;

    }


    private LOAN_DETAIL getLoanDetail(Element loanDeatailElement){
        LOAN_DETAIL loanDetail = new LOAN_DETAIL();
        loanDetail.setConstructionLoanIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"BalloonIndicator")));
        loanDetail.setBuydownTemporarySubsidyFundingIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"BuydownTemporarySubsidyFundingIndicator")));
        loanDetail.setConstructionLoanIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"ConstructionLoanIndicator")));
        loanDetail.setConversionOfContractForDeedIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"ConversionOfContractForDeedIndicator")));
        loanDetail.setEnergyRelatedImprovementsIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"EnergyRelatedImprovementsIndicator")));
        loanDetail.setInterestOnlyIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"InterestOnlyIndicator")));
        loanDetail.setNegativeAmortizationIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"NegativeAmortizationIndicator")));
        loanDetail.setPrepaymentPenaltyIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"PrepaymentPenaltyIndicator")));
        loanDetail.setRenovationLoanIndicator(returnfalseIfBlank(getTextContentFromElement(loanDeatailElement,"RenovationLoanIndicator")));
        loanDetail.setTotalMortgagedPropertiesCount(returnZeroIfBlank(getTextContentFromElement(loanDeatailElement,"TotalMortgagedPropertiesCount")));

        return loanDetail;
    }
    private HOUSING_EXPENSES getHousingExpenses(Element housingExpensesElement){
        HOUSING_EXPENSES housingExpenses = new HOUSING_EXPENSES();
        HOUSING_EXPENSE housingExpense = new HOUSING_EXPENSE();
        List<HOUSING_EXPENSE> housingExpenseList = new ArrayList<>();
        NodeList nodeList = housingExpensesElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("HOUSING_EXPENSE"))
            {
                Element eElement = (Element) node;
                housingExpense = getHousingExpense(eElement);
                housingExpenseList.add(housingExpense);

            }
        }
        housingExpenses.setHOUSING_EXPENSE(housingExpenseList);
        return housingExpenses;

    }

    private HOUSING_EXPENSE getHousingExpense(Element housingExpenseElement){
        HOUSING_EXPENSE housingExpense = new HOUSING_EXPENSE();
        housingExpense.setHousingExpensePaymentAmount(returnDoubleZeroIfBlank(getTextContentFromElement(housingExpenseElement,"HousingExpensePaymentAmount")));
        housingExpense.setHousingExpenseType(getTextContentFromElement(housingExpenseElement,"HousingExpenseType"));
        housingExpense.setHousingExpenseTimingType(getTextContentFromElement(housingExpenseElement,"HousingExpenseTimingType"));
        return housingExpense;
    }
    private CLOSING_INFORMATION getClosingInformation(Element closingInformationElement){
        CLOSING_INFORMATION closingInformation = new CLOSING_INFORMATION();
        CLOSING_INFORMATION_DETAIL closingInformationDetail = new CLOSING_INFORMATION_DETAIL();
        NodeList nodeList = closingInformationElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("CLOSING_INFORMATION_DETAIL"))
            {
                Element eElement = (Element) node;
                closingInformationDetail = getClosingInformationDetail(eElement);

            }
        }
        closingInformation.setCLOSING_INFORMATION_DETAIL(closingInformationDetail);
        return closingInformation;

    }
    private CLOSING_INFORMATION_DETAIL getClosingInformationDetail(Element closingInformationDetailElement){
        CLOSING_INFORMATION_DETAIL closingInformationDetail = new CLOSING_INFORMATION_DETAIL();
        closingInformationDetail.setCashFromBorrowerAtClosingAmount(returnDoubleZeroIfBlank(closingInformationDetailElement.getElementsByTagName("CashFromBorrowerAtClosingAmount").item(0).getTextContent()));
        return closingInformationDetail;
    }
    private AMORTIZATION getAmortization(Element amortizationElement){
        AMORTIZATION amortization = new AMORTIZATION();
        NodeList nodeList = amortizationElement.getChildNodes();
        AMORTIZATION_RULE amortizationRule = null;
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("AMORTIZATION_RULE"))
            {
                Element eElement = (Element) node;
                amortizationRule = getAmortizationRule(eElement);

            }
        }
        amortization.setAMORTIZATION_RULE(amortizationRule);
        return amortization;
    }
    private AMORTIZATION_RULE getAmortizationRule(Element amortizationRuleElement){
        AMORTIZATION_RULE amortizationRule = new AMORTIZATION_RULE();
        amortizationRule.setAmortizationType(getTextContentFromElement(amortizationRuleElement,"AmortizationType"));
        amortizationRule.setLoanAmortizationPeriodCount(returnZeroIfBlank(getTextContentFromElement(amortizationRuleElement,"LoanAmortizationPeriodCount")));
        amortizationRule.setLoanAmortizationPeriodType(getTextContentFromElement(amortizationRuleElement,"LoanAmortizationPeriodType"));
        return amortizationRule;
    }


    private SALES_CONTRACT_DETAIL getSalesContractDetail(Element salesContacDetailElement)  {
        SALES_CONTRACT_DETAIL salesContractDetail = new SALES_CONTRACT_DETAIL();
        salesContractDetail.setSalesContractAmount(returnDoubleZeroIfBlank(getTextContentFromElement(salesContacDetailElement,"SalesContractAmount")));
        return salesContractDetail;
    }

    private PROPERTY_DETAIL getPropertyDetail(Element  propertyDetailElement)  {
        PROPERTY_DETAIL propertyDetail = new PROPERTY_DETAIL();
        propertyDetail.setCommunityPropertyStateIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"CommunityPropertyStateIndicator")));
        propertyDetail.setAttachmentType(getTextContentFromElement(propertyDetailElement,"AttachmentType"));
        propertyDetail.setFinancedUnitCount(returnZeroIfBlank(getTextContentFromElement(propertyDetailElement,"FinancedUnitCount")));
        propertyDetail.setPropertyEstateType(getTextContentFromElement(propertyDetailElement,"PropertyEstateType"));
        propertyDetail.setPropertyEstimatedValueAmount(returnDoubleZeroIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyEstimatedValueAmount")));
        propertyDetail.setPropertyExistingCleanEnergyLienIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyExistingCleanEnergyLienIndicator")));
        propertyDetail.setPropertyInProjectIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyInProjectIndicator")));
        propertyDetail.setPropertyMixedUsageIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PropertyMixedUsageIndicator")));
        propertyDetail.setPropertyUsageType(getTextContentFromElement(propertyDetailElement,"PropertyUsageType"));
        propertyDetail.setPUDIndicator(returnfalseIfBlank(getTextContentFromElement(propertyDetailElement,"PUDIndicator")));
        return propertyDetail;
    }

    private LIABILITIES getLiabilities(Node dealNode) throws XPathExpressionException {
        LIABILITIES liabilities = new LIABILITIES();
        LIABILITY_SUMMARY liabilitySummary = new LIABILITY_SUMMARY();
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
                    liabilitySummary = getLiabilitySummary(liabilitySummaryElement);
                    liabilities.setLIABILITY_SUMMARY(liabilitySummary);
                }
            }
            liabilities.setLIABILITY(liabilityList);
        }
        return liabilities;

    }
    private LIABILITY_SUMMARY getLiabilitySummary(Element liabilitySummaryElement){
        LIABILITY_SUMMARY liabilitySummary = new LIABILITY_SUMMARY();
        liabilitySummary.setTotalSubjectPropertyPayoffsAndPaymentsAmount(returnDoubleZeroIfBlank(getTextContentFromElement(liabilitySummaryElement,"TotalSubjectPropertyPayoffsAndPaymentsAmount")));
        liabilitySummary.setTotalNonSubjectPropertyDebtsToBePaidOffAmount(returnDoubleZeroIfBlank(getTextContentFromElement(liabilitySummaryElement,"TotalNonSubjectPropertyDebtsToBePaidOffAmount")));
        return liabilitySummary;
    }
    private LIABILITY getLiability(Element liabilityElement){
        LIABILITY liability = new LIABILITY();
        liability.setSequenceNumber(returnZeroIfBlank(liabilityElement.getAttribute("SequenceNumber")));
        liability.setLabel(liabilityElement.getAttribute("xlink:label"));
        NodeList nodeList = liabilityElement.getElementsByTagName("LIABILITY_DETAIL");
        if(nodeList.getLength() > 0){
            LIABILITY_DETAIL liabilityDetail = getLiabilityDetail(nodeList);
            liability.setLIABILITY_DETAIL(liabilityDetail);
        }
        return liability;
    }
   private LIABILITY_DETAIL getLiabilityDetail(NodeList liabilityDetailNodeList){
        LIABILITY_DETAIL liabilityDetail = new LIABILITY_DETAIL();
       for (int temp = 0; temp < liabilityDetailNodeList.getLength(); temp++)
        {
            Node node = liabilityDetailNodeList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE )
            {
                Element eElement = (Element) node;
                liabilityDetail.setLiabilityType(getTextContentFromElement(eElement,"LiabilityAccountIdentifier"));
                liabilityDetail.setLiabilityExclusionIndicator(returnfalseIfBlank(getTextContentFromElement(eElement,"LiabilityExclusionIndicator")));
                liabilityDetail.setLiabilityMonthlyPaymentAmount(returnDoubleZeroIfBlank(getTextContentFromElement(eElement,"LiabilityMonthlyPaymentAmount")));
                liabilityDetail.setLiabilityPayoffStatusIndicator(returnfalseIfBlank(getTextContentFromElement(eElement,"LiabilityPayoffStatusIndicator")));
                liabilityDetail.setLiabilityType(getTextContentFromElement(eElement,"LiabilityType"));
                liabilityDetail.setLiabilityUnpaidBalanceAmount(returnDoubleZeroIfBlank(getTextContentFromElement(eElement,"LiabilityUnpaidBalanceAmount")));
            }
        }
        return liabilityDetail;
    }
    private SUBJECT_PROPERTY getSubjectProperty(Node dealNode) throws XPathExpressionException {
        SUBJECT_PROPERTY subjectProperty = new SUBJECT_PROPERTY();
        ADDRESS address = new ADDRESS();
        String expression = "./DEAL/COLLATERALS/COLLATERAL/SUBJECT_PROPERTY";
        NodeList nodeList = getNodeList(dealNode,expression);
        LOCATION_IDENTIFIER locationIdentifier = new LOCATION_IDENTIFIER();
        PROPERTY_DETAIL propertyDetail = new PROPERTY_DETAIL();
        NodeList nodeList1 = nodeList.item(0).getChildNodes();
        SALES_CONTRACTS salesContracts = new SALES_CONTRACTS();
        if(nodeList1.getLength()>0) {
            for (int temp = 0; temp < nodeList1.getLength(); temp++) {
                Node node = nodeList1.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("ADDRESS")) {
                    Element eElement = (Element) node;
                    address = getAddress(eElement);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("LOCATION_IDENTIFIER")) {
                    Element eElement = (Element) node;
                    locationIdentifier = getLocationIdentifier(eElement);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("PROPERTY_DETAIL")) {
                    Element eElement = (Element) node;
                    propertyDetail = getPropertyDetail(eElement);
                }
                if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("SALES_CONTRACTS")) {
                    Element eElement = (Element) node;
                    salesContracts = getSalesContacts(eElement);
                }
            }
        }


        subjectProperty.setADDRESS(address);
        subjectProperty.setLOCATION_IDENTIFIER(locationIdentifier);
        subjectProperty.setPROPERTY_DETAIL(propertyDetail);
        subjectProperty.setSALES_CONTRACTS(salesContracts);
        return subjectProperty;
    }
    private SALES_CONTRACTS getSalesContacts(Element salesContacts) throws XPathExpressionException {
        SALES_CONTRACTS salesContracts = new SALES_CONTRACTS();
        NodeList nodeList = salesContacts.getElementsByTagName("SALES_CONTRACT");
        SALES_CONTRACT salesContract = new SALES_CONTRACT();
        if(nodeList.getLength()>0) {
            Element salesContactElement = (Element)nodeList.item(0);
            salesContract = getSalesContact(salesContactElement);
        }
        salesContracts.setSALES_CONTRACT(salesContract);
        return salesContracts;
   }
   private SALES_CONTRACT getSalesContact(Element salesContactElement) {
       SALES_CONTRACT salesContract = new SALES_CONTRACT();
       SALES_CONTRACT_DETAIL salesContractDetail = new SALES_CONTRACT_DETAIL();
       NodeList nodeList = salesContactElement.getElementsByTagName("SALES_CONTRACT_DETAIL");
       if(nodeList.getLength()>0) {
           Element salesContactDetailElement = (Element)nodeList.item(0);
           salesContractDetail = getSalesContractDetail(salesContactDetailElement);
       }
       salesContract.setSALES_CONTRACT_DETAIL(salesContractDetail);
       return salesContract;
   }


    private LOCATION_IDENTIFIER getLocationIdentifier(Element locationIdentifierElement)  {
        LOCATION_IDENTIFIER locationIdentifier = new LOCATION_IDENTIFIER();
        FIPS_INFORMATION fipsInformation = new FIPS_INFORMATION();
        NodeList nodeList = locationIdentifierElement.getElementsByTagName("FIPS_INFORMATION");
        if(nodeList.getLength() > 0){
            Element eElement = (Element) nodeList.item(0);
            fipsInformation = getFipsInformation(eElement);

        }
        locationIdentifier.setFIPS_INFORMATION(fipsInformation);
        return locationIdentifier;
    }


   private FIPS_INFORMATION getFipsInformation(Element fipsInformationElement){
        FIPS_INFORMATION fipsInformation = new FIPS_INFORMATION();
       fipsInformation.setFIPSCountyCode(returnZeroIfBlank(getTextContentFromElement(fipsInformationElement,"FIPSCountyCode")));
       fipsInformation.setFIPSStateNumericCode(returnZeroIfBlank(getTextContentFromElement(fipsInformationElement,"FIPSStateNumericCode")));
        return fipsInformation;
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




