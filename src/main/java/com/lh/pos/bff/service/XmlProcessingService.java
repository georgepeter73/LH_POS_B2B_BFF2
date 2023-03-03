package com.lh.pos.bff.service;

import ch.qos.logback.core.model.INamedModel;
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
        SUBJECT_PROPERTY subjectProperty = null;
        PROPERTY_DETAIL property_detail = null;
        Node dealNode = getDeal(document);
        PARTIES parties = null;
        LOANS loans = null;
        if(dealNode!=null) {
            subjectProperty = getSubjectProperty(dealNode);
            liabilities = getLiabilities(dealNode);
            loans = getLoans(dealNode);
            parties = getParties(dealNode);

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

            }
            if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("TAXPAYER_IDENTIFIERS"))
            {
                Element eElement = (Element) node;

            }

        }
        party.setROLES(roles);
        party.setINDIVIDUAL(individual);
        return party;

    }
    private ROLES getRoles(Element rolesElement){
        ROLES roles = new ROLES();
        NodeList nodeList = rolesElement.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++) {
            Node node = nodeList.item(i);
           if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("ROLE"))
            {
                ROLE role = new ROLE();
                Element eElement = (Element) node;
                NodeList roleChildList = eElement.getChildNodes();
                for(int j=0;j<roleChildList.getLength();j++){
                    Node roleChildListNode = roleChildList.item(j);
                   if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("BORROWER")) {
                        Element borrowerElement = (Element) roleChildListNode;
                        BORROWER borrower = getBorrower(borrowerElement);
                        role.setBORROWER(borrower);
                        roles.setROLE(role);
                    }
                    if (roleChildListNode.getNodeType() == Node.ELEMENT_NODE && roleChildListNode.getNodeName().equals("ROLE_DETAIL")) {
                        Element roleDetailElement = (Element) roleChildListNode;


                    }

                }
            }

        }

        return roles;
    }

    private BORROWER getBorrower(Element borrowerElement){
       BORROWER borrower = new BORROWER();
       DECLARATION declaration = new DECLARATION();
       BORROWER_DETAIL borrower_detail = new BORROWER_DETAIL();
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
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("GOVERNMENT_MONITORING"))
           {
               Element eElement = (Element) borrowerListNode;
           }
           if (borrowerListNode.getNodeType() == Node.ELEMENT_NODE && borrowerListNode.getNodeName().equals("RESIDENCES"))
           {
               Element eElement = (Element) borrowerListNode;
           }

       }
        borrower.setDECLARATION(declaration);
       borrower.setBORROWER_DETAIL(borrower_detail);

       return borrower;
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
        terms_of_loan.setBaseLoanAmount(returnDoubleZeroIfBlank(termsOfLoanElement.getElementsByTagName("BaseLoanAmount").item(0).getTextContent()));
        terms_of_loan.setLienPriorityType(termsOfLoanElement.getElementsByTagName("LienPriorityType").item(0).getTextContent());
        terms_of_loan.setLoanPurposeType(termsOfLoanElement.getElementsByTagName("LoanPurposeType").item(0).getTextContent());
        terms_of_loan.setMortgageType(termsOfLoanElement.getElementsByTagName("MortgageType").item(0).getTextContent());
        terms_of_loan.setNoteAmount(returnDoubleZeroIfBlank(termsOfLoanElement.getElementsByTagName("NoteAmount").item(0).getTextContent()));
        terms_of_loan.setNoteRatePercent(returnDoubleZeroIfBlank(termsOfLoanElement.getElementsByTagName("NoteRatePercent").item(0).getTextContent()));
        return terms_of_loan;

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


    private SALES_CONTRACT_DETAIL getSalesContractDetail(Element salesContacDetailElement) throws XPathExpressionException {
        SALES_CONTRACT_DETAIL sales_contract_detail = new SALES_CONTRACT_DETAIL();
        sales_contract_detail.setSalesContractAmount(returnDoubleZeroIfBlank(salesContacDetailElement.getElementsByTagName("SalesContractAmount").item(0).getTextContent()));
        return sales_contract_detail;
    }

    private PROPERTY_DETAIL getPropertyDetail(Element  propertyDetailElement) throws XPathExpressionException {
        PROPERTY_DETAIL property_detail = new PROPERTY_DETAIL();
        property_detail.setCommunityPropertyStateIndicator(returnfalseIfBlank(propertyDetailElement.getElementsByTagName("CommunityPropertyStateIndicator").item(0).getTextContent()));
        property_detail.setAttachmentType(propertyDetailElement.getElementsByTagName("AttachmentType").item(0).getTextContent());
        property_detail.setFinancedUnitCount(returnZeroIfBlank(propertyDetailElement.getElementsByTagName("FinancedUnitCount").item(0).getTextContent()));
        property_detail.setPropertyEstateType(propertyDetailElement.getElementsByTagName("PropertyEstateType").item(0).getTextContent());
        property_detail.setPropertyEstimatedValueAmount(returnDoubleZeroIfBlank(propertyDetailElement.getElementsByTagName("PropertyEstimatedValueAmount").item(0).getTextContent()));
        property_detail.setPropertyExistingCleanEnergyLienIndicator(returnfalseIfBlank(propertyDetailElement.getElementsByTagName("PropertyExistingCleanEnergyLienIndicator").item(0).getTextContent()));
        property_detail.setPropertyInProjectIndicator(returnfalseIfBlank(propertyDetailElement.getElementsByTagName("PropertyInProjectIndicator").item(0).getTextContent()));
        property_detail.setPropertyMixedUsageIndicator(returnfalseIfBlank(propertyDetailElement.getElementsByTagName("PropertyMixedUsageIndicator").item(0).getTextContent()));
        property_detail.setPropertyUsageType(propertyDetailElement.getElementsByTagName("PropertyUsageType").item(0).getTextContent());
        property_detail.setPUDIndicator(returnfalseIfBlank(propertyDetailElement.getElementsByTagName("PUDIndicator").item(0).getTextContent()));
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
                    address = getSubjectPropertyAddress(eElement);
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



    private ADDRESS getSubjectPropertyAddress(Element addressElement) throws XPathExpressionException {
        ADDRESS address = new ADDRESS();
        address.setCountyName(addressElement.getElementsByTagName("CountyName").item(0).getTextContent());
        address.setCityName(addressElement.getElementsByTagName("CountyName").item(0).getTextContent());
        address.setAddressLineText(addressElement.getElementsByTagName("AddressLineText").item(0).getTextContent());
        return address;
     }


    private FIPS_INFORMATION getFipsInformation(Element fipsInformationElement)throws XPathExpressionException{
        FIPS_INFORMATION fips_information = new FIPS_INFORMATION();
        fips_information.setFIPSCountyCode(returnZeroIfBlank(fipsInformationElement.getElementsByTagName("FIPSCountyCode").item(0).getTextContent()));
        fips_information.setFIPSStateNumericCode(returnZeroIfBlank(fipsInformationElement.getElementsByTagName("FIPSStateNumericCode").item(0).getTextContent()));
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




