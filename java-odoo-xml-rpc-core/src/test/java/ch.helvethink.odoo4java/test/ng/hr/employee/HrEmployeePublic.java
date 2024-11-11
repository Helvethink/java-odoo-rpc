
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

package ch.helvethink.odoo4java.test.ng.hr.employee;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.test.ng.resource.Resource;
import ch.helvethink.odoo4java.test.ng.hr.resume.HrResumeLine;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeePublic;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.HrAttendance;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationGoal;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeSkill;
import ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser;;

@OdooObject("hr.employee.public")
public class HrEmployeePublic implements OdooObj {

    
    private Date writeDate;

    
    private Date lastCheckOut;

    
    private HrWorkLocation tuesdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId tuesdayLocationId;

    
    private Object avatar1920;

    
    private int childAllCount;

    
    private Object tz;

    
    private String workPhone;

    
    private boolean isMemberOfDepartment;

    
    private Object avatar256;

    
    private HrAttendance lastAttendanceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrAttendance")
        @OdooModel("hr.HrAttendance")
    
    private OdooId lastAttendanceId;

    
    private int allocationsCount;

    
    private HrWorkLocation fridayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId fridayLocationId;

    
    private int id;

    
    private Date createDate;

    
    private String jobTitle;

    
    private List<GamificationGoal> goalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationGoal")
        @OdooModel("gamification.GamificationGoal")
    
    private List<Integer> goalIds;

    
    private Object image512;

    
    private HrWorkLocation exceptionalLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId exceptionalLocationId;

    
    private int departmentColor;

    
    private HrWorkLocation saturdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId saturdayLocationId;

    
    private int childCount;

    
    private boolean isIsAbsent;

    
    private List<HrEmployeePublic> subordinateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeePublic")
        @OdooModel("hr.employee.HrEmployeePublic")
    
    private List<Integer> subordinateIds;

    
    private ResPartner addressIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId addressId;

    
    private String todayLocationName;

    
    private boolean isActive;

    
    private Object leaveDateFrom;

    
    private Object hrPresenceState;

    
    private String allocationDisplay;

    
    private HrWorkLocation sundayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId sundayLocationId;

    
    private Object image1920;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isIsManager;

    
    private Object avatar128;

    
    private List<GamificationBadgeUser> directBadgeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser")
        @OdooModel("gamification.badge.GamificationBadgeUser")
    
    private List<Integer> directBadgeIds;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private HrEmployeePublic parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeePublic")
        @OdooModel("hr.employee.HrEmployeePublic")
    
    private OdooId parentId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private boolean isNewlyHired;

    
    private HrWorkLocation wednesdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId wednesdayLocationId;

    
    private double leavesCount;

    
    private Object currentLeaveState;

    
    private boolean isIsSubordinate;

    
    private HrWorkLocation mondayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId mondayLocationId;

    
    private String workEmail;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isShowHrIconDisplay;

    
    private ResUsers leaveManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId leaveManagerId;

    
    private String allocationRemainingDisplay;

    
    private Object image256;

    
    private int color;

    
    private Object avatar1024;

    
    private Object avatar512;

    
    private double allocationCount;

    
    private List<HrEmployeePublic> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeePublic")
        @OdooModel("hr.employee.HrEmployeePublic")
    
    private List<Integer> childIds;

    
    private ResUsers attendanceManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId attendanceManagerId;

    
    private ResPartner userPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId userPartnerId;

    
    private double remainingLeaves;

    
    private Object leaveDateTo;

    
    private ResUsers expenseManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId expenseManagerId;

    
    private double totalOvertime;

    
    private Object lastActivity;

    
    private String mobilePhone;

    
    private List<HrEmployeeSkill> employeeSkillIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeSkill")
        @OdooModel("hr.employee.HrEmployeeSkill")
    
    private List<Integer> employeeSkillIds;

    
    private Object hrIconDisplay;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private Date lastCheckIn;

    
    private Object firstContractDate;

    
    private List<HrResumeLine> resumeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.resume.HrResumeLine")
        @OdooModel("hr.resume.HrResumeLine")
    
