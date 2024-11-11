
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

package ch.helvethink.odoo4java.test.ng.account.partial;

import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.full.AccountFullReconcile;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine;
import java.util.Date;;

@OdooObject("account.partial.reconcile")
public class AccountPartialReconcile implements OdooObj {

    
    private Date writeDate;

    
    private Object amount;

    
    private Object maxDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private AccountFullReconcile fullReconcileIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.full.AccountFullReconcile")
        @OdooModel("account.full.AccountFullReconcile")
    
    private OdooId fullReconcileId;

    
    private ResCurrency creditCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId creditCurrencyId;

    
    private Object creditAmountCurrency;

    
    private ResCurrency companyCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrencyId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ResCurrency debitCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId debitCurrencyId;

    
    private AccountMoveLine debitMoveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private OdooId debitMoveId;

    
    private Object debitAmountCurrency;

    
    private AccountMove exchangeMoveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId exchangeMoveId;

    
    private AccountMoveLine creditMoveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private OdooId creditMoveId;

    
    private int id;

    
    private Date createDate;


    public AccountPartialReconcile() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getAmount() {
        return amount;
    }

    public Object getMaxDate() {
        return maxDate;
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

    public AccountFullReconcile getFullReconcileIdAsObject() {
        return fullReconcileIdAsObject;
    }

    public OdooId getFullReconcileId() {
        return fullReconcileId;
    }

    public ResCurrency getCreditCurrencyIdAsObject() {
        return creditCurrencyIdAsObject;
    }

    public OdooId getCreditCurrencyId() {
        return creditCurrencyId;
    }

    public Object getCreditAmountCurrency() {
        return creditAmountCurrency;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
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

    public ResCurrency getDebitCurrencyIdAsObject() {
        return debitCurrencyIdAsObject;
    }

    public OdooId getDebitCurrencyId() {
        return debitCurrencyId;
    }

    public AccountMoveLine getDebitMoveIdAsObject() {
        return debitMoveIdAsObject;
    }

    public OdooId getDebitMoveId() {
        return debitMoveId;
    }

    public Object getDebitAmountCurrency() {
        return debitAmountCurrency;
    }

    public AccountMove getExchangeMoveIdAsObject() {
        return exchangeMoveIdAsObject;
    }

    public OdooId getExchangeMoveId() {
        return exchangeMoveId;
    }

    public AccountMoveLine getCreditMoveIdAsObject() {
        return creditMoveIdAsObject;
    }

    public OdooId getCreditMoveId() {
        return creditMoveId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setMaxDate(Object maxDate) {
        this.maxDate = maxDate;
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

    public void setFullReconcileIdAsObject(AccountFullReconcile fullReconcileIdAsObject) {
        this.fullReconcileIdAsObject = fullReconcileIdAsObject;
    }

    public void setFullReconcileId(OdooId fullReconcileId) {
        this.fullReconcileId = fullReconcileId;
    }

    public void setCreditCurrencyIdAsObject(ResCurrency creditCurrencyIdAsObject) {
        this.creditCurrencyIdAsObject = creditCurrencyIdAsObject;
    }

    public void setCreditCurrencyId(OdooId creditCurrencyId) {
        this.creditCurrencyId = creditCurrencyId;
    }

    public void setCreditAmountCurrency(Object creditAmountCurrency) {
        this.creditAmountCurrency = creditAmountCurrency;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
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

    public void setDebitCurrencyIdAsObject(ResCurrency debitCurrencyIdAsObject) {
        this.debitCurrencyIdAsObject = debitCurrencyIdAsObject;
    }

    public void setDebitCurrencyId(OdooId debitCurrencyId) {
        this.debitCurrencyId = debitCurrencyId;
    }

    public void setDebitMoveIdAsObject(AccountMoveLine debitMoveIdAsObject) {
        this.debitMoveIdAsObject = debitMoveIdAsObject;
    }

    public void setDebitMoveId(OdooId debitMoveId) {
        this.debitMoveId = debitMoveId;
    }

    public void setDebitAmountCurrency(Object debitAmountCurrency) {
        this.debitAmountCurrency = debitAmountCurrency;
    }

    public void setExchangeMoveIdAsObject(AccountMove exchangeMoveIdAsObject) {
        this.exchangeMoveIdAsObject = exchangeMoveIdAsObject;
    }

    public void setExchangeMoveId(OdooId exchangeMoveId) {
        this.exchangeMoveId = exchangeMoveId;
    }

    public void setCreditMoveIdAsObject(AccountMoveLine creditMoveIdAsObject) {
        this.creditMoveIdAsObject = creditMoveIdAsObject;
    }

    public void setCreditMoveId(OdooId creditMoveId) {
        this.creditMoveId = creditMoveId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}