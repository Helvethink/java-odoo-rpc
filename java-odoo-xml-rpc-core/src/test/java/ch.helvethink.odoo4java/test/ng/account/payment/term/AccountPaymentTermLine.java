
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

package ch.helvethink.odoo4java.test.ng.account.payment.term;

import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.payment.term.line")
public class AccountPaymentTermLine implements OdooObj {

    
    private Date writeDate;

    
    private Object delayType;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private double valueAmount;

    
    private String daysNextMonth;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int nbDays;

    
    private AccountPaymentTerm paymentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId paymentId;

    
    private boolean isDisplayDaysNextMonth;

    
    private int id;

    
    private Date createDate;

    
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