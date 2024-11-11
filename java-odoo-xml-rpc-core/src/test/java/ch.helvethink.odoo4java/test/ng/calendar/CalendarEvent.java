
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

package ch.helvethink.odoo4java.test.ng.calendar;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarAttendee;
import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarAlarm;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.hr.HrApplicant;
import ch.helvethink.odoo4java.test.ng.calendar.event.CalendarEventType;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarRecurrence;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("calendar.event")
public class CalendarEvent implements OdooObj {

    
    private boolean isThu;

    
    private Date writeDate;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isTue;

    
    private Object weekday;

    
    private Object monthBy;

    
    private Object showAs;

    
    private boolean isShouldShowStatus;

    
    private boolean isMon;

    
    private boolean isIsOrganizerAlone;

    
    private String microsoftId;

    
    private int messageHasErrorCounter;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private String rrule;

    
    private List<CalendarAlarm> alarmIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarAlarm")
        @OdooModel("calendar.CalendarAlarm")
    
    private List<Integer> alarmIds;

    
    private boolean isHasMessage;

    
    private int id;

    
    private String videocallLocation;

    
    private boolean isFri;

    
    private Date createDate;

    
    private int day;

    
    private int messageAttachmentCount;

    
    private int tentativeCount;

    
    private int count;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int declinedCount;

    
    private boolean isNeedSyncM;

    
    private boolean isFollowRecurrence;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String accessToken;

    
    private CrmLead opportunityIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private OdooId opportunityId;

    
    private Date stop;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String name;

    
    private int acceptedCount;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private Object currentStatus;

    
    private int interval;

    
    private List<CalendarEventType> categIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.event.CalendarEventType")
        @OdooModel("calendar.event.CalendarEventType")
    
    private List<Integer> categIds;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isRecurrency;

    
    private Object rruleTypeUi;

    
    private Object endType;

    
    private String resModel;

    
    private Object description;

    
    private Object privacy;

    
    private String msOrganizerEventId;

    
    private boolean isIsHighlighted;

    
    private boolean isSun;

    
    private List<CalendarAttendee> attendeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarAttendee")
        @OdooModel("calendar.CalendarAttendee")
    
    private List<Integer> attendeeIds;

    
    private double duration;

    
    private boolean isDisplayDescription;

    
    private int awaitingCount;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Object resId;

    
    private CalendarRecurrence recurrenceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarRecurrence")
        @OdooModel("calendar.CalendarRecurrence")
    
    private OdooId recurrenceId;

    
    private boolean isWed;

    
    private Object eventTz;

    
    private int attendeesCount;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private Object recurrenceUpdate;

    
    private Object startDate;

    
    private DiscussChannel videocallChannelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private OdooId videocallChannelId;

    
    private IrModel resModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId resModelId;

    
    private boolean isSat;

    
    private Date start;

    
    private Object rruleType;

    
    private boolean isMessageHasSmsError;

    
    private Object stopDate;

    
    private String displayTime;

    
    private CalendarAttendee currentAttendeeAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarAttendee")
        @OdooModel("calendar.CalendarAttendee")
    
    private OdooId currentAttendee;

    
    private boolean isAllday;

    
    private boolean isMessageHasError;

    
    private HrApplicant applicantIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrApplicant")
        @OdooModel("hr.HrApplicant")
    
    private OdooId applicantId;

    
    private boolean isMessageNeedaction;

    
    private String resModelName;

    
    private int messageNeedactionCounter;

    
    private Object videocallSource;

    
    private Object byday;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private String location;

    
    private Object until;

    
    private String msUniversalEventId;

    
    private String microsoftRecurrenceMasterId;

    
    private boolean isUserCanEdit;

    
    private List<ResPartner> invalidEmailPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> invalidEmailPartnerIds;


    public CalendarEvent() {
    // Constructor
    }


