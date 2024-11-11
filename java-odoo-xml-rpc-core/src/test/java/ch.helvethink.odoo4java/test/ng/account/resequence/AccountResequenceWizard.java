
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

package ch.helvethink.odoo4java.test.ng.account.resequence;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.resequence.wizard")
public class AccountResequenceWizard implements OdooObj {

    
    private Object endDate;

    
    private Date writeDate;

    
    private List<AccountMove> moveIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> moveIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object ordering;

    
    private String sequenceNumberReset;

    
    private Object previewMoves;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object newValues;

    
    private int id;

    
    private Date createDate;

    
    private String firstName;

    
    private Object firstDate;


    public AccountResequenceWizard() {
    // Constructor
    }


    public Object getEndDate() {
        return endDate;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public List<AccountMove> getMoveIdsAsList() {
        return moveIdsAsList;
    }

    public List<Integer> getMoveIds() {
        return moveIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getOrdering() {
        return ordering;
    }

    public String getSequenceNumberReset() {
        return sequenceNumberReset;
    }

    public Object getPreviewMoves() {
        return previewMoves;
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

    public Object getNewValues() {
        return newValues;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public Object getFirstDate() {
        return firstDate;
    }



    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMoveIdsAsList(List<AccountMove> moveIdsAsList) {
        this.moveIdsAsList = moveIdsAsList;
    }

    public void setMoveIds(List<Integer> moveIds) {
        this.moveIds = moveIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setOrdering(Object ordering) {
        this.ordering = ordering;
    }

    public void setSequenceNumberReset(String sequenceNumberReset) {
        this.sequenceNumberReset = sequenceNumberReset;
    }

    public void setPreviewMoves(Object previewMoves) {
        this.previewMoves = previewMoves;
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

    public void setNewValues(Object newValues) {
        this.newValues = newValues;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstDate(Object firstDate) {
        this.firstDate = firstDate;
    }



}