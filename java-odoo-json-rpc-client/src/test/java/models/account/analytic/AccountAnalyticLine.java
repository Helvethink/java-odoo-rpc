
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

package ch.helvethink.odoo4java.models.account.analytic;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.AccountMove;
import ch.helvethink.odoo4java.models.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.models.project.Project;
import ch.helvethink.odoo4java.models.project.ProjectMilestone;
import ch.helvethink.odoo4java.models.project.ProjectTask;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.resource.calendar.ResourceCalendarLeaves;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.analytic.line")
public class AccountAnalyticLine implements OdooObj {

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("code")
        private String code;
    

    
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
    

    
        private ResourceCalendarLeaves globalLeaveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.calendar.ResourceCalendarLeaves")
        @OdooModel("resource.calendar.ResourceCalendarLeaves")
        @JsonProperty("global_leave_id")
        private OdooId globalLeaveId;
    

    
        private ProjectMilestone milestoneIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
        @JsonProperty("milestone_id")
        private OdooId milestoneId;
    

    
        @JsonProperty("readonly_timesheet")
        private boolean isReadonlyTimesheet;
    

    
        private ProjectTask taskIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("task_id")
        private OdooId taskId;
    

    
        @JsonProperty("ref")
        private String ref;
    

    
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
    

    
        @JsonProperty("allow_billable")
        private boolean isAllowBillable;
    

    
        private AccountMoveLine moveLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("move_line_id")
        private OdooId moveLineId;
    

    
        private ResPartner commercialPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("commercial_partner_id")
        private OdooId commercialPartnerId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("job_title")
        private String jobTitle;
    

    
        private AccountMove timesheetInvoiceIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("timesheet_invoice_id")
        private OdooId timesheetInvoiceId;
    

    
        @JsonProperty("sale_order_state")
        private Object saleOrderState;
    

    
        private AccountAnalyticAccount autoAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("auto_account_id")
        private OdooId autoAccountId;
    

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("amount")
        private Object amount;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        private Account generalAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("general_account_id")
        private OdooId generalAccountId;
    

    
        @JsonProperty("unit_amount")
        private double unitAmount;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("timesheet_invoice_type")
        private Object timesheetInvoiceType;
    

    
        private AccountAnalyticAccount accountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("account_id")
        private OdooId accountId;
    

    
        @JsonProperty("is_so_line_edited")
        private boolean isIsSoLineEdited;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("category")
        private Object category;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    


    public AccountAnalyticLine() {
    // Constructor
    }


    public Date getDate() {
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

    public String getCode() {
        return code;
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

    public ResourceCalendarLeaves getGlobalLeaveIdAsObject() {
        return globalLeaveIdAsObject;
    }

    public OdooId getGlobalLeaveId() {
        return globalLeaveId;
    }

    public ProjectMilestone getMilestoneIdAsObject() {
        return milestoneIdAsObject;
    }

    public OdooId getMilestoneId() {
        return milestoneId;
    }

    public boolean getIsReadonlyTimesheet() {
        return isReadonlyTimesheet;
    }

    public ProjectTask getTaskIdAsObject() {
        return taskIdAsObject;
    }

    public OdooId getTaskId() {
        return taskId;
    }

    public String getRef() {
        return ref;
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

    public boolean getIsAllowBillable() {
        return isAllowBillable;
    }

    public AccountMoveLine getMoveLineIdAsObject() {
        return moveLineIdAsObject;
    }

    public OdooId getMoveLineId() {
        return moveLineId;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public AccountMove getTimesheetInvoiceIdAsObject() {
        return timesheetInvoiceIdAsObject;
    }

    public OdooId getTimesheetInvoiceId() {
        return timesheetInvoiceId;
    }

    public Object getSaleOrderState() {
        return saleOrderState;
    }

    public AccountAnalyticAccount getAutoAccountIdAsObject() {
        return autoAccountIdAsObject;
    }

    public OdooId getAutoAccountId() {
        return autoAccountId;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public Object getAmount() {
        return amount;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Account getGeneralAccountIdAsObject() {
        return generalAccountIdAsObject;
    }

    public OdooId getGeneralAccountId() {
        return generalAccountId;
    }

    public double getUnitAmount() {
        return unitAmount;
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

    public Object getTimesheetInvoiceType() {
        return timesheetInvoiceType;
    }

    public AccountAnalyticAccount getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public boolean getIsIsSoLineEdited() {
        return isIsSoLineEdited;
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

    public Object getCategory() {
        return category;
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

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCode(String code) {
        this.code = code;
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

    public void setGlobalLeaveIdAsObject(ResourceCalendarLeaves globalLeaveIdAsObject) {
        this.globalLeaveIdAsObject = globalLeaveIdAsObject;
    }

    public void setGlobalLeaveId(OdooId globalLeaveId) {
        this.globalLeaveId = globalLeaveId;
    }

    public void setMilestoneIdAsObject(ProjectMilestone milestoneIdAsObject) {
        this.milestoneIdAsObject = milestoneIdAsObject;
    }

    public void setMilestoneId(OdooId milestoneId) {
        this.milestoneId = milestoneId;
    }

    public void setIsReadonlyTimesheet(boolean isReadonlyTimesheet) {
        this.isReadonlyTimesheet = isReadonlyTimesheet;
    }

    public void setTaskIdAsObject(ProjectTask taskIdAsObject) {
        this.taskIdAsObject = taskIdAsObject;
    }

    public void setTaskId(OdooId taskId) {
        this.taskId = taskId;
    }

    public void setRef(String ref) {
        this.ref = ref;
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

    public void setIsAllowBillable(boolean isAllowBillable) {
        this.isAllowBillable = isAllowBillable;
    }

    public void setMoveLineIdAsObject(AccountMoveLine moveLineIdAsObject) {
        this.moveLineIdAsObject = moveLineIdAsObject;
    }

    public void setMoveLineId(OdooId moveLineId) {
        this.moveLineId = moveLineId;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setTimesheetInvoiceIdAsObject(AccountMove timesheetInvoiceIdAsObject) {
        this.timesheetInvoiceIdAsObject = timesheetInvoiceIdAsObject;
    }

    public void setTimesheetInvoiceId(OdooId timesheetInvoiceId) {
        this.timesheetInvoiceId = timesheetInvoiceId;
    }

    public void setSaleOrderState(Object saleOrderState) {
        this.saleOrderState = saleOrderState;
    }

    public void setAutoAccountIdAsObject(AccountAnalyticAccount autoAccountIdAsObject) {
        this.autoAccountIdAsObject = autoAccountIdAsObject;
    }

    public void setAutoAccountId(OdooId autoAccountId) {
        this.autoAccountId = autoAccountId;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setGeneralAccountIdAsObject(Account generalAccountIdAsObject) {
        this.generalAccountIdAsObject = generalAccountIdAsObject;
    }

    public void setGeneralAccountId(OdooId generalAccountId) {
        this.generalAccountId = generalAccountId;
    }

    public void setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
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

    public void setTimesheetInvoiceType(Object timesheetInvoiceType) {
        this.timesheetInvoiceType = timesheetInvoiceType;
    }

    public void setAccountIdAsObject(AccountAnalyticAccount accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setIsIsSoLineEdited(boolean isIsSoLineEdited) {
        this.isIsSoLineEdited = isIsSoLineEdited;
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

    public void setCategory(Object category) {
        this.category = category;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}