
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

package ch.helvethink.odoo4java.models.account.fiscal.position;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.fiscal.position.account")
public class AccountFiscalPositionAccount implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private Account accountDestIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_dest_id")
        private OdooId accountDestId;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        private Account accountSrcIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_src_id")
        private OdooId accountSrcId;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private AccountFiscalPosition positionIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
        @JsonProperty("position_id")
        private OdooId positionId;
    


    public AccountFiscalPositionAccount() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Account getAccountDestIdAsObject() {
        return accountDestIdAsObject;
    }

    public OdooId getAccountDestId() {
        return accountDestId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public int getId() {
        return id;
    }

    public Account getAccountSrcIdAsObject() {
        return accountSrcIdAsObject;
    }

    public OdooId getAccountSrcId() {
        return accountSrcId;
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

    public AccountFiscalPosition getPositionIdAsObject() {
        return positionIdAsObject;
    }

    public OdooId getPositionId() {
        return positionId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAccountDestIdAsObject(Account accountDestIdAsObject) {
        this.accountDestIdAsObject = accountDestIdAsObject;
    }

    public void setAccountDestId(OdooId accountDestId) {
        this.accountDestId = accountDestId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountSrcIdAsObject(Account accountSrcIdAsObject) {
        this.accountSrcIdAsObject = accountSrcIdAsObject;
    }

    public void setAccountSrcId(OdooId accountSrcId) {
        this.accountSrcId = accountSrcId;
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

    public void setPositionIdAsObject(AccountFiscalPosition positionIdAsObject) {
        this.positionIdAsObject = positionIdAsObject;
    }

    public void setPositionId(OdooId positionId) {
        this.positionId = positionId;
    }



}