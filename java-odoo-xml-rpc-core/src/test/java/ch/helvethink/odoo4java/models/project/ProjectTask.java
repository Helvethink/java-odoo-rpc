
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
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.models.project.task.ProjectTaskRecurrence;
import ch.helvethink.odoo4java.models.project.task.ProjectTaskType;
import ch.helvethink.odoo4java.models.project.task.stage.ProjectTaskStagePersonal;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("project.task")
public class ProjectTask implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("html_field_history_metadata")
        private Object htmlFieldHistoryMetadata;
    

    
        @JsonProperty("closed_depend_on_count")
        private int closedDependOnCount;
    

    
        @JsonProperty("closed_subtask_count")
        private int closedSubtaskCount;
    

    
        @JsonProperty("display_follow_button")
        private boolean isDisplayFollowButton;
    

    
        @JsonProperty("rating_avg_text")
        private Object ratingAvgText;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("task_properties")
        private Object taskProperties;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("allow_milestones")
        private boolean isAllowMilestones;
    

    
        @JsonProperty("working_hours_open")
        private double workingHoursOpen;
    

    
        @JsonProperty("allow_billable")
        private boolean isAllowBillable;
    

    
        @JsonProperty("repeat_interval")
        private int repeatInterval;
    

    
        @JsonProperty("state")
        private Object state;
    

    
        @JsonProperty("link_preview_name")
        private String linkPreviewName;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("sale_order_state")
        private Object saleOrderState;
    

    
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
    

    
        @JsonProperty("date_assign")
        private Date dateAssign;
    

    
        @JsonProperty("working_days_open")
        private double workingDaysOpen;
    

    
        private ProjectTaskType stageIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
        @JsonProperty("stage_id")
        private OdooId stageId;
    

    
        private ProjectTaskStagePersonal personalStageIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.task.stage.ProjectTaskStagePersonal")
        @OdooModel("project.task.stage.ProjectTaskStagePersonal")
        @JsonProperty("personal_stage_id")
        private OdooId personalStageId;
    

    
        @JsonProperty("working_days_close")
        private double workingDaysClose;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("date_end")
        private Date dateEnd;
    

    
        @JsonProperty("priority")
        private Object priority;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("access_token")
        private String accessToken;
    

    
        @JsonProperty("access_warning")
        private Object accessWarning;
    

    
        private List<ProjectTask> dependOnIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("depend_on_ids")
        private List<Integer> dependOnIds;
    

    
        @JsonProperty("rating_last_image")
        private Object ratingLastImage;
    

    
        @JsonProperty("overtime")
        private double overtime;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        @JsonProperty("subtask_completion_percentage")
        private double subtaskCompletionPercentage;
    

    
        @JsonProperty("allow_task_dependencies")
        private boolean isAllowTaskDependencies;
    

    
        @JsonProperty("date_deadline")
        private Date dateDeadline;
    

    
        private List<ProjectTask> childIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("child_ids")
        private List<Integer> childIds;
    

    
        @JsonProperty("show_display_in_project")
        private boolean isShowDisplayInProject;
    

    
        private ProjectTaskType personalStageTypeIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
        @JsonProperty("personal_stage_type_id")
        private OdooId personalStageTypeId;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        private List<ResUsers> userIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_ids")
        private List<Integer> userIds;
    

    
        @JsonProperty("repeat_type")
        private Object repeatType;
    

    
        @JsonProperty("repeat_until")
        private Date repeatUntil;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("allow_timesheets")
        private boolean isAllowTimesheets;
    

    
        @JsonProperty("depend_on_count")
        private int dependOnCount;
    

    
        @JsonProperty("date_last_stage_update")
        private Date dateLastStageUpdate;
    

    
        @JsonProperty("rating_percentage_satisfaction")
        private double ratingPercentageSatisfaction;
    

    
        @JsonProperty("rating_last_value")
        private double ratingLastValue;
    

    
        @JsonProperty("progress")
        private double progress;
    

    
        @JsonProperty("display_in_project")
        private boolean isDisplayInProject;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("subtask_allocated_hours")
        private double subtaskAllocatedHours;
    

    
        @JsonProperty("dependent_tasks_count")
        private int dependentTasksCount;
    

    
        @JsonProperty("allocated_hours")
        private double allocatedHours;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("is_project_map_empty")
        private boolean isIsProjectMapEmpty;
    

    
        @JsonProperty("repeat_unit")
        private Object repeatUnit;
    

    
        @JsonProperty("current_user_same_company_partner")
        private boolean isCurrentUserSameCompanyPartner;
    

    
        private Project projectIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("project_id")
        private OdooId projectId;
    

    
        @JsonProperty("remaining_hours_available")
        private boolean isRemainingHoursAvailable;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("rating_avg")
        private double ratingAvg;
    

    
        @JsonProperty("display_parent_task_button")
        private boolean isDisplayParentTaskButton;
    

    
        @JsonProperty("analytic_account_active")
        private boolean isAnalyticAccountActive;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("is_closed")
        private boolean isIsClosed;
    

    
        private List<ProjectTaskType> personalStageTypeIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
        @JsonProperty("personal_stage_type_ids")
        private List<Integer> personalStageTypeIds;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("encode_uom_in_days")
        private boolean isEncodeUomInDays;
    

    
        @JsonProperty("task_to_invoice")
        private boolean isTaskToInvoice;
    

    
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
    

    
        @JsonProperty("html_field_history")
        private Object htmlFieldHistory;
    

    
        private ProjectTask parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("remaining_hours_so")
        private double remainingHoursSo;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("portal_user_names")
        private String portalUserNames;
    

    
        @JsonProperty("is_timeoff_task")
        private boolean isIsTimeoffTask;
    

    
        @JsonProperty("has_multi_sol")
        private boolean isHasMultiSol;
    

    
        private List<ProjectTask> dependentIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("dependent_ids")
        private List<Integer> dependentIds;
    

    
        @JsonProperty("email_cc")
        private String emailCc;
    

    
        @JsonProperty("leave_types_count")
        private int leaveTypesCount;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("display_sale_order_button")
        private boolean isDisplaySaleOrderButton;
    

    
        @JsonProperty("working_hours_close")
        private double workingHoursClose;
    

    
        private ProjectMilestone milestoneIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
        @JsonProperty("milestone_id")
        private OdooId milestoneId;
    

    
        @JsonProperty("description")
        private Object description;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("subtask_effective_hours")
        private double subtaskEffectiveHours;
    

    
        @JsonProperty("rating_last_feedback")
        private Object ratingLastFeedback;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("duration_tracking")
        private Object durationTracking;
    

    
        private ProjectTaskRecurrence recurrenceIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.task.ProjectTaskRecurrence")
        @OdooModel("project.task.ProjectTaskRecurrence")
        @JsonProperty("recurrence_id")
        private OdooId recurrenceId;
    

    
        @JsonProperty("effective_hours")
        private double effectiveHours;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("rating_active")
        private boolean isRatingActive;
    

    
        @JsonProperty("has_late_and_unreached_milestone")
        private boolean isHasLateAndUnreachedMilestone;
    

    
        @JsonProperty("subtask_count")
        private int subtaskCount;
    

    
        @JsonProperty("access_url")
        private String accessUrl;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("remaining_hours_percentage")
        private double remainingHoursPercentage;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("project_privacy_visibility")
        private Object projectPrivacyVisibility;
    

    
        @JsonProperty("rating_last_text")
        private Object ratingLastText;
    

    
        @JsonProperty("recurring_count")
        private int recurringCount;
    

    
        @JsonProperty("total_hours_spent")
        private double totalHoursSpent;
    

    
        @JsonProperty("recurring_task")
        private boolean isRecurringTask;
    


    public ProjectTask() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getHtmlFieldHistoryMetadata() {
        return htmlFieldHistoryMetadata;
    }

    public int getClosedDependOnCount() {
        return closedDependOnCount;
    }

    public int getClosedSubtaskCount() {
        return closedSubtaskCount;
    }

    public boolean getIsDisplayFollowButton() {
        return isDisplayFollowButton;
    }

    public Object getRatingAvgText() {
        return ratingAvgText;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public Object getTaskProperties() {
        return taskProperties;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsAllowMilestones() {
        return isAllowMilestones;
    }

    public double getWorkingHoursOpen() {
        return workingHoursOpen;
    }

    public boolean getIsAllowBillable() {
        return isAllowBillable;
    }

    public int getRepeatInterval() {
        return repeatInterval;
    }

    public Object getState() {
        return state;
    }

    public String getLinkPreviewName() {
        return linkPreviewName;
    }

    public int getId() {
        return id;
    }

    public Object getSaleOrderState() {
        return saleOrderState;
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

    public Date getDateAssign() {
        return dateAssign;
    }

    public double getWorkingDaysOpen() {
        return workingDaysOpen;
    }

    public ProjectTaskType getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public ProjectTaskStagePersonal getPersonalStageIdAsObject() {
        return personalStageIdAsObject;
    }

    public OdooId getPersonalStageId() {
        return personalStageId;
    }

    public double getWorkingDaysClose() {
        return workingDaysClose;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public Object getPriority() {
        return priority;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Object getAccessWarning() {
        return accessWarning;
    }

    public List<ProjectTask> getDependOnIdsAsList() {
        return dependOnIdsAsList;
    }

    public List<Integer> getDependOnIds() {
        return dependOnIds;
    }

    public Object getRatingLastImage() {
        return ratingLastImage;
    }

    public double getOvertime() {
        return overtime;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public double getSubtaskCompletionPercentage() {
        return subtaskCompletionPercentage;
    }

    public boolean getIsAllowTaskDependencies() {
        return isAllowTaskDependencies;
    }

    public Date getDateDeadline() {
        return dateDeadline;
    }

    public List<ProjectTask> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public boolean getIsShowDisplayInProject() {
        return isShowDisplayInProject;
    }

    public ProjectTaskType getPersonalStageTypeIdAsObject() {
        return personalStageTypeIdAsObject;
    }

    public OdooId getPersonalStageTypeId() {
        return personalStageTypeId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public Object getRepeatType() {
        return repeatType;
    }

    public Date getRepeatUntil() {
        return repeatUntil;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsAllowTimesheets() {
        return isAllowTimesheets;
    }

    public int getDependOnCount() {
        return dependOnCount;
    }

    public Date getDateLastStageUpdate() {
        return dateLastStageUpdate;
    }

    public double getRatingPercentageSatisfaction() {
        return ratingPercentageSatisfaction;
    }

    public double getRatingLastValue() {
        return ratingLastValue;
    }

    public double getProgress() {
        return progress;
    }

    public boolean getIsDisplayInProject() {
        return isDisplayInProject;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public double getSubtaskAllocatedHours() {
        return subtaskAllocatedHours;
    }

    public int getDependentTasksCount() {
        return dependentTasksCount;
    }

    public double getAllocatedHours() {
        return allocatedHours;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public boolean getIsIsProjectMapEmpty() {
        return isIsProjectMapEmpty;
    }

    public Object getRepeatUnit() {
        return repeatUnit;
    }

    public boolean getIsCurrentUserSameCompanyPartner() {
        return isCurrentUserSameCompanyPartner;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public boolean getIsRemainingHoursAvailable() {
        return isRemainingHoursAvailable;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public double getRatingAvg() {
        return ratingAvg;
    }

    public boolean getIsDisplayParentTaskButton() {
        return isDisplayParentTaskButton;
    }

    public boolean getIsAnalyticAccountActive() {
        return isAnalyticAccountActive;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsIsClosed() {
        return isIsClosed;
    }

    public List<ProjectTaskType> getPersonalStageTypeIdsAsList() {
        return personalStageTypeIdsAsList;
    }

    public List<Integer> getPersonalStageTypeIds() {
        return personalStageTypeIds;
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

    public boolean getIsTaskToInvoice() {
        return isTaskToInvoice;
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

    public Object getHtmlFieldHistory() {
        return htmlFieldHistory;
    }

    public ProjectTask getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public double getRemainingHoursSo() {
        return remainingHoursSo;
    }

    public String getName() {
        return name;
    }

    public String getPortalUserNames() {
        return portalUserNames;
    }

    public boolean getIsIsTimeoffTask() {
        return isIsTimeoffTask;
    }

    public boolean getIsHasMultiSol() {
        return isHasMultiSol;
    }

    public List<ProjectTask> getDependentIdsAsList() {
        return dependentIdsAsList;
    }

    public List<Integer> getDependentIds() {
        return dependentIds;
    }

    public String getEmailCc() {
        return emailCc;
    }

    public int getLeaveTypesCount() {
        return leaveTypesCount;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public int getColor() {
        return color;
    }

    public boolean getIsDisplaySaleOrderButton() {
        return isDisplaySaleOrderButton;
    }

    public double getWorkingHoursClose() {
        return workingHoursClose;
    }

    public ProjectMilestone getMilestoneIdAsObject() {
        return milestoneIdAsObject;
    }

    public OdooId getMilestoneId() {
        return milestoneId;
    }

    public Object getDescription() {
        return description;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public double getSubtaskEffectiveHours() {
        return subtaskEffectiveHours;
    }

    public Object getRatingLastFeedback() {
        return ratingLastFeedback;
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

    public ProjectTaskRecurrence getRecurrenceIdAsObject() {
        return recurrenceIdAsObject;
    }

    public OdooId getRecurrenceId() {
        return recurrenceId;
    }

    public double getEffectiveHours() {
        return effectiveHours;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public boolean getIsRatingActive() {
        return isRatingActive;
    }

    public boolean getIsHasLateAndUnreachedMilestone() {
        return isHasLateAndUnreachedMilestone;
    }

    public int getSubtaskCount() {
        return subtaskCount;
    }

    public String getAccessUrl() {
        return accessUrl;
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

    public double getRemainingHoursPercentage() {
        return remainingHoursPercentage;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public Object getProjectPrivacyVisibility() {
        return projectPrivacyVisibility;
    }

    public Object getRatingLastText() {
        return ratingLastText;
    }

    public int getRecurringCount() {
        return recurringCount;
    }

    public double getTotalHoursSpent() {
        return totalHoursSpent;
    }

    public boolean getIsRecurringTask() {
        return isRecurringTask;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setHtmlFieldHistoryMetadata(Object htmlFieldHistoryMetadata) {
        this.htmlFieldHistoryMetadata = htmlFieldHistoryMetadata;
    }

    public void setClosedDependOnCount(int closedDependOnCount) {
        this.closedDependOnCount = closedDependOnCount;
    }

    public void setClosedSubtaskCount(int closedSubtaskCount) {
        this.closedSubtaskCount = closedSubtaskCount;
    }

    public void setIsDisplayFollowButton(boolean isDisplayFollowButton) {
        this.isDisplayFollowButton = isDisplayFollowButton;
    }

    public void setRatingAvgText(Object ratingAvgText) {
        this.ratingAvgText = ratingAvgText;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setTaskProperties(Object taskProperties) {
        this.taskProperties = taskProperties;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsAllowMilestones(boolean isAllowMilestones) {
        this.isAllowMilestones = isAllowMilestones;
    }

    public void setWorkingHoursOpen(double workingHoursOpen) {
        this.workingHoursOpen = workingHoursOpen;
    }

    public void setIsAllowBillable(boolean isAllowBillable) {
        this.isAllowBillable = isAllowBillable;
    }

    public void setRepeatInterval(int repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setLinkPreviewName(String linkPreviewName) {
        this.linkPreviewName = linkPreviewName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaleOrderState(Object saleOrderState) {
        this.saleOrderState = saleOrderState;
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

    public void setDateAssign(Date dateAssign) {
        this.dateAssign = dateAssign;
    }

    public void setWorkingDaysOpen(double workingDaysOpen) {
        this.workingDaysOpen = workingDaysOpen;
    }

    public void setStageIdAsObject(ProjectTaskType stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setPersonalStageIdAsObject(ProjectTaskStagePersonal personalStageIdAsObject) {
        this.personalStageIdAsObject = personalStageIdAsObject;
    }

    public void setPersonalStageId(OdooId personalStageId) {
        this.personalStageId = personalStageId;
    }

    public void setWorkingDaysClose(double workingDaysClose) {
        this.workingDaysClose = workingDaysClose;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setAccessWarning(Object accessWarning) {
        this.accessWarning = accessWarning;
    }

    public void setDependOnIdsAsList(List<ProjectTask> dependOnIdsAsList) {
        this.dependOnIdsAsList = dependOnIdsAsList;
    }

    public void setDependOnIds(List<Integer> dependOnIds) {
        this.dependOnIds = dependOnIds;
    }

    public void setRatingLastImage(Object ratingLastImage) {
        this.ratingLastImage = ratingLastImage;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setSubtaskCompletionPercentage(double subtaskCompletionPercentage) {
        this.subtaskCompletionPercentage = subtaskCompletionPercentage;
    }

    public void setIsAllowTaskDependencies(boolean isAllowTaskDependencies) {
        this.isAllowTaskDependencies = isAllowTaskDependencies;
    }

    public void setDateDeadline(Date dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setChildIdsAsList(List<ProjectTask> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setIsShowDisplayInProject(boolean isShowDisplayInProject) {
        this.isShowDisplayInProject = isShowDisplayInProject;
    }

    public void setPersonalStageTypeIdAsObject(ProjectTaskType personalStageTypeIdAsObject) {
        this.personalStageTypeIdAsObject = personalStageTypeIdAsObject;
    }

    public void setPersonalStageTypeId(OdooId personalStageTypeId) {
        this.personalStageTypeId = personalStageTypeId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setRepeatType(Object repeatType) {
        this.repeatType = repeatType;
    }

    public void setRepeatUntil(Date repeatUntil) {
        this.repeatUntil = repeatUntil;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsAllowTimesheets(boolean isAllowTimesheets) {
        this.isAllowTimesheets = isAllowTimesheets;
    }

    public void setDependOnCount(int dependOnCount) {
        this.dependOnCount = dependOnCount;
    }

    public void setDateLastStageUpdate(Date dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate;
    }

    public void setRatingPercentageSatisfaction(double ratingPercentageSatisfaction) {
        this.ratingPercentageSatisfaction = ratingPercentageSatisfaction;
    }

    public void setRatingLastValue(double ratingLastValue) {
        this.ratingLastValue = ratingLastValue;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public void setIsDisplayInProject(boolean isDisplayInProject) {
        this.isDisplayInProject = isDisplayInProject;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setSubtaskAllocatedHours(double subtaskAllocatedHours) {
        this.subtaskAllocatedHours = subtaskAllocatedHours;
    }

    public void setDependentTasksCount(int dependentTasksCount) {
        this.dependentTasksCount = dependentTasksCount;
    }

    public void setAllocatedHours(double allocatedHours) {
        this.allocatedHours = allocatedHours;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setIsIsProjectMapEmpty(boolean isIsProjectMapEmpty) {
        this.isIsProjectMapEmpty = isIsProjectMapEmpty;
    }

    public void setRepeatUnit(Object repeatUnit) {
        this.repeatUnit = repeatUnit;
    }

    public void setIsCurrentUserSameCompanyPartner(boolean isCurrentUserSameCompanyPartner) {
        this.isCurrentUserSameCompanyPartner = isCurrentUserSameCompanyPartner;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setIsRemainingHoursAvailable(boolean isRemainingHoursAvailable) {
        this.isRemainingHoursAvailable = isRemainingHoursAvailable;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setRatingAvg(double ratingAvg) {
        this.ratingAvg = ratingAvg;
    }

    public void setIsDisplayParentTaskButton(boolean isDisplayParentTaskButton) {
        this.isDisplayParentTaskButton = isDisplayParentTaskButton;
    }

    public void setIsAnalyticAccountActive(boolean isAnalyticAccountActive) {
        this.isAnalyticAccountActive = isAnalyticAccountActive;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsIsClosed(boolean isIsClosed) {
        this.isIsClosed = isIsClosed;
    }

    public void setPersonalStageTypeIdsAsList(List<ProjectTaskType> personalStageTypeIdsAsList) {
        this.personalStageTypeIdsAsList = personalStageTypeIdsAsList;
    }

    public void setPersonalStageTypeIds(List<Integer> personalStageTypeIds) {
        this.personalStageTypeIds = personalStageTypeIds;
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

    public void setIsTaskToInvoice(boolean isTaskToInvoice) {
        this.isTaskToInvoice = isTaskToInvoice;
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

    public void setHtmlFieldHistory(Object htmlFieldHistory) {
        this.htmlFieldHistory = htmlFieldHistory;
    }

    public void setParentIdAsObject(ProjectTask parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setRemainingHoursSo(double remainingHoursSo) {
        this.remainingHoursSo = remainingHoursSo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPortalUserNames(String portalUserNames) {
        this.portalUserNames = portalUserNames;
    }

    public void setIsIsTimeoffTask(boolean isIsTimeoffTask) {
        this.isIsTimeoffTask = isIsTimeoffTask;
    }

    public void setIsHasMultiSol(boolean isHasMultiSol) {
        this.isHasMultiSol = isHasMultiSol;
    }

    public void setDependentIdsAsList(List<ProjectTask> dependentIdsAsList) {
        this.dependentIdsAsList = dependentIdsAsList;
    }

    public void setDependentIds(List<Integer> dependentIds) {
        this.dependentIds = dependentIds;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public void setLeaveTypesCount(int leaveTypesCount) {
        this.leaveTypesCount = leaveTypesCount;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setIsDisplaySaleOrderButton(boolean isDisplaySaleOrderButton) {
        this.isDisplaySaleOrderButton = isDisplaySaleOrderButton;
    }

    public void setWorkingHoursClose(double workingHoursClose) {
        this.workingHoursClose = workingHoursClose;
    }

    public void setMilestoneIdAsObject(ProjectMilestone milestoneIdAsObject) {
        this.milestoneIdAsObject = milestoneIdAsObject;
    }

    public void setMilestoneId(OdooId milestoneId) {
        this.milestoneId = milestoneId;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setSubtaskEffectiveHours(double subtaskEffectiveHours) {
        this.subtaskEffectiveHours = subtaskEffectiveHours;
    }

    public void setRatingLastFeedback(Object ratingLastFeedback) {
        this.ratingLastFeedback = ratingLastFeedback;
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

    public void setRecurrenceIdAsObject(ProjectTaskRecurrence recurrenceIdAsObject) {
        this.recurrenceIdAsObject = recurrenceIdAsObject;
    }

    public void setRecurrenceId(OdooId recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public void setEffectiveHours(double effectiveHours) {
        this.effectiveHours = effectiveHours;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setIsRatingActive(boolean isRatingActive) {
        this.isRatingActive = isRatingActive;
    }

    public void setIsHasLateAndUnreachedMilestone(boolean isHasLateAndUnreachedMilestone) {
        this.isHasLateAndUnreachedMilestone = isHasLateAndUnreachedMilestone;
    }

    public void setSubtaskCount(int subtaskCount) {
        this.subtaskCount = subtaskCount;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
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

    public void setRemainingHoursPercentage(double remainingHoursPercentage) {
        this.remainingHoursPercentage = remainingHoursPercentage;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setProjectPrivacyVisibility(Object projectPrivacyVisibility) {
        this.projectPrivacyVisibility = projectPrivacyVisibility;
    }

    public void setRatingLastText(Object ratingLastText) {
        this.ratingLastText = ratingLastText;
    }

    public void setRecurringCount(int recurringCount) {
        this.recurringCount = recurringCount;
    }

    public void setTotalHoursSpent(double totalHoursSpent) {
        this.totalHoursSpent = totalHoursSpent;
    }

    public void setIsRecurringTask(boolean isRecurringTask) {
        this.isRecurringTask = isRecurringTask;
    }



}