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
 * <p>Java class for AssetBase.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Annuity"/>
 *     &lt;enumeration value="Automobile"/>
 *     &lt;enumeration value="Boat"/>
 *     &lt;enumeration value="Bond"/>
 *     &lt;enumeration value="BorrowerEstimatedTotalAssets"/>
 *     &lt;enumeration value="BorrowerPrimaryHome"/>
 *     &lt;enumeration value="BridgeLoanNotDeposited"/>
 *     &lt;enumeration value="CashOnHand"/>
 *     &lt;enumeration value="CertificateOfDepositTimeDeposit"/>
 *     &lt;enumeration value="CheckingAccount"/>
 *     &lt;enumeration value="EarnestMoneyCashDepositTowardPurchase"/>
 *     &lt;enumeration value="EmployerAssistance"/>
 *     &lt;enumeration value="GiftOfCash"/>
 *     &lt;enumeration value="GiftOfPropertyEquity"/>
 *     &lt;enumeration value="GiftsTotal"/>
 *     &lt;enumeration value="Grant"/>
 *     &lt;enumeration value="IndividualDevelopmentAccount"/>
 *     &lt;enumeration value="LifeInsurance"/>
 *     &lt;enumeration value="MoneyMarketFund"/>
 *     &lt;enumeration value="MutualFund"/>
 *     &lt;enumeration value="NetWorthOfBusinessOwned"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PendingNetSaleProceedsFromRealEstateAssets"/>
 *     &lt;enumeration value="ProceedsFromSaleOfNonRealEstateAsset"/>
 *     &lt;enumeration value="ProceedsFromSecuredLoan"/>
 *     &lt;enumeration value="ProceedsFromUnsecuredLoan"/>
 *     &lt;enumeration value="RealEstateOwned"/>
 *     &lt;enumeration value="RecreationalVehicle"/>
 *     &lt;enumeration value="RelocationMoney"/>
 *     &lt;enumeration value="RetirementFund"/>
 *     &lt;enumeration value="SaleOtherAssets"/>
 *     &lt;enumeration value="SavingsAccount"/>
 *     &lt;enumeration value="SavingsBond"/>
 *     &lt;enumeration value="SeverancePackage"/>
 *     &lt;enumeration value="Stock"/>
 *     &lt;enumeration value="StockOptions"/>
 *     &lt;enumeration value="TrustAccount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "AssetBase")
@XmlEnum
public enum AssetBase {


    /**
     * A fixed sum of money paid to someone each year typically for the rest of their life.
     *
     */
    @XmlEnumValue("Annuity")
    ANNUITY("Annuity"),

    /**
     * Car or similar personal transportation vehicle disclosed as borrowers asset. Usually linked to make or model and year. Typical valuation method is market (blue book).
     *
     */
    @XmlEnumValue("Automobile")
    AUTOMOBILE("Automobile"),

    /**
     * A vessel used for travel on water.
     *
     */
    @XmlEnumValue("Boat")
    BOAT("Boat"),

    /**
     * An interest-bearing certificate of debt with maturity date. An obligation of issuing entity. Typical valuation is face value (e.g., $1,000 denomination) & market (e.g., value of 4% bond when yields are 6%).
     *
     */
    @XmlEnumValue("Bond")
    BOND("Bond"),

    /**
     * The asset amount used by the lender to qualify the borrower for the loan.
     *
     */
    @XmlEnumValue("BorrowerEstimatedTotalAssets")
    BORROWER_ESTIMATED_TOTAL_ASSETS("BorrowerEstimatedTotalAssets"),

    /**
     * The owners estimate of the primary residence.
     *
     */
    @XmlEnumValue("BorrowerPrimaryHome")
    BORROWER_PRIMARY_HOME("BorrowerPrimaryHome"),

    /**
     * Proceeds of a loan (secured by borrowers real property) to provide homebuyer with funds for down payment and closing costs on a new home before selling the collateral property which have not yet been deposited to borrowers accounts or included with other assets disclosed.
     *
     */
    @XmlEnumValue("BridgeLoanNotDeposited")
    BRIDGE_LOAN_NOT_DEPOSITED("BridgeLoanNotDeposited"),

