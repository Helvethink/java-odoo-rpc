
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

package ch.helvethink.odoo4java.models.project.share;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.project.share.collaborator.ProjectShareCollaboratorWizard;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("project.share.wizard")
public class ProjectShareWizard implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("note")
        private Object note;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("res_model")
        private String resModel;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private List<ProjectShareCollaboratorWizard> collaboratorIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.share.collaborator.ProjectShareCollaboratorWizard")
        @OdooModel("project.share.collaborator.ProjectShareCollaboratorWizard")
        @JsonProperty("collaborator_ids")
        private List<Integer> collaboratorIds;
    

    
        private List<ResPartner> existingPartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("existing_partner_ids")
        private List<Integer> existingPartnerIds;
    

    
        @JsonProperty("share_link")
        private String shareLink;
    

    
        @JsonProperty("access_warning")
        private Object accessWarning;
    

    
        @JsonProperty("res_id")
        private int resId;
    

    
        @JsonProperty("resource_ref")
        private Object resourceRef;
    

    
        @JsonProperty("id")
        private int id;
    

    
        private List<ResPartner> partnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_ids")
        private List<Integer> partnerIds;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public ProjectShareWizard() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getResModel() {
        return resModel;
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

    public List<ProjectShareCollaboratorWizard> getCollaboratorIdsAsList() {
        return collaboratorIdsAsList;
    }

    public List<Integer> getCollaboratorIds() {
        return collaboratorIds;
    }

    public List<ResPartner> getExistingPartnerIdsAsList() {
        return existingPartnerIdsAsList;
    }

    public List<Integer> getExistingPartnerIds() {
        return existingPartnerIds;
    }

    public String getShareLink() {
        return shareLink;
    }

    public Object getAccessWarning() {
        return accessWarning;
    }

    public int getResId() {
        return resId;
    }

    public Object getResourceRef() {
        return resourceRef;
    }

    public int getId() {
        return id;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
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

    public void setCollaboratorIdsAsList(List<ProjectShareCollaboratorWizard> collaboratorIdsAsList) {
        this.collaboratorIdsAsList = collaboratorIdsAsList;
    }

    public void setCollaboratorIds(List<Integer> collaboratorIds) {
        this.collaboratorIds = collaboratorIds;
    }

    public void setExistingPartnerIdsAsList(List<ResPartner> existingPartnerIdsAsList) {
        this.existingPartnerIdsAsList = existingPartnerIdsAsList;
    }

    public void setExistingPartnerIds(List<Integer> existingPartnerIds) {
        this.existingPartnerIds = existingPartnerIds;
    }

    public void setShareLink(String shareLink) {
        this.shareLink = shareLink;
    }

    public void setAccessWarning(Object accessWarning) {
        this.accessWarning = accessWarning;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setResourceRef(Object resourceRef) {
        this.resourceRef = resourceRef;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}