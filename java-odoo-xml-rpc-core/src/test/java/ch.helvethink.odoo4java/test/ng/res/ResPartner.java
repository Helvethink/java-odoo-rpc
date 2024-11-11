
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

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerIndustry;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.payment.PaymentToken;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerTitle;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("res.partner")
public class ResPartner implements OdooObj {

    
    private List<ResPartnerBank> bankIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private List<Integer> bankIds;

    
    private Date writeDate;

    
    private List<MailMessage> starredMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> starredMessageIds;

    
    private String websiteMetaTitle;

    
    private Object avatar1920;

    
    private List<AccountMove> invoiceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> invoiceIds;

    
    private boolean isIsPublished;

    
    private Object activityDateDeadline;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private Object type;

    
    private Object peppolEas;

    
    private Object activityState;

    
    private int slideChannelCount;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private int messageBounce;

    
    private ResCountryState stateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId stateId;

    
    private int id;

    
    private int bankAccountCount;

    
    private int journalItemCount;

    
    private String zip;

    
    private List<DiscussChannel> channelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private List<Integer> channelIds;

    
    private int messageAttachmentCount;

    
    private String fiscalCountryCodes;

    
    private Object creditToInvoice;

    
    private String vat;

    
    private boolean isIsBlacklisted;

    
    private boolean isActive;

    
    private Object image1920;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<SaleOrder> saleOrderIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private List<Integer> saleOrderIds;

    
    private AccountPaymentTerm propertyPaymentTermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId propertyPaymentTermId;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String phone;

    
    private String additionalInfo;

    
    private String companyName;

    
    private String contactAddressInline;

    
    private String peppolEndpoint;

    
    private double daysSalesOutstanding;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private int slideChannelCompanyCount;

    
    private String websiteMetaKeywords;

    
    private boolean isMessageIsFollower;

    
    private String imStatus;

    
    private List<ResCompany> refCompanyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> refCompanyIds;

    
    private String city;

    
    private Object avatar1024;

    
    private String phoneMobileSearch;

    
    private Object ublCiiFormat;

    
    private List<ResPartner> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> childIds;

    
    private Date lastTimeEntriesChecked;

    
    private List<ResPartnerCategory> categoryIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
    
    private List<Integer> categoryId;

    
    private ResPartner commercialPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId commercialPartnerId;

    
    private boolean isUsePartnerCreditLimit;

    
    private String street2;

    
    private String signupUrl;

    
    private Object debit;

    
    private AccountFiscalPosition propertyAccountPositionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private OdooId propertyAccountPositionId;

    
    private String email;

    
    private String website;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object invoiceWarnMsg;

    
    private List<AccountAnalyticAccount> contractIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private List<Integer> contractIds;

    
    private String companyRegistry;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private boolean isMessageHasSmsError;

    
    private boolean isWebsitePublished;

    
    private int paymentTokenCount;

    
    private List<ProjectTask> taskIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> taskIds;

    
    private List<Project> projectIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private List<Integer> projectIds;

    
    private boolean isShowCreditLimit;

    
    private List<PaymentToken> paymentTokenIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentToken")
        @OdooModel("payment.PaymentToken")
    
    private List<Integer> paymentTokenIds;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private Date signupExpiration;

    
    private String websiteUrl;

    
    private int saleOrderCount;

    
    private boolean isIsPublic;

    
    private String websiteMetaOgImg;

    
    private ResPartner selfAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId self;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private boolean isIsCompany;

    
    private boolean isIsSeoOptimized;

    
    private Object date;

    
    private String parentName;

    
    private Object companyType;

    
    private Object saleWarn;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isPhoneBlacklisted;

    
    private Object tz;

    
    private boolean isMobileBlacklisted;

    
    private boolean isEmployee;

    
    private double partnerLongitude;

    
    private Object activityExceptionDecoration;

    
    private boolean isPartnerShare;

    
    private Object invoiceWarn;

    
    private int taskCount;

    
    private Object avatar256;

    
    private int meetingCount;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private String ref;

    
    private Object websiteShortDescription;

    
    private boolean isCanPublish;

    
    private String tzOffset;

    
    private boolean isHasMessage;

    
    private String function;

    
    private String commercialCompanyName;

    
    private Date createDate;

    
    private Object credit;

    
    private String barcode;

    
    private ProductPricelist propertyProductPricelistAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId propertyProductPricelist;

    
    private List<SlideChannel> slideChannelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> slideChannelIds;

    
    private Object image512;

    
    private int opportunityCount;

    
    private List<HrEmployee> employeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> employeeIds;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private boolean isHasUnreconciledEntries;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private Object avatar128;

    
    private List<CrmLead> opportunityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> opportunityIds;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String countryCode;

    
    private Object websiteMetaDescription;

    
    private List<WebsiteVisitor> visitorIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor")
        @OdooModel("website.WebsiteVisitor")
    
