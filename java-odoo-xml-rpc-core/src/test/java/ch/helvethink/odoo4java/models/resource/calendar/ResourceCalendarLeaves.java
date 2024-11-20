
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
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.models.OdooId;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;
import ch.helvethink.odoo4java.models.resource.Resource;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.models.OdooObject;

@OdooObject("resource.calendar.leaves")
public class ResourceCalendarLeaves implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<AccountAnalyticLine> timesheetIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
        @JsonProperty("timesheet_ids")
        private List<Integer> timesheetIds;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("time_type")
        private Object timeType;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        private ResourceCalendar calendarIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("calendar_id")
        private OdooId calendarId;
    

    
        @JsonProperty("date_to")
        private Date dateTo;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private Resource resourceIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.Resource")
        @OdooModel("resource.Resource")
        @JsonProperty("resource_id")
        private OdooId resourceId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("date_from")
        private Date dateFrom;
    


    public ResourceCalendarLeaves() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<AccountAnalyticLine> getTimesheetIdsAsList() {
        return timesheetIdsAsList;
    }

    public List<Integer> getTimesheetIds() {
        return timesheetIds;
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public ResourceCalendar getCalendarIdAsObject() {
        return calendarIdAsObject;
    }

    public OdooId getCalendarId() {
        return calendarId;
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

    public String getName() {
        return name;
    }

    public Resource getResourceIdAsObject() {
        return resourceIdAsObject;
    }

    public OdooId getResourceId() {
        return resourceId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getDateFrom() {
        return dateFrom;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setTimesheetIdsAsList(List<AccountAnalyticLine> timesheetIdsAsList) {
        this.timesheetIdsAsList = timesheetIdsAsList;
    }

    public void setTimesheetIds(List<Integer> timesheetIds) {
        this.timesheetIds = timesheetIds;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setCalendarIdAsObject(ResourceCalendar calendarIdAsObject) {
        this.calendarIdAsObject = calendarIdAsObject;
    }

    public void setCalendarId(OdooId calendarId) {
        this.calendarId = calendarId;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setResourceIdAsObject(Resource resourceIdAsObject) {
        this.resourceIdAsObject = resourceIdAsObject;
    }

    public void setResourceId(OdooId resourceId) {
        this.resourceId = resourceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }



}