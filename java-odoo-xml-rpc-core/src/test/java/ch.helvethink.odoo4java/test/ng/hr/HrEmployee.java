
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
import ch.helvethink.odoo4java.test.ng.resource.Resource;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.test.ng.hr.resume.HrResumeLine;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.hr.attendance.HrAttendanceOvertime;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.HrApplicant;
import ch.helvethink.odoo4java.test.ng.hr.HrAttendance;
import ch.helvethink.odoo4java.test.ng.hr.HrContract;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeSkill;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.hr.HrSkill;
import ch.helvethink.odoo4java.test.ng.hr.departure.HrDepartureReason;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationGoal;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser;;

@OdooObject("hr.employee")
public class HrEmployee implements OdooObj {

    
    private Date writeDate;

    
    private ResCountryState privateStateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId privateStateId;

    
    private Object avatar1920;

    
    private HrWorkLocation tuesdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId tuesdayLocationId;

    
    private String privateCity;

    
    private IrAttachment messageMainAttachmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId messageMainAttachmentId;

    
    private HrContract contractIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrContract")
        @OdooModel("hr.HrContract")
    
    private OdooId contractId;

    
    private String workPhone;

    
    private Object spouseBirthdate;

    
    private Object activityDateDeadline;

    
    private boolean isMemberOfDepartment;

    
    private List<HrAttendanceOvertime> overtimeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.attendance.HrAttendanceOvertime")
        @OdooModel("hr.attendance.HrAttendanceOvertime")
    
    private List<Integer> overtimeIds;

    
    private Object activityState;

    
    private String passportId;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private HrDepartureReason departureReasonIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.departure.HrDepartureReason")
        @OdooModel("hr.departure.HrDepartureReason")
    
    private OdooId departureReasonId;

    
    private int children;

    
    private String identificationId;

    
    private HrWorkLocation fridayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId fridayLocationId;

    
    private int id;

    
    private String privateEmail;

    
    private int messageAttachmentCount;

    
    private String ssnid;

    
    private int departmentColor;

    
    private HrWorkLocation saturdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId saturdayLocationId;

    
    private int childCount;

    
    private boolean isIsAbsent;

    
    private List<HrEmployee> subordinateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> subordinateIds;

    
    private boolean isActive;

    
    private Object leaveDateFrom;

    
    private Object image1920;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String spouseCompleteName;

    
    private String permitNo;

    
    private Object employeeType;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private List<HrAttendance> attendanceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrAttendance")
        @OdooModel("hr.HrAttendance")
    
    private List<Integer> attendanceIds;

    
    private Object departureDescription;

    
    private boolean isHasSubscribedCourses;

    
    private HrWorkLocation wednesdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId wednesdayLocationId;

    
    private double leavesCount;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private boolean isMessageIsFollower;

    
    private boolean isShowHrIconDisplay;

    
    private ResUsers leaveManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId leaveManagerId;

    
    private Object gender;

    
    private Object avatar1024;

    
    private List<HrEmployee> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> childIds;

    
    private String vehicle;

    
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

    
    private String companyCountryCode;

    
    private ResCountry countryOfBirthAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryOfBirth;

    
    private Object hrIconDisplay;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private Object firstContractDate;

    
    private List<HrResumeLine> resumeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.resume.HrResumeLine")
        @OdooModel("hr.resume.HrResumeLine")
    
    private List<Integer> resumeLineIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private List<HrContract> contractIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrContract")
        @OdooModel("hr.HrContract")
    
    private List<Integer> contractIds;

    
    private double hoursPreviouslyToday;

    
    private String privateStreet2;

    
    private boolean isMessageHasSmsError;

    
    private boolean isHasBadges;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private String lastActivityTime;

    
    private HrLeaveType currentLeaveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType")
        @OdooModel("hr.leave.HrLeaveType")
    
    private OdooId currentLeaveId;

    
    private String sinid;

    
    private String nameWorkLocationDisplay;

    
    private Resource resourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.Resource")
        @OdooModel("resource.Resource")
    
    private OdooId resourceId;

    
    private List<HrSkill> skillIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrSkill")
        @OdooModel("hr.HrSkill")
    
