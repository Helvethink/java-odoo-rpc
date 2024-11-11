
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

import ch.helvethink.odoo4java.test.ng.project.ProjectTags;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.mail.MailAlias;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;
import ch.helvethink.odoo4java.test.ng.project.ProjectCollaborator;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.project.ProjectMilestone;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType;
import ch.helvethink.odoo4java.test.ng.project.ProjectUpdate;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.test.ng.project.sale.line.employee.ProjectSaleLineEmployeeMap;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("project.project")
public class Project implements OdooObj {

    
    private Date writeDate;

    
    private Object activityDateDeadline;

    
    private Object aliasContact;

    
    private int totalTimesheetTime;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private boolean isAllowMilestones;

    
    private int aliasParentThreadId;

    
    private boolean isAllowBillable;

    
    private Product timesheetProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId timesheetProductId;

    
    private int id;

    
    private List<ResUsers> favoriteUserIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> favoriteUserIds;

    
    private List<ProjectTask> tasksAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> tasks;

    
    private List<AccountAnalyticLine> timesheetIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> timesheetIds;

    
    private int messageAttachmentCount;

    
    private List<ProjectTags> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTags")
        @OdooModel("project.ProjectTags")
    
    private List<Integer> tagIds;

    
    private List<ProjectUpdate> updateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectUpdate")
        @OdooModel("project.ProjectUpdate")
    
    private List<Integer> updateIds;

    
    private boolean isActive;

    
    private String privacyVisibilityWarning;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isDisplaySalesStatButtons;

    
    private int billablePercentage;

    
    private String accessToken;

    
    private Object accessWarning;

    
    private SaleOrder saleOrderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId saleOrderId;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Object ratingStatusPeriod;

    
    private Object lastUpdateStatus;

    
    private String accessInstructionMessage;

    
    private boolean isMessageIsFollower;

    
    private MailAlias aliasIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailAlias")
        @OdooModel("mail.MailAlias")
    
    private OdooId aliasId;

    
    private boolean isAllowTaskDependencies;

    
    private boolean isIsProjectOvertime;

    
    private List<ProjectMilestone> milestoneIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
    
    private List<Integer> milestoneIds;

    
    private IrModel aliasModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasModelId;

    
    private Object billingType;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private Date ratingRequestDeadline;

    
    private ProjectUpdate lastUpdateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectUpdate")
        @OdooModel("project.ProjectUpdate")
    
    private OdooId lastUpdateId;

    
    private int docCount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object analyticAccountBalance;

    
    private boolean isMessageHasSmsError;

    
    private int collaboratorCount;

    
    private int lastUpdateColor;

    
    private boolean isAllowTimesheets;

    
    private List<ProjectTask> taskIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> taskIds;

    
    private Object taskPropertiesDefinition;

    
    private boolean isWarningEmployeeRate;

    
    private double ratingAvgPercentage;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private int ratingPercentageSatisfaction;

    
    private Object ratingStatus;

    
    private int saleOrderCount;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private Object date;

    
    private int openTaskCount;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private List<ProjectTaskType> typeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private List<Integer> typeIds;

    
    private Object privacyVisibility;

    
    private Object aliasBouncedContent;

    
    private double allocatedHours;

    
    private Object activityExceptionDecoration;

    
    private int taskCount;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private List<ProjectSaleLineEmployeeMap> saleLineEmployeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.sale.line.employee.ProjectSaleLineEmployeeMap")
        @OdooModel("project.sale.line.employee.ProjectSaleLineEmployeeMap")
    
    private List<Integer> saleLineEmployeeIds;

    
    private boolean isHasMessage;

    
    private double ratingAvg;

    
    private boolean isAliasIncomingLocal;

    
    private AccountAnalyticAccount analyticAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId analyticAccountId;

    
    private Date createDate;

    
    private IrModel aliasParentModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasParentModelId;

    
    private String labelTasks;

    
    private int saleOrderLineCount;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isEncodeUomInDays;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
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

    
    private Object dateStart;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private String aliasEmail;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsFavorite;

    
    private int color;

    
    private SaleOrderLine saleLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private OdooId saleLineId;

    
    private int closedTaskCount;

    
    private Object description;

    
    private Object myActivityDateDeadline;

    
    private String aliasFullName;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private int expensesCount;

    
    private boolean isIsMilestoneExceeded;

    
    private String activityTypeIcon;

    
    private boolean isRatingActive;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private String accessUrl;

    
    private String aliasName;

    
    private List<ProjectCollaborator> collaboratorIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectCollaborator")
        @OdooModel("project.ProjectCollaborator")
    
    private List<Integer> collaboratorIds;

    
    private Uom timesheetEncodeUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId timesheetEncodeUomId;

    
    private String aliasDomain;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private boolean isAllowRating;

    
    private int messageNeedactionCounter;

    
    private int aliasForceThreadId;

    
    private boolean isHasAnySoWithNothingToInvoice;

    
    private Object aliasStatus;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private boolean isHasAnySoToInvoice;

    
    private Object aliasDefaults;

    
    private boolean isIsInternalProject;


