
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

package ch.helvethink.odoo4java.test.ng.account.reconcile.model;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.account.reconcile.AccountReconcileModel;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("account.reconcile.model.line")
public class AccountReconcileModelLine implements OdooObj {

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private String amountString;

    
    private Date writeDate;

    
    private Object analyticDistributionSearch;

    
    private double amount;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<AccountTax> taxIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> taxIds;

    
    private AccountReconcileModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.reconcile.AccountReconcileModel")
        @OdooModel("account.reconcile.AccountReconcileModel")
    
    private OdooId modelId;

    
    private boolean isAllowPaymentTolerance;

    
    private String label;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object analyticDistribution;

    
    private int sequence;

    
    private Object amountType;

    
    private Object ruleType;

    
    private Account accountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountId;

    
    private boolean isForceTaxIncluded;

    
    private boolean isShowForceTaxIncluded;

    
    private int analyticPrecision;

    
    private double paymentToleranceParam;

    
    private int id;

    
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

    public Object getAnalyticDistributionSearch() {
        return analyticDistributionSearch;
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

    public void setAnalyticDistributionSearch(Object analyticDistributionSearch) {
        this.analyticDistributionSearch = analyticDistributionSearch;
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