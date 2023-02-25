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
 * <p>Java class for ForeclosureDelayEndReasonBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeclosureDelayEndReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AttorneyTransferReviewCompleted"/>
 *     &lt;enumeration value="BankruptcyStayLifted"/>
 *     &lt;enumeration value="BorrowerRequestedToExit"/>
 *     &lt;enumeration value="LegalProcessEnded"/>
 *     &lt;enumeration value="LegislativeImpactAssessed"/>
 *     &lt;enumeration value="LoanPayoffReceived"/>
 *     &lt;enumeration value="MediationEnded"/>
 *     &lt;enumeration value="MilitaryIndulgenceEnded"/>
 *     &lt;enumeration value="MissingDocumentsReceived"/>
 *     &lt;enumeration value="MoratoriumEnded"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ProbateEnded"/>
 *     &lt;enumeration value="PropertyConditionResolved"/>
 *     &lt;enumeration value="PropertySeizureResolved"/>
 *     &lt;enumeration value="ReinstatementReceived"/>
 *     &lt;enumeration value="ServicingTransferCompleted"/>
 *     &lt;enumeration value="TitleIssueResolved"/>
 *     &lt;enumeration value="WorkoutEnded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ForeclosureDelayEndReasonBase")
@XmlEnum
public enum ForeclosureDelayEndReasonBase {


    /**
     * The attorney transfer review has been completed.
     *
     */
    @XmlEnumValue("AttorneyTransferReviewCompleted")
    ATTORNEY_TRANSFER_REVIEW_COMPLETED("AttorneyTransferReviewCompleted"),

    /**
     * Bankruptcy stay was lifted.
     *
     */
    @XmlEnumValue("BankruptcyStayLifted")
    BANKRUPTCY_STAY_LIFTED("BankruptcyStayLifted"),

    /**
     * The borrower requested an exit to the current process delay to move forward with the foreclosure process.
     *
     */
    @XmlEnumValue("BorrowerRequestedToExit")
    BORROWER_REQUESTED_TO_EXIT("BorrowerRequestedToExit"),

    /**
     * The legal proceedings ended and foreclosure will resume.
     *
     */
    @XmlEnumValue("LegalProcessEnded")
    LEGAL_PROCESS_ENDED("LegalProcessEnded"),

    /**
     * The legislative change was analyzed and an impact conclusion was reached.
     *
     */
    @XmlEnumValue("LegislativeImpactAssessed")
    LEGISLATIVE_IMPACT_ASSESSED("LegislativeImpactAssessed"),

    /**
     * Funds have been received that have satisfied the mortgage debt in it's entirety.
     *
     */
    @XmlEnumValue("LoanPayoffReceived")
    LOAN_PAYOFF_RECEIVED("LoanPayoffReceived"),

    /**
     * The mediation process ended.
     *
     */
    @XmlEnumValue("MediationEnded")
    MEDIATION_ENDED("MediationEnded"),

    /**
     * Military indulgence ended since borrower no longer eligible.
     *
     */
    @XmlEnumValue("MilitaryIndulgenceEnded")
    MILITARY_INDULGENCE_ENDED("MilitaryIndulgenceEnded"),

    /**
     * All missing documents received or no longer needed.
     *
     */
    @XmlEnumValue("MissingDocumentsReceived")
    MISSING_DOCUMENTS_RECEIVED("MissingDocumentsReceived"),

    /**
     * Moratorium regarding the foreclosure processing was lifted.
     *
     */
    @XmlEnumValue("MoratoriumEnded")
    MORATORIUM_ENDED("MoratoriumEnded"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * A deceased borrower's estate has been fully administered by the court.
     *
     */
    @XmlEnumValue("ProbateEnded")
    PROBATE_ENDED("ProbateEnded"),

    /**
     * The condition has been cleared or some additional action has been taken to allow the foreclosure to proceed.
     *
     */
    @XmlEnumValue("PropertyConditionResolved")
    PROPERTY_CONDITION_RESOLVED("PropertyConditionResolved"),

    /**
     * The property seizure process is no longer pending and a conclusion has been reached.
     *
     */
    @XmlEnumValue("PropertySeizureResolved")
    PROPERTY_SEIZURE_RESOLVED("PropertySeizureResolved"),

    /**
     * Funds in the amount required to satisfy the delinquent amount have been received. The loan has been brought into good standing.
     *
     */
    @XmlEnumValue("ReinstatementReceived")
    REINSTATEMENT_RECEIVED("ReinstatementReceived"),

    /**
     * The servicing transfer has been completed by the servicer. The transferee servicer is now responsible for the resumption of a foreclosure.
     *
     */
    @XmlEnumValue("ServicingTransferCompleted")
    SERVICING_TRANSFER_COMPLETED("ServicingTransferCompleted"),

    /**
     * All title issues that would have prevented the foreclosure sale from proceeding have been cured.
     *
     */
    @XmlEnumValue("TitleIssueResolved")
    TITLE_ISSUE_RESOLVED("TitleIssueResolved"),

    /**
     * The workout process is no longer active.
     *
     */
    @XmlEnumValue("WorkoutEnded")
    WORKOUT_ENDED("WorkoutEnded");
    private final String value;

    ForeclosureDelayEndReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeclosureDelayEndReasonBase fromValue(String v) {
        for (ForeclosureDelayEndReasonBase c: ForeclosureDelayEndReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
