
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

package ch.helvethink.odoo4java.models.account.cash;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.cash.rounding")
public class AccountCashRounding implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private Account profitAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("profit_account_id")
        private OdooId profitAccountId;
    

    
        @JsonProperty("rounding")
        private double rounding;
    

    
        private Account lossAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("loss_account_id")
        private OdooId lossAccountId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("strategy")
        private Object strategy;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("rounding_method")
        private Object roundingMethod;
    


    public AccountCashRounding() {
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

    public String getName() {
        return name;
    }

    public Account getProfitAccountIdAsObject() {
        return profitAccountIdAsObject;
    }

    public OdooId getProfitAccountId() {
        return profitAccountId;
    }

    public double getRounding() {
        return rounding;
    }

    public Account getLossAccountIdAsObject() {
        return lossAccountIdAsObject;
    }

    public OdooId getLossAccountId() {
        return lossAccountId;
    }

    public int getId() {
        return id;
    }

    public Object getStrategy() {
        return strategy;
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

    public Object getRoundingMethod() {
        return roundingMethod;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setProfitAccountIdAsObject(Account profitAccountIdAsObject) {
        this.profitAccountIdAsObject = profitAccountIdAsObject;
    }

    public void setProfitAccountId(OdooId profitAccountId) {
        this.profitAccountId = profitAccountId;
    }

    public void setRounding(double rounding) {
        this.rounding = rounding;
    }

    public void setLossAccountIdAsObject(Account lossAccountIdAsObject) {
        this.lossAccountIdAsObject = lossAccountIdAsObject;
    }

    public void setLossAccountId(OdooId lossAccountId) {
        this.lossAccountId = lossAccountId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStrategy(Object strategy) {
        this.strategy = strategy;
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

    public void setRoundingMethod(Object roundingMethod) {
        this.roundingMethod = roundingMethod;
    }



}