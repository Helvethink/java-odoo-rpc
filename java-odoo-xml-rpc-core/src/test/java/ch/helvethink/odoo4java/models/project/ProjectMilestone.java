
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

@OdooObject("project.milestone")
public class ProjectMilestone implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("reached_date")
        private Date reachedDate;
    

    
        @JsonProperty("sale_line_display_name")
        private String saleLineDisplayName;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        private Project projectIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("project_id")
        private OdooId projectId;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("allow_billable")
        private boolean isAllowBillable;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("deadline")
        private Date deadline;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("quantity_percentage")
        private double quantityPercentage;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        private ResPartner projectPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("project_partner_id")
        private OdooId projectPartnerId;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("can_be_marked_as_done")
        private boolean isCanBeMarkedAsDone;
    

    
        private List<ProjectTask> taskIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("task_ids")
        private List<Integer> taskIds;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("is_reached")
        private boolean isIsReached;
    

    
        @JsonProperty("is_deadline_future")
        private boolean isIsDeadlineFuture;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("is_deadline_exceeded")
        private boolean isIsDeadlineExceeded;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("product_uom_qty")
        private double productUomQty;
    


    public ProjectMilestone() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
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

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Date getReachedDate() {
        return reachedDate;
    }

    public String getSaleLineDisplayName() {
        return saleLineDisplayName;
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

    public boolean getIsAllowBillable() {
        return isAllowBillable;
    }

    public int getId() {
        return id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getQuantityPercentage() {
        return quantityPercentage;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public ResPartner getProjectPartnerIdAsObject() {
        return projectPartnerIdAsObject;
    }

    public OdooId getProjectPartnerId() {
        return projectPartnerId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsCanBeMarkedAsDone() {
        return isCanBeMarkedAsDone;
    }

    public List<ProjectTask> getTaskIdsAsList() {
        return taskIdsAsList;
    }

    public List<Integer> getTaskIds() {
        return taskIds;
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

    public boolean getIsIsReached() {
        return isIsReached;
    }

    public boolean getIsIsDeadlineFuture() {
        return isIsDeadlineFuture;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public boolean getIsIsDeadlineExceeded() {
        return isIsDeadlineExceeded;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getName() {
        return name;
    }

    public double getProductUomQty() {
        return productUomQty;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
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

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setReachedDate(Date reachedDate) {
        this.reachedDate = reachedDate;
    }

    public void setSaleLineDisplayName(String saleLineDisplayName) {
        this.saleLineDisplayName = saleLineDisplayName;
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

    public void setIsAllowBillable(boolean isAllowBillable) {
        this.isAllowBillable = isAllowBillable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setQuantityPercentage(double quantityPercentage) {
        this.quantityPercentage = quantityPercentage;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setProjectPartnerIdAsObject(ResPartner projectPartnerIdAsObject) {
        this.projectPartnerIdAsObject = projectPartnerIdAsObject;
    }

    public void setProjectPartnerId(OdooId projectPartnerId) {
        this.projectPartnerId = projectPartnerId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsCanBeMarkedAsDone(boolean isCanBeMarkedAsDone) {
        this.isCanBeMarkedAsDone = isCanBeMarkedAsDone;
    }

    public void setTaskIdsAsList(List<ProjectTask> taskIdsAsList) {
        this.taskIdsAsList = taskIdsAsList;
    }

    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
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

    public void setIsIsReached(boolean isIsReached) {
        this.isIsReached = isIsReached;
    }

    public void setIsIsDeadlineFuture(boolean isIsDeadlineFuture) {
        this.isIsDeadlineFuture = isIsDeadlineFuture;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setIsIsDeadlineExceeded(boolean isIsDeadlineExceeded) {
        this.isIsDeadlineExceeded = isIsDeadlineExceeded;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductUomQty(double productUomQty) {
        this.productUomQty = productUomQty;
    }



}