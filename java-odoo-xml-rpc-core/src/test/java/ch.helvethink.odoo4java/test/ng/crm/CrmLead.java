
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

package ch.helvethink.odoo4java.test.ng.crm;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResLang;
import ch.helvethink.odoo4java.test.ng.crm.iap.lead.mining.CrmIapLeadMiningRequest;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.crm.recurring.CrmRecurringPlan;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor;
import ch.helvethink.odoo4java.test.ng.utm.UtmCampaign;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.crm.CrmTag;
import ch.helvethink.odoo4java.test.ng.utm.UtmSource;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.utm.UtmMedium;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.crm.CrmStage;
import ch.helvethink.odoo4java.test.ng.crm.lost.CrmLostReason;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerTitle;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("crm.lead")
public class CrmLead implements OdooObj {

    
    private Date writeDate;

    
    private Object kanbanState;

    
    private String partnerName;

    
    private Object activityDateDeadline;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private String emailDomainCriterion;

    
    private Object type;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private Date dateOpen;

    
    private double dayOpen;

    
    private Object proratedRevenue;

    
    private int messageBounce;

    
    private ResCountryState stateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId stateId;

    
    private int id;

    
    private CrmRecurringPlan recurringPlanAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.recurring.CrmRecurringPlan")
        @OdooModel("crm.recurring.CrmRecurringPlan")
    
    private OdooId recurringPlan;

    
    private String zip;

    
    private int messageAttachmentCount;

    
    private List<CrmTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTag")
        @OdooModel("crm.CrmTag")
    
    private List<Integer> tagIds;

    
    private CrmStage stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmStage")
        @OdooModel("crm.CrmStage")
    
    private OdooId stageId;

    
    private double probability;

    
    private boolean isIsBlacklisted;

    
    private boolean isActive;

    
    private int visitorPageCount;

    
    private Object priority;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object leadProperties;

    
    private double automatedProbability;

    
    private double dayClose;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String phone;

    
    private List<ResCompany> userCompanyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> userCompanyIds;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private boolean isMessageIsFollower;

    
    private Object recurringRevenueMonthlyProrated;

    
    private String city;

    
    private int quotationCount;

    
    private String phoneMobileSearch;

    
    private Object dateDeadline;

    
    private Object phoneState;

    
    private Object saleAmountTotal;

    
    private String meetingDisplayLabel;

    
    private Object meetingDisplayDate;

    
    private Date dateAutomationLast;

    
    private String street2;

    
    private boolean isPartnerEmailUpdate;

    
    private String contactName;

    
    private String website;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object recurringRevenue;

    
    private boolean isMessageHasSmsError;

    
    private Date dateLastStageUpdate;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isIsAutomatedProbability;

    
    private int saleOrderCount;

    
    private Object recurringRevenueProrated;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private UtmSource sourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmSource")
        @OdooModel("utm.UtmSource")
    
    private OdooId sourceId;

    
    private List<CalendarEvent> calendarEventIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private List<Integer> calendarEventIds;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isPhoneBlacklisted;

    
    private boolean isMobileBlacklisted;

    
    private Object activityExceptionDecoration;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private Date dateClosed;

    
    private boolean isHasMessage;

    
    private String function;

    
    private UtmMedium mediumIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmMedium")
        @OdooModel("utm.UtmMedium")
    
    private OdooId mediumId;

    
    private Date dateConversion;

    
    private Date createDate;

    
    private UtmCampaign campaignIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmCampaign")
        @OdooModel("utm.UtmCampaign")
    
    private OdooId campaignId;

    
    private String revealId;

    
    private boolean isPartnerIsBlacklisted;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private CrmLostReason lostReasonIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.lost.CrmLostReason")
        @OdooModel("crm.lost.CrmLostReason")
    
    private OdooId lostReasonId;

    
    private List<WebsiteVisitor> visitorIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor")
        @OdooModel("website.WebsiteVisitor")
    
