
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
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.attendance.HrAttendanceOvertime;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.test.ng.hr.HrLeave;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("hr.leave")
public class HrLeave implements OdooObj {

    
    private Date writeDate;

    
    private HrAttendanceOvertime overtimeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.attendance.HrAttendanceOvertime")
        @OdooModel("hr.attendance.HrAttendanceOvertime")
    
    private OdooId overtimeId;

    
    private List<HrEmployee> allEmployeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> allEmployeeIds;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object notes;

    
    private IrAttachment messageMainAttachmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId messageMainAttachmentId;

    
    private Object tz;

    
    private int supportedAttachmentIdsCount;

    
    private Object requestDateFrom;

    
    private ResCompany employeeCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId employeeCompanyId;

    
    private ResCompany modeCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId modeCompanyId;

    
    private Object activityDateDeadline;

    
    private boolean isHasMandatoryDay;

    
    private Object activityState;

    
    private Object activityExceptionDecoration;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private Object requestHourFrom;

    
    private int messageHasErrorCounter;

    
    private Object validationType;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private boolean isHasMessage;

    
    private Object requestHourTo;

    
    private boolean isLeaveTypeIncreasesDuration;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private boolean isIsStriked;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private List<AccountAnalyticLine> timesheetIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> timesheetIds;

    
    private int messageAttachmentCount;

    
    private List<HrLeave> linkedRequestIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrLeave")
        @OdooModel("hr.HrLeave")
    
    private List<Integer> linkedRequestIds;

    
    private List<HrEmployee> employeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> employeeIds;

    
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

    
    private Date dateTo;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private double employeeOvertime;

    
    private HrLeave parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrLeave")
        @OdooModel("hr.HrLeave")
    
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

    
    private Object requestDateFromPeriod;

    
    private Object holidayType;

    
    private Date dateFrom;

    
    private boolean isLeaveTypeSupportDocument;

    
    private Object leaveTypeRequestUnit;

    
    private boolean isMessageIsFollower;

    
    private double numberOfHoursDisplay;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isRequestUnitHalf;

    
    private int color;

    
    private CalendarEvent meetingIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId meetingId;

    
    private boolean isIsHatched;

    
    private boolean isCanCancel;

    
    private Object myActivityDateDeadline;

    
    private HrEmployeeCategory categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory")
        @OdooModel("hr.employee.HrEmployeeCategory")
    
    private OdooId categoryId;

    
    private List<IrAttachment> supportedAttachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> supportedAttachmentIds;

    
    private boolean isRequestUnitHours;

    
    private HrEmployee managerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId managerId;

    
    private Object reportNote;

    
    private boolean isActiveEmployee;

    
    private boolean isTzMismatch;

    
    private HrLeaveType holidayStatusIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType")
        @OdooModel("hr.leave.HrLeaveType")
    
    private OdooId holidayStatusId;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private HrEmployee firstApproverIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId firstApproverId;

    
    private String privateName;

    
    private String activityTypeIcon;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private double numberOfDays;

    
    private double numberOfDaysDisplay;

    
    private boolean isCanReset;

    
    private boolean isMessageHasSmsError;

    
    private boolean isOvertimeDeductible;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isIsUserOnlyResponsible;

    
    private double numberOfHours;

    
    private Object requestDateTo;

    
    private boolean isMessageHasError;

    
    private boolean isLastSeveralDays;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private String durationDisplay;

    
    private String numberOfHoursText;

    
    private HrEmployee secondApproverIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId secondApproverId;

    
    private boolean isMultiEmployee;


