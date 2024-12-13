
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

package ch.helvethink.odoo4java.models.res.config;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountIncoterms;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.AccountTax;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.project.Project;
import ch.helvethink.odoo4java.models.project.ProjectTask;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCountry;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.resource.ResourceCalendar;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.config.settings")
public class ResConfigSettings implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("module_account_bank_statement_extract")
        private boolean isModuleAccountBankStatementExtract;
    

    
        @JsonProperty("module_auth_oauth")
        private boolean isModuleAuthOauth;
    

    
        @JsonProperty("is_account_peppol_eligible")
        private boolean isIsAccountPeppolEligible;
    

    
        @JsonProperty("module_sale_pdf_quote_builder")
        private boolean isModuleSalePdfQuoteBuilder;
    

    
        private AccountJournal currencyExchangeJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("currency_exchange_journal_id")
        private OdooId currencyExchangeJournalId;
    

    
        @JsonProperty("module_product_email_template")
        private boolean isModuleProductEmailTemplate;
    

    
        private Account incomeCurrencyExchangeAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("income_currency_exchange_account_id")
        private OdooId incomeCurrencyExchangeAccountId;
    

    
        @JsonProperty("po_lead")
        private double poLead;
    

    
        private ResUsers authSignupTemplateUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("auth_signup_template_user_id")
        private OdooId authSignupTemplateUserId;
    

    
        @JsonProperty("reminder_allow")
        private boolean isReminderAllow;
    

    
        @JsonProperty("module_account_bank_statement_import_ofx")
        private boolean isModuleAccountBankStatementImportOfx;
    

    
        @JsonProperty("company_informations")
        private Object companyInformations;
    

    
        @JsonProperty("lock_confirmed_po")
        private boolean isLockConfirmedPo;
    

    
        @JsonProperty("invoice_policy")
        private boolean isInvoicePolicy;
    

    
        @JsonProperty("tax_calculation_rounding_method")
        private Object taxCalculationRoundingMethod;
    

    
        @JsonProperty("timesheet_encode_method")
        private Object timesheetEncodeMethod;
    

    
        @JsonProperty("module_hr_presence")
        private boolean isModuleHrPresence;
    

    
        @JsonProperty("hr_presence_control_email")
        private boolean isHrPresenceControlEmail;
    

    
        @JsonProperty("module_account_bank_statement_import_qif")
        private boolean isModuleAccountBankStatementImportQif;
    

    
        @JsonProperty("module_base_geolocalize")
        private boolean isModuleBaseGeolocalize;
    

    
        @JsonProperty("language_count")
        private int languageCount;
    

    
        @JsonProperty("module_website_crm_iap_reveal")
        private boolean isModuleWebsiteCrmIapReveal;
    

    
        @JsonProperty("module_hr_recruitment_extract")
        private boolean isModuleHrRecruitmentExtract;
    

    
        @JsonProperty("email_primary_color")
        private String emailPrimaryColor;
    

    
        @JsonProperty("group_project_stages")
        private boolean isGroupProjectStages;
    

    
        @JsonProperty("contract_expiration_notice_period")
        private int contractExpirationNoticePeriod;
    

    
        @JsonProperty("company_name")
        private String companyName;
    

    
        @JsonProperty("module_delivery_fedex")
        private boolean isModuleDeliveryFedex;
    

    
        @JsonProperty("module_product_images")
        private boolean isModuleProductImages;
    

    
        @JsonProperty("module_currency_rate_live")
        private boolean isModuleCurrencyRateLive;
    

    
        @JsonProperty("predictive_lead_scoring_start_date")
        private Date predictiveLeadScoringStartDate;
    

    
        @JsonProperty("use_po_lead")
        private boolean isUsePoLead;
    

    
        @JsonProperty("portal_confirmation_pay")
        private boolean isPortalConfirmationPay;
    

    
        @JsonProperty("module_hr_payroll_expense")
        private boolean isModuleHrPayrollExpense;
    

    
        @JsonProperty("hr_presence_control_ip_list")
        private String hrPresenceControlIpList;
    

    
        @JsonProperty("module_delivery_ups")
        private boolean isModuleDeliveryUps;
    

    
        @JsonProperty("module_google_calendar")
        private boolean isModuleGoogleCalendar;
    

    
        @JsonProperty("hr_presence_control_ip")
        private boolean isHrPresenceControlIp;
    

    
        @JsonProperty("group_warning_account")
        private boolean isGroupWarningAccount;
    

    
        @JsonProperty("module_account_reports")
        private boolean isModuleAccountReports;
    

    
        @JsonProperty("sfu_server_key")
        private String sfuServerKey;
    

    
        @JsonProperty("default_invoice_policy")
        private Object defaultInvoicePolicy;
    

    
        @JsonProperty("module_mail_plugin")
        private boolean isModuleMailPlugin;
    

    
        private Account accountJournalSuspenseAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_journal_suspense_account_id")
        private OdooId accountJournalSuspenseAccountId;
    

    
        @JsonProperty("po_double_validation")
        private Object poDoubleValidation;
    

    
        @JsonProperty("pay_invoices_online")
        private boolean isPayInvoicesOnline;
    

    
        @JsonProperty("external_email_server_default")
        private boolean isExternalEmailServerDefault;
    

    
        @JsonProperty("group_applicant_cv_display")
        private boolean isGroupApplicantCvDisplay;
    

    
        @JsonProperty("account_default_credit_limit")
        private Object accountDefaultCreditLimit;
    

    
        @JsonProperty("module_account_3way_match")
        private boolean isModuleAccount3wayMatch;
    

    
        @JsonProperty("module_account_inter_company_rules")
        private boolean isModuleAccountInterCompanyRules;
    

    
        @JsonProperty("check_account_audit_trail")
        private boolean isCheckAccountAuditTrail;
    

    
        @JsonProperty("preview_ready")
        private boolean isPreviewReady;
    

    
        @JsonProperty("user_default_rights")
        private boolean isUserDefaultRights;
    

    
        private Account accountCashBasisBaseAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_cash_basis_base_account_id")
        private OdooId accountCashBasisBaseAccountId;
    

    
        @JsonProperty("module_google_recaptcha")
        private boolean isModuleGoogleRecaptcha;
    

    
        private Account accountJournalEarlyPayDiscountLossAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_journal_early_pay_discount_loss_account_id")
        private OdooId accountJournalEarlyPayDiscountLossAccountId;
    

    
        @JsonProperty("group_show_purchase_receipts")
        private boolean isGroupShowPurchaseReceipts;
    

    
        @JsonProperty("module_delivery")
        private boolean isModuleDelivery;
    

    
        @JsonProperty("prepayment_percent")
        private double prepaymentPercent;
    

    
        private Account expenseOutstandingAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("expense_outstanding_account_id")
        private OdooId expenseOutstandingAccountId;
    

    
        @JsonProperty("po_order_approval")
        private boolean isPoOrderApproval;
    

    
        @JsonProperty("module_auth_ldap")
        private boolean isModuleAuthLdap;
    

    
        @JsonProperty("show_effect")
        private boolean isShowEffect;
    

    
        @JsonProperty("hr_expense_alias_prefix")
        private String hrExpenseAliasPrefix;
    

    
        @JsonProperty("portal_allow_api_keys")
        private boolean isPortalAllowApiKeys;
    

    
        @JsonProperty("module_account_bank_statement_import_csv")
        private boolean isModuleAccountBankStatementImportCsv;
    

    
        @JsonProperty("web_app_name")
        private String webAppName;
    

    
        @JsonProperty("restrict_template_rendering")
        private boolean isRestrictTemplateRendering;
    

    
        @JsonProperty("module_account_accountant")
        private boolean isModuleAccountAccountant;
    

    
        @JsonProperty("quotation_validity_days")
        private int quotationValidityDays;
    

    
        @JsonProperty("module_project_timesheet_holidays")
        private boolean isModuleProjectTimesheetHolidays;
    

    
        @JsonProperty("report_footer")
        private Object reportFooter;
    

    
        @JsonProperty("module_sale_loyalty")
        private boolean isModuleSaleLoyalty;
    

    
        @JsonProperty("tax_exigibility")
        private boolean isTaxExigibility;
    

    
        @JsonProperty("terms_type")
        private Object termsType;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("invoice_terms_html")
        private Object invoiceTermsHtml;
    

    
        @JsonProperty("crm_auto_assignment_action")
        private Object crmAutoAssignmentAction;
    

    
        @JsonProperty("group_stock_packaging")
        private boolean isGroupStockPackaging;
    

    
        @JsonProperty("snailmail_cover")
        private boolean isSnailmailCover;
    

    
        @JsonProperty("module_hr_attendance")
        private boolean isModuleHrAttendance;
    

    
        @JsonProperty("group_show_sale_receipts")
        private boolean isGroupShowSaleReceipts;
    

    
        @JsonProperty("reminder_user_allow")
        private boolean isReminderUserAllow;
    

    
        @JsonProperty("has_chart_of_accounts")
        private boolean isHasChartOfAccounts;
    

    
        @JsonProperty("account_storno")
        private boolean isAccountStorno;
    

    
        @JsonProperty("module_product_margin")
        private boolean isModuleProductMargin;
    

    
        @JsonProperty("group_multi_currency")
        private boolean isGroupMultiCurrency;
    

    
        @JsonProperty("email_secondary_color")
        private String emailSecondaryColor;
    

    
        @JsonProperty("po_double_validation_amount")
        private Object poDoubleValidationAmount;
    

    
        @JsonProperty("module_account_budget")
        private boolean isModuleAccountBudget;
    

    
        private ResCurrency companyCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("company_currency_id")
        private OdooId companyCurrencyId;
    

    
        @JsonProperty("module_delivery_bpost")
        private boolean isModuleDeliveryBpost;
    

    
        @JsonProperty("has_accounting_entries")
        private boolean isHasAccountingEntries;
    

    
        @JsonProperty("account_use_credit_limit")
        private boolean isAccountUseCreditLimit;
    

    
        @JsonProperty("qr_code")
        private boolean isQrCode;
    

    
        @JsonProperty("predictive_lead_scoring_field_labels")
        private String predictiveLeadScoringFieldLabels;
    

    
        @JsonProperty("lead_mining_in_pipeline")
        private boolean isLeadMiningInPipeline;
    

    
        private Project internalProjectIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("internal_project_id")
        private OdooId internalProjectId;
    

    
        @JsonProperty("module_account_extract")
        private boolean isModuleAccountExtract;
    

    
        @JsonProperty("group_use_recurring_revenues")
        private boolean isGroupUseRecurringRevenues;
    

    
        @JsonProperty("snailmail_color")
        private boolean isSnailmailColor;
    

    
        @JsonProperty("google_gmail_client_identifier")
        private String googleGmailClientIdentifier;
    

    
        @JsonProperty("module_delivery_starshipit")
        private boolean isModuleDeliveryStarshipit;
    

    
        @JsonProperty("group_uom")
        private boolean isGroupUom;
    

    
        @JsonProperty("module_account_bank_statement_import_camt")
        private boolean isModuleAccountBankStatementImportCamt;
    

    
        @JsonProperty("auth_signup_reset_password")
        private boolean isAuthSignupResetPassword;
    

    
        @JsonProperty("product_volume_volume_in_cubic_feet")
        private Object productVolumeVolumeInCubicFeet;
    

    
        @JsonProperty("tenor_gif_limit")
        private int tenorGifLimit;
    

    
        @JsonProperty("module_web_unsplash")
        private boolean isModuleWebUnsplash;
    

    
        @JsonProperty("po_lock")
        private Object poLock;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("google_translate_api_key")
        private String googleTranslateApiKey;
    

    
        @JsonProperty("module_hr_skills")
        private boolean isModuleHrSkills;
    

    
        @JsonProperty("group_product_pricelist")
        private boolean isGroupProductPricelist;
    

    
        @JsonProperty("twilio_account_token")
        private String twilioAccountToken;
    

    
        @JsonProperty("hr_expense_use_mailgateway")
        private boolean isHrExpenseUseMailgateway;
    

    
        @JsonProperty("module_purchase_requisition")
        private boolean isModulePurchaseRequisition;
    

    
        @JsonProperty("invoice_terms")
        private Object invoiceTerms;
    

    
        @JsonProperty("group_send_reminder")
        private boolean isGroupSendReminder;
    

    
        private AccountTax saleTaxIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("sale_tax_id")
        private OdooId saleTaxId;
    

    
        @JsonProperty("group_use_lead")
        private boolean isGroupUseLead;
    

    
        @JsonProperty("predictive_lead_scoring_start_date_str")
        private String predictiveLeadScoringStartDateStr;
    

    
        private Account accountDiscountIncomeAllocationIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_discount_income_allocation_id")
        private OdooId accountDiscountIncomeAllocationId;
    

    
        @JsonProperty("hr_presence_control_email_amount")
        private int hrPresenceControlEmailAmount;
    

    
        @JsonProperty("snailmail_duplex")
        private boolean isSnailmailDuplex;
    

    
        private AccountJournal expenseJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("expense_journal_id")
        private OdooId expenseJournalId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("partner_autocomplete_insufficient_credit")
        private boolean isPartnerAutocompleteInsufficientCredit;
    

    
        @JsonProperty("profiling_enabled_until")
        private Date profilingEnabledUntil;
    

    
        @JsonProperty("module_account_intrastat")
        private boolean isModuleAccountIntrastat;
    

    
        @JsonProperty("module_sms")
        private boolean isModuleSms;
    

    
        @JsonProperty("module_sale_margin")
        private boolean isModuleSaleMargin;
    

    
        @JsonProperty("module_hr_recruitment_survey")
        private boolean isModuleHrRecruitmentSurvey;
    

    
        @JsonProperty("group_sale_order_template")
        private boolean isGroupSaleOrderTemplate;
    

    
        @JsonProperty("portal_confirmation_sign")
        private boolean isPortalConfirmationSign;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("crm_auto_assignment_interval_type")
        private Object crmAutoAssignmentIntervalType;
    

    
        @JsonProperty("module_partner_autocomplete")
        private boolean isModulePartnerAutocomplete;
    

    
        @JsonProperty("module_sale_amazon")
        private boolean isModuleSaleAmazon;
    

    
        @JsonProperty("default_purchase_method")
        private Object defaultPurchaseMethod;
    

    
        @JsonProperty("work_permit_expiration_notice_period")
        private int workPermitExpirationNoticePeriod;
    

    
        @JsonProperty("use_invoice_terms")
        private boolean isUseInvoiceTerms;
    

    
        @JsonProperty("predictive_lead_scoring_fields_str")
        private String predictiveLeadScoringFieldsStr;
    

    
        @JsonProperty("unsplash_access_key")
        private String unsplashAccessKey;
    

    
        @JsonProperty("sfu_server_url")
        private String sfuServerUrl;
    

    
        @JsonProperty("group_analytic_accounting")
        private boolean isGroupAnalyticAccounting;
    

    
        @JsonProperty("module_account_payment")
        private boolean isModuleAccountPayment;
    

    
        @JsonProperty("is_encode_uom_days")
        private boolean isIsEncodeUomDays;
    

    
        @JsonProperty("twilio_account_sid")
        private String twilioAccountSid;
    

    
        @JsonProperty("use_twilio_rtc_servers")
        private boolean isUseTwilioRtcServers;
    

    
        @JsonProperty("automatic_invoice")
        private boolean isAutomaticInvoice;
    

    
        @JsonProperty("module_hr_expense_extract")
        private boolean isModuleHrExpenseExtract;
    

    
        private List<AccountPaymentMethodLine> companyExpenseAllowedPaymentMethodLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("company_expense_allowed_payment_method_line_ids")
        private List<Integer> companyExpenseAllowedPaymentMethodLineIds;
    

    
        @JsonProperty("autopost_bills")
        private boolean isAutopostBills;
    

    
        @JsonProperty("module_microsoft_calendar")
        private boolean isModuleMicrosoftCalendar;
    

    
        @JsonProperty("company_country_code")
        private String companyCountryCode;
    

    
        @JsonProperty("group_product_variant")
        private boolean isGroupProductVariant;
    

    
        @JsonProperty("module_voip")
        private boolean isModuleVoip;
    

    
        @JsonProperty("module_delivery_shiprocket")
        private boolean isModuleDeliveryShiprocket;
    

    
        @JsonProperty("module_google_gmail")
        private boolean isModuleGoogleGmail;
    

    
        @JsonProperty("product_weight_in_lbs")
        private Object productWeightInLbs;
    

    
        private ResourceCalendar resourceCalendarIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("resource_calendar_id")
        private OdooId resourceCalendarId;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("module_loyalty")
        private boolean isModuleLoyalty;
    

    
        @JsonProperty("display_invoice_tax_company_currency")
        private boolean isDisplayInvoiceTaxCompanyCurrency;
    

    
        @JsonProperty("module_crm_iap_enrich")
        private boolean isModuleCrmIapEnrich;
    

    
        @JsonProperty("module_sale_product_matrix")
        private boolean isModuleSaleProductMatrix;
    

    
        @JsonProperty("display_invoice_amount_total_words")
        private boolean isDisplayInvoiceAmountTotalWords;
    

    
        @JsonProperty("module_account_check_printing")
        private boolean isModuleAccountCheckPrinting;
    

    
        private ResCountry accountFiscalCountryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("account_fiscal_country_id")
        private OdooId accountFiscalCountryId;
    

    
        @JsonProperty("google_gmail_client_secret")
        private String googleGmailClientSecret;
    

    
        @JsonProperty("group_cash_rounding")
        private boolean isGroupCashRounding;
    

    
        @JsonProperty("group_project_rating")
        private boolean isGroupProjectRating;
    

    
        @JsonProperty("module_account_batch_payment")
        private boolean isModuleAccountBatchPayment;
    

    
        @JsonProperty("module_account_iso20022")
        private boolean isModuleAccountIso20022;
    

    
        @JsonProperty("module_delivery_usps")
        private boolean isModuleDeliveryUsps;
    

    
        @JsonProperty("module_base_import")
        private boolean isModuleBaseImport;
    

    
        private ProjectTask leaveTimesheetTaskIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("leave_timesheet_task_id")
        private OdooId leaveTimesheetTaskId;
    

    
        @JsonProperty("module_purchase_product_matrix")
        private boolean isModulePurchaseProductMatrix;
    

    
        @JsonProperty("is_root_company")
        private boolean isIsRootCompany;
    

    
        @JsonProperty("lead_enrich_auto")
        private Object leadEnrichAuto;
    

    
        @JsonProperty("module_sale_commission")
        private boolean isModuleSaleCommission;
    

    
        private AccountTax purchaseTaxIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("purchase_tax_id")
        private OdooId purchaseTaxId;
    

    
        @JsonProperty("module_website_hr_recruitment")
        private boolean isModuleWebsiteHrRecruitment;
    

    
        @JsonProperty("module_delivery_easypost")
        private boolean isModuleDeliveryEasypost;
    

    
        @JsonProperty("active_user_count")
        private int activeUserCount;
    

    
        @JsonProperty("group_project_milestone")
        private boolean isGroupProjectMilestone;
    

    
        @JsonProperty("group_warning_sale")
        private boolean isGroupWarningSale;
    

    
        @JsonProperty("account_price_include")
        private Object accountPriceInclude;
    

    
        @JsonProperty("module_l10n_eu_oss")
        private boolean isModuleL10nEuOss;
    

    
        private Account accountJournalEarlyPayDiscountGainAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_journal_early_pay_discount_gain_account_id")
        private OdooId accountJournalEarlyPayDiscountGainAccountId;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("crm_auto_assignment_run_datetime")
        private Date crmAutoAssignmentRunDatetime;
    

    
        @JsonProperty("group_auto_done_setting")
        private boolean isGroupAutoDoneSetting;
    

    
        @JsonProperty("crm_use_auto_assignment")
        private boolean isCrmUseAutoAssignment;
    

    
        @JsonProperty("quick_edit_mode")
        private Object quickEditMode;
    

    
        @JsonProperty("hr_employee_self_edit")
        private boolean isHrEmployeeSelfEdit;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private Account transferAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("transfer_account_id")
        private OdooId transferAccountId;
    

    
        @JsonProperty("crm_auto_assignment_interval_number")
        private int crmAutoAssignmentIntervalNumber;
    

    
        @JsonProperty("company_count")
        private int companyCount;
    

    
        @JsonProperty("chart_template")
        private Object chartTemplate;
    

    
        @JsonProperty("module_hr_timesheet")
        private boolean isModuleHrTimesheet;
    

    
        @JsonProperty("group_project_recurring_tasks")
        private boolean isGroupProjectRecurringTasks;
    

    
        @JsonProperty("module_delivery_dhl")
        private boolean isModuleDeliveryDhl;
    

    
        @JsonProperty("group_discount_per_so_line")
        private boolean isGroupDiscountPerSoLine;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("auth_signup_uninvited")
        private Object authSignupUninvited;
    

    
        @JsonProperty("group_project_task_dependencies")
        private boolean isGroupProjectTaskDependencies;
    

    
        private AccountIncoterms incotermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountIncoterms")
        @OdooModel("account.AccountIncoterms")
        @JsonProperty("incoterm_id")
        private OdooId incotermId;
    

    
        private AccountJournal taxCashBasisJournalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("tax_cash_basis_journal_id")
        private OdooId taxCashBasisJournalId;
    

    
        @JsonProperty("fail_counter")
        private int failCounter;
    

    
        private Account accountDiscountExpenseAllocationIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_discount_expense_allocation_id")
        private OdooId accountDiscountExpenseAllocationId;
    

    
        @JsonProperty("tenor_api_key")
        private String tenorApiKey;
    

    
        @JsonProperty("module_account_invoice_extract")
        private boolean isModuleAccountInvoiceExtract;
    

    
        @JsonProperty("hr_presence_control_login")
        private boolean isHrPresenceControlLogin;
    

    
        @JsonProperty("module_account_sepa_direct_debit")
        private boolean isModuleAccountSepaDirectDebit;
    

    
        @JsonProperty("group_warning_purchase")
        private boolean isGroupWarningPurchase;
    

    
        @JsonProperty("module_crm_iap_mine")
        private boolean isModuleCrmIapMine;
    

    
        @JsonProperty("module_account_peppol")
        private boolean isModuleAccountPeppol;
    

    
        @JsonProperty("module_hr_homeworking")
        private boolean isModuleHrHomeworking;
    

    
        @JsonProperty("module_delivery_sendcloud")
        private boolean isModuleDeliverySendcloud;
    

    
        @JsonProperty("unsplash_app_id")
        private String unsplashAppId;
    

    
        @JsonProperty("is_membership_multi")
        private boolean isIsMembershipMulti;
    

    
        @JsonProperty("snailmail_cover_readonly")
        private boolean isSnailmailCoverReadonly;
    

    
        @JsonProperty("module_snailmail_account")
        private boolean isModuleSnailmailAccount;
    

    
        @JsonProperty("module_microsoft_outlook")
        private boolean isModuleMicrosoftOutlook;
    

    
        @JsonProperty("group_proforma_sales")
        private boolean isGroupProformaSales;
    

    
        @JsonProperty("group_sale_delivery_address")
        private boolean isGroupSaleDeliveryAddress;
    

    
        @JsonProperty("tenor_content_filter")
        private Object tenorContentFilter;
    

    
        private Account expenseCurrencyExchangeAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("expense_currency_exchange_account_id")
        private OdooId expenseCurrencyExchangeAccountId;
    

    
        @JsonProperty("digest_emails")
        private boolean isDigestEmails;
    

    
        @JsonProperty("module_website_cf_turnstile")
        private boolean isModuleWebsiteCfTurnstile;
    


    public ResConfigSettings() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsModuleAccountBankStatementExtract() {
        return isModuleAccountBankStatementExtract;
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

    public AccountJournal getCurrencyExchangeJournalIdAsObject() {
        return currencyExchangeJournalIdAsObject;
    }

    public OdooId getCurrencyExchangeJournalId() {
        return currencyExchangeJournalId;
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

    public double getPoLead() {
        return poLead;
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

    public boolean getIsModuleAccountBankStatementImportOfx() {
        return isModuleAccountBankStatementImportOfx;
    }

    public Object getCompanyInformations() {
        return companyInformations;
    }

    public boolean getIsLockConfirmedPo() {
        return isLockConfirmedPo;
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

    public boolean getIsModuleWebsiteCrmIapReveal() {
        return isModuleWebsiteCrmIapReveal;
    }

    public boolean getIsModuleHrRecruitmentExtract() {
        return isModuleHrRecruitmentExtract;
    }

    public String getEmailPrimaryColor() {
        return emailPrimaryColor;
    }

    public boolean getIsGroupProjectStages() {
        return isGroupProjectStages;
    }

    public int getContractExpirationNoticePeriod() {
        return contractExpirationNoticePeriod;
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

    public Date getPredictiveLeadScoringStartDate() {
        return predictiveLeadScoringStartDate;
    }

    public boolean getIsUsePoLead() {
        return isUsePoLead;
    }

    public boolean getIsPortalConfirmationPay() {
        return isPortalConfirmationPay;
    }

    public boolean getIsModuleHrPayrollExpense() {
        return isModuleHrPayrollExpense;
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

    public Object getPoDoubleValidation() {
        return poDoubleValidation;
    }

    public boolean getIsPayInvoicesOnline() {
        return isPayInvoicesOnline;
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

    public boolean getIsModuleAccount3wayMatch() {
        return isModuleAccount3wayMatch;
    }

    public boolean getIsModuleAccountInterCompanyRules() {
        return isModuleAccountInterCompanyRules;
    }

    public boolean getIsCheckAccountAuditTrail() {
        return isCheckAccountAuditTrail;
    }

    public boolean getIsPreviewReady() {
        return isPreviewReady;
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

    public Account getAccountJournalEarlyPayDiscountLossAccountIdAsObject() {
        return accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public OdooId getAccountJournalEarlyPayDiscountLossAccountId() {
        return accountJournalEarlyPayDiscountLossAccountId;
    }

    public boolean getIsGroupShowPurchaseReceipts() {
        return isGroupShowPurchaseReceipts;
    }

    public boolean getIsModuleDelivery() {
        return isModuleDelivery;
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

    public boolean getIsPoOrderApproval() {
        return isPoOrderApproval;
    }

    public boolean getIsModuleAuthLdap() {
        return isModuleAuthLdap;
    }

    public boolean getIsShowEffect() {
        return isShowEffect;
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

    public Object getPoDoubleValidationAmount() {
        return poDoubleValidationAmount;
    }

    public boolean getIsModuleAccountBudget() {
        return isModuleAccountBudget;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
    }

    public boolean getIsModuleDeliveryBpost() {
        return isModuleDeliveryBpost;
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

    public Project getInternalProjectIdAsObject() {
        return internalProjectIdAsObject;
    }

    public OdooId getInternalProjectId() {
        return internalProjectId;
    }

    public boolean getIsModuleAccountExtract() {
        return isModuleAccountExtract;
    }

    public boolean getIsGroupUseRecurringRevenues() {
        return isGroupUseRecurringRevenues;
    }

    public boolean getIsSnailmailColor() {
        return isSnailmailColor;
    }

    public String getGoogleGmailClientIdentifier() {
        return googleGmailClientIdentifier;
    }

    public boolean getIsModuleDeliveryStarshipit() {
        return isModuleDeliveryStarshipit;
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

    public Object getPoLock() {
        return poLock;
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

    public String getTwilioAccountToken() {
        return twilioAccountToken;
    }

    public boolean getIsHrExpenseUseMailgateway() {
        return isHrExpenseUseMailgateway;
    }

    public boolean getIsModulePurchaseRequisition() {
        return isModulePurchaseRequisition;
    }

    public Object getInvoiceTerms() {
        return invoiceTerms;
    }

    public boolean getIsGroupSendReminder() {
        return isGroupSendReminder;
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

    public boolean getIsModuleAccountIntrastat() {
        return isModuleAccountIntrastat;
    }

    public boolean getIsModuleSms() {
        return isModuleSms;
    }

    public boolean getIsModuleSaleMargin() {
        return isModuleSaleMargin;
    }

    public boolean getIsModuleHrRecruitmentSurvey() {
        return isModuleHrRecruitmentSurvey;
    }

    public boolean getIsGroupSaleOrderTemplate() {
        return isGroupSaleOrderTemplate;
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

    public Object getCrmAutoAssignmentIntervalType() {
        return crmAutoAssignmentIntervalType;
    }

    public boolean getIsModulePartnerAutocomplete() {
        return isModulePartnerAutocomplete;
    }

    public boolean getIsModuleSaleAmazon() {
        return isModuleSaleAmazon;
    }

    public Object getDefaultPurchaseMethod() {
        return defaultPurchaseMethod;
    }

    public int getWorkPermitExpirationNoticePeriod() {
        return workPermitExpirationNoticePeriod;
    }

    public boolean getIsUseInvoiceTerms() {
        return isUseInvoiceTerms;
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

    public boolean getIsAutopostBills() {
        return isAutopostBills;
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

    public boolean getIsModuleVoip() {
        return isModuleVoip;
    }

    public boolean getIsModuleDeliveryShiprocket() {
        return isModuleDeliveryShiprocket;
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

    public boolean getIsDisplayInvoiceTaxCompanyCurrency() {
        return isDisplayInvoiceTaxCompanyCurrency;
    }

    public boolean getIsModuleCrmIapEnrich() {
        return isModuleCrmIapEnrich;
    }

    public boolean getIsModuleSaleProductMatrix() {
        return isModuleSaleProductMatrix;
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

    public boolean getIsModuleAccountIso20022() {
        return isModuleAccountIso20022;
    }

    public boolean getIsModuleDeliveryUsps() {
        return isModuleDeliveryUsps;
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

    public boolean getIsModulePurchaseProductMatrix() {
        return isModulePurchaseProductMatrix;
    }

    public boolean getIsIsRootCompany() {
        return isIsRootCompany;
    }

    public Object getLeadEnrichAuto() {
        return leadEnrichAuto;
    }

    public boolean getIsModuleSaleCommission() {
        return isModuleSaleCommission;
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

    public boolean getIsGroupProjectMilestone() {
        return isGroupProjectMilestone;
    }

    public boolean getIsGroupWarningSale() {
        return isGroupWarningSale;
    }

    public Object getAccountPriceInclude() {
        return accountPriceInclude;
    }

    public boolean getIsModuleL10nEuOss() {
        return isModuleL10nEuOss;
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

    public int getCrmAutoAssignmentIntervalNumber() {
        return crmAutoAssignmentIntervalNumber;
    }

    public int getCompanyCount() {
        return companyCount;
    }

    public Object getChartTemplate() {
        return chartTemplate;
    }

    public boolean getIsModuleHrTimesheet() {
        return isModuleHrTimesheet;
    }

    public boolean getIsGroupProjectRecurringTasks() {
        return isGroupProjectRecurringTasks;
    }

    public boolean getIsModuleDeliveryDhl() {
        return isModuleDeliveryDhl;
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

    public boolean getIsGroupWarningPurchase() {
        return isGroupWarningPurchase;
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

    public String getUnsplashAppId() {
        return unsplashAppId;
    }

    public boolean getIsIsMembershipMulti() {
        return isIsMembershipMulti;
    }

    public boolean getIsSnailmailCoverReadonly() {
        return isSnailmailCoverReadonly;
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

    public boolean getIsModuleWebsiteCfTurnstile() {
        return isModuleWebsiteCfTurnstile;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsModuleAccountBankStatementExtract(boolean isModuleAccountBankStatementExtract) {
        this.isModuleAccountBankStatementExtract = isModuleAccountBankStatementExtract;
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

    public void setCurrencyExchangeJournalIdAsObject(AccountJournal currencyExchangeJournalIdAsObject) {
        this.currencyExchangeJournalIdAsObject = currencyExchangeJournalIdAsObject;
    }

    public void setCurrencyExchangeJournalId(OdooId currencyExchangeJournalId) {
        this.currencyExchangeJournalId = currencyExchangeJournalId;
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

    public void setPoLead(double poLead) {
        this.poLead = poLead;
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

    public void setIsModuleAccountBankStatementImportOfx(boolean isModuleAccountBankStatementImportOfx) {
        this.isModuleAccountBankStatementImportOfx = isModuleAccountBankStatementImportOfx;
    }

    public void setCompanyInformations(Object companyInformations) {
        this.companyInformations = companyInformations;
    }

    public void setIsLockConfirmedPo(boolean isLockConfirmedPo) {
        this.isLockConfirmedPo = isLockConfirmedPo;
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

    public void setIsModuleWebsiteCrmIapReveal(boolean isModuleWebsiteCrmIapReveal) {
        this.isModuleWebsiteCrmIapReveal = isModuleWebsiteCrmIapReveal;
    }

    public void setIsModuleHrRecruitmentExtract(boolean isModuleHrRecruitmentExtract) {
        this.isModuleHrRecruitmentExtract = isModuleHrRecruitmentExtract;
    }

    public void setEmailPrimaryColor(String emailPrimaryColor) {
        this.emailPrimaryColor = emailPrimaryColor;
    }

    public void setIsGroupProjectStages(boolean isGroupProjectStages) {
        this.isGroupProjectStages = isGroupProjectStages;
    }

    public void setContractExpirationNoticePeriod(int contractExpirationNoticePeriod) {
        this.contractExpirationNoticePeriod = contractExpirationNoticePeriod;
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

    public void setPredictiveLeadScoringStartDate(Date predictiveLeadScoringStartDate) {
        this.predictiveLeadScoringStartDate = predictiveLeadScoringStartDate;
    }

    public void setIsUsePoLead(boolean isUsePoLead) {
        this.isUsePoLead = isUsePoLead;
    }

    public void setIsPortalConfirmationPay(boolean isPortalConfirmationPay) {
        this.isPortalConfirmationPay = isPortalConfirmationPay;
    }

    public void setIsModuleHrPayrollExpense(boolean isModuleHrPayrollExpense) {
        this.isModuleHrPayrollExpense = isModuleHrPayrollExpense;
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

    public void setPoDoubleValidation(Object poDoubleValidation) {
        this.poDoubleValidation = poDoubleValidation;
    }

    public void setIsPayInvoicesOnline(boolean isPayInvoicesOnline) {
        this.isPayInvoicesOnline = isPayInvoicesOnline;
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

    public void setIsModuleAccount3wayMatch(boolean isModuleAccount3wayMatch) {
        this.isModuleAccount3wayMatch = isModuleAccount3wayMatch;
    }

    public void setIsModuleAccountInterCompanyRules(boolean isModuleAccountInterCompanyRules) {
        this.isModuleAccountInterCompanyRules = isModuleAccountInterCompanyRules;
    }

    public void setIsCheckAccountAuditTrail(boolean isCheckAccountAuditTrail) {
        this.isCheckAccountAuditTrail = isCheckAccountAuditTrail;
    }

    public void setIsPreviewReady(boolean isPreviewReady) {
        this.isPreviewReady = isPreviewReady;
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

    public void setAccountJournalEarlyPayDiscountLossAccountIdAsObject(Account accountJournalEarlyPayDiscountLossAccountIdAsObject) {
        this.accountJournalEarlyPayDiscountLossAccountIdAsObject = accountJournalEarlyPayDiscountLossAccountIdAsObject;
    }

    public void setAccountJournalEarlyPayDiscountLossAccountId(OdooId accountJournalEarlyPayDiscountLossAccountId) {
        this.accountJournalEarlyPayDiscountLossAccountId = accountJournalEarlyPayDiscountLossAccountId;
    }

    public void setIsGroupShowPurchaseReceipts(boolean isGroupShowPurchaseReceipts) {
        this.isGroupShowPurchaseReceipts = isGroupShowPurchaseReceipts;
    }

    public void setIsModuleDelivery(boolean isModuleDelivery) {
        this.isModuleDelivery = isModuleDelivery;
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

    public void setIsPoOrderApproval(boolean isPoOrderApproval) {
        this.isPoOrderApproval = isPoOrderApproval;
    }

    public void setIsModuleAuthLdap(boolean isModuleAuthLdap) {
        this.isModuleAuthLdap = isModuleAuthLdap;
    }

    public void setIsShowEffect(boolean isShowEffect) {
        this.isShowEffect = isShowEffect;
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

    public void setPoDoubleValidationAmount(Object poDoubleValidationAmount) {
        this.poDoubleValidationAmount = poDoubleValidationAmount;
    }

    public void setIsModuleAccountBudget(boolean isModuleAccountBudget) {
        this.isModuleAccountBudget = isModuleAccountBudget;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
    }

    public void setIsModuleDeliveryBpost(boolean isModuleDeliveryBpost) {
        this.isModuleDeliveryBpost = isModuleDeliveryBpost;
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

    public void setInternalProjectIdAsObject(Project internalProjectIdAsObject) {
        this.internalProjectIdAsObject = internalProjectIdAsObject;
    }

    public void setInternalProjectId(OdooId internalProjectId) {
        this.internalProjectId = internalProjectId;
    }

    public void setIsModuleAccountExtract(boolean isModuleAccountExtract) {
        this.isModuleAccountExtract = isModuleAccountExtract;
    }

    public void setIsGroupUseRecurringRevenues(boolean isGroupUseRecurringRevenues) {
        this.isGroupUseRecurringRevenues = isGroupUseRecurringRevenues;
    }

    public void setIsSnailmailColor(boolean isSnailmailColor) {
        this.isSnailmailColor = isSnailmailColor;
    }

    public void setGoogleGmailClientIdentifier(String googleGmailClientIdentifier) {
        this.googleGmailClientIdentifier = googleGmailClientIdentifier;
    }

    public void setIsModuleDeliveryStarshipit(boolean isModuleDeliveryStarshipit) {
        this.isModuleDeliveryStarshipit = isModuleDeliveryStarshipit;
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

    public void setPoLock(Object poLock) {
        this.poLock = poLock;
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

    public void setTwilioAccountToken(String twilioAccountToken) {
        this.twilioAccountToken = twilioAccountToken;
    }

    public void setIsHrExpenseUseMailgateway(boolean isHrExpenseUseMailgateway) {
        this.isHrExpenseUseMailgateway = isHrExpenseUseMailgateway;
    }

    public void setIsModulePurchaseRequisition(boolean isModulePurchaseRequisition) {
        this.isModulePurchaseRequisition = isModulePurchaseRequisition;
    }

    public void setInvoiceTerms(Object invoiceTerms) {
        this.invoiceTerms = invoiceTerms;
    }

    public void setIsGroupSendReminder(boolean isGroupSendReminder) {
        this.isGroupSendReminder = isGroupSendReminder;
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

    public void setIsModuleAccountIntrastat(boolean isModuleAccountIntrastat) {
        this.isModuleAccountIntrastat = isModuleAccountIntrastat;
    }

    public void setIsModuleSms(boolean isModuleSms) {
        this.isModuleSms = isModuleSms;
    }

    public void setIsModuleSaleMargin(boolean isModuleSaleMargin) {
        this.isModuleSaleMargin = isModuleSaleMargin;
    }

    public void setIsModuleHrRecruitmentSurvey(boolean isModuleHrRecruitmentSurvey) {
        this.isModuleHrRecruitmentSurvey = isModuleHrRecruitmentSurvey;
    }

    public void setIsGroupSaleOrderTemplate(boolean isGroupSaleOrderTemplate) {
        this.isGroupSaleOrderTemplate = isGroupSaleOrderTemplate;
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

    public void setCrmAutoAssignmentIntervalType(Object crmAutoAssignmentIntervalType) {
        this.crmAutoAssignmentIntervalType = crmAutoAssignmentIntervalType;
    }

    public void setIsModulePartnerAutocomplete(boolean isModulePartnerAutocomplete) {
        this.isModulePartnerAutocomplete = isModulePartnerAutocomplete;
    }

    public void setIsModuleSaleAmazon(boolean isModuleSaleAmazon) {
        this.isModuleSaleAmazon = isModuleSaleAmazon;
    }

    public void setDefaultPurchaseMethod(Object defaultPurchaseMethod) {
        this.defaultPurchaseMethod = defaultPurchaseMethod;
    }

    public void setWorkPermitExpirationNoticePeriod(int workPermitExpirationNoticePeriod) {
        this.workPermitExpirationNoticePeriod = workPermitExpirationNoticePeriod;
    }

    public void setIsUseInvoiceTerms(boolean isUseInvoiceTerms) {
        this.isUseInvoiceTerms = isUseInvoiceTerms;
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

    public void setIsAutopostBills(boolean isAutopostBills) {
        this.isAutopostBills = isAutopostBills;
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

    public void setIsModuleVoip(boolean isModuleVoip) {
        this.isModuleVoip = isModuleVoip;
    }

    public void setIsModuleDeliveryShiprocket(boolean isModuleDeliveryShiprocket) {
        this.isModuleDeliveryShiprocket = isModuleDeliveryShiprocket;
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

    public void setIsDisplayInvoiceTaxCompanyCurrency(boolean isDisplayInvoiceTaxCompanyCurrency) {
        this.isDisplayInvoiceTaxCompanyCurrency = isDisplayInvoiceTaxCompanyCurrency;
    }

    public void setIsModuleCrmIapEnrich(boolean isModuleCrmIapEnrich) {
        this.isModuleCrmIapEnrich = isModuleCrmIapEnrich;
    }

    public void setIsModuleSaleProductMatrix(boolean isModuleSaleProductMatrix) {
        this.isModuleSaleProductMatrix = isModuleSaleProductMatrix;
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

    public void setIsModuleAccountIso20022(boolean isModuleAccountIso20022) {
        this.isModuleAccountIso20022 = isModuleAccountIso20022;
    }

    public void setIsModuleDeliveryUsps(boolean isModuleDeliveryUsps) {
        this.isModuleDeliveryUsps = isModuleDeliveryUsps;
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

    public void setIsModulePurchaseProductMatrix(boolean isModulePurchaseProductMatrix) {
        this.isModulePurchaseProductMatrix = isModulePurchaseProductMatrix;
    }

    public void setIsIsRootCompany(boolean isIsRootCompany) {
        this.isIsRootCompany = isIsRootCompany;
    }

    public void setLeadEnrichAuto(Object leadEnrichAuto) {
        this.leadEnrichAuto = leadEnrichAuto;
    }

    public void setIsModuleSaleCommission(boolean isModuleSaleCommission) {
        this.isModuleSaleCommission = isModuleSaleCommission;
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

    public void setIsGroupProjectMilestone(boolean isGroupProjectMilestone) {
        this.isGroupProjectMilestone = isGroupProjectMilestone;
    }

    public void setIsGroupWarningSale(boolean isGroupWarningSale) {
        this.isGroupWarningSale = isGroupWarningSale;
    }

    public void setAccountPriceInclude(Object accountPriceInclude) {
        this.accountPriceInclude = accountPriceInclude;
    }

    public void setIsModuleL10nEuOss(boolean isModuleL10nEuOss) {
        this.isModuleL10nEuOss = isModuleL10nEuOss;
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

    public void setCrmAutoAssignmentIntervalNumber(int crmAutoAssignmentIntervalNumber) {
        this.crmAutoAssignmentIntervalNumber = crmAutoAssignmentIntervalNumber;
    }

    public void setCompanyCount(int companyCount) {
        this.companyCount = companyCount;
    }

    public void setChartTemplate(Object chartTemplate) {
        this.chartTemplate = chartTemplate;
    }

    public void setIsModuleHrTimesheet(boolean isModuleHrTimesheet) {
        this.isModuleHrTimesheet = isModuleHrTimesheet;
    }

    public void setIsGroupProjectRecurringTasks(boolean isGroupProjectRecurringTasks) {
        this.isGroupProjectRecurringTasks = isGroupProjectRecurringTasks;
    }

    public void setIsModuleDeliveryDhl(boolean isModuleDeliveryDhl) {
        this.isModuleDeliveryDhl = isModuleDeliveryDhl;
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

    public void setIsGroupWarningPurchase(boolean isGroupWarningPurchase) {
        this.isGroupWarningPurchase = isGroupWarningPurchase;
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

    public void setUnsplashAppId(String unsplashAppId) {
        this.unsplashAppId = unsplashAppId;
    }

    public void setIsIsMembershipMulti(boolean isIsMembershipMulti) {
        this.isIsMembershipMulti = isIsMembershipMulti;
    }

    public void setIsSnailmailCoverReadonly(boolean isSnailmailCoverReadonly) {
        this.isSnailmailCoverReadonly = isSnailmailCoverReadonly;
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

    public void setIsModuleWebsiteCfTurnstile(boolean isModuleWebsiteCfTurnstile) {
        this.isModuleWebsiteCfTurnstile = isModuleWebsiteCfTurnstile;
    }



}