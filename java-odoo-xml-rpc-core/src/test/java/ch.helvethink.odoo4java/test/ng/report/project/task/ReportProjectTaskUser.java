
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

package ch.helvethink.odoo4java.test.ng.report.project.task;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.project.ProjectTags;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.project.ProjectMilestone;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;;

@OdooObject("report.project.task.user")
public class ReportProjectTaskUser implements OdooObj {

    
    private boolean isMessageIsFollower;

    
    private SaleOrderLine saleLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private OdooId saleLineId;

    
    private double workingHoursClose;

    
    private ProjectMilestone milestoneIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
    
    private OdooId milestoneId;

    
    private Object description;

    
    private ProjectTask taskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId taskId;

    
    private Date dateDeadline;

    
    private double delayEndingsDays;

    
    private double allocatedHours;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private double workingHoursOpen;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private double effectiveHours;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private List<ProjectTags> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTags")
        @OdooModel("project.ProjectTags")
    
    private List<Integer> tagIds;

    
    private List<ProjectTaskType> personalStageTypeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private List<Integer> personalStageTypeIds;

    
    private Date dateAssign;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private double workingDaysOpen;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private ProjectTaskType stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private OdooId stageId;

    
    private double workingDaysClose;

    
    private boolean isActive;

    
    private Date dateEnd;

    
    private Object priority;

    
    private String displayName;

    
    private double remainingHours;

    
    private Date dateLastStageUpdate;

    
    private SaleOrder saleOrderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId saleOrderId;

    
    private ProjectTask parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId parentId;

    
    private double remainingHoursPercentage;

    
    private double remainingHoursSo;

    
    private String name;

    
    private double progress;

    
    private double overtime;

    
    private List<ProjectTask> dependentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> dependentIds;

    
    private double totalHoursSpent;

    
    private int nbr;


    public ReportProjectTaskUser() {
    // Constructor
    }


    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public SaleOrderLine getSaleLineIdAsObject() {
        return saleLineIdAsObject;
    }

    public OdooId getSaleLineId() {
        return saleLineId;
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

    public ProjectTask getTaskIdAsObject() {
        return taskIdAsObject;
    }

    public OdooId getTaskId() {
        return taskId;
    }

    public Date getDateDeadline() {
        return dateDeadline;
    }

    public double getDelayEndingsDays() {
        return delayEndingsDays;
    }

    public double getAllocatedHours() {
        return allocatedHours;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public double getWorkingHoursOpen() {
        return workingHoursOpen;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public double getEffectiveHours() {
        return effectiveHours;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<ProjectTags> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public List<ProjectTaskType> getPersonalStageTypeIdsAsList() {
        return personalStageTypeIdsAsList;
    }

    public List<Integer> getPersonalStageTypeIds() {
        return personalStageTypeIds;
    }

    public Date getDateAssign() {
        return dateAssign;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public double getWorkingDaysOpen() {
        return workingDaysOpen;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public ProjectTaskType getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
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

    public String getDisplayName() {
        return displayName;
    }

    public double getRemainingHours() {
        return remainingHours;
    }

    public Date getDateLastStageUpdate() {
        return dateLastStageUpdate;
    }

    public SaleOrder getSaleOrderIdAsObject() {
        return saleOrderIdAsObject;
    }

    public OdooId getSaleOrderId() {
        return saleOrderId;
    }

    public ProjectTask getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public double getRemainingHoursPercentage() {
        return remainingHoursPercentage;
    }

    public double getRemainingHoursSo() {
        return remainingHoursSo;
    }

    public String getName() {
        return name;
    }

    public double getProgress() {
        return progress;
    }

    public double getOvertime() {
        return overtime;
    }

    public List<ProjectTask> getDependentIdsAsList() {
        return dependentIdsAsList;
    }

    public List<Integer> getDependentIds() {
        return dependentIds;
    }

    public double getTotalHoursSpent() {
        return totalHoursSpent;
    }

    public int getNbr() {
        return nbr;
    }



    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setSaleLineIdAsObject(SaleOrderLine saleLineIdAsObject) {
        this.saleLineIdAsObject = saleLineIdAsObject;
    }

    public void setSaleLineId(OdooId saleLineId) {
        this.saleLineId = saleLineId;
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

    public void setTaskIdAsObject(ProjectTask taskIdAsObject) {
        this.taskIdAsObject = taskIdAsObject;
    }

    public void setTaskId(OdooId taskId) {
        this.taskId = taskId;
    }

    public void setDateDeadline(Date dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setDelayEndingsDays(double delayEndingsDays) {
        this.delayEndingsDays = delayEndingsDays;
    }

    public void setAllocatedHours(double allocatedHours) {
        this.allocatedHours = allocatedHours;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setWorkingHoursOpen(double workingHoursOpen) {
        this.workingHoursOpen = workingHoursOpen;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setEffectiveHours(double effectiveHours) {
        this.effectiveHours = effectiveHours;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setTagIdsAsList(List<ProjectTags> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setPersonalStageTypeIdsAsList(List<ProjectTaskType> personalStageTypeIdsAsList) {
        this.personalStageTypeIdsAsList = personalStageTypeIdsAsList;
    }

    public void setPersonalStageTypeIds(List<Integer> personalStageTypeIds) {
        this.personalStageTypeIds = personalStageTypeIds;
    }

    public void setDateAssign(Date dateAssign) {
        this.dateAssign = dateAssign;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setWorkingDaysOpen(double workingDaysOpen) {
        this.workingDaysOpen = workingDaysOpen;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setStageIdAsObject(ProjectTaskType stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
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

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setRemainingHours(double remainingHours) {
        this.remainingHours = remainingHours;
    }

    public void setDateLastStageUpdate(Date dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate;
    }

    public void setSaleOrderIdAsObject(SaleOrder saleOrderIdAsObject) {
        this.saleOrderIdAsObject = saleOrderIdAsObject;
    }

    public void setSaleOrderId(OdooId saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public void setParentIdAsObject(ProjectTask parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setRemainingHoursPercentage(double remainingHoursPercentage) {
        this.remainingHoursPercentage = remainingHoursPercentage;
    }

    public void setRemainingHoursSo(double remainingHoursSo) {
        this.remainingHoursSo = remainingHoursSo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public void setDependentIdsAsList(List<ProjectTask> dependentIdsAsList) {
        this.dependentIdsAsList = dependentIdsAsList;
    }

    public void setDependentIds(List<Integer> dependentIds) {
        this.dependentIds = dependentIds;
    }

    public void setTotalHoursSpent(double totalHoursSpent) {
        this.totalHoursSpent = totalHoursSpent;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }



}