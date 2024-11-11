
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

package ch.helvethink.odoo4java.test.ng.mail.activity;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityPlan;;

@OdooObject("mail.activity.schedule")
public class MailActivitySchedule implements OdooObj {

    
    private Date writeDate;

    
    private Object note;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object activityCategory;

    
    private boolean isPlanHasUserOnDemand;

    
    private String resModel;

    
    private Object dateDeadline;

    
    private Object error;

    
    private ResUsers planOnDemandUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId planOnDemandUserId;

    
    private boolean isHasError;

    
    private Object planAssignationSummary;

    
    private boolean isIsBatchMode;

    
    private int id;

    
    private Date createDate;

    
    private String summary;

    
    private IrModel resModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId resModelId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private Object planDateDeadline;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private List<MailActivityPlan> planAvailableIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityPlan")
        @OdooModel("mail.activity.MailActivityPlan")
    
    private List<Integer> planAvailableIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private Object resIds;

    
    private Object chainingType;

    
    private MailActivityPlan planIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityPlan")
        @OdooModel("mail.activity.MailActivityPlan")
    
    private OdooId planId;


    public MailActivitySchedule() {
    // Constructor
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

    public Object getActivityCategory() {
        return activityCategory;
    }

    public boolean getIsPlanHasUserOnDemand() {
        return isPlanHasUserOnDemand;
    }

    public String getResModel() {
        return resModel;
    }

    public Object getDateDeadline() {
        return dateDeadline;
    }

    public Object getError() {
        return error;
    }

    public ResUsers getPlanOnDemandUserIdAsObject() {
        return planOnDemandUserIdAsObject;
    }

    public OdooId getPlanOnDemandUserId() {
        return planOnDemandUserId;
    }

    public boolean getIsHasError() {
        return isHasError;
    }

    public Object getPlanAssignationSummary() {
        return planAssignationSummary;
    }

    public boolean getIsIsBatchMode() {
        return isIsBatchMode;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getSummary() {
        return summary;
    }

    public IrModel getResModelIdAsObject() {
        return resModelIdAsObject;
    }

    public OdooId getResModelId() {
        return resModelId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public Object getPlanDateDeadline() {
        return planDateDeadline;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public List<MailActivityPlan> getPlanAvailableIdsAsList() {
        return planAvailableIdsAsList;
    }

    public List<Integer> getPlanAvailableIds() {
        return planAvailableIds;
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

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public Object getResIds() {
        return resIds;
    }

    public Object getChainingType() {
        return chainingType;
    }

    public MailActivityPlan getPlanIdAsObject() {
        return planIdAsObject;
    }

    public OdooId getPlanId() {
        return planId;
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

    public void setActivityCategory(Object activityCategory) {
        this.activityCategory = activityCategory;
    }

    public void setIsPlanHasUserOnDemand(boolean isPlanHasUserOnDemand) {
        this.isPlanHasUserOnDemand = isPlanHasUserOnDemand;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setDateDeadline(Object dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public void setPlanOnDemandUserIdAsObject(ResUsers planOnDemandUserIdAsObject) {
        this.planOnDemandUserIdAsObject = planOnDemandUserIdAsObject;
    }

    public void setPlanOnDemandUserId(OdooId planOnDemandUserId) {
        this.planOnDemandUserId = planOnDemandUserId;
    }

    public void setIsHasError(boolean isHasError) {
        this.isHasError = isHasError;
    }

    public void setPlanAssignationSummary(Object planAssignationSummary) {
        this.planAssignationSummary = planAssignationSummary;
    }

    public void setIsIsBatchMode(boolean isIsBatchMode) {
        this.isIsBatchMode = isIsBatchMode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setResModelIdAsObject(IrModel resModelIdAsObject) {
        this.resModelIdAsObject = resModelIdAsObject;
    }

    public void setResModelId(OdooId resModelId) {
        this.resModelId = resModelId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setPlanDateDeadline(Object planDateDeadline) {
        this.planDateDeadline = planDateDeadline;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setPlanAvailableIdsAsList(List<MailActivityPlan> planAvailableIdsAsList) {
        this.planAvailableIdsAsList = planAvailableIdsAsList;
    }

    public void setPlanAvailableIds(List<Integer> planAvailableIds) {
        this.planAvailableIds = planAvailableIds;
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

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setResIds(Object resIds) {
        this.resIds = resIds;
    }

    public void setChainingType(Object chainingType) {
        this.chainingType = chainingType;
    }

    public void setPlanIdAsObject(MailActivityPlan planIdAsObject) {
        this.planIdAsObject = planIdAsObject;
    }

    public void setPlanId(OdooId planId) {
        this.planId = planId;
    }



}