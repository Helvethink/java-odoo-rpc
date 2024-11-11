
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

package ch.helvethink.odoo4java.test.ng.account.payment.method;

import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentMethod;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.payment.PaymentProvider;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("account.payment.method.line")
public class AccountPaymentMethodLine implements OdooObj {

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private Date writeDate;

    
    private PaymentProvider paymentProviderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentProvider")
        @OdooModel("payment.PaymentProvider")
    
    private OdooId paymentProviderId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Account paymentAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId paymentAccountId;

    
    private int sequence;

    
    private AccountPaymentMethod paymentMethodIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
    
    private OdooId paymentMethodId;

    
    private Object paymentType;

    
    private List<AccountPaymentMethod> availablePaymentMethodIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
    
    private List<Integer> availablePaymentMethodIds;

    
    private String name;

    
    private int id;

    
    private Date createDate;

    
    private Object paymentProviderState;


    public AccountPaymentMethodLine() {
    // Constructor
    }


    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public PaymentProvider getPaymentProviderIdAsObject() {
        return paymentProviderIdAsObject;
    }

    public OdooId getPaymentProviderId() {
        return paymentProviderId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getCode() {
        return code;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
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

    public Account getPaymentAccountIdAsObject() {
        return paymentAccountIdAsObject;
    }

    public OdooId getPaymentAccountId() {
        return paymentAccountId;
    }

    public int getSequence() {
        return sequence;
    }

    public AccountPaymentMethod getPaymentMethodIdAsObject() {
        return paymentMethodIdAsObject;
    }

    public OdooId getPaymentMethodId() {
        return paymentMethodId;
    }

    public Object getPaymentType() {
        return paymentType;
    }

    public List<AccountPaymentMethod> getAvailablePaymentMethodIdsAsList() {
        return availablePaymentMethodIdsAsList;
    }

    public List<Integer> getAvailablePaymentMethodIds() {
        return availablePaymentMethodIds;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getPaymentProviderState() {
        return paymentProviderState;
    }



    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPaymentProviderIdAsObject(PaymentProvider paymentProviderIdAsObject) {
        this.paymentProviderIdAsObject = paymentProviderIdAsObject;
    }

    public void setPaymentProviderId(OdooId paymentProviderId) {
        this.paymentProviderId = paymentProviderId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
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

    public void setPaymentAccountIdAsObject(Account paymentAccountIdAsObject) {
        this.paymentAccountIdAsObject = paymentAccountIdAsObject;
    }

    public void setPaymentAccountId(OdooId paymentAccountId) {
        this.paymentAccountId = paymentAccountId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setPaymentMethodIdAsObject(AccountPaymentMethod paymentMethodIdAsObject) {
        this.paymentMethodIdAsObject = paymentMethodIdAsObject;
    }

    public void setPaymentMethodId(OdooId paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setPaymentType(Object paymentType) {
        this.paymentType = paymentType;
    }

    public void setAvailablePaymentMethodIdsAsList(List<AccountPaymentMethod> availablePaymentMethodIdsAsList) {
        this.availablePaymentMethodIdsAsList = availablePaymentMethodIdsAsList;
    }

    public void setAvailablePaymentMethodIds(List<Integer> availablePaymentMethodIds) {
        this.availablePaymentMethodIds = availablePaymentMethodIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPaymentProviderState(Object paymentProviderState) {
        this.paymentProviderState = paymentProviderState;
    }



}