
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
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("project.update")
public class ProjectUpdate implements OdooObj {

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("task_count")
        private int taskCount;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        private Project projectIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("project_id")
        private OdooId projectId;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("display_timesheet_stats")
        private boolean isDisplayTimesheetStats;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("email_cc")
        private String emailCc;
    

    
        @JsonProperty("closed_task_percentage")
        private int closedTaskPercentage;
    

    
        @JsonProperty("status")
        private Object status;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("closed_task_count")
        private int closedTaskCount;
    

    
        @JsonProperty("progress_percentage")
        private double progressPercentage;
    

    
        @JsonProperty("description")
        private Object description;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("timesheet_time")
        private int timesheetTime;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("timesheet_percentage")
        private int timesheetPercentage;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("allocated_time")
        private int allocatedTime;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("name_cropped")
        private String nameCropped;
    

    
        @JsonProperty("progress")
        private int progress;
    


    public ProjectUpdate() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public boolean getIsDisplayTimesheetStats() {
        return isDisplayTimesheetStats;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
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

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmailCc() {
        return emailCc;
    }

    public int getClosedTaskPercentage() {
        return closedTaskPercentage;
    }

    public Object getStatus() {
        return status;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
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

    public int getClosedTaskCount() {
        return closedTaskCount;
    }

    public double getProgressPercentage() {
        return progressPercentage;
    }

    public Object getDescription() {
        return description;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public int getTimesheetTime() {
        return timesheetTime;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public int getTimesheetPercentage() {
        return timesheetPercentage;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getAllocatedTime() {
        return allocatedTime;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getNameCropped() {
        return nameCropped;
    }

    public int getProgress() {
        return progress;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setIsDisplayTimesheetStats(boolean isDisplayTimesheetStats) {
        this.isDisplayTimesheetStats = isDisplayTimesheetStats;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
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

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public void setClosedTaskPercentage(int closedTaskPercentage) {
        this.closedTaskPercentage = closedTaskPercentage;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
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

    public void setClosedTaskCount(int closedTaskCount) {
        this.closedTaskCount = closedTaskCount;
    }

    public void setProgressPercentage(double progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setTimesheetTime(int timesheetTime) {
        this.timesheetTime = timesheetTime;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setTimesheetPercentage(int timesheetPercentage) {
        this.timesheetPercentage = timesheetPercentage;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setAllocatedTime(int allocatedTime) {
        this.allocatedTime = allocatedTime;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setNameCropped(String nameCropped) {
        this.nameCropped = nameCropped;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }



}