    private List<Integer> resumeLineIds;

    
    private Object attendanceState;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object image1024;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private HrWorkLocation workLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId workLocationId;

    
    private boolean isFilterForExpense;

    
    private boolean isHasBadges;

    
    private HrWorkLocation thursdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId thursdayLocationId;

    
    private List<GamificationBadgeUser> badgeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser")
        @OdooModel("gamification.badge.GamificationBadgeUser")
    
    private List<Integer> badgeIds;

    
    private HrEmployeePublic coachIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeePublic")
        @OdooModel("hr.employee.HrEmployeePublic")
    
    private OdooId coachId;

    
    private String lastActivityTime;

    
    private HrJob jobIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private OdooId jobId;

    
    private String nameWorkLocationDisplay;

    
    private Resource resourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.Resource")
        @OdooModel("resource.Resource")
    
    private OdooId resourceId;

    
    private boolean isShowLeaves;

    
    private double hoursToday;

    
    private ResPartner workContactIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId workContactId;

    
    private Object image128;


    public HrEmployeePublic() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Date getLastCheckOut() {
        return lastCheckOut;
    }

    public HrWorkLocation getTuesdayLocationIdAsObject() {
        return tuesdayLocationIdAsObject;
    }

    public OdooId getTuesdayLocationId() {
        return tuesdayLocationId;
    }

    public Object getAvatar1920() {
        return avatar1920;
    }

    public int getChildAllCount() {
        return childAllCount;
    }

