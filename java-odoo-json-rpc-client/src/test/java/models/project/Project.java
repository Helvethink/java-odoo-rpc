
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

package ch.helvethink.odoo4java.models.project;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.models.project.project.ProjectProjectStage;
import ch.helvethink.odoo4java.models.project.sale.line.employee.ProjectSaleLineEmployeeMap;
import ch.helvethink.odoo4java.models.project.task.ProjectTaskType;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.resource.ResourceCalendar;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("project.project")
public class Project implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("alias_contact")
        private Object aliasContact;
    

    
        @JsonProperty("total_timesheet_time")
        private int totalTimesheetTime;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("allow_milestones")
        private boolean isAllowMilestones;
    

    
        @JsonProperty("alias_parent_thread_id")
        private int aliasParentThreadId;
    

    
        @JsonProperty("allow_billable")
        private boolean isAllowBillable;
    

    
        @JsonProperty("id")
        private int id;
    

    
        private List<ResUsers> favoriteUserIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("favorite_user_ids")
        private List<Integer> favoriteUserIds;
    

    
        private List<ProjectTask> tasksAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("tasks")
        private List<Integer> tasks;
    

    
        @JsonProperty("sale_order_state")
        private Object saleOrderState;
    

    
        private AccountAnalyticAccount autoAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("auto_account_id")
        private OdooId autoAccountId;
    

    
        private List<AccountAnalyticLine> timesheetIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
        @JsonProperty("timesheet_ids")
        private List<Integer> timesheetIds;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        private List<ProjectTags> tagIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTags")
        @OdooModel("project.ProjectTags")
        @JsonProperty("tag_ids")
        private List<Integer> tagIds;
    

    
        private List<ProjectUpdate> updateIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectUpdate")
        @OdooModel("project.ProjectUpdate")
        @JsonProperty("update_ids")
        private List<Integer> updateIds;
    

    
        private ProjectProjectStage stageIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.project.ProjectProjectStage")
        @OdooModel("project.project.ProjectProjectStage")
        @JsonProperty("stage_id")
        private OdooId stageId;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("privacy_visibility_warning")
        private String privacyVisibilityWarning;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("display_sales_stat_buttons")
        private boolean isDisplaySalesStatButtons;
    

    
        @JsonProperty("access_token")
        private String accessToken;
    

    
        @JsonProperty("access_warning")
        private Object accessWarning;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("rating_status_period")
        private Object ratingStatusPeriod;
    

    
        @JsonProperty("last_update_status")
        private Object lastUpdateStatus;
    

    
        @JsonProperty("access_instruction_message")
        private String accessInstructionMessage;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        @JsonProperty("allow_task_dependencies")
        private boolean isAllowTaskDependencies;
    

    
        @JsonProperty("is_project_overtime")
        private boolean isIsProjectOvertime;
    

    
        private List<ProjectMilestone> milestoneIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
        @JsonProperty("milestone_ids")
        private List<Integer> milestoneIds;
    

    
        @JsonProperty("billing_type")
        private Object billingType;
    

    
        private ResourceCalendar resourceCalendarIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
        @JsonProperty("resource_calendar_id")
        private OdooId resourceCalendarId;
    

    
        @JsonProperty("rating_request_deadline")
        private Date ratingRequestDeadline;
    

    
        private ProjectUpdate lastUpdateIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectUpdate")
        @OdooModel("project.ProjectUpdate")
        @JsonProperty("last_update_id")
        private OdooId lastUpdateId;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("analytic_account_balance")
        private Object analyticAccountBalance;
    

    
        @JsonProperty("update_count")
        private int updateCount;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("collaborator_count")
        private int collaboratorCount;
    

    
        @JsonProperty("last_update_color")
        private int lastUpdateColor;
    

    
        @JsonProperty("allow_timesheets")
        private boolean isAllowTimesheets;
    

    
        private List<ProjectTask> taskIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("task_ids")
        private List<Integer> taskIds;
    

    
        @JsonProperty("task_properties_definition")
        private Object taskPropertiesDefinition;
    

    
        @JsonProperty("warning_employee_rate")
        private boolean isWarningEmployeeRate;
    

    
        @JsonProperty("rating_avg_percentage")
        private double ratingAvgPercentage;
    

    
        private AccountAnalyticAccount accountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("account_id")
        private OdooId accountId;
    

    
        @JsonProperty("rating_percentage_satisfaction")
        private int ratingPercentageSatisfaction;
    

    
        @JsonProperty("rating_status")
        private Object ratingStatus;
    

    
        @JsonProperty("sale_order_count")
        private int saleOrderCount;
    

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("open_task_count")
        private int openTaskCount;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        private List<ProjectTaskType> typeIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
        @JsonProperty("type_ids")
        private List<Integer> typeIds;
    

    
        @JsonProperty("privacy_visibility")
        private Object privacyVisibility;
    

    
        @JsonProperty("alias_bounced_content")
        private Object aliasBouncedContent;
    

    
        @JsonProperty("allocated_hours")
        private double allocatedHours;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("task_count")
        private int taskCount;
    

    
        @JsonProperty("task_completion_percentage")
        private double taskCompletionPercentage;
    

    
        private List<ProjectSaleLineEmployeeMap> saleLineEmployeeIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.sale.line.employee.ProjectSaleLineEmployeeMap")
        @OdooModel("project.sale.line.employee.ProjectSaleLineEmployeeMap")
        @JsonProperty("sale_line_employee_ids")
        private List<Integer> saleLineEmployeeIds;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("rating_avg")
        private double ratingAvg;
    

    
        @JsonProperty("alias_incoming_local")
        private boolean isAliasIncomingLocal;
    

    
        @JsonProperty("analytic_account_active")
        private boolean isAnalyticAccountActive;
    

    
        @JsonProperty("purchase_orders_count")
        private int purchaseOrdersCount;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("label_tasks")
        private String labelTasks;
    

    
        @JsonProperty("sale_order_line_count")
        private int saleOrderLineCount;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("encode_uom_in_days")
        private boolean isEncodeUomInDays;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        @JsonProperty("remaining_hours")
        private double remainingHours;
    

    
        @JsonProperty("rating_count")
        private int ratingCount;
    

    
        @JsonProperty("pricing_type")
        private Object pricingType;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("date_start")
        private Date dateStart;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("alias_email")
        private String aliasEmail;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("is_favorite")
        private boolean isIsFavorite;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("closed_task_count")
        private int closedTaskCount;
    

    
        @JsonProperty("description")
        private Object description;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("alias_full_name")
        private String aliasFullName;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("duration_tracking")
        private Object durationTracking;
    

    
        @JsonProperty("effective_hours")
        private double effectiveHours;
    

    
        @JsonProperty("is_milestone_exceeded")
        private boolean isIsMilestoneExceeded;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("rating_active")
        private boolean isRatingActive;
    

    
        @JsonProperty("access_url")
        private String accessUrl;
    

    
        @JsonProperty("alias_name")
        private String aliasName;
    

    
        private List<ProjectCollaborator> collaboratorIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectCollaborator")
        @OdooModel("project.ProjectCollaborator")
        @JsonProperty("collaborator_ids")
        private List<Integer> collaboratorIds;
    

    
        @JsonProperty("alias_domain")
        private String aliasDomain;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("alias_force_thread_id")
        private int aliasForceThreadId;
    

    
        @JsonProperty("has_any_so_with_nothing_to_invoice")
        private boolean isHasAnySoWithNothingToInvoice;
    

    
        @JsonProperty("alias_status")
        private Object aliasStatus;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("has_any_so_to_invoice")
        private boolean isHasAnySoToInvoice;
    

    
        @JsonProperty("alias_defaults")
        private Object aliasDefaults;
    

    
        @JsonProperty("is_internal_project")
        private boolean isIsInternalProject;
    


    public Project() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getAliasContact() {
        return aliasContact;
    }

    public int getTotalTimesheetTime() {
        return totalTimesheetTime;
    }

    public Object getActivityState() {
        return activityState;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsAllowMilestones() {
        return isAllowMilestones;
    }

    public int getAliasParentThreadId() {
        return aliasParentThreadId;
    }

    public boolean getIsAllowBillable() {
        return isAllowBillable;
    }

    public int getId() {
        return id;
    }

    public List<ResUsers> getFavoriteUserIdsAsList() {
        return favoriteUserIdsAsList;
    }

    public List<Integer> getFavoriteUserIds() {
        return favoriteUserIds;
    }

    public List<ProjectTask> getTasksAsList() {
        return tasksAsList;
    }

    public List<Integer> getTasks() {
        return tasks;
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

    public List<AccountAnalyticLine> getTimesheetIdsAsList() {
        return timesheetIdsAsList;
    }

    public List<Integer> getTimesheetIds() {
        return timesheetIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<ProjectTags> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public List<ProjectUpdate> getUpdateIdsAsList() {
        return updateIdsAsList;
    }

    public List<Integer> getUpdateIds() {
        return updateIds;
    }

    public ProjectProjectStage getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getPrivacyVisibilityWarning() {
        return privacyVisibilityWarning;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public boolean getIsDisplaySalesStatButtons() {
        return isDisplaySalesStatButtons;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Object getAccessWarning() {
        return accessWarning;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Object getRatingStatusPeriod() {
        return ratingStatusPeriod;
    }

    public Object getLastUpdateStatus() {
        return lastUpdateStatus;
    }

    public String getAccessInstructionMessage() {
        return accessInstructionMessage;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public boolean getIsAllowTaskDependencies() {
        return isAllowTaskDependencies;
    }

    public boolean getIsIsProjectOvertime() {
        return isIsProjectOvertime;
    }

    public List<ProjectMilestone> getMilestoneIdsAsList() {
        return milestoneIdsAsList;
    }

    public List<Integer> getMilestoneIds() {
        return milestoneIds;
    }

    public Object getBillingType() {
        return billingType;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public Date getRatingRequestDeadline() {
        return ratingRequestDeadline;
    }

    public ProjectUpdate getLastUpdateIdAsObject() {
        return lastUpdateIdAsObject;
    }

    public OdooId getLastUpdateId() {
        return lastUpdateId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getAnalyticAccountBalance() {
        return analyticAccountBalance;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public int getCollaboratorCount() {
        return collaboratorCount;
    }

    public int getLastUpdateColor() {
        return lastUpdateColor;
    }

    public boolean getIsAllowTimesheets() {
        return isAllowTimesheets;
    }

    public List<ProjectTask> getTaskIdsAsList() {
        return taskIdsAsList;
    }

    public List<Integer> getTaskIds() {
        return taskIds;
    }

    public Object getTaskPropertiesDefinition() {
        return taskPropertiesDefinition;
    }

    public boolean getIsWarningEmployeeRate() {
        return isWarningEmployeeRate;
    }

    public double getRatingAvgPercentage() {
        return ratingAvgPercentage;
    }

    public AccountAnalyticAccount getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public int getRatingPercentageSatisfaction() {
        return ratingPercentageSatisfaction;
    }

    public Object getRatingStatus() {
        return ratingStatus;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public Date getDate() {
        return date;
    }

    public int getOpenTaskCount() {
        return openTaskCount;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public List<ProjectTaskType> getTypeIdsAsList() {
        return typeIdsAsList;
    }

    public List<Integer> getTypeIds() {
        return typeIds;
    }

    public Object getPrivacyVisibility() {
        return privacyVisibility;
    }

    public Object getAliasBouncedContent() {
        return aliasBouncedContent;
    }

    public double getAllocatedHours() {
        return allocatedHours;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public double getTaskCompletionPercentage() {
        return taskCompletionPercentage;
    }

    public List<ProjectSaleLineEmployeeMap> getSaleLineEmployeeIdsAsList() {
        return saleLineEmployeeIdsAsList;
    }

    public List<Integer> getSaleLineEmployeeIds() {
        return saleLineEmployeeIds;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public double getRatingAvg() {
        return ratingAvg;
    }

    public boolean getIsAliasIncomingLocal() {
        return isAliasIncomingLocal;
    }

    public boolean getIsAnalyticAccountActive() {
        return isAnalyticAccountActive;
    }

    public int getPurchaseOrdersCount() {
        return purchaseOrdersCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getLabelTasks() {
        return labelTasks;
    }

    public int getSaleOrderLineCount() {
        return saleOrderLineCount;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public boolean getIsEncodeUomInDays() {
        return isEncodeUomInDays;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getRemainingHours() {
        return remainingHours;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public Object getPricingType() {
        return pricingType;
    }

    public int getSequence() {
        return sequence;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public String getName() {
        return name;
    }

    public String getAliasEmail() {
        return aliasEmail;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsIsFavorite() {
        return isIsFavorite;
    }

    public int getColor() {
        return color;
    }

    public int getClosedTaskCount() {
        return closedTaskCount;
    }

    public Object getDescription() {
        return description;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public String getAliasFullName() {
        return aliasFullName;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Object getDurationTracking() {
        return durationTracking;
    }

    public double getEffectiveHours() {
        return effectiveHours;
    }

    public boolean getIsIsMilestoneExceeded() {
        return isIsMilestoneExceeded;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public boolean getIsRatingActive() {
        return isRatingActive;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public String getAliasName() {
        return aliasName;
    }

    public List<ProjectCollaborator> getCollaboratorIdsAsList() {
        return collaboratorIdsAsList;
    }

    public List<Integer> getCollaboratorIds() {
        return collaboratorIds;
    }

    public String getAliasDomain() {
        return aliasDomain;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public int getAliasForceThreadId() {
        return aliasForceThreadId;
    }

    public boolean getIsHasAnySoWithNothingToInvoice() {
        return isHasAnySoWithNothingToInvoice;
    }

    public Object getAliasStatus() {
        return aliasStatus;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public boolean getIsHasAnySoToInvoice() {
        return isHasAnySoToInvoice;
    }

    public Object getAliasDefaults() {
        return aliasDefaults;
    }

    public boolean getIsIsInternalProject() {
        return isIsInternalProject;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setAliasContact(Object aliasContact) {
        this.aliasContact = aliasContact;
    }

    public void setTotalTimesheetTime(int totalTimesheetTime) {
        this.totalTimesheetTime = totalTimesheetTime;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsAllowMilestones(boolean isAllowMilestones) {
        this.isAllowMilestones = isAllowMilestones;
    }

    public void setAliasParentThreadId(int aliasParentThreadId) {
        this.aliasParentThreadId = aliasParentThreadId;
    }

    public void setIsAllowBillable(boolean isAllowBillable) {
        this.isAllowBillable = isAllowBillable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFavoriteUserIdsAsList(List<ResUsers> favoriteUserIdsAsList) {
        this.favoriteUserIdsAsList = favoriteUserIdsAsList;
    }

    public void setFavoriteUserIds(List<Integer> favoriteUserIds) {
        this.favoriteUserIds = favoriteUserIds;
    }

    public void setTasksAsList(List<ProjectTask> tasksAsList) {
        this.tasksAsList = tasksAsList;
    }

    public void setTasks(List<Integer> tasks) {
        this.tasks = tasks;
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

    public void setTimesheetIdsAsList(List<AccountAnalyticLine> timesheetIdsAsList) {
        this.timesheetIdsAsList = timesheetIdsAsList;
    }

    public void setTimesheetIds(List<Integer> timesheetIds) {
        this.timesheetIds = timesheetIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTagIdsAsList(List<ProjectTags> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setUpdateIdsAsList(List<ProjectUpdate> updateIdsAsList) {
        this.updateIdsAsList = updateIdsAsList;
    }

    public void setUpdateIds(List<Integer> updateIds) {
        this.updateIds = updateIds;
    }

    public void setStageIdAsObject(ProjectProjectStage stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setPrivacyVisibilityWarning(String privacyVisibilityWarning) {
        this.privacyVisibilityWarning = privacyVisibilityWarning;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setIsDisplaySalesStatButtons(boolean isDisplaySalesStatButtons) {
        this.isDisplaySalesStatButtons = isDisplaySalesStatButtons;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setAccessWarning(Object accessWarning) {
        this.accessWarning = accessWarning;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setRatingStatusPeriod(Object ratingStatusPeriod) {
        this.ratingStatusPeriod = ratingStatusPeriod;
    }

    public void setLastUpdateStatus(Object lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    public void setAccessInstructionMessage(String accessInstructionMessage) {
        this.accessInstructionMessage = accessInstructionMessage;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setIsAllowTaskDependencies(boolean isAllowTaskDependencies) {
        this.isAllowTaskDependencies = isAllowTaskDependencies;
    }

    public void setIsIsProjectOvertime(boolean isIsProjectOvertime) {
        this.isIsProjectOvertime = isIsProjectOvertime;
    }

    public void setMilestoneIdsAsList(List<ProjectMilestone> milestoneIdsAsList) {
        this.milestoneIdsAsList = milestoneIdsAsList;
    }

    public void setMilestoneIds(List<Integer> milestoneIds) {
        this.milestoneIds = milestoneIds;
    }

    public void setBillingType(Object billingType) {
        this.billingType = billingType;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setRatingRequestDeadline(Date ratingRequestDeadline) {
        this.ratingRequestDeadline = ratingRequestDeadline;
    }

    public void setLastUpdateIdAsObject(ProjectUpdate lastUpdateIdAsObject) {
        this.lastUpdateIdAsObject = lastUpdateIdAsObject;
    }

    public void setLastUpdateId(OdooId lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setAnalyticAccountBalance(Object analyticAccountBalance) {
        this.analyticAccountBalance = analyticAccountBalance;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setCollaboratorCount(int collaboratorCount) {
        this.collaboratorCount = collaboratorCount;
    }

    public void setLastUpdateColor(int lastUpdateColor) {
        this.lastUpdateColor = lastUpdateColor;
    }

    public void setIsAllowTimesheets(boolean isAllowTimesheets) {
        this.isAllowTimesheets = isAllowTimesheets;
    }

    public void setTaskIdsAsList(List<ProjectTask> taskIdsAsList) {
        this.taskIdsAsList = taskIdsAsList;
    }

    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
    }

    public void setTaskPropertiesDefinition(Object taskPropertiesDefinition) {
        this.taskPropertiesDefinition = taskPropertiesDefinition;
    }

    public void setIsWarningEmployeeRate(boolean isWarningEmployeeRate) {
        this.isWarningEmployeeRate = isWarningEmployeeRate;
    }

    public void setRatingAvgPercentage(double ratingAvgPercentage) {
        this.ratingAvgPercentage = ratingAvgPercentage;
    }

    public void setAccountIdAsObject(AccountAnalyticAccount accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setRatingPercentageSatisfaction(int ratingPercentageSatisfaction) {
        this.ratingPercentageSatisfaction = ratingPercentageSatisfaction;
    }

    public void setRatingStatus(Object ratingStatus) {
        this.ratingStatus = ratingStatus;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOpenTaskCount(int openTaskCount) {
        this.openTaskCount = openTaskCount;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setTypeIdsAsList(List<ProjectTaskType> typeIdsAsList) {
        this.typeIdsAsList = typeIdsAsList;
    }

    public void setTypeIds(List<Integer> typeIds) {
        this.typeIds = typeIds;
    }

    public void setPrivacyVisibility(Object privacyVisibility) {
        this.privacyVisibility = privacyVisibility;
    }

    public void setAliasBouncedContent(Object aliasBouncedContent) {
        this.aliasBouncedContent = aliasBouncedContent;
    }

    public void setAllocatedHours(double allocatedHours) {
        this.allocatedHours = allocatedHours;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public void setTaskCompletionPercentage(double taskCompletionPercentage) {
        this.taskCompletionPercentage = taskCompletionPercentage;
    }

    public void setSaleLineEmployeeIdsAsList(List<ProjectSaleLineEmployeeMap> saleLineEmployeeIdsAsList) {
        this.saleLineEmployeeIdsAsList = saleLineEmployeeIdsAsList;
    }

    public void setSaleLineEmployeeIds(List<Integer> saleLineEmployeeIds) {
        this.saleLineEmployeeIds = saleLineEmployeeIds;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setRatingAvg(double ratingAvg) {
        this.ratingAvg = ratingAvg;
    }

    public void setIsAliasIncomingLocal(boolean isAliasIncomingLocal) {
        this.isAliasIncomingLocal = isAliasIncomingLocal;
    }

    public void setIsAnalyticAccountActive(boolean isAnalyticAccountActive) {
        this.isAnalyticAccountActive = isAnalyticAccountActive;
    }

    public void setPurchaseOrdersCount(int purchaseOrdersCount) {
        this.purchaseOrdersCount = purchaseOrdersCount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLabelTasks(String labelTasks) {
        this.labelTasks = labelTasks;
    }

    public void setSaleOrderLineCount(int saleOrderLineCount) {
        this.saleOrderLineCount = saleOrderLineCount;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setIsEncodeUomInDays(boolean isEncodeUomInDays) {
        this.isEncodeUomInDays = isEncodeUomInDays;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setRemainingHours(double remainingHours) {
        this.remainingHours = remainingHours;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public void setPricingType(Object pricingType) {
        this.pricingType = pricingType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsIsFavorite(boolean isIsFavorite) {
        this.isIsFavorite = isIsFavorite;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setClosedTaskCount(int closedTaskCount) {
        this.closedTaskCount = closedTaskCount;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setAliasFullName(String aliasFullName) {
        this.aliasFullName = aliasFullName;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setDurationTracking(Object durationTracking) {
        this.durationTracking = durationTracking;
    }

    public void setEffectiveHours(double effectiveHours) {
        this.effectiveHours = effectiveHours;
    }

    public void setIsIsMilestoneExceeded(boolean isIsMilestoneExceeded) {
        this.isIsMilestoneExceeded = isIsMilestoneExceeded;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setIsRatingActive(boolean isRatingActive) {
        this.isRatingActive = isRatingActive;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setCollaboratorIdsAsList(List<ProjectCollaborator> collaboratorIdsAsList) {
        this.collaboratorIdsAsList = collaboratorIdsAsList;
    }

    public void setCollaboratorIds(List<Integer> collaboratorIds) {
        this.collaboratorIds = collaboratorIds;
    }

    public void setAliasDomain(String aliasDomain) {
        this.aliasDomain = aliasDomain;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setAliasForceThreadId(int aliasForceThreadId) {
        this.aliasForceThreadId = aliasForceThreadId;
    }

    public void setIsHasAnySoWithNothingToInvoice(boolean isHasAnySoWithNothingToInvoice) {
        this.isHasAnySoWithNothingToInvoice = isHasAnySoWithNothingToInvoice;
    }

    public void setAliasStatus(Object aliasStatus) {
        this.aliasStatus = aliasStatus;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setIsHasAnySoToInvoice(boolean isHasAnySoToInvoice) {
        this.isHasAnySoToInvoice = isHasAnySoToInvoice;
    }

    public void setAliasDefaults(Object aliasDefaults) {
        this.aliasDefaults = aliasDefaults;
    }

    public void setIsIsInternalProject(boolean isIsInternalProject) {
        this.isIsInternalProject = isIsInternalProject;
    }



}