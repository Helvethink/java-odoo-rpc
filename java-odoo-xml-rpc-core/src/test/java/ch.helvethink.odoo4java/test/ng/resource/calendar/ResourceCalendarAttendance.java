
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

package ch.helvethink.odoo4java.test.ng.resource.calendar;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.resource.Resource;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("resource.calendar.attendance")
public class ResourceCalendarAttendance implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResourceCalendar calendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId calendarId;

    
    private boolean isTwoWeeksCalendar;

    
    private Object weekType;

    
    private Object dateTo;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private double hourTo;

    
    private Object displayType;

    
    private int sequence;

    
    private String name;

    
    private double durationDays;

    
    private Object dayofweek;

    
    private Resource resourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.Resource")
        @OdooModel("resource.Resource")
    
    private OdooId resourceId;

    
    private Object dayPeriod;

    
    private int id;

    
    private Date createDate;

    
    private double hourFrom;

    
    private double durationHours;

    
    private Object dateFrom;


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

    public Object getDateTo() {
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

    public Object getDateFrom() {
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

    public void setDateTo(Object dateTo) {
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

    public void setDateFrom(Object dateFrom) {
        this.dateFrom = dateFrom;
    }



}