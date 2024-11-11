
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

package ch.helvethink.odoo4java.test.ng.res.config;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.AccountIncoterms;
import ch.helvethink.odoo4java.test.ng.res.ResLang;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticPlan;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.test.ng.digest.Digest;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.crm.lead.scoring.frequency.CrmLeadScoringFrequencyField;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;;

@OdooObject("res.config.settings")
public class ResConfigSettings implements OdooObj {

    
    private Date writeDate;

    
    private boolean isModuleAuthOauth;

    
    private boolean isIsAccountPeppolEligible;

    
    private boolean isModuleSalePdfQuoteBuilder;

    
    private List<ResLang> languageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private List<Integer> languageIds;

    
    private AccountJournal currencyExchangeJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId currencyExchangeJournalId;

    
    private boolean isGroupSalePricelist;

    
    private boolean isModuleAccountSepa;

    
    private boolean isModuleProductEmailTemplate;

    
    private Account incomeCurrencyExchangeAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId incomeCurrencyExchangeAccountId;

    
    private boolean isInvoiceIsSnailmail;

    
    private ResUsers authSignupTemplateUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId authSignupTemplateUserId;

    
    private boolean isReminderAllow;

    
    private String websiteHomepageUrl;

    
    private int overtimeEmployeeThreshold;

    
    private String websiteSlideGoogleAppKey;

    
    private boolean isModuleAccountBankStatementImportOfx;

    
    private Object companyInformations;

    
    private boolean isModuleWebsiteLivechat;

    
    private boolean isInvoicePolicy;

    
    private Object taxCalculationRoundingMethod;

    
    private Object timesheetEncodeMethod;

    
    private boolean isModuleHrPresence;

    
    private boolean isInvoiceIsDownload;

    
    private boolean isHrPresenceControlEmail;

    
    private boolean isModuleAccountBankStatementImportQif;

    
    private boolean isModuleBaseGeolocalize;

    
    private int languageCount;

    
    private Product depositDefaultProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId depositDefaultProductId;

    
    private boolean isModuleWebsiteCrmIapReveal;

    
    private boolean isModuleHrRecruitmentExtract;

    
    private String emailPrimaryColor;

    
    private int contractExpirationNoticePeriod;

    
    private boolean isGroupProjectStages;

    
    private boolean isModuleWebsiteSlidesSurvey;

    
    private String companyName;

    
    private boolean isModuleDeliveryFedex;

    
    private boolean isModuleProductImages;

    
    private boolean isModuleCurrencyRateLive;

    
    private Object socialDefaultImage;

    
    private Object predictiveLeadScoringStartDate;

    
    private boolean isPortalConfirmationPay;

    
    private int attendanceKioskDelay;

    
    private boolean isModuleHrPayrollExpense;

    
    private Object attendanceBarcodeSource;

    
    private String hrPresenceControlIpList;

    
    private boolean isModuleDeliveryUps;

    
    private boolean isModuleGoogleCalendar;

    
    private boolean isHrPresenceControlIp;

    
    private boolean isGroupWarningAccount;

    
    private boolean isModuleAccountReports;

    
    private String sfuServerKey;

    
    private Object defaultInvoicePolicy;

    
    private boolean isModuleMailPlugin;

    
    private Account accountJournalSuspenseAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalSuspenseAccountId;

    
    private boolean isPayInvoicesOnline;

    
    private boolean isIsStripeSupportedCountry;

    
    private boolean isHasGoogleSearchConsole;

    
    private boolean isModuleAccountTaxcloud;

    
    private boolean isInvoiceIsEmail;

    
    private String plausibleSite;

    
    private boolean isExternalEmailServerDefault;

    
    private boolean isGroupApplicantCvDisplay;

    
    private Object accountDefaultCreditLimit;

    
    private String googleSearchConsole;

    
    private boolean isModuleAccountInterCompanyRules;

    
    private int overtimeCompanyThreshold;

    
    private boolean isPreviewReady;

    
    private Object saleHeader;

    
    private String saleHeaderName;

    
    private boolean isUserDefaultRights;

    
    private Account accountCashBasisBaseAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountCashBasisBaseAccountId;

    
    private boolean isModuleGoogleRecaptcha;

    
    private boolean isHrAttendanceOvertime;

    
    private Account accountJournalEarlyPayDiscountLossAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalEarlyPayDiscountLossAccountId;

    
    private String googleAnalyticsKey;

    
    private boolean isGroupShowPurchaseReceipts;

    
    private boolean isModuleDelivery;

    
    private int websiteLanguageCount;

    
    private double prepaymentPercent;

    
    private boolean isInvoiceIsUblCii;

    
    private boolean isModuleAuthLdap;

    
    private ResLang websiteDefaultLangIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private OdooId websiteDefaultLangId;

    
    private boolean isModuleWebsiteSlidesForum;

    
    private boolean isModuleMarketingAutomation;

    
    private boolean isShowEffect;

    
    private String websiteDefaultLangCode;

    
    private String hrExpenseAliasPrefix;

    
    private boolean isPortalAllowApiKeys;

    
    private boolean isModuleAccountBankStatementImportCsv;

    
    private String webAppName;

    
    private boolean isRestrictTemplateRendering;

    
    private boolean isModuleAccountAccountant;

    
    private int quotationValidityDays;

    
    private boolean isModuleProjectTimesheetHolidays;

    
    private Object reportFooter;

    
    private Object attendanceKioskMode;

    
    private boolean isModuleSaleLoyalty;

    
    private boolean isTaxExigibility;

    
    private Object termsType;

    
    private String countryCode;

    
    private Object invoiceTermsHtml;

    
    private Object crmAutoAssignmentAction;

    
    private boolean isGroupStockPackaging;

    
    private boolean isSnailmailCover;

    
    private boolean isModuleHrAttendance;

    
    private Account accountJournalPaymentDebitAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalPaymentDebitAccountId;

    
    private boolean isModuleAccountAvatax;

    
    private boolean isGroupShowSaleReceipts;

    
    private boolean isReminderUserAllow;

    
    private boolean isHasChartOfAccounts;

    
    private boolean isAccountStorno;

    
    private boolean isModuleProductMargin;

    
    private boolean isGroupMultiCurrency;

    
    private String emailSecondaryColor;

    
    private boolean isModuleAccountBudget;

    
    private boolean isModuleDeliveryBpost;

    
    private Object websiteLogo;

    
    private boolean isHasAccountingEntries;

    
    private boolean isAccountUseCreditLimit;

    
    private boolean isQrCode;

    
    private String predictiveLeadScoringFieldLabels;

    
    private boolean isLeadMiningInPipeline;

    
    private MailTemplate invoiceMailTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId invoiceMailTemplateId;

    
    private Project internalProjectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId internalProjectId;

    
    private boolean isHrAttendanceDisplayOvertime;

    
    private String recaptchaPublicKey;

    
    private boolean isSharedUserAccount;

    
    private Object productPricelistSetting;

    
    private boolean isGroupUseRecurringRevenues;

    
    private String saleFooterName;

    
    private String attendanceKioskUrl;

    
    private boolean isSnailmailColor;

    
    private Digest digestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.digest.Digest")
        @OdooModel("digest.Digest")
    
    private OdooId digestId;

    
    private String googleGmailClientIdentifier;

    
    private boolean isGroupUom;

    
    private boolean isModuleAccountBankStatementImportCamt;

    
    private boolean isAuthSignupResetPassword;

    
    private Object productVolumeVolumeInCubicFeet;

    
    private int tenorGifLimit;

    
    private boolean isModuleWebUnsplash;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private String googleTranslateApiKey;

    
    private boolean isModuleHrSkills;

    
    private boolean isGroupProductPricelist;

    
    private String plausibleSharedKey;

    
    private String twilioAccountToken;

    
    private boolean isHrExpenseUseMailgateway;

    
    private Object invoiceTerms;

    
    private String websiteDomain;

    
    private AccountTax saleTaxIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId saleTaxId;

    
    private boolean isGroupUseLead;

    
    private String predictiveLeadScoringStartDateStr;

    
    private Account accountDiscountIncomeAllocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountDiscountIncomeAllocationId;

    
    private AccountAnalyticPlan analyticPlanIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticPlan")
        @OdooModel("account.analytic.AccountAnalyticPlan")
    
    private OdooId analyticPlanId;

    
    private int hrPresenceControlEmailAmount;

    
    private boolean isSnailmailDuplex;

    
    private AccountJournal expenseJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId expenseJournalId;

    
    private int id;

    
    private boolean isPartnerAutocompleteInsufficientCredit;

    
    private Date profilingEnabledUntil;

    
    private boolean isHasGoogleAnalytics;

    
    private boolean isModuleAccountIntrastat;

    
    private boolean isModuleSaleMargin;

    
    private boolean isModuleHrRecruitmentSurvey;

    
    private Uom projectTimeModeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId projectTimeModeId;

    
    private boolean isGroupSaleOrderTemplate;

    
    private boolean isPortalConfirmationSign;

    
    private boolean isModuleMassMailingSlides;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object crmAutoAssignmentIntervalType;

    
    private boolean isModulePartnerAutocomplete;

    
    private boolean isModuleSaleAmazon;

    
    private String calMicrosoftClientId;

    
    private int workPermitExpirationNoticePeriod;

    
    private boolean isUseInvoiceTerms;

    
    private ResCompany websiteCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId websiteCompanyId;

    
    private String predictiveLeadScoringFieldsStr;

    
    private String unsplashAccessKey;

    
    private String sfuServerUrl;

    
    private Account accountJournalPaymentCreditAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalPaymentCreditAccountId;

    
    private boolean isGroupAnalyticAccounting;

    
    private boolean isModuleAccountPayment;

    
    private boolean isIsEncodeUomDays;

    
    private String twilioAccountSid;

    
    private boolean isUseTwilioRtcServers;

    
    private boolean isAutomaticInvoice;

    
    private boolean isModuleHrExpenseExtract;

    
    private List<AccountPaymentMethodLine> companyExpenseAllowedPaymentMethodLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
    
    private List<Integer> companyExpenseAllowedPaymentMethodLineIds;

    
    private boolean isModuleMicrosoftCalendar;

    
    private String companyCountryCode;

    
    private boolean isGroupProductVariant;

    
    private boolean isHasPlausibleSharedKey;

    
    private boolean isModuleVoip;

    
    private boolean isModuleDeliveryShiprocket;

    
    private String calMicrosoftClientSecret;

    
    private boolean isModuleGoogleGmail;

    
    private Object productWeightInLbs;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isModuleLoyalty;

    
    private boolean isModuleSaleProductMatrix;

    
    private boolean isModuleCrmIapEnrich;

    
    private SaleOrderTemplate companySoTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate")
        @OdooModel("sale.order.SaleOrderTemplate")
    
    private OdooId companySoTemplateId;

    
    private boolean isDisplayInvoiceAmountTotalWords;

    
    private boolean isModuleAccountCheckPrinting;

    
    private ResCountry accountFiscalCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId accountFiscalCountryId;

    
    private String googleGmailClientSecret;

    
    private boolean isGroupCashRounding;

    
    private boolean isGroupProjectRating;

    
    private boolean isModuleAccountBatchPayment;

    
    private boolean isWebsiteCookiesBar;

    
    private boolean isModuleDeliveryUsps;

    
    private boolean isAttendanceKioskUsePin;

    
    private boolean isModuleBaseImport;

    
    private ProjectTask leaveTimesheetTaskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId leaveTimesheetTaskId;

    
    private boolean isIsRootCompany;

    
    private Object leadEnrichAuto;

    
    private AccountTax purchaseTaxIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId purchaseTaxId;

    
    private boolean isModuleWebsiteHrRecruitment;

    
    private boolean isModuleDeliveryEasypost;

    
    private int activeUserCount;

    
    private Object saleFooter;

    
    private boolean isGroupProjectMilestone;

    
    private List<CrmLeadScoringFrequencyField> predictiveLeadScoringFieldsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.lead.scoring.frequency.CrmLeadScoringFrequencyField")
        @OdooModel("crm.lead.scoring.frequency.CrmLeadScoringFrequencyField")
    