    private List<Integer> visitorIds;

    
    private ResPartner parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId parentId;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private Object totalInvoiced;

    
    private String emailNormalized;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private ResPartner sameVatPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId sameVatPartnerId;

    
    private Object trust;

    
    private ResPartnerIndustry industryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerIndustry")
        @OdooModel("res.partner.ResPartnerIndustry")
    
    private OdooId industryId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private int activeLangCount;

    
    private int color;

    
    private Object debitLimit;

    
    private Object myActivityDateDeadline;

    
    private Object avatar512;

    
    private ResPartnerTitle titleAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerTitle")
        @OdooModel("res.partner.ResPartnerTitle")
    
    private OdooId title;

    
    private Account propertyAccountPayableIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountPayableId;

    
    private String completeName;

    
    private int customerRank;

    
    private String street;

    
    private int partnerGid;

    
    private Date calendarLastNotifAck;

    
    private double creditLimit;

    
    private Object lang;

    
    private String contactAddress;

    
    private String emailFormatted;

    
    private String activityTypeIcon;

    
    private int duplicatedBankAccountPartnersCount;

    
    private int loyaltyCardCount;

    
    private Object image1024;

    
    private Account propertyAccountReceivableIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountReceivableId;

    
    private double partnerLatitude;

    
    private String mobile;

    
    private List<CalendarEvent> meetingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private List<Integer> meetingIds;

    
    private boolean isPhoneSanitizedBlacklisted;

    
    private boolean isSignupValid;

    
    private String signupType;

    
    private Object saleWarnMsg;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private String signupToken;

    
    private int messageNeedactionCounter;

    
    private Object websiteDescription;

    
    private String seoName;

    
    private AccountPaymentTerm propertySupplierPaymentTermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId propertySupplierPaymentTermId;

    
    private Object comment;

    
    private int supplierRank;

    
    private String phoneSanitized;

    
    private List<SlideChannel> slideChannelCompletedIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> slideChannelCompletedIds;

    
    private int employeesCount;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object image128;

    
    private ResPartner sameCompanyRegistryPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
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

    public List<MailMessage> getStarredMessageIdsAsList() {
        return starredMessageIdsAsList;
    }