    private List<Integer> visitorIds;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private String emailNormalized;

    
    private String emailCc;

    
    private boolean isShowEnrichButton;

    
    private int duplicateLeadCount;

    
    private Object emailState;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private boolean isPartnerPhoneUpdate;

    
    private int langActiveCount;

    
    private Object description;

    
    private Object myActivityDateDeadline;

    
    private ResPartnerTitle titleAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerTitle")
        @OdooModel("res.partner.ResPartnerTitle")
    
    private OdooId title;

    
    private Object expectedRevenue;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String langCode;

    
    private Object durationTracking;

    
    private String street;

    
    private boolean isIsPartnerVisible;

    
    private ResCurrency companyCurrencyAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrency;

    
    private boolean isIapEnrichDone;

    
    private String activityTypeIcon;

    
    private String mobile;

    
    private ResLang langIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private OdooId langId;

    
    private List<SaleOrder> orderIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private List<Integer> orderIds;

    
    private boolean isPhoneSanitizedBlacklisted;

    
    private boolean isMessageHasError;

    
    private List<CrmLead> duplicateLeadIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> duplicateLeadIds;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private Object recurringRevenueMonthly;

    
    private String phoneSanitized;

    
    private String emailFrom;

    
    private String referred;

    
    private CrmIapLeadMiningRequest leadMiningRequestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.iap.lead.mining.CrmIapLeadMiningRequest")
        @OdooModel("crm.iap.lead.mining.CrmIapLeadMiningRequest")
    
    private OdooId leadMiningRequestId;


    public CrmLead() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getKanbanState() {
        return kanbanState;
    }

