
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
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.partner")
public class ResPartner implements OdooObj {

    
        private List<ResPartnerBank> bankIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("bank_ids")
        private List<Integer> bankIds;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("purchase_warn_msg")
        private Object purchaseWarnMsg;
    

    
        @JsonProperty("avatar_1920")
        private Object avatar1920;
    

    
        private List<AccountMove> invoiceIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("invoice_ids")
        private List<Integer> invoiceIds;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("type")
        private Object type;
    

    
        @JsonProperty("peppol_eas")
        private Object peppolEas;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("display_invoice_template_pdf_report_id")
        private boolean isDisplayInvoiceTemplatePdfReportId;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("purchase_order_count")
        private int purchaseOrderCount;
    

    
        @JsonProperty("is_peppol_edi_format")
        private boolean isIsPeppolEdiFormat;
    

    
        @JsonProperty("is_ubl_format")
        private boolean isIsUblFormat;
    

    
        @JsonProperty("message_bounce")
        private int messageBounce;
    

    
        private ResCountryState stateIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("state_id")
        private OdooId stateId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("bank_account_count")
        private int bankAccountCount;
    

    
        @JsonProperty("purchase_warn")
        private Object purchaseWarn;
    

    
        @JsonProperty("journal_item_count")
        private int journalItemCount;
    

    
        private AccountPaymentMethodLine propertyInboundPaymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("property_inbound_payment_method_line_id")
        private OdooId propertyInboundPaymentMethodLineId;
    

    
        @JsonProperty("zip")
        private String zip;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("fiscal_country_codes")
        private String fiscalCountryCodes;
    

    
        @JsonProperty("credit_to_invoice")
        private Object creditToInvoice;
    

    
        @JsonProperty("vat")
        private String vat;
    

    
        @JsonProperty("is_blacklisted")
        private boolean isIsBlacklisted;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("image_1920")
        private Object image1920;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private AccountPaymentTerm propertyPaymentTermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
        @JsonProperty("property_payment_term_id")
        private OdooId propertyPaymentTermId;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("phone")
        private String phone;
    

    
        @JsonProperty("additional_info")
        private String additionalInfo;
    

    
        @JsonProperty("company_name")
        private String companyName;
    

    
        @JsonProperty("contact_address_inline")
        private String contactAddressInline;
    

    
        @JsonProperty("peppol_endpoint")
        private String peppolEndpoint;
    

    
        @JsonProperty("days_sales_outstanding")
        private double daysSalesOutstanding;
    

    
        private ResCountry countryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_id")
        private OdooId countryId;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        @JsonProperty("im_status")
        private String imStatus;
    

    
        private List<ResCompany> refCompanyIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("ref_company_ids")
        private List<Integer> refCompanyIds;
    

    
        @JsonProperty("city")
        private String city;
    

    
        @JsonProperty("avatar_1024")
        private Object avatar1024;
    

    
        @JsonProperty("phone_mobile_search")
        private String phoneMobileSearch;
    

    
        private List<ResPartner> childIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("child_ids")
        private List<Integer> childIds;
    

    
        @JsonProperty("autopost_bills")
        private Object autopostBills;
    

    
        private List<ResPartnerCategory> categoryIdAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
        @JsonProperty("category_id")
        private List<Integer> categoryId;
    

    
        @JsonProperty("invoice_edi_format_store")
        private String invoiceEdiFormatStore;
    

    
        private ResPartner commercialPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("commercial_partner_id")
        private OdooId commercialPartnerId;
    

    
        @JsonProperty("use_partner_credit_limit")
        private boolean isUsePartnerCreditLimit;
    

    
        @JsonProperty("street2")
        private String street2;
    

    
        @JsonProperty("debit")
        private Object debit;
    

    
        private AccountFiscalPosition propertyAccountPositionIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
        @JsonProperty("property_account_position_id")
        private OdooId propertyAccountPositionId;
    

    
        @JsonProperty("email")
        private String email;
    

    
        @JsonProperty("website")
        private String website;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("invoice_warn_msg")
        private Object invoiceWarnMsg;
    

    
        @JsonProperty("supplier_invoice_count")
        private int supplierInvoiceCount;
    

    
        private List<AccountAnalyticAccount> contractIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("contract_ids")
        private List<Integer> contractIds;
    

    
        @JsonProperty("ignore_abnormal_invoice_amount")
        private boolean isIgnoreAbnormalInvoiceAmount;
    

    
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
    

    
        @JsonProperty("sale_order_count")
        private int saleOrderCount;
    

    
        @JsonProperty("is_public")
        private boolean isIsPublic;
    

    
        private ResPartner selfAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("self")
        private OdooId self;
    

    
        @JsonProperty("is_company")
        private boolean isIsCompany;
    

    
        @JsonProperty("parent_name")
        private String parentName;
    

    
        @JsonProperty("company_type")
        private Object companyType;
    

    
        @JsonProperty("sale_warn")
        private Object saleWarn;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("phone_blacklisted")
        private boolean isPhoneBlacklisted;
    

    
        @JsonProperty("tz")
        private Object tz;
    

    
        @JsonProperty("mobile_blacklisted")
        private boolean isMobileBlacklisted;
    

    
        @JsonProperty("employee")
        private boolean isEmployee;
    

    
        private ResUsers buyerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("buyer_id")
        private OdooId buyerId;
    

    
        @JsonProperty("partner_longitude")
        private double partnerLongitude;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("partner_share")
        private boolean isPartnerShare;
    

    
        @JsonProperty("invoice_warn")
        private Object invoiceWarn;
    

    
        @JsonProperty("task_count")
        private int taskCount;
    

    
        private ResCurrency propertyPurchaseCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("property_purchase_currency_id")
        private OdooId propertyPurchaseCurrencyId;
    

    
        @JsonProperty("avatar_256")
        private Object avatar256;
    

    
        @JsonProperty("meeting_count")
        private int meetingCount;
    

    
        @JsonProperty("ref")
        private String ref;
    

    
        @JsonProperty("tz_offset")
        private String tzOffset;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("function")
        private String function;
    

    
        @JsonProperty("commercial_company_name")
        private String commercialCompanyName;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("credit")
        private Object credit;
    

    
        @JsonProperty("barcode")
        private String barcode;
    

    
        @JsonProperty("partner_vat_placeholder")
        private String partnerVatPlaceholder;
    

    
        @JsonProperty("image_512")
        private Object image512;
    

    
        private AccountPaymentMethodLine propertyOutboundPaymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("property_outbound_payment_method_line_id")
        private OdooId propertyOutboundPaymentMethodLineId;
    

    
        @JsonProperty("opportunity_count")
        private int opportunityCount;
    

    
        @JsonProperty("reminder_date_before_receipt")
        private int reminderDateBeforeReceipt;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        @JsonProperty("avatar_128")
        private Object avatar128;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        private ResPartner parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("ignore_abnormal_invoice_date")
        private boolean isIgnoreAbnormalInvoiceDate;
    

    
        @JsonProperty("total_invoiced")
        private Object totalInvoiced;
    

    
        @JsonProperty("receipt_reminder_email")
        private boolean isReceiptReminderEmail;
    

    
        @JsonProperty("email_normalized")
        private String emailNormalized;
    

    
        private ResPartner sameVatPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("same_vat_partner_id")
        private OdooId sameVatPartnerId;
    

    
        @JsonProperty("trust")
        private Object trust;
    

    
        private ResPartnerIndustry industryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerIndustry")
        @OdooModel("res.partner.ResPartnerIndustry")
        @JsonProperty("industry_id")
        private OdooId industryId;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("image_256")
        private Object image256;
    

    
        @JsonProperty("active_lang_count")
        private int activeLangCount;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("display_invoice_edi_format")
        private boolean isDisplayInvoiceEdiFormat;
    

    
        @JsonProperty("debit_limit")
        private Object debitLimit;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("avatar_512")
        private Object avatar512;
    

    
        private ResPartnerTitle titleAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerTitle")
        @OdooModel("res.partner.ResPartnerTitle")
        @JsonProperty("title")
        private OdooId title;
    

    
        private Account propertyAccountPayableIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("property_account_payable_id")
        private OdooId propertyAccountPayableId;
    

    
        @JsonProperty("complete_name")
        private String completeName;
    

    
        @JsonProperty("invoice_edi_format")
        private Object invoiceEdiFormat;
    

    
        @JsonProperty("customer_rank")
        private int customerRank;
    

    
        @JsonProperty("street")
        private String street;
    

    
        @JsonProperty("partner_gid")
        private int partnerGid;
    

    
        @JsonProperty("calendar_last_notif_ack")
        private Date calendarLastNotifAck;
    

    
        @JsonProperty("credit_limit")
        private double creditLimit;
    

    
        @JsonProperty("lang")
        private Object lang;
    

    
        @JsonProperty("contact_address")
        private String contactAddress;
    

    
        @JsonProperty("email_formatted")
        private String emailFormatted;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("duplicated_bank_account_partners_count")
        private int duplicatedBankAccountPartnersCount;
    

    
        @JsonProperty("image_1024")
        private Object image1024;
    

    
        private Account propertyAccountReceivableIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("property_account_receivable_id")
        private OdooId propertyAccountReceivableId;
    

    
        @JsonProperty("partner_latitude")
        private double partnerLatitude;
    

    
        @JsonProperty("mobile")
        private String mobile;
    

    
        @JsonProperty("phone_sanitized_blacklisted")
        private boolean isPhoneSanitizedBlacklisted;
    

    
        @JsonProperty("signup_type")
        private String signupType;
    

    
        @JsonProperty("sale_warn_msg")
        private Object saleWarnMsg;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        private AccountPaymentTerm propertySupplierPaymentTermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
        @JsonProperty("property_supplier_payment_term_id")
        private OdooId propertySupplierPaymentTermId;
    

    
        @JsonProperty("comment")
        private Object comment;
    

    
        @JsonProperty("supplier_rank")
        private int supplierRank;
    

    
        @JsonProperty("phone_sanitized")
        private String phoneSanitized;
    

    
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
    


