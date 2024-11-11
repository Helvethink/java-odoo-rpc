
/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.test.ng.res;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.AccountIncoterms;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.report.ReportPaperformat;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.barcode.BarcodeNomenclature;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;;

@OdooObject("res.company")
public class ResCompany implements OdooObj {

    
    private List<ResPartnerBank> bankIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private List<Integer> bankIds;

    
    private Date writeDate;

    
    private Object taxLockDate;

    
    private AccountJournal currencyExchangeJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId currencyExchangeJournalId;

    
    private String bounceFormatted;

    
    private Account incomeCurrencyExchangeAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId incomeCurrencyExchangeAccountId;

    
    private Object invoiceTerms;

    
    private Account defaultCashDifferenceExpenseAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId defaultCashDifferenceExpenseAccountId;

    
    private boolean isInvoiceIsSnailmail;

    
    private String defaultFromEmail;

    
    private String bankAccountCodePrefix;

    
    private int messageHasErrorCounter;

    
    private String socialLinkedin;

    
    private int overtimeEmployeeThreshold;

    
    private AccountMove accountOpeningMoveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId accountOpeningMoveId;

    
    private Account accountDiscountIncomeAllocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountDiscountIncomeAllocationId;

    
    private ReportPaperformat paperformatIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.report.ReportPaperformat")
        @OdooModel("report.ReportPaperformat")
    
    private OdooId paperformatId;

    
    private boolean isIsCompanyDetailsEmpty;

    
    private int hrPresenceControlEmailAmount;

    
    private String parentPath;

    
    private boolean isSnailmailDuplex;

    
    private AccountJournal expenseJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId expenseJournalId;

    
    private ResCountryState stateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId stateId;

    
    private int id;

    
    private Object fiscalyearLockDate;

    
    private boolean isAngloSaxonAccounting;

    
    private Object logoWeb;

    
    private Object taxCalculationRoundingMethod;

    
    private String zip;

    
    private int messageAttachmentCount;

    
    private boolean isInvoiceIsDownload;

    
    private Product saleDiscountProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId saleDiscountProductId;

    
    private Uom projectTimeModeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId projectTimeModeId;

    
    private String vat;

    
    private boolean isActive;

    
    private boolean isPortalConfirmationSign;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String emailPrimaryColor;

    
    private String socialTwitter;

    
    private String phone;

    
    private int contractExpirationNoticePeriod;

    
    private int workPermitExpirationNoticePeriod;

    
    private AccountTax accountPurchaseTaxIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId accountPurchaseTaxId;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private String catchallEmail;

    
    private boolean isMessageIsFollower;

    
    private Object accountOpeningDate;

    
    private Account accountJournalPaymentCreditAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalPaymentCreditAccountId;

    
    private boolean isPortalConfirmationPay;

    
    private int attendanceKioskDelay;

    
    private String city;

    
    private String socialYoutube;

    
    private String transferAccountCodePrefix;

    
    private boolean isUsesDefaultLogo;

    
    private Object paymentOnboardingPaymentMethod;

    
    private Object attendanceBarcodeSource;

    
    private List<ResCompany> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> childIds;

    
    private String hrPresenceControlIpList;

    
    private List<AccountPaymentMethodLine> companyExpenseAllowedPaymentMethodLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
    
    private List<Integer> companyExpenseAllowedPaymentMethodLineIds;

    
    private Object periodLockDate;

    
    private List<AccountFiscalPosition> fiscalPositionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private List<Integer> fiscalPositionIds;

    
    private boolean isExpectsChartOfAccounts;

    
    private String cashAccountCodePrefix;

    
    private Product saleDownPaymentProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId saleDownPaymentProductId;

    
    private String secondaryColor;

    
    private Account accountJournalSuspenseAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalSuspenseAccountId;

    
    private List<ResCompany> allChildIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> allChildIds;

    
    private String street2;

    
    private String aliasDomainName;

    
    private String email;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private boolean isInvoiceIsEmail;

    
    private String website;

    
    private String socialGithub;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private String companyRegistry;

    
    private boolean isMessageHasSmsError;

    
    private boolean isDisplayInvoiceAmountTotalWords;

    
    private int overtimeCompanyThreshold;

    
    private Object saleHeader;

    
    private String saleHeaderName;

    
    private ResCountry accountFiscalCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId accountFiscalCountryId;

    
    private Account accountCashBasisBaseAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountCashBasisBaseAccountId;

    
    private boolean isHrAttendanceOvertime;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private boolean isAttendanceKioskUsePin;

    
    private Account accountJournalEarlyPayDiscountLossAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalEarlyPayDiscountLossAccountId;

    
    private BarcodeNomenclature nomenclatureIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.barcode.BarcodeNomenclature")
        @OdooModel("barcode.BarcodeNomenclature")
    
    private OdooId nomenclatureId;

    
    private Object maxTaxLockDate;

    
    private ProjectTask leaveTimesheetTaskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId leaveTimesheetTaskId;

    
    private Object font;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object saleOnboardingPaymentMethod;

    
    private Object reportHeader;

    
    private Object saleFooter;

    
    private double prepaymentPercent;

    
    private boolean isInvoiceIsUblCii;

    
    private String socialInstagram;

    
    private Object employeePropertiesDefinition;

    
    private boolean isHasMessage;

    
    private Account revenueAccrualAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId revenueAccrualAccountId;

    
    private String attendanceKioskKey;

    
    private Product expenseProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId expenseProductId;

    
    private Object logo;

    
    private Account accountJournalEarlyPayDiscountGainAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalEarlyPayDiscountGainAccountId;

    
    private List<ResourceCalendar> resourceCalendarIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private List<Integer> resourceCalendarIds;

    
    private Date createDate;

    
    private int quotationValidityDays;

    
    private Object reportFooter;

    
    private boolean isIapEnrichAutoDone;

    
    private Object attendanceKioskMode;

    
    private Object quickEditMode;

    
    private Object overtimeStartDate;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String primaryColor;

    
    private String displayName;

    
    private Account expenseAccrualAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId expenseAccrualAccountId;

    
    private SaleOrderTemplate saleOrderTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate")
        @OdooModel("sale.order.SaleOrderTemplate")
    
    private OdooId saleOrderTemplateId;

    
    private Account transferAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId transferAccountId;

    
    private boolean isTaxExigibility;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String socialTiktok;

    
    private Object termsType;

    
    private int sequence;

    
    private String countryCode;

    
    private Object layoutBackgroundImage;

    
    private List<AccountJournal> bankJournalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private List<Integer> bankJournalIds;

    
    private Object invoiceTermsHtml;

    
    private String socialFacebook;

    
    private Object chartTemplate;

    
    private ResCompany parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId parentId;

    
    private boolean isSnailmailCover;

    
    private Account accountJournalPaymentDebitAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalPaymentDebitAccountId;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private boolean isAccountStorno;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private int fiscalyearLastDay;

    
    private IrUiView externalReportLayoutIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId externalReportLayoutId;

    
    private Object layoutBackground;

    
    private String emailSecondaryColor;

    
    private AccountIncoterms incotermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountIncoterms")
        @OdooModel("account.AccountIncoterms")
    