    public Object getTz() {
        return tz;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public boolean getIsMemberOfDepartment() {
        return isMemberOfDepartment;
    }

    public Object getAvatar256() {
        return avatar256;
    }

    public HrAttendance getLastAttendanceIdAsObject() {
        return lastAttendanceIdAsObject;
    }

    public OdooId getLastAttendanceId() {
        return lastAttendanceId;
    }

    public int getAllocationsCount() {
        return allocationsCount;
    }

    public HrWorkLocation getFridayLocationIdAsObject() {
        return fridayLocationIdAsObject;
    }

    public OdooId getFridayLocationId() {
        return fridayLocationId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<GamificationGoal> getGoalIdsAsList() {
        return goalIdsAsList;
    }

    public List<Integer> getGoalIds() {
        return goalIds;
    }

    public Object getImage512() {
        return image512;
    }

    public HrWorkLocation getExceptionalLocationIdAsObject() {
        return exceptionalLocationIdAsObject;
    }

    public OdooId getExceptionalLocationId() {
        return exceptionalLocationId;
    }

    public int getDepartmentColor() {
        return departmentColor;
    }

    public HrWorkLocation getSaturdayLocationIdAsObject() {
        return saturdayLocationIdAsObject;
    }

    public OdooId getSaturdayLocationId() {
        return saturdayLocationId;
    }

    public int getChildCount() {
        return childCount;
    }

    public boolean getIsIsAbsent() {
        return isIsAbsent;
    }

    public List<HrEmployeePublic> getSubordinateIdsAsList() {
        return subordinateIdsAsList;
    }

    public List<Integer> getSubordinateIds() {
        return subordinateIds;
    }

    public ResPartner getAddressIdAsObject() {
        return addressIdAsObject;
    }

    public OdooId getAddressId() {
        return addressId;
    }

    public String getTodayLocationName() {
        return todayLocationName;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getLeaveDateFrom() {
        return leaveDateFrom;
    }

    public Object getHrPresenceState() {
        return hrPresenceState;
    }

    public String getAllocationDisplay() {
        return allocationDisplay;
    }

    public HrWorkLocation getSundayLocationIdAsObject() {
        return sundayLocationIdAsObject;
    }

    public OdooId getSundayLocationId() {
        return sundayLocationId;
    }

    public Object getImage1920() {
        return image1920;
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

    public boolean getIsIsManager() {
        return isIsManager;
    }

    public Object getAvatar128() {
        return avatar128;
    }

    public List<GamificationBadgeUser> getDirectBadgeIdsAsList() {
        return directBadgeIdsAsList;
    }

    public List<Integer> getDirectBadgeIds() {
        return directBadgeIds;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public HrEmployeePublic getParentIdAsObject() {
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

    public boolean getIsNewlyHired() {
        return isNewlyHired;
    }

    public HrWorkLocation getWednesdayLocationIdAsObject() {
        return wednesdayLocationIdAsObject;
    }

    public OdooId getWednesdayLocationId() {
        return wednesdayLocationId;
    }

    public double getLeavesCount() {
        return leavesCount;
    }

    public Object getCurrentLeaveState() {
        return currentLeaveState;
    }

    public boolean getIsIsSubordinate() {
        return isIsSubordinate;
    }

    public HrWorkLocation getMondayLocationIdAsObject() {
        return mondayLocationIdAsObject;
    }

    public OdooId getMondayLocationId() {
        return mondayLocationId;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsShowHrIconDisplay() {
        return isShowHrIconDisplay;
    }

    public ResUsers getLeaveManagerIdAsObject() {
        return leaveManagerIdAsObject;
    }

    public OdooId getLeaveManagerId() {
        return leaveManagerId;
    }

    public String getAllocationRemainingDisplay() {
        return allocationRemainingDisplay;
    }

    public Object getImage256() {
        return image256;
    }

    public int getColor() {
        return color;
    }

    public Object getAvatar1024() {
        return avatar1024;
    }

    public Object getAvatar512() {
        return avatar512;
    }

    public double getAllocationCount() {
        return allocationCount;
    }

    public List<HrEmployeePublic> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public ResUsers getAttendanceManagerIdAsObject() {
        return attendanceManagerIdAsObject;
    }

    public OdooId getAttendanceManagerId() {
        return attendanceManagerId;
    }

    public ResPartner getUserPartnerIdAsObject() {
        return userPartnerIdAsObject;
    }

    public OdooId getUserPartnerId() {
        return userPartnerId;
    }

    public double getRemainingLeaves() {
        return remainingLeaves;
    }

    public Object getLeaveDateTo() {
        return leaveDateTo;
    }

    public ResUsers getExpenseManagerIdAsObject() {
        return expenseManagerIdAsObject;
    }

    public OdooId getExpenseManagerId() {
        return expenseManagerId;
    }

    public double getTotalOvertime() {
        return totalOvertime;
    }

    public Object getLastActivity() {
        return lastActivity;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public List<HrEmployeeSkill> getEmployeeSkillIdsAsList() {
        return employeeSkillIdsAsList;
    }

    public List<Integer> getEmployeeSkillIds() {
        return employeeSkillIds;
    }

    public Object getHrIconDisplay() {
        return hrIconDisplay;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public Date getLastCheckIn() {
        return lastCheckIn;
    }

    public Object getFirstContractDate() {
        return firstContractDate;
    }

    public List<HrResumeLine> getResumeLineIdsAsList() {
        return resumeLineIdsAsList;
    }

    public List<Integer> getResumeLineIds() {
        return resumeLineIds;
    }

    public Object getAttendanceState() {
        return attendanceState;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getImage1024() {
        return image1024;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public HrWorkLocation getWorkLocationIdAsObject() {
        return workLocationIdAsObject;
    }

    public OdooId getWorkLocationId() {
        return workLocationId;
    }

    public boolean getIsFilterForExpense() {
        return isFilterForExpense;
    }

    public boolean getIsHasBadges() {
        return isHasBadges;
    }

    public HrWorkLocation getThursdayLocationIdAsObject() {
        return thursdayLocationIdAsObject;
    }

    public OdooId getThursdayLocationId() {
        return thursdayLocationId;
    }

    public List<GamificationBadgeUser> getBadgeIdsAsList() {
        return badgeIdsAsList;
    }

    public List<Integer> getBadgeIds() {
        return badgeIds;
    }

    public HrEmployeePublic getCoachIdAsObject() {
        return coachIdAsObject;
    }

    public OdooId getCoachId() {
        return coachId;
    }

    public String getLastActivityTime() {
        return lastActivityTime;
    }

    public HrJob getJobIdAsObject() {
        return jobIdAsObject;
    }

    public OdooId getJobId() {
        return jobId;
    }

    public String getNameWorkLocationDisplay() {
        return nameWorkLocationDisplay;
    }

    public Resource getResourceIdAsObject() {
        return resourceIdAsObject;
    }

    public OdooId getResourceId() {
        return resourceId;
    }

    public boolean getIsShowLeaves() {
        return isShowLeaves;
    }

    public double getHoursToday() {
        return hoursToday;
    }

    public ResPartner getWorkContactIdAsObject() {
        return workContactIdAsObject;
    }

    public OdooId getWorkContactId() {
        return workContactId;
    }

    public Object getImage128() {
        return image128;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setLastCheckOut(Date lastCheckOut) {
        this.lastCheckOut = lastCheckOut;
    }

    public void setTuesdayLocationIdAsObject(HrWorkLocation tuesdayLocationIdAsObject) {
        this.tuesdayLocationIdAsObject = tuesdayLocationIdAsObject;
    }

    public void setTuesdayLocationId(OdooId tuesdayLocationId) {
        this.tuesdayLocationId = tuesdayLocationId;
    }

    public void setAvatar1920(Object avatar1920) {
        this.avatar1920 = avatar1920;
    }

    public void setChildAllCount(int childAllCount) {
        this.childAllCount = childAllCount;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public void setIsMemberOfDepartment(boolean isMemberOfDepartment) {
        this.isMemberOfDepartment = isMemberOfDepartment;
    }

    public void setAvatar256(Object avatar256) {
        this.avatar256 = avatar256;
    }

    public void setLastAttendanceIdAsObject(HrAttendance lastAttendanceIdAsObject) {
        this.lastAttendanceIdAsObject = lastAttendanceIdAsObject;
    }

    public void setLastAttendanceId(OdooId lastAttendanceId) {
        this.lastAttendanceId = lastAttendanceId;
    }

    public void setAllocationsCount(int allocationsCount) {
        this.allocationsCount = allocationsCount;
    }

    public void setFridayLocationIdAsObject(HrWorkLocation fridayLocationIdAsObject) {
        this.fridayLocationIdAsObject = fridayLocationIdAsObject;
    }

    public void setFridayLocationId(OdooId fridayLocationId) {
        this.fridayLocationId = fridayLocationId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setGoalIdsAsList(List<GamificationGoal> goalIdsAsList) {
        this.goalIdsAsList = goalIdsAsList;
    }

    public void setGoalIds(List<Integer> goalIds) {
        this.goalIds = goalIds;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setExceptionalLocationIdAsObject(HrWorkLocation exceptionalLocationIdAsObject) {
        this.exceptionalLocationIdAsObject = exceptionalLocationIdAsObject;
    }

    public void setExceptionalLocationId(OdooId exceptionalLocationId) {
        this.exceptionalLocationId = exceptionalLocationId;
    }

    public void setDepartmentColor(int departmentColor) {
        this.departmentColor = departmentColor;
    }

    public void setSaturdayLocationIdAsObject(HrWorkLocation saturdayLocationIdAsObject) {
        this.saturdayLocationIdAsObject = saturdayLocationIdAsObject;
    }

    public void setSaturdayLocationId(OdooId saturdayLocationId) {
        this.saturdayLocationId = saturdayLocationId;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public void setIsIsAbsent(boolean isIsAbsent) {
        this.isIsAbsent = isIsAbsent;
    }

    public void setSubordinateIdsAsList(List<HrEmployeePublic> subordinateIdsAsList) {
        this.subordinateIdsAsList = subordinateIdsAsList;
    }

    public void setSubordinateIds(List<Integer> subordinateIds) {
        this.subordinateIds = subordinateIds;
    }

    public void setAddressIdAsObject(ResPartner addressIdAsObject) {
        this.addressIdAsObject = addressIdAsObject;
    }

    public void setAddressId(OdooId addressId) {
        this.addressId = addressId;
    }

    public void setTodayLocationName(String todayLocationName) {
        this.todayLocationName = todayLocationName;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setLeaveDateFrom(Object leaveDateFrom) {
        this.leaveDateFrom = leaveDateFrom;
    }

    public void setHrPresenceState(Object hrPresenceState) {
        this.hrPresenceState = hrPresenceState;
    }

    public void setAllocationDisplay(String allocationDisplay) {
        this.allocationDisplay = allocationDisplay;
    }

    public void setSundayLocationIdAsObject(HrWorkLocation sundayLocationIdAsObject) {
        this.sundayLocationIdAsObject = sundayLocationIdAsObject;
    }

    public void setSundayLocationId(OdooId sundayLocationId) {
        this.sundayLocationId = sundayLocationId;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
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

    public void setIsIsManager(boolean isIsManager) {
        this.isIsManager = isIsManager;
    }

    public void setAvatar128(Object avatar128) {
        this.avatar128 = avatar128;
    }

    public void setDirectBadgeIdsAsList(List<GamificationBadgeUser> directBadgeIdsAsList) {
        this.directBadgeIdsAsList = directBadgeIdsAsList;
    }

    public void setDirectBadgeIds(List<Integer> directBadgeIds) {
        this.directBadgeIds = directBadgeIds;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setParentIdAsObject(HrEmployeePublic parentIdAsObject) {
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

    public void setIsNewlyHired(boolean isNewlyHired) {
        this.isNewlyHired = isNewlyHired;
    }

    public void setWednesdayLocationIdAsObject(HrWorkLocation wednesdayLocationIdAsObject) {
        this.wednesdayLocationIdAsObject = wednesdayLocationIdAsObject;
    }

    public void setWednesdayLocationId(OdooId wednesdayLocationId) {
        this.wednesdayLocationId = wednesdayLocationId;
    }

    public void setLeavesCount(double leavesCount) {
        this.leavesCount = leavesCount;
    }

    public void setCurrentLeaveState(Object currentLeaveState) {
        this.currentLeaveState = currentLeaveState;
    }

    public void setIsIsSubordinate(boolean isIsSubordinate) {
        this.isIsSubordinate = isIsSubordinate;
    }

    public void setMondayLocationIdAsObject(HrWorkLocation mondayLocationIdAsObject) {
        this.mondayLocationIdAsObject = mondayLocationIdAsObject;
    }

    public void setMondayLocationId(OdooId mondayLocationId) {
        this.mondayLocationId = mondayLocationId;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsShowHrIconDisplay(boolean isShowHrIconDisplay) {
        this.isShowHrIconDisplay = isShowHrIconDisplay;
    }

    public void setLeaveManagerIdAsObject(ResUsers leaveManagerIdAsObject) {
        this.leaveManagerIdAsObject = leaveManagerIdAsObject;
    }

    public void setLeaveManagerId(OdooId leaveManagerId) {
        this.leaveManagerId = leaveManagerId;
    }

    public void setAllocationRemainingDisplay(String allocationRemainingDisplay) {
        this.allocationRemainingDisplay = allocationRemainingDisplay;
    }

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setAvatar1024(Object avatar1024) {
        this.avatar1024 = avatar1024;
    }

    public void setAvatar512(Object avatar512) {
        this.avatar512 = avatar512;
    }

    public void setAllocationCount(double allocationCount) {
        this.allocationCount = allocationCount;
    }

    public void setChildIdsAsList(List<HrEmployeePublic> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setAttendanceManagerIdAsObject(ResUsers attendanceManagerIdAsObject) {
        this.attendanceManagerIdAsObject = attendanceManagerIdAsObject;
    }

    public void setAttendanceManagerId(OdooId attendanceManagerId) {
        this.attendanceManagerId = attendanceManagerId;
    }

    public void setUserPartnerIdAsObject(ResPartner userPartnerIdAsObject) {
        this.userPartnerIdAsObject = userPartnerIdAsObject;
    }

    public void setUserPartnerId(OdooId userPartnerId) {
        this.userPartnerId = userPartnerId;
    }

    public void setRemainingLeaves(double remainingLeaves) {
        this.remainingLeaves = remainingLeaves;
    }

    public void setLeaveDateTo(Object leaveDateTo) {
        this.leaveDateTo = leaveDateTo;
    }

    public void setExpenseManagerIdAsObject(ResUsers expenseManagerIdAsObject) {
        this.expenseManagerIdAsObject = expenseManagerIdAsObject;
    }

    public void setExpenseManagerId(OdooId expenseManagerId) {
        this.expenseManagerId = expenseManagerId;
    }

    public void setTotalOvertime(double totalOvertime) {
        this.totalOvertime = totalOvertime;
    }

    public void setLastActivity(Object lastActivity) {
        this.lastActivity = lastActivity;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setEmployeeSkillIdsAsList(List<HrEmployeeSkill> employeeSkillIdsAsList) {
        this.employeeSkillIdsAsList = employeeSkillIdsAsList;
    }

    public void setEmployeeSkillIds(List<Integer> employeeSkillIds) {
        this.employeeSkillIds = employeeSkillIds;
    }

    public void setHrIconDisplay(Object hrIconDisplay) {
        this.hrIconDisplay = hrIconDisplay;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setLastCheckIn(Date lastCheckIn) {
        this.lastCheckIn = lastCheckIn;
    }

    public void setFirstContractDate(Object firstContractDate) {
        this.firstContractDate = firstContractDate;
    }

    public void setResumeLineIdsAsList(List<HrResumeLine> resumeLineIdsAsList) {
        this.resumeLineIdsAsList = resumeLineIdsAsList;
    }

    public void setResumeLineIds(List<Integer> resumeLineIds) {
        this.resumeLineIds = resumeLineIds;
    }

    public void setAttendanceState(Object attendanceState) {
        this.attendanceState = attendanceState;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setWorkLocationIdAsObject(HrWorkLocation workLocationIdAsObject) {
        this.workLocationIdAsObject = workLocationIdAsObject;
    }

    public void setWorkLocationId(OdooId workLocationId) {
        this.workLocationId = workLocationId;
    }

    public void setIsFilterForExpense(boolean isFilterForExpense) {
        this.isFilterForExpense = isFilterForExpense;
    }

    public void setIsHasBadges(boolean isHasBadges) {
        this.isHasBadges = isHasBadges;
    }

    public void setThursdayLocationIdAsObject(HrWorkLocation thursdayLocationIdAsObject) {
        this.thursdayLocationIdAsObject = thursdayLocationIdAsObject;
    }

    public void setThursdayLocationId(OdooId thursdayLocationId) {
        this.thursdayLocationId = thursdayLocationId;
    }

    public void setBadgeIdsAsList(List<GamificationBadgeUser> badgeIdsAsList) {
        this.badgeIdsAsList = badgeIdsAsList;
    }

    public void setBadgeIds(List<Integer> badgeIds) {
        this.badgeIds = badgeIds;
    }

    public void setCoachIdAsObject(HrEmployeePublic coachIdAsObject) {
        this.coachIdAsObject = coachIdAsObject;
    }

    public void setCoachId(OdooId coachId) {
        this.coachId = coachId;
    }

    public void setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public void setJobIdAsObject(HrJob jobIdAsObject) {
        this.jobIdAsObject = jobIdAsObject;
    }

    public void setJobId(OdooId jobId) {
        this.jobId = jobId;
    }

    public void setNameWorkLocationDisplay(String nameWorkLocationDisplay) {
        this.nameWorkLocationDisplay = nameWorkLocationDisplay;
    }

    public void setResourceIdAsObject(Resource resourceIdAsObject) {
        this.resourceIdAsObject = resourceIdAsObject;
    }

    public void setResourceId(OdooId resourceId) {
        this.resourceId = resourceId;
    }

    public void setIsShowLeaves(boolean isShowLeaves) {
        this.isShowLeaves = isShowLeaves;
    }

    public void setHoursToday(double hoursToday) {
        this.hoursToday = hoursToday;
    }

    public void setWorkContactIdAsObject(ResPartner workContactIdAsObject) {
        this.workContactIdAsObject = workContactIdAsObject;
    }

    public void setWorkContactId(OdooId workContactId) {
        this.workContactId = workContactId;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }



}