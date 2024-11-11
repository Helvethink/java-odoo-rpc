
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

package ch.helvethink.odoo4java.test.ng.hr.applicant;

import ch.helvethink.odoo4java.test.ng.hr.HrSkill;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrApplicant;
import ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillType;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillLevel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.applicant.skill")
public class HrApplicantSkill implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private HrApplicant applicantIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrApplicant")
        @OdooModel("hr.HrApplicant")
    
    private OdooId applicantId;

    
    private HrSkillLevel skillLevelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillLevel")
        @OdooModel("hr.skill.HrSkillLevel")
    
    private OdooId skillLevelId;

    
    private HrSkillType skillTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.skill.HrSkillType")
        @OdooModel("hr.skill.HrSkillType")
    
    private OdooId skillTypeId;

    
    private HrSkill skillIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrSkill")
        @OdooModel("hr.HrSkill")
    
    private OdooId skillId;

    
    private int id;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private int levelProgress;


    public HrApplicantSkill() {
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

    public HrApplicant getApplicantIdAsObject() {
        return applicantIdAsObject;
    }

    public OdooId getApplicantId() {
        return applicantId;
    }

    public HrSkillLevel getSkillLevelIdAsObject() {
        return skillLevelIdAsObject;
    }

    public OdooId getSkillLevelId() {
        return skillLevelId;
    }

    public HrSkillType getSkillTypeIdAsObject() {
        return skillTypeIdAsObject;
    }

    public OdooId getSkillTypeId() {
        return skillTypeId;
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

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getLevelProgress() {
        return levelProgress;
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

    public void setApplicantIdAsObject(HrApplicant applicantIdAsObject) {
        this.applicantIdAsObject = applicantIdAsObject;
    }

    public void setApplicantId(OdooId applicantId) {
        this.applicantId = applicantId;
    }

    public void setSkillLevelIdAsObject(HrSkillLevel skillLevelIdAsObject) {
        this.skillLevelIdAsObject = skillLevelIdAsObject;
    }

    public void setSkillLevelId(OdooId skillLevelId) {
        this.skillLevelId = skillLevelId;
    }

    public void setSkillTypeIdAsObject(HrSkillType skillTypeIdAsObject) {
        this.skillTypeIdAsObject = skillTypeIdAsObject;
    }

    public void setSkillTypeId(OdooId skillTypeId) {
        this.skillTypeId = skillTypeId;
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

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLevelProgress(int levelProgress) {
        this.levelProgress = levelProgress;
    }



}