    public List<Integer> getStarredMessageIds() {
        return starredMessageIds;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
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

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public CrmTeam getTeamIdAsObject() {
        return teamIdAsObject;
    }

    public OdooId getTeamId() {
        return teamId;
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

    public int getSlideChannelCount() {
        return slideChannelCount;
    }

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
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

    public int getJournalItemCount() {
        return journalItemCount;
    }

    public String getZip() {
        return zip;
    }

    public List<DiscussChannel> getChannelIdsAsList() {
        return channelIdsAsList;
    }

    public List<Integer> getChannelIds() {
        return channelIds;
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

    public List<SaleOrder> getSaleOrderIdsAsList() {
        return saleOrderIdsAsList;
    }

    public List<Integer> getSaleOrderIds() {
        return saleOrderIds;
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

    public int getSlideChannelCompanyCount() {
        return slideChannelCompanyCount;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
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

    public Object getUblCiiFormat() {
        return ublCiiFormat;
    }

    public List<ResPartner> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public Date getLastTimeEntriesChecked() {
        return lastTimeEntriesChecked;
    }

    public List<ResPartnerCategory> getCategoryIdAsList() {
        return categoryIdAsList;
    }

    public List<Integer> getCategoryId() {
        return categoryId;
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

    public String getSignupUrl() {
        return signupUrl;
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

    public List<AccountAnalyticAccount> getContractIdsAsList() {
        return contractIdsAsList;
    }

    public List<Integer> getContractIds() {
        return contractIds;
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

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
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

    public List<PaymentToken> getPaymentTokenIdsAsList() {
        return paymentTokenIdsAsList;
    }

    public List<Integer> getPaymentTokenIds() {
        return paymentTokenIds;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public Date getSignupExpiration() {
        return signupExpiration;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public boolean getIsIsPublic() {
        return isIsPublic;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public ResPartner getSelfAsObject() {
        return selfAsObject;
    }

    public OdooId getSelf() {
        return self;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public boolean getIsIsCompany() {
        return isIsCompany;
    }

    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public Object getDate() {
        return date;
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

    public Object getAvatar256() {
        return avatar256;
    }

    public int getMeetingCount() {
        return meetingCount;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public String getRef() {
        return ref;
    }

    public Object getWebsiteShortDescription() {
        return websiteShortDescription;
    }

    public boolean getIsCanPublish() {
        return isCanPublish;
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

    public ProductPricelist getPropertyProductPricelistAsObject() {
        return propertyProductPricelistAsObject;
    }

    public OdooId getPropertyProductPricelist() {
        return propertyProductPricelist;
    }

    public List<SlideChannel> getSlideChannelIdsAsList() {
        return slideChannelIdsAsList;
    }

    public List<Integer> getSlideChannelIds() {
        return slideChannelIds;
    }

    public Object getImage512() {
        return image512;
    }

    public int getOpportunityCount() {
        return opportunityCount;
    }

    public List<HrEmployee> getEmployeeIdsAsList() {
        return employeeIdsAsList;
    }

    public List<Integer> getEmployeeIds() {
        return employeeIds;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public boolean getIsHasUnreconciledEntries() {
        return isHasUnreconciledEntries;
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

    public List<CrmLead> getOpportunityIdsAsList() {
        return opportunityIdsAsList;
    }

    public List<Integer> getOpportunityIds() {
        return opportunityIds;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public List<WebsiteVisitor> getVisitorIdsAsList() {
        return visitorIdsAsList;
    }

    public List<Integer> getVisitorIds() {
        return visitorIds;
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

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public Object getTotalInvoiced() {
        return totalInvoiced;
    }

    public String getEmailNormalized() {
        return emailNormalized;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
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

    public Object getDebitLimit() {
        return debitLimit;
    }

    public Object getMyActivityDateDeadline() {
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

    public int getLoyaltyCardCount() {
        return loyaltyCardCount;
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

    public List<CalendarEvent> getMeetingIdsAsList() {
        return meetingIdsAsList;
    }

    public List<Integer> getMeetingIds() {
        return meetingIds;
    }

    public boolean getIsPhoneSanitizedBlacklisted() {
        return isPhoneSanitizedBlacklisted;
    }

    public boolean getIsSignupValid() {
        return isSignupValid;
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

    public String getSignupToken() {
        return signupToken;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public Object getWebsiteDescription() {
        return websiteDescription;
    }

    public String getSeoName() {
        return seoName;
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

    public List<SlideChannel> getSlideChannelCompletedIdsAsList() {
        return slideChannelCompletedIdsAsList;
    }

    public List<Integer> getSlideChannelCompletedIds() {
        return slideChannelCompletedIds;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
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

    public void setStarredMessageIdsAsList(List<MailMessage> starredMessageIdsAsList) {
        this.starredMessageIdsAsList = starredMessageIdsAsList;
    }

    public void setStarredMessageIds(List<Integer> starredMessageIds) {
        this.starredMessageIds = starredMessageIds;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
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

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setTeamIdAsObject(CrmTeam teamIdAsObject) {
        this.teamIdAsObject = teamIdAsObject;
    }

    public void setTeamId(OdooId teamId) {
        this.teamId = teamId;
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

    public void setSlideChannelCount(int slideChannelCount) {
        this.slideChannelCount = slideChannelCount;
    }

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
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

    public void setJournalItemCount(int journalItemCount) {
        this.journalItemCount = journalItemCount;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setChannelIdsAsList(List<DiscussChannel> channelIdsAsList) {
        this.channelIdsAsList = channelIdsAsList;
    }

    public void setChannelIds(List<Integer> channelIds) {
        this.channelIds = channelIds;
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

    public void setSaleOrderIdsAsList(List<SaleOrder> saleOrderIdsAsList) {
        this.saleOrderIdsAsList = saleOrderIdsAsList;
    }

    public void setSaleOrderIds(List<Integer> saleOrderIds) {
        this.saleOrderIds = saleOrderIds;
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

    public void setSlideChannelCompanyCount(int slideChannelCompanyCount) {
        this.slideChannelCompanyCount = slideChannelCompanyCount;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
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

    public void setUblCiiFormat(Object ublCiiFormat) {
        this.ublCiiFormat = ublCiiFormat;
    }

    public void setChildIdsAsList(List<ResPartner> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setLastTimeEntriesChecked(Date lastTimeEntriesChecked) {
        this.lastTimeEntriesChecked = lastTimeEntriesChecked;
    }

    public void setCategoryIdAsList(List<ResPartnerCategory> categoryIdAsList) {
        this.categoryIdAsList = categoryIdAsList;
    }

    public void setCategoryId(List<Integer> categoryId) {
        this.categoryId = categoryId;
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

    public void setSignupUrl(String signupUrl) {
        this.signupUrl = signupUrl;
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

    public void setContractIdsAsList(List<AccountAnalyticAccount> contractIdsAsList) {
        this.contractIdsAsList = contractIdsAsList;
    }

    public void setContractIds(List<Integer> contractIds) {
        this.contractIds = contractIds;
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

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
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

    public void setPaymentTokenIdsAsList(List<PaymentToken> paymentTokenIdsAsList) {
        this.paymentTokenIdsAsList = paymentTokenIdsAsList;
    }

    public void setPaymentTokenIds(List<Integer> paymentTokenIds) {
        this.paymentTokenIds = paymentTokenIds;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setSignupExpiration(Date signupExpiration) {
        this.signupExpiration = signupExpiration;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setIsIsPublic(boolean isIsPublic) {
        this.isIsPublic = isIsPublic;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setSelfAsObject(ResPartner selfAsObject) {
        this.selfAsObject = selfAsObject;
    }

    public void setSelf(OdooId self) {
        this.self = self;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setIsIsCompany(boolean isIsCompany) {
        this.isIsCompany = isIsCompany;
    }

    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setDate(Object date) {
        this.date = date;
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

    public void setAvatar256(Object avatar256) {
        this.avatar256 = avatar256;
    }

    public void setMeetingCount(int meetingCount) {
        this.meetingCount = meetingCount;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setWebsiteShortDescription(Object websiteShortDescription) {
        this.websiteShortDescription = websiteShortDescription;
    }

    public void setIsCanPublish(boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
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

    public void setPropertyProductPricelistAsObject(ProductPricelist propertyProductPricelistAsObject) {
        this.propertyProductPricelistAsObject = propertyProductPricelistAsObject;
    }

    public void setPropertyProductPricelist(OdooId propertyProductPricelist) {
        this.propertyProductPricelist = propertyProductPricelist;
    }

    public void setSlideChannelIdsAsList(List<SlideChannel> slideChannelIdsAsList) {
        this.slideChannelIdsAsList = slideChannelIdsAsList;
    }

    public void setSlideChannelIds(List<Integer> slideChannelIds) {
        this.slideChannelIds = slideChannelIds;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setOpportunityCount(int opportunityCount) {
        this.opportunityCount = opportunityCount;
    }

    public void setEmployeeIdsAsList(List<HrEmployee> employeeIdsAsList) {
        this.employeeIdsAsList = employeeIdsAsList;
    }

    public void setEmployeeIds(List<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setIsHasUnreconciledEntries(boolean isHasUnreconciledEntries) {
        this.isHasUnreconciledEntries = isHasUnreconciledEntries;
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

    public void setOpportunityIdsAsList(List<CrmLead> opportunityIdsAsList) {
        this.opportunityIdsAsList = opportunityIdsAsList;
    }

    public void setOpportunityIds(List<Integer> opportunityIds) {
        this.opportunityIds = opportunityIds;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
    }

    public void setVisitorIdsAsList(List<WebsiteVisitor> visitorIdsAsList) {
        this.visitorIdsAsList = visitorIdsAsList;
    }

    public void setVisitorIds(List<Integer> visitorIds) {
        this.visitorIds = visitorIds;
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

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setTotalInvoiced(Object totalInvoiced) {
        this.totalInvoiced = totalInvoiced;
    }

    public void setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
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

    public void setDebitLimit(Object debitLimit) {
        this.debitLimit = debitLimit;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
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

    public void setLoyaltyCardCount(int loyaltyCardCount) {
        this.loyaltyCardCount = loyaltyCardCount;
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

    public void setMeetingIdsAsList(List<CalendarEvent> meetingIdsAsList) {
        this.meetingIdsAsList = meetingIdsAsList;
    }

    public void setMeetingIds(List<Integer> meetingIds) {
        this.meetingIds = meetingIds;
    }

    public void setIsPhoneSanitizedBlacklisted(boolean isPhoneSanitizedBlacklisted) {
        this.isPhoneSanitizedBlacklisted = isPhoneSanitizedBlacklisted;
    }

    public void setIsSignupValid(boolean isSignupValid) {
        this.isSignupValid = isSignupValid;
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

    public void setSignupToken(String signupToken) {
        this.signupToken = signupToken;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setWebsiteDescription(Object websiteDescription) {
        this.websiteDescription = websiteDescription;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
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

    public void setSlideChannelCompletedIdsAsList(List<SlideChannel> slideChannelCompletedIdsAsList) {
        this.slideChannelCompletedIdsAsList = slideChannelCompletedIdsAsList;
    }

    public void setSlideChannelCompletedIds(List<Integer> slideChannelCompletedIds) {
        this.slideChannelCompletedIds = slideChannelCompletedIds;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
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