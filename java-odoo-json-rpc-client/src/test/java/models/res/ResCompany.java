
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

package ch.helvethink.odoo4java.models.res;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.*;
import ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.project.Project;
import ch.helvethink.odoo4java.models.project.ProjectTask;
import ch.helvethink.odoo4java.models.res.country.ResCountryState;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.models.resource.ResourceCalendar;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.company")
public class ResCompany implements OdooObj {

    
        private List<ResPartnerBank> bankIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("bank_ids")
        private List<Integer> bankIds;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("user_tax_lock_date")
        private Date userTaxLockDate;
    

    
        @JsonProperty("tax_lock_date")
        private Date taxLockDate;
    

    
        private AccountJournal currencyExchangeJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("currency_exchange_journal_id")
        private OdooId currencyExchangeJournalId;
    

    
        @JsonProperty("bounce_formatted")
        private String bounceFormatted;
    

    
        private Account incomeCurrencyExchangeAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("income_currency_exchange_account_id")
        private OdooId incomeCurrencyExchangeAccountId;
    

    
        @JsonProperty("invoice_terms")
        private Object invoiceTerms;
    

    
        private Account defaultCashDifferenceExpenseAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("default_cash_difference_expense_account_id")
        private OdooId defaultCashDifferenceExpenseAccountId;
    

    
        @JsonProperty("default_from_email")
        private String defaultFromEmail;
    

    
        @JsonProperty("po_lead")
        private double poLead;
    

    
        @JsonProperty("bank_account_code_prefix")
        private String bankAccountCodePrefix;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("hard_lock_date")
        private Date hardLockDate;
    

    
        private AccountMove accountOpeningMoveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("account_opening_move_id")
        private OdooId accountOpeningMoveId;
    

    
        private Account accountDiscountIncomeAllocationIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_discount_income_allocation_id")
        private OdooId accountDiscountIncomeAllocationId;
    

    
        @JsonProperty("is_company_details_empty")
        private boolean isIsCompanyDetailsEmpty;
    

    
        @JsonProperty("hr_presence_control_email_amount")
        private int hrPresenceControlEmailAmount;
    

    
        @JsonProperty("parent_path")
        private String parentPath;
    

    
        @JsonProperty("snailmail_duplex")
        private boolean isSnailmailDuplex;
    

    
        private AccountJournal expenseJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("expense_journal_id")
        private OdooId expenseJournalId;
    

    
        private ResCountryState stateIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("state_id")
        private OdooId stateId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("fiscalyear_lock_date")
        private Date fiscalyearLockDate;
    

    
        @JsonProperty("anglo_saxon_accounting")
        private boolean isAngloSaxonAccounting;
    

    
        @JsonProperty("logo_web")
        private Object logoWeb;
    

    
        @JsonProperty("tax_calculation_rounding_method")
        private Object taxCalculationRoundingMethod;
    

    
        @JsonProperty("zip")
        private String zip;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("hr_presence_control_email")
        private boolean isHrPresenceControlEmail;
    

    
        @JsonProperty("vat")
        private String vat;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("portal_confirmation_sign")
        private boolean isPortalConfirmationSign;
    

    
        @JsonProperty("user_hard_lock_date")
        private Date userHardLockDate;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("hr_presence_control_attendance")
        private boolean isHrPresenceControlAttendance;
    

    
        @JsonProperty("email_primary_color")
        private String emailPrimaryColor;
    

    
        @JsonProperty("phone")
        private String phone;
    

    
        @JsonProperty("user_sale_lock_date")
        private Date userSaleLockDate;
    

    
        @JsonProperty("contract_expiration_notice_period")
        private int contractExpirationNoticePeriod;
    

    
        @JsonProperty("work_permit_expiration_notice_period")
        private int workPermitExpirationNoticePeriod;
    

    
        private AccountTax accountPurchaseTaxIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("account_purchase_tax_id")
        private OdooId accountPurchaseTaxId;
    

    
        private ResCountry countryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_id")
        private OdooId countryId;
    

    
        @JsonProperty("catchall_email")
        private String catchallEmail;
    

    
        @JsonProperty("user_purchase_lock_date")
        private Date userPurchaseLockDate;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        @JsonProperty("account_opening_date")
        private Date accountOpeningDate;
    

    
        @JsonProperty("portal_confirmation_pay")
        private boolean isPortalConfirmationPay;
    

    
        @JsonProperty("city")
        private String city;
    

    
        @JsonProperty("transfer_account_code_prefix")
        private String transferAccountCodePrefix;
    

    
        @JsonProperty("uses_default_logo")
        private boolean isUsesDefaultLogo;
    

    
        @JsonProperty("payment_onboarding_payment_method")
        private Object paymentOnboardingPaymentMethod;
    

    
        private List<ResCompany> childIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("child_ids")
        private List<Integer> childIds;
    

    
        @JsonProperty("hr_presence_control_ip_list")
        private String hrPresenceControlIpList;
    

    
        private List<AccountPaymentMethodLine> companyExpenseAllowedPaymentMethodLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("company_expense_allowed_payment_method_line_ids")
        private List<Integer> companyExpenseAllowedPaymentMethodLineIds;
    

    
        @JsonProperty("hr_presence_control_ip")
        private boolean isHrPresenceControlIp;
    

    
        @JsonProperty("purchase_lock_date")
        private Date purchaseLockDate;
    

    
        @JsonProperty("autopost_bills")
        private boolean isAutopostBills;
    

    
        private List<AccountFiscalPosition> fiscalPositionIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
        @JsonProperty("fiscal_position_ids")
        private List<Integer> fiscalPositionIds;
    

    
        @JsonProperty("expects_chart_of_accounts")
        private boolean isExpectsChartOfAccounts;
    

    
        @JsonProperty("cash_account_code_prefix")
        private String cashAccountCodePrefix;
    

    
        @JsonProperty("secondary_color")
        private String secondaryColor;
    

    
        private Account accountJournalSuspenseAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_journal_suspense_account_id")
        private OdooId accountJournalSuspenseAccountId;
    

    
        private List<ResCompany> allChildIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("all_child_ids")
        private List<Integer> allChildIds;
    

    
        @JsonProperty("street2")
        private String street2;
    

    
        @JsonProperty("po_double_validation")
        private Object poDoubleValidation;
    

    
        @JsonProperty("alias_domain_name")
        private String aliasDomainName;
    

    
        @JsonProperty("email")
        private String email;
    

    
        private ResourceCalendar resourceCalendarIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("resource_calendar_id")
        private OdooId resourceCalendarId;
    

    
        @JsonProperty("website")
        private String website;
    

    
        private List<ResUsers> userIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_ids")
        private List<Integer> userIds;
    

    
        @JsonProperty("company_registry")
        private String companyRegistry;
    

    
        @JsonProperty("display_invoice_tax_company_currency")
        private boolean isDisplayInvoiceTaxCompanyCurrency;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("display_invoice_amount_total_words")
        private boolean isDisplayInvoiceAmountTotalWords;
    

    
        @JsonProperty("check_account_audit_trail")
        private boolean isCheckAccountAuditTrail;
    

    
        private ResCountry accountFiscalCountryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("account_fiscal_country_id")
        private OdooId accountFiscalCountryId;
    

    
        private Account accountCashBasisBaseAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_cash_basis_base_account_id")
        private OdooId accountCashBasisBaseAccountId;
    

    
        @JsonProperty("sale_lock_date")
        private Date saleLockDate;
    

    
        @JsonProperty("company_vat_placeholder")
        private String companyVatPlaceholder;
    

    
        private Account accountJournalEarlyPayDiscountLossAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_journal_early_pay_discount_loss_account_id")
        private OdooId accountJournalEarlyPayDiscountLossAccountId;
    

    
        private ProjectTask leaveTimesheetTaskIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("leave_timesheet_task_id")
        private OdooId leaveTimesheetTaskId;
    

    
        @JsonProperty("font")
        private Object font;
    

    
        @JsonProperty("user_fiscalyear_lock_date")
        private Date userFiscalyearLockDate;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("sale_onboarding_payment_method")
        private Object saleOnboardingPaymentMethod;
    

    
        @JsonProperty("report_header")
        private Object reportHeader;
    

    
        @JsonProperty("prepayment_percent")
        private double prepaymentPercent;
    

    
        private Account expenseOutstandingAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("expense_outstanding_account_id")
        private OdooId expenseOutstandingAccountId;
    

    
        @JsonProperty("employee_properties_definition")
        private Object employeePropertiesDefinition;
    

    
        @JsonProperty("account_price_include")
        private Object accountPriceInclude;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        private Account revenueAccrualAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("revenue_accrual_account_id")
        private OdooId revenueAccrualAccountId;
    

    
        @JsonProperty("logo")
        private Object logo;
    

    
        private Account accountJournalEarlyPayDiscountGainAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_journal_early_pay_discount_gain_account_id")
        private OdooId accountJournalEarlyPayDiscountGainAccountId;
    

    
        @JsonProperty("candidate_properties_definition")
        private Object candidatePropertiesDefinition;
    

    
        private List<ResourceCalendar> resourceCalendarIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("resource_calendar_ids")
        private List<Integer> resourceCalendarIds;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("quotation_validity_days")
        private int quotationValidityDays;
    

    
        @JsonProperty("report_footer")
        private Object reportFooter;
    

    
        @JsonProperty("iap_enrich_auto_done")
        private boolean isIapEnrichAutoDone;
    

    
        @JsonProperty("quick_edit_mode")
        private Object quickEditMode;
    

    
        @JsonProperty("primary_color")
        private String primaryColor;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private Account expenseAccrualAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("expense_accrual_account_id")
        private OdooId expenseAccrualAccountId;
    

    
        private Account transferAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("transfer_account_id")
        private OdooId transferAccountId;
    

    
        @JsonProperty("tax_exigibility")
        private boolean isTaxExigibility;
    

    
        @JsonProperty("terms_type")
        private Object termsType;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("layout_background_image")
        private Object layoutBackgroundImage;
    

    
        private List<AccountJournal> bankJournalIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("bank_journal_ids")
        private List<Integer> bankJournalIds;
    

    
        @JsonProperty("invoice_terms_html")
        private Object invoiceTermsHtml;
    

    
        @JsonProperty("chart_template")
        private Object chartTemplate;
    

    
        private ResCompany parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("snailmail_cover")
        private boolean isSnailmailCover;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("account_storno")
        private boolean isAccountStorno;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("fiscalyear_last_day")
        private int fiscalyearLastDay;
    

    
        @JsonProperty("layout_background")
        private Object layoutBackground;
    

    
        @JsonProperty("email_secondary_color")
        private String emailSecondaryColor;
    

    
        private AccountIncoterms incotermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountIncoterms")
        @OdooModel("account.AccountIncoterms")
        @JsonProperty("incoterm_id")
        private OdooId incotermId;
    

    
        private List<ResCountry> multiVatForeignCountryIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("multi_vat_foreign_country_ids")
        private List<Integer> multiVatForeignCountryIds;
    

    
        @JsonProperty("po_double_validation_amount")
        private Object poDoubleValidationAmount;
    

    
        private List<ResCompany> parentIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("parent_ids")
        private List<Integer> parentIds;
    

    
        @JsonProperty("bounce_email")
        private String bounceEmail;
    

    
        private AccountJournal taxCashBasisJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("tax_cash_basis_journal_id")
        private OdooId taxCashBasisJournalId;
    

    
        private Account accountDiscountExpenseAllocationIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_discount_expense_allocation_id")
        private OdooId accountDiscountExpenseAllocationId;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        private Account defaultCashDifferenceIncomeAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("default_cash_difference_income_account_id")
        private OdooId defaultCashDifferenceIncomeAccountId;
    

    
        @JsonProperty("hr_presence_control_login")
        private boolean isHrPresenceControlLogin;
    

    
        @JsonProperty("street")
        private String street;
    

    
        @JsonProperty("partner_gid")
        private int partnerGid;
    

    
        @JsonProperty("account_use_credit_limit")
        private boolean isAccountUseCreditLimit;
    

    
        @JsonProperty("qr_code")
        private boolean isQrCode;
    

    
        private ResCompany rootIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("root_id")
        private OdooId rootId;
    

    
        @JsonProperty("email_formatted")
        private String emailFormatted;
    

    
        @JsonProperty("job_properties_definition")
        private Object jobPropertiesDefinition;
    

    
        @JsonProperty("catchall_formatted")
        private String catchallFormatted;
    

    
        private Project internalProjectIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("internal_project_id")
        private OdooId internalProjectId;
    

    
        @JsonProperty("mobile")
        private String mobile;
    

    
        private AccountJournal automaticEntryDefaultJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("automatic_entry_default_journal_id")
        private OdooId automaticEntryDefaultJournalId;
    

    
        @JsonProperty("snailmail_color")
        private boolean isSnailmailColor;
    

    
        private AccountTax accountSaleTaxIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("account_sale_tax_id")
        private OdooId accountSaleTaxId;
    

    
        @JsonProperty("fiscalyear_last_month")
        private Object fiscalyearLastMonth;
    

    
        private Account expenseCurrencyExchangeAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("expense_currency_exchange_account_id")
        private OdooId expenseCurrencyExchangeAccountId;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        private AccountJournal accountOpeningJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("account_opening_journal_id")
        private OdooId accountOpeningJournalId;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        private List<ResCountry> accountEnabledTaxCountryIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("account_enabled_tax_country_ids")
        private List<Integer> accountEnabledTaxCountryIds;
    

    
        private Account accountDefaultPosReceivableAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_default_pos_receivable_account_id")
        private OdooId accountDefaultPosReceivableAccountId;
    

    
        @JsonProperty("po_lock")
        private Object poLock;
    

    
        @JsonProperty("company_details")
        private Object companyDetails;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
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

