
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

package ch.helvethink.odoo4java.test.ng.hr;

import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.test.ng.hr.recruitment.HrRecruitmentStage;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.applicant.HrApplicantCategory;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.utm.UtmCampaign;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.utm.UtmSource;
import ch.helvethink.odoo4java.test.ng.utm.UtmMedium;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.hr.recruitment.HrRecruitmentDegree;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.hr.HrSkill;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.hr.applicant.HrApplicantSkill;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.hr.applicant.refuse.HrApplicantRefuseReason;;

@OdooObject("hr.applicant")
public class HrApplicant implements OdooObj {

    
    private String partnerMobile;

    
    private Date writeDate;

    
    private IrAttachment messageMainAttachmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId messageMainAttachmentId;

    
    private String partnerName;

    
    private Object kanbanState;

    
    private Object activityDateDeadline;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private Date dateOpen;

    
    private double dayOpen;

    
    private Object applicantProperties;

    
    private int messageBounce;

    
    private int id;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private int messageAttachmentCount;

    
    private double probability;

    
    private HrRecruitmentStage stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.recruitment.HrRecruitmentStage")
        @OdooModel("hr.recruitment.HrRecruitmentStage")
    
    private OdooId stageId;

    
    private double delayClose;

    
    private boolean isIsBlacklisted;

    
    private boolean isActive;

    
    private Object priority;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String legendBlocked;

    
    private double dayClose;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private boolean isMessageIsFollower;

    
    private String phoneMobileSearch;

    
    private Object availability;

    
    private double salaryExpected;

    
    private Object meetingDisplayDate;

    
    private List<HrApplicantSkill> applicantSkillIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.applicant.HrApplicantSkill")
        @OdooModel("hr.applicant.HrApplicantSkill")
    
    private List<Integer> applicantSkillIds;

    
    private HrRecruitmentStage lastStageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.recruitment.HrRecruitmentStage")
        @OdooModel("hr.recruitment.HrRecruitmentStage")
    
    private OdooId lastStageId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private HrRecruitmentDegree typeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.recruitment.HrRecruitmentDegree")
        @OdooModel("hr.recruitment.HrRecruitmentDegree")
    
    private OdooId typeId;

    
    private boolean isMessageHasSmsError;

    
    private String employeeName;

    
    private Date dateLastStageUpdate;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private String partnerMobileSanitized;

    
    private String legendNormal;

    
    private boolean isEmpIsActive;

    
    private List<HrSkill> skillIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrSkill")
        @OdooModel("hr.HrSkill")
    
    private List<Integer> skillIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private UtmSource sourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmSource")
        @OdooModel("utm.UtmSource")
    
    private OdooId sourceId;

    
    private HrEmployee empIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId empId;

    
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

    
    private boolean isIsInterviewer;

    
    private Object applicationStatus;

    
    private UtmMedium mediumIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmMedium")
        @OdooModel("utm.UtmMedium")
    
    private OdooId mediumId;

    
    private Date createDate;

    
    private UtmCampaign campaignIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmCampaign")
        @OdooModel("utm.UtmCampaign")
    
    private OdooId campaignId;

    
    private String userEmail;

    
    private HrApplicantRefuseReason refuseReasonIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.applicant.refuse.HrApplicantRefuseReason")
        @OdooModel("hr.applicant.refuse.HrApplicantRefuseReason")
    
    private OdooId refuseReasonId;

    
    private String legendDone;

    
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

    
    private int attachmentNumber;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private String emailNormalized;

    
    private List<HrApplicantCategory> categIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.applicant.HrApplicantCategory")
        @OdooModel("hr.applicant.HrApplicantCategory")
    
    private List<Integer> categIds;

    
    private String emailCc;

    
    private String partnerPhoneSanitized;

    
    private String linkedinProfile;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private Object description;

    
    private String partnerPhone;

    
    private Object myActivityDateDeadline;

    
    private List<ResUsers> interviewerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> interviewerIds;

    
    private double salaryProposed;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String activityTypeIcon;

    
    private int applicationCount;

    
    private String salaryProposedExtra;

    
    private List<CalendarEvent> meetingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private List<Integer> meetingIds;

    
    private String meetingDisplayText;

    
    private boolean isPhoneSanitizedBlacklisted;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private HrJob jobIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private OdooId jobId;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private String salaryExpectedExtra;

    
    private String phoneSanitized;

    
    private String emailFrom;


    public HrApplicant() {
    // Constructor
    }