    /**
     * Currency physically possessed by borrower, not deposited in any financial institution.
     *
     */
    @XmlEnumValue("CashOnHand")
    CASH_ON_HAND("CashOnHand"),

    /**
     * Certificates issued by financial institutions with a stated term or interest rate, and with a set maturity date. The bank pays the holder in due course at maturity. Early withdrawal subject to penalty. Considered liquid.
     *
     */
    @XmlEnumValue("CertificateOfDepositTimeDeposit")
    CERTIFICATE_OF_DEPOSIT_TIME_DEPOSIT("CertificateOfDepositTimeDeposit"),

    /**
     * Transaction account with a financial institution. Accounts purpose is to effect transfer of owners funds to others by various methods (e.g., check, EFT, ACH, draft). Technical name is demand deposit account (DDA).
     *
     */
    @XmlEnumValue("CheckingAccount")
    CHECKING_ACCOUNT("CheckingAccount"),

    /**
     * Deposit made to bind the conditions of a real estate sale. Deposited in escrow account controlled by others.
     *
     */
    @XmlEnumValue("EarnestMoneyCashDepositTowardPurchase")
    EARNEST_MONEY_CASH_DEPOSIT_TOWARD_PURCHASE("EarnestMoneyCashDepositTowardPurchase"),

    /**
     * Financial assistance provided by a borrower's employer to help purchase and finance real property.
     *
     */
    @XmlEnumValue("EmployerAssistance")
    EMPLOYER_ASSISTANCE("EmployerAssistance"),

    /**
     * Money given as gift (no repayment expected) to Borrowers to assist in home purchase, usually from relatives or a close friend, and where gift funds have not yet been deposited or included with other assets.
     *
     */
    @XmlEnumValue("GiftOfCash")
    GIFT_OF_CASH("GiftOfCash"),

    /**
     * Without consideration or promise of repayment, lender allows the seller to transfer equity in the property to the buyer as a credit in the transaction.
     *
     */
    @XmlEnumValue("GiftOfPropertyEquity")
    GIFT_OF_PROPERTY_EQUITY("GiftOfPropertyEquity"),

    /**
     * The total amount given as a gift either deposited or not, (no repayment expected) to borrowers usually from relatives or close friends.
     *
     */
    @XmlEnumValue("GiftsTotal")
    GIFTS_TOTAL("GiftsTotal"),

    /**
     * Money scheduled to be given as grant (no repayment expected) to borrowers to assist in home purchase, usually from local organization or charity, where grant funds have not yet been deposited to borrowers accounts or included with other assets.
     *
     */
    @XmlEnumValue("Grant")
    GRANT("Grant"),

    /**
     * A matching funds savings account that helps people save for the purchase of  real estate.
     *
     */
    @XmlEnumValue("IndividualDevelopmentAccount")
    INDIVIDUAL_DEVELOPMENT_ACCOUNT("IndividualDevelopmentAccount"),

    /**
     * A life insurance policy with a value or investment component. Details of amounts for each policy or Accumulated investment cash value of life insurance policy, net of any loans against that amount. Detail of amounts for each policy.
     *
     */
    @XmlEnumValue("LifeInsurance")
    LIFE_INSURANCE("LifeInsurance"),

    /**
     * Mutual fund that allows individuals to participate in managed investments in short-term debt securities, such as certificates of deposit and Treasury bills.
     *
     */
    @XmlEnumValue("MoneyMarketFund")
    MONEY_MARKET_FUND("MoneyMarketFund"),

    /**
     * Financial entity that invests its shareholders funds in stocks and bonds of other entities with the objective of obtaining a return on its shareholders investment.
     *
     */
    @XmlEnumValue("MutualFund")
    MUTUAL_FUND("MutualFund"),