    public Date getUserTaxLockDate() {
        return userTaxLockDate;
    }

    public Date getTaxLockDate() {
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

    public String getDefaultFromEmail() {
        return defaultFromEmail;
    }

    public double getPoLead() {
        return poLead;
    }

    public String getBankAccountCodePrefix() {
        return bankAccountCodePrefix;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public Date getHardLockDate() {
        return hardLockDate;
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

    public Date getFiscalyearLockDate() {
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

    public boolean getIsHrPresenceControlEmail() {
        return isHrPresenceControlEmail;
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

    public Date getUserHardLockDate() {
        return userHardLockDate;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public boolean getIsHrPresenceControlAttendance() {
        return isHrPresenceControlAttendance;
    }

    public String getEmailPrimaryColor() {
        return emailPrimaryColor;
    }

    public String getPhone() {
        return phone;
    }

    public Date getUserSaleLockDate() {
        return userSaleLockDate;
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

    public Date getUserPurchaseLockDate() {
        return userPurchaseLockDate;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public boolean getIsPortalConfirmationPay() {
        return isPortalConfirmationPay;
    }

    public String getCity() {
        return city;
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

    public boolean getIsHrPresenceControlIp() {
        return isHrPresenceControlIp;
    }

    public Date getPurchaseLockDate() {
        return purchaseLockDate;
    }

    public boolean getIsAutopostBills() {
        return isAutopostBills;
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

    public Object getPoDoubleValidation() {
        return poDoubleValidation;
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

    public String getWebsite() {
        return website;
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

    public boolean getIsDisplayInvoiceTaxCompanyCurrency() {
        return isDisplayInvoiceTaxCompanyCurrency;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsDisplayInvoiceAmountTotalWords() {
        return isDisplayInvoiceAmountTotalWords;
    }

    public boolean getIsCheckAccountAuditTrail() {
        return isCheckAccountAuditTrail;
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

    public Date getSaleLockDate() {
        return saleLockDate;
    }

    public String getCompanyVatPlaceholder() {
        return companyVatPlaceholder;
    }

    public Account getAccountJournalEarlyPayDiscountLossAccountIdAsObject() {
        return accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountLossAccountId() {
        return accountJournalEarlyPayDiscountLossAccountId;
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

    public Date getUserFiscalyearLockDate() {
        return userFiscalyearLockDate;
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

    public double getPrepaymentPercent() {
        return prepaymentPercent;
    }

    public Account getExpenseOutstandingAccountIdAsObject() {
        return expenseOutstandingAccountIdAsObject;
    }

    public OdooId getExpenseOutstandingAccountId() {
        return expenseOutstandingAccountId;
    }

    public Object getEmployeePropertiesDefinition() {
        return employeePropertiesDefinition;
    }

    public Object getAccountPriceInclude() {
        return accountPriceInclude;
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

    public Object getLogo() {
        return logo;
    }

    public Account getAccountJournalEarlyPayDiscountGainAccountIdAsObject() {
        return accountJournalEarlyPayDiscountGainAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountGainAccountId() {
        return accountJournalEarlyPayDiscountGainAccountId;
    }

    public Object getCandidatePropertiesDefinition() {
        return candidatePropertiesDefinition;
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

    public Object getQuickEditMode() {
        return quickEditMode;
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

    public Account getTransferAccountIdAsObject() {
        return transferAccountIdAsObject;
    }

    public OdooId getTransferAccountId() {
        return transferAccountId;
    }

    public boolean getIsTaxExigibility() {
        return isTaxExigibility;
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

    public String getName() {
        return name;
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

    public Object getPoDoubleValidationAmount() {
        return poDoubleValidationAmount;
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

    public boolean getIsHrPresenceControlLogin() {
        return isHrPresenceControlLogin;
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

    public String getEmailFormatted() {
        return emailFormatted;
    }

    public Object getJobPropertiesDefinition() {
        return jobPropertiesDefinition;
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

    public Object getPoLock() {
        return poLock;
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

    public void setUserTaxLockDate(Date userTaxLockDate) {
        this.userTaxLockDate = userTaxLockDate;
    }

    public void setTaxLockDate(Date taxLockDate) {
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

    public void setDefaultFromEmail(String defaultFromEmail) {
        this.defaultFromEmail = defaultFromEmail;
    }

    public void setPoLead(double poLead) {
        this.poLead = poLead;
    }

    public void setBankAccountCodePrefix(String bankAccountCodePrefix) {
        this.bankAccountCodePrefix = bankAccountCodePrefix;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setHardLockDate(Date hardLockDate) {
        this.hardLockDate = hardLockDate;
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

    public void setFiscalyearLockDate(Date fiscalyearLockDate) {
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

    public void setIsHrPresenceControlEmail(boolean isHrPresenceControlEmail) {
        this.isHrPresenceControlEmail = isHrPresenceControlEmail;
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

    public void setUserHardLockDate(Date userHardLockDate) {
        this.userHardLockDate = userHardLockDate;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setIsHrPresenceControlAttendance(boolean isHrPresenceControlAttendance) {
        this.isHrPresenceControlAttendance = isHrPresenceControlAttendance;
    }

    public void setEmailPrimaryColor(String emailPrimaryColor) {
        this.emailPrimaryColor = emailPrimaryColor;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserSaleLockDate(Date userSaleLockDate) {
        this.userSaleLockDate = userSaleLockDate;
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

    public void setUserPurchaseLockDate(Date userPurchaseLockDate) {
        this.userPurchaseLockDate = userPurchaseLockDate;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setIsPortalConfirmationPay(boolean isPortalConfirmationPay) {
        this.isPortalConfirmationPay = isPortalConfirmationPay;
    }

    public void setCity(String city) {
        this.city = city;
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

    public void setIsHrPresenceControlIp(boolean isHrPresenceControlIp) {
        this.isHrPresenceControlIp = isHrPresenceControlIp;
    }

    public void setPurchaseLockDate(Date purchaseLockDate) {
        this.purchaseLockDate = purchaseLockDate;
    }

    public void setIsAutopostBills(boolean isAutopostBills) {
        this.isAutopostBills = isAutopostBills;
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

    public void setPoDoubleValidation(Object poDoubleValidation) {
        this.poDoubleValidation = poDoubleValidation;
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

    public void setWebsite(String website) {
        this.website = website;
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

    public void setIsDisplayInvoiceTaxCompanyCurrency(boolean isDisplayInvoiceTaxCompanyCurrency) {
        this.isDisplayInvoiceTaxCompanyCurrency = isDisplayInvoiceTaxCompanyCurrency;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsDisplayInvoiceAmountTotalWords(boolean isDisplayInvoiceAmountTotalWords) {
        this.isDisplayInvoiceAmountTotalWords = isDisplayInvoiceAmountTotalWords;
    }

    public void setIsCheckAccountAuditTrail(boolean isCheckAccountAuditTrail) {
        this.isCheckAccountAuditTrail = isCheckAccountAuditTrail;
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

    public void setSaleLockDate(Date saleLockDate) {
        this.saleLockDate = saleLockDate;
    }

    public void setCompanyVatPlaceholder(String companyVatPlaceholder) {
        this.companyVatPlaceholder = companyVatPlaceholder;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountIdAsObject(Account accountJournalEarlyPayDiscountLossAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountLossAccountIdAsObject = accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountId(OdooId accountJournalEarlyPayDiscountLossAccountId) {
        this.accountJournalEarlyPayDiscountLossAccountId = accountJournalEarlyPayDiscountLossAccountId;
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

    public void setUserFiscalyearLockDate(Date userFiscalyearLockDate) {
        this.userFiscalyearLockDate = userFiscalyearLockDate;
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

    public void setPrepaymentPercent(double prepaymentPercent) {
        this.prepaymentPercent = prepaymentPercent;
    }

    public void setExpenseOutstandingAccountIdAsObject(Account expenseOutstandingAccountIdAsObject) {
        this.expenseOutstandingAccountIdAsObject = expenseOutstandingAccountIdAsObject;
    }

    public void setExpenseOutstandingAccountId(OdooId expenseOutstandingAccountId) {
        this.expenseOutstandingAccountId = expenseOutstandingAccountId;
    }

    public void setEmployeePropertiesDefinition(Object employeePropertiesDefinition) {
        this.employeePropertiesDefinition = employeePropertiesDefinition;
    }

    public void setAccountPriceInclude(Object accountPriceInclude) {
        this.accountPriceInclude = accountPriceInclude;
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

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public void setAccountJournalEarlyPayDiscountGainAccountIdAsObject(Account accountJournalEarlyPayDiscountGainAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountGainAccountIdAsObject = accountJournalEarlyPayDiscountGainAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountGainAccountId(OdooId accountJournalEarlyPayDiscountGainAccountId) {
        this.accountJournalEarlyPayDiscountGainAccountId = accountJournalEarlyPayDiscountGainAccountId;
    }

    public void setCandidatePropertiesDefinition(Object candidatePropertiesDefinition) {
        this.candidatePropertiesDefinition = candidatePropertiesDefinition;
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

    public void setQuickEditMode(Object quickEditMode) {
        this.quickEditMode = quickEditMode;
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

    public void setTransferAccountIdAsObject(Account transferAccountIdAsObject) {
        this.transferAccountIdAsObject = transferAccountIdAsObject;
    }

    public void setTransferAccountId(OdooId transferAccountId) {
        this.transferAccountId = transferAccountId;
    }

    public void setIsTaxExigibility(boolean isTaxExigibility) {
        this.isTaxExigibility = isTaxExigibility;
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

    public void setName(String name) {
        this.name = name;
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

    public void setPoDoubleValidationAmount(Object poDoubleValidationAmount) {
        this.poDoubleValidationAmount = poDoubleValidationAmount;
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

    public void setIsHrPresenceControlLogin(boolean isHrPresenceControlLogin) {
        this.isHrPresenceControlLogin = isHrPresenceControlLogin;
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

    public void setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted;
    }

    public void setJobPropertiesDefinition(Object jobPropertiesDefinition) {
        this.jobPropertiesDefinition = jobPropertiesDefinition;
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

    public void setPoLock(Object poLock) {
        this.poLock = poLock;
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