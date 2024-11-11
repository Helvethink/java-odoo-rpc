
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

package ch.helvethink.odoo4java.test.ng.mail.activity.plan;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityPlan;;

@OdooObject("mail.activity.plan.template")
public class MailActivityPlanTemplate implements OdooObj {

    
    private String summary;

    
    private Date writeDate;

    
    private Object note;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private ResUsers responsibleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId responsibleId;

    
    private Object resModel;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object responsibleType;

    
    private int sequence;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private int id;

    
    private Date createDate;

    
    private MailActivityPlan planIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityPlan")
        @OdooModel("mail.activity.MailActivityPlan")
    
    private OdooId planId;


    public MailActivityPlanTemplate() {
    // Constructor
    }


    public String getSummary() {
        return summary;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public ResUsers getResponsibleIdAsObject() {
        return responsibleIdAsObject;
    }

    public OdooId getResponsibleId() {
        return responsibleId;
    }

    public Object getResModel() {
        return resModel;
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

    public Object getResponsibleType() {
        return responsibleType;
    }

    public int getSequence() {
        return sequence;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public MailActivityPlan getPlanIdAsObject() {
        return planIdAsObject;
    }

    public OdooId getPlanId() {
        return planId;
    }



    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setResponsibleIdAsObject(ResUsers responsibleIdAsObject) {
        this.responsibleIdAsObject = responsibleIdAsObject;
    }

    public void setResponsibleId(OdooId responsibleId) {
        this.responsibleId = responsibleId;
    }

    public void setResModel(Object resModel) {
        this.resModel = resModel;
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

    public void setResponsibleType(Object responsibleType) {
        this.responsibleType = responsibleType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPlanIdAsObject(MailActivityPlan planIdAsObject) {
        this.planIdAsObject = planIdAsObject;
    }

    public void setPlanId(OdooId planId) {
        this.planId = planId;
    }



}