    public boolean getIsThu() {
        return isThu;
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

    public boolean getIsTue() {
        return isTue;
    }

    public Object getWeekday() {
        return weekday;
    }

    public Object getMonthBy() {
        return monthBy;
    }

    public Object getShowAs() {
        return showAs;
    }

    public boolean getIsShouldShowStatus() {
        return isShouldShowStatus;
    }

    public boolean getIsMon() {
        return isMon;
    }

    public boolean getIsIsOrganizerAlone() {
        return isIsOrganizerAlone;
    }

    public String getMicrosoftId() {
        return microsoftId;
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

    public String getRrule() {
        return rrule;
    }

    public List<CalendarAlarm> getAlarmIdsAsList() {
        return alarmIdsAsList;
    }

    public List<Integer> getAlarmIds() {
        return alarmIds;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public int getId() {
        return id;
    }

    public String getVideocallLocation() {
        return videocallLocation;
    }

    public boolean getIsFri() {
        return isFri;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getDay() {
        return day;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public int getTentativeCount() {
        return tentativeCount;
    }

    public int getCount() {
        return count;
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

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public int getDeclinedCount() {
        return declinedCount;
    }

    public boolean getIsNeedSyncM() {
        return isNeedSyncM;
    }

    public boolean getIsFollowRecurrence() {
        return isFollowRecurrence;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public CrmLead getOpportunityIdAsObject() {
        return opportunityIdAsObject;
    }

    public OdooId getOpportunityId() {
        return opportunityId;
    }

    public Date getStop() {
        return stop;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAcceptedCount() {
        return acceptedCount;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public Object getCurrentStatus() {
        return currentStatus;
    }

    public int getInterval() {
        return interval;
    }

    public List<CalendarEventType> getCategIdsAsList() {
        return categIdsAsList;
    }

    public List<Integer> getCategIds() {
        return categIds;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsRecurrency() {
        return isRecurrency;
    }

    public Object getRruleTypeUi() {
        return rruleTypeUi;
    }

    public Object getEndType() {
        return endType;
    }

    public String getResModel() {
        return resModel;
    }

    public Object getDescription() {
        return description;
    }

    public Object getPrivacy() {
        return privacy;
    }

    public String getMsOrganizerEventId() {
        return msOrganizerEventId;
    }

    public boolean getIsIsHighlighted() {
        return isIsHighlighted;
    }

    public boolean getIsSun() {
        return isSun;
    }

    public List<CalendarAttendee> getAttendeeIdsAsList() {
        return attendeeIdsAsList;
    }

    public List<Integer> getAttendeeIds() {
        return attendeeIds;
    }

    public double getDuration() {
        return duration;
    }

    public boolean getIsDisplayDescription() {
        return isDisplayDescription;
    }

    public int getAwaitingCount() {
        return awaitingCount;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Object getResId() {
        return resId;
    }

    public CalendarRecurrence getRecurrenceIdAsObject() {
        return recurrenceIdAsObject;
    }

    public OdooId getRecurrenceId() {
        return recurrenceId;
    }

    public boolean getIsWed() {
        return isWed;
    }

    public Object getEventTz() {
        return eventTz;
    }

    public int getAttendeesCount() {
        return attendeesCount;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public Object getRecurrenceUpdate() {
        return recurrenceUpdate;
    }

    public Object getStartDate() {
        return startDate;
    }

    public DiscussChannel getVideocallChannelIdAsObject() {
        return videocallChannelIdAsObject;
    }

    public OdooId getVideocallChannelId() {
        return videocallChannelId;
    }

    public IrModel getResModelIdAsObject() {
        return resModelIdAsObject;
    }

    public OdooId getResModelId() {
        return resModelId;
    }

    public boolean getIsSat() {
        return isSat;
    }

    public Date getStart() {
        return start;
    }

    public Object getRruleType() {
        return rruleType;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public Object getStopDate() {
        return stopDate;
    }

    public String getDisplayTime() {
        return displayTime;
    }

    public CalendarAttendee getCurrentAttendeeAsObject() {
        return currentAttendeeAsObject;
    }

    public OdooId getCurrentAttendee() {
        return currentAttendee;
    }

    public boolean getIsAllday() {
        return isAllday;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public HrApplicant getApplicantIdAsObject() {
        return applicantIdAsObject;
    }

    public OdooId getApplicantId() {
        return applicantId;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public String getResModelName() {
        return resModelName;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public Object getVideocallSource() {
        return videocallSource;
    }

    public Object getByday() {
        return byday;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public String getLocation() {
        return location;
    }

    public Object getUntil() {
        return until;
    }

    public String getMsUniversalEventId() {
        return msUniversalEventId;
    }

    public String getMicrosoftRecurrenceMasterId() {
        return microsoftRecurrenceMasterId;
    }

    public boolean getIsUserCanEdit() {
        return isUserCanEdit;
    }

    public List<ResPartner> getInvalidEmailPartnerIdsAsList() {
        return invalidEmailPartnerIdsAsList;
    }

    public List<Integer> getInvalidEmailPartnerIds() {
        return invalidEmailPartnerIds;
    }



    public void setIsThu(boolean isThu) {
        this.isThu = isThu;
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

    public void setIsTue(boolean isTue) {
        this.isTue = isTue;
    }

    public void setWeekday(Object weekday) {
        this.weekday = weekday;
    }

    public void setMonthBy(Object monthBy) {
        this.monthBy = monthBy;
    }

    public void setShowAs(Object showAs) {
        this.showAs = showAs;
    }

    public void setIsShouldShowStatus(boolean isShouldShowStatus) {
        this.isShouldShowStatus = isShouldShowStatus;
    }

    public void setIsMon(boolean isMon) {
        this.isMon = isMon;
    }

    public void setIsIsOrganizerAlone(boolean isIsOrganizerAlone) {
        this.isIsOrganizerAlone = isIsOrganizerAlone;
    }

    public void setMicrosoftId(String microsoftId) {
        this.microsoftId = microsoftId;
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

    public void setRrule(String rrule) {
        this.rrule = rrule;
    }

    public void setAlarmIdsAsList(List<CalendarAlarm> alarmIdsAsList) {
        this.alarmIdsAsList = alarmIdsAsList;
    }

    public void setAlarmIds(List<Integer> alarmIds) {
        this.alarmIds = alarmIds;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVideocallLocation(String videocallLocation) {
        this.videocallLocation = videocallLocation;
    }

    public void setIsFri(boolean isFri) {
        this.isFri = isFri;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTentativeCount(int tentativeCount) {
        this.tentativeCount = tentativeCount;
    }

    public void setCount(int count) {
        this.count = count;
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

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setDeclinedCount(int declinedCount) {
        this.declinedCount = declinedCount;
    }

    public void setIsNeedSyncM(boolean isNeedSyncM) {
        this.isNeedSyncM = isNeedSyncM;
    }

    public void setIsFollowRecurrence(boolean isFollowRecurrence) {
        this.isFollowRecurrence = isFollowRecurrence;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setOpportunityIdAsObject(CrmLead opportunityIdAsObject) {
        this.opportunityIdAsObject = opportunityIdAsObject;
    }

    public void setOpportunityId(OdooId opportunityId) {
        this.opportunityId = opportunityId;
    }

    public void setStop(Date stop) {
        this.stop = stop;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcceptedCount(int acceptedCount) {
        this.acceptedCount = acceptedCount;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setCurrentStatus(Object currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setCategIdsAsList(List<CalendarEventType> categIdsAsList) {
        this.categIdsAsList = categIdsAsList;
    }

    public void setCategIds(List<Integer> categIds) {
        this.categIds = categIds;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsRecurrency(boolean isRecurrency) {
        this.isRecurrency = isRecurrency;
    }

    public void setRruleTypeUi(Object rruleTypeUi) {
        this.rruleTypeUi = rruleTypeUi;
    }

    public void setEndType(Object endType) {
        this.endType = endType;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setPrivacy(Object privacy) {
        this.privacy = privacy;
    }

    public void setMsOrganizerEventId(String msOrganizerEventId) {
        this.msOrganizerEventId = msOrganizerEventId;
    }

    public void setIsIsHighlighted(boolean isIsHighlighted) {
        this.isIsHighlighted = isIsHighlighted;
    }

    public void setIsSun(boolean isSun) {
        this.isSun = isSun;
    }

    public void setAttendeeIdsAsList(List<CalendarAttendee> attendeeIdsAsList) {
        this.attendeeIdsAsList = attendeeIdsAsList;
    }

    public void setAttendeeIds(List<Integer> attendeeIds) {
        this.attendeeIds = attendeeIds;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setIsDisplayDescription(boolean isDisplayDescription) {
        this.isDisplayDescription = isDisplayDescription;
    }

    public void setAwaitingCount(int awaitingCount) {
        this.awaitingCount = awaitingCount;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setResId(Object resId) {
        this.resId = resId;
    }

    public void setRecurrenceIdAsObject(CalendarRecurrence recurrenceIdAsObject) {
        this.recurrenceIdAsObject = recurrenceIdAsObject;
    }

    public void setRecurrenceId(OdooId recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public void setIsWed(boolean isWed) {
        this.isWed = isWed;
    }

    public void setEventTz(Object eventTz) {
        this.eventTz = eventTz;
    }

    public void setAttendeesCount(int attendeesCount) {
        this.attendeesCount = attendeesCount;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setRecurrenceUpdate(Object recurrenceUpdate) {
        this.recurrenceUpdate = recurrenceUpdate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public void setVideocallChannelIdAsObject(DiscussChannel videocallChannelIdAsObject) {
        this.videocallChannelIdAsObject = videocallChannelIdAsObject;
    }

    public void setVideocallChannelId(OdooId videocallChannelId) {
        this.videocallChannelId = videocallChannelId;
    }

    public void setResModelIdAsObject(IrModel resModelIdAsObject) {
        this.resModelIdAsObject = resModelIdAsObject;
    }

    public void setResModelId(OdooId resModelId) {
        this.resModelId = resModelId;
    }

    public void setIsSat(boolean isSat) {
        this.isSat = isSat;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setRruleType(Object rruleType) {
        this.rruleType = rruleType;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setStopDate(Object stopDate) {
        this.stopDate = stopDate;
    }

    public void setDisplayTime(String displayTime) {
        this.displayTime = displayTime;
    }

    public void setCurrentAttendeeAsObject(CalendarAttendee currentAttendeeAsObject) {
        this.currentAttendeeAsObject = currentAttendeeAsObject;
    }

    public void setCurrentAttendee(OdooId currentAttendee) {
        this.currentAttendee = currentAttendee;
    }

    public void setIsAllday(boolean isAllday) {
        this.isAllday = isAllday;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setApplicantIdAsObject(HrApplicant applicantIdAsObject) {
        this.applicantIdAsObject = applicantIdAsObject;
    }

    public void setApplicantId(OdooId applicantId) {
        this.applicantId = applicantId;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setResModelName(String resModelName) {
        this.resModelName = resModelName;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setVideocallSource(Object videocallSource) {
        this.videocallSource = videocallSource;
    }

    public void setByday(Object byday) {
        this.byday = byday;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUntil(Object until) {
        this.until = until;
    }

    public void setMsUniversalEventId(String msUniversalEventId) {
        this.msUniversalEventId = msUniversalEventId;
    }

    public void setMicrosoftRecurrenceMasterId(String microsoftRecurrenceMasterId) {
        this.microsoftRecurrenceMasterId = microsoftRecurrenceMasterId;
    }

    public void setIsUserCanEdit(boolean isUserCanEdit) {
        this.isUserCanEdit = isUserCanEdit;
    }

    public void setInvalidEmailPartnerIdsAsList(List<ResPartner> invalidEmailPartnerIdsAsList) {
        this.invalidEmailPartnerIdsAsList = invalidEmailPartnerIdsAsList;
    }

    public void setInvalidEmailPartnerIds(List<Integer> invalidEmailPartnerIds) {
        this.invalidEmailPartnerIds = invalidEmailPartnerIds;
    }



}