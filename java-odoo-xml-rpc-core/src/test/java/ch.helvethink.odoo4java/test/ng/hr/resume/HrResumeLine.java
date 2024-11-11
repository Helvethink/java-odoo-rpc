
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

package ch.helvethink.odoo4java.test.ng.hr.resume;

import ch.helvethink.odoo4java.test.ng.hr.resume.line.HrResumeLineType;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.resume.line")
public class HrResumeLine implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object description;

    
    private Object dateEnd;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object displayType;

    
    private HrResumeLineType lineTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.resume.line.HrResumeLineType")
        @OdooModel("hr.resume.line.HrResumeLineType")
    
    private OdooId lineTypeId;

    
    private Object dateStart;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String courseUrl;

    
    private String name;

    
    private int id;

    
    private Date createDate;

    
    private SlideChannel channelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private OdooId channelId;


    public HrResumeLine() {
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

    public Object getDescription() {
        return description;
    }

    public Object getDateEnd() {
        return dateEnd;
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

    public Object getDisplayType() {
        return displayType;
    }

    public HrResumeLineType getLineTypeIdAsObject() {
        return lineTypeIdAsObject;
    }

    public OdooId getLineTypeId() {
        return lineTypeId;
    }

    public Object getDateStart() {
        return dateStart;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public SlideChannel getChannelIdAsObject() {
        return channelIdAsObject;
    }

    public OdooId getChannelId() {
        return channelId;
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

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setDateEnd(Object dateEnd) {
        this.dateEnd = dateEnd;
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

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setLineTypeIdAsObject(HrResumeLineType lineTypeIdAsObject) {
        this.lineTypeIdAsObject = lineTypeIdAsObject;
    }

    public void setLineTypeId(OdooId lineTypeId) {
        this.lineTypeId = lineTypeId;
    }

    public void setDateStart(Object dateStart) {
        this.dateStart = dateStart;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setChannelIdAsObject(SlideChannel channelIdAsObject) {
        this.channelIdAsObject = channelIdAsObject;
    }

    public void setChannelId(OdooId channelId) {
        this.channelId = channelId;
    }



}