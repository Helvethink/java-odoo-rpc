
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

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.hr.contract.HrContractType;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.payroll.structure.HrPayrollStructureType;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("hr.contract")
public class HrContract implements OdooObj {

    
    private Date writeDate;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object notes;

    
    private Object kanbanState;

    
    private HrContractType contractTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.contract.HrContractType")
        @OdooModel("hr.contract.HrContractType")
    
    private OdooId contractTypeId;

    
    private Object activityDateDeadline;

    
    private Object activityState;

    
    private Object activityExceptionDecoration;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private boolean isHasMessage;

    
    private Object state;

    
    private int id;

    
    private boolean isCalendarMismatch;

    
    private Date createDate;

    
    private Object wage;

    
    private int messageAttachmentCount;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private Object dateEnd;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String permitNo;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String countryCode;

    
    private String visaNo;

    
    private Object dateStart;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private ResUsers hrResponsibleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId hrResponsibleId;

    
    private boolean isMessageIsFollower;

    
    private Object contractWage;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object myActivityDateDeadline;

    
    private Object trialDateEnd;

    
    private ResCountry companyCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId companyCountryId;

    
    private int contractsCount;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private HrPayrollStructureType structureTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.payroll.structure.HrPayrollStructureType")
        @OdooModel("hr.payroll.structure.HrPayrollStructureType")
    
    private OdooId structureTypeId;

    
    private Object firstContractDate;

    
    private String activityTypeIcon;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private boolean isMessageHasSmsError;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private HrJob jobIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private OdooId jobId;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public HrContract() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getNotes() {
        return notes;
    }

    public Object getKanbanState() {
        return kanbanState;
    }

    public HrContractType getContractTypeIdAsObject() {
        return contractTypeIdAsObject;
    }

    public OdooId getContractTypeId() {
        return contractTypeId;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
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

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public boolean getIsCalendarMismatch() {
        return isCalendarMismatch;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getWage() {
        return wage;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public Object getDateEnd() {
        return dateEnd;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getPermitNo() {
        return permitNo;
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

    public String getVisaNo() {
        return visaNo;
    }

    public Object getDateStart() {
        return dateStart;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
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

    public ResUsers getHrResponsibleIdAsObject() {
        return hrResponsibleIdAsObject;
    }

    public OdooId getHrResponsibleId() {
        return hrResponsibleId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public Object getContractWage() {
        return contractWage;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public Object getTrialDateEnd() {
        return trialDateEnd;
    }

    public ResCountry getCompanyCountryIdAsObject() {
        return companyCountryIdAsObject;
    }

    public OdooId getCompanyCountryId() {
        return companyCountryId;
    }

    public int getContractsCount() {
        return contractsCount;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public HrPayrollStructureType getStructureTypeIdAsObject() {
        return structureTypeIdAsObject;
    }

    public OdooId getStructureTypeId() {
        return structureTypeId;
    }

    public Object getFirstContractDate() {
        return firstContractDate;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
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

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
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

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public void setKanbanState(Object kanbanState) {
        this.kanbanState = kanbanState;
    }

    public void setContractTypeIdAsObject(HrContractType contractTypeIdAsObject) {
        this.contractTypeIdAsObject = contractTypeIdAsObject;
    }

    public void setContractTypeId(OdooId contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
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

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsCalendarMismatch(boolean isCalendarMismatch) {
        this.isCalendarMismatch = isCalendarMismatch;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setWage(Object wage) {
        this.wage = wage;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setDateEnd(Object dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
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

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }

    public void setDateStart(Object dateStart) {
        this.dateStart = dateStart;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
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

    public void setHrResponsibleIdAsObject(ResUsers hrResponsibleIdAsObject) {
        this.hrResponsibleIdAsObject = hrResponsibleIdAsObject;
    }

    public void setHrResponsibleId(OdooId hrResponsibleId) {
        this.hrResponsibleId = hrResponsibleId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setContractWage(Object contractWage) {
        this.contractWage = contractWage;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setTrialDateEnd(Object trialDateEnd) {
        this.trialDateEnd = trialDateEnd;
    }

    public void setCompanyCountryIdAsObject(ResCountry companyCountryIdAsObject) {
        this.companyCountryIdAsObject = companyCountryIdAsObject;
    }

    public void setCompanyCountryId(OdooId companyCountryId) {
        this.companyCountryId = companyCountryId;
    }

    public void setContractsCount(int contractsCount) {
        this.contractsCount = contractsCount;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setStructureTypeIdAsObject(HrPayrollStructureType structureTypeIdAsObject) {
        this.structureTypeIdAsObject = structureTypeIdAsObject;
    }

    public void setStructureTypeId(OdooId structureTypeId) {
        this.structureTypeId = structureTypeId;
    }

    public void setFirstContractDate(Object firstContractDate) {
        this.firstContractDate = firstContractDate;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
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

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
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

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}