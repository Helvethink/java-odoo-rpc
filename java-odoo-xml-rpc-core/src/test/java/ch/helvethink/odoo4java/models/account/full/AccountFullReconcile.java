
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

package ch.helvethink.odoo4java.models.account.full;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.AccountMove;
import ch.helvethink.odoo4java.models.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.full.reconcile")
public class AccountFullReconcile implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<AccountPartialReconcile> partialReconcileIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
        @JsonProperty("partial_reconcile_ids")
        private List<Integer> partialReconcileIds;
    

    
        private AccountMove exchangeMoveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("exchange_move_id")
        private OdooId exchangeMoveId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private List<AccountMoveLine> reconciledLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("reconciled_line_ids")
        private List<Integer> reconciledLineIds;
    


    public AccountFullReconcile() {
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

    public List<AccountPartialReconcile> getPartialReconcileIdsAsList() {
        return partialReconcileIdsAsList;
    }

    public List<Integer> getPartialReconcileIds() {
        return partialReconcileIds;
    }

    public AccountMove getExchangeMoveIdAsObject() {
        return exchangeMoveIdAsObject;
    }

    public OdooId getExchangeMoveId() {
        return exchangeMoveId;
    }

    public int getId() {
        return id;
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

    public List<AccountMoveLine> getReconciledLineIdsAsList() {
        return reconciledLineIdsAsList;
    }

    public List<Integer> getReconciledLineIds() {
        return reconciledLineIds;
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

    public void setPartialReconcileIdsAsList(List<AccountPartialReconcile> partialReconcileIdsAsList) {
        this.partialReconcileIdsAsList = partialReconcileIdsAsList;
    }

    public void setPartialReconcileIds(List<Integer> partialReconcileIds) {
        this.partialReconcileIds = partialReconcileIds;
    }

    public void setExchangeMoveIdAsObject(AccountMove exchangeMoveIdAsObject) {
        this.exchangeMoveIdAsObject = exchangeMoveIdAsObject;
    }

    public void setExchangeMoveId(OdooId exchangeMoveId) {
        this.exchangeMoveId = exchangeMoveId;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setReconciledLineIdsAsList(List<AccountMoveLine> reconciledLineIdsAsList) {
        this.reconciledLineIdsAsList = reconciledLineIdsAsList;
    }

    public void setReconciledLineIds(List<Integer> reconciledLineIds) {
        this.reconciledLineIds = reconciledLineIds;
    }



}