    public String getPartnerName() {
        return partnerName;
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

    public String getEmailDomainCriterion() {
        return emailDomainCriterion;
    }

    public Object getType() {
        return type;
    }

    public Object getActivityState() {
        return activityState;
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

    public Date getDateOpen() {
        return dateOpen;
    }

    public double getDayOpen() {
        return dayOpen;
    }

    public Object getProratedRevenue() {
        return proratedRevenue;
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

    public CrmRecurringPlan getRecurringPlanAsObject() {
        return recurringPlanAsObject;
    }

    public OdooId getRecurringPlan() {
        return recurringPlan;
    }

    public String getZip() {
        return zip;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<CrmTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public CrmStage getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public double getProbability() {
        return probability;
    }

    public boolean getIsIsBlacklisted() {
        return isIsBlacklisted;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getVisitorPageCount() {
        return visitorPageCount;
    }

    public Object getPriority() {
        return priority;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public Object getLeadProperties() {
        return leadProperties;
    }

    public double getAutomatedProbability() {
        return automatedProbability;
    }

    public double getDayClose() {
        return dayClose;
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

    public List<ResCompany> getUserCompanyIdsAsList() {
        return userCompanyIdsAsList;
    }

    public List<Integer> getUserCompanyIds() {
        return userCompanyIds;
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

    public Object getRecurringRevenueMonthlyProrated() {
        return recurringRevenueMonthlyProrated;
    }

    public String getCity() {
        return city;
    }

    public int getQuotationCount() {
        return quotationCount;
    }

    public String getPhoneMobileSearch() {
        return phoneMobileSearch;
    }

    public Object getDateDeadline() {
        return dateDeadline;
    }

    public Object getPhoneState() {
        return phoneState;
    }

    public Object getSaleAmountTotal() {
        return saleAmountTotal;
    }

    public String getMeetingDisplayLabel() {
        return meetingDisplayLabel;
    }

    public Object getMeetingDisplayDate() {
        return meetingDisplayDate;
    }

    public Date getDateAutomationLast() {
        return dateAutomationLast;
    }

    public String getStreet2() {
        return street2;
    }

    public boolean getIsPartnerEmailUpdate() {
        return isPartnerEmailUpdate;
    }

    public String getContactName() {
        return contactName;
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

    public Object getRecurringRevenue() {
        return recurringRevenue;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public Date getDateLastStageUpdate() {
        return dateLastStageUpdate;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public boolean getIsIsAutomatedProbability() {
        return isIsAutomatedProbability;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public Object getRecurringRevenueProrated() {
        return recurringRevenueProrated;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public UtmSource getSourceIdAsObject() {
        return sourceIdAsObject;
    }

    public OdooId getSourceId() {
        return sourceId;
    }

    public List<CalendarEvent> getCalendarEventIdsAsList() {
        return calendarEventIdsAsList;
    }

    public List<Integer> getCalendarEventIds() {
        return calendarEventIds;
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

    public boolean getIsMobileBlacklisted() {
        return isMobileBlacklisted;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public Date getDateClosed() {
        return dateClosed;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getFunction() {
        return function;
    }

    public UtmMedium getMediumIdAsObject() {
        return mediumIdAsObject;
    }

    public OdooId getMediumId() {
        return mediumId;
    }

    public Date getDateConversion() {
        return dateConversion;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public UtmCampaign getCampaignIdAsObject() {
        return campaignIdAsObject;
    }

    public OdooId getCampaignId() {
        return campaignId;
    }

    public String getRevealId() {
        return revealId;
    }

    public boolean getIsPartnerIsBlacklisted() {
        return isPartnerIsBlacklisted;
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

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public CrmLostReason getLostReasonIdAsObject() {
        return lostReasonIdAsObject;
    }

    public OdooId getLostReasonId() {
        return lostReasonId;
    }

    public List<WebsiteVisitor> getVisitorIdsAsList() {
        return visitorIdsAsList;
    }

    public List<Integer> getVisitorIds() {
        return visitorIds;
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

    public String getEmailNormalized() {
        return emailNormalized;
    }

    public String getEmailCc() {
        return emailCc;
    }

    public boolean getIsShowEnrichButton() {
        return isShowEnrichButton;
    }

    public int getDuplicateLeadCount() {
        return duplicateLeadCount;
    }

    public Object getEmailState() {
        return emailState;
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

    public boolean getIsPartnerPhoneUpdate() {
        return isPartnerPhoneUpdate;
    }

    public int getLangActiveCount() {
        return langActiveCount;
    }

    public Object getDescription() {
        return description;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public ResPartnerTitle getTitleAsObject() {
        return titleAsObject;
    }

    public OdooId getTitle() {
        return title;
    }

    public Object getExpectedRevenue() {
        return expectedRevenue;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getLangCode() {
        return langCode;
    }

    public Object getDurationTracking() {
        return durationTracking;
    }

    public String getStreet() {
        return street;
    }

    public boolean getIsIsPartnerVisible() {
        return isIsPartnerVisible;
    }

    public ResCurrency getCompanyCurrencyAsObject() {
        return companyCurrencyAsObject;
    }

    public OdooId getCompanyCurrency() {
        return companyCurrency;
    }

    public boolean getIsIapEnrichDone() {
        return isIapEnrichDone;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public String getMobile() {
        return mobile;
    }

    public ResLang getLangIdAsObject() {
        return langIdAsObject;
    }

    public OdooId getLangId() {
        return langId;
    }

    public List<SaleOrder> getOrderIdsAsList() {
        return orderIdsAsList;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public boolean getIsPhoneSanitizedBlacklisted() {
        return isPhoneSanitizedBlacklisted;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public List<CrmLead> getDuplicateLeadIdsAsList() {
        return duplicateLeadIdsAsList;
    }

    public List<Integer> getDuplicateLeadIds() {
        return duplicateLeadIds;
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

    public Object getRecurringRevenueMonthly() {
        return recurringRevenueMonthly;
    }

    public String getPhoneSanitized() {
        return phoneSanitized;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public String getReferred() {
        return referred;
    }

    public CrmIapLeadMiningRequest getLeadMiningRequestIdAsObject() {
        return leadMiningRequestIdAsObject;
    }

    public OdooId getLeadMiningRequestId() {
        return leadMiningRequestId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setKanbanState(Object kanbanState) {
        this.kanbanState = kanbanState;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
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

    public void setEmailDomainCriterion(String emailDomainCriterion) {
        this.emailDomainCriterion = emailDomainCriterion;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
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

    public void setDateOpen(Date dateOpen) {
        this.dateOpen = dateOpen;
    }

    public void setDayOpen(double dayOpen) {
        this.dayOpen = dayOpen;
    }

    public void setProratedRevenue(Object proratedRevenue) {
        this.proratedRevenue = proratedRevenue;
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

    public void setRecurringPlanAsObject(CrmRecurringPlan recurringPlanAsObject) {
        this.recurringPlanAsObject = recurringPlanAsObject;
    }

    public void setRecurringPlan(OdooId recurringPlan) {
        this.recurringPlan = recurringPlan;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTagIdsAsList(List<CrmTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setStageIdAsObject(CrmStage stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public void setIsIsBlacklisted(boolean isIsBlacklisted) {
        this.isIsBlacklisted = isIsBlacklisted;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setVisitorPageCount(int visitorPageCount) {
        this.visitorPageCount = visitorPageCount;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setLeadProperties(Object leadProperties) {
        this.leadProperties = leadProperties;
    }

    public void setAutomatedProbability(double automatedProbability) {
        this.automatedProbability = automatedProbability;
    }

    public void setDayClose(double dayClose) {
        this.dayClose = dayClose;
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

    public void setUserCompanyIdsAsList(List<ResCompany> userCompanyIdsAsList) {
        this.userCompanyIdsAsList = userCompanyIdsAsList;
    }

    public void setUserCompanyIds(List<Integer> userCompanyIds) {
        this.userCompanyIds = userCompanyIds;
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

    public void setRecurringRevenueMonthlyProrated(Object recurringRevenueMonthlyProrated) {
        this.recurringRevenueMonthlyProrated = recurringRevenueMonthlyProrated;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setQuotationCount(int quotationCount) {
        this.quotationCount = quotationCount;
    }

    public void setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch;
    }

    public void setDateDeadline(Object dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setPhoneState(Object phoneState) {
        this.phoneState = phoneState;
    }

    public void setSaleAmountTotal(Object saleAmountTotal) {
        this.saleAmountTotal = saleAmountTotal;
    }

    public void setMeetingDisplayLabel(String meetingDisplayLabel) {
        this.meetingDisplayLabel = meetingDisplayLabel;
    }

    public void setMeetingDisplayDate(Object meetingDisplayDate) {
        this.meetingDisplayDate = meetingDisplayDate;
    }

    public void setDateAutomationLast(Date dateAutomationLast) {
        this.dateAutomationLast = dateAutomationLast;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setIsPartnerEmailUpdate(boolean isPartnerEmailUpdate) {
        this.isPartnerEmailUpdate = isPartnerEmailUpdate;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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

    public void setRecurringRevenue(Object recurringRevenue) {
        this.recurringRevenue = recurringRevenue;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setDateLastStageUpdate(Date dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setIsIsAutomatedProbability(boolean isIsAutomatedProbability) {
        this.isIsAutomatedProbability = isIsAutomatedProbability;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setRecurringRevenueProrated(Object recurringRevenueProrated) {
        this.recurringRevenueProrated = recurringRevenueProrated;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setSourceIdAsObject(UtmSource sourceIdAsObject) {
        this.sourceIdAsObject = sourceIdAsObject;
    }

    public void setSourceId(OdooId sourceId) {
        this.sourceId = sourceId;
    }

    public void setCalendarEventIdsAsList(List<CalendarEvent> calendarEventIdsAsList) {
        this.calendarEventIdsAsList = calendarEventIdsAsList;
    }

    public void setCalendarEventIds(List<Integer> calendarEventIds) {
        this.calendarEventIds = calendarEventIds;
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

    public void setIsMobileBlacklisted(boolean isMobileBlacklisted) {
        this.isMobileBlacklisted = isMobileBlacklisted;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setMediumIdAsObject(UtmMedium mediumIdAsObject) {
        this.mediumIdAsObject = mediumIdAsObject;
    }

    public void setMediumId(OdooId mediumId) {
        this.mediumId = mediumId;
    }

    public void setDateConversion(Date dateConversion) {
        this.dateConversion = dateConversion;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCampaignIdAsObject(UtmCampaign campaignIdAsObject) {
        this.campaignIdAsObject = campaignIdAsObject;
    }

    public void setCampaignId(OdooId campaignId) {
        this.campaignId = campaignId;
    }

    public void setRevealId(String revealId) {
        this.revealId = revealId;
    }

    public void setIsPartnerIsBlacklisted(boolean isPartnerIsBlacklisted) {
        this.isPartnerIsBlacklisted = isPartnerIsBlacklisted;
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

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setLostReasonIdAsObject(CrmLostReason lostReasonIdAsObject) {
        this.lostReasonIdAsObject = lostReasonIdAsObject;
    }

    public void setLostReasonId(OdooId lostReasonId) {
        this.lostReasonId = lostReasonId;
    }

    public void setVisitorIdsAsList(List<WebsiteVisitor> visitorIdsAsList) {
        this.visitorIdsAsList = visitorIdsAsList;
    }

    public void setVisitorIds(List<Integer> visitorIds) {
        this.visitorIds = visitorIds;
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

    public void setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public void setIsShowEnrichButton(boolean isShowEnrichButton) {
        this.isShowEnrichButton = isShowEnrichButton;
    }

    public void setDuplicateLeadCount(int duplicateLeadCount) {
        this.duplicateLeadCount = duplicateLeadCount;
    }

    public void setEmailState(Object emailState) {
        this.emailState = emailState;
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

    public void setIsPartnerPhoneUpdate(boolean isPartnerPhoneUpdate) {
        this.isPartnerPhoneUpdate = isPartnerPhoneUpdate;
    }

    public void setLangActiveCount(int langActiveCount) {
        this.langActiveCount = langActiveCount;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setTitleAsObject(ResPartnerTitle titleAsObject) {
        this.titleAsObject = titleAsObject;
    }

    public void setTitle(OdooId title) {
        this.title = title;
    }

    public void setExpectedRevenue(Object expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public void setDurationTracking(Object durationTracking) {
        this.durationTracking = durationTracking;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setIsIsPartnerVisible(boolean isIsPartnerVisible) {
        this.isIsPartnerVisible = isIsPartnerVisible;
    }

    public void setCompanyCurrencyAsObject(ResCurrency companyCurrencyAsObject) {
        this.companyCurrencyAsObject = companyCurrencyAsObject;
    }

    public void setCompanyCurrency(OdooId companyCurrency) {
        this.companyCurrency = companyCurrency;
    }

    public void setIsIapEnrichDone(boolean isIapEnrichDone) {
        this.isIapEnrichDone = isIapEnrichDone;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setLangIdAsObject(ResLang langIdAsObject) {
        this.langIdAsObject = langIdAsObject;
    }

    public void setLangId(OdooId langId) {
        this.langId = langId;
    }

    public void setOrderIdsAsList(List<SaleOrder> orderIdsAsList) {
        this.orderIdsAsList = orderIdsAsList;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    public void setIsPhoneSanitizedBlacklisted(boolean isPhoneSanitizedBlacklisted) {
        this.isPhoneSanitizedBlacklisted = isPhoneSanitizedBlacklisted;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setDuplicateLeadIdsAsList(List<CrmLead> duplicateLeadIdsAsList) {
        this.duplicateLeadIdsAsList = duplicateLeadIdsAsList;
    }

    public void setDuplicateLeadIds(List<Integer> duplicateLeadIds) {
        this.duplicateLeadIds = duplicateLeadIds;
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

    public void setRecurringRevenueMonthly(Object recurringRevenueMonthly) {
        this.recurringRevenueMonthly = recurringRevenueMonthly;
    }

    public void setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public void setReferred(String referred) {
        this.referred = referred;
    }

    public void setLeadMiningRequestIdAsObject(CrmIapLeadMiningRequest leadMiningRequestIdAsObject) {
        this.leadMiningRequestIdAsObject = leadMiningRequestIdAsObject;
    }

    public void setLeadMiningRequestId(OdooId leadMiningRequestId) {
        this.leadMiningRequestId = leadMiningRequestId;
    }



}