    public ResPartner() {
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

    public Object getPurchaseWarnMsg() {
        return purchaseWarnMsg;
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

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getType() {
        return type;
    }

    public Object getPeppolEas() {
        return peppolEas;
    }

    public Object getActivityState() {
        return activityState;
    }

    public boolean getIsDisplayInvoiceTemplatePdfReportId() {
        return isDisplayInvoiceTemplatePdfReportId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public int getPurchaseOrderCount() {
        return purchaseOrderCount;
    }

    public boolean getIsIsPeppolEdiFormat() {
        return isIsPeppolEdiFormat;
    }

    public boolean getIsIsUblFormat() {
        return isIsUblFormat;
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

    public int getId() {
        return id;
    }

    public int getBankAccountCount() {
        return bankAccountCount;
    }

    public Object getPurchaseWarn() {
        return purchaseWarn;
    }

    public int getJournalItemCount() {
        return journalItemCount;
    }

    public AccountPaymentMethodLine getPropertyInboundPaymentMethodLineIdAsObject() {
        return propertyInboundPaymentMethodLineIdAsObject;
    }

    public OdooId getPropertyInboundPaymentMethodLineId() {
        return propertyInboundPaymentMethodLineId;
    }

    public String getZip() {
        return zip;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public Object getCreditToInvoice() {
        return creditToInvoice;
    }

    public String getVat() {
        return vat;
    }

    public boolean getIsIsBlacklisted() {
        return isIsBlacklisted;
    }

    public boolean getIsActive() {
        return isActive;
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

    public AccountPaymentTerm getPropertyPaymentTermIdAsObject() {
        return propertyPaymentTermIdAsObject;
    }

    public OdooId getPropertyPaymentTermId() {
        return propertyPaymentTermId;
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

    public String getCompanyName() {
        return companyName;
    }

    public String getContactAddressInline() {
        return contactAddressInline;
    }

    public String getPeppolEndpoint() {
        return peppolEndpoint;
    }

    public double getDaysSalesOutstanding() {
        return daysSalesOutstanding;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public String getImStatus() {
        return imStatus;
    }

    public List<ResCompany> getRefCompanyIdsAsList() {
        return refCompanyIdsAsList;
    }

    public List<Integer> getRefCompanyIds() {
        return refCompanyIds;
    }

    public String getCity() {
        return city;
    }

    public Object getAvatar1024() {
        return avatar1024;
    }

    public String getPhoneMobileSearch() {
        return phoneMobileSearch;
    }

    public List<ResPartner> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public Object getAutopostBills() {
        return autopostBills;
    }

    public List<ResPartnerCategory> getCategoryIdAsList() {
        return categoryIdAsList;
    }

    public List<Integer> getCategoryId() {
        return categoryId;
    }

    public String getInvoiceEdiFormatStore() {
        return invoiceEdiFormatStore;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getInvoiceWarnMsg() {
        return invoiceWarnMsg;
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

    public boolean getIsIgnoreAbnormalInvoiceAmount() {
        return isIgnoreAbnormalInvoiceAmount;
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

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public boolean getIsIsPublic() {
        return isIsPublic;
    }

    public ResPartner getSelfAsObject() {
        return selfAsObject;
    }

    public OdooId getSelf() {
        return self;
    }

    public boolean getIsIsCompany() {
        return isIsCompany;
    }

    public String getParentName() {
        return parentName;
    }

    public Object getCompanyType() {
        return companyType;
    }

    public Object getSaleWarn() {
        return saleWarn;
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

    public Object getTz() {
        return tz;
    }

    public boolean getIsMobileBlacklisted() {
        return isMobileBlacklisted;
    }

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public ResUsers getBuyerIdAsObject() {
        return buyerIdAsObject;
    }

    public OdooId getBuyerId() {
        return buyerId;
    }

    public double getPartnerLongitude() {
        return partnerLongitude;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public boolean getIsPartnerShare() {
        return isPartnerShare;
    }

    public Object getInvoiceWarn() {
        return invoiceWarn;
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

    public Object getAvatar256() {
        return avatar256;
    }

    public int getMeetingCount() {
        return meetingCount;
    }

    public String getRef() {
        return ref;
    }

    public String getTzOffset() {
        return tzOffset;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getFunction() {
        return function;
    }

    public String getCommercialCompanyName() {
        return commercialCompanyName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getCredit() {
        return credit;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getPartnerVatPlaceholder() {
        return partnerVatPlaceholder;
    }

    public Object getImage512() {
        return image512;
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

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getAvatar128() {
        return avatar128;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public ResPartner getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
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

    public ResPartner getSameVatPartnerIdAsObject() {
        return sameVatPartnerIdAsObject;
    }

    public OdooId getSameVatPartnerId() {
        return sameVatPartnerId;
    }

    public Object getTrust() {
        return trust;
    }

    public ResPartnerIndustry getIndustryIdAsObject() {
        return industryIdAsObject;
    }

    public OdooId getIndustryId() {
        return industryId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getImage256() {
        return image256;
    }

    public int getActiveLangCount() {
        return activeLangCount;
    }

    public int getColor() {
        return color;
    }

    public boolean getIsDisplayInvoiceEdiFormat() {
        return isDisplayInvoiceEdiFormat;
    }

    public Object getDebitLimit() {
        return debitLimit;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
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

    public Account getPropertyAccountPayableIdAsObject() {
        return propertyAccountPayableIdAsObject;
    }

    public OdooId getPropertyAccountPayableId() {
        return propertyAccountPayableId;
    }

    public String getCompleteName() {
        return completeName;
    }

    public Object getInvoiceEdiFormat() {
        return invoiceEdiFormat;
    }

    public int getCustomerRank() {
        return customerRank;
    }

    public String getStreet() {
        return street;
    }

    public int getPartnerGid() {
        return partnerGid;
    }

    public Date getCalendarLastNotifAck() {
        return calendarLastNotifAck;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Object getLang() {
        return lang;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getEmailFormatted() {
        return emailFormatted;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public int getDuplicatedBankAccountPartnersCount() {
        return duplicatedBankAccountPartnersCount;
    }

    public Object getImage1024() {
        return image1024;
    }

    public Account getPropertyAccountReceivableIdAsObject() {
        return propertyAccountReceivableIdAsObject;
    }

    public OdooId getPropertyAccountReceivableId() {
        return propertyAccountReceivableId;
    }

    public double getPartnerLatitude() {
        return partnerLatitude;
    }

    public String getMobile() {
        return mobile;
    }

    public boolean getIsPhoneSanitizedBlacklisted() {
        return isPhoneSanitizedBlacklisted;
    }

    public String getSignupType() {
        return signupType;
    }

    public Object getSaleWarnMsg() {
        return saleWarnMsg;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
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

    public Object getComment() {
        return comment;
    }

    public int getSupplierRank() {
        return supplierRank;
    }

    public String getPhoneSanitized() {
        return phoneSanitized;
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



    public void setBankIdsAsList(List<ResPartnerBank> bankIdsAsList) {
        this.bankIdsAsList = bankIdsAsList;
    }

    public void setBankIds(List<Integer> bankIds) {
        this.bankIds = bankIds;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPurchaseWarnMsg(Object purchaseWarnMsg) {
        this.purchaseWarnMsg = purchaseWarnMsg;
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

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setPeppolEas(Object peppolEas) {
        this.peppolEas = peppolEas;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setIsDisplayInvoiceTemplatePdfReportId(boolean isDisplayInvoiceTemplatePdfReportId) {
        this.isDisplayInvoiceTemplatePdfReportId = isDisplayInvoiceTemplatePdfReportId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setPurchaseOrderCount(int purchaseOrderCount) {
        this.purchaseOrderCount = purchaseOrderCount;
    }

    public void setIsIsPeppolEdiFormat(boolean isIsPeppolEdiFormat) {
        this.isIsPeppolEdiFormat = isIsPeppolEdiFormat;
    }

    public void setIsIsUblFormat(boolean isIsUblFormat) {
        this.isIsUblFormat = isIsUblFormat;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setBankAccountCount(int bankAccountCount) {
        this.bankAccountCount = bankAccountCount;
    }

    public void setPurchaseWarn(Object purchaseWarn) {
        this.purchaseWarn = purchaseWarn;
    }

    public void setJournalItemCount(int journalItemCount) {
        this.journalItemCount = journalItemCount;
    }

    public void setPropertyInboundPaymentMethodLineIdAsObject(AccountPaymentMethodLine propertyInboundPaymentMethodLineIdAsObject) {
        this.propertyInboundPaymentMethodLineIdAsObject = propertyInboundPaymentMethodLineIdAsObject;
    }

    public void setPropertyInboundPaymentMethodLineId(OdooId propertyInboundPaymentMethodLineId) {
        this.propertyInboundPaymentMethodLineId = propertyInboundPaymentMethodLineId;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setCreditToInvoice(Object creditToInvoice) {
        this.creditToInvoice = creditToInvoice;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setIsIsBlacklisted(boolean isIsBlacklisted) {
        this.isIsBlacklisted = isIsBlacklisted;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setPropertyPaymentTermIdAsObject(AccountPaymentTerm propertyPaymentTermIdAsObject) {
        this.propertyPaymentTermIdAsObject = propertyPaymentTermIdAsObject;
    }

    public void setPropertyPaymentTermId(OdooId propertyPaymentTermId) {
        this.propertyPaymentTermId = propertyPaymentTermId;
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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setContactAddressInline(String contactAddressInline) {
        this.contactAddressInline = contactAddressInline;
    }

    public void setPeppolEndpoint(String peppolEndpoint) {
        this.peppolEndpoint = peppolEndpoint;
    }

    public void setDaysSalesOutstanding(double daysSalesOutstanding) {
        this.daysSalesOutstanding = daysSalesOutstanding;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setImStatus(String imStatus) {
        this.imStatus = imStatus;
    }

    public void setRefCompanyIdsAsList(List<ResCompany> refCompanyIdsAsList) {
        this.refCompanyIdsAsList = refCompanyIdsAsList;
    }

    public void setRefCompanyIds(List<Integer> refCompanyIds) {
        this.refCompanyIds = refCompanyIds;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAvatar1024(Object avatar1024) {
        this.avatar1024 = avatar1024;
    }

    public void setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch;
    }

    public void setChildIdsAsList(List<ResPartner> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setAutopostBills(Object autopostBills) {
        this.autopostBills = autopostBills;
    }

    public void setCategoryIdAsList(List<ResPartnerCategory> categoryIdAsList) {
        this.categoryIdAsList = categoryIdAsList;
    }

    public void setCategoryId(List<Integer> categoryId) {
        this.categoryId = categoryId;
    }

    public void setInvoiceEdiFormatStore(String invoiceEdiFormatStore) {
        this.invoiceEdiFormatStore = invoiceEdiFormatStore;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setInvoiceWarnMsg(Object invoiceWarnMsg) {
        this.invoiceWarnMsg = invoiceWarnMsg;
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

    public void setIsIgnoreAbnormalInvoiceAmount(boolean isIgnoreAbnormalInvoiceAmount) {
        this.isIgnoreAbnormalInvoiceAmount = isIgnoreAbnormalInvoiceAmount;
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

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setIsIsPublic(boolean isIsPublic) {
        this.isIsPublic = isIsPublic;
    }

    public void setSelfAsObject(ResPartner selfAsObject) {
        this.selfAsObject = selfAsObject;
    }

    public void setSelf(OdooId self) {
        this.self = self;
    }

    public void setIsIsCompany(boolean isIsCompany) {
        this.isIsCompany = isIsCompany;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setCompanyType(Object companyType) {
        this.companyType = companyType;
    }

    public void setSaleWarn(Object saleWarn) {
        this.saleWarn = saleWarn;
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

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setIsMobileBlacklisted(boolean isMobileBlacklisted) {
        this.isMobileBlacklisted = isMobileBlacklisted;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public void setBuyerIdAsObject(ResUsers buyerIdAsObject) {
        this.buyerIdAsObject = buyerIdAsObject;
    }

    public void setBuyerId(OdooId buyerId) {
        this.buyerId = buyerId;
    }

    public void setPartnerLongitude(double partnerLongitude) {
        this.partnerLongitude = partnerLongitude;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setIsPartnerShare(boolean isPartnerShare) {
        this.isPartnerShare = isPartnerShare;
    }

    public void setInvoiceWarn(Object invoiceWarn) {
        this.invoiceWarn = invoiceWarn;
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

    public void setAvatar256(Object avatar256) {
        this.avatar256 = avatar256;
    }

    public void setMeetingCount(int meetingCount) {
        this.meetingCount = meetingCount;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setCommercialCompanyName(String commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setPartnerVatPlaceholder(String partnerVatPlaceholder) {
        this.partnerVatPlaceholder = partnerVatPlaceholder;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
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

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAvatar128(Object avatar128) {
        this.avatar128 = avatar128;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setParentIdAsObject(ResPartner parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setSameVatPartnerIdAsObject(ResPartner sameVatPartnerIdAsObject) {
        this.sameVatPartnerIdAsObject = sameVatPartnerIdAsObject;
    }

    public void setSameVatPartnerId(OdooId sameVatPartnerId) {
        this.sameVatPartnerId = sameVatPartnerId;
    }

    public void setTrust(Object trust) {
        this.trust = trust;
    }

    public void setIndustryIdAsObject(ResPartnerIndustry industryIdAsObject) {
        this.industryIdAsObject = industryIdAsObject;
    }

    public void setIndustryId(OdooId industryId) {
        this.industryId = industryId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setActiveLangCount(int activeLangCount) {
        this.activeLangCount = activeLangCount;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setIsDisplayInvoiceEdiFormat(boolean isDisplayInvoiceEdiFormat) {
        this.isDisplayInvoiceEdiFormat = isDisplayInvoiceEdiFormat;
    }

    public void setDebitLimit(Object debitLimit) {
        this.debitLimit = debitLimit;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
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

    public void setPropertyAccountPayableIdAsObject(Account propertyAccountPayableIdAsObject) {
        this.propertyAccountPayableIdAsObject = propertyAccountPayableIdAsObject;
    }

    public void setPropertyAccountPayableId(OdooId propertyAccountPayableId) {
        this.propertyAccountPayableId = propertyAccountPayableId;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setInvoiceEdiFormat(Object invoiceEdiFormat) {
        this.invoiceEdiFormat = invoiceEdiFormat;
    }

    public void setCustomerRank(int customerRank) {
        this.customerRank = customerRank;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPartnerGid(int partnerGid) {
        this.partnerGid = partnerGid;
    }

    public void setCalendarLastNotifAck(Date calendarLastNotifAck) {
        this.calendarLastNotifAck = calendarLastNotifAck;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setLang(Object lang) {
        this.lang = lang;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public void setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setDuplicatedBankAccountPartnersCount(int duplicatedBankAccountPartnersCount) {
        this.duplicatedBankAccountPartnersCount = duplicatedBankAccountPartnersCount;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setPropertyAccountReceivableIdAsObject(Account propertyAccountReceivableIdAsObject) {
        this.propertyAccountReceivableIdAsObject = propertyAccountReceivableIdAsObject;
    }

    public void setPropertyAccountReceivableId(OdooId propertyAccountReceivableId) {
        this.propertyAccountReceivableId = propertyAccountReceivableId;
    }

    public void setPartnerLatitude(double partnerLatitude) {
        this.partnerLatitude = partnerLatitude;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setIsPhoneSanitizedBlacklisted(boolean isPhoneSanitizedBlacklisted) {
        this.isPhoneSanitizedBlacklisted = isPhoneSanitizedBlacklisted;
    }

    public void setSignupType(String signupType) {
        this.signupType = signupType;
    }

    public void setSaleWarnMsg(Object saleWarnMsg) {
        this.saleWarnMsg = saleWarnMsg;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
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

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public void setSupplierRank(int supplierRank) {
        this.supplierRank = supplierRank;
    }

    public void setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized;
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



}