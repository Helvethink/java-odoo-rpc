
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

package ch.helvethink.odoo4java.models.timesheets.analysis;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.AccountMove;
import ch.helvethink.odoo4java.models.project.Project;
import ch.helvethink.odoo4java.models.project.ProjectMilestone;
import ch.helvethink.odoo4java.models.project.ProjectTask;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("timesheets.analysis.report")
public class TimesheetsAnalysisReport implements OdooObj {

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("has_department_manager_access")
        private boolean isHasDepartmentManagerAccess;
    

    
        @JsonProperty("timesheet_revenues")
        private Object timesheetRevenues;
    

    
        private ProjectTask parentTaskIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("parent_task_id")
        private OdooId parentTaskId;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        private ProjectMilestone milestoneIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
        @JsonProperty("milestone_id")
        private OdooId milestoneId;
    

    
        private ProjectTask taskIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("task_id")
        private OdooId taskId;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        private Project projectIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("project_id")
        private OdooId projectId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        private AccountMove timesheetInvoiceIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("timesheet_invoice_id")
        private OdooId timesheetInvoiceId;
    

    
        @JsonProperty("amount")
        private Object amount;
    

    
        @JsonProperty("margin")
        private Object margin;
    

    
        @JsonProperty("billable_time")
        private double billableTime;
    

    
        @JsonProperty("non_billable_time")
        private double nonBillableTime;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("unit_amount")
        private double unitAmount;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        @JsonProperty("timesheet_invoice_type")
        private Object timesheetInvoiceType;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    


    public TimesheetsAnalysisReport() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public boolean getIsHasDepartmentManagerAccess() {
        return isHasDepartmentManagerAccess;
    }

    public Object getTimesheetRevenues() {
        return timesheetRevenues;
    }

    public ProjectTask getParentTaskIdAsObject() {
        return parentTaskIdAsObject;
    }

    public OdooId getParentTaskId() {
        return parentTaskId;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public ProjectMilestone getMilestoneIdAsObject() {
        return milestoneIdAsObject;
    }

    public OdooId getMilestoneId() {
        return milestoneId;
    }

    public ProjectTask getTaskIdAsObject() {
        return taskIdAsObject;
    }

    public OdooId getTaskId() {
        return taskId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public int getId() {
        return id;
    }

    public AccountMove getTimesheetInvoiceIdAsObject() {
        return timesheetInvoiceIdAsObject;
    }

    public OdooId getTimesheetInvoiceId() {
        return timesheetInvoiceId;
    }

    public Object getAmount() {
        return amount;
    }

    public Object getMargin() {
        return margin;
    }

    public double getBillableTime() {
        return billableTime;
    }

    public double getNonBillableTime() {
        return nonBillableTime;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public double getUnitAmount() {
        return unitAmount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getTimesheetInvoiceType() {
        return timesheetInvoiceType;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setIsHasDepartmentManagerAccess(boolean isHasDepartmentManagerAccess) {
        this.isHasDepartmentManagerAccess = isHasDepartmentManagerAccess;
    }

    public void setTimesheetRevenues(Object timesheetRevenues) {
        this.timesheetRevenues = timesheetRevenues;
    }

    public void setParentTaskIdAsObject(ProjectTask parentTaskIdAsObject) {
        this.parentTaskIdAsObject = parentTaskIdAsObject;
    }

    public void setParentTaskId(OdooId parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setMilestoneIdAsObject(ProjectMilestone milestoneIdAsObject) {
        this.milestoneIdAsObject = milestoneIdAsObject;
    }

    public void setMilestoneId(OdooId milestoneId) {
        this.milestoneId = milestoneId;
    }

    public void setTaskIdAsObject(ProjectTask taskIdAsObject) {
        this.taskIdAsObject = taskIdAsObject;
    }

    public void setTaskId(OdooId taskId) {
        this.taskId = taskId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimesheetInvoiceIdAsObject(AccountMove timesheetInvoiceIdAsObject) {
        this.timesheetInvoiceIdAsObject = timesheetInvoiceIdAsObject;
    }

    public void setTimesheetInvoiceId(OdooId timesheetInvoiceId) {
        this.timesheetInvoiceId = timesheetInvoiceId;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setMargin(Object margin) {
        this.margin = margin;
    }

    public void setBillableTime(double billableTime) {
        this.billableTime = billableTime;
    }

    public void setNonBillableTime(double nonBillableTime) {
        this.nonBillableTime = nonBillableTime;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setTimesheetInvoiceType(Object timesheetInvoiceType) {
        this.timesheetInvoiceType = timesheetInvoiceType;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}