    public String getPartnerMobile() {
        return partnerMobile;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public IrAttachment getMessageMainAttachmentIdAsObject() {
        return messageMainAttachmentIdAsObject;
    }

    public OdooId getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public Object getKanbanState() {
        return kanbanState;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
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

    public Object getApplicantProperties() {
        return applicantProperties;
    }

    public int getMessageBounce() {
        return messageBounce;
    }

    public int getId() {
        return id;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public double getProbability() {
        return probability;
    }

    public HrRecruitmentStage getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public double getDelayClose() {
        return delayClose;
    }

    public boolean getIsIsBlacklisted() {
        return isIsBlacklisted;
    }

    public boolean getIsActive() {
        return isActive;
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

    public String getLegendBlocked() {
        return legendBlocked;
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

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public String getPhoneMobileSearch() {
        return phoneMobileSearch;
    }

    public Object getAvailability() {
        return availability;
    }

    public double getSalaryExpected() {
        return salaryExpected;
    }

    public Object getMeetingDisplayDate() {
        return meetingDisplayDate;
    }

    public List<HrApplicantSkill> getApplicantSkillIdsAsList() {
        return applicantSkillIdsAsList;
    }

    public List<Integer> getApplicantSkillIds() {
        return applicantSkillIds;
    }

    public HrRecruitmentStage getLastStageIdAsObject() {
        return lastStageIdAsObject;
    }

    public OdooId getLastStageId() {
        return lastStageId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public HrRecruitmentDegree getTypeIdAsObject() {
        return typeIdAsObject;
    }

    public OdooId getTypeId() {
        return typeId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public String getEmployeeName() {
        return employeeName;
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

    public String getPartnerMobileSanitized() {
        return partnerMobileSanitized;
    }

    public String getLegendNormal() {
        return legendNormal;
    }

    public boolean getIsEmpIsActive() {
        return isEmpIsActive;
    }

    public List<HrSkill> getSkillIdsAsList() {
        return skillIdsAsList;
    }

    public List<Integer> getSkillIds() {
        return skillIds;
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

    public HrEmployee getEmpIdAsObject() {
        return empIdAsObject;
    }

    public OdooId getEmpId() {
        return empId;
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

    public boolean getIsIsInterviewer() {
        return isIsInterviewer;
    }

    public Object getApplicationStatus() {
        return applicationStatus;
    }

    public UtmMedium getMediumIdAsObject() {
        return mediumIdAsObject;
    }

    public OdooId getMediumId() {
        return mediumId;
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

    public String getUserEmail() {
        return userEmail;
    }

    public HrApplicantRefuseReason getRefuseReasonIdAsObject() {
        return refuseReasonIdAsObject;
    }

    public OdooId getRefuseReasonId() {
        return refuseReasonId;
    }

    public String getLegendDone() {
        return legendDone;
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

    public int getAttachmentNumber() {
        return attachmentNumber;
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

    public List<HrApplicantCategory> getCategIdsAsList() {
        return categIdsAsList;
    }

    public List<Integer> getCategIds() {
        return categIds;
    }

    public String getEmailCc() {
        return emailCc;
    }

    public String getPartnerPhoneSanitized() {
        return partnerPhoneSanitized;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
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

    public Object getDescription() {
        return description;
    }

    public String getPartnerPhone() {
        return partnerPhone;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public List<ResUsers> getInterviewerIdsAsList() {
        return interviewerIdsAsList;
    }

    public List<Integer> getInterviewerIds() {
        return interviewerIds;
    }

    public double getSalaryProposed() {
        return salaryProposed;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public int getApplicationCount() {
        return applicationCount;
    }

    public String getSalaryProposedExtra() {
        return salaryProposedExtra;
    }

    public List<CalendarEvent> getMeetingIdsAsList() {
        return meetingIdsAsList;
    }

    public List<Integer> getMeetingIds() {
        return meetingIds;
    }

    public String getMeetingDisplayText() {
        return meetingDisplayText;
    }

    public boolean getIsPhoneSanitizedBlacklisted() {
        return isPhoneSanitizedBlacklisted;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public HrJob getJobIdAsObject() {
        return jobIdAsObject;
    }

    public OdooId getJobId() {
        return jobId;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getSalaryExpectedExtra() {
        return salaryExpectedExtra;
    }

    public String getPhoneSanitized() {
        return phoneSanitized;
    }

    public String getEmailFrom() {
        return emailFrom;
    }



    public void setPartnerMobile(String partnerMobile) {
        this.partnerMobile = partnerMobile;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMessageMainAttachmentIdAsObject(IrAttachment messageMainAttachmentIdAsObject) {
        this.messageMainAttachmentIdAsObject = messageMainAttachmentIdAsObject;
    }

    public void setMessageMainAttachmentId(OdooId messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public void setKanbanState(Object kanbanState) {
        this.kanbanState = kanbanState;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
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

    public void setApplicantProperties(Object applicantProperties) {
        this.applicantProperties = applicantProperties;
    }

    public void setMessageBounce(int messageBounce) {
        this.messageBounce = messageBounce;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public void setStageIdAsObject(HrRecruitmentStage stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setDelayClose(double delayClose) {
        this.delayClose = delayClose;
    }

    public void setIsIsBlacklisted(boolean isIsBlacklisted) {
        this.isIsBlacklisted = isIsBlacklisted;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setLegendBlocked(String legendBlocked) {
        this.legendBlocked = legendBlocked;
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

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch;
    }

    public void setAvailability(Object availability) {
        this.availability = availability;
    }

    public void setSalaryExpected(double salaryExpected) {
        this.salaryExpected = salaryExpected;
    }

    public void setMeetingDisplayDate(Object meetingDisplayDate) {
        this.meetingDisplayDate = meetingDisplayDate;
    }

    public void setApplicantSkillIdsAsList(List<HrApplicantSkill> applicantSkillIdsAsList) {
        this.applicantSkillIdsAsList = applicantSkillIdsAsList;
    }

    public void setApplicantSkillIds(List<Integer> applicantSkillIds) {
        this.applicantSkillIds = applicantSkillIds;
    }

    public void setLastStageIdAsObject(HrRecruitmentStage lastStageIdAsObject) {
        this.lastStageIdAsObject = lastStageIdAsObject;
    }

    public void setLastStageId(OdooId lastStageId) {
        this.lastStageId = lastStageId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setTypeIdAsObject(HrRecruitmentDegree typeIdAsObject) {
        this.typeIdAsObject = typeIdAsObject;
    }

    public void setTypeId(OdooId typeId) {
        this.typeId = typeId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public void setPartnerMobileSanitized(String partnerMobileSanitized) {
        this.partnerMobileSanitized = partnerMobileSanitized;
    }

    public void setLegendNormal(String legendNormal) {
        this.legendNormal = legendNormal;
    }

    public void setIsEmpIsActive(boolean isEmpIsActive) {
        this.isEmpIsActive = isEmpIsActive;
    }

    public void setSkillIdsAsList(List<HrSkill> skillIdsAsList) {
        this.skillIdsAsList = skillIdsAsList;
    }

    public void setSkillIds(List<Integer> skillIds) {
        this.skillIds = skillIds;
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

    public void setEmpIdAsObject(HrEmployee empIdAsObject) {
        this.empIdAsObject = empIdAsObject;
    }

    public void setEmpId(OdooId empId) {
        this.empId = empId;
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

    public void setIsIsInterviewer(boolean isIsInterviewer) {
        this.isIsInterviewer = isIsInterviewer;
    }

    public void setApplicationStatus(Object applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public void setMediumIdAsObject(UtmMedium mediumIdAsObject) {
        this.mediumIdAsObject = mediumIdAsObject;
    }

    public void setMediumId(OdooId mediumId) {
        this.mediumId = mediumId;
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

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setRefuseReasonIdAsObject(HrApplicantRefuseReason refuseReasonIdAsObject) {
        this.refuseReasonIdAsObject = refuseReasonIdAsObject;
    }

    public void setRefuseReasonId(OdooId refuseReasonId) {
        this.refuseReasonId = refuseReasonId;
    }

    public void setLegendDone(String legendDone) {
        this.legendDone = legendDone;
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

    public void setAttachmentNumber(int attachmentNumber) {
        this.attachmentNumber = attachmentNumber;
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

    public void setCategIdsAsList(List<HrApplicantCategory> categIdsAsList) {
        this.categIdsAsList = categIdsAsList;
    }

    public void setCategIds(List<Integer> categIds) {
        this.categIds = categIds;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public void setPartnerPhoneSanitized(String partnerPhoneSanitized) {
        this.partnerPhoneSanitized = partnerPhoneSanitized;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
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

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setPartnerPhone(String partnerPhone) {
        this.partnerPhone = partnerPhone;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setInterviewerIdsAsList(List<ResUsers> interviewerIdsAsList) {
        this.interviewerIdsAsList = interviewerIdsAsList;
    }

    public void setInterviewerIds(List<Integer> interviewerIds) {
        this.interviewerIds = interviewerIds;
    }

    public void setSalaryProposed(double salaryProposed) {
        this.salaryProposed = salaryProposed;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setApplicationCount(int applicationCount) {
        this.applicationCount = applicationCount;
    }

    public void setSalaryProposedExtra(String salaryProposedExtra) {
        this.salaryProposedExtra = salaryProposedExtra;
    }

    public void setMeetingIdsAsList(List<CalendarEvent> meetingIdsAsList) {
        this.meetingIdsAsList = meetingIdsAsList;
    }

    public void setMeetingIds(List<Integer> meetingIds) {
        this.meetingIds = meetingIds;
    }

    public void setMeetingDisplayText(String meetingDisplayText) {
        this.meetingDisplayText = meetingDisplayText;
    }

    public void setIsPhoneSanitizedBlacklisted(boolean isPhoneSanitizedBlacklisted) {
        this.isPhoneSanitizedBlacklisted = isPhoneSanitizedBlacklisted;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setJobIdAsObject(HrJob jobIdAsObject) {
        this.jobIdAsObject = jobIdAsObject;
    }

    public void setJobId(OdooId jobId) {
        this.jobId = jobId;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setSalaryExpectedExtra(String salaryExpectedExtra) {
        this.salaryExpectedExtra = salaryExpectedExtra;
    }

    public void setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }



}