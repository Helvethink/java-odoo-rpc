
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

package ch.helvethink.odoo4java.models.account.payment.method;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.payment.method.line")
public class AccountPaymentMethodLine implements OdooObj {

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("code")
        private String code;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private Account paymentAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("payment_account_id")
        private OdooId paymentAccountId;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        private AccountPaymentMethod paymentMethodIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
        @JsonProperty("payment_method_id")
        private OdooId paymentMethodId;
    

    
        @JsonProperty("payment_type")
        private Object paymentType;
    

    
        private List<AccountPaymentMethod> availablePaymentMethodIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
        @JsonProperty("available_payment_method_ids")
        private List<Integer> availablePaymentMethodIds;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("payment_provider_state")
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