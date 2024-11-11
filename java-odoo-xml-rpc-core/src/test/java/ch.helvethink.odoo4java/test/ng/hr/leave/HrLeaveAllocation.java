
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

package ch.helvethink.odoo4java.test.ng.hr.leave;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.hr.attendance.HrAttendanceOvertime;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualPlan;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveAllocation;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("hr.leave.allocation")
public class HrLeaveAllocation implements OdooObj {

    
    private Date writeDate;

    
    private HrAttendanceOvertime overtimeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.attendance.HrAttendanceOvertime")
        @OdooModel("hr.attendance.HrAttendanceOvertime")
    
    private OdooId overtimeId;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object notes;

    
    private boolean isAlreadyAccrued;

    
    private ResCompany employeeCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId employeeCompanyId;

    
    private ResCompany modeCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId modeCompanyId;

    
    private Object activityDateDeadline;

    
    private Object activityState;

    
    private Object activityExceptionDecoration;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private Object validationType;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private boolean isHasMessage;

    
    private boolean isHasAccrualPlan;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private double leavesTaken;

    
    private int messageAttachmentCount;

    
    private List<HrLeaveAllocation> linkedRequestIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveAllocation")
        @OdooModel("hr.leave.HrLeaveAllocation")
    
    private List<Integer> linkedRequestIds;

    
    private HrEmployee approverIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId approverId;

    
    private List<HrEmployee> employeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> employeeIds;

    
    private Object allocationType;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isActive;

    
    private boolean isCanApprove;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private Object dateTo;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object typeRequestUnit;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private double employeeOvertime;

    
    private HrLeaveAllocation parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveAllocation")
        @OdooModel("hr.leave.HrLeaveAllocation")
    
    private OdooId parentId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private Object nextcall;

    
    private boolean isIsOfficer;

    
    private Object holidayType;

    
    private Object dateFrom;

    
    private boolean isMessageIsFollower;

    
    private String nameValidity;

    
    private double numberOfHoursDisplay;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object myActivityDateDeadline;

    
    private HrEmployeeCategory categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory")
        @OdooModel("hr.employee.HrEmployeeCategory")
    
    private OdooId categoryId;

    
    private HrEmployee managerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId managerId;

    
    private boolean isActiveEmployee;

    
    private HrLeaveType holidayStatusIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType")
        @OdooModel("hr.leave.HrLeaveType")
    
    private OdooId holidayStatusId;

    
    private String privateName;

    
    private String activityTypeIcon;

    
    private double numberOfDays;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private double numberOfDaysDisplay;

    
    private HrLeaveAccrualPlan accrualPlanIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualPlan")
        @OdooModel("hr.leave.accrual.HrLeaveAccrualPlan")
    
    private OdooId accrualPlanId;

    
    private boolean isMessageHasSmsError;

    
    private double maxLeaves;

    
    private boolean isOvertimeDeductible;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private boolean isHrAttendanceOvertime;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private String durationDisplay;

    
    private Object lastcall;

    
    private boolean isMultiEmployee;


    public HrLeaveAllocation() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public HrAttendanceOvertime getOvertimeIdAsObject() {
        return overtimeIdAsObject;
    }