    private List<Integer> skillIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private boolean isShowLeaves;

    
    private double hoursToday;

    
    private ResPartner workContactIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId workContactId;

    
    private Date lastCheckOut;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object notes;

    
    private int childAllCount;

    
    private Object tz;

    
    private ResCountry privateCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId privateCountryId;

    
    private boolean isHasTimesheet;

    
    private Object departureDate;

    
    private Object hourlyCost;

    
    private Object activityExceptionDecoration;

    
    private Object avatar256;

    
    private HrAttendance lastAttendanceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrAttendance")
        @OdooModel("hr.HrAttendance")
    
    private OdooId lastAttendanceId;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private String workPermitName;

    
    private String pin;

    
    private boolean isHasMessage;

    
    private boolean isContractWarning;

    
    private int allocationsCount;

    
    private List<HrEmployeeCategory> categoryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory")
        @OdooModel("hr.employee.HrEmployeeCategory")
    
    private List<Integer> categoryIds;

    
    private Object workPermitExpirationDate;

    
    private Date createDate;

    
    private boolean isCalendarMismatch;

    
    private String jobTitle;

    
    private List<GamificationGoal> goalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationGoal")
        @OdooModel("gamification.GamificationGoal")
    
    private List<Integer> goalIds;

    
    private String barcode;

    
    private Object image512;

    
    private String hoursLastMonthDisplay;

    
    private HrWorkLocation exceptionalLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId exceptionalLocationId;

    
    private List<SlideChannel> subscribedCoursesAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> subscribedCourses;

    
    private String privateStreet;

    
    private ResPartner addressIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId addressId;

    
    private String todayLocationName;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private Object hrPresenceState;

    
    private String allocationDisplay;

    
    private HrWorkLocation sundayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId sundayLocationId;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private Object avatar128;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private List<GamificationBadgeUser> directBadgeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser")
        @OdooModel("gamification.badge.GamificationBadgeUser")
    
    private List<Integer> directBadgeIds;

    
    private String visaNo;

    
    private Object drivingLicense;

    
    private HrEmployee parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId parentId;

    
    private String name;

    
    private boolean isNewlyHired;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private double hoursLastMonth;

    
    private Object currentLeaveState;

    
    private boolean isIsSubordinate;

    
    private HrWorkLocation mondayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId mondayLocationId;

    
    private Object birthday;

    
    private String workEmail;

    
    private ResPartnerBank bankAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId bankAccountId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private String allocationRemainingDisplay;

    
    private int color;

    
    private Object certificate;

    
    private Object idCard;

    
    private String privateCarPlate;

    
    private Object myActivityDateDeadline;

    
    private Object avatar512;

    
    private double allocationCount;

    
    private ResUsers attendanceManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId attendanceManagerId;

    
    private String emergencyPhone;

    
    private Object lastActivity;

    
    private String studySchool;

    
    private ResCountry companyCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId companyCountryId;

    
    private String mobilePhone;

    
    private String coursesCompletionText;

    
    private List<HrEmployeeSkill> employeeSkillIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeSkill")
        @OdooModel("hr.employee.HrEmployeeSkill")
    
    private List<Integer> employeeSkillIds;

    
    private int contractsCount;

    
    private Object lang;

    
    private Date lastCheckIn;

    
    private String activityTypeIcon;

    
    private Object hasWorkPermit;

    
    private boolean isWorkPermitScheduledActivity;

    
    private Object attendanceState;

    
    private Object image1024;

    
    private HrWorkLocation workLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId workLocationId;

    
    private boolean isFilterForExpense;

    
    private HrWorkLocation thursdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId thursdayLocationId;

    
    private String privatePhone;

    
    private String privateZip;

    
    private List<GamificationBadgeUser> badgeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser")
        @OdooModel("gamification.badge.GamificationBadgeUser")
    
    private List<Integer> badgeIds;

    
    private Object visaExpire;

    
    private String placeOfBirth;

    
    private double lastAttendanceWorkedHours;

    
    private HrEmployee coachIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId coachId;

    
    private Object marital;

    
    private boolean isMessageHasError;

    
    private List<HrApplicant> applicantIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrApplicant")
        @OdooModel("hr.HrApplicant")
    