    public HrLeave() {
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

    public List<HrEmployee> getAllEmployeeIdsAsList() {
        return allEmployeeIdsAsList;
    }

    public List<Integer> getAllEmployeeIds() {
        return allEmployeeIds;
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

    public IrAttachment getMessageMainAttachmentIdAsObject() {
        return messageMainAttachmentIdAsObject;
    }

    public OdooId getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    public Object getTz() {
        return tz;
    }

    public int getSupportedAttachmentIdsCount() {
        return supportedAttachmentIdsCount;
    }

    public Object getRequestDateFrom() {
        return requestDateFrom;
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

    public boolean getIsHasMandatoryDay() {
        return isHasMandatoryDay;
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

    public Object getRequestHourFrom() {
        return requestHourFrom;
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

    public Object getRequestHourTo() {
        return requestHourTo;
    }

    public boolean getIsLeaveTypeIncreasesDuration() {
        return isLeaveTypeIncreasesDuration;
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

    public boolean getIsIsStriked() {
        return isIsStriked;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
    }

    public List<AccountAnalyticLine> getTimesheetIdsAsList() {
        return timesheetIdsAsList;
    }

    public List<Integer> getTimesheetIds() {
        return timesheetIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<HrLeave> getLinkedRequestIdsAsList() {
        return linkedRequestIdsAsList;
    }

    public List<Integer> getLinkedRequestIds() {
        return linkedRequestIds;
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

    public Date getDateTo() {
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public double getEmployeeOvertime() {
        return employeeOvertime;
    }

    public HrLeave getParentIdAsObject() {
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

    public Object getRequestDateFromPeriod() {
        return requestDateFromPeriod;
    }

    public Object getHolidayType() {
        return holidayType;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public boolean getIsLeaveTypeSupportDocument() {
        return isLeaveTypeSupportDocument;
    }

    public Object getLeaveTypeRequestUnit() {
        return leaveTypeRequestUnit;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
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

    public boolean getIsRequestUnitHalf() {
        return isRequestUnitHalf;
    }

    public int getColor() {
        return color;
    }

    public CalendarEvent getMeetingIdAsObject() {
        return meetingIdAsObject;
    }

    public OdooId getMeetingId() {
        return meetingId;
    }

    public boolean getIsIsHatched() {
        return isIsHatched;
    }

    public boolean getIsCanCancel() {
        return isCanCancel;
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

    public List<IrAttachment> getSupportedAttachmentIdsAsList() {
        return supportedAttachmentIdsAsList;
    }

    public List<Integer> getSupportedAttachmentIds() {
        return supportedAttachmentIds;
    }

    public boolean getIsRequestUnitHours() {
        return isRequestUnitHours;
    }

    public HrEmployee getManagerIdAsObject() {
        return managerIdAsObject;
    }

    public OdooId getManagerId() {
        return managerId;
    }

    public Object getReportNote() {
        return reportNote;
    }

    public boolean getIsActiveEmployee() {
        return isActiveEmployee;
    }

    public boolean getIsTzMismatch() {
        return isTzMismatch;
    }

    public HrLeaveType getHolidayStatusIdAsObject() {
        return holidayStatusIdAsObject;
    }

    public OdooId getHolidayStatusId() {
        return holidayStatusId;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public HrEmployee getFirstApproverIdAsObject() {
        return firstApproverIdAsObject;
    }

    public OdooId getFirstApproverId() {
        return firstApproverId;
    }

    public String getPrivateName() {
        return privateName;
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

    public double getNumberOfDays() {
        return numberOfDays;
    }

    public double getNumberOfDaysDisplay() {
        return numberOfDaysDisplay;
    }

    public boolean getIsCanReset() {
        return isCanReset;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
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

    public boolean getIsIsUserOnlyResponsible() {
        return isIsUserOnlyResponsible;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public Object getRequestDateTo() {
        return requestDateTo;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsLastSeveralDays() {
        return isLastSeveralDays;
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

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public String getDurationDisplay() {
        return durationDisplay;
    }

    public String getNumberOfHoursText() {
        return numberOfHoursText;
    }

    public HrEmployee getSecondApproverIdAsObject() {
        return secondApproverIdAsObject;
    }

    public OdooId getSecondApproverId() {
        return secondApproverId;
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

    public void setAllEmployeeIdsAsList(List<HrEmployee> allEmployeeIdsAsList) {
        this.allEmployeeIdsAsList = allEmployeeIdsAsList;
    }

    public void setAllEmployeeIds(List<Integer> allEmployeeIds) {
        this.allEmployeeIds = allEmployeeIds;
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

    public void setMessageMainAttachmentIdAsObject(IrAttachment messageMainAttachmentIdAsObject) {
        this.messageMainAttachmentIdAsObject = messageMainAttachmentIdAsObject;
    }

    public void setMessageMainAttachmentId(OdooId messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setSupportedAttachmentIdsCount(int supportedAttachmentIdsCount) {
        this.supportedAttachmentIdsCount = supportedAttachmentIdsCount;
    }

    public void setRequestDateFrom(Object requestDateFrom) {
        this.requestDateFrom = requestDateFrom;
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

    public void setIsHasMandatoryDay(boolean isHasMandatoryDay) {
        this.isHasMandatoryDay = isHasMandatoryDay;
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

    public void setRequestHourFrom(Object requestHourFrom) {
        this.requestHourFrom = requestHourFrom;
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

    public void setRequestHourTo(Object requestHourTo) {
        this.requestHourTo = requestHourTo;
    }

    public void setIsLeaveTypeIncreasesDuration(boolean isLeaveTypeIncreasesDuration) {
        this.isLeaveTypeIncreasesDuration = isLeaveTypeIncreasesDuration;
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

    public void setIsIsStriked(boolean isIsStriked) {
        this.isIsStriked = isIsStriked;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setTimesheetIdsAsList(List<AccountAnalyticLine> timesheetIdsAsList) {
        this.timesheetIdsAsList = timesheetIdsAsList;
    }

    public void setTimesheetIds(List<Integer> timesheetIds) {
        this.timesheetIds = timesheetIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setLinkedRequestIdsAsList(List<HrLeave> linkedRequestIdsAsList) {
        this.linkedRequestIdsAsList = linkedRequestIdsAsList;
    }

    public void setLinkedRequestIds(List<Integer> linkedRequestIds) {
        this.linkedRequestIds = linkedRequestIds;
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

    public void setDateTo(Date dateTo) {
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setEmployeeOvertime(double employeeOvertime) {
        this.employeeOvertime = employeeOvertime;
    }

    public void setParentIdAsObject(HrLeave parentIdAsObject) {
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

    public void setRequestDateFromPeriod(Object requestDateFromPeriod) {
        this.requestDateFromPeriod = requestDateFromPeriod;
    }

    public void setHolidayType(Object holidayType) {
        this.holidayType = holidayType;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setIsLeaveTypeSupportDocument(boolean isLeaveTypeSupportDocument) {
        this.isLeaveTypeSupportDocument = isLeaveTypeSupportDocument;
    }

    public void setLeaveTypeRequestUnit(Object leaveTypeRequestUnit) {
        this.leaveTypeRequestUnit = leaveTypeRequestUnit;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
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

    public void setIsRequestUnitHalf(boolean isRequestUnitHalf) {
        this.isRequestUnitHalf = isRequestUnitHalf;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setMeetingIdAsObject(CalendarEvent meetingIdAsObject) {
        this.meetingIdAsObject = meetingIdAsObject;
    }

    public void setMeetingId(OdooId meetingId) {
        this.meetingId = meetingId;
    }

    public void setIsIsHatched(boolean isIsHatched) {
        this.isIsHatched = isIsHatched;
    }

    public void setIsCanCancel(boolean isCanCancel) {
        this.isCanCancel = isCanCancel;
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

    public void setSupportedAttachmentIdsAsList(List<IrAttachment> supportedAttachmentIdsAsList) {
        this.supportedAttachmentIdsAsList = supportedAttachmentIdsAsList;
    }

    public void setSupportedAttachmentIds(List<Integer> supportedAttachmentIds) {
        this.supportedAttachmentIds = supportedAttachmentIds;
    }

    public void setIsRequestUnitHours(boolean isRequestUnitHours) {
        this.isRequestUnitHours = isRequestUnitHours;
    }

    public void setManagerIdAsObject(HrEmployee managerIdAsObject) {
        this.managerIdAsObject = managerIdAsObject;
    }

    public void setManagerId(OdooId managerId) {
        this.managerId = managerId;
    }

    public void setReportNote(Object reportNote) {
        this.reportNote = reportNote;
    }

    public void setIsActiveEmployee(boolean isActiveEmployee) {
        this.isActiveEmployee = isActiveEmployee;
    }

    public void setIsTzMismatch(boolean isTzMismatch) {
        this.isTzMismatch = isTzMismatch;
    }

    public void setHolidayStatusIdAsObject(HrLeaveType holidayStatusIdAsObject) {
        this.holidayStatusIdAsObject = holidayStatusIdAsObject;
    }

    public void setHolidayStatusId(OdooId holidayStatusId) {
        this.holidayStatusId = holidayStatusId;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setFirstApproverIdAsObject(HrEmployee firstApproverIdAsObject) {
        this.firstApproverIdAsObject = firstApproverIdAsObject;
    }

    public void setFirstApproverId(OdooId firstApproverId) {
        this.firstApproverId = firstApproverId;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
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

    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setNumberOfDaysDisplay(double numberOfDaysDisplay) {
        this.numberOfDaysDisplay = numberOfDaysDisplay;
    }

    public void setIsCanReset(boolean isCanReset) {
        this.isCanReset = isCanReset;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
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

    public void setIsIsUserOnlyResponsible(boolean isIsUserOnlyResponsible) {
        this.isIsUserOnlyResponsible = isIsUserOnlyResponsible;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void setRequestDateTo(Object requestDateTo) {
        this.requestDateTo = requestDateTo;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsLastSeveralDays(boolean isLastSeveralDays) {
        this.isLastSeveralDays = isLastSeveralDays;
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

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setDurationDisplay(String durationDisplay) {
        this.durationDisplay = durationDisplay;
    }

    public void setNumberOfHoursText(String numberOfHoursText) {
        this.numberOfHoursText = numberOfHoursText;
    }

    public void setSecondApproverIdAsObject(HrEmployee secondApproverIdAsObject) {
        this.secondApproverIdAsObject = secondApproverIdAsObject;
    }

    public void setSecondApproverId(OdooId secondApproverId) {
        this.secondApproverId = secondApproverId;
    }

    public void setIsMultiEmployee(boolean isMultiEmployee) {
        this.isMultiEmployee = isMultiEmployee;
    }



}