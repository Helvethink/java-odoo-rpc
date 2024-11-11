
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

package ch.helvethink.odoo4java.test.ng.crm.lead;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.crm.lost.CrmLostReason;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("crm.lead.lost")
public class CrmLeadLost implements OdooObj {

    
    private Date writeDate;

    
    private CrmLostReason lostReasonIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.lost.CrmLostReason")
        @OdooModel("crm.lost.CrmLostReason")
    
    private OdooId lostReasonId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int id;

    
    private Object lostFeedback;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private List<CrmLead> leadIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> leadIds;


    public CrmLeadLost() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public CrmLostReason getLostReasonIdAsObject() {
        return lostReasonIdAsObject;
    }

    public OdooId getLostReasonId() {
        return lostReasonId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public int getId() {
        return id;
    }

    public Object getLostFeedback() {
        return lostFeedback;
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

    public Date getCreateDate() {
        return createDate;
    }

    public List<CrmLead> getLeadIdsAsList() {
        return leadIdsAsList;
    }

    public List<Integer> getLeadIds() {
        return leadIds;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setLostReasonIdAsObject(CrmLostReason lostReasonIdAsObject) {
        this.lostReasonIdAsObject = lostReasonIdAsObject;
    }

    public void setLostReasonId(OdooId lostReasonId) {
        this.lostReasonId = lostReasonId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLostFeedback(Object lostFeedback) {
        this.lostFeedback = lostFeedback;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLeadIdsAsList(List<CrmLead> leadIdsAsList) {
        this.leadIdsAsList = leadIdsAsList;
    }

    public void setLeadIds(List<Integer> leadIds) {
        this.leadIds = leadIds;
    }



}