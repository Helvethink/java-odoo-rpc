
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

package ch.helvethink.odoo4java.test.ng.crm.lead2opportunity.partner;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("crm.lead2opportunity.partner.mass")
public class CrmLeadTwoopportunityPartnerMass implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<CrmLead> leadTomergeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> leadTomergeIds;

    
    private boolean isDeduplicate;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<CrmLead> duplicatedLeadIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> duplicatedLeadIds;

    
    private boolean isForceAssignment;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Object name;

    
    private Object action;

    
    private int id;

    
    private Date createDate;

    
    private CrmLead leadIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private OdooId leadId;


    public CrmLeadTwoopportunityPartnerMass() {
    // Constructor
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

    public List<CrmLead> getLeadTomergeIdsAsList() {
        return leadTomergeIdsAsList;
    }

    public List<Integer> getLeadTomergeIds() {
        return leadTomergeIds;
    }

    public boolean getIsDeduplicate() {
        return isDeduplicate;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public CrmTeam getTeamIdAsObject() {
        return teamIdAsObject;
    }

    public OdooId getTeamId() {
        return teamId;
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

    public List<CrmLead> getDuplicatedLeadIdsAsList() {
        return duplicatedLeadIdsAsList;
    }

    public List<Integer> getDuplicatedLeadIds() {
        return duplicatedLeadIds;
    }

    public boolean getIsForceAssignment() {
        return isForceAssignment;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Object getName() {
        return name;
    }

    public Object getAction() {
        return action;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public CrmLead getLeadIdAsObject() {
        return leadIdAsObject;
    }

    public OdooId getLeadId() {
        return leadId;
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

    public void setLeadTomergeIdsAsList(List<CrmLead> leadTomergeIdsAsList) {
        this.leadTomergeIdsAsList = leadTomergeIdsAsList;
    }

    public void setLeadTomergeIds(List<Integer> leadTomergeIds) {
        this.leadTomergeIds = leadTomergeIds;
    }

    public void setIsDeduplicate(boolean isDeduplicate) {
        this.isDeduplicate = isDeduplicate;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setTeamIdAsObject(CrmTeam teamIdAsObject) {
        this.teamIdAsObject = teamIdAsObject;
    }

    public void setTeamId(OdooId teamId) {
        this.teamId = teamId;
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

    public void setDuplicatedLeadIdsAsList(List<CrmLead> duplicatedLeadIdsAsList) {
        this.duplicatedLeadIdsAsList = duplicatedLeadIdsAsList;
    }

    public void setDuplicatedLeadIds(List<Integer> duplicatedLeadIds) {
        this.duplicatedLeadIds = duplicatedLeadIds;
    }

    public void setIsForceAssignment(boolean isForceAssignment) {
        this.isForceAssignment = isForceAssignment;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLeadIdAsObject(CrmLead leadIdAsObject) {
        this.leadIdAsObject = leadIdAsObject;
    }

    public void setLeadId(OdooId leadId) {
        this.leadId = leadId;
    }



}