    public OdooId getOvertimeId() {
        return overtimeId;
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

    public boolean getIsAlreadyAccrued() {
        return isAlreadyAccrued;
    }

    public ResCompany getEmployeeCompanyIdAsObject() {
        return employeeCompanyIdAsObject;
    }

    public OdooId getEmployeeCompanyId() {
        return employeeCompanyId;
    }

    public ResCompany getModeCompanyIdAsObject() {
        return modeCompanyIdAsObject;
    }

    public OdooId getModeCompanyId() {
        return modeCompanyId;
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

    public Object getValidationType() {
        return validationType;
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

    public boolean getIsHasAccrualPlan() {
        return isHasAccrualPlan;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getLeavesTaken() {
        return leavesTaken;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<HrLeaveAllocation> getLinkedRequestIdsAsList() {
        return linkedRequestIdsAsList;
    }

    public List<Integer> getLinkedRequestIds() {
        return linkedRequestIds;
    }

    public HrEmployee getApproverIdAsObject() {
        return approverIdAsObject;
    }

    public OdooId getApproverId() {
        return approverId;
    }

    public List<HrEmployee> getEmployeeIdsAsList() {
        return employeeIdsAsList;
    }

    public List<Integer> getEmployeeIds() {
        return employeeIds;
    }

    public Object getAllocationType() {
        return allocationType;
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

    public boolean getIsCanApprove() {
        return isCanApprove;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public Object getDateTo() {
        return dateTo;
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

    public Object getTypeRequestUnit() {
        return typeRequestUnit;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public double getEmployeeOvertime() {
        return employeeOvertime;
    }

    public HrLeaveAllocation getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
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

    public Object getNextcall() {
        return nextcall;
    }

    public boolean getIsIsOfficer() {
        return isIsOfficer;
    }

    public Object getHolidayType() {
        return holidayType;
    }

    public Object getDateFrom() {
        return dateFrom;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public String getNameValidity() {
        return nameValidity;
    }

    public double getNumberOfHoursDisplay() {
        return numberOfHoursDisplay;
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

    public HrEmployeeCategory getCategoryIdAsObject() {
        return categoryIdAsObject;
    }

    public OdooId getCategoryId() {
        return categoryId;
    }

    public HrEmployee getManagerIdAsObject() {
        return managerIdAsObject;
    }

    public OdooId getManagerId() {
        return managerId;
    }

    public boolean getIsActiveEmployee() {
        return isActiveEmployee;
    }

    public HrLeaveType getHolidayStatusIdAsObject() {
        return holidayStatusIdAsObject;
    }

    public OdooId getHolidayStatusId() {
        return holidayStatusId;
    }

    public String getPrivateName() {
        return privateName;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public double getNumberOfDays() {
        return numberOfDays;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public double getNumberOfDaysDisplay() {
        return numberOfDaysDisplay;
    }

    public HrLeaveAccrualPlan getAccrualPlanIdAsObject() {
        return accrualPlanIdAsObject;
    }

    public OdooId getAccrualPlanId() {
        return accrualPlanId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public double getMaxLeaves() {
        return maxLeaves;
    }

    public boolean getIsOvertimeDeductible() {
        return isOvertimeDeductible;
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

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
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

    public String getDurationDisplay() {
        return durationDisplay;
    }

    public Object getLastcall() {
        return lastcall;
    }

    public boolean getIsMultiEmployee() {
        return isMultiEmployee;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setOvertimeIdAsObject(HrAttendanceOvertime overtimeIdAsObject) {
        this.overtimeIdAsObject = overtimeIdAsObject;
    }

    public void setOvertimeId(OdooId overtimeId) {
        this.overtimeId = overtimeId;
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

    public void setIsAlreadyAccrued(boolean isAlreadyAccrued) {
        this.isAlreadyAccrued = isAlreadyAccrued;
    }

    public void setEmployeeCompanyIdAsObject(ResCompany employeeCompanyIdAsObject) {
        this.employeeCompanyIdAsObject = employeeCompanyIdAsObject;
    }

    public void setEmployeeCompanyId(OdooId employeeCompanyId) {
        this.employeeCompanyId = employeeCompanyId;
    }

    public void setModeCompanyIdAsObject(ResCompany modeCompanyIdAsObject) {
        this.modeCompanyIdAsObject = modeCompanyIdAsObject;
    }

    public void setModeCompanyId(OdooId modeCompanyId) {
        this.modeCompanyId = modeCompanyId;
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

    public void setValidationType(Object validationType) {
        this.validationType = validationType;
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

    public void setIsHasAccrualPlan(boolean isHasAccrualPlan) {
        this.isHasAccrualPlan = isHasAccrualPlan;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLeavesTaken(double leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setLinkedRequestIdsAsList(List<HrLeaveAllocation> linkedRequestIdsAsList) {
        this.linkedRequestIdsAsList = linkedRequestIdsAsList;
    }

    public void setLinkedRequestIds(List<Integer> linkedRequestIds) {
        this.linkedRequestIds = linkedRequestIds;
    }

    public void setApproverIdAsObject(HrEmployee approverIdAsObject) {
        this.approverIdAsObject = approverIdAsObject;
    }

    public void setApproverId(OdooId approverId) {
        this.approverId = approverId;
    }

    public void setEmployeeIdsAsList(List<HrEmployee> employeeIdsAsList) {
        this.employeeIdsAsList = employeeIdsAsList;
    }

    public void setEmployeeIds(List<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public void setAllocationType(Object allocationType) {
        this.allocationType = allocationType;
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

    public void setIsCanApprove(boolean isCanApprove) {
        this.isCanApprove = isCanApprove;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setDateTo(Object dateTo) {
        this.dateTo = dateTo;
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

    public void setTypeRequestUnit(Object typeRequestUnit) {
        this.typeRequestUnit = typeRequestUnit;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setEmployeeOvertime(double employeeOvertime) {
        this.employeeOvertime = employeeOvertime;
    }

    public void setParentIdAsObject(HrLeaveAllocation parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
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

    public void setNextcall(Object nextcall) {
        this.nextcall = nextcall;
    }

    public void setIsIsOfficer(boolean isIsOfficer) {
        this.isIsOfficer = isIsOfficer;
    }

    public void setHolidayType(Object holidayType) {
        this.holidayType = holidayType;
    }

    public void setDateFrom(Object dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setNameValidity(String nameValidity) {
        this.nameValidity = nameValidity;
    }

    public void setNumberOfHoursDisplay(double numberOfHoursDisplay) {
        this.numberOfHoursDisplay = numberOfHoursDisplay;
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

    public void setCategoryIdAsObject(HrEmployeeCategory categoryIdAsObject) {
        this.categoryIdAsObject = categoryIdAsObject;
    }

    public void setCategoryId(OdooId categoryId) {
        this.categoryId = categoryId;
    }

    public void setManagerIdAsObject(HrEmployee managerIdAsObject) {
        this.managerIdAsObject = managerIdAsObject;
    }

    public void setManagerId(OdooId managerId) {
        this.managerId = managerId;
    }

    public void setIsActiveEmployee(boolean isActiveEmployee) {
        this.isActiveEmployee = isActiveEmployee;
    }

    public void setHolidayStatusIdAsObject(HrLeaveType holidayStatusIdAsObject) {
        this.holidayStatusIdAsObject = holidayStatusIdAsObject;
    }

    public void setHolidayStatusId(OdooId holidayStatusId) {
        this.holidayStatusId = holidayStatusId;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setNumberOfDaysDisplay(double numberOfDaysDisplay) {
        this.numberOfDaysDisplay = numberOfDaysDisplay;
    }

    public void setAccrualPlanIdAsObject(HrLeaveAccrualPlan accrualPlanIdAsObject) {
        this.accrualPlanIdAsObject = accrualPlanIdAsObject;
    }

    public void setAccrualPlanId(OdooId accrualPlanId) {
        this.accrualPlanId = accrualPlanId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setMaxLeaves(double maxLeaves) {
        this.maxLeaves = maxLeaves;
    }

    public void setIsOvertimeDeductible(boolean isOvertimeDeductible) {
        this.isOvertimeDeductible = isOvertimeDeductible;
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

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
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

    public void setDurationDisplay(String durationDisplay) {
        this.durationDisplay = durationDisplay;
    }

    public void setLastcall(Object lastcall) {
        this.lastcall = lastcall;
    }

    public void setIsMultiEmployee(boolean isMultiEmployee) {
        this.isMultiEmployee = isMultiEmployee;
    }



}