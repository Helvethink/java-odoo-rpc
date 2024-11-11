
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

package ch.helvethink.odoo4java.test.ng.payment.refund;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.AccountPayment;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("payment.refund.wizard")
public class PaymentRefundWizard implements OdooObj {

    
    private PaymentTransaction transactionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private OdooId transactionId;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object amountToRefund;

    
    private Object paymentAmount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object refundedAmount;

    
    private Object supportRefund;

    
    private boolean isHasPendingRefund;

    
    private AccountPayment paymentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountPayment")
        @OdooModel("account.AccountPayment")
    
    private OdooId paymentId;

    
    private Object amountAvailableForRefund;

    
    private int id;

    
    private Date createDate;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public PaymentRefundWizard() {
    // Constructor
    }


    public PaymentTransaction getTransactionIdAsObject() {
        return transactionIdAsObject;
    }

    public OdooId getTransactionId() {
        return transactionId;
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

    public Object getAmountToRefund() {
        return amountToRefund;
    }

    public Object getPaymentAmount() {
        return paymentAmount;
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

    public Object getRefundedAmount() {
        return refundedAmount;
    }

    public Object getSupportRefund() {
        return supportRefund;
    }

    public boolean getIsHasPendingRefund() {
        return isHasPendingRefund;
    }

    public AccountPayment getPaymentIdAsObject() {
        return paymentIdAsObject;
    }

    public OdooId getPaymentId() {
        return paymentId;
    }

    public Object getAmountAvailableForRefund() {
        return amountAvailableForRefund;
    }

    public int getId() {
        return id;
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



    public void setTransactionIdAsObject(PaymentTransaction transactionIdAsObject) {
        this.transactionIdAsObject = transactionIdAsObject;
    }

    public void setTransactionId(OdooId transactionId) {
        this.transactionId = transactionId;
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

    public void setAmountToRefund(Object amountToRefund) {
        this.amountToRefund = amountToRefund;
    }

    public void setPaymentAmount(Object paymentAmount) {
        this.paymentAmount = paymentAmount;
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

    public void setRefundedAmount(Object refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    public void setSupportRefund(Object supportRefund) {
        this.supportRefund = supportRefund;
    }

    public void setIsHasPendingRefund(boolean isHasPendingRefund) {
        this.isHasPendingRefund = isHasPendingRefund;
    }

    public void setPaymentIdAsObject(AccountPayment paymentIdAsObject) {
        this.paymentIdAsObject = paymentIdAsObject;
    }

    public void setPaymentId(OdooId paymentId) {
        this.paymentId = paymentId;
    }

    public void setAmountAvailableForRefund(Object amountAvailableForRefund) {
        this.amountAvailableForRefund = amountAvailableForRefund;
    }

    public void setId(int id) {
        this.id = id;
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