
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

package ch.helvethink.odoo4java.test.ng.payment.capture;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("payment.capture.wizard")
public class PaymentCaptureWizard implements OdooObj {

    
    private boolean isHasRemainingAmount;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object availableAmount;

    
    private Object voidedAmount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object capturedAmount;

    
    private boolean isVoidRemainingAmount;

    
    private boolean isSupportPartialCapture;

    
    private boolean isHasDraftChildren;

    
    private Object authorizedAmount;

    
    private List<PaymentTransaction> transactionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private List<Integer> transactionIds;

    
    private int id;

    
    private Object amountToCapture;

    
    private boolean isIsAmountToCaptureValid;

    
    private Date createDate;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public PaymentCaptureWizard() {
    // Constructor
    }


    public boolean getIsHasRemainingAmount() {
        return isHasRemainingAmount;
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

    public Object getAvailableAmount() {
        return availableAmount;
    }

    public Object getVoidedAmount() {
        return voidedAmount;
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

    public Object getCapturedAmount() {
        return capturedAmount;
    }

    public boolean getIsVoidRemainingAmount() {
        return isVoidRemainingAmount;
    }

    public boolean getIsSupportPartialCapture() {
        return isSupportPartialCapture;
    }

    public boolean getIsHasDraftChildren() {
        return isHasDraftChildren;
    }

    public Object getAuthorizedAmount() {
        return authorizedAmount;
    }

    public List<PaymentTransaction> getTransactionIdsAsList() {
        return transactionIdsAsList;
    }

    public List<Integer> getTransactionIds() {
        return transactionIds;
    }

    public int getId() {
        return id;
    }

    public Object getAmountToCapture() {
        return amountToCapture;
    }

    public boolean getIsIsAmountToCaptureValid() {
        return isIsAmountToCaptureValid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setIsHasRemainingAmount(boolean isHasRemainingAmount) {
        this.isHasRemainingAmount = isHasRemainingAmount;
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

    public void setAvailableAmount(Object availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setVoidedAmount(Object voidedAmount) {
        this.voidedAmount = voidedAmount;
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

    public void setCapturedAmount(Object capturedAmount) {
        this.capturedAmount = capturedAmount;
    }

    public void setIsVoidRemainingAmount(boolean isVoidRemainingAmount) {
        this.isVoidRemainingAmount = isVoidRemainingAmount;
    }

    public void setIsSupportPartialCapture(boolean isSupportPartialCapture) {
        this.isSupportPartialCapture = isSupportPartialCapture;
    }

    public void setIsHasDraftChildren(boolean isHasDraftChildren) {
        this.isHasDraftChildren = isHasDraftChildren;
    }

    public void setAuthorizedAmount(Object authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    public void setTransactionIdsAsList(List<PaymentTransaction> transactionIdsAsList) {
        this.transactionIdsAsList = transactionIdsAsList;
    }

    public void setTransactionIds(List<Integer> transactionIds) {
        this.transactionIds = transactionIds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmountToCapture(Object amountToCapture) {
        this.amountToCapture = amountToCapture;
    }

    public void setIsIsAmountToCaptureValid(boolean isIsAmountToCaptureValid) {
        this.isIsAmountToCaptureValid = isIsAmountToCaptureValid;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}