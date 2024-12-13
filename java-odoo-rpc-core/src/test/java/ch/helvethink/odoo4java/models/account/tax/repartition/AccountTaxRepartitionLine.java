
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

package ch.helvethink.odoo4java.models.account.tax.repartition;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountTax;
import ch.helvethink.odoo4java.models.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.tax.repartition.line")
public class AccountTaxRepartitionLine implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<AccountAccountTag> tagIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.account.AccountAccountTag")
        @OdooModel("account.account.AccountAccountTag")
        @JsonProperty("tag_ids")
        private List<Integer> tagIds;
    

    
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
    

    
        @JsonProperty("repartition_type")
        private Object repartitionType;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private AccountTax taxIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("tax_id")
        private OdooId taxId;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("tag_ids_domain")
        private Object tagIdsDomain;
    

    
        private Account accountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_id")
        private OdooId accountId;
    

    
        @JsonProperty("factor_percent")
        private double factorPercent;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("factor")
        private double factor;
    

    
        @JsonProperty("use_in_tax_closing")
        private boolean isUseInTaxClosing;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("document_type")
        private Object documentType;
    


    public AccountTaxRepartitionLine() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<AccountAccountTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
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

    public Object getRepartitionType() {
        return repartitionType;
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

    public AccountTax getTaxIdAsObject() {
        return taxIdAsObject;
    }

    public OdooId getTaxId() {
        return taxId;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getTagIdsDomain() {
        return tagIdsDomain;
    }

    public Account getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public double getFactorPercent() {
        return factorPercent;
    }

    public int getId() {
        return id;
    }

    public double getFactor() {
        return factor;
    }

    public boolean getIsUseInTaxClosing() {
        return isUseInTaxClosing;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getDocumentType() {
        return documentType;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setTagIdsAsList(List<AccountAccountTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
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

    public void setRepartitionType(Object repartitionType) {
        this.repartitionType = repartitionType;
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

    public void setTaxIdAsObject(AccountTax taxIdAsObject) {
        this.taxIdAsObject = taxIdAsObject;
    }

    public void setTaxId(OdooId taxId) {
        this.taxId = taxId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setTagIdsDomain(Object tagIdsDomain) {
        this.tagIdsDomain = tagIdsDomain;
    }

    public void setAccountIdAsObject(Account accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setFactorPercent(double factorPercent) {
        this.factorPercent = factorPercent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public void setIsUseInTaxClosing(boolean isUseInTaxClosing) {
        this.isUseInTaxClosing = isUseInTaxClosing;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDocumentType(Object documentType) {
        this.documentType = documentType;
    }



}