
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

package ch.helvethink.odoo4java.test.ng.project.task.burndown.chart;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.project.ProjectTags;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.project.ProjectMilestone;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("project.task.burndown.chart.report")
public class ProjectTaskBurndownChartReport implements OdooObj {

    
    private Date date;

    
    private Object dateLastStageUpdate;

    
    private List<ProjectTags> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTags")
        @OdooModel("project.ProjectTags")
    
    private List<Integer> tagIds;

    
    private Date dateAssign;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private ProjectTaskType stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.task.ProjectTaskType")
        @OdooModel("project.task.ProjectTaskType")
    
    private OdooId stageId;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private ProjectMilestone milestoneIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
    
    private OdooId milestoneId;

    
    private Object dateDeadline;

    
    private Object state;

    
    private double allocatedHours;


    public ProjectTaskBurndownChartReport() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public Object getDateLastStageUpdate() {
        return dateLastStageUpdate;
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

    public ProjectTaskType getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public ProjectMilestone getMilestoneIdAsObject() {
        return milestoneIdAsObject;
    }

    public OdooId getMilestoneId() {
        return milestoneId;
    }

    public Object getDateDeadline() {
        return dateDeadline;
    }

    public Object getState() {
        return state;
    }

    public double getAllocatedHours() {
        return allocatedHours;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setDateLastStageUpdate(Object dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate;
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

    public void setStageIdAsObject(ProjectTaskType stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setMilestoneIdAsObject(ProjectMilestone milestoneIdAsObject) {
        this.milestoneIdAsObject = milestoneIdAsObject;
    }

    public void setMilestoneId(OdooId milestoneId) {
        this.milestoneId = milestoneId;
    }

    public void setDateDeadline(Object dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setAllocatedHours(double allocatedHours) {
        this.allocatedHours = allocatedHours;
    }



}