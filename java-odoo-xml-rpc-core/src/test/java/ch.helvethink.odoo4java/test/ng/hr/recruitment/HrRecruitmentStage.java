
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

package ch.helvethink.odoo4java.test.ng.hr.recruitment;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.recruitment.stage")
public class HrRecruitmentStage implements OdooObj {

    
    private Date writeDate;

    
    private boolean isHiredStage;

    
    private Object requirements;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String legendDone;

    
    private List<HrJob> jobIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private List<Integer> jobIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int sequence;

    
    private boolean isFold;

    
    private String legendBlocked;

    
    private String legendNormal;

    
    private String name;

    
    private MailTemplate templateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId templateId;

    
    private boolean isIsWarningVisible;

    
    private int id;

    
    private Date createDate;


    public HrRecruitmentStage() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsHiredStage() {
        return isHiredStage;
    }

    public Object getRequirements() {
        return requirements;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getLegendDone() {
        return legendDone;
    }

    public List<HrJob> getJobIdsAsList() {
        return jobIdsAsList;
    }

    public List<Integer> getJobIds() {
        return jobIds;
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

    public int getSequence() {
        return sequence;
    }

    public boolean getIsFold() {
        return isFold;
    }

    public String getLegendBlocked() {
        return legendBlocked;
    }

    public String getLegendNormal() {
        return legendNormal;
    }

    public String getName() {
        return name;
    }

    public MailTemplate getTemplateIdAsObject() {
        return templateIdAsObject;
    }

    public OdooId getTemplateId() {
        return templateId;
    }

    public boolean getIsIsWarningVisible() {
        return isIsWarningVisible;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsHiredStage(boolean isHiredStage) {
        this.isHiredStage = isHiredStage;
    }

    public void setRequirements(Object requirements) {
        this.requirements = requirements;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setLegendDone(String legendDone) {
        this.legendDone = legendDone;
    }

    public void setJobIdsAsList(List<HrJob> jobIdsAsList) {
        this.jobIdsAsList = jobIdsAsList;
    }

    public void setJobIds(List<Integer> jobIds) {
        this.jobIds = jobIds;
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

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setIsFold(boolean isFold) {
        this.isFold = isFold;
    }

    public void setLegendBlocked(String legendBlocked) {
        this.legendBlocked = legendBlocked;
    }

    public void setLegendNormal(String legendNormal) {
        this.legendNormal = legendNormal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemplateIdAsObject(MailTemplate templateIdAsObject) {
        this.templateIdAsObject = templateIdAsObject;
    }

    public void setTemplateId(OdooId templateId) {
        this.templateId = templateId;
    }

    public void setIsIsWarningVisible(boolean isIsWarningVisible) {
        this.isIsWarningVisible = isIsWarningVisible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}