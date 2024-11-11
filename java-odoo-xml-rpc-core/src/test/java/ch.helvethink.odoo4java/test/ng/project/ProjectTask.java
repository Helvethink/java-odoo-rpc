
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

package ch.helvethink.odoo4java.test.ng.project;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.project.ProjectTags;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.project.ProjectMilestone;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.project.task.stage.ProjectTaskStagePersonal;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskRecurrence;;

@OdooObject("project.task")
public class ProjectTask implements OdooObj {

    
    private Date writeDate;

    
    private int closedSubtaskCount;

    
    private Object ratingAvgText;

    
    private Object activityDateDeadline;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private Object taskProperties;

    
    private int messageHasErrorCounter;

    
    private boolean isAllowMilestones;

    
    private double workingHoursOpen;

    
    private boolean isAllowBillable;

    
    private Product timesheetProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId timesheetProductId;

    
    private int repeatInterval;

    
    private Object state;

    
    private int id;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private List<AccountAnalyticLine> timesheetIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> timesheetIds;

    
    private int messageAttachmentCount;

    
    private List<ProjectTags> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTags")
        @OdooModel("project.ProjectTags")
    
    private List<Integer> tagIds;

    
    private Date dateAssign;

    
    private double workingDaysOpen;

    
    private ProjectTaskType stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private OdooId stageId;

    
    private ProjectTaskStagePersonal personalStageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.stage.ProjectTaskStagePersonal")
        @OdooModel("project.task.stage.ProjectTaskStagePersonal")
    
    private OdooId personalStageId;

    
    private double workingDaysClose;

    
    private boolean isActive;

    
    private Date dateEnd;

    
    private Object priority;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String accessToken;

    
    private Object accessWarning;

    
    private SaleOrder saleOrderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId saleOrderId;

    
    private List<ProjectTask> dependOnIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> dependOnIds;

    
    private Object ratingLastImage;

    
    private double overtime;

    
    private boolean isMessageIsFollower;

    
    private boolean isAllowTaskDependencies;

    
    private Date dateDeadline;

    
    private List<ProjectTask> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> childIds;

    
    private ProjectTaskType personalStageTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private OdooId personalStageTypeId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private Object repeatType;

    
    private Object repeatUntil;

    
    private boolean isMessageHasSmsError;

    
    private boolean isAllowTimesheets;

    
    private Date dateLastStageUpdate;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private double ratingPercentageSatisfaction;

    
    private IrAttachment displayedImageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId displayedImageId;

    
    private double ratingLastValue;

    
    private double progress;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private boolean isDisplayInProject;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private double subtaskAllocatedHours;

    
    private int dependentTasksCount;

    
    private double allocatedHours;

    
    private Object activityExceptionDecoration;

    
    private boolean isIsProjectMapEmpty;

    
    private Object repeatUnit;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private boolean isRemainingHoursAvailable;

    
    private boolean isHasMessage;

    
    private double ratingAvg;

    
    private boolean isDisplayParentTaskButton;

    
    private boolean isAnalyticAccountActive;

    
    private AccountAnalyticAccount analyticAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId analyticAccountId;

    
    private Date createDate;

    
    private List<ProjectTaskType> personalStageTypeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private List<Integer> personalStageTypeIds;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isEncodeUomInDays;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private boolean isTaskToInvoice;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private double remainingHours;

    
    private int ratingCount;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private Object pricingType;

    
    private int sequence;

    
    private ProjectTask parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId parentId;

    
    private double remainingHoursSo;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private String portalUserNames;

    
    private boolean isIsTimeoffTask;

    
    private boolean isHasMultiSol;

    
    private List<ProjectTask> dependentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> dependentIds;

    
    private String emailCc;

    
    private int leaveTypesCount;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private SaleOrderLine saleLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private OdooId saleLineId;

    
    private boolean isDisplaySaleOrderButton;

    
    private double workingHoursClose;

    
    private AccountAnalyticAccount soAnalyticAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId soAnalyticAccountId;

    
    private ProjectMilestone milestoneIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
    
    private OdooId milestoneId;

    
    private Object description;

    
    private Object myActivityDateDeadline;

    
    private double subtaskEffectiveHours;

    
    private Object ratingLastFeedback;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Object durationTracking;

    
    private ProjectTaskRecurrence recurrenceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskRecurrence")
        @OdooModel("project.task.ProjectTaskRecurrence")
    
    private OdooId recurrenceId;

    
    private double effectiveHours;

    
    private String activityTypeIcon;

    
    private boolean isRatingActive;

    
    private boolean isHasLateAndUnreachedMilestone;

    
    private int subtaskCount;

    
    private String accessUrl;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private double remainingHoursPercentage;

    
    private int messageNeedactionCounter;

    
    private Object projectPrivacyVisibility;

    
    private SaleOrder projectSaleOrderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId projectSaleOrderId;

    
    private Object ratingLastText;

    
    private int recurringCount;

    
    private double totalHoursSpent;

    
    private boolean isRecurringTask;


    public ProjectTask() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getClosedSubtaskCount() {
        return closedSubtaskCount;
    }

