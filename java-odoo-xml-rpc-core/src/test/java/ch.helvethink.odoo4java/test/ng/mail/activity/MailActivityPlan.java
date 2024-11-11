
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

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.mail.activity.plan.MailActivityPlanTemplate;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.activity.plan")
public class MailActivityPlan implements OdooObj {

    
    private int stepsCount;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
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

    
    private Object resModel;

    
    private boolean isActive;

    
    private List<MailActivityPlanTemplate> templateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.plan.MailActivityPlanTemplate")
        @OdooModel("mail.activity.plan.MailActivityPlanTemplate")
    
    private List<Integer> templateIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String name;

    
    private Object assignationSummary;

    
    private int id;

    
    private boolean isHasUserOnDemand;

    
    private Date createDate;


    public MailActivityPlan() {
    // Constructor
    }


    public int getStepsCount() {
        return stepsCount;
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

    public Object getResModel() {
        return resModel;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public List<MailActivityPlanTemplate> getTemplateIdsAsList() {
        return templateIdsAsList;
    }

    public List<Integer> getTemplateIds() {
        return templateIds;
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

    public Object getAssignationSummary() {
        return assignationSummary;
    }

    public int getId() {
        return id;
    }

    public boolean getIsHasUserOnDemand() {
        return isHasUserOnDemand;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
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

    public void setResModel(Object resModel) {
        this.resModel = resModel;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setTemplateIdsAsList(List<MailActivityPlanTemplate> templateIdsAsList) {
        this.templateIdsAsList = templateIdsAsList;
    }

    public void setTemplateIds(List<Integer> templateIds) {
        this.templateIds = templateIds;
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

    public void setAssignationSummary(Object assignationSummary) {
        this.assignationSummary = assignationSummary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsHasUserOnDemand(boolean isHasUserOnDemand) {
        this.isHasUserOnDemand = isHasUserOnDemand;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}