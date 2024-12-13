
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
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountMove;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.project.Project;
import ch.helvethink.odoo4java.models.project.ProjectTask;
import ch.helvethink.odoo4java.models.res.country.ResCountryState;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerCategory;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerIndustry;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerTitle;
import ch.helvethink.odoo4java.models.res.users.ResUsersApikeys;
import ch.helvethink.odoo4java.models.res.users.ResUsersLog;
import ch.helvethink.odoo4java.models.res.users.ResUsersSettings;
import ch.helvethink.odoo4java.models.resource.Resource;
import ch.helvethink.odoo4java.models.resource.ResourceCalendar;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.users")
public class ResUsers implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResCountryState privateStateIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("private_state_id")
        private OdooId privateStateId;
    

    
        private ResPartnerBank employeeBankAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("employee_bank_account_id")
        private OdooId employeeBankAccountId;
    

    
        @JsonProperty("sel_groups_23_26")
        private Object selGroups2326;
    

    
        @JsonProperty("avatar_1920")
        private Object avatar1920;
    

    
        private List<AccountMove> invoiceIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("invoice_ids")
        private List<Integer> invoiceIds;
    

    
        @JsonProperty("work_phone")
        private String workPhone;
    

    
        @JsonProperty("spouse_birthdate")
        private Date spouseBirthdate;
    

    
        @JsonProperty("tour_enabled")
        private boolean isTourEnabled;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("display_invoice_template_pdf_report_id")
        private boolean isDisplayInvoiceTemplatePdfReportId;
    

    
        @JsonProperty("password")
        private String password;
    

    
        @JsonProperty("identification_id")
        private String identificationId;
    

    
        @JsonProperty("state")
        private Object state;
    

    
        private List<Resource> resourceIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.Resource")
        @OdooModel("resource.Resource")
        @JsonProperty("resource_ids")
        private List<Integer> resourceIds;
    

    
        @JsonProperty("purchase_warn")
        private Object purchaseWarn;
    

    
        @JsonProperty("journal_item_count")
        private int journalItemCount;
    

    
        @JsonProperty("is_system")
        private boolean isIsSystem;
    

    
        @JsonProperty("sel_groups_39_40")
        private Object selGroups3940;
    

    
        @JsonProperty("fiscal_country_codes")
        private String fiscalCountryCodes;
    

    
        @JsonProperty("credit_to_invoice")
        private Object creditToInvoice;
    

    
        @JsonProperty("sel_groups_2_4")
        private Object selGroups24;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("is_blacklisted")
        private boolean isIsBlacklisted;
    

    
        @JsonProperty("spouse_complete_name")
        private String spouseCompleteName;
    

    
        @JsonProperty("permit_no")
        private String permitNo;
    

    
        private AccountPaymentTerm propertyPaymentTermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
        @JsonProperty("property_payment_term_id")
        private OdooId propertyPaymentTermId;
    

    
        @JsonProperty("company_name")
        private String companyName;
    

    
        private ResourceCalendar employeeResourceCalendarIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("employee_resource_calendar_id")
        private OdooId employeeResourceCalendarId;
    

    
        @JsonProperty("days_sales_outstanding")
        private double daysSalesOutstanding;
    

    
        @JsonProperty("notification_type")
        private Object notificationType;
    

    
        @JsonProperty("odoobot_state")
        private Object odoobotState;
    

    
        private List<ResCompany> companyIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_ids")
        private List<Integer> companyIds;
    

    
        @JsonProperty("im_status")
        private String imStatus;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers leaveManagerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("leave_manager_id")
        private OdooId leaveManagerId;
    

    
        @JsonProperty("totp_enabled")
        private boolean isTotpEnabled;
    

    
        @JsonProperty("avatar_1024")
        private Object avatar1024;
    

    
        @JsonProperty("phone_mobile_search")
        private String phoneMobileSearch;
    

    
        @JsonProperty("sel_groups_33")
        private Object selGroups33;
    

    
        private ResUsers expenseManagerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("expense_manager_id")
        private OdooId expenseManagerId;
    

    
        @JsonProperty("sel_groups_32")
        private Object selGroups32;
    

    
        @JsonProperty("sel_groups_56_57")
        private Object selGroups5657;
    

    
        private List<ResPartnerCategory> categoryIdAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
        @JsonProperty("category_id")
        private List<Integer> categoryId;
    

    
        private ResCountry countryOfBirthAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_of_birth")
        private OdooId countryOfBirth;
    

    
        @JsonProperty("hr_icon_display")
        private Object hrIconDisplay;
    

    
        private AccountFiscalPosition propertyAccountPositionIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
        @JsonProperty("property_account_position_id")
        private OdooId propertyAccountPositionId;
    

    
        @JsonProperty("email")
        private String email;
    

    
        @JsonProperty("website")
        private String website;
    

    
        @JsonProperty("supplier_invoice_count")
        private int supplierInvoiceCount;
    

    
        private List<AccountAnalyticAccount> contractIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("contract_ids")
        private List<Integer> contractIds;
    

    
        @JsonProperty("private_street2")
        private String privateStreet2;
    

    
        @JsonProperty("company_registry")
        private String companyRegistry;
    

    
        private List<ResUsers> userIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_ids")
        private List<Integer> userIds;
    

    
        @JsonProperty("invoice_sending_method")
        private Object invoiceSendingMethod;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("payment_token_count")
        private int paymentTokenCount;
    

    
        @JsonProperty("is_public")
        private boolean isIsPublic;
    

    
        @JsonProperty("is_company")
        private boolean isIsCompany;
    

    
        @JsonProperty("sel_groups_51_52")
        private Object selGroups5152;
    

    
        @JsonProperty("companies_count")
        private int companiesCount;
    

    
        @JsonProperty("company_type")
        private Object companyType;
    

    
        @JsonProperty("sale_warn")
        private Object saleWarn;
    

    
        @JsonProperty("tz")
        private Object tz;
    

    
        @JsonProperty("rules_count")
        private int rulesCount;
    

    
        @JsonProperty("private_lang")
        private Object privateLang;
    

    
        private ResUsers buyerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("buyer_id")
        private OdooId buyerId;
    

    
        private ResUsersSettings resUsersSettingsIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.users.ResUsersSettings")
        @OdooModel("res.users.ResUsersSettings")
        @JsonProperty("res_users_settings_id")
        private OdooId resUsersSettingsId;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("partner_share")
        private boolean isPartnerShare;
    

    
        @JsonProperty("task_count")
        private int taskCount;
    

    
        private ResCurrency propertyPurchaseCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("property_purchase_currency_id")
        private OdooId propertyPurchaseCurrencyId;
    

    
        @JsonProperty("ref")
        private String ref;
    

    
        @JsonProperty("tz_offset")
        private String tzOffset;
    

    
        @JsonProperty("commercial_company_name")
        private String commercialCompanyName;
    

    
        @JsonProperty("in_group_72")
        private boolean isInGroup72;
    

    
        @JsonProperty("in_group_71")
        private boolean isInGroup71;
    

    
        @JsonProperty("in_group_70")
        private boolean isInGroup70;
    

    
        @JsonProperty("job_title")
        private String jobTitle;
    

    
        @JsonProperty("barcode")
        private String barcode;
    

    
        @JsonProperty("target_sales_invoiced")
        private int targetSalesInvoiced;
    

    
        @JsonProperty("partner_vat_placeholder")
        private String partnerVatPlaceholder;
    

    
        private AccountPaymentMethodLine propertyOutboundPaymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("property_outbound_payment_method_line_id")
        private OdooId propertyOutboundPaymentMethodLineId;
    

    
        @JsonProperty("opportunity_count")
        private int opportunityCount;
    

    
        @JsonProperty("reminder_date_before_receipt")
        private int reminderDateBeforeReceipt;
    

    
        @JsonProperty("active_partner")
        private boolean isActivePartner;
    

    
        private ResPartner addressIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("address_id")
        private OdooId addressId;
    

    
        @JsonProperty("allocation_display")
        private String allocationDisplay;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("in_group_69")
        private boolean isInGroup69;
    

    
        @JsonProperty("in_group_68")
        private boolean isInGroup68;
    

    
        @JsonProperty("in_group_64")
        private boolean isInGroup64;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private ResPartner sameVatPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("same_vat_partner_id")
        private OdooId sameVatPartnerId;
    

    
        @JsonProperty("current_leave_state")
        private Object currentLeaveState;
    

    
        @JsonProperty("trust")
        private Object trust;
    

    
        @JsonProperty("work_email")
        private String workEmail;
    

    
        private ResPartnerIndustry industryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerIndustry")
        @OdooModel("res.partner.ResPartnerIndustry")
        @JsonProperty("industry_id")
        private OdooId industryId;
    

    
        @JsonProperty("image_256")
        private Object image256;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("debit_limit")
        private Object debitLimit;
    

    
        @JsonProperty("in_group_6")
        private boolean isInGroup6;
    

    
        @JsonProperty("in_group_7")
        private boolean isInGroup7;
    

    
        @JsonProperty("in_group_8")
        private boolean isInGroup8;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("in_group_9")
        private boolean isInGroup9;
    

    
        @JsonProperty("avatar_512")
        private Object avatar512;
    

    
        private ResPartnerTitle titleAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerTitle")
        @OdooModel("res.partner.ResPartnerTitle")
        @JsonProperty("title")
        private OdooId title;
    

    
        @JsonProperty("allocation_count")
        private double allocationCount;
    

    
        @JsonProperty("in_group_3")
        private boolean isInGroup3;
    

    
        private List<ResGroups> groupsIdAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResGroups")
        @OdooModel("res.ResGroups")
        @JsonProperty("groups_id")
        private List<Integer> groupsId;
    

    
        @JsonProperty("in_group_5")
        private boolean isInGroup5;
    

    
        @JsonProperty("emergency_phone")
        private String emergencyPhone;
    

    
        private Account propertyAccountPayableIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("property_account_payable_id")
        private OdooId propertyAccountPayableId;
    

    
        @JsonProperty("complete_name")
        private String completeName;
    

    
        @JsonProperty("last_activity")
        private Date lastActivity;
    

    
        @JsonProperty("street")
        private String street;
    

    
        @JsonProperty("calendar_last_notif_ack")
        private Date calendarLastNotifAck;
    

    
        @JsonProperty("in_group_53")
        private boolean isInGroup53;
    

    
        @JsonProperty("in_group_50")
        private boolean isInGroup50;
    

    
        @JsonProperty("sel_groups_61_62_63")
        private Object selGroups616263;
    

    
        @JsonProperty("contact_address")
        private String contactAddress;
    

    
        @JsonProperty("image_1024")
        private Object image1024;
    

    
        @JsonProperty("target_sales_done")
        private int targetSalesDone;
    

    
        @JsonProperty("partner_latitude")
        private double partnerLatitude;
    

    
        @JsonProperty("mobile")
        private String mobile;
    

    
        @JsonProperty("private_phone")
        private String privatePhone;
    

    
        @JsonProperty("signup_type")
        private String signupType;
    

    
        @JsonProperty("in_group_49")
        private boolean isInGroup49;
    

    
        @JsonProperty("marital")
        private Object marital;
    

    
        @JsonProperty("sale_warn_msg")
        private Object saleWarnMsg;
    

    
        @JsonProperty("in_group_46")
        private boolean isInGroup46;
    

    
        @JsonProperty("in_group_45")
        private boolean isInGroup45;
    

    
        @JsonProperty("in_group_44")
        private boolean isInGroup44;
    

    
        @JsonProperty("user_group_warning")
        private Object userGroupWarning;
    

    
        @JsonProperty("in_group_43")
        private boolean isInGroup43;
    

    
        @JsonProperty("in_group_42")
        private boolean isInGroup42;
    

    
        @JsonProperty("new_password")
        private String newPassword;
    

    
        @JsonProperty("study_field")
        private String studyField;
    

    
        @JsonProperty("in_group_41")
        private boolean isInGroup41;
    

    
        @JsonProperty("comment")
        private Object comment;
    

    
        @JsonProperty("supplier_rank")
        private int supplierRank;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("employees_count")
        private int employeesCount;
    

    
        @JsonProperty("image_128")
        private Object image128;
    

    
        private ResPartner sameCompanyRegistryPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("same_company_registry_partner_id")
        private OdooId sameCompanyRegistryPartnerId;
    

    
        @JsonProperty("sel_groups_65_66_67")
        private Object selGroups656667;
    

    
        private List<ResPartnerBank> bankIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("bank_ids")
        private List<Integer> bankIds;
    

    
        @JsonProperty("purchase_warn_msg")
        private Object purchaseWarnMsg;
    

    
        @JsonProperty("private_city")
        private String privateCity;
    

    
        @JsonProperty("login_date")
        private Date loginDate;
    

    
        @JsonProperty("type")
        private Object type;
    

    
        @JsonProperty("peppol_eas")
        private Object peppolEas;
    

    
        @JsonProperty("target_sales_won")
        private int targetSalesWon;
    

    
        @JsonProperty("in_group_29")
        private boolean isInGroup29;
    

    
        @JsonProperty("passport_id")
        private String passportId;
    

    
        @JsonProperty("in_group_28")
        private boolean isInGroup28;
    

    
        @JsonProperty("in_group_38")
        private boolean isInGroup38;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("in_group_37")
        private boolean isInGroup37;
    

    
        @JsonProperty("purchase_order_count")
        private int purchaseOrderCount;
    

    
        @JsonProperty("sel_groups_54_55")
        private Object selGroups5455;
    

    
        @JsonProperty("children")
        private int children;
    

    
        @JsonProperty("is_peppol_edi_format")
        private boolean isIsPeppolEdiFormat;
    

    
        @JsonProperty("is_ubl_format")
        private boolean isIsUblFormat;
    

    
        @JsonProperty("in_group_31")
        private boolean isInGroup31;
    

    
        @JsonProperty("in_group_30")
        private boolean isInGroup30;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("message_bounce")
        private int messageBounce;
    

    
        private ResCountryState stateIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("state_id")
        private OdooId stateId;
    

    
        @JsonProperty("bank_account_count")
        private int bankAccountCount;
    

    
        private AccountPaymentMethodLine propertyInboundPaymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("property_inbound_payment_method_line_id")
        private OdooId propertyInboundPaymentMethodLineId;
    

    
        @JsonProperty("private_email")
        private String privateEmail;
    

    
        @JsonProperty("employee_count")
        private int employeeCount;
    

    
        @JsonProperty("zip")
        private String zip;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("ssnid")
        private String ssnid;
    

    
        @JsonProperty("is_absent")
        private boolean isIsAbsent;
    

    
        @JsonProperty("vat")
        private String vat;
    

    
        @JsonProperty("distance_home_work_unit")
        private Object distanceHomeWorkUnit;
    

    
        @JsonProperty("image_1920")
        private Object image1920;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("sel_groups_34_35_36")
        private Object selGroups343536;
    

    
        @JsonProperty("in_group_19")
        private boolean isInGroup19;
    

    
        @JsonProperty("in_group_18")
        private boolean isInGroup18;
    

    
        @JsonProperty("in_group_17")
        private boolean isInGroup17;
    

    
        @JsonProperty("in_group_27")
        private boolean isInGroup27;
    

    
        @JsonProperty("employee_type")
        private Object employeeType;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("phone")
        private String phone;
    

    
        @JsonProperty("additional_info")
        private String additionalInfo;
    

    
        @JsonProperty("in_group_21")
        private boolean isInGroup21;
    

    
        @JsonProperty("contact_address_inline")
        private String contactAddressInline;
    

    
        @JsonProperty("in_group_20")
        private boolean isInGroup20;
    

    
        @JsonProperty("peppol_endpoint")
        private String peppolEndpoint;
    

    
        private ResCountry countryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_id")
        private OdooId countryId;
    

    
        private List<ResUsersSettings> resUsersSettingsIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.users.ResUsersSettings")
        @OdooModel("res.users.ResUsersSettings")
        @JsonProperty("res_users_settings_ids")
        private List<Integer> resUsersSettingsIds;
    

    
        @JsonProperty("gender")
        private Object gender;
    

    
        private List<ResCompany> refCompanyIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("ref_company_ids")
        private List<Integer> refCompanyIds;
    

    
        @JsonProperty("signature")
        private Object signature;
    

    
        @JsonProperty("city")
        private String city;
    

    
        @JsonProperty("login")
        private String login;
    

    
        private List<ResPartner> childIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("child_ids")
        private List<Integer> childIds;
    

    
        @JsonProperty("vehicle")
        private String vehicle;
    

    
        @JsonProperty("create_employee")
        private boolean isCreateEmployee;
    

    
        @JsonProperty("in_group_16")
        private boolean isInGroup16;
    

    
        @JsonProperty("leave_date_to")
        private Date leaveDateTo;
    

    
        @JsonProperty("in_group_15")
        private boolean isInGroup15;
    

    
        @JsonProperty("autopost_bills")
        private Object autopostBills;
    

    
        @JsonProperty("in_group_14")
        private boolean isInGroup14;
    

    
        @JsonProperty("invoice_edi_format_store")
        private String invoiceEdiFormatStore;
    

    
        @JsonProperty("in_group_12")
        private boolean isInGroup12;
    

    
        private ResPartner commercialPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("commercial_partner_id")
        private OdooId commercialPartnerId;
    

    
        @JsonProperty("share")
        private boolean isShare;
    

    
        @JsonProperty("use_partner_credit_limit")
        private boolean isUsePartnerCreditLimit;
    

    
        @JsonProperty("street2")
        private String street2;
    

    
        @JsonProperty("debit")
        private Object debit;
    

    
        private List<ResUsersLog> logIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.users.ResUsersLog")
        @OdooModel("res.users.ResUsersLog")
        @JsonProperty("log_ids")
        private List<Integer> logIds;
    

    
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
    

    
        @JsonProperty("invoice_warn_msg")
        private Object invoiceWarnMsg;
    

    
        @JsonProperty("ignore_abnormal_invoice_amount")
        private boolean isIgnoreAbnormalInvoiceAmount;
    

    
        private List<ResUsersApikeys> apiKeyIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.users.ResUsersApikeys")
        @OdooModel("res.users.ResUsersApikeys")
        @JsonProperty("api_key_ids")
        private List<Integer> apiKeyIds;
    

    
        @JsonProperty("can_edit")
        private boolean isCanEdit;
    

    
        private List<ProjectTask> taskIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("task_ids")
        private List<Integer> taskIds;
    

    
        private List<Project> projectIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("project_ids")
        private List<Integer> projectIds;
    

    
        @JsonProperty("show_credit_limit")
        private boolean isShowCreditLimit;
    

    
        @JsonProperty("work_location_name")
        private String workLocationName;
    

    
        @JsonProperty("last_activity_time")
        private String lastActivityTime;
    

    
        @JsonProperty("sale_order_count")
        private int saleOrderCount;
    

    
        private ResPartner selfAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("self")
        private OdooId self;
    

    
        @JsonProperty("show_leaves")
        private boolean isShowLeaves;
    

    
        private ResPartner workContactIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("work_contact_id")
        private OdooId workContactId;
    

    
        @JsonProperty("parent_name")
        private String parentName;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("phone_blacklisted")
        private boolean isPhoneBlacklisted;
    

    
        private ResCountry privateCountryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("private_country_id")
        private OdooId privateCountryId;
    

    
        @JsonProperty("mobile_blacklisted")
        private boolean isMobileBlacklisted;
    

    
        @JsonProperty("odoobot_failed")
        private boolean isOdoobotFailed;
    

    
        @JsonProperty("employee")
        private boolean isEmployee;
    

    
        @JsonProperty("partner_longitude")
        private double partnerLongitude;
    

    
        @JsonProperty("work_location_type")
        private Object workLocationType;
    

    
        @JsonProperty("invoice_warn")
        private Object invoiceWarn;
    

    
        @JsonProperty("avatar_256")
        private Object avatar256;
    

    
        @JsonProperty("meeting_count")
        private int meetingCount;
    

    
        @JsonProperty("pin")
        private String pin;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("function")
        private String function;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("credit")
        private Object credit;
    

    
        @JsonProperty("image_512")
        private Object image512;
    

    
        @JsonProperty("sel_groups_13")
        private Object selGroups13;
    

    
        @JsonProperty("private_street")
        private String privateStreet;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("hr_presence_state")
        private Object hrPresenceState;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("avatar_128")
        private Object avatar128;
    

    
        @JsonProperty("visa_no")
        private String visaNo;
    

    
        private ResPartner parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("ignore_abnormal_invoice_date")
        private boolean isIgnoreAbnormalInvoiceDate;
    

    
        @JsonProperty("total_invoiced")
        private Object totalInvoiced;
    

    
        @JsonProperty("receipt_reminder_email")
        private boolean isReceiptReminderEmail;
    

    
        @JsonProperty("email_normalized")
        private String emailNormalized;
    

    
        private ResCountry employeeCountryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("employee_country_id")
        private OdooId employeeCountryId;
    

    
        @JsonProperty("birthday")
        private Date birthday;
    

    
        private ResPartnerBank bankAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("bank_account_id")
        private OdooId bankAccountId;
    

    
        @JsonProperty("sel_groups_58_59_60")
        private Object selGroups585960;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("allocation_remaining_display")
        private String allocationRemainingDisplay;
    

    
        @JsonProperty("active_lang_count")
        private int activeLangCount;
    

    
        @JsonProperty("distance_home_work")
        private int distanceHomeWork;
    

    
        @JsonProperty("display_invoice_edi_format")
        private boolean isDisplayInvoiceEdiFormat;
    

    
        @JsonProperty("accesses_count")
        private int accessesCount;
    

    
        @JsonProperty("groups_count")
        private int groupsCount;
    

    
        @JsonProperty("sel_groups_1_10_11")
        private Object selGroups11011;
    

    
        @JsonProperty("certificate")
        private Object certificate;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("study_school")
        private String studySchool;
    

    
        @JsonProperty("invoice_edi_format")
        private Object invoiceEdiFormat;
    

    
        @JsonProperty("customer_rank")
        private int customerRank;
    

    
        @JsonProperty("calendar_default_privacy")
        private Object calendarDefaultPrivacy;
    

    
        @JsonProperty("mobile_phone")
        private String mobilePhone;
    

    
        @JsonProperty("partner_gid")
        private int partnerGid;
    

    
        @JsonProperty("credit_limit")
        private double creditLimit;
    

    
        private List<ResDevice> deviceIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResDevice")
        @OdooModel("res.ResDevice")
        @JsonProperty("device_ids")
        private List<Integer> deviceIds;
    

    
        @JsonProperty("lang")
        private Object lang;
    

    
        @JsonProperty("email_formatted")
        private String emailFormatted;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("sel_groups_47_48")
        private Object selGroups4748;
    

    
        @JsonProperty("duplicated_bank_account_partners_count")
        private int duplicatedBankAccountPartnersCount;
    

    
        private Account propertyAccountReceivableIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("property_account_receivable_id")
        private OdooId propertyAccountReceivableId;
    

    
        @JsonProperty("private_zip")
        private String privateZip;
    

    
        @JsonProperty("phone_sanitized_blacklisted")
        private boolean isPhoneSanitizedBlacklisted;
    

    
        @JsonProperty("visa_expire")
        private Date visaExpire;
    

    
        @JsonProperty("place_of_birth")
        private String placeOfBirth;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("km_home_work")
        private int kmHomeWork;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        private AccountPaymentTerm propertySupplierPaymentTermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
        @JsonProperty("property_supplier_payment_term_id")
        private OdooId propertySupplierPaymentTermId;
    

    
        @JsonProperty("phone_sanitized")
        private String phoneSanitized;
    

    
        @JsonProperty("emergency_contact")
        private String emergencyContact;
    

    
        @JsonProperty("additional_note")
        private Object additionalNote;
    


    public ResUsers() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResCountryState getPrivateStateIdAsObject() {
        return privateStateIdAsObject;
    }

    public OdooId getPrivateStateId() {
        return privateStateId;
    }

    public ResPartnerBank getEmployeeBankAccountIdAsObject() {
        return employeeBankAccountIdAsObject;
    }

    public OdooId getEmployeeBankAccountId() {
        return employeeBankAccountId;
    }

    public Object getSelGroups2326() {
        return selGroups2326;
    }

    public Object getAvatar1920() {
        return avatar1920;
    }

    public List<AccountMove> getInvoiceIdsAsList() {
        return invoiceIdsAsList;
    }

    public List<Integer> getInvoiceIds() {
        return invoiceIds;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public Date getSpouseBirthdate() {
        return spouseBirthdate;
    }

    public boolean getIsTourEnabled() {
        return isTourEnabled;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public boolean getIsDisplayInvoiceTemplatePdfReportId() {
        return isDisplayInvoiceTemplatePdfReportId;
    }

    public String getPassword() {
        return password;
    }

    public String getIdentificationId() {
        return identificationId;
    }

    public Object getState() {
        return state;
    }

    public List<Resource> getResourceIdsAsList() {
        return resourceIdsAsList;
    }

    public List<Integer> getResourceIds() {
        return resourceIds;
    }

    public Object getPurchaseWarn() {
        return purchaseWarn;
    }

    public int getJournalItemCount() {
        return journalItemCount;
    }

    public boolean getIsIsSystem() {
        return isIsSystem;
    }

    public Object getSelGroups3940() {
        return selGroups3940;
    }

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public Object getCreditToInvoice() {
        return creditToInvoice;
    }

    public Object getSelGroups24() {
        return selGroups24;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean getIsIsBlacklisted() {
        return isIsBlacklisted;
    }

    public String getSpouseCompleteName() {
        return spouseCompleteName;
    }

    public String getPermitNo() {
        return permitNo;
    }

    public AccountPaymentTerm getPropertyPaymentTermIdAsObject() {
        return propertyPaymentTermIdAsObject;
    }

    public OdooId getPropertyPaymentTermId() {
        return propertyPaymentTermId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ResourceCalendar getEmployeeResourceCalendarIdAsObject() {
        return employeeResourceCalendarIdAsObject;
    }

    public OdooId getEmployeeResourceCalendarId() {
        return employeeResourceCalendarId;
    }

    public double getDaysSalesOutstanding() {
        return daysSalesOutstanding;
    }

    public Object getNotificationType() {
        return notificationType;
    }

    public Object getOdoobotState() {
        return odoobotState;
    }

    public List<ResCompany> getCompanyIdsAsList() {
        return companyIdsAsList;
    }

    public List<Integer> getCompanyIds() {
        return companyIds;
    }

    public String getImStatus() {
        return imStatus;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getLeaveManagerIdAsObject() {
        return leaveManagerIdAsObject;
    }

    public OdooId getLeaveManagerId() {
        return leaveManagerId;
    }

    public boolean getIsTotpEnabled() {
        return isTotpEnabled;
    }

    public Object getAvatar1024() {
        return avatar1024;
    }

    public String getPhoneMobileSearch() {
        return phoneMobileSearch;
    }

    public Object getSelGroups33() {
        return selGroups33;
    }

    public ResUsers getExpenseManagerIdAsObject() {
        return expenseManagerIdAsObject;
    }

    public OdooId getExpenseManagerId() {
        return expenseManagerId;
    }

    public Object getSelGroups32() {
        return selGroups32;
    }

    public Object getSelGroups5657() {
        return selGroups5657;
    }

    public List<ResPartnerCategory> getCategoryIdAsList() {
        return categoryIdAsList;
    }

    public List<Integer> getCategoryId() {
        return categoryId;
    }

    public ResCountry getCountryOfBirthAsObject() {
        return countryOfBirthAsObject;
    }

    public OdooId getCountryOfBirth() {
        return countryOfBirth;
    }

    public Object getHrIconDisplay() {
        return hrIconDisplay;
    }

    public AccountFiscalPosition getPropertyAccountPositionIdAsObject() {
        return propertyAccountPositionIdAsObject;
    }

    public OdooId getPropertyAccountPositionId() {
        return propertyAccountPositionId;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public int getSupplierInvoiceCount() {
        return supplierInvoiceCount;
    }

    public List<AccountAnalyticAccount> getContractIdsAsList() {
        return contractIdsAsList;
    }

    public List<Integer> getContractIds() {
        return contractIds;
    }

    public String getPrivateStreet2() {
        return privateStreet2;
    }

    public String getCompanyRegistry() {
        return companyRegistry;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public Object getInvoiceSendingMethod() {
        return invoiceSendingMethod;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public int getPaymentTokenCount() {
        return paymentTokenCount;
    }

    public boolean getIsIsPublic() {
        return isIsPublic;
    }

    public boolean getIsIsCompany() {
        return isIsCompany;
    }

    public Object getSelGroups5152() {
        return selGroups5152;
    }

    public int getCompaniesCount() {
        return companiesCount;
    }

    public Object getCompanyType() {
        return companyType;
    }

    public Object getSaleWarn() {
        return saleWarn;
    }

    public Object getTz() {
        return tz;
    }

    public int getRulesCount() {
        return rulesCount;
    }

    public Object getPrivateLang() {
        return privateLang;
    }

    public ResUsers getBuyerIdAsObject() {
        return buyerIdAsObject;
    }

    public OdooId getBuyerId() {
        return buyerId;
    }

    public ResUsersSettings getResUsersSettingsIdAsObject() {
        return resUsersSettingsIdAsObject;
    }

    public OdooId getResUsersSettingsId() {
        return resUsersSettingsId;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public boolean getIsPartnerShare() {
        return isPartnerShare;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public ResCurrency getPropertyPurchaseCurrencyIdAsObject() {
        return propertyPurchaseCurrencyIdAsObject;
    }

    public OdooId getPropertyPurchaseCurrencyId() {
        return propertyPurchaseCurrencyId;
    }

    public String getRef() {
        return ref;
    }

    public String getTzOffset() {
        return tzOffset;
    }

    public String getCommercialCompanyName() {
        return commercialCompanyName;
    }

    public boolean getIsInGroup72() {
        return isInGroup72;
    }

    public boolean getIsInGroup71() {
        return isInGroup71;
    }

    public boolean getIsInGroup70() {
        return isInGroup70;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getTargetSalesInvoiced() {
        return targetSalesInvoiced;
    }

    public String getPartnerVatPlaceholder() {
        return partnerVatPlaceholder;
    }

    public AccountPaymentMethodLine getPropertyOutboundPaymentMethodLineIdAsObject() {
        return propertyOutboundPaymentMethodLineIdAsObject;
    }

    public OdooId getPropertyOutboundPaymentMethodLineId() {
        return propertyOutboundPaymentMethodLineId;
    }

    public int getOpportunityCount() {
        return opportunityCount;
    }

    public int getReminderDateBeforeReceipt() {
        return reminderDateBeforeReceipt;
    }

    public boolean getIsActivePartner() {
        return isActivePartner;
    }

    public ResPartner getAddressIdAsObject() {
        return addressIdAsObject;
    }

    public OdooId getAddressId() {
        return addressId;
    }

    public String getAllocationDisplay() {
        return allocationDisplay;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean getIsInGroup69() {
        return isInGroup69;
    }

    public boolean getIsInGroup68() {
        return isInGroup68;
    }

    public boolean getIsInGroup64() {
        return isInGroup64;
    }

    public String getName() {
        return name;
    }

    public ResPartner getSameVatPartnerIdAsObject() {
        return sameVatPartnerIdAsObject;
    }

    public OdooId getSameVatPartnerId() {
        return sameVatPartnerId;
    }

    public Object getCurrentLeaveState() {
        return currentLeaveState;
    }

    public Object getTrust() {
        return trust;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public ResPartnerIndustry getIndustryIdAsObject() {
        return industryIdAsObject;
    }

    public OdooId getIndustryId() {
        return industryId;
    }

    public Object getImage256() {
        return image256;
    }

    public int getColor() {
        return color;
    }

    public Object getDebitLimit() {
        return debitLimit;
    }

    public boolean getIsInGroup6() {
        return isInGroup6;
    }

    public boolean getIsInGroup7() {
        return isInGroup7;
    }

    public boolean getIsInGroup8() {
        return isInGroup8;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public boolean getIsInGroup9() {
        return isInGroup9;
    }

    public Object getAvatar512() {
        return avatar512;
    }

    public ResPartnerTitle getTitleAsObject() {
        return titleAsObject;
    }

    public OdooId getTitle() {
        return title;
    }

    public double getAllocationCount() {
        return allocationCount;
    }

    public boolean getIsInGroup3() {
        return isInGroup3;
    }

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public boolean getIsInGroup5() {
        return isInGroup5;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public Account getPropertyAccountPayableIdAsObject() {
        return propertyAccountPayableIdAsObject;
    }

    public OdooId getPropertyAccountPayableId() {
        return propertyAccountPayableId;
    }

    public String getCompleteName() {
        return completeName;
    }

    public Date getLastActivity() {
        return lastActivity;
    }

    public String getStreet() {
        return street;
    }

    public Date getCalendarLastNotifAck() {
        return calendarLastNotifAck;
    }

    public boolean getIsInGroup53() {
        return isInGroup53;
    }

    public boolean getIsInGroup50() {
        return isInGroup50;
    }

    public Object getSelGroups616263() {
        return selGroups616263;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public Object getImage1024() {
        return image1024;
    }

    public int getTargetSalesDone() {
        return targetSalesDone;
    }

    public double getPartnerLatitude() {
        return partnerLatitude;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public String getSignupType() {
        return signupType;
    }

    public boolean getIsInGroup49() {
        return isInGroup49;
    }

    public Object getMarital() {
        return marital;
    }

    public Object getSaleWarnMsg() {
        return saleWarnMsg;
    }

    public boolean getIsInGroup46() {
        return isInGroup46;
    }

    public boolean getIsInGroup45() {
        return isInGroup45;
    }

    public boolean getIsInGroup44() {
        return isInGroup44;
    }

    public Object getUserGroupWarning() {
        return userGroupWarning;
    }

    public boolean getIsInGroup43() {
        return isInGroup43;
    }

    public boolean getIsInGroup42() {
        return isInGroup42;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getStudyField() {
        return studyField;
    }

    public boolean getIsInGroup41() {
        return isInGroup41;
    }

    public Object getComment() {
        return comment;
    }

    public int getSupplierRank() {
        return supplierRank;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public Object getImage128() {
        return image128;
    }

    public ResPartner getSameCompanyRegistryPartnerIdAsObject() {
        return sameCompanyRegistryPartnerIdAsObject;
    }

    public OdooId getSameCompanyRegistryPartnerId() {
        return sameCompanyRegistryPartnerId;
    }

    public Object getSelGroups656667() {
        return selGroups656667;
    }

    public List<ResPartnerBank> getBankIdsAsList() {
        return bankIdsAsList;
    }

    public List<Integer> getBankIds() {
        return bankIds;
    }

    public Object getPurchaseWarnMsg() {
        return purchaseWarnMsg;
    }

    public String getPrivateCity() {
        return privateCity;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public Object getType() {
        return type;
    }

    public Object getPeppolEas() {
        return peppolEas;
    }

    public int getTargetSalesWon() {
        return targetSalesWon;
    }

    public boolean getIsInGroup29() {
        return isInGroup29;
    }

    public String getPassportId() {
        return passportId;
    }

    public boolean getIsInGroup28() {
        return isInGroup28;
    }

    public boolean getIsInGroup38() {
        return isInGroup38;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsInGroup37() {
        return isInGroup37;
    }

    public int getPurchaseOrderCount() {
        return purchaseOrderCount;
    }

    public Object getSelGroups5455() {
        return selGroups5455;
    }

    public int getChildren() {
        return children;
    }

    public boolean getIsIsPeppolEdiFormat() {
        return isIsPeppolEdiFormat;
    }

    public boolean getIsIsUblFormat() {
        return isIsUblFormat;
    }

    public boolean getIsInGroup31() {
        return isInGroup31;
    }

    public boolean getIsInGroup30() {
        return isInGroup30;
    }

    public int getId() {
        return id;
    }

    public int getMessageBounce() {
        return messageBounce;
    }

    public ResCountryState getStateIdAsObject() {
        return stateIdAsObject;
    }

    public OdooId getStateId() {
        return stateId;
    }

    public int getBankAccountCount() {
        return bankAccountCount;
    }

    public AccountPaymentMethodLine getPropertyInboundPaymentMethodLineIdAsObject() {
        return propertyInboundPaymentMethodLineIdAsObject;
    }

    public OdooId getPropertyInboundPaymentMethodLineId() {
        return propertyInboundPaymentMethodLineId;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getZip() {
        return zip;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public String getSsnid() {
        return ssnid;
    }

    public boolean getIsIsAbsent() {
        return isIsAbsent;
    }

    public String getVat() {
        return vat;
    }

    public Object getDistanceHomeWorkUnit() {
        return distanceHomeWorkUnit;
    }

    public Object getImage1920() {
        return image1920;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public Object getSelGroups343536() {
        return selGroups343536;
    }

    public boolean getIsInGroup19() {
        return isInGroup19;
    }

    public boolean getIsInGroup18() {
        return isInGroup18;
    }

    public boolean getIsInGroup17() {
        return isInGroup17;
    }

    public boolean getIsInGroup27() {
        return isInGroup27;
    }

    public Object getEmployeeType() {
        return employeeType;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public boolean getIsInGroup21() {
        return isInGroup21;
    }

    public String getContactAddressInline() {
        return contactAddressInline;
    }

    public boolean getIsInGroup20() {
        return isInGroup20;
    }

    public String getPeppolEndpoint() {
        return peppolEndpoint;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public List<ResUsersSettings> getResUsersSettingsIdsAsList() {
        return resUsersSettingsIdsAsList;
    }

    public List<Integer> getResUsersSettingsIds() {
        return resUsersSettingsIds;
    }

    public Object getGender() {
        return gender;
    }

    public List<ResCompany> getRefCompanyIdsAsList() {
        return refCompanyIdsAsList;
    }

    public List<Integer> getRefCompanyIds() {
        return refCompanyIds;
    }

    public Object getSignature() {
        return signature;
    }

    public String getCity() {
        return city;
    }

    public String getLogin() {
        return login;
    }

    public List<ResPartner> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public String getVehicle() {
        return vehicle;
    }

    public boolean getIsCreateEmployee() {
        return isCreateEmployee;
    }

    public boolean getIsInGroup16() {
        return isInGroup16;
    }

    public Date getLeaveDateTo() {
        return leaveDateTo;
    }

    public boolean getIsInGroup15() {
        return isInGroup15;
    }

    public Object getAutopostBills() {
        return autopostBills;
    }

    public boolean getIsInGroup14() {
        return isInGroup14;
    }

    public String getInvoiceEdiFormatStore() {
        return invoiceEdiFormatStore;
    }

    public boolean getIsInGroup12() {
        return isInGroup12;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public boolean getIsShare() {
        return isShare;
    }

    public boolean getIsUsePartnerCreditLimit() {
        return isUsePartnerCreditLimit;
    }

    public String getStreet2() {
        return street2;
    }

    public Object getDebit() {
        return debit;
    }

    public List<ResUsersLog> getLogIdsAsList() {
        return logIdsAsList;
    }

    public List<Integer> getLogIds() {
        return logIds;
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

    public Object getInvoiceWarnMsg() {
        return invoiceWarnMsg;
    }

    public boolean getIsIgnoreAbnormalInvoiceAmount() {
        return isIgnoreAbnormalInvoiceAmount;
    }

    public List<ResUsersApikeys> getApiKeyIdsAsList() {
        return apiKeyIdsAsList;
    }

    public List<Integer> getApiKeyIds() {
        return apiKeyIds;
    }

    public boolean getIsCanEdit() {
        return isCanEdit;
    }

    public List<ProjectTask> getTaskIdsAsList() {
        return taskIdsAsList;
    }

    public List<Integer> getTaskIds() {
        return taskIds;
    }

    public List<Project> getProjectIdsAsList() {
        return projectIdsAsList;
    }

    public List<Integer> getProjectIds() {
        return projectIds;
    }

    public boolean getIsShowCreditLimit() {
        return isShowCreditLimit;
    }

    public String getWorkLocationName() {
        return workLocationName;
    }

    public String getLastActivityTime() {
        return lastActivityTime;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public ResPartner getSelfAsObject() {
        return selfAsObject;
    }

    public OdooId getSelf() {
        return self;
    }

    public boolean getIsShowLeaves() {
        return isShowLeaves;
    }

    public ResPartner getWorkContactIdAsObject() {
        return workContactIdAsObject;
    }

    public OdooId getWorkContactId() {
        return workContactId;
    }

    public String getParentName() {
        return parentName;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public boolean getIsPhoneBlacklisted() {
        return isPhoneBlacklisted;
    }

    public ResCountry getPrivateCountryIdAsObject() {
        return privateCountryIdAsObject;
    }

    public OdooId getPrivateCountryId() {
        return privateCountryId;
    }

    public boolean getIsMobileBlacklisted() {
        return isMobileBlacklisted;
    }

    public boolean getIsOdoobotFailed() {
        return isOdoobotFailed;
    }

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public double getPartnerLongitude() {
        return partnerLongitude;
    }

    public Object getWorkLocationType() {
        return workLocationType;
    }

    public Object getInvoiceWarn() {
        return invoiceWarn;
    }

    public Object getAvatar256() {
        return avatar256;
    }

    public int getMeetingCount() {
        return meetingCount;
    }

    public String getPin() {
        return pin;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getFunction() {
        return function;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getCredit() {
        return credit;
    }

    public Object getImage512() {
        return image512;
    }

    public Object getSelGroups13() {
        return selGroups13;
    }

    public String getPrivateStreet() {
        return privateStreet;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public Object getHrPresenceState() {
        return hrPresenceState;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public Object getAvatar128() {
        return avatar128;
    }

    public String getVisaNo() {
        return visaNo;
    }

    public ResPartner getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public boolean getIsIgnoreAbnormalInvoiceDate() {
        return isIgnoreAbnormalInvoiceDate;
    }

    public Object getTotalInvoiced() {
        return totalInvoiced;
    }

    public boolean getIsReceiptReminderEmail() {
        return isReceiptReminderEmail;
    }

    public String getEmailNormalized() {
        return emailNormalized;
    }

    public ResCountry getEmployeeCountryIdAsObject() {
        return employeeCountryIdAsObject;
    }

    public OdooId getEmployeeCountryId() {
        return employeeCountryId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public ResPartnerBank getBankAccountIdAsObject() {
        return bankAccountIdAsObject;
    }

    public OdooId getBankAccountId() {
        return bankAccountId;
    }

    public Object getSelGroups585960() {
        return selGroups585960;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getAllocationRemainingDisplay() {
        return allocationRemainingDisplay;
    }

    public int getActiveLangCount() {
        return activeLangCount;
    }

    public int getDistanceHomeWork() {
        return distanceHomeWork;
    }

    public boolean getIsDisplayInvoiceEdiFormat() {
        return isDisplayInvoiceEdiFormat;
    }

    public int getAccessesCount() {
        return accessesCount;
    }

    public int getGroupsCount() {
        return groupsCount;
    }

    public Object getSelGroups11011() {
        return selGroups11011;
    }

    public Object getCertificate() {
        return certificate;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getStudySchool() {
        return studySchool;
    }

    public Object getInvoiceEdiFormat() {
        return invoiceEdiFormat;
    }

    public int getCustomerRank() {
        return customerRank;
    }

    public Object getCalendarDefaultPrivacy() {
        return calendarDefaultPrivacy;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public int getPartnerGid() {
        return partnerGid;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public List<ResDevice> getDeviceIdsAsList() {
        return deviceIdsAsList;
    }

    public List<Integer> getDeviceIds() {
        return deviceIds;
    }

    public Object getLang() {
        return lang;
    }

    public String getEmailFormatted() {
        return emailFormatted;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public Object getSelGroups4748() {
        return selGroups4748;
    }

    public int getDuplicatedBankAccountPartnersCount() {
        return duplicatedBankAccountPartnersCount;
    }

    public Account getPropertyAccountReceivableIdAsObject() {
        return propertyAccountReceivableIdAsObject;
    }

    public OdooId getPropertyAccountReceivableId() {
        return propertyAccountReceivableId;
    }

    public String getPrivateZip() {
        return privateZip;
    }

    public boolean getIsPhoneSanitizedBlacklisted() {
        return isPhoneSanitizedBlacklisted;
    }

    public Date getVisaExpire() {
        return visaExpire;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getKmHomeWork() {
        return kmHomeWork;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public AccountPaymentTerm getPropertySupplierPaymentTermIdAsObject() {
        return propertySupplierPaymentTermIdAsObject;
    }

    public OdooId getPropertySupplierPaymentTermId() {
        return propertySupplierPaymentTermId;
    }

    public String getPhoneSanitized() {
        return phoneSanitized;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public Object getAdditionalNote() {
        return additionalNote;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPrivateStateIdAsObject(ResCountryState privateStateIdAsObject) {
        this.privateStateIdAsObject = privateStateIdAsObject;
    }

    public void setPrivateStateId(OdooId privateStateId) {
        this.privateStateId = privateStateId;
    }

    public void setEmployeeBankAccountIdAsObject(ResPartnerBank employeeBankAccountIdAsObject) {
        this.employeeBankAccountIdAsObject = employeeBankAccountIdAsObject;
    }

    public void setEmployeeBankAccountId(OdooId employeeBankAccountId) {
        this.employeeBankAccountId = employeeBankAccountId;
    }

    public void setSelGroups2326(Object selGroups2326) {
        this.selGroups2326 = selGroups2326;
    }

    public void setAvatar1920(Object avatar1920) {
        this.avatar1920 = avatar1920;
    }

    public void setInvoiceIdsAsList(List<AccountMove> invoiceIdsAsList) {
        this.invoiceIdsAsList = invoiceIdsAsList;
    }

    public void setInvoiceIds(List<Integer> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public void setSpouseBirthdate(Date spouseBirthdate) {
        this.spouseBirthdate = spouseBirthdate;
    }

    public void setIsTourEnabled(boolean isTourEnabled) {
        this.isTourEnabled = isTourEnabled;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setIsDisplayInvoiceTemplatePdfReportId(boolean isDisplayInvoiceTemplatePdfReportId) {
        this.isDisplayInvoiceTemplatePdfReportId = isDisplayInvoiceTemplatePdfReportId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setResourceIdsAsList(List<Resource> resourceIdsAsList) {
        this.resourceIdsAsList = resourceIdsAsList;
    }

    public void setResourceIds(List<Integer> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public void setPurchaseWarn(Object purchaseWarn) {
        this.purchaseWarn = purchaseWarn;
    }

    public void setJournalItemCount(int journalItemCount) {
        this.journalItemCount = journalItemCount;
    }

    public void setIsIsSystem(boolean isIsSystem) {
        this.isIsSystem = isIsSystem;
    }

    public void setSelGroups3940(Object selGroups3940) {
        this.selGroups3940 = selGroups3940;
    }

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setCreditToInvoice(Object creditToInvoice) {
        this.creditToInvoice = creditToInvoice;
    }

    public void setSelGroups24(Object selGroups24) {
        this.selGroups24 = selGroups24;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsIsBlacklisted(boolean isIsBlacklisted) {
        this.isIsBlacklisted = isIsBlacklisted;
    }

    public void setSpouseCompleteName(String spouseCompleteName) {
        this.spouseCompleteName = spouseCompleteName;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }

    public void setPropertyPaymentTermIdAsObject(AccountPaymentTerm propertyPaymentTermIdAsObject) {
        this.propertyPaymentTermIdAsObject = propertyPaymentTermIdAsObject;
    }

    public void setPropertyPaymentTermId(OdooId propertyPaymentTermId) {
        this.propertyPaymentTermId = propertyPaymentTermId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeeResourceCalendarIdAsObject(ResourceCalendar employeeResourceCalendarIdAsObject) {
        this.employeeResourceCalendarIdAsObject = employeeResourceCalendarIdAsObject;
    }

    public void setEmployeeResourceCalendarId(OdooId employeeResourceCalendarId) {
        this.employeeResourceCalendarId = employeeResourceCalendarId;
    }

    public void setDaysSalesOutstanding(double daysSalesOutstanding) {
        this.daysSalesOutstanding = daysSalesOutstanding;
    }

    public void setNotificationType(Object notificationType) {
        this.notificationType = notificationType;
    }

    public void setOdoobotState(Object odoobotState) {
        this.odoobotState = odoobotState;
    }

    public void setCompanyIdsAsList(List<ResCompany> companyIdsAsList) {
        this.companyIdsAsList = companyIdsAsList;
    }

    public void setCompanyIds(List<Integer> companyIds) {
        this.companyIds = companyIds;
    }

    public void setImStatus(String imStatus) {
        this.imStatus = imStatus;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setLeaveManagerIdAsObject(ResUsers leaveManagerIdAsObject) {
        this.leaveManagerIdAsObject = leaveManagerIdAsObject;
    }

    public void setLeaveManagerId(OdooId leaveManagerId) {
        this.leaveManagerId = leaveManagerId;
    }

    public void setIsTotpEnabled(boolean isTotpEnabled) {
        this.isTotpEnabled = isTotpEnabled;
    }

    public void setAvatar1024(Object avatar1024) {
        this.avatar1024 = avatar1024;
    }

    public void setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch;
    }

    public void setSelGroups33(Object selGroups33) {
        this.selGroups33 = selGroups33;
    }

    public void setExpenseManagerIdAsObject(ResUsers expenseManagerIdAsObject) {
        this.expenseManagerIdAsObject = expenseManagerIdAsObject;
    }

    public void setExpenseManagerId(OdooId expenseManagerId) {
        this.expenseManagerId = expenseManagerId;
    }

    public void setSelGroups32(Object selGroups32) {
        this.selGroups32 = selGroups32;
    }

    public void setSelGroups5657(Object selGroups5657) {
        this.selGroups5657 = selGroups5657;
    }

    public void setCategoryIdAsList(List<ResPartnerCategory> categoryIdAsList) {
        this.categoryIdAsList = categoryIdAsList;
    }

    public void setCategoryId(List<Integer> categoryId) {
        this.categoryId = categoryId;
    }

    public void setCountryOfBirthAsObject(ResCountry countryOfBirthAsObject) {
        this.countryOfBirthAsObject = countryOfBirthAsObject;
    }

    public void setCountryOfBirth(OdooId countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setHrIconDisplay(Object hrIconDisplay) {
        this.hrIconDisplay = hrIconDisplay;
    }

    public void setPropertyAccountPositionIdAsObject(AccountFiscalPosition propertyAccountPositionIdAsObject) {
        this.propertyAccountPositionIdAsObject = propertyAccountPositionIdAsObject;
    }

    public void setPropertyAccountPositionId(OdooId propertyAccountPositionId) {
        this.propertyAccountPositionId = propertyAccountPositionId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setSupplierInvoiceCount(int supplierInvoiceCount) {
        this.supplierInvoiceCount = supplierInvoiceCount;
    }

    public void setContractIdsAsList(List<AccountAnalyticAccount> contractIdsAsList) {
        this.contractIdsAsList = contractIdsAsList;
    }

    public void setContractIds(List<Integer> contractIds) {
        this.contractIds = contractIds;
    }

    public void setPrivateStreet2(String privateStreet2) {
        this.privateStreet2 = privateStreet2;
    }

    public void setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setInvoiceSendingMethod(Object invoiceSendingMethod) {
        this.invoiceSendingMethod = invoiceSendingMethod;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setPaymentTokenCount(int paymentTokenCount) {
        this.paymentTokenCount = paymentTokenCount;
    }

    public void setIsIsPublic(boolean isIsPublic) {
        this.isIsPublic = isIsPublic;
    }

    public void setIsIsCompany(boolean isIsCompany) {
        this.isIsCompany = isIsCompany;
    }

    public void setSelGroups5152(Object selGroups5152) {
        this.selGroups5152 = selGroups5152;
    }

    public void setCompaniesCount(int companiesCount) {
        this.companiesCount = companiesCount;
    }

    public void setCompanyType(Object companyType) {
        this.companyType = companyType;
    }

    public void setSaleWarn(Object saleWarn) {
        this.saleWarn = saleWarn;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setRulesCount(int rulesCount) {
        this.rulesCount = rulesCount;
    }

    public void setPrivateLang(Object privateLang) {
        this.privateLang = privateLang;
    }

    public void setBuyerIdAsObject(ResUsers buyerIdAsObject) {
        this.buyerIdAsObject = buyerIdAsObject;
    }

    public void setBuyerId(OdooId buyerId) {
        this.buyerId = buyerId;
    }

    public void setResUsersSettingsIdAsObject(ResUsersSettings resUsersSettingsIdAsObject) {
        this.resUsersSettingsIdAsObject = resUsersSettingsIdAsObject;
    }

    public void setResUsersSettingsId(OdooId resUsersSettingsId) {
        this.resUsersSettingsId = resUsersSettingsId;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setIsPartnerShare(boolean isPartnerShare) {
        this.isPartnerShare = isPartnerShare;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public void setPropertyPurchaseCurrencyIdAsObject(ResCurrency propertyPurchaseCurrencyIdAsObject) {
        this.propertyPurchaseCurrencyIdAsObject = propertyPurchaseCurrencyIdAsObject;
    }

    public void setPropertyPurchaseCurrencyId(OdooId propertyPurchaseCurrencyId) {
        this.propertyPurchaseCurrencyId = propertyPurchaseCurrencyId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
    }

    public void setCommercialCompanyName(String commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName;
    }

    public void setIsInGroup72(boolean isInGroup72) {
        this.isInGroup72 = isInGroup72;
    }

    public void setIsInGroup71(boolean isInGroup71) {
        this.isInGroup71 = isInGroup71;
    }

    public void setIsInGroup70(boolean isInGroup70) {
        this.isInGroup70 = isInGroup70;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setTargetSalesInvoiced(int targetSalesInvoiced) {
        this.targetSalesInvoiced = targetSalesInvoiced;
    }

    public void setPartnerVatPlaceholder(String partnerVatPlaceholder) {
        this.partnerVatPlaceholder = partnerVatPlaceholder;
    }

    public void setPropertyOutboundPaymentMethodLineIdAsObject(AccountPaymentMethodLine propertyOutboundPaymentMethodLineIdAsObject) {
        this.propertyOutboundPaymentMethodLineIdAsObject = propertyOutboundPaymentMethodLineIdAsObject;
    }

    public void setPropertyOutboundPaymentMethodLineId(OdooId propertyOutboundPaymentMethodLineId) {
        this.propertyOutboundPaymentMethodLineId = propertyOutboundPaymentMethodLineId;
    }

    public void setOpportunityCount(int opportunityCount) {
        this.opportunityCount = opportunityCount;
    }

    public void setReminderDateBeforeReceipt(int reminderDateBeforeReceipt) {
        this.reminderDateBeforeReceipt = reminderDateBeforeReceipt;
    }

    public void setIsActivePartner(boolean isActivePartner) {
        this.isActivePartner = isActivePartner;
    }

    public void setAddressIdAsObject(ResPartner addressIdAsObject) {
        this.addressIdAsObject = addressIdAsObject;
    }

    public void setAddressId(OdooId addressId) {
        this.addressId = addressId;
    }

    public void setAllocationDisplay(String allocationDisplay) {
        this.allocationDisplay = allocationDisplay;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setIsInGroup69(boolean isInGroup69) {
        this.isInGroup69 = isInGroup69;
    }

    public void setIsInGroup68(boolean isInGroup68) {
        this.isInGroup68 = isInGroup68;
    }

    public void setIsInGroup64(boolean isInGroup64) {
        this.isInGroup64 = isInGroup64;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSameVatPartnerIdAsObject(ResPartner sameVatPartnerIdAsObject) {
        this.sameVatPartnerIdAsObject = sameVatPartnerIdAsObject;
    }

    public void setSameVatPartnerId(OdooId sameVatPartnerId) {
        this.sameVatPartnerId = sameVatPartnerId;
    }

    public void setCurrentLeaveState(Object currentLeaveState) {
        this.currentLeaveState = currentLeaveState;
    }

    public void setTrust(Object trust) {
        this.trust = trust;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public void setIndustryIdAsObject(ResPartnerIndustry industryIdAsObject) {
        this.industryIdAsObject = industryIdAsObject;
    }

    public void setIndustryId(OdooId industryId) {
        this.industryId = industryId;
    }

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDebitLimit(Object debitLimit) {
        this.debitLimit = debitLimit;
    }

    public void setIsInGroup6(boolean isInGroup6) {
        this.isInGroup6 = isInGroup6;
    }

    public void setIsInGroup7(boolean isInGroup7) {
        this.isInGroup7 = isInGroup7;
    }

    public void setIsInGroup8(boolean isInGroup8) {
        this.isInGroup8 = isInGroup8;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setIsInGroup9(boolean isInGroup9) {
        this.isInGroup9 = isInGroup9;
    }

    public void setAvatar512(Object avatar512) {
        this.avatar512 = avatar512;
    }

    public void setTitleAsObject(ResPartnerTitle titleAsObject) {
        this.titleAsObject = titleAsObject;
    }

    public void setTitle(OdooId title) {
        this.title = title;
    }

    public void setAllocationCount(double allocationCount) {
        this.allocationCount = allocationCount;
    }

    public void setIsInGroup3(boolean isInGroup3) {
        this.isInGroup3 = isInGroup3;
    }

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setIsInGroup5(boolean isInGroup5) {
        this.isInGroup5 = isInGroup5;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public void setPropertyAccountPayableIdAsObject(Account propertyAccountPayableIdAsObject) {
        this.propertyAccountPayableIdAsObject = propertyAccountPayableIdAsObject;
    }

    public void setPropertyAccountPayableId(OdooId propertyAccountPayableId) {
        this.propertyAccountPayableId = propertyAccountPayableId;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setLastActivity(Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCalendarLastNotifAck(Date calendarLastNotifAck) {
        this.calendarLastNotifAck = calendarLastNotifAck;
    }

    public void setIsInGroup53(boolean isInGroup53) {
        this.isInGroup53 = isInGroup53;
    }

    public void setIsInGroup50(boolean isInGroup50) {
        this.isInGroup50 = isInGroup50;
    }

    public void setSelGroups616263(Object selGroups616263) {
        this.selGroups616263 = selGroups616263;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setTargetSalesDone(int targetSalesDone) {
        this.targetSalesDone = targetSalesDone;
    }

    public void setPartnerLatitude(double partnerLatitude) {
        this.partnerLatitude = partnerLatitude;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }

    public void setSignupType(String signupType) {
        this.signupType = signupType;
    }

    public void setIsInGroup49(boolean isInGroup49) {
        this.isInGroup49 = isInGroup49;
    }

    public void setMarital(Object marital) {
        this.marital = marital;
    }

    public void setSaleWarnMsg(Object saleWarnMsg) {
        this.saleWarnMsg = saleWarnMsg;
    }

    public void setIsInGroup46(boolean isInGroup46) {
        this.isInGroup46 = isInGroup46;
    }

    public void setIsInGroup45(boolean isInGroup45) {
        this.isInGroup45 = isInGroup45;
    }

    public void setIsInGroup44(boolean isInGroup44) {
        this.isInGroup44 = isInGroup44;
    }

    public void setUserGroupWarning(Object userGroupWarning) {
        this.userGroupWarning = userGroupWarning;
    }

    public void setIsInGroup43(boolean isInGroup43) {
        this.isInGroup43 = isInGroup43;
    }

    public void setIsInGroup42(boolean isInGroup42) {
        this.isInGroup42 = isInGroup42;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public void setIsInGroup41(boolean isInGroup41) {
        this.isInGroup41 = isInGroup41;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public void setSupplierRank(int supplierRank) {
        this.supplierRank = supplierRank;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }

    public void setSameCompanyRegistryPartnerIdAsObject(ResPartner sameCompanyRegistryPartnerIdAsObject) {
        this.sameCompanyRegistryPartnerIdAsObject = sameCompanyRegistryPartnerIdAsObject;
    }

    public void setSameCompanyRegistryPartnerId(OdooId sameCompanyRegistryPartnerId) {
        this.sameCompanyRegistryPartnerId = sameCompanyRegistryPartnerId;
    }

    public void setSelGroups656667(Object selGroups656667) {
        this.selGroups656667 = selGroups656667;
    }

    public void setBankIdsAsList(List<ResPartnerBank> bankIdsAsList) {
        this.bankIdsAsList = bankIdsAsList;
    }

    public void setBankIds(List<Integer> bankIds) {
        this.bankIds = bankIds;
    }

    public void setPurchaseWarnMsg(Object purchaseWarnMsg) {
        this.purchaseWarnMsg = purchaseWarnMsg;
    }

    public void setPrivateCity(String privateCity) {
        this.privateCity = privateCity;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setPeppolEas(Object peppolEas) {
        this.peppolEas = peppolEas;
    }

    public void setTargetSalesWon(int targetSalesWon) {
        this.targetSalesWon = targetSalesWon;
    }

    public void setIsInGroup29(boolean isInGroup29) {
        this.isInGroup29 = isInGroup29;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public void setIsInGroup28(boolean isInGroup28) {
        this.isInGroup28 = isInGroup28;
    }

    public void setIsInGroup38(boolean isInGroup38) {
        this.isInGroup38 = isInGroup38;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsInGroup37(boolean isInGroup37) {
        this.isInGroup37 = isInGroup37;
    }

    public void setPurchaseOrderCount(int purchaseOrderCount) {
        this.purchaseOrderCount = purchaseOrderCount;
    }

    public void setSelGroups5455(Object selGroups5455) {
        this.selGroups5455 = selGroups5455;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setIsIsPeppolEdiFormat(boolean isIsPeppolEdiFormat) {
        this.isIsPeppolEdiFormat = isIsPeppolEdiFormat;
    }

    public void setIsIsUblFormat(boolean isIsUblFormat) {
        this.isIsUblFormat = isIsUblFormat;
    }

    public void setIsInGroup31(boolean isInGroup31) {
        this.isInGroup31 = isInGroup31;
    }

    public void setIsInGroup30(boolean isInGroup30) {
        this.isInGroup30 = isInGroup30;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessageBounce(int messageBounce) {
        this.messageBounce = messageBounce;
    }

    public void setStateIdAsObject(ResCountryState stateIdAsObject) {
        this.stateIdAsObject = stateIdAsObject;
    }

    public void setStateId(OdooId stateId) {
        this.stateId = stateId;
    }

    public void setBankAccountCount(int bankAccountCount) {
        this.bankAccountCount = bankAccountCount;
    }

    public void setPropertyInboundPaymentMethodLineIdAsObject(AccountPaymentMethodLine propertyInboundPaymentMethodLineIdAsObject) {
        this.propertyInboundPaymentMethodLineIdAsObject = propertyInboundPaymentMethodLineIdAsObject;
    }

    public void setPropertyInboundPaymentMethodLineId(OdooId propertyInboundPaymentMethodLineId) {
        this.propertyInboundPaymentMethodLineId = propertyInboundPaymentMethodLineId;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setSsnid(String ssnid) {
        this.ssnid = ssnid;
    }

    public void setIsIsAbsent(boolean isIsAbsent) {
        this.isIsAbsent = isIsAbsent;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setDistanceHomeWorkUnit(Object distanceHomeWorkUnit) {
        this.distanceHomeWorkUnit = distanceHomeWorkUnit;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setSelGroups343536(Object selGroups343536) {
        this.selGroups343536 = selGroups343536;
    }

    public void setIsInGroup19(boolean isInGroup19) {
        this.isInGroup19 = isInGroup19;
    }

    public void setIsInGroup18(boolean isInGroup18) {
        this.isInGroup18 = isInGroup18;
    }

    public void setIsInGroup17(boolean isInGroup17) {
        this.isInGroup17 = isInGroup17;
    }

    public void setIsInGroup27(boolean isInGroup27) {
        this.isInGroup27 = isInGroup27;
    }

    public void setEmployeeType(Object employeeType) {
        this.employeeType = employeeType;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setIsInGroup21(boolean isInGroup21) {
        this.isInGroup21 = isInGroup21;
    }

    public void setContactAddressInline(String contactAddressInline) {
        this.contactAddressInline = contactAddressInline;
    }

    public void setIsInGroup20(boolean isInGroup20) {
        this.isInGroup20 = isInGroup20;
    }

    public void setPeppolEndpoint(String peppolEndpoint) {
        this.peppolEndpoint = peppolEndpoint;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setResUsersSettingsIdsAsList(List<ResUsersSettings> resUsersSettingsIdsAsList) {
        this.resUsersSettingsIdsAsList = resUsersSettingsIdsAsList;
    }

    public void setResUsersSettingsIds(List<Integer> resUsersSettingsIds) {
        this.resUsersSettingsIds = resUsersSettingsIds;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public void setRefCompanyIdsAsList(List<ResCompany> refCompanyIdsAsList) {
        this.refCompanyIdsAsList = refCompanyIdsAsList;
    }

    public void setRefCompanyIds(List<Integer> refCompanyIds) {
        this.refCompanyIds = refCompanyIds;
    }

    public void setSignature(Object signature) {
        this.signature = signature;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setChildIdsAsList(List<ResPartner> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setIsCreateEmployee(boolean isCreateEmployee) {
        this.isCreateEmployee = isCreateEmployee;
    }

    public void setIsInGroup16(boolean isInGroup16) {
        this.isInGroup16 = isInGroup16;
    }

    public void setLeaveDateTo(Date leaveDateTo) {
        this.leaveDateTo = leaveDateTo;
    }

    public void setIsInGroup15(boolean isInGroup15) {
        this.isInGroup15 = isInGroup15;
    }

    public void setAutopostBills(Object autopostBills) {
        this.autopostBills = autopostBills;
    }

    public void setIsInGroup14(boolean isInGroup14) {
        this.isInGroup14 = isInGroup14;
    }

    public void setInvoiceEdiFormatStore(String invoiceEdiFormatStore) {
        this.invoiceEdiFormatStore = invoiceEdiFormatStore;
    }

    public void setIsInGroup12(boolean isInGroup12) {
        this.isInGroup12 = isInGroup12;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public void setIsShare(boolean isShare) {
        this.isShare = isShare;
    }

    public void setIsUsePartnerCreditLimit(boolean isUsePartnerCreditLimit) {
        this.isUsePartnerCreditLimit = isUsePartnerCreditLimit;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setDebit(Object debit) {
        this.debit = debit;
    }

    public void setLogIdsAsList(List<ResUsersLog> logIdsAsList) {
        this.logIdsAsList = logIdsAsList;
    }

    public void setLogIds(List<Integer> logIds) {
        this.logIds = logIds;
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

    public void setInvoiceWarnMsg(Object invoiceWarnMsg) {
        this.invoiceWarnMsg = invoiceWarnMsg;
    }

    public void setIsIgnoreAbnormalInvoiceAmount(boolean isIgnoreAbnormalInvoiceAmount) {
        this.isIgnoreAbnormalInvoiceAmount = isIgnoreAbnormalInvoiceAmount;
    }

    public void setApiKeyIdsAsList(List<ResUsersApikeys> apiKeyIdsAsList) {
        this.apiKeyIdsAsList = apiKeyIdsAsList;
    }

    public void setApiKeyIds(List<Integer> apiKeyIds) {
        this.apiKeyIds = apiKeyIds;
    }

    public void setIsCanEdit(boolean isCanEdit) {
        this.isCanEdit = isCanEdit;
    }

    public void setTaskIdsAsList(List<ProjectTask> taskIdsAsList) {
        this.taskIdsAsList = taskIdsAsList;
    }

    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
    }

    public void setProjectIdsAsList(List<Project> projectIdsAsList) {
        this.projectIdsAsList = projectIdsAsList;
    }

    public void setProjectIds(List<Integer> projectIds) {
        this.projectIds = projectIds;
    }

    public void setIsShowCreditLimit(boolean isShowCreditLimit) {
        this.isShowCreditLimit = isShowCreditLimit;
    }

    public void setWorkLocationName(String workLocationName) {
        this.workLocationName = workLocationName;
    }

    public void setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setSelfAsObject(ResPartner selfAsObject) {
        this.selfAsObject = selfAsObject;
    }

    public void setSelf(OdooId self) {
        this.self = self;
    }

    public void setIsShowLeaves(boolean isShowLeaves) {
        this.isShowLeaves = isShowLeaves;
    }

    public void setWorkContactIdAsObject(ResPartner workContactIdAsObject) {
        this.workContactIdAsObject = workContactIdAsObject;
    }

    public void setWorkContactId(OdooId workContactId) {
        this.workContactId = workContactId;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setIsPhoneBlacklisted(boolean isPhoneBlacklisted) {
        this.isPhoneBlacklisted = isPhoneBlacklisted;
    }

    public void setPrivateCountryIdAsObject(ResCountry privateCountryIdAsObject) {
        this.privateCountryIdAsObject = privateCountryIdAsObject;
    }

    public void setPrivateCountryId(OdooId privateCountryId) {
        this.privateCountryId = privateCountryId;
    }

    public void setIsMobileBlacklisted(boolean isMobileBlacklisted) {
        this.isMobileBlacklisted = isMobileBlacklisted;
    }

    public void setIsOdoobotFailed(boolean isOdoobotFailed) {
        this.isOdoobotFailed = isOdoobotFailed;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public void setPartnerLongitude(double partnerLongitude) {
        this.partnerLongitude = partnerLongitude;
    }

    public void setWorkLocationType(Object workLocationType) {
        this.workLocationType = workLocationType;
    }

    public void setInvoiceWarn(Object invoiceWarn) {
        this.invoiceWarn = invoiceWarn;
    }

    public void setAvatar256(Object avatar256) {
        this.avatar256 = avatar256;
    }

    public void setMeetingCount(int meetingCount) {
        this.meetingCount = meetingCount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setSelGroups13(Object selGroups13) {
        this.selGroups13 = selGroups13;
    }

    public void setPrivateStreet(String privateStreet) {
        this.privateStreet = privateStreet;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setHrPresenceState(Object hrPresenceState) {
        this.hrPresenceState = hrPresenceState;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setAvatar128(Object avatar128) {
        this.avatar128 = avatar128;
    }

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }

    public void setParentIdAsObject(ResPartner parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setIsIgnoreAbnormalInvoiceDate(boolean isIgnoreAbnormalInvoiceDate) {
        this.isIgnoreAbnormalInvoiceDate = isIgnoreAbnormalInvoiceDate;
    }

    public void setTotalInvoiced(Object totalInvoiced) {
        this.totalInvoiced = totalInvoiced;
    }

    public void setIsReceiptReminderEmail(boolean isReceiptReminderEmail) {
        this.isReceiptReminderEmail = isReceiptReminderEmail;
    }

    public void setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized;
    }

    public void setEmployeeCountryIdAsObject(ResCountry employeeCountryIdAsObject) {
        this.employeeCountryIdAsObject = employeeCountryIdAsObject;
    }

    public void setEmployeeCountryId(OdooId employeeCountryId) {
        this.employeeCountryId = employeeCountryId;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBankAccountIdAsObject(ResPartnerBank bankAccountIdAsObject) {
        this.bankAccountIdAsObject = bankAccountIdAsObject;
    }

    public void setBankAccountId(OdooId bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public void setSelGroups585960(Object selGroups585960) {
        this.selGroups585960 = selGroups585960;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setAllocationRemainingDisplay(String allocationRemainingDisplay) {
        this.allocationRemainingDisplay = allocationRemainingDisplay;
    }

    public void setActiveLangCount(int activeLangCount) {
        this.activeLangCount = activeLangCount;
    }

    public void setDistanceHomeWork(int distanceHomeWork) {
        this.distanceHomeWork = distanceHomeWork;
    }

    public void setIsDisplayInvoiceEdiFormat(boolean isDisplayInvoiceEdiFormat) {
        this.isDisplayInvoiceEdiFormat = isDisplayInvoiceEdiFormat;
    }

    public void setAccessesCount(int accessesCount) {
        this.accessesCount = accessesCount;
    }

    public void setGroupsCount(int groupsCount) {
        this.groupsCount = groupsCount;
    }

    public void setSelGroups11011(Object selGroups11011) {
        this.selGroups11011 = selGroups11011;
    }

    public void setCertificate(Object certificate) {
        this.certificate = certificate;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setStudySchool(String studySchool) {
        this.studySchool = studySchool;
    }

    public void setInvoiceEdiFormat(Object invoiceEdiFormat) {
        this.invoiceEdiFormat = invoiceEdiFormat;
    }

    public void setCustomerRank(int customerRank) {
        this.customerRank = customerRank;
    }

    public void setCalendarDefaultPrivacy(Object calendarDefaultPrivacy) {
        this.calendarDefaultPrivacy = calendarDefaultPrivacy;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPartnerGid(int partnerGid) {
        this.partnerGid = partnerGid;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setDeviceIdsAsList(List<ResDevice> deviceIdsAsList) {
        this.deviceIdsAsList = deviceIdsAsList;
    }

    public void setDeviceIds(List<Integer> deviceIds) {
        this.deviceIds = deviceIds;
    }

    public void setLang(Object lang) {
        this.lang = lang;
    }

    public void setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setSelGroups4748(Object selGroups4748) {
        this.selGroups4748 = selGroups4748;
    }

    public void setDuplicatedBankAccountPartnersCount(int duplicatedBankAccountPartnersCount) {
        this.duplicatedBankAccountPartnersCount = duplicatedBankAccountPartnersCount;
    }

    public void setPropertyAccountReceivableIdAsObject(Account propertyAccountReceivableIdAsObject) {
        this.propertyAccountReceivableIdAsObject = propertyAccountReceivableIdAsObject;
    }

    public void setPropertyAccountReceivableId(OdooId propertyAccountReceivableId) {
        this.propertyAccountReceivableId = propertyAccountReceivableId;
    }

    public void setPrivateZip(String privateZip) {
        this.privateZip = privateZip;
    }

    public void setIsPhoneSanitizedBlacklisted(boolean isPhoneSanitizedBlacklisted) {
        this.isPhoneSanitizedBlacklisted = isPhoneSanitizedBlacklisted;
    }

    public void setVisaExpire(Date visaExpire) {
        this.visaExpire = visaExpire;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setKmHomeWork(int kmHomeWork) {
        this.kmHomeWork = kmHomeWork;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setPropertySupplierPaymentTermIdAsObject(AccountPaymentTerm propertySupplierPaymentTermIdAsObject) {
        this.propertySupplierPaymentTermIdAsObject = propertySupplierPaymentTermIdAsObject;
    }

    public void setPropertySupplierPaymentTermId(OdooId propertySupplierPaymentTermId) {
        this.propertySupplierPaymentTermId = propertySupplierPaymentTermId;
    }

    public void setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setAdditionalNote(Object additionalNote) {
        this.additionalNote = additionalNote;
    }



}