    private OdooId incotermId;

    
    private List<ResCountry> multiVatForeignCountryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private List<Integer> multiVatForeignCountryIds;

    
    private List<ResCompany> parentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> parentIds;

    
    private String bounceEmail;

    
    private AccountJournal taxCashBasisJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId taxCashBasisJournalId;

    
    private Account accountDiscountExpenseAllocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountDiscountExpenseAllocationId;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Account defaultCashDifferenceIncomeAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId defaultCashDifferenceIncomeAccountId;

    
    private String street;

    
    private int partnerGid;

    
    private boolean isAccountUseCreditLimit;

    
    private boolean isQrCode;

    
    private ResCompany rootIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId rootId;

    
    private boolean isAttendanceFromSystray;

    
    private String emailFormatted;

    
    private String catchallFormatted;

    
    private Project internalProjectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId internalProjectId;

    
    private boolean isHrAttendanceDisplayOvertime;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private String saleFooterName;

    
    private String attendanceKioskUrl;

    
    private String mobile;

    
    private AccountJournal automaticEntryDefaultJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId automaticEntryDefaultJournalId;

    
    private boolean isSnailmailColor;

    
    private AccountTax accountSaleTaxIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId accountSaleTaxId;

    
    private Object fiscalyearLastMonth;

    
    private Uom timesheetEncodeUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId timesheetEncodeUomId;

    
    private Account expenseCurrencyExchangeAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId expenseCurrencyExchangeAccountId;

    
    private boolean isMessageHasError;

    
    private AccountJournal accountOpeningJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId accountOpeningJournalId;

    
    private boolean isMessageNeedaction;

    
    private int messageNeedactionCounter;

    
    private List<ResCountry> accountEnabledTaxCountryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private List<Integer> accountEnabledTaxCountryIds;

    
    private Account accountDefaultPosReceivableAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountDefaultPosReceivableAccountId;

    
    private Object companyDetails;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public ResCompany() {
    // Constructor
    }


    public List<ResPartnerBank> getBankIdsAsList() {
        return bankIdsAsList;
    }

