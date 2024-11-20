
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

package ch.helvethink.odoo4java.models.resource.calendar;

import ch.helvethink.odoo4java.models.resource.ResourceCalendar;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;
import ch.helvethink.odoo4java.models.resource.Resource;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import java.util.Date;

@OdooObject("resource.calendar.attendance")
public class ResourceCalendarAttendance implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private ResourceCalendar calendarIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("calendar_id")
        private OdooId calendarId;
    

    
        @JsonProperty("two_weeks_calendar")
        private boolean isTwoWeeksCalendar;
    

    
        @JsonProperty("week_type")
        private Object weekType;
    

    
        @JsonProperty("date_to")
        private Date dateTo;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("hour_to")
        private double hourTo;
    

    
        @JsonProperty("display_type")
        private Object displayType;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("duration_days")
        private double durationDays;
    

    
        @JsonProperty("dayofweek")
        private Object dayofweek;
    

    
        private Resource resourceIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.Resource")
        @OdooModel("resource.Resource")
        @JsonProperty("resource_id")
        private OdooId resourceId;
    

    
        @JsonProperty("day_period")
        private Object dayPeriod;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("hour_from")
        private double hourFrom;
    

    
        @JsonProperty("duration_hours")
        private double durationHours;
    

    
        @JsonProperty("date_from")
        private Date dateFrom;
    


    public ResourceCalendarAttendance() {
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

    public ResourceCalendar getCalendarIdAsObject() {
        return calendarIdAsObject;
    }

    public OdooId getCalendarId() {
        return calendarId;
    }

    public boolean getIsTwoWeeksCalendar() {
        return isTwoWeeksCalendar;
    }

    public Object getWeekType() {
        return weekType;
    }

    public Date getDateTo() {
        return dateTo;
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

    public double getHourTo() {
        return hourTo;
    }

    public Object getDisplayType() {
        return displayType;
    }

    public int getSequence() {
        return sequence;
    }

    public String getName() {
        return name;
    }

    public double getDurationDays() {
        return durationDays;
    }

    public Object getDayofweek() {
        return dayofweek;
    }

    public Resource getResourceIdAsObject() {
        return resourceIdAsObject;
    }

    public OdooId getResourceId() {
        return resourceId;
    }

    public Object getDayPeriod() {
        return dayPeriod;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getHourFrom() {
        return hourFrom;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public Date getDateFrom() {
        return dateFrom;
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

    public void setCalendarIdAsObject(ResourceCalendar calendarIdAsObject) {
        this.calendarIdAsObject = calendarIdAsObject;
    }

    public void setCalendarId(OdooId calendarId) {
        this.calendarId = calendarId;
    }

    public void setIsTwoWeeksCalendar(boolean isTwoWeeksCalendar) {
        this.isTwoWeeksCalendar = isTwoWeeksCalendar;
    }

    public void setWeekType(Object weekType) {
        this.weekType = weekType;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
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

    public void setHourTo(double hourTo) {
        this.hourTo = hourTo;
    }

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationDays(double durationDays) {
        this.durationDays = durationDays;
    }

    public void setDayofweek(Object dayofweek) {
        this.dayofweek = dayofweek;
    }

    public void setResourceIdAsObject(Resource resourceIdAsObject) {
        this.resourceIdAsObject = resourceIdAsObject;
    }

    public void setResourceId(OdooId resourceId) {
        this.resourceId = resourceId;
    }

    public void setDayPeriod(Object dayPeriod) {
        this.dayPeriod = dayPeriod;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setHourFrom(double hourFrom) {
        this.hourFrom = hourFrom;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }



}