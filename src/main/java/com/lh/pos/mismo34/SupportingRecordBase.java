//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.02.11 at 08:03:21 AM EST
//


package com.lh.pos.mismo34;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportingRecordBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportingRecordBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="CallRecording"/>
 *     &lt;enumeration value="ConversationSummary"/>
 *     &lt;enumeration value="CreditReportingHistory"/>
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="ElectronicCommunication"/>
 *     &lt;enumeration value="ElectronicImage"/>
 *     &lt;enumeration value="Facsimile"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ServicingFile"/>
 *     &lt;enumeration value="ServicingFile:BankruptcyNotes"/>
 *     &lt;enumeration value="ServicingFile:BorrowerSuppliedInformation"/>
 *     &lt;enumeration value="ServicingFile:CollectionNotes"/>
 *     &lt;enumeration value="ServicingFile:EscrowAnalysisInformation"/>
 *     &lt;enumeration value="ServicingFile:ForeclosureNotes"/>
 *     &lt;enumeration value="ServicingFile:GeneralCustomerServiceNotes"/>
 *     &lt;enumeration value="ServicingFile:HomeownersInsuranceInformation"/>
 *     &lt;enumeration value="ServicingFile:LoanModificationInvestorCriteria"/>
 *     &lt;enumeration value="ServicingFile:LossMitigationNotes"/>
 *     &lt;enumeration value="ServicingFile:MortgageInsuranceInformation"/>
 *     &lt;enumeration value="ServicingFile:Other"/>
 *     &lt;enumeration value="ServicingFile:PaymentHistory"/>
 *     &lt;enumeration value="ServicingFile:RealEstateTaxInformation"/>
 *     &lt;enumeration value="ServicingFile:ServicerStructuredData"/>
 *     &lt;enumeration value="ServicingFile:ThirdPartyStructuredData"/>
 *     &lt;enumeration value="VoiceMailRecording"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "SupportingRecordBase")
@XmlEnum
public enum SupportingRecordBase {


    /**
     * A digital audio recording of a phone call or transcription thereof.
     *
     */
    @XmlEnumValue("CallRecording")
    CALL_RECORDING("CallRecording"),

    /**
     * Notes or summarization of a conversation between two parties.
     *
     */
    @XmlEnumValue("ConversationSummary")
    CONVERSATION_SUMMARY("ConversationSummary"),

    /**
     * History of credit bureau reporting showing how a loan was reported.
     *
     */
    @XmlEnumValue("CreditReportingHistory")
    CREDIT_REPORTING_HISTORY("CreditReportingHistory"),

    /**
     * Indicates that the supporting record is a document.
     *
     */
    @XmlEnumValue("Document")
    DOCUMENT("Document"),

    /**
     * Email, video recording, social media posting or other transmission of information or inquiry that has been encoded digitally.
     *
     */
    @XmlEnumValue("ElectronicCommunication")
    ELECTRONIC_COMMUNICATION("ElectronicCommunication"),

    /**
     * An image of a printed page or a screen capture from a computer system or other electronic representation of an object.
     *
     */
    @XmlEnumValue("ElectronicImage")
    ELECTRONIC_IMAGE("ElectronicImage"),