    /**
     * For a business owned by borrower, the amount resulting from the calculation Assets minus liabilities. Collected on the URLA in Section VI (Assets - Net Worth of Business).
     *
     */
    @XmlEnumValue("NetWorthOfBusinessOwned")
    NET_WORTH_OF_BUSINESS_OWNED("NetWorthOfBusinessOwned"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Estimated net cash proceeds (sales price - obligations) from anticipated sale of borrowers real estate assets.
     *
     */
    @XmlEnumValue("PendingNetSaleProceedsFromRealEstateAssets")
    PENDING_NET_SALE_PROCEEDS_FROM_REAL_ESTATE_ASSETS("PendingNetSaleProceedsFromRealEstateAssets"),

    /**
     * Amount received by borrower from sale of personal property.
     *
     */
    @XmlEnumValue("ProceedsFromSaleOfNonRealEstateAsset")
    PROCEEDS_FROM_SALE_OF_NON_REAL_ESTATE_ASSET("ProceedsFromSaleOfNonRealEstateAsset"),

    /**
     * Proceeds from a loan secured by borrowers assets.
     *
     */
    @XmlEnumValue("ProceedsFromSecuredLoan")
    PROCEEDS_FROM_SECURED_LOAN("ProceedsFromSecuredLoan"),

    /**
     * Proceeds from a loan not backed by any collateral.
     *
     */
    @XmlEnumValue("ProceedsFromUnsecuredLoan")
    PROCEEDS_FROM_UNSECURED_LOAN("ProceedsFromUnsecuredLoan"),

    /**
     * Market value of real estate owned by the borrower. Not the borrowers primary home.
     *
     */
    @XmlEnumValue("RealEstateOwned")
    REAL_ESTATE_OWNED("RealEstateOwned"),

    /**
     * A motor vehicle or trailer equipped with living space and amenities used for recreational purposes.
     *
     */
    @XmlEnumValue("RecreationalVehicle")
    RECREATIONAL_VEHICLE("RecreationalVehicle"),

    /**
     * The funds that are being contributed by an outside party to be added to the closing funds. The Asset value is necessary for multiple borrowers, who each may have their own credit.
     *
     */
    @XmlEnumValue("RelocationMoney")
    RELOCATION_MONEY("RelocationMoney"),

    /**
     *  401Ks, IRAs, etc. controlled by borrower (vested) valued at market.
     *
     */
    @XmlEnumValue("RetirementFund")
    RETIREMENT_FUND("RetirementFund"),

    /**
     * The amount that will be applied to closing funds from the sale of assets not otherwise identified.
     *
     */
    @XmlEnumValue("SaleOtherAssets")
    SALE_OTHER_ASSETS("SaleOtherAssets"),

    /**
     * Interest-paying account with a financial institution whose main purpose is to earn interest on owners funds held therein. This is NOT a demand deposit account.
     *
     */
    @XmlEnumValue("SavingsAccount")
    SAVINGS_ACCOUNT("SavingsAccount"),

    /**
     * A nontransferable registered bond issued by the U.S. government.
     *
     */
    @XmlEnumValue("SavingsBond")
    SAVINGS_BOND("SavingsBond"),

    /**
     * A bundle of pay and benefits offered to an employee upon separation from employment.
     *
     */
    @XmlEnumValue("SeverancePackage")
    SEVERANCE_PACKAGE("SeverancePackage"),

    /**
     * Financial instrument evidencing an ownership interest in entity that issued the stock. Typical valuation method is Market.
     *
     */
    @XmlEnumValue("Stock")
    STOCK("Stock"),

    /**
     * Option given by a company to an employee to buy stock in the company at a discount or at a stated fixed price.
     *
     */
    @XmlEnumValue("StockOptions")
    STOCK_OPTIONS("StockOptions"),

    /**
     * Fiduciary relationship where legal title to a property is transferred to a trustee with the intention the property be administered by the trustee for benefit of the beneficiary, who holds equitable title to such property.
     *
     */
    @XmlEnumValue("TrustAccount")
    TRUST_ACCOUNT("TrustAccount");
    private final String value;

    AssetBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetBase fromValue(String v) {
        for (AssetBase c: AssetBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