    public Object getRatingAvgText() {
        return ratingAvgText;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
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

    public Product getTimesheetProductIdAsObject() {
        return timesheetProductIdAsObject;
    }

    public OdooId getTimesheetProductId() {
        return timesheetProductId;
    }

    public int getRepeatInterval() {
        return repeatInterval;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
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

    public SaleOrder getSaleOrderIdAsObject() {
        return saleOrderIdAsObject;
    }

    public OdooId getSaleOrderId() {
        return saleOrderId;
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

    public Object getRepeatUntil() {
        return repeatUntil;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsAllowTimesheets() {
        return isAllowTimesheets;
    }

    public Date getDateLastStageUpdate() {
        return dateLastStageUpdate;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public double getRatingPercentageSatisfaction() {
        return ratingPercentageSatisfaction;
    }

    public IrAttachment getDisplayedImageIdAsObject() {
        return displayedImageIdAsObject;
    }

    public OdooId getDisplayedImageId() {
        return displayedImageId;
    }

    public double getRatingLastValue() {
        return ratingLastValue;
    }

    public double getProgress() {
        return progress;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
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

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
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

    public AccountAnalyticAccount getAnalyticAccountIdAsObject() {
        return analyticAccountIdAsObject;
    }

    public OdooId getAnalyticAccountId() {
        return analyticAccountId;
    }

    public Date getCreateDate() {
        return createDate;
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

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public Object getPricingType() {
        return pricingType;
    }

    public int getSequence() {
        return sequence;
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

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
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

    public SaleOrderLine getSaleLineIdAsObject() {
        return saleLineIdAsObject;
    }

    public OdooId getSaleLineId() {
        return saleLineId;
    }

    public boolean getIsDisplaySaleOrderButton() {
        return isDisplaySaleOrderButton;
    }

    public double getWorkingHoursClose() {
        return workingHoursClose;
    }

    public AccountAnalyticAccount getSoAnalyticAccountIdAsObject() {
        return soAnalyticAccountIdAsObject;
    }

    public OdooId getSoAnalyticAccountId() {
        return soAnalyticAccountId;
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

    public Object getMyActivityDateDeadline() {
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

    public SaleOrder getProjectSaleOrderIdAsObject() {
        return projectSaleOrderIdAsObject;
    }

    public OdooId getProjectSaleOrderId() {
        return projectSaleOrderId;
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

    public void setClosedSubtaskCount(int closedSubtaskCount) {
        this.closedSubtaskCount = closedSubtaskCount;
    }

    public void setRatingAvgText(Object ratingAvgText) {
        this.ratingAvgText = ratingAvgText;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
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

    public void setTimesheetProductIdAsObject(Product timesheetProductIdAsObject) {
        this.timesheetProductIdAsObject = timesheetProductIdAsObject;
    }

    public void setTimesheetProductId(OdooId timesheetProductId) {
        this.timesheetProductId = timesheetProductId;
    }

    public void setRepeatInterval(int repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
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

    public void setSaleOrderIdAsObject(SaleOrder saleOrderIdAsObject) {
        this.saleOrderIdAsObject = saleOrderIdAsObject;
    }

    public void setSaleOrderId(OdooId saleOrderId) {
        this.saleOrderId = saleOrderId;
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

    public void setRepeatUntil(Object repeatUntil) {
        this.repeatUntil = repeatUntil;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsAllowTimesheets(boolean isAllowTimesheets) {
        this.isAllowTimesheets = isAllowTimesheets;
    }

    public void setDateLastStageUpdate(Date dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setRatingPercentageSatisfaction(double ratingPercentageSatisfaction) {
        this.ratingPercentageSatisfaction = ratingPercentageSatisfaction;
    }

    public void setDisplayedImageIdAsObject(IrAttachment displayedImageIdAsObject) {
        this.displayedImageIdAsObject = displayedImageIdAsObject;
    }

    public void setDisplayedImageId(OdooId displayedImageId) {
        this.displayedImageId = displayedImageId;
    }

    public void setRatingLastValue(double ratingLastValue) {
        this.ratingLastValue = ratingLastValue;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
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

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
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

    public void setAnalyticAccountIdAsObject(AccountAnalyticAccount analyticAccountIdAsObject) {
        this.analyticAccountIdAsObject = analyticAccountIdAsObject;
    }

    public void setAnalyticAccountId(OdooId analyticAccountId) {
        this.analyticAccountId = analyticAccountId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setPricingType(Object pricingType) {
        this.pricingType = pricingType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
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

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
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

    public void setSaleLineIdAsObject(SaleOrderLine saleLineIdAsObject) {
        this.saleLineIdAsObject = saleLineIdAsObject;
    }

    public void setSaleLineId(OdooId saleLineId) {
        this.saleLineId = saleLineId;
    }

    public void setIsDisplaySaleOrderButton(boolean isDisplaySaleOrderButton) {
        this.isDisplaySaleOrderButton = isDisplaySaleOrderButton;
    }

    public void setWorkingHoursClose(double workingHoursClose) {
        this.workingHoursClose = workingHoursClose;
    }

    public void setSoAnalyticAccountIdAsObject(AccountAnalyticAccount soAnalyticAccountIdAsObject) {
        this.soAnalyticAccountIdAsObject = soAnalyticAccountIdAsObject;
    }

    public void setSoAnalyticAccountId(OdooId soAnalyticAccountId) {
        this.soAnalyticAccountId = soAnalyticAccountId;
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

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
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

    public void setProjectSaleOrderIdAsObject(SaleOrder projectSaleOrderIdAsObject) {
        this.projectSaleOrderIdAsObject = projectSaleOrderIdAsObject;
    }

    public void setProjectSaleOrderId(OdooId projectSaleOrderId) {
        this.projectSaleOrderId = projectSaleOrderId;
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