    /**
     * An image of a document made by electronic scanning and transmitted as data by telecommunication links.
     *
     */
    @XmlEnumValue("Facsimile")
    FACSIMILE("Facsimile"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A general collection of views or data used to support servicing of a loan.
     *
     */
    @XmlEnumValue("ServicingFile")
    SERVICING_FILE("ServicingFile"),

    /**
     * Notes or history of communications between a borrower and the servicer regarding a borrower's bankruptcy.
     *
     */
    @XmlEnumValue("ServicingFile:BankruptcyNotes")
    SERVICING_FILE_BANKRUPTCY_NOTES("ServicingFile:BankruptcyNotes"),

    /**
     * Information or documents provided by a borrower to a servicer regarding a loan. May include but is not limited to error notification or loss mitigation.
     *
     */
    @XmlEnumValue("ServicingFile:BorrowerSuppliedInformation")
    SERVICING_FILE_BORROWER_SUPPLIED_INFORMATION("ServicingFile:BorrowerSuppliedInformation"),

    /**
     * Notes or history of communications between a borrower and the servicer regarding debt collections.
     *
     */
    @XmlEnumValue("ServicingFile:CollectionNotes")
    SERVICING_FILE_COLLECTION_NOTES("ServicingFile:CollectionNotes"),

    /**
     * Documents and other communications regarding the yearly escrow analysis process and payment change.
     *
     */
    @XmlEnumValue("ServicingFile:EscrowAnalysisInformation")
    SERVICING_FILE_ESCROW_ANALYSIS_INFORMATION("ServicingFile:EscrowAnalysisInformation"),

    /**
     * Notes or history of communications between a borrower and the servicer regarding foreclosure.
     *
     */
    @XmlEnumValue("ServicingFile:ForeclosureNotes")
    SERVICING_FILE_FORECLOSURE_NOTES("ServicingFile:ForeclosureNotes"),

    /**
     * Notes or history of communications between a borrower and the servicer not related to default servicing.
     *
     */
    @XmlEnumValue("ServicingFile:GeneralCustomerServiceNotes")
    SERVICING_FILE_GENERAL_CUSTOMER_SERVICE_NOTES("ServicingFile:GeneralCustomerServiceNotes"),

    /**
     * Documents and other communications regarding homeowner's, flood, or other type of insurance covering the property.
     *
     */
    @XmlEnumValue("ServicingFile:HomeownersInsuranceInformation")
    SERVICING_FILE_HOMEOWNERS_INSURANCE_INFORMATION("ServicingFile:HomeownersInsuranceInformation"),

    /**
     * A description of the investor guidelines for approving and or denying a loan modification.
     *
     */
    @XmlEnumValue("ServicingFile:LoanModificationInvestorCriteria")
    SERVICING_FILE_LOAN_MODIFICATION_INVESTOR_CRITERIA("ServicingFile:LoanModificationInvestorCriteria"),

    /**
     * Notes or history of communications between a borrower and the servicer related to loss mitigation.
     *
     */
    @XmlEnumValue("ServicingFile:LossMitigationNotes")
    SERVICING_FILE_LOSS_MITIGATION_NOTES("ServicingFile:LossMitigationNotes"),

    /**
     * Documents and other communications regarding the life-cycle of mortgage insurance.
     *
     */
    @XmlEnumValue("ServicingFile:MortgageInsuranceInformation")
    SERVICING_FILE_MORTGAGE_INSURANCE_INFORMATION("ServicingFile:MortgageInsuranceInformation"),

    /**
     * Any additional information not included in the other servicing file records.
     *
     */
    @XmlEnumValue("ServicingFile:Other")
    SERVICING_FILE_OTHER("ServicingFile:Other"),

    /**
     * A record showing a loan's payment history over a specified time period. May include escrow disbursements or refunds made on behalf of a borrower.
     *
     */
    @XmlEnumValue("ServicingFile:PaymentHistory")
    SERVICING_FILE_PAYMENT_HISTORY("ServicingFile:PaymentHistory"),

    /**
     * Documents and other communications regarding taxes on the property.
     *
     */
    @XmlEnumValue("ServicingFile:RealEstateTaxInformation")
    SERVICING_FILE_REAL_ESTATE_TAX_INFORMATION("ServicingFile:RealEstateTaxInformation"),

    /**
     * A report of the data fields relating to a borrower's mortgage loan account created by the servicer's electronic systems in connection with servicing practices.
     *
     */
    @XmlEnumValue("ServicingFile:ServicerStructuredData")
    SERVICING_FILE_SERVICER_STRUCTURED_DATA("ServicingFile:ServicerStructuredData"),

    /**
     * Data or records from third party service provider that are not part of the servicer's records kept as an ordinary course of business.
     *
     */
    @XmlEnumValue("ServicingFile:ThirdPartyStructuredData")
    SERVICING_FILE_THIRD_PARTY_STRUCTURED_DATA("ServicingFile:ThirdPartyStructuredData"),

    /**
     * A message delivered by an electronic communication system in which spoken messages are recorded or digitized for later playback to the intended recipient.
     *
     */
    @XmlEnumValue("VoiceMailRecording")
    VOICE_MAIL_RECORDING("VoiceMailRecording");
    private final String value;

    SupportingRecordBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportingRecordBase fromValue(String v) {
        for (SupportingRecordBase c: SupportingRecordBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
