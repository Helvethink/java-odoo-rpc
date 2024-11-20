
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

package ch.helvethink.odoo4java.models.account.reconcile.model;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.AccountTax;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.models.account.reconcile.AccountReconcileModel;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.reconcile.model.line")
public class AccountReconcileModelLine implements OdooObj {

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("amount_string")
        private String amountString;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("amount")
        private double amount;
    

    
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
    

    
        private List<AccountTax> taxIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("tax_ids")
        private List<Integer> taxIds;
    

    
        private AccountReconcileModel modelIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.reconcile.AccountReconcileModel")
        @OdooModel("account.reconcile.AccountReconcileModel")
        @JsonProperty("model_id")
        private OdooId modelId;
    

    
        @JsonProperty("allow_payment_tolerance")
        private boolean isAllowPaymentTolerance;
    

    
        @JsonProperty("label")
        private String label;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("analytic_distribution")
        private Object analyticDistribution;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("amount_type")
        private Object amountType;
    

    
        @JsonProperty("rule_type")
        private Object ruleType;
    

    
        private Account accountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_id")
        private OdooId accountId;
    

    
        @JsonProperty("force_tax_included")
        private boolean isForceTaxIncluded;
    

    
        @JsonProperty("show_force_tax_included")
        private boolean isShowForceTaxIncluded;
    

    
        private List<AccountAnalyticAccount> distributionAnalyticAccountIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("distribution_analytic_account_ids")
        private List<Integer> distributionAnalyticAccountIds;
    

    
        @JsonProperty("analytic_precision")
        private int analyticPrecision;
    

    
        @JsonProperty("payment_tolerance_param")
        private double paymentToleranceParam;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public AccountReconcileModelLine() {
    // Constructor
    }


    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public String getAmountString() {
        return amountString;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public double getAmount() {
        return amount;
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

    public List<AccountTax> getTaxIdsAsList() {
        return taxIdsAsList;
    }

    public List<Integer> getTaxIds() {
        return taxIds;
    }

    public AccountReconcileModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public boolean getIsAllowPaymentTolerance() {
        return isAllowPaymentTolerance;
    }

    public String getLabel() {
        return label;
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

    public Object getAnalyticDistribution() {
        return analyticDistribution;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getAmountType() {
        return amountType;
    }

    public Object getRuleType() {
        return ruleType;
    }

    public Account getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public boolean getIsForceTaxIncluded() {
        return isForceTaxIncluded;
    }

    public boolean getIsShowForceTaxIncluded() {
        return isShowForceTaxIncluded;
    }

    public List<AccountAnalyticAccount> getDistributionAnalyticAccountIdsAsList() {
        return distributionAnalyticAccountIdsAsList;
    }

    public List<Integer> getDistributionAnalyticAccountIds() {
        return distributionAnalyticAccountIds;
    }

    public int getAnalyticPrecision() {
        return analyticPrecision;
    }

    public double getPaymentToleranceParam() {
        return paymentToleranceParam;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setAmountString(String amountString) {
        this.amountString = amountString;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public void setTaxIdsAsList(List<AccountTax> taxIdsAsList) {
        this.taxIdsAsList = taxIdsAsList;
    }

    public void setTaxIds(List<Integer> taxIds) {
        this.taxIds = taxIds;
    }

    public void setModelIdAsObject(AccountReconcileModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setIsAllowPaymentTolerance(boolean isAllowPaymentTolerance) {
        this.isAllowPaymentTolerance = isAllowPaymentTolerance;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public void setAnalyticDistribution(Object analyticDistribution) {
        this.analyticDistribution = analyticDistribution;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setAmountType(Object amountType) {
        this.amountType = amountType;
    }

    public void setRuleType(Object ruleType) {
        this.ruleType = ruleType;
    }

    public void setAccountIdAsObject(Account accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setIsForceTaxIncluded(boolean isForceTaxIncluded) {
        this.isForceTaxIncluded = isForceTaxIncluded;
    }

    public void setIsShowForceTaxIncluded(boolean isShowForceTaxIncluded) {
        this.isShowForceTaxIncluded = isShowForceTaxIncluded;
    }

    public void setDistributionAnalyticAccountIdsAsList(List<AccountAnalyticAccount> distributionAnalyticAccountIdsAsList) {
        this.distributionAnalyticAccountIdsAsList = distributionAnalyticAccountIdsAsList;
    }

    public void setDistributionAnalyticAccountIds(List<Integer> distributionAnalyticAccountIds) {
        this.distributionAnalyticAccountIds = distributionAnalyticAccountIds;
    }

    public void setAnalyticPrecision(int analyticPrecision) {
        this.analyticPrecision = analyticPrecision;
    }

    public void setPaymentToleranceParam(double paymentToleranceParam) {
        this.paymentToleranceParam = paymentToleranceParam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}