    private List<Integer> applicantId;

    
    private boolean isMessageNeedaction;

    
    private HrJob jobIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private OdooId jobId;

    
    private String activitySummary;

    
    private int kmHomeWork;

    
    private int messageNeedactionCounter;

    
    private String studyField;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object image128;

    
    private Object additionalNote;

    
    private String emergencyContact;

    
    private Object employeeProperties;


    public HrEmployee() {
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

    public Object getAvatar1920() {
        return avatar1920;
    }

    public HrWorkLocation getTuesdayLocationIdAsObject() {
        return tuesdayLocationIdAsObject;
    }

    public OdooId getTuesdayLocationId() {
        return tuesdayLocationId;
    }

    public String getPrivateCity() {
        return privateCity;
    }

    public IrAttachment getMessageMainAttachmentIdAsObject() {
        return messageMainAttachmentIdAsObject;
    }

    public OdooId getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    public HrContract getContractIdAsObject() {
        return contractIdAsObject;
    }

    public OdooId getContractId() {
        return contractId;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public Object getSpouseBirthdate() {
        return spouseBirthdate;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public boolean getIsMemberOfDepartment() {
        return isMemberOfDepartment;
    }

    public List<HrAttendanceOvertime> getOvertimeIdsAsList() {
        return overtimeIdsAsList;
    }

    public List<Integer> getOvertimeIds() {
        return overtimeIds;
    }

    public Object getActivityState() {
        return activityState;
    }

    public String getPassportId() {
        return passportId;
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

    public HrDepartureReason getDepartureReasonIdAsObject() {
        return departureReasonIdAsObject;
    }

    public OdooId getDepartureReasonId() {
        return departureReasonId;
    }

    public int getChildren() {
        return children;
    }

    public String getIdentificationId() {
        return identificationId;
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

    public String getPrivateEmail() {
        return privateEmail;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public String getSsnid() {
        return ssnid;
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

    public List<HrEmployee> getSubordinateIdsAsList() {
        return subordinateIdsAsList;
    }

    public List<Integer> getSubordinateIds() {
        return subordinateIds;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getLeaveDateFrom() {
        return leaveDateFrom;
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

    public String getSpouseCompleteName() {
        return spouseCompleteName;
    }

    public String getPermitNo() {
        return permitNo;
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

    public List<HrAttendance> getAttendanceIdsAsList() {
        return attendanceIdsAsList;
    }

    public List<Integer> getAttendanceIds() {
        return attendanceIds;
    }

    public Object getDepartureDescription() {
        return departureDescription;
    }

    public boolean getIsHasSubscribedCourses() {
        return isHasSubscribedCourses;
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

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
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

    public Object getGender() {
        return gender;
    }

    public Object getAvatar1024() {
        return avatar1024;
    }

    public List<HrEmployee> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public String getVehicle() {
        return vehicle;
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

    public String getCompanyCountryCode() {
        return companyCountryCode;
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

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
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

    public List<HrContract> getContractIdsAsList() {
        return contractIdsAsList;
    }

    public List<Integer> getContractIds() {
        return contractIds;
    }

    public double getHoursPreviouslyToday() {
        return hoursPreviouslyToday;
    }

    public String getPrivateStreet2() {
        return privateStreet2;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsHasBadges() {
        return isHasBadges;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public String getLastActivityTime() {
        return lastActivityTime;
    }

    public HrLeaveType getCurrentLeaveIdAsObject() {
        return currentLeaveIdAsObject;
    }

    public OdooId getCurrentLeaveId() {
        return currentLeaveId;
    }

    public String getSinid() {
        return sinid;
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

    public Date getLastCheckOut() {
        return lastCheckOut;
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

    public int getChildAllCount() {
        return childAllCount;
    }

    public Object getTz() {
        return tz;
    }

    public ResCountry getPrivateCountryIdAsObject() {
        return privateCountryIdAsObject;
    }

    public OdooId getPrivateCountryId() {
        return privateCountryId;
    }

    public boolean getIsHasTimesheet() {
        return isHasTimesheet;
    }

    public Object getDepartureDate() {
        return departureDate;
    }

    public Object getHourlyCost() {
        return hourlyCost;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
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

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public String getWorkPermitName() {
        return workPermitName;
    }

    public String getPin() {
        return pin;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public boolean getIsContractWarning() {
        return isContractWarning;
    }

    public int getAllocationsCount() {
        return allocationsCount;
    }

    public List<HrEmployeeCategory> getCategoryIdsAsList() {
        return categoryIdsAsList;
    }

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public Object getWorkPermitExpirationDate() {
        return workPermitExpirationDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsCalendarMismatch() {
        return isCalendarMismatch;
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

    public String getBarcode() {
        return barcode;
    }

    public Object getImage512() {
        return image512;
    }

    public String getHoursLastMonthDisplay() {
        return hoursLastMonthDisplay;
    }

    public HrWorkLocation getExceptionalLocationIdAsObject() {
        return exceptionalLocationIdAsObject;
    }

    public OdooId getExceptionalLocationId() {
        return exceptionalLocationId;
    }

    public List<SlideChannel> getSubscribedCoursesAsList() {
        return subscribedCoursesAsList;
    }

    public List<Integer> getSubscribedCourses() {
        return subscribedCourses;
    }

    public String getPrivateStreet() {
        return privateStreet;
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

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getAvatar128() {
        return avatar128;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public List<GamificationBadgeUser> getDirectBadgeIdsAsList() {
        return directBadgeIdsAsList;
    }

    public List<Integer> getDirectBadgeIds() {
        return directBadgeIds;
    }

    public String getVisaNo() {
        return visaNo;
    }

    public Object getDrivingLicense() {
        return drivingLicense;
    }

    public HrEmployee getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public boolean getIsNewlyHired() {
        return isNewlyHired;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public double getHoursLastMonth() {
        return hoursLastMonth;
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

    public Object getBirthday() {
        return birthday;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public ResPartnerBank getBankAccountIdAsObject() {
        return bankAccountIdAsObject;
    }

    public OdooId getBankAccountId() {
        return bankAccountId;
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

    public String getAllocationRemainingDisplay() {
        return allocationRemainingDisplay;
    }

    public int getColor() {
        return color;
    }

    public Object getCertificate() {
        return certificate;
    }

    public Object getIdCard() {
        return idCard;
    }

    public String getPrivateCarPlate() {
        return privateCarPlate;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public Object getAvatar512() {
        return avatar512;
    }

    public double getAllocationCount() {
        return allocationCount;
    }

    public ResUsers getAttendanceManagerIdAsObject() {
        return attendanceManagerIdAsObject;
    }

    public OdooId getAttendanceManagerId() {
        return attendanceManagerId;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public Object getLastActivity() {
        return lastActivity;
    }

    public String getStudySchool() {
        return studySchool;
    }

    public ResCountry getCompanyCountryIdAsObject() {
        return companyCountryIdAsObject;
    }

    public OdooId getCompanyCountryId() {
        return companyCountryId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getCoursesCompletionText() {
        return coursesCompletionText;
    }

    public List<HrEmployeeSkill> getEmployeeSkillIdsAsList() {
        return employeeSkillIdsAsList;
    }

    public List<Integer> getEmployeeSkillIds() {
        return employeeSkillIds;
    }

    public int getContractsCount() {
        return contractsCount;
    }

    public Object getLang() {
        return lang;
    }

    public Date getLastCheckIn() {
        return lastCheckIn;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public Object getHasWorkPermit() {
        return hasWorkPermit;
    }

    public boolean getIsWorkPermitScheduledActivity() {
        return isWorkPermitScheduledActivity;
    }

    public Object getAttendanceState() {
        return attendanceState;
    }

    public Object getImage1024() {
        return image1024;
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

    public HrWorkLocation getThursdayLocationIdAsObject() {
        return thursdayLocationIdAsObject;
    }

    public OdooId getThursdayLocationId() {
        return thursdayLocationId;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public String getPrivateZip() {
        return privateZip;
    }

    public List<GamificationBadgeUser> getBadgeIdsAsList() {
        return badgeIdsAsList;
    }

    public List<Integer> getBadgeIds() {
        return badgeIds;
    }

    public Object getVisaExpire() {
        return visaExpire;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public double getLastAttendanceWorkedHours() {
        return lastAttendanceWorkedHours;
    }

    public HrEmployee getCoachIdAsObject() {
        return coachIdAsObject;
    }

    public OdooId getCoachId() {
        return coachId;
    }

    public Object getMarital() {
        return marital;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public List<HrApplicant> getApplicantIdAsList() {
        return applicantIdAsList;
    }

    public List<Integer> getApplicantId() {
        return applicantId;
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

    public int getKmHomeWork() {
        return kmHomeWork;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getStudyField() {
        return studyField;
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

    public Object getAdditionalNote() {
        return additionalNote;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public Object getEmployeeProperties() {
        return employeeProperties;
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

    public void setAvatar1920(Object avatar1920) {
        this.avatar1920 = avatar1920;
    }

    public void setTuesdayLocationIdAsObject(HrWorkLocation tuesdayLocationIdAsObject) {
        this.tuesdayLocationIdAsObject = tuesdayLocationIdAsObject;
    }

    public void setTuesdayLocationId(OdooId tuesdayLocationId) {
        this.tuesdayLocationId = tuesdayLocationId;
    }

    public void setPrivateCity(String privateCity) {
        this.privateCity = privateCity;
    }

    public void setMessageMainAttachmentIdAsObject(IrAttachment messageMainAttachmentIdAsObject) {
        this.messageMainAttachmentIdAsObject = messageMainAttachmentIdAsObject;
    }

    public void setMessageMainAttachmentId(OdooId messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    public void setContractIdAsObject(HrContract contractIdAsObject) {
        this.contractIdAsObject = contractIdAsObject;
    }

    public void setContractId(OdooId contractId) {
        this.contractId = contractId;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public void setSpouseBirthdate(Object spouseBirthdate) {
        this.spouseBirthdate = spouseBirthdate;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setIsMemberOfDepartment(boolean isMemberOfDepartment) {
        this.isMemberOfDepartment = isMemberOfDepartment;
    }

    public void setOvertimeIdsAsList(List<HrAttendanceOvertime> overtimeIdsAsList) {
        this.overtimeIdsAsList = overtimeIdsAsList;
    }

    public void setOvertimeIds(List<Integer> overtimeIds) {
        this.overtimeIds = overtimeIds;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
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

    public void setDepartureReasonIdAsObject(HrDepartureReason departureReasonIdAsObject) {
        this.departureReasonIdAsObject = departureReasonIdAsObject;
    }

    public void setDepartureReasonId(OdooId departureReasonId) {
        this.departureReasonId = departureReasonId;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
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

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setSsnid(String ssnid) {
        this.ssnid = ssnid;
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

    public void setSubordinateIdsAsList(List<HrEmployee> subordinateIdsAsList) {
        this.subordinateIdsAsList = subordinateIdsAsList;
    }

    public void setSubordinateIds(List<Integer> subordinateIds) {
        this.subordinateIds = subordinateIds;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setLeaveDateFrom(Object leaveDateFrom) {
        this.leaveDateFrom = leaveDateFrom;
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

    public void setSpouseCompleteName(String spouseCompleteName) {
        this.spouseCompleteName = spouseCompleteName;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
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

    public void setAttendanceIdsAsList(List<HrAttendance> attendanceIdsAsList) {
        this.attendanceIdsAsList = attendanceIdsAsList;
    }

    public void setAttendanceIds(List<Integer> attendanceIds) {
        this.attendanceIds = attendanceIds;
    }

    public void setDepartureDescription(Object departureDescription) {
        this.departureDescription = departureDescription;
    }

    public void setIsHasSubscribedCourses(boolean isHasSubscribedCourses) {
        this.isHasSubscribedCourses = isHasSubscribedCourses;
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

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
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

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public void setAvatar1024(Object avatar1024) {
        this.avatar1024 = avatar1024;
    }

    public void setChildIdsAsList(List<HrEmployee> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
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

    public void setCompanyCountryCode(String companyCountryCode) {
        this.companyCountryCode = companyCountryCode;
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

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
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

    public void setContractIdsAsList(List<HrContract> contractIdsAsList) {
        this.contractIdsAsList = contractIdsAsList;
    }

    public void setContractIds(List<Integer> contractIds) {
        this.contractIds = contractIds;
    }

    public void setHoursPreviouslyToday(double hoursPreviouslyToday) {
        this.hoursPreviouslyToday = hoursPreviouslyToday;
    }

    public void setPrivateStreet2(String privateStreet2) {
        this.privateStreet2 = privateStreet2;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsHasBadges(boolean isHasBadges) {
        this.isHasBadges = isHasBadges;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public void setCurrentLeaveIdAsObject(HrLeaveType currentLeaveIdAsObject) {
        this.currentLeaveIdAsObject = currentLeaveIdAsObject;
    }

    public void setCurrentLeaveId(OdooId currentLeaveId) {
        this.currentLeaveId = currentLeaveId;
    }

    public void setSinid(String sinid) {
        this.sinid = sinid;
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

    public void setLastCheckOut(Date lastCheckOut) {
        this.lastCheckOut = lastCheckOut;
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

    public void setChildAllCount(int childAllCount) {
        this.childAllCount = childAllCount;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setPrivateCountryIdAsObject(ResCountry privateCountryIdAsObject) {
        this.privateCountryIdAsObject = privateCountryIdAsObject;
    }

    public void setPrivateCountryId(OdooId privateCountryId) {
        this.privateCountryId = privateCountryId;
    }

    public void setIsHasTimesheet(boolean isHasTimesheet) {
        this.isHasTimesheet = isHasTimesheet;
    }

    public void setDepartureDate(Object departureDate) {
        this.departureDate = departureDate;
    }

    public void setHourlyCost(Object hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
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

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setWorkPermitName(String workPermitName) {
        this.workPermitName = workPermitName;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setIsContractWarning(boolean isContractWarning) {
        this.isContractWarning = isContractWarning;
    }

    public void setAllocationsCount(int allocationsCount) {
        this.allocationsCount = allocationsCount;
    }

    public void setCategoryIdsAsList(List<HrEmployeeCategory> categoryIdsAsList) {
        this.categoryIdsAsList = categoryIdsAsList;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public void setWorkPermitExpirationDate(Object workPermitExpirationDate) {
        this.workPermitExpirationDate = workPermitExpirationDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsCalendarMismatch(boolean isCalendarMismatch) {
        this.isCalendarMismatch = isCalendarMismatch;
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

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setHoursLastMonthDisplay(String hoursLastMonthDisplay) {
        this.hoursLastMonthDisplay = hoursLastMonthDisplay;
    }

    public void setExceptionalLocationIdAsObject(HrWorkLocation exceptionalLocationIdAsObject) {
        this.exceptionalLocationIdAsObject = exceptionalLocationIdAsObject;
    }

    public void setExceptionalLocationId(OdooId exceptionalLocationId) {
        this.exceptionalLocationId = exceptionalLocationId;
    }

    public void setSubscribedCoursesAsList(List<SlideChannel> subscribedCoursesAsList) {
        this.subscribedCoursesAsList = subscribedCoursesAsList;
    }

    public void setSubscribedCourses(List<Integer> subscribedCourses) {
        this.subscribedCourses = subscribedCourses;
    }

    public void setPrivateStreet(String privateStreet) {
        this.privateStreet = privateStreet;
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

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAvatar128(Object avatar128) {
        this.avatar128 = avatar128;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setDirectBadgeIdsAsList(List<GamificationBadgeUser> directBadgeIdsAsList) {
        this.directBadgeIdsAsList = directBadgeIdsAsList;
    }

    public void setDirectBadgeIds(List<Integer> directBadgeIds) {
        this.directBadgeIds = directBadgeIds;
    }

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }

    public void setDrivingLicense(Object drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public void setParentIdAsObject(HrEmployee parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsNewlyHired(boolean isNewlyHired) {
        this.isNewlyHired = isNewlyHired;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setHoursLastMonth(double hoursLastMonth) {
        this.hoursLastMonth = hoursLastMonth;
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

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public void setBankAccountIdAsObject(ResPartnerBank bankAccountIdAsObject) {
        this.bankAccountIdAsObject = bankAccountIdAsObject;
    }

    public void setBankAccountId(OdooId bankAccountId) {
        this.bankAccountId = bankAccountId;
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

    public void setAllocationRemainingDisplay(String allocationRemainingDisplay) {
        this.allocationRemainingDisplay = allocationRemainingDisplay;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setCertificate(Object certificate) {
        this.certificate = certificate;
    }

    public void setIdCard(Object idCard) {
        this.idCard = idCard;
    }

    public void setPrivateCarPlate(String privateCarPlate) {
        this.privateCarPlate = privateCarPlate;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setAvatar512(Object avatar512) {
        this.avatar512 = avatar512;
    }

    public void setAllocationCount(double allocationCount) {
        this.allocationCount = allocationCount;
    }

    public void setAttendanceManagerIdAsObject(ResUsers attendanceManagerIdAsObject) {
        this.attendanceManagerIdAsObject = attendanceManagerIdAsObject;
    }

    public void setAttendanceManagerId(OdooId attendanceManagerId) {
        this.attendanceManagerId = attendanceManagerId;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public void setLastActivity(Object lastActivity) {
        this.lastActivity = lastActivity;
    }

    public void setStudySchool(String studySchool) {
        this.studySchool = studySchool;
    }

    public void setCompanyCountryIdAsObject(ResCountry companyCountryIdAsObject) {
        this.companyCountryIdAsObject = companyCountryIdAsObject;
    }

    public void setCompanyCountryId(OdooId companyCountryId) {
        this.companyCountryId = companyCountryId;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setCoursesCompletionText(String coursesCompletionText) {
        this.coursesCompletionText = coursesCompletionText;
    }

    public void setEmployeeSkillIdsAsList(List<HrEmployeeSkill> employeeSkillIdsAsList) {
        this.employeeSkillIdsAsList = employeeSkillIdsAsList;
    }

    public void setEmployeeSkillIds(List<Integer> employeeSkillIds) {
        this.employeeSkillIds = employeeSkillIds;
    }

    public void setContractsCount(int contractsCount) {
        this.contractsCount = contractsCount;
    }

    public void setLang(Object lang) {
        this.lang = lang;
    }

    public void setLastCheckIn(Date lastCheckIn) {
        this.lastCheckIn = lastCheckIn;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setHasWorkPermit(Object hasWorkPermit) {
        this.hasWorkPermit = hasWorkPermit;
    }

    public void setIsWorkPermitScheduledActivity(boolean isWorkPermitScheduledActivity) {
        this.isWorkPermitScheduledActivity = isWorkPermitScheduledActivity;
    }

    public void setAttendanceState(Object attendanceState) {
        this.attendanceState = attendanceState;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
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

    public void setThursdayLocationIdAsObject(HrWorkLocation thursdayLocationIdAsObject) {
        this.thursdayLocationIdAsObject = thursdayLocationIdAsObject;
    }

    public void setThursdayLocationId(OdooId thursdayLocationId) {
        this.thursdayLocationId = thursdayLocationId;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }

    public void setPrivateZip(String privateZip) {
        this.privateZip = privateZip;
    }

    public void setBadgeIdsAsList(List<GamificationBadgeUser> badgeIdsAsList) {
        this.badgeIdsAsList = badgeIdsAsList;
    }

    public void setBadgeIds(List<Integer> badgeIds) {
        this.badgeIds = badgeIds;
    }

    public void setVisaExpire(Object visaExpire) {
        this.visaExpire = visaExpire;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setLastAttendanceWorkedHours(double lastAttendanceWorkedHours) {
        this.lastAttendanceWorkedHours = lastAttendanceWorkedHours;
    }

    public void setCoachIdAsObject(HrEmployee coachIdAsObject) {
        this.coachIdAsObject = coachIdAsObject;
    }

    public void setCoachId(OdooId coachId) {
        this.coachId = coachId;
    }

    public void setMarital(Object marital) {
        this.marital = marital;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setApplicantIdAsList(List<HrApplicant> applicantIdAsList) {
        this.applicantIdAsList = applicantIdAsList;
    }

    public void setApplicantId(List<Integer> applicantId) {
        this.applicantId = applicantId;
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

    public void setKmHomeWork(int kmHomeWork) {
        this.kmHomeWork = kmHomeWork;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
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

    public void setAdditionalNote(Object additionalNote) {
        this.additionalNote = additionalNote;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setEmployeeProperties(Object employeeProperties) {
        this.employeeProperties = employeeProperties;
    }



}