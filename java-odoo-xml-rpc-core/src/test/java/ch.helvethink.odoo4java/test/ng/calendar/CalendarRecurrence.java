
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

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.ir.cron.IrCronTrigger;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("calendar.recurrence")
public class CalendarRecurrence implements OdooObj {

    
    private boolean isThu;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object endType;

    
    private boolean isTue;

    
    private IrCronTrigger triggerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.cron.IrCronTrigger")
        @OdooModel("ir.cron.IrCronTrigger")
    
    private OdooId triggerId;

    
    private Object weekday;

    
    private Object monthBy;

    
    private String msOrganizerEventId;

    
    private boolean isMon;

    
    private boolean isSun;

    
    private String microsoftId;

    
    private String rrule;

    
    private boolean isWed;

    
    private Object eventTz;

    
    private int id;

    
    private boolean isFri;

    
    private Date createDate;

    
    private int day;

    
    private boolean isSat;

    
    private Object rruleType;

    
    private int count;

    
    private boolean isActive;

    
    private CalendarEvent baseEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId baseEventId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isNeedSyncM;

    
    private String name;

    
    private Object byday;

    
    private int interval;

    
    private Object until;

    
    private List<CalendarEvent> calendarEventIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private List<Integer> calendarEventIds;

    
    private String msUniversalEventId;

    
    private Date dtstart;


    public CalendarRecurrence() {
    // Constructor
    }


    public boolean getIsThu() {
        return isThu;
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

    public Object getEndType() {
        return endType;
    }

    public boolean getIsTue() {
        return isTue;
    }

    public IrCronTrigger getTriggerIdAsObject() {
        return triggerIdAsObject;
    }

    public OdooId getTriggerId() {
        return triggerId;
    }

    public Object getWeekday() {
        return weekday;
    }

    public Object getMonthBy() {
        return monthBy;
    }

    public String getMsOrganizerEventId() {
        return msOrganizerEventId;
    }

    public boolean getIsMon() {
        return isMon;
    }

    public boolean getIsSun() {
        return isSun;
    }

    public String getMicrosoftId() {
        return microsoftId;
    }

    public String getRrule() {
        return rrule;
    }

    public boolean getIsWed() {
        return isWed;
    }

    public Object getEventTz() {
        return eventTz;
    }

    public int getId() {
        return id;
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

    public boolean getIsSat() {
        return isSat;
    }

    public Object getRruleType() {
        return rruleType;
    }

    public int getCount() {
        return count;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public CalendarEvent getBaseEventIdAsObject() {
        return baseEventIdAsObject;
    }

    public OdooId getBaseEventId() {
        return baseEventId;
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

    public boolean getIsNeedSyncM() {
        return isNeedSyncM;
    }

    public String getName() {
        return name;
    }

    public Object getByday() {
        return byday;
    }

    public int getInterval() {
        return interval;
    }

    public Object getUntil() {
        return until;
    }

    public List<CalendarEvent> getCalendarEventIdsAsList() {
        return calendarEventIdsAsList;
    }

    public List<Integer> getCalendarEventIds() {
        return calendarEventIds;
    }

    public String getMsUniversalEventId() {
        return msUniversalEventId;
    }

    public Date getDtstart() {
        return dtstart;
    }



    public void setIsThu(boolean isThu) {
        this.isThu = isThu;
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

    public void setEndType(Object endType) {
        this.endType = endType;
    }

    public void setIsTue(boolean isTue) {
        this.isTue = isTue;
    }

    public void setTriggerIdAsObject(IrCronTrigger triggerIdAsObject) {
        this.triggerIdAsObject = triggerIdAsObject;
    }

    public void setTriggerId(OdooId triggerId) {
        this.triggerId = triggerId;
    }

    public void setWeekday(Object weekday) {
        this.weekday = weekday;
    }

    public void setMonthBy(Object monthBy) {
        this.monthBy = monthBy;
    }

    public void setMsOrganizerEventId(String msOrganizerEventId) {
        this.msOrganizerEventId = msOrganizerEventId;
    }

    public void setIsMon(boolean isMon) {
        this.isMon = isMon;
    }

    public void setIsSun(boolean isSun) {
        this.isSun = isSun;
    }

    public void setMicrosoftId(String microsoftId) {
        this.microsoftId = microsoftId;
    }

    public void setRrule(String rrule) {
        this.rrule = rrule;
    }

    public void setIsWed(boolean isWed) {
        this.isWed = isWed;
    }

    public void setEventTz(Object eventTz) {
        this.eventTz = eventTz;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setIsSat(boolean isSat) {
        this.isSat = isSat;
    }

    public void setRruleType(Object rruleType) {
        this.rruleType = rruleType;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setBaseEventIdAsObject(CalendarEvent baseEventIdAsObject) {
        this.baseEventIdAsObject = baseEventIdAsObject;
    }

    public void setBaseEventId(OdooId baseEventId) {
        this.baseEventId = baseEventId;
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

    public void setIsNeedSyncM(boolean isNeedSyncM) {
        this.isNeedSyncM = isNeedSyncM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setByday(Object byday) {
        this.byday = byday;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setUntil(Object until) {
        this.until = until;
    }

    public void setCalendarEventIdsAsList(List<CalendarEvent> calendarEventIdsAsList) {
        this.calendarEventIdsAsList = calendarEventIdsAsList;
    }

    public void setCalendarEventIds(List<Integer> calendarEventIds) {
        this.calendarEventIds = calendarEventIds;
    }

    public void setMsUniversalEventId(String msUniversalEventId) {
        this.msUniversalEventId = msUniversalEventId;
    }

    public void setDtstart(Date dtstart) {
        this.dtstart = dtstart;
    }



}