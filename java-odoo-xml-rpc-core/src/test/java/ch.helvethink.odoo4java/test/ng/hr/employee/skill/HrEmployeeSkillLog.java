
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

package ch.helvethink.odoo4java.test.ng.hr.employee.skill;

import ch.helvethink.odoo4java.test.ng.hr.HrSkill;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillType;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillLevel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.employee.skill.log")
public class HrEmployeeSkillLog implements OdooObj {

    
    private Object date;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private HrSkillType skillTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillType")
        @OdooModel("hr.skill.HrSkillType")
    
    private OdooId skillTypeId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private HrSkillLevel skillLevelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillLevel")
        @OdooModel("hr.skill.HrSkillLevel")
    
    private OdooId skillLevelId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private HrSkill skillIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrSkill")
        @OdooModel("hr.HrSkill")
    
    private OdooId skillId;

    
    private int id;

    
    private Date createDate;

    
    private int levelProgress;


    public HrEmployeeSkillLog() {
    // Constructor
    }


    public Object getDate() {
        return date;
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

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public HrSkillType getSkillTypeIdAsObject() {
        return skillTypeIdAsObject;
    }

    public OdooId getSkillTypeId() {
        return skillTypeId;
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

    public HrSkillLevel getSkillLevelIdAsObject() {
        return skillLevelIdAsObject;
    }

    public OdooId getSkillLevelId() {
        return skillLevelId;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public HrSkill getSkillIdAsObject() {
        return skillIdAsObject;
    }

    public OdooId getSkillId() {
        return skillId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getLevelProgress() {
        return levelProgress;
    }



    public void setDate(Object date) {
        this.date = date;
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

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setSkillTypeIdAsObject(HrSkillType skillTypeIdAsObject) {
        this.skillTypeIdAsObject = skillTypeIdAsObject;
    }

    public void setSkillTypeId(OdooId skillTypeId) {
        this.skillTypeId = skillTypeId;
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

    public void setSkillLevelIdAsObject(HrSkillLevel skillLevelIdAsObject) {
        this.skillLevelIdAsObject = skillLevelIdAsObject;
    }

    public void setSkillLevelId(OdooId skillLevelId) {
        this.skillLevelId = skillLevelId;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setSkillIdAsObject(HrSkill skillIdAsObject) {
        this.skillIdAsObject = skillIdAsObject;
    }

    public void setSkillId(OdooId skillId) {
        this.skillId = skillId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLevelProgress(int levelProgress) {
        this.levelProgress = levelProgress;
    }



}