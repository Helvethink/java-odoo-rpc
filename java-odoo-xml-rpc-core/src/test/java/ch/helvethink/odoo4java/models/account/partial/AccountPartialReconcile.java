
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

package ch.helvethink.odoo4java.models.account.partial;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.AccountMove;
import ch.helvethink.odoo4java.models.account.full.AccountFullReconcile;
import ch.helvethink.odoo4java.models.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.partial.reconcile")
public class AccountPartialReconcile implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("amount")
        private Object amount;
    

    
        @JsonProperty("max_date")
        private Date maxDate;
    

    
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
    

    
        private AccountFullReconcile fullReconcileIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.full.AccountFullReconcile")
        @OdooModel("account.full.AccountFullReconcile")
        @JsonProperty("full_reconcile_id")
        private OdooId fullReconcileId;
    

    
        private ResCurrency creditCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("credit_currency_id")
        private OdooId creditCurrencyId;
    

    
        @JsonProperty("credit_amount_currency")
        private Object creditAmountCurrency;
    

    
        private ResCurrency companyCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("company_currency_id")
        private OdooId companyCurrencyId;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private ResCurrency debitCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("debit_currency_id")
        private OdooId debitCurrencyId;
    

    
        private AccountMoveLine debitMoveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("debit_move_id")
        private OdooId debitMoveId;
    

    
        @JsonProperty("debit_amount_currency")
        private Object debitAmountCurrency;
    

    
        private AccountMove exchangeMoveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("exchange_move_id")
        private OdooId exchangeMoveId;
    

    
        private AccountMoveLine creditMoveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("credit_move_id")
        private OdooId creditMoveId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
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

    public Date getMaxDate() {
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

    public void setMaxDate(Date maxDate) {
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