
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

package ch.helvethink.odoo4java.models.account.payment.term;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.payment.term.line")
public class AccountPaymentTermLine implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("delay_type")
        private Object delayType;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("value_amount")
        private double valueAmount;
    

    
        @JsonProperty("days_next_month")
        private String daysNextMonth;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("nb_days")
        private int nbDays;
    

    
        private AccountPaymentTerm paymentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
        @JsonProperty("payment_id")
        private OdooId paymentId;
    

    
        @JsonProperty("display_days_next_month")
        private boolean isDisplayDaysNextMonth;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("value")
        private Object value;
    


    public AccountPaymentTermLine() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getDelayType() {
        return delayType;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public double getValueAmount() {
        return valueAmount;
    }

    public String getDaysNextMonth() {
        return daysNextMonth;
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

    public int getNbDays() {
        return nbDays;
    }

    public AccountPaymentTerm getPaymentIdAsObject() {
        return paymentIdAsObject;
    }

    public OdooId getPaymentId() {
        return paymentId;
    }

    public boolean getIsDisplayDaysNextMonth() {
        return isDisplayDaysNextMonth;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getValue() {
        return value;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setDelayType(Object delayType) {
        this.delayType = delayType;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setValueAmount(double valueAmount) {
        this.valueAmount = valueAmount;
    }

    public void setDaysNextMonth(String daysNextMonth) {
        this.daysNextMonth = daysNextMonth;
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

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }

    public void setPaymentIdAsObject(AccountPaymentTerm paymentIdAsObject) {
        this.paymentIdAsObject = paymentIdAsObject;
    }

    public void setPaymentId(OdooId paymentId) {
        this.paymentId = paymentId;
    }

    public void setIsDisplayDaysNextMonth(boolean isDisplayDaysNextMonth) {
        this.isDisplayDaysNextMonth = isDisplayDaysNextMonth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setValue(Object value) {
        this.value = value;
    }



}