    public List<Integer> getBankIds() {
        return bankIds;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getTaxLockDate() {
        return taxLockDate;
    }

    public AccountJournal getCurrencyExchangeJournalIdAsObject() {
        return currencyExchangeJournalIdAsObject;
    }

    public OdooId getCurrencyExchangeJournalId() {
        return currencyExchangeJournalId;
    }

    public String getBounceFormatted() {
        return bounceFormatted;
    }

    public Account getIncomeCurrencyExchangeAccountIdAsObject() {
        return incomeCurrencyExchangeAccountIdAsObject;
    }

    public OdooId getIncomeCurrencyExchangeAccountId() {
        return incomeCurrencyExchangeAccountId;
    }

    public Object getInvoiceTerms() {
        return invoiceTerms;
    }

    public Account getDefaultCashDifferenceExpenseAccountIdAsObject() {
        return defaultCashDifferenceExpenseAccountIdAsObject;
    }

    public OdooId getDefaultCashDifferenceExpenseAccountId() {
        return defaultCashDifferenceExpenseAccountId;
    }

    public boolean getIsInvoiceIsSnailmail() {
        return isInvoiceIsSnailmail;
    }

    public String getDefaultFromEmail() {
        return defaultFromEmail;
    }

    public String getBankAccountCodePrefix() {
        return bankAccountCodePrefix;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public String getSocialLinkedin() {
        return socialLinkedin;
    }

    public int getOvertimeEmployeeThreshold() {
        return overtimeEmployeeThreshold;
    }

    public AccountMove getAccountOpeningMoveIdAsObject() {
        return accountOpeningMoveIdAsObject;
    }

    public OdooId getAccountOpeningMoveId() {
        return accountOpeningMoveId;
    }

    public Account getAccountDiscountIncomeAllocationIdAsObject() {
        return accountDiscountIncomeAllocationIdAsObject;
    }

    public OdooId getAccountDiscountIncomeAllocationId() {
        return accountDiscountIncomeAllocationId;
    }

    public ReportPaperformat getPaperformatIdAsObject() {
        return paperformatIdAsObject;
    }

    public OdooId getPaperformatId() {
        return paperformatId;
    }

    public boolean getIsIsCompanyDetailsEmpty() {
        return isIsCompanyDetailsEmpty;
    }

    public int getHrPresenceControlEmailAmount() {
        return hrPresenceControlEmailAmount;
    }

    public String getParentPath() {
        return parentPath;
    }

    public boolean getIsSnailmailDuplex() {
        return isSnailmailDuplex;
    }

    public AccountJournal getExpenseJournalIdAsObject() {
        return expenseJournalIdAsObject;
    }

    public OdooId getExpenseJournalId() {
        return expenseJournalId;
    }

    public ResCountryState getStateIdAsObject() {
        return stateIdAsObject;
    }

    public OdooId getStateId() {
        return stateId;
    }

    public int getId() {
        return id;
    }

    public Object getFiscalyearLockDate() {
        return fiscalyearLockDate;
    }

    public boolean getIsAngloSaxonAccounting() {
        return isAngloSaxonAccounting;
    }

    public Object getLogoWeb() {
        return logoWeb;
    }

    public Object getTaxCalculationRoundingMethod() {
        return taxCalculationRoundingMethod;
    }

    public String getZip() {
        return zip;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public boolean getIsInvoiceIsDownload() {
        return isInvoiceIsDownload;
    }

    public Product getSaleDiscountProductIdAsObject() {
        return saleDiscountProductIdAsObject;
    }

    public OdooId getSaleDiscountProductId() {
        return saleDiscountProductId;
    }

    public Uom getProjectTimeModeIdAsObject() {
        return projectTimeModeIdAsObject;
    }

    public OdooId getProjectTimeModeId() {
        return projectTimeModeId;
    }

    public String getVat() {
        return vat;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean getIsPortalConfirmationSign() {
        return isPortalConfirmationSign;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getEmailPrimaryColor() {
        return emailPrimaryColor;
    }

    public String getSocialTwitter() {
        return socialTwitter;
    }

    public String getPhone() {
        return phone;
    }

    public int getContractExpirationNoticePeriod() {
        return contractExpirationNoticePeriod;
    }

    public int getWorkPermitExpirationNoticePeriod() {
        return workPermitExpirationNoticePeriod;
    }

    public AccountTax getAccountPurchaseTaxIdAsObject() {
        return accountPurchaseTaxIdAsObject;
    }

    public OdooId getAccountPurchaseTaxId() {
        return accountPurchaseTaxId;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public String getCatchallEmail() {
        return catchallEmail;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public Object getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public Account getAccountJournalPaymentCreditAccountIdAsObject() {
        return accountJournalPaymentCreditAccountIdAsObject;
    }

    public OdooId getAccountJournalPaymentCreditAccountId() {
        return accountJournalPaymentCreditAccountId;
    }

    public boolean getIsPortalConfirmationPay() {
        return isPortalConfirmationPay;
    }

    public int getAttendanceKioskDelay() {
        return attendanceKioskDelay;
    }

    public String getCity() {
        return city;
    }

    public String getSocialYoutube() {
        return socialYoutube;
    }

    public String getTransferAccountCodePrefix() {
        return transferAccountCodePrefix;
    }

    public boolean getIsUsesDefaultLogo() {
        return isUsesDefaultLogo;
    }

    public Object getPaymentOnboardingPaymentMethod() {
        return paymentOnboardingPaymentMethod;
    }

    public Object getAttendanceBarcodeSource() {
        return attendanceBarcodeSource;
    }

    public List<ResCompany> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public String getHrPresenceControlIpList() {
        return hrPresenceControlIpList;
    }

    public List<AccountPaymentMethodLine> getCompanyExpenseAllowedPaymentMethodLineIdsAsList() {
        return companyExpenseAllowedPaymentMethodLineIdsAsList;
    }

    public List<Integer> getCompanyExpenseAllowedPaymentMethodLineIds() {
        return companyExpenseAllowedPaymentMethodLineIds;
    }

    public Object getPeriodLockDate() {
        return periodLockDate;
    }

    public List<AccountFiscalPosition> getFiscalPositionIdsAsList() {
        return fiscalPositionIdsAsList;
    }

    public List<Integer> getFiscalPositionIds() {
        return fiscalPositionIds;
    }

    public boolean getIsExpectsChartOfAccounts() {
        return isExpectsChartOfAccounts;
    }

    public String getCashAccountCodePrefix() {
        return cashAccountCodePrefix;
    }

    public Product getSaleDownPaymentProductIdAsObject() {
        return saleDownPaymentProductIdAsObject;
    }

    public OdooId getSaleDownPaymentProductId() {
        return saleDownPaymentProductId;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public Account getAccountJournalSuspenseAccountIdAsObject() {
        return accountJournalSuspenseAccountIdAsObject;
    }

    public OdooId getAccountJournalSuspenseAccountId() {
        return accountJournalSuspenseAccountId;
    }

    public List<ResCompany> getAllChildIdsAsList() {
        return allChildIdsAsList;
    }

    public List<Integer> getAllChildIds() {
        return allChildIds;
    }

    public String getStreet2() {
        return street2;
    }

    public String getAliasDomainName() {
        return aliasDomainName;
    }

    public String getEmail() {
        return email;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public boolean getIsInvoiceIsEmail() {
        return isInvoiceIsEmail;
    }

    public String getWebsite() {
        return website;
    }

    public String getSocialGithub() {
        return socialGithub;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public String getCompanyRegistry() {
        return companyRegistry;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsDisplayInvoiceAmountTotalWords() {
        return isDisplayInvoiceAmountTotalWords;
    }

    public int getOvertimeCompanyThreshold() {
        return overtimeCompanyThreshold;
    }

    public Object getSaleHeader() {
        return saleHeader;
    }

    public String getSaleHeaderName() {
        return saleHeaderName;
    }

    public ResCountry getAccountFiscalCountryIdAsObject() {
        return accountFiscalCountryIdAsObject;
    }

    public OdooId getAccountFiscalCountryId() {
        return accountFiscalCountryId;
    }

    public Account getAccountCashBasisBaseAccountIdAsObject() {
        return accountCashBasisBaseAccountIdAsObject;
    }

    public OdooId getAccountCashBasisBaseAccountId() {
        return accountCashBasisBaseAccountId;
    }

    public boolean getIsHrAttendanceOvertime() {
        return isHrAttendanceOvertime;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public boolean getIsAttendanceKioskUsePin() {
        return isAttendanceKioskUsePin;
    }

    public Account getAccountJournalEarlyPayDiscountLossAccountIdAsObject() {
        return accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountLossAccountId() {
        return accountJournalEarlyPayDiscountLossAccountId;
    }

    public BarcodeNomenclature getNomenclatureIdAsObject() {
        return nomenclatureIdAsObject;
    }

    public OdooId getNomenclatureId() {
        return nomenclatureId;
    }

    public Object getMaxTaxLockDate() {
        return maxTaxLockDate;
    }

    public ProjectTask getLeaveTimesheetTaskIdAsObject() {
        return leaveTimesheetTaskIdAsObject;
    }

    public OdooId getLeaveTimesheetTaskId() {
        return leaveTimesheetTaskId;
    }

    public Object getFont() {
        return font;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getSaleOnboardingPaymentMethod() {
        return saleOnboardingPaymentMethod;
    }

    public Object getReportHeader() {
        return reportHeader;
    }

    public Object getSaleFooter() {
        return saleFooter;
    }

    public double getPrepaymentPercent() {
        return prepaymentPercent;
    }

    public boolean getIsInvoiceIsUblCii() {
        return isInvoiceIsUblCii;
    }

    public String getSocialInstagram() {
        return socialInstagram;
    }

    public Object getEmployeePropertiesDefinition() {
        return employeePropertiesDefinition;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public Account getRevenueAccrualAccountIdAsObject() {
        return revenueAccrualAccountIdAsObject;
    }

    public OdooId getRevenueAccrualAccountId() {
        return revenueAccrualAccountId;
    }

    public String getAttendanceKioskKey() {
        return attendanceKioskKey;
    }

    public Product getExpenseProductIdAsObject() {
        return expenseProductIdAsObject;
    }

    public OdooId getExpenseProductId() {
        return expenseProductId;
    }

    public Object getLogo() {
        return logo;
    }

    public Account getAccountJournalEarlyPayDiscountGainAccountIdAsObject() {
        return accountJournalEarlyPayDiscountGainAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountGainAccountId() {
        return accountJournalEarlyPayDiscountGainAccountId;
    }

    public List<ResourceCalendar> getResourceCalendarIdsAsList() {
        return resourceCalendarIdsAsList;
    }

    public List<Integer> getResourceCalendarIds() {
        return resourceCalendarIds;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getQuotationValidityDays() {
        return quotationValidityDays;
    }

    public Object getReportFooter() {
        return reportFooter;
    }

    public boolean getIsIapEnrichAutoDone() {
        return isIapEnrichAutoDone;
    }

    public Object getAttendanceKioskMode() {
        return attendanceKioskMode;
    }

    public Object getQuickEditMode() {
        return quickEditMode;
    }

    public Object getOvertimeStartDate() {
        return overtimeStartDate;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Account getExpenseAccrualAccountIdAsObject() {
        return expenseAccrualAccountIdAsObject;
    }

    public OdooId getExpenseAccrualAccountId() {
        return expenseAccrualAccountId;
    }

    public SaleOrderTemplate getSaleOrderTemplateIdAsObject() {
        return saleOrderTemplateIdAsObject;
    }

    public OdooId getSaleOrderTemplateId() {
        return saleOrderTemplateId;
    }

    public Account getTransferAccountIdAsObject() {
        return transferAccountIdAsObject;
    }

    public OdooId getTransferAccountId() {
        return transferAccountId;
    }

    public boolean getIsTaxExigibility() {
        return isTaxExigibility;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public String getSocialTiktok() {
        return socialTiktok;
    }

    public Object getTermsType() {
        return termsType;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Object getLayoutBackgroundImage() {
        return layoutBackgroundImage;
    }

    public List<AccountJournal> getBankJournalIdsAsList() {
        return bankJournalIdsAsList;
    }

    public List<Integer> getBankJournalIds() {
        return bankJournalIds;
    }

    public Object getInvoiceTermsHtml() {
        return invoiceTermsHtml;
    }

    public String getSocialFacebook() {
        return socialFacebook;
    }

    public Object getChartTemplate() {
        return chartTemplate;
    }

    public ResCompany getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public boolean getIsSnailmailCover() {
        return isSnailmailCover;
    }

    public Account getAccountJournalPaymentDebitAccountIdAsObject() {
        return accountJournalPaymentDebitAccountIdAsObject;
    }

    public OdooId getAccountJournalPaymentDebitAccountId() {
        return accountJournalPaymentDebitAccountId;
    }

    public String getName() {
        return name;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public boolean getIsAccountStorno() {
        return isAccountStorno;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public int getColor() {
        return color;
    }

    public int getFiscalyearLastDay() {
        return fiscalyearLastDay;
    }

    public IrUiView getExternalReportLayoutIdAsObject() {
        return externalReportLayoutIdAsObject;
    }

    public OdooId getExternalReportLayoutId() {
        return externalReportLayoutId;
    }

    public Object getLayoutBackground() {
        return layoutBackground;
    }

    public String getEmailSecondaryColor() {
        return emailSecondaryColor;
    }

    public AccountIncoterms getIncotermIdAsObject() {
        return incotermIdAsObject;
    }

    public OdooId getIncotermId() {
        return incotermId;
    }

    public List<ResCountry> getMultiVatForeignCountryIdsAsList() {
        return multiVatForeignCountryIdsAsList;
    }

    public List<Integer> getMultiVatForeignCountryIds() {
        return multiVatForeignCountryIds;
    }

    public List<ResCompany> getParentIdsAsList() {
        return parentIdsAsList;
    }

    public List<Integer> getParentIds() {
        return parentIds;
    }

    public String getBounceEmail() {
        return bounceEmail;
    }

    public AccountJournal getTaxCashBasisJournalIdAsObject() {
        return taxCashBasisJournalIdAsObject;
    }

    public OdooId getTaxCashBasisJournalId() {
        return taxCashBasisJournalId;
    }

    public Account getAccountDiscountExpenseAllocationIdAsObject() {
        return accountDiscountExpenseAllocationIdAsObject;
    }

    public OdooId getAccountDiscountExpenseAllocationId() {
        return accountDiscountExpenseAllocationId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Account getDefaultCashDifferenceIncomeAccountIdAsObject() {
        return defaultCashDifferenceIncomeAccountIdAsObject;
    }

    public OdooId getDefaultCashDifferenceIncomeAccountId() {
        return defaultCashDifferenceIncomeAccountId;
    }

    public String getStreet() {
        return street;
    }

    public int getPartnerGid() {
        return partnerGid;
    }

    public boolean getIsAccountUseCreditLimit() {
        return isAccountUseCreditLimit;
    }

    public boolean getIsQrCode() {
        return isQrCode;
    }

    public ResCompany getRootIdAsObject() {
        return rootIdAsObject;
    }

    public OdooId getRootId() {
        return rootId;
    }

    public boolean getIsAttendanceFromSystray() {
        return isAttendanceFromSystray;
    }

    public String getEmailFormatted() {
        return emailFormatted;
    }

    public String getCatchallFormatted() {
        return catchallFormatted;
    }

    public Project getInternalProjectIdAsObject() {
        return internalProjectIdAsObject;
    }

    public OdooId getInternalProjectId() {
        return internalProjectId;
    }

    public boolean getIsHrAttendanceDisplayOvertime() {
        return isHrAttendanceDisplayOvertime;
    }

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
    }

    public String getSaleFooterName() {
        return saleFooterName;
    }

    public String getAttendanceKioskUrl() {
        return attendanceKioskUrl;
    }

    public String getMobile() {
        return mobile;
    }

    public AccountJournal getAutomaticEntryDefaultJournalIdAsObject() {
        return automaticEntryDefaultJournalIdAsObject;
    }

    public OdooId getAutomaticEntryDefaultJournalId() {
        return automaticEntryDefaultJournalId;
    }

    public boolean getIsSnailmailColor() {
        return isSnailmailColor;
    }

    public AccountTax getAccountSaleTaxIdAsObject() {
        return accountSaleTaxIdAsObject;
    }

    public OdooId getAccountSaleTaxId() {
        return accountSaleTaxId;
    }

    public Object getFiscalyearLastMonth() {
        return fiscalyearLastMonth;
    }

    public Uom getTimesheetEncodeUomIdAsObject() {
        return timesheetEncodeUomIdAsObject;
    }

    public OdooId getTimesheetEncodeUomId() {
        return timesheetEncodeUomId;
    }

    public Account getExpenseCurrencyExchangeAccountIdAsObject() {
        return expenseCurrencyExchangeAccountIdAsObject;
    }

    public OdooId getExpenseCurrencyExchangeAccountId() {
        return expenseCurrencyExchangeAccountId;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public AccountJournal getAccountOpeningJournalIdAsObject() {
        return accountOpeningJournalIdAsObject;
    }

    public OdooId getAccountOpeningJournalId() {
        return accountOpeningJournalId;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public List<ResCountry> getAccountEnabledTaxCountryIdsAsList() {
        return accountEnabledTaxCountryIdsAsList;
    }

    public List<Integer> getAccountEnabledTaxCountryIds() {
        return accountEnabledTaxCountryIds;
    }

    public Account getAccountDefaultPosReceivableAccountIdAsObject() {
        return accountDefaultPosReceivableAccountIdAsObject;
    }

    public OdooId getAccountDefaultPosReceivableAccountId() {
        return accountDefaultPosReceivableAccountId;
    }

    public Object getCompanyDetails() {
        return companyDetails;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setBankIdsAsList(List<ResPartnerBank> bankIdsAsList) {
        this.bankIdsAsList = bankIdsAsList;
    }

    public void setBankIds(List<Integer> bankIds) {
        this.bankIds = bankIds;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setTaxLockDate(Object taxLockDate) {
        this.taxLockDate = taxLockDate;
    }

    public void setCurrencyExchangeJournalIdAsObject(AccountJournal currencyExchangeJournalIdAsObject) {
        this.currencyExchangeJournalIdAsObject = currencyExchangeJournalIdAsObject;
    }

    public void setCurrencyExchangeJournalId(OdooId currencyExchangeJournalId) {
        this.currencyExchangeJournalId = currencyExchangeJournalId;
    }

    public void setBounceFormatted(String bounceFormatted) {
        this.bounceFormatted = bounceFormatted;
    }

    public void setIncomeCurrencyExchangeAccountIdAsObject(Account incomeCurrencyExchangeAccountIdAsObject) {
        this.incomeCurrencyExchangeAccountIdAsObject = incomeCurrencyExchangeAccountIdAsObject;
    }

    public void setIncomeCurrencyExchangeAccountId(OdooId incomeCurrencyExchangeAccountId) {
        this.incomeCurrencyExchangeAccountId = incomeCurrencyExchangeAccountId;
    }

    public void setInvoiceTerms(Object invoiceTerms) {
        this.invoiceTerms = invoiceTerms;
    }

    public void setDefaultCashDifferenceExpenseAccountIdAsObject(Account defaultCashDifferenceExpenseAccountIdAsObject) {
        this.defaultCashDifferenceExpenseAccountIdAsObject = defaultCashDifferenceExpenseAccountIdAsObject;
    }

    public void setDefaultCashDifferenceExpenseAccountId(OdooId defaultCashDifferenceExpenseAccountId) {
        this.defaultCashDifferenceExpenseAccountId = defaultCashDifferenceExpenseAccountId;
    }

    public void setIsInvoiceIsSnailmail(boolean isInvoiceIsSnailmail) {
        this.isInvoiceIsSnailmail = isInvoiceIsSnailmail;
    }

    public void setDefaultFromEmail(String defaultFromEmail) {
        this.defaultFromEmail = defaultFromEmail;
    }

    public void setBankAccountCodePrefix(String bankAccountCodePrefix) {
        this.bankAccountCodePrefix = bankAccountCodePrefix;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setSocialLinkedin(String socialLinkedin) {
        this.socialLinkedin = socialLinkedin;
    }

    public void setOvertimeEmployeeThreshold(int overtimeEmployeeThreshold) {
        this.overtimeEmployeeThreshold = overtimeEmployeeThreshold;
    }

    public void setAccountOpeningMoveIdAsObject(AccountMove accountOpeningMoveIdAsObject) {
        this.accountOpeningMoveIdAsObject = accountOpeningMoveIdAsObject;
    }

    public void setAccountOpeningMoveId(OdooId accountOpeningMoveId) {
        this.accountOpeningMoveId = accountOpeningMoveId;
    }

    public void setAccountDiscountIncomeAllocationIdAsObject(Account accountDiscountIncomeAllocationIdAsObject) {
        this.accountDiscountIncomeAllocationIdAsObject = accountDiscountIncomeAllocationIdAsObject;
    }

    public void setAccountDiscountIncomeAllocationId(OdooId accountDiscountIncomeAllocationId) {
        this.accountDiscountIncomeAllocationId = accountDiscountIncomeAllocationId;
    }

    public void setPaperformatIdAsObject(ReportPaperformat paperformatIdAsObject) {
        this.paperformatIdAsObject = paperformatIdAsObject;
    }

    public void setPaperformatId(OdooId paperformatId) {
        this.paperformatId = paperformatId;
    }

    public void setIsIsCompanyDetailsEmpty(boolean isIsCompanyDetailsEmpty) {
        this.isIsCompanyDetailsEmpty = isIsCompanyDetailsEmpty;
    }

    public void setHrPresenceControlEmailAmount(int hrPresenceControlEmailAmount) {
        this.hrPresenceControlEmailAmount = hrPresenceControlEmailAmount;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public void setIsSnailmailDuplex(boolean isSnailmailDuplex) {
        this.isSnailmailDuplex = isSnailmailDuplex;
    }

    public void setExpenseJournalIdAsObject(AccountJournal expenseJournalIdAsObject) {
        this.expenseJournalIdAsObject = expenseJournalIdAsObject;
    }

    public void setExpenseJournalId(OdooId expenseJournalId) {
        this.expenseJournalId = expenseJournalId;
    }

    public void setStateIdAsObject(ResCountryState stateIdAsObject) {
        this.stateIdAsObject = stateIdAsObject;
    }

    public void setStateId(OdooId stateId) {
        this.stateId = stateId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFiscalyearLockDate(Object fiscalyearLockDate) {
        this.fiscalyearLockDate = fiscalyearLockDate;
    }

    public void setIsAngloSaxonAccounting(boolean isAngloSaxonAccounting) {
        this.isAngloSaxonAccounting = isAngloSaxonAccounting;
    }

    public void setLogoWeb(Object logoWeb) {
        this.logoWeb = logoWeb;
    }

    public void setTaxCalculationRoundingMethod(Object taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setIsInvoiceIsDownload(boolean isInvoiceIsDownload) {
        this.isInvoiceIsDownload = isInvoiceIsDownload;
    }

    public void setSaleDiscountProductIdAsObject(Product saleDiscountProductIdAsObject) {
        this.saleDiscountProductIdAsObject = saleDiscountProductIdAsObject;
    }

    public void setSaleDiscountProductId(OdooId saleDiscountProductId) {
        this.saleDiscountProductId = saleDiscountProductId;
    }

    public void setProjectTimeModeIdAsObject(Uom projectTimeModeIdAsObject) {
        this.projectTimeModeIdAsObject = projectTimeModeIdAsObject;
    }

    public void setProjectTimeModeId(OdooId projectTimeModeId) {
        this.projectTimeModeId = projectTimeModeId;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsPortalConfirmationSign(boolean isPortalConfirmationSign) {
        this.isPortalConfirmationSign = isPortalConfirmationSign;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setEmailPrimaryColor(String emailPrimaryColor) {
        this.emailPrimaryColor = emailPrimaryColor;
    }

    public void setSocialTwitter(String socialTwitter) {
        this.socialTwitter = socialTwitter;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContractExpirationNoticePeriod(int contractExpirationNoticePeriod) {
        this.contractExpirationNoticePeriod = contractExpirationNoticePeriod;
    }

    public void setWorkPermitExpirationNoticePeriod(int workPermitExpirationNoticePeriod) {
        this.workPermitExpirationNoticePeriod = workPermitExpirationNoticePeriod;
    }

    public void setAccountPurchaseTaxIdAsObject(AccountTax accountPurchaseTaxIdAsObject) {
        this.accountPurchaseTaxIdAsObject = accountPurchaseTaxIdAsObject;
    }

    public void setAccountPurchaseTaxId(OdooId accountPurchaseTaxId) {
        this.accountPurchaseTaxId = accountPurchaseTaxId;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setCatchallEmail(String catchallEmail) {
        this.catchallEmail = catchallEmail;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setAccountOpeningDate(Object accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setAccountJournalPaymentCreditAccountIdAsObject(Account accountJournalPaymentCreditAccountIdAsObject) {
        this.accountJournalPaymentCreditAccountIdAsObject = accountJournalPaymentCreditAccountIdAsObject;
    }

    public void setAccountJournalPaymentCreditAccountId(OdooId accountJournalPaymentCreditAccountId) {
        this.accountJournalPaymentCreditAccountId = accountJournalPaymentCreditAccountId;
    }

    public void setIsPortalConfirmationPay(boolean isPortalConfirmationPay) {
        this.isPortalConfirmationPay = isPortalConfirmationPay;
    }

    public void setAttendanceKioskDelay(int attendanceKioskDelay) {
        this.attendanceKioskDelay = attendanceKioskDelay;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSocialYoutube(String socialYoutube) {
        this.socialYoutube = socialYoutube;
    }

    public void setTransferAccountCodePrefix(String transferAccountCodePrefix) {
        this.transferAccountCodePrefix = transferAccountCodePrefix;
    }

    public void setIsUsesDefaultLogo(boolean isUsesDefaultLogo) {
        this.isUsesDefaultLogo = isUsesDefaultLogo;
    }

    public void setPaymentOnboardingPaymentMethod(Object paymentOnboardingPaymentMethod) {
        this.paymentOnboardingPaymentMethod = paymentOnboardingPaymentMethod;
    }

    public void setAttendanceBarcodeSource(Object attendanceBarcodeSource) {
        this.attendanceBarcodeSource = attendanceBarcodeSource;
    }

    public void setChildIdsAsList(List<ResCompany> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setHrPresenceControlIpList(String hrPresenceControlIpList) {
        this.hrPresenceControlIpList = hrPresenceControlIpList;
    }

    public void setCompanyExpenseAllowedPaymentMethodLineIdsAsList(List<AccountPaymentMethodLine> companyExpenseAllowedPaymentMethodLineIdsAsList) {
        this.companyExpenseAllowedPaymentMethodLineIdsAsList = companyExpenseAllowedPaymentMethodLineIdsAsList;
    }

    public void setCompanyExpenseAllowedPaymentMethodLineIds(List<Integer> companyExpenseAllowedPaymentMethodLineIds) {
        this.companyExpenseAllowedPaymentMethodLineIds = companyExpenseAllowedPaymentMethodLineIds;
    }

    public void setPeriodLockDate(Object periodLockDate) {
        this.periodLockDate = periodLockDate;
    }

    public void setFiscalPositionIdsAsList(List<AccountFiscalPosition> fiscalPositionIdsAsList) {
        this.fiscalPositionIdsAsList = fiscalPositionIdsAsList;
    }

    public void setFiscalPositionIds(List<Integer> fiscalPositionIds) {
        this.fiscalPositionIds = fiscalPositionIds;
    }

    public void setIsExpectsChartOfAccounts(boolean isExpectsChartOfAccounts) {
        this.isExpectsChartOfAccounts = isExpectsChartOfAccounts;
    }

    public void setCashAccountCodePrefix(String cashAccountCodePrefix) {
        this.cashAccountCodePrefix = cashAccountCodePrefix;
    }

    public void setSaleDownPaymentProductIdAsObject(Product saleDownPaymentProductIdAsObject) {
        this.saleDownPaymentProductIdAsObject = saleDownPaymentProductIdAsObject;
    }

    public void setSaleDownPaymentProductId(OdooId saleDownPaymentProductId) {
        this.saleDownPaymentProductId = saleDownPaymentProductId;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public void setAccountJournalSuspenseAccountIdAsObject(Account accountJournalSuspenseAccountIdAsObject) {
        this.accountJournalSuspenseAccountIdAsObject = accountJournalSuspenseAccountIdAsObject;
    }

    public void setAccountJournalSuspenseAccountId(OdooId accountJournalSuspenseAccountId) {
        this.accountJournalSuspenseAccountId = accountJournalSuspenseAccountId;
    }

    public void setAllChildIdsAsList(List<ResCompany> allChildIdsAsList) {
        this.allChildIdsAsList = allChildIdsAsList;
    }

    public void setAllChildIds(List<Integer> allChildIds) {
        this.allChildIds = allChildIds;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setAliasDomainName(String aliasDomainName) {
        this.aliasDomainName = aliasDomainName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setIsInvoiceIsEmail(boolean isInvoiceIsEmail) {
        this.isInvoiceIsEmail = isInvoiceIsEmail;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setSocialGithub(String socialGithub) {
        this.socialGithub = socialGithub;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsDisplayInvoiceAmountTotalWords(boolean isDisplayInvoiceAmountTotalWords) {
        this.isDisplayInvoiceAmountTotalWords = isDisplayInvoiceAmountTotalWords;
    }

    public void setOvertimeCompanyThreshold(int overtimeCompanyThreshold) {
        this.overtimeCompanyThreshold = overtimeCompanyThreshold;
    }

    public void setSaleHeader(Object saleHeader) {
        this.saleHeader = saleHeader;
    }

    public void setSaleHeaderName(String saleHeaderName) {
        this.saleHeaderName = saleHeaderName;
    }

    public void setAccountFiscalCountryIdAsObject(ResCountry accountFiscalCountryIdAsObject) {
        this.accountFiscalCountryIdAsObject = accountFiscalCountryIdAsObject;
    }

    public void setAccountFiscalCountryId(OdooId accountFiscalCountryId) {
        this.accountFiscalCountryId = accountFiscalCountryId;
    }

    public void setAccountCashBasisBaseAccountIdAsObject(Account accountCashBasisBaseAccountIdAsObject) {
        this.accountCashBasisBaseAccountIdAsObject = accountCashBasisBaseAccountIdAsObject;
    }

    public void setAccountCashBasisBaseAccountId(OdooId accountCashBasisBaseAccountId) {
        this.accountCashBasisBaseAccountId = accountCashBasisBaseAccountId;
    }

    public void setIsHrAttendanceOvertime(boolean isHrAttendanceOvertime) {
        this.isHrAttendanceOvertime = isHrAttendanceOvertime;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setIsAttendanceKioskUsePin(boolean isAttendanceKioskUsePin) {
        this.isAttendanceKioskUsePin = isAttendanceKioskUsePin;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountIdAsObject(Account accountJournalEarlyPayDiscountLossAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountLossAccountIdAsObject = accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountId(OdooId accountJournalEarlyPayDiscountLossAccountId) {
        this.accountJournalEarlyPayDiscountLossAccountId = accountJournalEarlyPayDiscountLossAccountId;
    }

    public void setNomenclatureIdAsObject(BarcodeNomenclature nomenclatureIdAsObject) {
        this.nomenclatureIdAsObject = nomenclatureIdAsObject;
    }

    public void setNomenclatureId(OdooId nomenclatureId) {
        this.nomenclatureId = nomenclatureId;
    }

    public void setMaxTaxLockDate(Object maxTaxLockDate) {
        this.maxTaxLockDate = maxTaxLockDate;
    }

    public void setLeaveTimesheetTaskIdAsObject(ProjectTask leaveTimesheetTaskIdAsObject) {
        this.leaveTimesheetTaskIdAsObject = leaveTimesheetTaskIdAsObject;
    }

    public void setLeaveTimesheetTaskId(OdooId leaveTimesheetTaskId) {
        this.leaveTimesheetTaskId = leaveTimesheetTaskId;
    }

    public void setFont(Object font) {
        this.font = font;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setSaleOnboardingPaymentMethod(Object saleOnboardingPaymentMethod) {
        this.saleOnboardingPaymentMethod = saleOnboardingPaymentMethod;
    }

    public void setReportHeader(Object reportHeader) {
        this.reportHeader = reportHeader;
    }

    public void setSaleFooter(Object saleFooter) {
        this.saleFooter = saleFooter;
    }

    public void setPrepaymentPercent(double prepaymentPercent) {
        this.prepaymentPercent = prepaymentPercent;
    }

    public void setIsInvoiceIsUblCii(boolean isInvoiceIsUblCii) {
        this.isInvoiceIsUblCii = isInvoiceIsUblCii;
    }

    public void setSocialInstagram(String socialInstagram) {
        this.socialInstagram = socialInstagram;
    }

    public void setEmployeePropertiesDefinition(Object employeePropertiesDefinition) {
        this.employeePropertiesDefinition = employeePropertiesDefinition;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setRevenueAccrualAccountIdAsObject(Account revenueAccrualAccountIdAsObject) {
        this.revenueAccrualAccountIdAsObject = revenueAccrualAccountIdAsObject;
    }

    public void setRevenueAccrualAccountId(OdooId revenueAccrualAccountId) {
        this.revenueAccrualAccountId = revenueAccrualAccountId;
    }

    public void setAttendanceKioskKey(String attendanceKioskKey) {
        this.attendanceKioskKey = attendanceKioskKey;
    }

    public void setExpenseProductIdAsObject(Product expenseProductIdAsObject) {
        this.expenseProductIdAsObject = expenseProductIdAsObject;
    }

    public void setExpenseProductId(OdooId expenseProductId) {
        this.expenseProductId = expenseProductId;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public void setAccountJournalEarlyPayDiscountGainAccountIdAsObject(Account accountJournalEarlyPayDiscountGainAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountGainAccountIdAsObject = accountJournalEarlyPayDiscountGainAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountGainAccountId(OdooId accountJournalEarlyPayDiscountGainAccountId) {
        this.accountJournalEarlyPayDiscountGainAccountId = accountJournalEarlyPayDiscountGainAccountId;
    }

    public void setResourceCalendarIdsAsList(List<ResourceCalendar> resourceCalendarIdsAsList) {
        this.resourceCalendarIdsAsList = resourceCalendarIdsAsList;
    }

    public void setResourceCalendarIds(List<Integer> resourceCalendarIds) {
        this.resourceCalendarIds = resourceCalendarIds;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setQuotationValidityDays(int quotationValidityDays) {
        this.quotationValidityDays = quotationValidityDays;
    }

    public void setReportFooter(Object reportFooter) {
        this.reportFooter = reportFooter;
    }

    public void setIsIapEnrichAutoDone(boolean isIapEnrichAutoDone) {
        this.isIapEnrichAutoDone = isIapEnrichAutoDone;
    }

    public void setAttendanceKioskMode(Object attendanceKioskMode) {
        this.attendanceKioskMode = attendanceKioskMode;
    }

    public void setQuickEditMode(Object quickEditMode) {
        this.quickEditMode = quickEditMode;
    }

    public void setOvertimeStartDate(Object overtimeStartDate) {
        this.overtimeStartDate = overtimeStartDate;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setExpenseAccrualAccountIdAsObject(Account expenseAccrualAccountIdAsObject) {
        this.expenseAccrualAccountIdAsObject = expenseAccrualAccountIdAsObject;
    }

    public void setExpenseAccrualAccountId(OdooId expenseAccrualAccountId) {
        this.expenseAccrualAccountId = expenseAccrualAccountId;
    }

    public void setSaleOrderTemplateIdAsObject(SaleOrderTemplate saleOrderTemplateIdAsObject) {
        this.saleOrderTemplateIdAsObject = saleOrderTemplateIdAsObject;
    }

    public void setSaleOrderTemplateId(OdooId saleOrderTemplateId) {
        this.saleOrderTemplateId = saleOrderTemplateId;
    }

    public void setTransferAccountIdAsObject(Account transferAccountIdAsObject) {
        this.transferAccountIdAsObject = transferAccountIdAsObject;
    }

    public void setTransferAccountId(OdooId transferAccountId) {
        this.transferAccountId = transferAccountId;
    }

    public void setIsTaxExigibility(boolean isTaxExigibility) {
        this.isTaxExigibility = isTaxExigibility;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setSocialTiktok(String socialTiktok) {
        this.socialTiktok = socialTiktok;
    }

    public void setTermsType(Object termsType) {
        this.termsType = termsType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setLayoutBackgroundImage(Object layoutBackgroundImage) {
        this.layoutBackgroundImage = layoutBackgroundImage;
    }

    public void setBankJournalIdsAsList(List<AccountJournal> bankJournalIdsAsList) {
        this.bankJournalIdsAsList = bankJournalIdsAsList;
    }

    public void setBankJournalIds(List<Integer> bankJournalIds) {
        this.bankJournalIds = bankJournalIds;
    }

    public void setInvoiceTermsHtml(Object invoiceTermsHtml) {
        this.invoiceTermsHtml = invoiceTermsHtml;
    }

    public void setSocialFacebook(String socialFacebook) {
        this.socialFacebook = socialFacebook;
    }

    public void setChartTemplate(Object chartTemplate) {
        this.chartTemplate = chartTemplate;
    }

    public void setParentIdAsObject(ResCompany parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setIsSnailmailCover(boolean isSnailmailCover) {
        this.isSnailmailCover = isSnailmailCover;
    }

    public void setAccountJournalPaymentDebitAccountIdAsObject(Account accountJournalPaymentDebitAccountIdAsObject) {
        this.accountJournalPaymentDebitAccountIdAsObject = accountJournalPaymentDebitAccountIdAsObject;
    }

    public void setAccountJournalPaymentDebitAccountId(OdooId accountJournalPaymentDebitAccountId) {
        this.accountJournalPaymentDebitAccountId = accountJournalPaymentDebitAccountId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setIsAccountStorno(boolean isAccountStorno) {
        this.isAccountStorno = isAccountStorno;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setFiscalyearLastDay(int fiscalyearLastDay) {
        this.fiscalyearLastDay = fiscalyearLastDay;
    }

    public void setExternalReportLayoutIdAsObject(IrUiView externalReportLayoutIdAsObject) {
        this.externalReportLayoutIdAsObject = externalReportLayoutIdAsObject;
    }

    public void setExternalReportLayoutId(OdooId externalReportLayoutId) {
        this.externalReportLayoutId = externalReportLayoutId;
    }

    public void setLayoutBackground(Object layoutBackground) {
        this.layoutBackground = layoutBackground;
    }

    public void setEmailSecondaryColor(String emailSecondaryColor) {
        this.emailSecondaryColor = emailSecondaryColor;
    }

    public void setIncotermIdAsObject(AccountIncoterms incotermIdAsObject) {
        this.incotermIdAsObject = incotermIdAsObject;
    }

    public void setIncotermId(OdooId incotermId) {
        this.incotermId = incotermId;
    }

    public void setMultiVatForeignCountryIdsAsList(List<ResCountry> multiVatForeignCountryIdsAsList) {
        this.multiVatForeignCountryIdsAsList = multiVatForeignCountryIdsAsList;
    }

    public void setMultiVatForeignCountryIds(List<Integer> multiVatForeignCountryIds) {
        this.multiVatForeignCountryIds = multiVatForeignCountryIds;
    }

    public void setParentIdsAsList(List<ResCompany> parentIdsAsList) {
        this.parentIdsAsList = parentIdsAsList;
    }

    public void setParentIds(List<Integer> parentIds) {
        this.parentIds = parentIds;
    }

    public void setBounceEmail(String bounceEmail) {
        this.bounceEmail = bounceEmail;
    }

    public void setTaxCashBasisJournalIdAsObject(AccountJournal taxCashBasisJournalIdAsObject) {
        this.taxCashBasisJournalIdAsObject = taxCashBasisJournalIdAsObject;
    }

    public void setTaxCashBasisJournalId(OdooId taxCashBasisJournalId) {
        this.taxCashBasisJournalId = taxCashBasisJournalId;
    }

    public void setAccountDiscountExpenseAllocationIdAsObject(Account accountDiscountExpenseAllocationIdAsObject) {
        this.accountDiscountExpenseAllocationIdAsObject = accountDiscountExpenseAllocationIdAsObject;
    }

    public void setAccountDiscountExpenseAllocationId(OdooId accountDiscountExpenseAllocationId) {
        this.accountDiscountExpenseAllocationId = accountDiscountExpenseAllocationId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setDefaultCashDifferenceIncomeAccountIdAsObject(Account defaultCashDifferenceIncomeAccountIdAsObject) {
        this.defaultCashDifferenceIncomeAccountIdAsObject = defaultCashDifferenceIncomeAccountIdAsObject;
    }

    public void setDefaultCashDifferenceIncomeAccountId(OdooId defaultCashDifferenceIncomeAccountId) {
        this.defaultCashDifferenceIncomeAccountId = defaultCashDifferenceIncomeAccountId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPartnerGid(int partnerGid) {
        this.partnerGid = partnerGid;
    }

    public void setIsAccountUseCreditLimit(boolean isAccountUseCreditLimit) {
        this.isAccountUseCreditLimit = isAccountUseCreditLimit;
    }

    public void setIsQrCode(boolean isQrCode) {
        this.isQrCode = isQrCode;
    }

    public void setRootIdAsObject(ResCompany rootIdAsObject) {
        this.rootIdAsObject = rootIdAsObject;
    }

    public void setRootId(OdooId rootId) {
        this.rootId = rootId;
    }

    public void setIsAttendanceFromSystray(boolean isAttendanceFromSystray) {
        this.isAttendanceFromSystray = isAttendanceFromSystray;
    }

    public void setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted;
    }

    public void setCatchallFormatted(String catchallFormatted) {
        this.catchallFormatted = catchallFormatted;
    }

    public void setInternalProjectIdAsObject(Project internalProjectIdAsObject) {
        this.internalProjectIdAsObject = internalProjectIdAsObject;
    }

    public void setInternalProjectId(OdooId internalProjectId) {
        this.internalProjectId = internalProjectId;
    }

    public void setIsHrAttendanceDisplayOvertime(boolean isHrAttendanceDisplayOvertime) {
        this.isHrAttendanceDisplayOvertime = isHrAttendanceDisplayOvertime;
    }

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
    }

    public void setSaleFooterName(String saleFooterName) {
        this.saleFooterName = saleFooterName;
    }

    public void setAttendanceKioskUrl(String attendanceKioskUrl) {
        this.attendanceKioskUrl = attendanceKioskUrl;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAutomaticEntryDefaultJournalIdAsObject(AccountJournal automaticEntryDefaultJournalIdAsObject) {
        this.automaticEntryDefaultJournalIdAsObject = automaticEntryDefaultJournalIdAsObject;
    }

    public void setAutomaticEntryDefaultJournalId(OdooId automaticEntryDefaultJournalId) {
        this.automaticEntryDefaultJournalId = automaticEntryDefaultJournalId;
    }

    public void setIsSnailmailColor(boolean isSnailmailColor) {
        this.isSnailmailColor = isSnailmailColor;
    }

    public void setAccountSaleTaxIdAsObject(AccountTax accountSaleTaxIdAsObject) {
        this.accountSaleTaxIdAsObject = accountSaleTaxIdAsObject;
    }

    public void setAccountSaleTaxId(OdooId accountSaleTaxId) {
        this.accountSaleTaxId = accountSaleTaxId;
    }

    public void setFiscalyearLastMonth(Object fiscalyearLastMonth) {
        this.fiscalyearLastMonth = fiscalyearLastMonth;
    }

    public void setTimesheetEncodeUomIdAsObject(Uom timesheetEncodeUomIdAsObject) {
        this.timesheetEncodeUomIdAsObject = timesheetEncodeUomIdAsObject;
    }

    public void setTimesheetEncodeUomId(OdooId timesheetEncodeUomId) {
        this.timesheetEncodeUomId = timesheetEncodeUomId;
    }

    public void setExpenseCurrencyExchangeAccountIdAsObject(Account expenseCurrencyExchangeAccountIdAsObject) {
        this.expenseCurrencyExchangeAccountIdAsObject = expenseCurrencyExchangeAccountIdAsObject;
    }

    public void setExpenseCurrencyExchangeAccountId(OdooId expenseCurrencyExchangeAccountId) {
        this.expenseCurrencyExchangeAccountId = expenseCurrencyExchangeAccountId;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setAccountOpeningJournalIdAsObject(AccountJournal accountOpeningJournalIdAsObject) {
        this.accountOpeningJournalIdAsObject = accountOpeningJournalIdAsObject;
    }

    public void setAccountOpeningJournalId(OdooId accountOpeningJournalId) {
        this.accountOpeningJournalId = accountOpeningJournalId;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setAccountEnabledTaxCountryIdsAsList(List<ResCountry> accountEnabledTaxCountryIdsAsList) {
        this.accountEnabledTaxCountryIdsAsList = accountEnabledTaxCountryIdsAsList;
    }

    public void setAccountEnabledTaxCountryIds(List<Integer> accountEnabledTaxCountryIds) {
        this.accountEnabledTaxCountryIds = accountEnabledTaxCountryIds;
    }

    public void setAccountDefaultPosReceivableAccountIdAsObject(Account accountDefaultPosReceivableAccountIdAsObject) {
        this.accountDefaultPosReceivableAccountIdAsObject = accountDefaultPosReceivableAccountIdAsObject;
    }

    public void setAccountDefaultPosReceivableAccountId(OdooId accountDefaultPosReceivableAccountId) {
        this.accountDefaultPosReceivableAccountId = accountDefaultPosReceivableAccountId;
    }

    public void setCompanyDetails(Object companyDetails) {
        this.companyDetails = companyDetails;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}