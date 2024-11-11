
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

import ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype;
import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualPlan;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;;

@OdooObject("hr.leave.type")
public class HrLeaveType implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object timeType;

    
    private int maxAllowedNegative;

    
    private int color;

    
    private double accrualCount;

    
    private MailMessageSubtype allocationNotifSubtypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype")
        @OdooModel("mail.message.MailMessageSubtype")
    
    private OdooId allocationNotifSubtypeId;

    
    private Project timesheetProjectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId timesheetProjectId;

    
    private IrAttachment iconIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId iconId;

    
    private boolean isUnpaid;

    
    private int allocationCount;

    
    private List<HrLeaveAccrualPlan> accrualsIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualPlan")
        @OdooModel("hr.leave.accrual.HrLeaveAccrualPlan")
    
    private List<Integer> accrualsIds;

    
    private boolean isAllowsNegative;

    
    private Object allocationValidationType;

    
    private boolean isTimesheetGenerate;

    
    private Object requestUnit;

    
    private boolean isHasValidAllocation;

    
    private boolean isSupportDocument;

    
    private int id;

    
    private Date createDate;

    
    private Object leaveValidationType;

    
    private double leavesTaken;

    
    private double virtualRemainingLeaves;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object requiresAllocation;

    
    private boolean isActive;

    
    private List<ResUsers> responsibleIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> responsibleIds;

    
    private Object employeeRequests;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ProjectTask timesheetTaskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId timesheetTaskId;

    
    private double maxLeaves;

    
    private boolean isOvertimeDeductible;

    
    private double groupDaysLeave;

    
    private int sequence;

    
    private boolean isCreateCalendarMeeting;

    
    private String name;

    
    private boolean isHrAttendanceOvertime;

    
    private MailMessageSubtype leaveNotifSubtypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype")
        @OdooModel("mail.message.MailMessageSubtype")
    
    private OdooId leaveNotifSubtypeId;


    public HrLeaveType() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getTimeType() {
        return timeType;
    }

    public int getMaxAllowedNegative() {
        return maxAllowedNegative;
    }

    public int getColor() {
        return color;
    }

    public double getAccrualCount() {
        return accrualCount;
    }

    public MailMessageSubtype getAllocationNotifSubtypeIdAsObject() {
        return allocationNotifSubtypeIdAsObject;
    }

    public OdooId getAllocationNotifSubtypeId() {
        return allocationNotifSubtypeId;
    }

    public Project getTimesheetProjectIdAsObject() {
        return timesheetProjectIdAsObject;
    }

    public OdooId getTimesheetProjectId() {
        return timesheetProjectId;
    }

    public IrAttachment getIconIdAsObject() {
        return iconIdAsObject;
    }

    public OdooId getIconId() {
        return iconId;
    }

    public boolean getIsUnpaid() {
        return isUnpaid;
    }

    public int getAllocationCount() {
        return allocationCount;
    }

    public List<HrLeaveAccrualPlan> getAccrualsIdsAsList() {
        return accrualsIdsAsList;
    }

    public List<Integer> getAccrualsIds() {
        return accrualsIds;
    }

    public boolean getIsAllowsNegative() {
        return isAllowsNegative;
    }

    public Object getAllocationValidationType() {
        return allocationValidationType;
    }

    public boolean getIsTimesheetGenerate() {
        return isTimesheetGenerate;
    }

    public Object getRequestUnit() {
        return requestUnit;
    }

    public boolean getIsHasValidAllocation() {
        return isHasValidAllocation;
    }

    public boolean getIsSupportDocument() {
        return isSupportDocument;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getLeaveValidationType() {
        return leaveValidationType;
    }

    public double getLeavesTaken() {
        return leavesTaken;
    }

    public double getVirtualRemainingLeaves() {
        return virtualRemainingLeaves;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getRequiresAllocation() {
        return requiresAllocation;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public List<ResUsers> getResponsibleIdsAsList() {
        return responsibleIdsAsList;
    }

    public List<Integer> getResponsibleIds() {
        return responsibleIds;
    }

    public Object getEmployeeRequests() {
        return employeeRequests;
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

    public ProjectTask getTimesheetTaskIdAsObject() {
        return timesheetTaskIdAsObject;
    }

    public OdooId getTimesheetTaskId() {
        return timesheetTaskId;
    }

    public double getMaxLeaves() {
        return maxLeaves;
    }

    public boolean getIsOvertimeDeductible() {
        return isOvertimeDeductible;
    }

    public double getGroupDaysLeave() {
        return groupDaysLeave;
    }

    public int getSequence() {
        return sequence;
    }

    public boolean getIsCreateCalendarMeeting() {
        return isCreateCalendarMeeting;
    }

    public String getName() {
        return name;
    }

    public boolean getIsHrAttendanceOvertime() {
        return isHrAttendanceOvertime;
    }

    public MailMessageSubtype getLeaveNotifSubtypeIdAsObject() {
        return leaveNotifSubtypeIdAsObject;
    }

    public OdooId getLeaveNotifSubtypeId() {
        return leaveNotifSubtypeId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setTimeType(Object timeType) {
        this.timeType = timeType;
    }

    public void setMaxAllowedNegative(int maxAllowedNegative) {
        this.maxAllowedNegative = maxAllowedNegative;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setAccrualCount(double accrualCount) {
        this.accrualCount = accrualCount;
    }

    public void setAllocationNotifSubtypeIdAsObject(MailMessageSubtype allocationNotifSubtypeIdAsObject) {
        this.allocationNotifSubtypeIdAsObject = allocationNotifSubtypeIdAsObject;
    }

    public void setAllocationNotifSubtypeId(OdooId allocationNotifSubtypeId) {
        this.allocationNotifSubtypeId = allocationNotifSubtypeId;
    }

    public void setTimesheetProjectIdAsObject(Project timesheetProjectIdAsObject) {
        this.timesheetProjectIdAsObject = timesheetProjectIdAsObject;
    }

    public void setTimesheetProjectId(OdooId timesheetProjectId) {
        this.timesheetProjectId = timesheetProjectId;
    }

    public void setIconIdAsObject(IrAttachment iconIdAsObject) {
        this.iconIdAsObject = iconIdAsObject;
    }

    public void setIconId(OdooId iconId) {
        this.iconId = iconId;
    }

    public void setIsUnpaid(boolean isUnpaid) {
        this.isUnpaid = isUnpaid;
    }

    public void setAllocationCount(int allocationCount) {
        this.allocationCount = allocationCount;
    }

    public void setAccrualsIdsAsList(List<HrLeaveAccrualPlan> accrualsIdsAsList) {
        this.accrualsIdsAsList = accrualsIdsAsList;
    }

    public void setAccrualsIds(List<Integer> accrualsIds) {
        this.accrualsIds = accrualsIds;
    }

    public void setIsAllowsNegative(boolean isAllowsNegative) {
        this.isAllowsNegative = isAllowsNegative;
    }

    public void setAllocationValidationType(Object allocationValidationType) {
        this.allocationValidationType = allocationValidationType;
    }

    public void setIsTimesheetGenerate(boolean isTimesheetGenerate) {
        this.isTimesheetGenerate = isTimesheetGenerate;
    }

    public void setRequestUnit(Object requestUnit) {
        this.requestUnit = requestUnit;
    }

    public void setIsHasValidAllocation(boolean isHasValidAllocation) {
        this.isHasValidAllocation = isHasValidAllocation;
    }

    public void setIsSupportDocument(boolean isSupportDocument) {
        this.isSupportDocument = isSupportDocument;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLeaveValidationType(Object leaveValidationType) {
        this.leaveValidationType = leaveValidationType;
    }

    public void setLeavesTaken(double leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public void setVirtualRemainingLeaves(double virtualRemainingLeaves) {
        this.virtualRemainingLeaves = virtualRemainingLeaves;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setRequiresAllocation(Object requiresAllocation) {
        this.requiresAllocation = requiresAllocation;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setResponsibleIdsAsList(List<ResUsers> responsibleIdsAsList) {
        this.responsibleIdsAsList = responsibleIdsAsList;
    }

    public void setResponsibleIds(List<Integer> responsibleIds) {
        this.responsibleIds = responsibleIds;
    }

    public void setEmployeeRequests(Object employeeRequests) {
        this.employeeRequests = employeeRequests;
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

    public void setTimesheetTaskIdAsObject(ProjectTask timesheetTaskIdAsObject) {
        this.timesheetTaskIdAsObject = timesheetTaskIdAsObject;
    }

    public void setTimesheetTaskId(OdooId timesheetTaskId) {
        this.timesheetTaskId = timesheetTaskId;
    }

    public void setMaxLeaves(double maxLeaves) {
        this.maxLeaves = maxLeaves;
    }

    public void setIsOvertimeDeductible(boolean isOvertimeDeductible) {
        this.isOvertimeDeductible = isOvertimeDeductible;
    }

    public void setGroupDaysLeave(double groupDaysLeave) {
        this.groupDaysLeave = groupDaysLeave;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setIsCreateCalendarMeeting(boolean isCreateCalendarMeeting) {
        this.isCreateCalendarMeeting = isCreateCalendarMeeting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsHrAttendanceOvertime(boolean isHrAttendanceOvertime) {
        this.isHrAttendanceOvertime = isHrAttendanceOvertime;
    }

    public void setLeaveNotifSubtypeIdAsObject(MailMessageSubtype leaveNotifSubtypeIdAsObject) {
        this.leaveNotifSubtypeIdAsObject = leaveNotifSubtypeIdAsObject;
    }

    public void setLeaveNotifSubtypeId(OdooId leaveNotifSubtypeId) {
        this.leaveNotifSubtypeId = leaveNotifSubtypeId;
    }



}