    public Project() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getActivityDateDeadline() {
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

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
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

    public Product getTimesheetProductIdAsObject() {
        return timesheetProductIdAsObject;
    }

    public OdooId getTimesheetProductId() {
        return timesheetProductId;
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

    public int getBillablePercentage() {
        return billablePercentage;
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

    public MailAlias getAliasIdAsObject() {
        return aliasIdAsObject;
    }

    public OdooId getAliasId() {
        return aliasId;
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

    public IrModel getAliasModelIdAsObject() {
        return aliasModelIdAsObject;
    }

    public OdooId getAliasModelId() {
        return aliasModelId;
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

    public int getDocCount() {
        return docCount;
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

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
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

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public Object getDate() {
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

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
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

    public AccountAnalyticAccount getAnalyticAccountIdAsObject() {
        return analyticAccountIdAsObject;
    }

    public OdooId getAnalyticAccountId() {
        return analyticAccountId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public IrModel getAliasParentModelIdAsObject() {
        return aliasParentModelIdAsObject;
    }

    public OdooId getAliasParentModelId() {
        return aliasParentModelId;
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

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
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

    public Object getDateStart() {
        return dateStart;
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

    public SaleOrderLine getSaleLineIdAsObject() {
        return saleLineIdAsObject;
    }

    public OdooId getSaleLineId() {
        return saleLineId;
    }

    public int getClosedTaskCount() {
        return closedTaskCount;
    }

    public Object getDescription() {
        return description;
    }

    public Object getMyActivityDateDeadline() {
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

    public int getExpensesCount() {
        return expensesCount;
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

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
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

    public Uom getTimesheetEncodeUomIdAsObject() {
        return timesheetEncodeUomIdAsObject;
    }

    public OdooId getTimesheetEncodeUomId() {
        return timesheetEncodeUomId;
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

    public boolean getIsAllowRating() {
        return isAllowRating;
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

    public void setActivityDateDeadline(Object activityDateDeadline) {
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

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
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

    public void setTimesheetProductIdAsObject(Product timesheetProductIdAsObject) {
        this.timesheetProductIdAsObject = timesheetProductIdAsObject;
    }

    public void setTimesheetProductId(OdooId timesheetProductId) {
        this.timesheetProductId = timesheetProductId;
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

    public void setBillablePercentage(int billablePercentage) {
        this.billablePercentage = billablePercentage;
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

    public void setAliasIdAsObject(MailAlias aliasIdAsObject) {
        this.aliasIdAsObject = aliasIdAsObject;
    }

    public void setAliasId(OdooId aliasId) {
        this.aliasId = aliasId;
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

    public void setAliasModelIdAsObject(IrModel aliasModelIdAsObject) {
        this.aliasModelIdAsObject = aliasModelIdAsObject;
    }

    public void setAliasModelId(OdooId aliasModelId) {
        this.aliasModelId = aliasModelId;
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

    public void setDocCount(int docCount) {
        this.docCount = docCount;
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

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
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

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setDate(Object date) {
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

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
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

    public void setAnalyticAccountIdAsObject(AccountAnalyticAccount analyticAccountIdAsObject) {
        this.analyticAccountIdAsObject = analyticAccountIdAsObject;
    }

    public void setAnalyticAccountId(OdooId analyticAccountId) {
        this.analyticAccountId = analyticAccountId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAliasParentModelIdAsObject(IrModel aliasParentModelIdAsObject) {
        this.aliasParentModelIdAsObject = aliasParentModelIdAsObject;
    }

    public void setAliasParentModelId(OdooId aliasParentModelId) {
        this.aliasParentModelId = aliasParentModelId;
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

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
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

    public void setDateStart(Object dateStart) {
        this.dateStart = dateStart;
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

    public void setSaleLineIdAsObject(SaleOrderLine saleLineIdAsObject) {
        this.saleLineIdAsObject = saleLineIdAsObject;
    }

    public void setSaleLineId(OdooId saleLineId) {
        this.saleLineId = saleLineId;
    }

    public void setClosedTaskCount(int closedTaskCount) {
        this.closedTaskCount = closedTaskCount;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
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

    public void setExpensesCount(int expensesCount) {
        this.expensesCount = expensesCount;
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

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
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

    public void setTimesheetEncodeUomIdAsObject(Uom timesheetEncodeUomIdAsObject) {
        this.timesheetEncodeUomIdAsObject = timesheetEncodeUomIdAsObject;
    }

    public void setTimesheetEncodeUomId(OdooId timesheetEncodeUomId) {
        this.timesheetEncodeUomId = timesheetEncodeUomId;
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

    public void setIsAllowRating(boolean isAllowRating) {
        this.isAllowRating = isAllowRating;
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