    private List<Integer> predictiveLeadScoringFields;

    
    private boolean isGroupWarningSale;

    
    private boolean isModuleL10nEuOss;

    
    private Product expenseProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId expenseProductId;

    
    private Account accountJournalEarlyPayDiscountGainAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountJournalEarlyPayDiscountGainAccountId;

    
    private Date createDate;

    
    private double recaptchaMinScore;

    
    private Date crmAutoAssignmentRunDatetime;

    
    private boolean isGroupAutoDoneSetting;

    
    private boolean isCrmUseAutoAssignment;

    
    private Object quickEditMode;

    
    private boolean isHasDefaultShareImage;

    
    private Object overtimeStartDate;

    
    private boolean isHrEmployeeSelfEdit;

    
    private String displayName;

    
    private Account transferAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId transferAccountId;

    
    private boolean isGroupMultiWebsite;

    
    private String websiteName;

    
    private int crmAutoAssignmentIntervalNumber;

    
    private int companyCount;

    
    private Object chartTemplate;

    
    private String cdnUrl;

    
    private boolean isModuleHrTimesheet;

    
    private boolean isGroupProjectRecurringTasks;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private boolean isModuleDeliveryDhl;

    
    private Object cdnFilters;

    
    private boolean isGroupDiscountPerSoLine;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object authSignupUninvited;

    
    private boolean isGroupProjectTaskDependencies;

    
    private IrUiView externalReportLayoutIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId externalReportLayoutId;

    
    private AccountIncoterms incotermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountIncoterms")
        @OdooModel("account.AccountIncoterms")
    
    private OdooId incotermId;

    
    private AccountJournal taxCashBasisJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId taxCashBasisJournalId;

    
    private int failCounter;

    
    private Account accountDiscountExpenseAllocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountDiscountExpenseAllocationId;

    
    private String recaptchaPrivateKey;

    
    private String tenorApiKey;

    
    private boolean isModuleAccountInvoiceExtract;

    
    private boolean isHrPresenceControlLogin;

    
    private boolean isModuleAccountSepaDirectDebit;

    
    private boolean isModuleCrmIapMine;

    
    private boolean isModuleAccountPeppol;

    
    private boolean isModuleHrHomeworking;

    
    private boolean isModuleDeliverySendcloud;

    
    private boolean isAttendanceFromSystray;

    
    private String unsplashAppId;

    
    private boolean isIsMembershipMulti;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private boolean isCalMicrosoftSyncPaused;

    
    private Object favicon;

    
    private boolean isModuleSnailmailAccount;

    
    private boolean isModuleMicrosoftOutlook;

    
    private boolean isGroupProformaSales;

    
    private boolean isGroupSaleDeliveryAddress;

    
    private Object tenorContentFilter;

    
    private Account expenseCurrencyExchangeAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId expenseCurrencyExchangeAccountId;

    
    private boolean isDigestEmails;

    
    private boolean isModuleWebsiteSaleSlides;

    
    private String firstProviderLabel;

    
    private boolean isModuleWebsiteCfTurnstile;

    
    private boolean isCdnActivated;

    
    private Object providersState;


    public ResConfigSettings() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsModuleAuthOauth() {
        return isModuleAuthOauth;
    }

    public boolean getIsIsAccountPeppolEligible() {
        return isIsAccountPeppolEligible;
    }

    public boolean getIsModuleSalePdfQuoteBuilder() {
        return isModuleSalePdfQuoteBuilder;
    }

    public List<ResLang> getLanguageIdsAsList() {
        return languageIdsAsList;
    }

    public List<Integer> getLanguageIds() {
        return languageIds;
    }

    public AccountJournal getCurrencyExchangeJournalIdAsObject() {
        return currencyExchangeJournalIdAsObject;
    }

    public OdooId getCurrencyExchangeJournalId() {
        return currencyExchangeJournalId;
    }

    public boolean getIsGroupSalePricelist() {
        return isGroupSalePricelist;
    }

    public boolean getIsModuleAccountSepa() {
        return isModuleAccountSepa;
    }

    public boolean getIsModuleProductEmailTemplate() {
        return isModuleProductEmailTemplate;
    }

    public Account getIncomeCurrencyExchangeAccountIdAsObject() {
        return incomeCurrencyExchangeAccountIdAsObject;
    }

    public OdooId getIncomeCurrencyExchangeAccountId() {
        return incomeCurrencyExchangeAccountId;
    }

    public boolean getIsInvoiceIsSnailmail() {
        return isInvoiceIsSnailmail;
    }

    public ResUsers getAuthSignupTemplateUserIdAsObject() {
        return authSignupTemplateUserIdAsObject;
    }

    public OdooId getAuthSignupTemplateUserId() {
        return authSignupTemplateUserId;
    }

    public boolean getIsReminderAllow() {
        return isReminderAllow;
    }

    public String getWebsiteHomepageUrl() {
        return websiteHomepageUrl;
    }

    public int getOvertimeEmployeeThreshold() {
        return overtimeEmployeeThreshold;
    }

    public String getWebsiteSlideGoogleAppKey() {
        return websiteSlideGoogleAppKey;
    }

    public boolean getIsModuleAccountBankStatementImportOfx() {
        return isModuleAccountBankStatementImportOfx;
    }

    public Object getCompanyInformations() {
        return companyInformations;
    }

    public boolean getIsModuleWebsiteLivechat() {
        return isModuleWebsiteLivechat;
    }

    public boolean getIsInvoicePolicy() {
        return isInvoicePolicy;
    }

    public Object getTaxCalculationRoundingMethod() {
        return taxCalculationRoundingMethod;
    }

    public Object getTimesheetEncodeMethod() {
        return timesheetEncodeMethod;
    }

    public boolean getIsModuleHrPresence() {
        return isModuleHrPresence;
    }

    public boolean getIsInvoiceIsDownload() {
        return isInvoiceIsDownload;
    }

    public boolean getIsHrPresenceControlEmail() {
        return isHrPresenceControlEmail;
    }

    public boolean getIsModuleAccountBankStatementImportQif() {
        return isModuleAccountBankStatementImportQif;
    }

    public boolean getIsModuleBaseGeolocalize() {
        return isModuleBaseGeolocalize;
    }

    public int getLanguageCount() {
        return languageCount;
    }

    public Product getDepositDefaultProductIdAsObject() {
        return depositDefaultProductIdAsObject;
    }

    public OdooId getDepositDefaultProductId() {
        return depositDefaultProductId;
    }

    public boolean getIsModuleWebsiteCrmIapReveal() {
        return isModuleWebsiteCrmIapReveal;
    }

    public boolean getIsModuleHrRecruitmentExtract() {
        return isModuleHrRecruitmentExtract;
    }

    public String getEmailPrimaryColor() {
        return emailPrimaryColor;
    }

    public int getContractExpirationNoticePeriod() {
        return contractExpirationNoticePeriod;
    }

    public boolean getIsGroupProjectStages() {
        return isGroupProjectStages;
    }

    public boolean getIsModuleWebsiteSlidesSurvey() {
        return isModuleWebsiteSlidesSurvey;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean getIsModuleDeliveryFedex() {
        return isModuleDeliveryFedex;
    }

    public boolean getIsModuleProductImages() {
        return isModuleProductImages;
    }

    public boolean getIsModuleCurrencyRateLive() {
        return isModuleCurrencyRateLive;
    }

    public Object getSocialDefaultImage() {
        return socialDefaultImage;
    }

    public Object getPredictiveLeadScoringStartDate() {
        return predictiveLeadScoringStartDate;
    }

    public boolean getIsPortalConfirmationPay() {
        return isPortalConfirmationPay;
    }

    public int getAttendanceKioskDelay() {
        return attendanceKioskDelay;
    }

    public boolean getIsModuleHrPayrollExpense() {
        return isModuleHrPayrollExpense;
    }

    public Object getAttendanceBarcodeSource() {
        return attendanceBarcodeSource;
    }

    public String getHrPresenceControlIpList() {
        return hrPresenceControlIpList;
    }

    public boolean getIsModuleDeliveryUps() {
        return isModuleDeliveryUps;
    }

    public boolean getIsModuleGoogleCalendar() {
        return isModuleGoogleCalendar;
    }

    public boolean getIsHrPresenceControlIp() {
        return isHrPresenceControlIp;
    }

    public boolean getIsGroupWarningAccount() {
        return isGroupWarningAccount;
    }

    public boolean getIsModuleAccountReports() {
        return isModuleAccountReports;
    }

    public String getSfuServerKey() {
        return sfuServerKey;
    }

    public Object getDefaultInvoicePolicy() {
        return defaultInvoicePolicy;
    }

    public boolean getIsModuleMailPlugin() {
        return isModuleMailPlugin;
    }

    public Account getAccountJournalSuspenseAccountIdAsObject() {
        return accountJournalSuspenseAccountIdAsObject;
    }

    public OdooId getAccountJournalSuspenseAccountId() {
        return accountJournalSuspenseAccountId;
    }

    public boolean getIsPayInvoicesOnline() {
        return isPayInvoicesOnline;
    }

    public boolean getIsIsStripeSupportedCountry() {
        return isIsStripeSupportedCountry;
    }

    public boolean getIsHasGoogleSearchConsole() {
        return isHasGoogleSearchConsole;
    }

    public boolean getIsModuleAccountTaxcloud() {
        return isModuleAccountTaxcloud;
    }

    public boolean getIsInvoiceIsEmail() {
        return isInvoiceIsEmail;
    }

    public String getPlausibleSite() {
        return plausibleSite;
    }

    public boolean getIsExternalEmailServerDefault() {
        return isExternalEmailServerDefault;
    }

    public boolean getIsGroupApplicantCvDisplay() {
        return isGroupApplicantCvDisplay;
    }

    public Object getAccountDefaultCreditLimit() {
        return accountDefaultCreditLimit;
    }

    public String getGoogleSearchConsole() {
        return googleSearchConsole;
    }

    public boolean getIsModuleAccountInterCompanyRules() {
        return isModuleAccountInterCompanyRules;
    }

    public int getOvertimeCompanyThreshold() {
        return overtimeCompanyThreshold;
    }

    public boolean getIsPreviewReady() {
        return isPreviewReady;
    }

    public Object getSaleHeader() {
        return saleHeader;
    }

    public String getSaleHeaderName() {
        return saleHeaderName;
    }

    public boolean getIsUserDefaultRights() {
        return isUserDefaultRights;
    }

    public Account getAccountCashBasisBaseAccountIdAsObject() {
        return accountCashBasisBaseAccountIdAsObject;
    }

    public OdooId getAccountCashBasisBaseAccountId() {
        return accountCashBasisBaseAccountId;
    }

    public boolean getIsModuleGoogleRecaptcha() {
        return isModuleGoogleRecaptcha;
    }

    public boolean getIsHrAttendanceOvertime() {
        return isHrAttendanceOvertime;
    }

    public Account getAccountJournalEarlyPayDiscountLossAccountIdAsObject() {
        return accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountLossAccountId() {
        return accountJournalEarlyPayDiscountLossAccountId;
    }

    public String getGoogleAnalyticsKey() {
        return googleAnalyticsKey;
    }

    public boolean getIsGroupShowPurchaseReceipts() {
        return isGroupShowPurchaseReceipts;
    }

    public boolean getIsModuleDelivery() {
        return isModuleDelivery;
    }

    public int getWebsiteLanguageCount() {
        return websiteLanguageCount;
    }

    public double getPrepaymentPercent() {
        return prepaymentPercent;
    }

    public boolean getIsInvoiceIsUblCii() {
        return isInvoiceIsUblCii;
    }

    public boolean getIsModuleAuthLdap() {
        return isModuleAuthLdap;
    }

    public ResLang getWebsiteDefaultLangIdAsObject() {
        return websiteDefaultLangIdAsObject;
    }

    public OdooId getWebsiteDefaultLangId() {
        return websiteDefaultLangId;
    }

    public boolean getIsModuleWebsiteSlidesForum() {
        return isModuleWebsiteSlidesForum;
    }

    public boolean getIsModuleMarketingAutomation() {
        return isModuleMarketingAutomation;
    }

    public boolean getIsShowEffect() {
        return isShowEffect;
    }

    public String getWebsiteDefaultLangCode() {
        return websiteDefaultLangCode;
    }

    public String getHrExpenseAliasPrefix() {
        return hrExpenseAliasPrefix;
    }

    public boolean getIsPortalAllowApiKeys() {
        return isPortalAllowApiKeys;
    }

    public boolean getIsModuleAccountBankStatementImportCsv() {
        return isModuleAccountBankStatementImportCsv;
    }

    public String getWebAppName() {
        return webAppName;
    }

    public boolean getIsRestrictTemplateRendering() {
        return isRestrictTemplateRendering;
    }

    public boolean getIsModuleAccountAccountant() {
        return isModuleAccountAccountant;
    }

    public int getQuotationValidityDays() {
        return quotationValidityDays;
    }

    public boolean getIsModuleProjectTimesheetHolidays() {
        return isModuleProjectTimesheetHolidays;
    }

    public Object getReportFooter() {
        return reportFooter;
    }

    public Object getAttendanceKioskMode() {
        return attendanceKioskMode;
    }

    public boolean getIsModuleSaleLoyalty() {
        return isModuleSaleLoyalty;
    }

    public boolean getIsTaxExigibility() {
        return isTaxExigibility;
    }

    public Object getTermsType() {
        return termsType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Object getInvoiceTermsHtml() {
        return invoiceTermsHtml;
    }

    public Object getCrmAutoAssignmentAction() {
        return crmAutoAssignmentAction;
    }

    public boolean getIsGroupStockPackaging() {
        return isGroupStockPackaging;
    }

    public boolean getIsSnailmailCover() {
        return isSnailmailCover;
    }

    public boolean getIsModuleHrAttendance() {
        return isModuleHrAttendance;
    }

    public Account getAccountJournalPaymentDebitAccountIdAsObject() {
        return accountJournalPaymentDebitAccountIdAsObject;
    }

    public OdooId getAccountJournalPaymentDebitAccountId() {
        return accountJournalPaymentDebitAccountId;
    }

    public boolean getIsModuleAccountAvatax() {
        return isModuleAccountAvatax;
    }

    public boolean getIsGroupShowSaleReceipts() {
        return isGroupShowSaleReceipts;
    }

    public boolean getIsReminderUserAllow() {
        return isReminderUserAllow;
    }

    public boolean getIsHasChartOfAccounts() {
        return isHasChartOfAccounts;
    }

    public boolean getIsAccountStorno() {
        return isAccountStorno;
    }

    public boolean getIsModuleProductMargin() {
        return isModuleProductMargin;
    }

    public boolean getIsGroupMultiCurrency() {
        return isGroupMultiCurrency;
    }

    public String getEmailSecondaryColor() {
        return emailSecondaryColor;
    }

    public boolean getIsModuleAccountBudget() {
        return isModuleAccountBudget;
    }

    public boolean getIsModuleDeliveryBpost() {
        return isModuleDeliveryBpost;
    }

    public Object getWebsiteLogo() {
        return websiteLogo;
    }

    public boolean getIsHasAccountingEntries() {
        return isHasAccountingEntries;
    }

    public boolean getIsAccountUseCreditLimit() {
        return isAccountUseCreditLimit;
    }

    public boolean getIsQrCode() {
        return isQrCode;
    }

    public String getPredictiveLeadScoringFieldLabels() {
        return predictiveLeadScoringFieldLabels;
    }

    public boolean getIsLeadMiningInPipeline() {
        return isLeadMiningInPipeline;
    }

    public MailTemplate getInvoiceMailTemplateIdAsObject() {
        return invoiceMailTemplateIdAsObject;
    }

    public OdooId getInvoiceMailTemplateId() {
        return invoiceMailTemplateId;
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

    public String getRecaptchaPublicKey() {
        return recaptchaPublicKey;
    }

    public boolean getIsSharedUserAccount() {
        return isSharedUserAccount;
    }

    public Object getProductPricelistSetting() {
        return productPricelistSetting;
    }

    public boolean getIsGroupUseRecurringRevenues() {
        return isGroupUseRecurringRevenues;
    }

    public String getSaleFooterName() {
        return saleFooterName;
    }

    public String getAttendanceKioskUrl() {
        return attendanceKioskUrl;
    }

    public boolean getIsSnailmailColor() {
        return isSnailmailColor;
    }

    public Digest getDigestIdAsObject() {
        return digestIdAsObject;
    }

    public OdooId getDigestId() {
        return digestId;
    }

    public String getGoogleGmailClientIdentifier() {
        return googleGmailClientIdentifier;
    }

    public boolean getIsGroupUom() {
        return isGroupUom;
    }

    public boolean getIsModuleAccountBankStatementImportCamt() {
        return isModuleAccountBankStatementImportCamt;
    }

    public boolean getIsAuthSignupResetPassword() {
        return isAuthSignupResetPassword;
    }

    public Object getProductVolumeVolumeInCubicFeet() {
        return productVolumeVolumeInCubicFeet;
    }

    public int getTenorGifLimit() {
        return tenorGifLimit;
    }

    public boolean getIsModuleWebUnsplash() {
        return isModuleWebUnsplash;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public String getGoogleTranslateApiKey() {
        return googleTranslateApiKey;
    }

    public boolean getIsModuleHrSkills() {
        return isModuleHrSkills;
    }

    public boolean getIsGroupProductPricelist() {
        return isGroupProductPricelist;
    }

    public String getPlausibleSharedKey() {
        return plausibleSharedKey;
    }

    public String getTwilioAccountToken() {
        return twilioAccountToken;
    }

    public boolean getIsHrExpenseUseMailgateway() {
        return isHrExpenseUseMailgateway;
    }

    public Object getInvoiceTerms() {
        return invoiceTerms;
    }

    public String getWebsiteDomain() {
        return websiteDomain;
    }

    public AccountTax getSaleTaxIdAsObject() {
        return saleTaxIdAsObject;
    }

    public OdooId getSaleTaxId() {
        return saleTaxId;
    }

    public boolean getIsGroupUseLead() {
        return isGroupUseLead;
    }

    public String getPredictiveLeadScoringStartDateStr() {
        return predictiveLeadScoringStartDateStr;
    }

    public Account getAccountDiscountIncomeAllocationIdAsObject() {
        return accountDiscountIncomeAllocationIdAsObject;
    }

    public OdooId getAccountDiscountIncomeAllocationId() {
        return accountDiscountIncomeAllocationId;
    }

    public AccountAnalyticPlan getAnalyticPlanIdAsObject() {
        return analyticPlanIdAsObject;
    }

    public OdooId getAnalyticPlanId() {
        return analyticPlanId;
    }

    public int getHrPresenceControlEmailAmount() {
        return hrPresenceControlEmailAmount;
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

    public int getId() {
        return id;
    }

    public boolean getIsPartnerAutocompleteInsufficientCredit() {
        return isPartnerAutocompleteInsufficientCredit;
    }

    public Date getProfilingEnabledUntil() {
        return profilingEnabledUntil;
    }

    public boolean getIsHasGoogleAnalytics() {
        return isHasGoogleAnalytics;
    }

    public boolean getIsModuleAccountIntrastat() {
        return isModuleAccountIntrastat;
    }

    public boolean getIsModuleSaleMargin() {
        return isModuleSaleMargin;
    }

    public boolean getIsModuleHrRecruitmentSurvey() {
        return isModuleHrRecruitmentSurvey;
    }

    public Uom getProjectTimeModeIdAsObject() {
        return projectTimeModeIdAsObject;
    }

    public OdooId getProjectTimeModeId() {
        return projectTimeModeId;
    }

    public boolean getIsGroupSaleOrderTemplate() {
        return isGroupSaleOrderTemplate;
    }

    public boolean getIsPortalConfirmationSign() {
        return isPortalConfirmationSign;
    }

    public boolean getIsModuleMassMailingSlides() {
        return isModuleMassMailingSlides;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public Object getCrmAutoAssignmentIntervalType() {
        return crmAutoAssignmentIntervalType;
    }

    public boolean getIsModulePartnerAutocomplete() {
        return isModulePartnerAutocomplete;
    }

    public boolean getIsModuleSaleAmazon() {
        return isModuleSaleAmazon;
    }

    public String getCalMicrosoftClientId() {
        return calMicrosoftClientId;
    }

    public int getWorkPermitExpirationNoticePeriod() {
        return workPermitExpirationNoticePeriod;
    }

    public boolean getIsUseInvoiceTerms() {
        return isUseInvoiceTerms;
    }

    public ResCompany getWebsiteCompanyIdAsObject() {
        return websiteCompanyIdAsObject;
    }

    public OdooId getWebsiteCompanyId() {
        return websiteCompanyId;
    }

    public String getPredictiveLeadScoringFieldsStr() {
        return predictiveLeadScoringFieldsStr;
    }

    public String getUnsplashAccessKey() {
        return unsplashAccessKey;
    }

    public String getSfuServerUrl() {
        return sfuServerUrl;
    }

    public Account getAccountJournalPaymentCreditAccountIdAsObject() {
        return accountJournalPaymentCreditAccountIdAsObject;
    }

    public OdooId getAccountJournalPaymentCreditAccountId() {
        return accountJournalPaymentCreditAccountId;
    }

    public boolean getIsGroupAnalyticAccounting() {
        return isGroupAnalyticAccounting;
    }

    public boolean getIsModuleAccountPayment() {
        return isModuleAccountPayment;
    }

    public boolean getIsIsEncodeUomDays() {
        return isIsEncodeUomDays;
    }

    public String getTwilioAccountSid() {
        return twilioAccountSid;
    }

    public boolean getIsUseTwilioRtcServers() {
        return isUseTwilioRtcServers;
    }

    public boolean getIsAutomaticInvoice() {
        return isAutomaticInvoice;
    }

    public boolean getIsModuleHrExpenseExtract() {
        return isModuleHrExpenseExtract;
    }

    public List<AccountPaymentMethodLine> getCompanyExpenseAllowedPaymentMethodLineIdsAsList() {
        return companyExpenseAllowedPaymentMethodLineIdsAsList;
    }

    public List<Integer> getCompanyExpenseAllowedPaymentMethodLineIds() {
        return companyExpenseAllowedPaymentMethodLineIds;
    }

    public boolean getIsModuleMicrosoftCalendar() {
        return isModuleMicrosoftCalendar;
    }

    public String getCompanyCountryCode() {
        return companyCountryCode;
    }

    public boolean getIsGroupProductVariant() {
        return isGroupProductVariant;
    }

    public boolean getIsHasPlausibleSharedKey() {
        return isHasPlausibleSharedKey;
    }

    public boolean getIsModuleVoip() {
        return isModuleVoip;
    }

    public boolean getIsModuleDeliveryShiprocket() {
        return isModuleDeliveryShiprocket;
    }

    public String getCalMicrosoftClientSecret() {
        return calMicrosoftClientSecret;
    }

    public boolean getIsModuleGoogleGmail() {
        return isModuleGoogleGmail;
    }

    public Object getProductWeightInLbs() {
        return productWeightInLbs;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsModuleLoyalty() {
        return isModuleLoyalty;
    }

    public boolean getIsModuleSaleProductMatrix() {
        return isModuleSaleProductMatrix;
    }

    public boolean getIsModuleCrmIapEnrich() {
        return isModuleCrmIapEnrich;
    }

    public SaleOrderTemplate getCompanySoTemplateIdAsObject() {
        return companySoTemplateIdAsObject;
    }

    public OdooId getCompanySoTemplateId() {
        return companySoTemplateId;
    }

    public boolean getIsDisplayInvoiceAmountTotalWords() {
        return isDisplayInvoiceAmountTotalWords;
    }

    public boolean getIsModuleAccountCheckPrinting() {
        return isModuleAccountCheckPrinting;
    }

    public ResCountry getAccountFiscalCountryIdAsObject() {
        return accountFiscalCountryIdAsObject;
    }

    public OdooId getAccountFiscalCountryId() {
        return accountFiscalCountryId;
    }

    public String getGoogleGmailClientSecret() {
        return googleGmailClientSecret;
    }

    public boolean getIsGroupCashRounding() {
        return isGroupCashRounding;
    }

    public boolean getIsGroupProjectRating() {
        return isGroupProjectRating;
    }

    public boolean getIsModuleAccountBatchPayment() {
        return isModuleAccountBatchPayment;
    }

    public boolean getIsWebsiteCookiesBar() {
        return isWebsiteCookiesBar;
    }

    public boolean getIsModuleDeliveryUsps() {
        return isModuleDeliveryUsps;
    }

    public boolean getIsAttendanceKioskUsePin() {
        return isAttendanceKioskUsePin;
    }

    public boolean getIsModuleBaseImport() {
        return isModuleBaseImport;
    }

    public ProjectTask getLeaveTimesheetTaskIdAsObject() {
        return leaveTimesheetTaskIdAsObject;
    }

    public OdooId getLeaveTimesheetTaskId() {
        return leaveTimesheetTaskId;
    }

    public boolean getIsIsRootCompany() {
        return isIsRootCompany;
    }

    public Object getLeadEnrichAuto() {
        return leadEnrichAuto;
    }

    public AccountTax getPurchaseTaxIdAsObject() {
        return purchaseTaxIdAsObject;
    }

    public OdooId getPurchaseTaxId() {
        return purchaseTaxId;
    }

    public boolean getIsModuleWebsiteHrRecruitment() {
        return isModuleWebsiteHrRecruitment;
    }

    public boolean getIsModuleDeliveryEasypost() {
        return isModuleDeliveryEasypost;
    }

    public int getActiveUserCount() {
        return activeUserCount;
    }

    public Object getSaleFooter() {
        return saleFooter;
    }

    public boolean getIsGroupProjectMilestone() {
        return isGroupProjectMilestone;
    }

    public List<CrmLeadScoringFrequencyField> getPredictiveLeadScoringFieldsAsList() {
        return predictiveLeadScoringFieldsAsList;
    }

    public List<Integer> getPredictiveLeadScoringFields() {
        return predictiveLeadScoringFields;
    }

    public boolean getIsGroupWarningSale() {
        return isGroupWarningSale;
    }

    public boolean getIsModuleL10nEuOss() {
        return isModuleL10nEuOss;
    }

    public Product getExpenseProductIdAsObject() {
        return expenseProductIdAsObject;
    }

    public OdooId getExpenseProductId() {
        return expenseProductId;
    }

    public Account getAccountJournalEarlyPayDiscountGainAccountIdAsObject() {
        return accountJournalEarlyPayDiscountGainAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountGainAccountId() {
        return accountJournalEarlyPayDiscountGainAccountId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getRecaptchaMinScore() {
        return recaptchaMinScore;
    }

    public Date getCrmAutoAssignmentRunDatetime() {
        return crmAutoAssignmentRunDatetime;
    }

    public boolean getIsGroupAutoDoneSetting() {
        return isGroupAutoDoneSetting;
    }

    public boolean getIsCrmUseAutoAssignment() {
        return isCrmUseAutoAssignment;
    }

    public Object getQuickEditMode() {
        return quickEditMode;
    }

    public boolean getIsHasDefaultShareImage() {
        return isHasDefaultShareImage;
    }

    public Object getOvertimeStartDate() {
        return overtimeStartDate;
    }

    public boolean getIsHrEmployeeSelfEdit() {
        return isHrEmployeeSelfEdit;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Account getTransferAccountIdAsObject() {
        return transferAccountIdAsObject;
    }

    public OdooId getTransferAccountId() {
        return transferAccountId;
    }

    public boolean getIsGroupMultiWebsite() {
        return isGroupMultiWebsite;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public int getCrmAutoAssignmentIntervalNumber() {
        return crmAutoAssignmentIntervalNumber;
    }

    public int getCompanyCount() {
        return companyCount;
    }

    public Object getChartTemplate() {
        return chartTemplate;
    }

    public String getCdnUrl() {
        return cdnUrl;
    }

    public boolean getIsModuleHrTimesheet() {
        return isModuleHrTimesheet;
    }

    public boolean getIsGroupProjectRecurringTasks() {
        return isGroupProjectRecurringTasks;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public boolean getIsModuleDeliveryDhl() {
        return isModuleDeliveryDhl;
    }

    public Object getCdnFilters() {
        return cdnFilters;
    }

    public boolean getIsGroupDiscountPerSoLine() {
        return isGroupDiscountPerSoLine;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getAuthSignupUninvited() {
        return authSignupUninvited;
    }

    public boolean getIsGroupProjectTaskDependencies() {
        return isGroupProjectTaskDependencies;
    }

    public IrUiView getExternalReportLayoutIdAsObject() {
        return externalReportLayoutIdAsObject;
    }

    public OdooId getExternalReportLayoutId() {
        return externalReportLayoutId;
    }

    public AccountIncoterms getIncotermIdAsObject() {
        return incotermIdAsObject;
    }

    public OdooId getIncotermId() {
        return incotermId;
    }

    public AccountJournal getTaxCashBasisJournalIdAsObject() {
        return taxCashBasisJournalIdAsObject;
    }

    public OdooId getTaxCashBasisJournalId() {
        return taxCashBasisJournalId;
    }

    public int getFailCounter() {
        return failCounter;
    }

    public Account getAccountDiscountExpenseAllocationIdAsObject() {
        return accountDiscountExpenseAllocationIdAsObject;
    }

    public OdooId getAccountDiscountExpenseAllocationId() {
        return accountDiscountExpenseAllocationId;
    }

    public String getRecaptchaPrivateKey() {
        return recaptchaPrivateKey;
    }

    public String getTenorApiKey() {
        return tenorApiKey;
    }

    public boolean getIsModuleAccountInvoiceExtract() {
        return isModuleAccountInvoiceExtract;
    }

    public boolean getIsHrPresenceControlLogin() {
        return isHrPresenceControlLogin;
    }

    public boolean getIsModuleAccountSepaDirectDebit() {
        return isModuleAccountSepaDirectDebit;
    }

    public boolean getIsModuleCrmIapMine() {
        return isModuleCrmIapMine;
    }

    public boolean getIsModuleAccountPeppol() {
        return isModuleAccountPeppol;
    }

    public boolean getIsModuleHrHomeworking() {
        return isModuleHrHomeworking;
    }

    public boolean getIsModuleDeliverySendcloud() {
        return isModuleDeliverySendcloud;
    }

    public boolean getIsAttendanceFromSystray() {
        return isAttendanceFromSystray;
    }

    public String getUnsplashAppId() {
        return unsplashAppId;
    }

    public boolean getIsIsMembershipMulti() {
        return isIsMembershipMulti;
    }

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
    }

    public boolean getIsCalMicrosoftSyncPaused() {
        return isCalMicrosoftSyncPaused;
    }

    public Object getFavicon() {
        return favicon;
    }

    public boolean getIsModuleSnailmailAccount() {
        return isModuleSnailmailAccount;
    }

    public boolean getIsModuleMicrosoftOutlook() {
        return isModuleMicrosoftOutlook;
    }

    public boolean getIsGroupProformaSales() {
        return isGroupProformaSales;
    }

    public boolean getIsGroupSaleDeliveryAddress() {
        return isGroupSaleDeliveryAddress;
    }

    public Object getTenorContentFilter() {
        return tenorContentFilter;
    }

    public Account getExpenseCurrencyExchangeAccountIdAsObject() {
        return expenseCurrencyExchangeAccountIdAsObject;
    }

    public OdooId getExpenseCurrencyExchangeAccountId() {
        return expenseCurrencyExchangeAccountId;
    }

    public boolean getIsDigestEmails() {
        return isDigestEmails;
    }

    public boolean getIsModuleWebsiteSaleSlides() {
        return isModuleWebsiteSaleSlides;
    }

    public String getFirstProviderLabel() {
        return firstProviderLabel;
    }

    public boolean getIsModuleWebsiteCfTurnstile() {
        return isModuleWebsiteCfTurnstile;
    }

    public boolean getIsCdnActivated() {
        return isCdnActivated;
    }

    public Object getProvidersState() {
        return providersState;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsModuleAuthOauth(boolean isModuleAuthOauth) {
        this.isModuleAuthOauth = isModuleAuthOauth;
    }

    public void setIsIsAccountPeppolEligible(boolean isIsAccountPeppolEligible) {
        this.isIsAccountPeppolEligible = isIsAccountPeppolEligible;
    }

    public void setIsModuleSalePdfQuoteBuilder(boolean isModuleSalePdfQuoteBuilder) {
        this.isModuleSalePdfQuoteBuilder = isModuleSalePdfQuoteBuilder;
    }

    public void setLanguageIdsAsList(List<ResLang> languageIdsAsList) {
        this.languageIdsAsList = languageIdsAsList;
    }

    public void setLanguageIds(List<Integer> languageIds) {
        this.languageIds = languageIds;
    }

    public void setCurrencyExchangeJournalIdAsObject(AccountJournal currencyExchangeJournalIdAsObject) {
        this.currencyExchangeJournalIdAsObject = currencyExchangeJournalIdAsObject;
    }

    public void setCurrencyExchangeJournalId(OdooId currencyExchangeJournalId) {
        this.currencyExchangeJournalId = currencyExchangeJournalId;
    }

    public void setIsGroupSalePricelist(boolean isGroupSalePricelist) {
        this.isGroupSalePricelist = isGroupSalePricelist;
    }

    public void setIsModuleAccountSepa(boolean isModuleAccountSepa) {
        this.isModuleAccountSepa = isModuleAccountSepa;
    }

    public void setIsModuleProductEmailTemplate(boolean isModuleProductEmailTemplate) {
        this.isModuleProductEmailTemplate = isModuleProductEmailTemplate;
    }

    public void setIncomeCurrencyExchangeAccountIdAsObject(Account incomeCurrencyExchangeAccountIdAsObject) {
        this.incomeCurrencyExchangeAccountIdAsObject = incomeCurrencyExchangeAccountIdAsObject;
    }

    public void setIncomeCurrencyExchangeAccountId(OdooId incomeCurrencyExchangeAccountId) {
        this.incomeCurrencyExchangeAccountId = incomeCurrencyExchangeAccountId;
    }

    public void setIsInvoiceIsSnailmail(boolean isInvoiceIsSnailmail) {
        this.isInvoiceIsSnailmail = isInvoiceIsSnailmail;
    }

    public void setAuthSignupTemplateUserIdAsObject(ResUsers authSignupTemplateUserIdAsObject) {
        this.authSignupTemplateUserIdAsObject = authSignupTemplateUserIdAsObject;
    }

    public void setAuthSignupTemplateUserId(OdooId authSignupTemplateUserId) {
        this.authSignupTemplateUserId = authSignupTemplateUserId;
    }

    public void setIsReminderAllow(boolean isReminderAllow) {
        this.isReminderAllow = isReminderAllow;
    }

    public void setWebsiteHomepageUrl(String websiteHomepageUrl) {
        this.websiteHomepageUrl = websiteHomepageUrl;
    }

    public void setOvertimeEmployeeThreshold(int overtimeEmployeeThreshold) {
        this.overtimeEmployeeThreshold = overtimeEmployeeThreshold;
    }

    public void setWebsiteSlideGoogleAppKey(String websiteSlideGoogleAppKey) {
        this.websiteSlideGoogleAppKey = websiteSlideGoogleAppKey;
    }

    public void setIsModuleAccountBankStatementImportOfx(boolean isModuleAccountBankStatementImportOfx) {
        this.isModuleAccountBankStatementImportOfx = isModuleAccountBankStatementImportOfx;
    }

    public void setCompanyInformations(Object companyInformations) {
        this.companyInformations = companyInformations;
    }

    public void setIsModuleWebsiteLivechat(boolean isModuleWebsiteLivechat) {
        this.isModuleWebsiteLivechat = isModuleWebsiteLivechat;
    }

    public void setIsInvoicePolicy(boolean isInvoicePolicy) {
        this.isInvoicePolicy = isInvoicePolicy;
    }

    public void setTaxCalculationRoundingMethod(Object taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod;
    }

    public void setTimesheetEncodeMethod(Object timesheetEncodeMethod) {
        this.timesheetEncodeMethod = timesheetEncodeMethod;
    }

    public void setIsModuleHrPresence(boolean isModuleHrPresence) {
        this.isModuleHrPresence = isModuleHrPresence;
    }

    public void setIsInvoiceIsDownload(boolean isInvoiceIsDownload) {
        this.isInvoiceIsDownload = isInvoiceIsDownload;
    }

    public void setIsHrPresenceControlEmail(boolean isHrPresenceControlEmail) {
        this.isHrPresenceControlEmail = isHrPresenceControlEmail;
    }

    public void setIsModuleAccountBankStatementImportQif(boolean isModuleAccountBankStatementImportQif) {
        this.isModuleAccountBankStatementImportQif = isModuleAccountBankStatementImportQif;
    }

    public void setIsModuleBaseGeolocalize(boolean isModuleBaseGeolocalize) {
        this.isModuleBaseGeolocalize = isModuleBaseGeolocalize;
    }

    public void setLanguageCount(int languageCount) {
        this.languageCount = languageCount;
    }

    public void setDepositDefaultProductIdAsObject(Product depositDefaultProductIdAsObject) {
        this.depositDefaultProductIdAsObject = depositDefaultProductIdAsObject;
    }

    public void setDepositDefaultProductId(OdooId depositDefaultProductId) {
        this.depositDefaultProductId = depositDefaultProductId;
    }

    public void setIsModuleWebsiteCrmIapReveal(boolean isModuleWebsiteCrmIapReveal) {
        this.isModuleWebsiteCrmIapReveal = isModuleWebsiteCrmIapReveal;
    }

    public void setIsModuleHrRecruitmentExtract(boolean isModuleHrRecruitmentExtract) {
        this.isModuleHrRecruitmentExtract = isModuleHrRecruitmentExtract;
    }

    public void setEmailPrimaryColor(String emailPrimaryColor) {
        this.emailPrimaryColor = emailPrimaryColor;
    }

    public void setContractExpirationNoticePeriod(int contractExpirationNoticePeriod) {
        this.contractExpirationNoticePeriod = contractExpirationNoticePeriod;
    }

    public void setIsGroupProjectStages(boolean isGroupProjectStages) {
        this.isGroupProjectStages = isGroupProjectStages;
    }

    public void setIsModuleWebsiteSlidesSurvey(boolean isModuleWebsiteSlidesSurvey) {
        this.isModuleWebsiteSlidesSurvey = isModuleWebsiteSlidesSurvey;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setIsModuleDeliveryFedex(boolean isModuleDeliveryFedex) {
        this.isModuleDeliveryFedex = isModuleDeliveryFedex;
    }

    public void setIsModuleProductImages(boolean isModuleProductImages) {
        this.isModuleProductImages = isModuleProductImages;
    }

    public void setIsModuleCurrencyRateLive(boolean isModuleCurrencyRateLive) {
        this.isModuleCurrencyRateLive = isModuleCurrencyRateLive;
    }

    public void setSocialDefaultImage(Object socialDefaultImage) {
        this.socialDefaultImage = socialDefaultImage;
    }

    public void setPredictiveLeadScoringStartDate(Object predictiveLeadScoringStartDate) {
        this.predictiveLeadScoringStartDate = predictiveLeadScoringStartDate;
    }

    public void setIsPortalConfirmationPay(boolean isPortalConfirmationPay) {
        this.isPortalConfirmationPay = isPortalConfirmationPay;
    }

    public void setAttendanceKioskDelay(int attendanceKioskDelay) {
        this.attendanceKioskDelay = attendanceKioskDelay;
    }

    public void setIsModuleHrPayrollExpense(boolean isModuleHrPayrollExpense) {
        this.isModuleHrPayrollExpense = isModuleHrPayrollExpense;
    }

    public void setAttendanceBarcodeSource(Object attendanceBarcodeSource) {
        this.attendanceBarcodeSource = attendanceBarcodeSource;
    }

    public void setHrPresenceControlIpList(String hrPresenceControlIpList) {
        this.hrPresenceControlIpList = hrPresenceControlIpList;
    }

    public void setIsModuleDeliveryUps(boolean isModuleDeliveryUps) {
        this.isModuleDeliveryUps = isModuleDeliveryUps;
    }

    public void setIsModuleGoogleCalendar(boolean isModuleGoogleCalendar) {
        this.isModuleGoogleCalendar = isModuleGoogleCalendar;
    }

    public void setIsHrPresenceControlIp(boolean isHrPresenceControlIp) {
        this.isHrPresenceControlIp = isHrPresenceControlIp;
    }

    public void setIsGroupWarningAccount(boolean isGroupWarningAccount) {
        this.isGroupWarningAccount = isGroupWarningAccount;
    }

    public void setIsModuleAccountReports(boolean isModuleAccountReports) {
        this.isModuleAccountReports = isModuleAccountReports;
    }

    public void setSfuServerKey(String sfuServerKey) {
        this.sfuServerKey = sfuServerKey;
    }

    public void setDefaultInvoicePolicy(Object defaultInvoicePolicy) {
        this.defaultInvoicePolicy = defaultInvoicePolicy;
    }

    public void setIsModuleMailPlugin(boolean isModuleMailPlugin) {
        this.isModuleMailPlugin = isModuleMailPlugin;
    }

    public void setAccountJournalSuspenseAccountIdAsObject(Account accountJournalSuspenseAccountIdAsObject) {
        this.accountJournalSuspenseAccountIdAsObject = accountJournalSuspenseAccountIdAsObject;
    }

    public void setAccountJournalSuspenseAccountId(OdooId accountJournalSuspenseAccountId) {
        this.accountJournalSuspenseAccountId = accountJournalSuspenseAccountId;
    }

    public void setIsPayInvoicesOnline(boolean isPayInvoicesOnline) {
        this.isPayInvoicesOnline = isPayInvoicesOnline;
    }

    public void setIsIsStripeSupportedCountry(boolean isIsStripeSupportedCountry) {
        this.isIsStripeSupportedCountry = isIsStripeSupportedCountry;
    }

    public void setIsHasGoogleSearchConsole(boolean isHasGoogleSearchConsole) {
        this.isHasGoogleSearchConsole = isHasGoogleSearchConsole;
    }

    public void setIsModuleAccountTaxcloud(boolean isModuleAccountTaxcloud) {
        this.isModuleAccountTaxcloud = isModuleAccountTaxcloud;
    }

    public void setIsInvoiceIsEmail(boolean isInvoiceIsEmail) {
        this.isInvoiceIsEmail = isInvoiceIsEmail;
    }

    public void setPlausibleSite(String plausibleSite) {
        this.plausibleSite = plausibleSite;
    }

    public void setIsExternalEmailServerDefault(boolean isExternalEmailServerDefault) {
        this.isExternalEmailServerDefault = isExternalEmailServerDefault;
    }

    public void setIsGroupApplicantCvDisplay(boolean isGroupApplicantCvDisplay) {
        this.isGroupApplicantCvDisplay = isGroupApplicantCvDisplay;
    }

    public void setAccountDefaultCreditLimit(Object accountDefaultCreditLimit) {
        this.accountDefaultCreditLimit = accountDefaultCreditLimit;
    }

    public void setGoogleSearchConsole(String googleSearchConsole) {
        this.googleSearchConsole = googleSearchConsole;
    }

    public void setIsModuleAccountInterCompanyRules(boolean isModuleAccountInterCompanyRules) {
        this.isModuleAccountInterCompanyRules = isModuleAccountInterCompanyRules;
    }

    public void setOvertimeCompanyThreshold(int overtimeCompanyThreshold) {
        this.overtimeCompanyThreshold = overtimeCompanyThreshold;
    }

    public void setIsPreviewReady(boolean isPreviewReady) {
        this.isPreviewReady = isPreviewReady;
    }

    public void setSaleHeader(Object saleHeader) {
        this.saleHeader = saleHeader;
    }

    public void setSaleHeaderName(String saleHeaderName) {
        this.saleHeaderName = saleHeaderName;
    }

    public void setIsUserDefaultRights(boolean isUserDefaultRights) {
        this.isUserDefaultRights = isUserDefaultRights;
    }

    public void setAccountCashBasisBaseAccountIdAsObject(Account accountCashBasisBaseAccountIdAsObject) {
        this.accountCashBasisBaseAccountIdAsObject = accountCashBasisBaseAccountIdAsObject;
    }

    public void setAccountCashBasisBaseAccountId(OdooId accountCashBasisBaseAccountId) {
        this.accountCashBasisBaseAccountId = accountCashBasisBaseAccountId;
    }

    public void setIsModuleGoogleRecaptcha(boolean isModuleGoogleRecaptcha) {
        this.isModuleGoogleRecaptcha = isModuleGoogleRecaptcha;
    }

    public void setIsHrAttendanceOvertime(boolean isHrAttendanceOvertime) {
        this.isHrAttendanceOvertime = isHrAttendanceOvertime;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountIdAsObject(Account accountJournalEarlyPayDiscountLossAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountLossAccountIdAsObject = accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountId(OdooId accountJournalEarlyPayDiscountLossAccountId) {
        this.accountJournalEarlyPayDiscountLossAccountId = accountJournalEarlyPayDiscountLossAccountId;
    }

    public void setGoogleAnalyticsKey(String googleAnalyticsKey) {
        this.googleAnalyticsKey = googleAnalyticsKey;
    }

    public void setIsGroupShowPurchaseReceipts(boolean isGroupShowPurchaseReceipts) {
        this.isGroupShowPurchaseReceipts = isGroupShowPurchaseReceipts;
    }

    public void setIsModuleDelivery(boolean isModuleDelivery) {
        this.isModuleDelivery = isModuleDelivery;
    }

    public void setWebsiteLanguageCount(int websiteLanguageCount) {
        this.websiteLanguageCount = websiteLanguageCount;
    }

    public void setPrepaymentPercent(double prepaymentPercent) {
        this.prepaymentPercent = prepaymentPercent;
    }

    public void setIsInvoiceIsUblCii(boolean isInvoiceIsUblCii) {
        this.isInvoiceIsUblCii = isInvoiceIsUblCii;
    }

    public void setIsModuleAuthLdap(boolean isModuleAuthLdap) {
        this.isModuleAuthLdap = isModuleAuthLdap;
    }

    public void setWebsiteDefaultLangIdAsObject(ResLang websiteDefaultLangIdAsObject) {
        this.websiteDefaultLangIdAsObject = websiteDefaultLangIdAsObject;
    }

    public void setWebsiteDefaultLangId(OdooId websiteDefaultLangId) {
        this.websiteDefaultLangId = websiteDefaultLangId;
    }

    public void setIsModuleWebsiteSlidesForum(boolean isModuleWebsiteSlidesForum) {
        this.isModuleWebsiteSlidesForum = isModuleWebsiteSlidesForum;
    }

    public void setIsModuleMarketingAutomation(boolean isModuleMarketingAutomation) {
        this.isModuleMarketingAutomation = isModuleMarketingAutomation;
    }

    public void setIsShowEffect(boolean isShowEffect) {
        this.isShowEffect = isShowEffect;
    }

    public void setWebsiteDefaultLangCode(String websiteDefaultLangCode) {
        this.websiteDefaultLangCode = websiteDefaultLangCode;
    }

    public void setHrExpenseAliasPrefix(String hrExpenseAliasPrefix) {
        this.hrExpenseAliasPrefix = hrExpenseAliasPrefix;
    }

    public void setIsPortalAllowApiKeys(boolean isPortalAllowApiKeys) {
        this.isPortalAllowApiKeys = isPortalAllowApiKeys;
    }

    public void setIsModuleAccountBankStatementImportCsv(boolean isModuleAccountBankStatementImportCsv) {
        this.isModuleAccountBankStatementImportCsv = isModuleAccountBankStatementImportCsv;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public void setIsRestrictTemplateRendering(boolean isRestrictTemplateRendering) {
        this.isRestrictTemplateRendering = isRestrictTemplateRendering;
    }

    public void setIsModuleAccountAccountant(boolean isModuleAccountAccountant) {
        this.isModuleAccountAccountant = isModuleAccountAccountant;
    }

    public void setQuotationValidityDays(int quotationValidityDays) {
        this.quotationValidityDays = quotationValidityDays;
    }

    public void setIsModuleProjectTimesheetHolidays(boolean isModuleProjectTimesheetHolidays) {
        this.isModuleProjectTimesheetHolidays = isModuleProjectTimesheetHolidays;
    }

    public void setReportFooter(Object reportFooter) {
        this.reportFooter = reportFooter;
    }

    public void setAttendanceKioskMode(Object attendanceKioskMode) {
        this.attendanceKioskMode = attendanceKioskMode;
    }

    public void setIsModuleSaleLoyalty(boolean isModuleSaleLoyalty) {
        this.isModuleSaleLoyalty = isModuleSaleLoyalty;
    }

    public void setIsTaxExigibility(boolean isTaxExigibility) {
        this.isTaxExigibility = isTaxExigibility;
    }

    public void setTermsType(Object termsType) {
        this.termsType = termsType;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setInvoiceTermsHtml(Object invoiceTermsHtml) {
        this.invoiceTermsHtml = invoiceTermsHtml;
    }

    public void setCrmAutoAssignmentAction(Object crmAutoAssignmentAction) {
        this.crmAutoAssignmentAction = crmAutoAssignmentAction;
    }

    public void setIsGroupStockPackaging(boolean isGroupStockPackaging) {
        this.isGroupStockPackaging = isGroupStockPackaging;
    }

    public void setIsSnailmailCover(boolean isSnailmailCover) {
        this.isSnailmailCover = isSnailmailCover;
    }

    public void setIsModuleHrAttendance(boolean isModuleHrAttendance) {
        this.isModuleHrAttendance = isModuleHrAttendance;
    }

    public void setAccountJournalPaymentDebitAccountIdAsObject(Account accountJournalPaymentDebitAccountIdAsObject) {
        this.accountJournalPaymentDebitAccountIdAsObject = accountJournalPaymentDebitAccountIdAsObject;
    }

    public void setAccountJournalPaymentDebitAccountId(OdooId accountJournalPaymentDebitAccountId) {
        this.accountJournalPaymentDebitAccountId = accountJournalPaymentDebitAccountId;
    }

    public void setIsModuleAccountAvatax(boolean isModuleAccountAvatax) {
        this.isModuleAccountAvatax = isModuleAccountAvatax;
    }

    public void setIsGroupShowSaleReceipts(boolean isGroupShowSaleReceipts) {
        this.isGroupShowSaleReceipts = isGroupShowSaleReceipts;
    }

    public void setIsReminderUserAllow(boolean isReminderUserAllow) {
        this.isReminderUserAllow = isReminderUserAllow;
    }

    public void setIsHasChartOfAccounts(boolean isHasChartOfAccounts) {
        this.isHasChartOfAccounts = isHasChartOfAccounts;
    }

    public void setIsAccountStorno(boolean isAccountStorno) {
        this.isAccountStorno = isAccountStorno;
    }

    public void setIsModuleProductMargin(boolean isModuleProductMargin) {
        this.isModuleProductMargin = isModuleProductMargin;
    }

    public void setIsGroupMultiCurrency(boolean isGroupMultiCurrency) {
        this.isGroupMultiCurrency = isGroupMultiCurrency;
    }

    public void setEmailSecondaryColor(String emailSecondaryColor) {
        this.emailSecondaryColor = emailSecondaryColor;
    }

    public void setIsModuleAccountBudget(boolean isModuleAccountBudget) {
        this.isModuleAccountBudget = isModuleAccountBudget;
    }

    public void setIsModuleDeliveryBpost(boolean isModuleDeliveryBpost) {
        this.isModuleDeliveryBpost = isModuleDeliveryBpost;
    }

    public void setWebsiteLogo(Object websiteLogo) {
        this.websiteLogo = websiteLogo;
    }

    public void setIsHasAccountingEntries(boolean isHasAccountingEntries) {
        this.isHasAccountingEntries = isHasAccountingEntries;
    }

    public void setIsAccountUseCreditLimit(boolean isAccountUseCreditLimit) {
        this.isAccountUseCreditLimit = isAccountUseCreditLimit;
    }

    public void setIsQrCode(boolean isQrCode) {
        this.isQrCode = isQrCode;
    }

    public void setPredictiveLeadScoringFieldLabels(String predictiveLeadScoringFieldLabels) {
        this.predictiveLeadScoringFieldLabels = predictiveLeadScoringFieldLabels;
    }

    public void setIsLeadMiningInPipeline(boolean isLeadMiningInPipeline) {
        this.isLeadMiningInPipeline = isLeadMiningInPipeline;
    }

    public void setInvoiceMailTemplateIdAsObject(MailTemplate invoiceMailTemplateIdAsObject) {
        this.invoiceMailTemplateIdAsObject = invoiceMailTemplateIdAsObject;
    }

    public void setInvoiceMailTemplateId(OdooId invoiceMailTemplateId) {
        this.invoiceMailTemplateId = invoiceMailTemplateId;
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

    public void setRecaptchaPublicKey(String recaptchaPublicKey) {
        this.recaptchaPublicKey = recaptchaPublicKey;
    }

    public void setIsSharedUserAccount(boolean isSharedUserAccount) {
        this.isSharedUserAccount = isSharedUserAccount;
    }

    public void setProductPricelistSetting(Object productPricelistSetting) {
        this.productPricelistSetting = productPricelistSetting;
    }

    public void setIsGroupUseRecurringRevenues(boolean isGroupUseRecurringRevenues) {
        this.isGroupUseRecurringRevenues = isGroupUseRecurringRevenues;
    }

    public void setSaleFooterName(String saleFooterName) {
        this.saleFooterName = saleFooterName;
    }

    public void setAttendanceKioskUrl(String attendanceKioskUrl) {
        this.attendanceKioskUrl = attendanceKioskUrl;
    }

    public void setIsSnailmailColor(boolean isSnailmailColor) {
        this.isSnailmailColor = isSnailmailColor;
    }

    public void setDigestIdAsObject(Digest digestIdAsObject) {
        this.digestIdAsObject = digestIdAsObject;
    }

    public void setDigestId(OdooId digestId) {
        this.digestId = digestId;
    }

    public void setGoogleGmailClientIdentifier(String googleGmailClientIdentifier) {
        this.googleGmailClientIdentifier = googleGmailClientIdentifier;
    }

    public void setIsGroupUom(boolean isGroupUom) {
        this.isGroupUom = isGroupUom;
    }

    public void setIsModuleAccountBankStatementImportCamt(boolean isModuleAccountBankStatementImportCamt) {
        this.isModuleAccountBankStatementImportCamt = isModuleAccountBankStatementImportCamt;
    }

    public void setIsAuthSignupResetPassword(boolean isAuthSignupResetPassword) {
        this.isAuthSignupResetPassword = isAuthSignupResetPassword;
    }

    public void setProductVolumeVolumeInCubicFeet(Object productVolumeVolumeInCubicFeet) {
        this.productVolumeVolumeInCubicFeet = productVolumeVolumeInCubicFeet;
    }

    public void setTenorGifLimit(int tenorGifLimit) {
        this.tenorGifLimit = tenorGifLimit;
    }

    public void setIsModuleWebUnsplash(boolean isModuleWebUnsplash) {
        this.isModuleWebUnsplash = isModuleWebUnsplash;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setGoogleTranslateApiKey(String googleTranslateApiKey) {
        this.googleTranslateApiKey = googleTranslateApiKey;
    }

    public void setIsModuleHrSkills(boolean isModuleHrSkills) {
        this.isModuleHrSkills = isModuleHrSkills;
    }

    public void setIsGroupProductPricelist(boolean isGroupProductPricelist) {
        this.isGroupProductPricelist = isGroupProductPricelist;
    }

    public void setPlausibleSharedKey(String plausibleSharedKey) {
        this.plausibleSharedKey = plausibleSharedKey;
    }

    public void setTwilioAccountToken(String twilioAccountToken) {
        this.twilioAccountToken = twilioAccountToken;
    }

    public void setIsHrExpenseUseMailgateway(boolean isHrExpenseUseMailgateway) {
        this.isHrExpenseUseMailgateway = isHrExpenseUseMailgateway;
    }

    public void setInvoiceTerms(Object invoiceTerms) {
        this.invoiceTerms = invoiceTerms;
    }

    public void setWebsiteDomain(String websiteDomain) {
        this.websiteDomain = websiteDomain;
    }

    public void setSaleTaxIdAsObject(AccountTax saleTaxIdAsObject) {
        this.saleTaxIdAsObject = saleTaxIdAsObject;
    }

    public void setSaleTaxId(OdooId saleTaxId) {
        this.saleTaxId = saleTaxId;
    }

    public void setIsGroupUseLead(boolean isGroupUseLead) {
        this.isGroupUseLead = isGroupUseLead;
    }

    public void setPredictiveLeadScoringStartDateStr(String predictiveLeadScoringStartDateStr) {
        this.predictiveLeadScoringStartDateStr = predictiveLeadScoringStartDateStr;
    }

    public void setAccountDiscountIncomeAllocationIdAsObject(Account accountDiscountIncomeAllocationIdAsObject) {
        this.accountDiscountIncomeAllocationIdAsObject = accountDiscountIncomeAllocationIdAsObject;
    }

    public void setAccountDiscountIncomeAllocationId(OdooId accountDiscountIncomeAllocationId) {
        this.accountDiscountIncomeAllocationId = accountDiscountIncomeAllocationId;
    }

    public void setAnalyticPlanIdAsObject(AccountAnalyticPlan analyticPlanIdAsObject) {
        this.analyticPlanIdAsObject = analyticPlanIdAsObject;
    }

    public void setAnalyticPlanId(OdooId analyticPlanId) {
        this.analyticPlanId = analyticPlanId;
    }

    public void setHrPresenceControlEmailAmount(int hrPresenceControlEmailAmount) {
        this.hrPresenceControlEmailAmount = hrPresenceControlEmailAmount;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setIsPartnerAutocompleteInsufficientCredit(boolean isPartnerAutocompleteInsufficientCredit) {
        this.isPartnerAutocompleteInsufficientCredit = isPartnerAutocompleteInsufficientCredit;
    }

    public void setProfilingEnabledUntil(Date profilingEnabledUntil) {
        this.profilingEnabledUntil = profilingEnabledUntil;
    }

    public void setIsHasGoogleAnalytics(boolean isHasGoogleAnalytics) {
        this.isHasGoogleAnalytics = isHasGoogleAnalytics;
    }

    public void setIsModuleAccountIntrastat(boolean isModuleAccountIntrastat) {
        this.isModuleAccountIntrastat = isModuleAccountIntrastat;
    }

    public void setIsModuleSaleMargin(boolean isModuleSaleMargin) {
        this.isModuleSaleMargin = isModuleSaleMargin;
    }

    public void setIsModuleHrRecruitmentSurvey(boolean isModuleHrRecruitmentSurvey) {
        this.isModuleHrRecruitmentSurvey = isModuleHrRecruitmentSurvey;
    }

    public void setProjectTimeModeIdAsObject(Uom projectTimeModeIdAsObject) {
        this.projectTimeModeIdAsObject = projectTimeModeIdAsObject;
    }

    public void setProjectTimeModeId(OdooId projectTimeModeId) {
        this.projectTimeModeId = projectTimeModeId;
    }

    public void setIsGroupSaleOrderTemplate(boolean isGroupSaleOrderTemplate) {
        this.isGroupSaleOrderTemplate = isGroupSaleOrderTemplate;
    }

    public void setIsPortalConfirmationSign(boolean isPortalConfirmationSign) {
        this.isPortalConfirmationSign = isPortalConfirmationSign;
    }

    public void setIsModuleMassMailingSlides(boolean isModuleMassMailingSlides) {
        this.isModuleMassMailingSlides = isModuleMassMailingSlides;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setCrmAutoAssignmentIntervalType(Object crmAutoAssignmentIntervalType) {
        this.crmAutoAssignmentIntervalType = crmAutoAssignmentIntervalType;
    }

    public void setIsModulePartnerAutocomplete(boolean isModulePartnerAutocomplete) {
        this.isModulePartnerAutocomplete = isModulePartnerAutocomplete;
    }

    public void setIsModuleSaleAmazon(boolean isModuleSaleAmazon) {
        this.isModuleSaleAmazon = isModuleSaleAmazon;
    }

    public void setCalMicrosoftClientId(String calMicrosoftClientId) {
        this.calMicrosoftClientId = calMicrosoftClientId;
    }

    public void setWorkPermitExpirationNoticePeriod(int workPermitExpirationNoticePeriod) {
        this.workPermitExpirationNoticePeriod = workPermitExpirationNoticePeriod;
    }

    public void setIsUseInvoiceTerms(boolean isUseInvoiceTerms) {
        this.isUseInvoiceTerms = isUseInvoiceTerms;
    }

    public void setWebsiteCompanyIdAsObject(ResCompany websiteCompanyIdAsObject) {
        this.websiteCompanyIdAsObject = websiteCompanyIdAsObject;
    }

    public void setWebsiteCompanyId(OdooId websiteCompanyId) {
        this.websiteCompanyId = websiteCompanyId;
    }

    public void setPredictiveLeadScoringFieldsStr(String predictiveLeadScoringFieldsStr) {
        this.predictiveLeadScoringFieldsStr = predictiveLeadScoringFieldsStr;
    }

    public void setUnsplashAccessKey(String unsplashAccessKey) {
        this.unsplashAccessKey = unsplashAccessKey;
    }

    public void setSfuServerUrl(String sfuServerUrl) {
        this.sfuServerUrl = sfuServerUrl;
    }

    public void setAccountJournalPaymentCreditAccountIdAsObject(Account accountJournalPaymentCreditAccountIdAsObject) {
        this.accountJournalPaymentCreditAccountIdAsObject = accountJournalPaymentCreditAccountIdAsObject;
    }

    public void setAccountJournalPaymentCreditAccountId(OdooId accountJournalPaymentCreditAccountId) {
        this.accountJournalPaymentCreditAccountId = accountJournalPaymentCreditAccountId;
    }

    public void setIsGroupAnalyticAccounting(boolean isGroupAnalyticAccounting) {
        this.isGroupAnalyticAccounting = isGroupAnalyticAccounting;
    }

    public void setIsModuleAccountPayment(boolean isModuleAccountPayment) {
        this.isModuleAccountPayment = isModuleAccountPayment;
    }

    public void setIsIsEncodeUomDays(boolean isIsEncodeUomDays) {
        this.isIsEncodeUomDays = isIsEncodeUomDays;
    }

    public void setTwilioAccountSid(String twilioAccountSid) {
        this.twilioAccountSid = twilioAccountSid;
    }

    public void setIsUseTwilioRtcServers(boolean isUseTwilioRtcServers) {
        this.isUseTwilioRtcServers = isUseTwilioRtcServers;
    }

    public void setIsAutomaticInvoice(boolean isAutomaticInvoice) {
        this.isAutomaticInvoice = isAutomaticInvoice;
    }

    public void setIsModuleHrExpenseExtract(boolean isModuleHrExpenseExtract) {
        this.isModuleHrExpenseExtract = isModuleHrExpenseExtract;
    }

    public void setCompanyExpenseAllowedPaymentMethodLineIdsAsList(List<AccountPaymentMethodLine> companyExpenseAllowedPaymentMethodLineIdsAsList) {
        this.companyExpenseAllowedPaymentMethodLineIdsAsList = companyExpenseAllowedPaymentMethodLineIdsAsList;
    }

    public void setCompanyExpenseAllowedPaymentMethodLineIds(List<Integer> companyExpenseAllowedPaymentMethodLineIds) {
        this.companyExpenseAllowedPaymentMethodLineIds = companyExpenseAllowedPaymentMethodLineIds;
    }

    public void setIsModuleMicrosoftCalendar(boolean isModuleMicrosoftCalendar) {
        this.isModuleMicrosoftCalendar = isModuleMicrosoftCalendar;
    }

    public void setCompanyCountryCode(String companyCountryCode) {
        this.companyCountryCode = companyCountryCode;
    }

    public void setIsGroupProductVariant(boolean isGroupProductVariant) {
        this.isGroupProductVariant = isGroupProductVariant;
    }

    public void setIsHasPlausibleSharedKey(boolean isHasPlausibleSharedKey) {
        this.isHasPlausibleSharedKey = isHasPlausibleSharedKey;
    }

    public void setIsModuleVoip(boolean isModuleVoip) {
        this.isModuleVoip = isModuleVoip;
    }

    public void setIsModuleDeliveryShiprocket(boolean isModuleDeliveryShiprocket) {
        this.isModuleDeliveryShiprocket = isModuleDeliveryShiprocket;
    }

    public void setCalMicrosoftClientSecret(String calMicrosoftClientSecret) {
        this.calMicrosoftClientSecret = calMicrosoftClientSecret;
    }

    public void setIsModuleGoogleGmail(boolean isModuleGoogleGmail) {
        this.isModuleGoogleGmail = isModuleGoogleGmail;
    }

    public void setProductWeightInLbs(Object productWeightInLbs) {
        this.productWeightInLbs = productWeightInLbs;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsModuleLoyalty(boolean isModuleLoyalty) {
        this.isModuleLoyalty = isModuleLoyalty;
    }

    public void setIsModuleSaleProductMatrix(boolean isModuleSaleProductMatrix) {
        this.isModuleSaleProductMatrix = isModuleSaleProductMatrix;
    }

    public void setIsModuleCrmIapEnrich(boolean isModuleCrmIapEnrich) {
        this.isModuleCrmIapEnrich = isModuleCrmIapEnrich;
    }

    public void setCompanySoTemplateIdAsObject(SaleOrderTemplate companySoTemplateIdAsObject) {
        this.companySoTemplateIdAsObject = companySoTemplateIdAsObject;
    }

    public void setCompanySoTemplateId(OdooId companySoTemplateId) {
        this.companySoTemplateId = companySoTemplateId;
    }

    public void setIsDisplayInvoiceAmountTotalWords(boolean isDisplayInvoiceAmountTotalWords) {
        this.isDisplayInvoiceAmountTotalWords = isDisplayInvoiceAmountTotalWords;
    }

    public void setIsModuleAccountCheckPrinting(boolean isModuleAccountCheckPrinting) {
        this.isModuleAccountCheckPrinting = isModuleAccountCheckPrinting;
    }

    public void setAccountFiscalCountryIdAsObject(ResCountry accountFiscalCountryIdAsObject) {
        this.accountFiscalCountryIdAsObject = accountFiscalCountryIdAsObject;
    }

    public void setAccountFiscalCountryId(OdooId accountFiscalCountryId) {
        this.accountFiscalCountryId = accountFiscalCountryId;
    }

    public void setGoogleGmailClientSecret(String googleGmailClientSecret) {
        this.googleGmailClientSecret = googleGmailClientSecret;
    }

    public void setIsGroupCashRounding(boolean isGroupCashRounding) {
        this.isGroupCashRounding = isGroupCashRounding;
    }

    public void setIsGroupProjectRating(boolean isGroupProjectRating) {
        this.isGroupProjectRating = isGroupProjectRating;
    }

    public void setIsModuleAccountBatchPayment(boolean isModuleAccountBatchPayment) {
        this.isModuleAccountBatchPayment = isModuleAccountBatchPayment;
    }

    public void setIsWebsiteCookiesBar(boolean isWebsiteCookiesBar) {
        this.isWebsiteCookiesBar = isWebsiteCookiesBar;
    }

    public void setIsModuleDeliveryUsps(boolean isModuleDeliveryUsps) {
        this.isModuleDeliveryUsps = isModuleDeliveryUsps;
    }

    public void setIsAttendanceKioskUsePin(boolean isAttendanceKioskUsePin) {
        this.isAttendanceKioskUsePin = isAttendanceKioskUsePin;
    }

    public void setIsModuleBaseImport(boolean isModuleBaseImport) {
        this.isModuleBaseImport = isModuleBaseImport;
    }

    public void setLeaveTimesheetTaskIdAsObject(ProjectTask leaveTimesheetTaskIdAsObject) {
        this.leaveTimesheetTaskIdAsObject = leaveTimesheetTaskIdAsObject;
    }

    public void setLeaveTimesheetTaskId(OdooId leaveTimesheetTaskId) {
        this.leaveTimesheetTaskId = leaveTimesheetTaskId;
    }

    public void setIsIsRootCompany(boolean isIsRootCompany) {
        this.isIsRootCompany = isIsRootCompany;
    }

    public void setLeadEnrichAuto(Object leadEnrichAuto) {
        this.leadEnrichAuto = leadEnrichAuto;
    }

    public void setPurchaseTaxIdAsObject(AccountTax purchaseTaxIdAsObject) {
        this.purchaseTaxIdAsObject = purchaseTaxIdAsObject;
    }

    public void setPurchaseTaxId(OdooId purchaseTaxId) {
        this.purchaseTaxId = purchaseTaxId;
    }

    public void setIsModuleWebsiteHrRecruitment(boolean isModuleWebsiteHrRecruitment) {
        this.isModuleWebsiteHrRecruitment = isModuleWebsiteHrRecruitment;
    }

    public void setIsModuleDeliveryEasypost(boolean isModuleDeliveryEasypost) {
        this.isModuleDeliveryEasypost = isModuleDeliveryEasypost;
    }

    public void setActiveUserCount(int activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    public void setSaleFooter(Object saleFooter) {
        this.saleFooter = saleFooter;
    }

    public void setIsGroupProjectMilestone(boolean isGroupProjectMilestone) {
        this.isGroupProjectMilestone = isGroupProjectMilestone;
    }

    public void setPredictiveLeadScoringFieldsAsList(List<CrmLeadScoringFrequencyField> predictiveLeadScoringFieldsAsList) {
        this.predictiveLeadScoringFieldsAsList = predictiveLeadScoringFieldsAsList;
    }

    public void setPredictiveLeadScoringFields(List<Integer> predictiveLeadScoringFields) {
        this.predictiveLeadScoringFields = predictiveLeadScoringFields;
    }

    public void setIsGroupWarningSale(boolean isGroupWarningSale) {
        this.isGroupWarningSale = isGroupWarningSale;
    }

    public void setIsModuleL10nEuOss(boolean isModuleL10nEuOss) {
        this.isModuleL10nEuOss = isModuleL10nEuOss;
    }

    public void setExpenseProductIdAsObject(Product expenseProductIdAsObject) {
        this.expenseProductIdAsObject = expenseProductIdAsObject;
    }

    public void setExpenseProductId(OdooId expenseProductId) {
        this.expenseProductId = expenseProductId;
    }

    public void setAccountJournalEarlyPayDiscountGainAccountIdAsObject(Account accountJournalEarlyPayDiscountGainAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountGainAccountIdAsObject = accountJournalEarlyPayDiscountGainAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountGainAccountId(OdooId accountJournalEarlyPayDiscountGainAccountId) {
        this.accountJournalEarlyPayDiscountGainAccountId = accountJournalEarlyPayDiscountGainAccountId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRecaptchaMinScore(double recaptchaMinScore) {
        this.recaptchaMinScore = recaptchaMinScore;
    }

    public void setCrmAutoAssignmentRunDatetime(Date crmAutoAssignmentRunDatetime) {
        this.crmAutoAssignmentRunDatetime = crmAutoAssignmentRunDatetime;
    }

    public void setIsGroupAutoDoneSetting(boolean isGroupAutoDoneSetting) {
        this.isGroupAutoDoneSetting = isGroupAutoDoneSetting;
    }

    public void setIsCrmUseAutoAssignment(boolean isCrmUseAutoAssignment) {
        this.isCrmUseAutoAssignment = isCrmUseAutoAssignment;
    }

    public void setQuickEditMode(Object quickEditMode) {
        this.quickEditMode = quickEditMode;
    }

    public void setIsHasDefaultShareImage(boolean isHasDefaultShareImage) {
        this.isHasDefaultShareImage = isHasDefaultShareImage;
    }

    public void setOvertimeStartDate(Object overtimeStartDate) {
        this.overtimeStartDate = overtimeStartDate;
    }

    public void setIsHrEmployeeSelfEdit(boolean isHrEmployeeSelfEdit) {
        this.isHrEmployeeSelfEdit = isHrEmployeeSelfEdit;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setTransferAccountIdAsObject(Account transferAccountIdAsObject) {
        this.transferAccountIdAsObject = transferAccountIdAsObject;
    }

    public void setTransferAccountId(OdooId transferAccountId) {
        this.transferAccountId = transferAccountId;
    }

    public void setIsGroupMultiWebsite(boolean isGroupMultiWebsite) {
        this.isGroupMultiWebsite = isGroupMultiWebsite;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public void setCrmAutoAssignmentIntervalNumber(int crmAutoAssignmentIntervalNumber) {
        this.crmAutoAssignmentIntervalNumber = crmAutoAssignmentIntervalNumber;
    }

    public void setCompanyCount(int companyCount) {
        this.companyCount = companyCount;
    }

    public void setChartTemplate(Object chartTemplate) {
        this.chartTemplate = chartTemplate;
    }

    public void setCdnUrl(String cdnUrl) {
        this.cdnUrl = cdnUrl;
    }

    public void setIsModuleHrTimesheet(boolean isModuleHrTimesheet) {
        this.isModuleHrTimesheet = isModuleHrTimesheet;
    }

    public void setIsGroupProjectRecurringTasks(boolean isGroupProjectRecurringTasks) {
        this.isGroupProjectRecurringTasks = isGroupProjectRecurringTasks;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setIsModuleDeliveryDhl(boolean isModuleDeliveryDhl) {
        this.isModuleDeliveryDhl = isModuleDeliveryDhl;
    }

    public void setCdnFilters(Object cdnFilters) {
        this.cdnFilters = cdnFilters;
    }

    public void setIsGroupDiscountPerSoLine(boolean isGroupDiscountPerSoLine) {
        this.isGroupDiscountPerSoLine = isGroupDiscountPerSoLine;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setAuthSignupUninvited(Object authSignupUninvited) {
        this.authSignupUninvited = authSignupUninvited;
    }

    public void setIsGroupProjectTaskDependencies(boolean isGroupProjectTaskDependencies) {
        this.isGroupProjectTaskDependencies = isGroupProjectTaskDependencies;
    }

    public void setExternalReportLayoutIdAsObject(IrUiView externalReportLayoutIdAsObject) {
        this.externalReportLayoutIdAsObject = externalReportLayoutIdAsObject;
    }

    public void setExternalReportLayoutId(OdooId externalReportLayoutId) {
        this.externalReportLayoutId = externalReportLayoutId;
    }

    public void setIncotermIdAsObject(AccountIncoterms incotermIdAsObject) {
        this.incotermIdAsObject = incotermIdAsObject;
    }

    public void setIncotermId(OdooId incotermId) {
        this.incotermId = incotermId;
    }

    public void setTaxCashBasisJournalIdAsObject(AccountJournal taxCashBasisJournalIdAsObject) {
        this.taxCashBasisJournalIdAsObject = taxCashBasisJournalIdAsObject;
    }

    public void setTaxCashBasisJournalId(OdooId taxCashBasisJournalId) {
        this.taxCashBasisJournalId = taxCashBasisJournalId;
    }

    public void setFailCounter(int failCounter) {
        this.failCounter = failCounter;
    }

    public void setAccountDiscountExpenseAllocationIdAsObject(Account accountDiscountExpenseAllocationIdAsObject) {
        this.accountDiscountExpenseAllocationIdAsObject = accountDiscountExpenseAllocationIdAsObject;
    }

    public void setAccountDiscountExpenseAllocationId(OdooId accountDiscountExpenseAllocationId) {
        this.accountDiscountExpenseAllocationId = accountDiscountExpenseAllocationId;
    }

    public void setRecaptchaPrivateKey(String recaptchaPrivateKey) {
        this.recaptchaPrivateKey = recaptchaPrivateKey;
    }

    public void setTenorApiKey(String tenorApiKey) {
        this.tenorApiKey = tenorApiKey;
    }

    public void setIsModuleAccountInvoiceExtract(boolean isModuleAccountInvoiceExtract) {
        this.isModuleAccountInvoiceExtract = isModuleAccountInvoiceExtract;
    }

    public void setIsHrPresenceControlLogin(boolean isHrPresenceControlLogin) {
        this.isHrPresenceControlLogin = isHrPresenceControlLogin;
    }

    public void setIsModuleAccountSepaDirectDebit(boolean isModuleAccountSepaDirectDebit) {
        this.isModuleAccountSepaDirectDebit = isModuleAccountSepaDirectDebit;
    }

    public void setIsModuleCrmIapMine(boolean isModuleCrmIapMine) {
        this.isModuleCrmIapMine = isModuleCrmIapMine;
    }

    public void setIsModuleAccountPeppol(boolean isModuleAccountPeppol) {
        this.isModuleAccountPeppol = isModuleAccountPeppol;
    }

    public void setIsModuleHrHomeworking(boolean isModuleHrHomeworking) {
        this.isModuleHrHomeworking = isModuleHrHomeworking;
    }

    public void setIsModuleDeliverySendcloud(boolean isModuleDeliverySendcloud) {
        this.isModuleDeliverySendcloud = isModuleDeliverySendcloud;
    }

    public void setIsAttendanceFromSystray(boolean isAttendanceFromSystray) {
        this.isAttendanceFromSystray = isAttendanceFromSystray;
    }

    public void setUnsplashAppId(String unsplashAppId) {
        this.unsplashAppId = unsplashAppId;
    }

    public void setIsIsMembershipMulti(boolean isIsMembershipMulti) {
        this.isIsMembershipMulti = isIsMembershipMulti;
    }

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
    }

    public void setIsCalMicrosoftSyncPaused(boolean isCalMicrosoftSyncPaused) {
        this.isCalMicrosoftSyncPaused = isCalMicrosoftSyncPaused;
    }

    public void setFavicon(Object favicon) {
        this.favicon = favicon;
    }

    public void setIsModuleSnailmailAccount(boolean isModuleSnailmailAccount) {
        this.isModuleSnailmailAccount = isModuleSnailmailAccount;
    }

    public void setIsModuleMicrosoftOutlook(boolean isModuleMicrosoftOutlook) {
        this.isModuleMicrosoftOutlook = isModuleMicrosoftOutlook;
    }

    public void setIsGroupProformaSales(boolean isGroupProformaSales) {
        this.isGroupProformaSales = isGroupProformaSales;
    }

    public void setIsGroupSaleDeliveryAddress(boolean isGroupSaleDeliveryAddress) {
        this.isGroupSaleDeliveryAddress = isGroupSaleDeliveryAddress;
    }

    public void setTenorContentFilter(Object tenorContentFilter) {
        this.tenorContentFilter = tenorContentFilter;
    }

    public void setExpenseCurrencyExchangeAccountIdAsObject(Account expenseCurrencyExchangeAccountIdAsObject) {
        this.expenseCurrencyExchangeAccountIdAsObject = expenseCurrencyExchangeAccountIdAsObject;
    }

    public void setExpenseCurrencyExchangeAccountId(OdooId expenseCurrencyExchangeAccountId) {
        this.expenseCurrencyExchangeAccountId = expenseCurrencyExchangeAccountId;
    }

    public void setIsDigestEmails(boolean isDigestEmails) {
        this.isDigestEmails = isDigestEmails;
    }

    public void setIsModuleWebsiteSaleSlides(boolean isModuleWebsiteSaleSlides) {
        this.isModuleWebsiteSaleSlides = isModuleWebsiteSaleSlides;
    }

    public void setFirstProviderLabel(String firstProviderLabel) {
        this.firstProviderLabel = firstProviderLabel;
    }

    public void setIsModuleWebsiteCfTurnstile(boolean isModuleWebsiteCfTurnstile) {
        this.isModuleWebsiteCfTurnstile = isModuleWebsiteCfTurnstile;
    }

    public void setIsCdnActivated(boolean isCdnActivated) {
        this.isCdnActivated = isCdnActivated;
    }

    public void setProvidersState(Object providersState) {
        this.providersState = providersState;
    }



}