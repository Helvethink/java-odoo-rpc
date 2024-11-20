
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

package ch.helvethink.odoo4java.models.account.move;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.*;
import ch.helvethink.odoo4java.models.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.models.account.bank.AccountBankStatement;
import ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine;
import ch.helvethink.odoo4java.models.account.full.AccountFullReconcile;
import ch.helvethink.odoo4java.models.account.journal.AccountJournalGroup;
import ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile;
import ch.helvethink.odoo4java.models.account.reconcile.AccountReconcileModel;
import ch.helvethink.odoo4java.models.account.tax.AccountTaxGroup;
import ch.helvethink.odoo4java.models.account.tax.repartition.AccountTaxRepartitionLine;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.move.line")
public class AccountMoveLine implements OdooObj {

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("account_type")
        private Object accountType;
    

    
        private List<AccountTax> taxIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("tax_ids")
        private List<Integer> taxIds;
    

    
        private AccountRoot accountRootIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountRoot")
        @OdooModel("account.AccountRoot")
        @JsonProperty("account_root_id")
        private OdooId accountRootId;
    

    
        @JsonProperty("price_subtotal")
        private Object priceSubtotal;
    

    
        @JsonProperty("is_storno")
        private boolean isIsStorno;
    

    
        @JsonProperty("discount")
        private double discount;
    

    
        private AccountTax groupTaxIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("group_tax_id")
        private OdooId groupTaxId;
    

    
        private AccountTaxRepartitionLine taxRepartitionLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
        @JsonProperty("tax_repartition_line_id")
        private OdooId taxRepartitionLineId;
    

    
        private AccountTax taxLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("tax_line_id")
        private OdooId taxLineId;
    

    
        @JsonProperty("ref")
        private String ref;
    

    
        private AccountReconcileModel reconcileModelIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.reconcile.AccountReconcileModel")
        @OdooModel("account.reconcile.AccountReconcileModel")
        @JsonProperty("reconcile_model_id")
        private OdooId reconcileModelId;
    

    
        @JsonProperty("matching_number")
        private String matchingNumber;
    

    
        @JsonProperty("balance")
        private Object balance;
    

    
        @JsonProperty("move_name")
        private String moveName;
    

    
        @JsonProperty("is_downpayment")
        private boolean isIsDownpayment;
    

    
        @JsonProperty("is_account_reconcile")
        private boolean isIsAccountReconcile;
    

    
        private List<AccountAnalyticAccount> distributionAnalyticAccountIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("distribution_analytic_account_ids")
        private List<Integer> distributionAnalyticAccountIds;
    

    
        @JsonProperty("analytic_precision")
        private int analyticPrecision;
    

    
        @JsonProperty("epd_key")
        private Object epdKey;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("credit")
        private Object credit;
    

    
        @JsonProperty("is_same_currency")
        private boolean isIsSameCurrency;
    

    
        @JsonProperty("discount_allocation_dirty")
        private boolean isDiscountAllocationDirty;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("tax_base_amount")
        private Object taxBaseAmount;
    

    
        @JsonProperty("term_key")
        private Object termKey;
    

    
        @JsonProperty("payment_date")
        private Date paymentDate;
    

    
        @JsonProperty("amount_residual")
        private Object amountResidual;
    

    
        @JsonProperty("tax_calculation_rounding_method")
        private Object taxCalculationRoundingMethod;
    

    
        @JsonProperty("reconciled")
        private boolean isReconciled;
    

    
        private AccountJournalGroup journalGroupIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.journal.AccountJournalGroup")
        @OdooModel("account.journal.AccountJournalGroup")
        @JsonProperty("journal_group_id")
        private OdooId journalGroupId;
    

    
        @JsonProperty("cumulated_balance")
        private Object cumulatedBalance;
    

    
        private List<AccountPartialReconcile> matchedDebitIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
        @JsonProperty("matched_debit_ids")
        private List<Integer> matchedDebitIds;
    

    
        private AccountBankStatement statementIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.AccountBankStatement")
        @OdooModel("account.bank.AccountBankStatement")
        @JsonProperty("statement_id")
        private OdooId statementId;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private List<AccountPartialReconcile> matchedCreditIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
        @JsonProperty("matched_credit_ids")
        private List<Integer> matchedCreditIds;
    

    
        @JsonProperty("date_maturity")
        private Date dateMaturity;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        private AccountBankStatementLine statementLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
        @JsonProperty("statement_line_id")
        private OdooId statementLineId;
    

    
        private List<AccountAccountTag> taxTagIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.account.AccountAccountTag")
        @OdooModel("account.account.AccountAccountTag")
        @JsonProperty("tax_tag_ids")
        private List<Integer> taxTagIds;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("price_total")
        private Object priceTotal;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("move_type")
        private Object moveType;
    

    
        private AccountFullReconcile fullReconcileIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.full.AccountFullReconcile")
        @OdooModel("account.full.AccountFullReconcile")
        @JsonProperty("full_reconcile_id")
        private OdooId fullReconcileId;
    

    
        private AccountTaxGroup taxGroupIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.tax.AccountTaxGroup")
        @OdooModel("account.tax.AccountTaxGroup")
        @JsonProperty("tax_group_id")
        private OdooId taxGroupId;
    

    
        @JsonProperty("discount_amount_currency")
        private Object discountAmountCurrency;
    

    
        private ResCurrency companyCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("company_currency_id")
        private OdooId companyCurrencyId;
    

    
        @JsonProperty("amount_residual_currency")
        private Object amountResidualCurrency;
    

    
        @JsonProperty("account_internal_group")
        private Object accountInternalGroup;
    

    
        @JsonProperty("discount_allocation_key")
        private Object discountAllocationKey;
    

    
        @JsonProperty("invoice_date")
        private Date invoiceDate;
    

    
        @JsonProperty("display_type")
        private Object displayType;
    

    
        @JsonProperty("analytic_distribution")
        private Object analyticDistribution;
    

    
        @JsonProperty("currency_rate")
        private double currencyRate;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        private AccountMove moveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("move_id")
        private OdooId moveId;
    

    
        private AccountPayment paymentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("payment_id")
        private OdooId paymentId;
    

    
        @JsonProperty("tax_tag_invert")
        private boolean isTaxTagInvert;
    

    
        @JsonProperty("amount_currency")
        private Object amountCurrency;
    

    
        @JsonProperty("epd_needed")
        private Object epdNeeded;
    

    
        @JsonProperty("debit")
        private Object debit;
    

    
        @JsonProperty("is_refund")
        private boolean isIsRefund;
    

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("discount_date")
        private Date discountDate;
    

    
        @JsonProperty("quantity")
        private double quantity;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("discount_balance")
        private Object discountBalance;
    

    
        @JsonProperty("epd_dirty")
        private boolean isEpdDirty;
    

    
        @JsonProperty("price_unit")
        private double priceUnit;
    

    
        @JsonProperty("parent_state")
        private Object parentState;
    

    
        private Account accountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_id")
        private OdooId accountId;
    

    
        @JsonProperty("is_imported")
        private boolean isIsImported;
    

    
        private List<AccountAnalyticLine> analyticLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
        @JsonProperty("analytic_line_ids")
        private List<Integer> analyticLineIds;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("discount_allocation_needed")
        private Object discountAllocationNeeded;
    


    public AccountMoveLine() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getAccountType() {
        return accountType;
    }

    public List<AccountTax> getTaxIdsAsList() {
        return taxIdsAsList;
    }

    public List<Integer> getTaxIds() {
        return taxIds;
    }

    public AccountRoot getAccountRootIdAsObject() {
        return accountRootIdAsObject;
    }

    public OdooId getAccountRootId() {
        return accountRootId;
    }

    public Object getPriceSubtotal() {
        return priceSubtotal;
    }

    public boolean getIsIsStorno() {
        return isIsStorno;
    }

    public double getDiscount() {
        return discount;
    }

    public AccountTax getGroupTaxIdAsObject() {
        return groupTaxIdAsObject;
    }

    public OdooId getGroupTaxId() {
        return groupTaxId;
    }

    public AccountTaxRepartitionLine getTaxRepartitionLineIdAsObject() {
        return taxRepartitionLineIdAsObject;
    }

    public OdooId getTaxRepartitionLineId() {
        return taxRepartitionLineId;
    }

    public AccountTax getTaxLineIdAsObject() {
        return taxLineIdAsObject;
    }

    public OdooId getTaxLineId() {
        return taxLineId;
    }

    public String getRef() {
        return ref;
    }

    public AccountReconcileModel getReconcileModelIdAsObject() {
        return reconcileModelIdAsObject;
    }

    public OdooId getReconcileModelId() {
        return reconcileModelId;
    }

    public String getMatchingNumber() {
        return matchingNumber;
    }

    public Object getBalance() {
        return balance;
    }

    public String getMoveName() {
        return moveName;
    }

    public boolean getIsIsDownpayment() {
        return isIsDownpayment;
    }

    public boolean getIsIsAccountReconcile() {
        return isIsAccountReconcile;
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

    public Object getEpdKey() {
        return epdKey;
    }

    public int getId() {
        return id;
    }

    public Object getCredit() {
        return credit;
    }

    public boolean getIsIsSameCurrency() {
        return isIsSameCurrency;
    }

    public boolean getIsDiscountAllocationDirty() {
        return isDiscountAllocationDirty;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getTaxBaseAmount() {
        return taxBaseAmount;
    }

    public Object getTermKey() {
        return termKey;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Object getAmountResidual() {
        return amountResidual;
    }

    public Object getTaxCalculationRoundingMethod() {
        return taxCalculationRoundingMethod;
    }

    public boolean getIsReconciled() {
        return isReconciled;
    }

    public AccountJournalGroup getJournalGroupIdAsObject() {
        return journalGroupIdAsObject;
    }

    public OdooId getJournalGroupId() {
        return journalGroupId;
    }

    public Object getCumulatedBalance() {
        return cumulatedBalance;
    }

    public List<AccountPartialReconcile> getMatchedDebitIdsAsList() {
        return matchedDebitIdsAsList;
    }

    public List<Integer> getMatchedDebitIds() {
        return matchedDebitIds;
    }

    public AccountBankStatement getStatementIdAsObject() {
        return statementIdAsObject;
    }

    public OdooId getStatementId() {
        return statementId;
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

    public List<AccountPartialReconcile> getMatchedCreditIdsAsList() {
        return matchedCreditIdsAsList;
    }

    public List<Integer> getMatchedCreditIds() {
        return matchedCreditIds;
    }

    public Date getDateMaturity() {
        return dateMaturity;
    }

    public int getSequence() {
        return sequence;
    }

    public AccountBankStatementLine getStatementLineIdAsObject() {
        return statementLineIdAsObject;
    }

    public OdooId getStatementLineId() {
        return statementLineId;
    }

    public List<AccountAccountTag> getTaxTagIdsAsList() {
        return taxTagIdsAsList;
    }

    public List<Integer> getTaxTagIds() {
        return taxTagIds;
    }

    public String getName() {
        return name;
    }

    public Object getPriceTotal() {
        return priceTotal;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getMoveType() {
        return moveType;
    }

    public AccountFullReconcile getFullReconcileIdAsObject() {
        return fullReconcileIdAsObject;
    }

    public OdooId getFullReconcileId() {
        return fullReconcileId;
    }

    public AccountTaxGroup getTaxGroupIdAsObject() {
        return taxGroupIdAsObject;
    }

    public OdooId getTaxGroupId() {
        return taxGroupId;
    }

    public Object getDiscountAmountCurrency() {
        return discountAmountCurrency;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
    }

    public Object getAmountResidualCurrency() {
        return amountResidualCurrency;
    }

    public Object getAccountInternalGroup() {
        return accountInternalGroup;
    }

    public Object getDiscountAllocationKey() {
        return discountAllocationKey;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public Object getDisplayType() {
        return displayType;
    }

    public Object getAnalyticDistribution() {
        return analyticDistribution;
    }

    public double getCurrencyRate() {
        return currencyRate;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public AccountMove getMoveIdAsObject() {
        return moveIdAsObject;
    }

    public OdooId getMoveId() {
        return moveId;
    }

    public AccountPayment getPaymentIdAsObject() {
        return paymentIdAsObject;
    }

    public OdooId getPaymentId() {
        return paymentId;
    }

    public boolean getIsTaxTagInvert() {
        return isTaxTagInvert;
    }

    public Object getAmountCurrency() {
        return amountCurrency;
    }

    public Object getEpdNeeded() {
        return epdNeeded;
    }

    public Object getDebit() {
        return debit;
    }

    public boolean getIsIsRefund() {
        return isIsRefund;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public Date getDiscountDate() {
        return discountDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getDiscountBalance() {
        return discountBalance;
    }

    public boolean getIsEpdDirty() {
        return isEpdDirty;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public Object getParentState() {
        return parentState;
    }

    public Account getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public boolean getIsIsImported() {
        return isIsImported;
    }

    public List<AccountAnalyticLine> getAnalyticLineIdsAsList() {
        return analyticLineIdsAsList;
    }

    public List<Integer> getAnalyticLineIds() {
        return analyticLineIds;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Object getDiscountAllocationNeeded() {
        return discountAllocationNeeded;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAccountType(Object accountType) {
        this.accountType = accountType;
    }

    public void setTaxIdsAsList(List<AccountTax> taxIdsAsList) {
        this.taxIdsAsList = taxIdsAsList;
    }

    public void setTaxIds(List<Integer> taxIds) {
        this.taxIds = taxIds;
    }

    public void setAccountRootIdAsObject(AccountRoot accountRootIdAsObject) {
        this.accountRootIdAsObject = accountRootIdAsObject;
    }

    public void setAccountRootId(OdooId accountRootId) {
        this.accountRootId = accountRootId;
    }

    public void setPriceSubtotal(Object priceSubtotal) {
        this.priceSubtotal = priceSubtotal;
    }

    public void setIsIsStorno(boolean isIsStorno) {
        this.isIsStorno = isIsStorno;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setGroupTaxIdAsObject(AccountTax groupTaxIdAsObject) {
        this.groupTaxIdAsObject = groupTaxIdAsObject;
    }

    public void setGroupTaxId(OdooId groupTaxId) {
        this.groupTaxId = groupTaxId;
    }

    public void setTaxRepartitionLineIdAsObject(AccountTaxRepartitionLine taxRepartitionLineIdAsObject) {
        this.taxRepartitionLineIdAsObject = taxRepartitionLineIdAsObject;
    }

    public void setTaxRepartitionLineId(OdooId taxRepartitionLineId) {
        this.taxRepartitionLineId = taxRepartitionLineId;
    }

    public void setTaxLineIdAsObject(AccountTax taxLineIdAsObject) {
        this.taxLineIdAsObject = taxLineIdAsObject;
    }

    public void setTaxLineId(OdooId taxLineId) {
        this.taxLineId = taxLineId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setReconcileModelIdAsObject(AccountReconcileModel reconcileModelIdAsObject) {
        this.reconcileModelIdAsObject = reconcileModelIdAsObject;
    }

    public void setReconcileModelId(OdooId reconcileModelId) {
        this.reconcileModelId = reconcileModelId;
    }

    public void setMatchingNumber(String matchingNumber) {
        this.matchingNumber = matchingNumber;
    }

    public void setBalance(Object balance) {
        this.balance = balance;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public void setIsIsDownpayment(boolean isIsDownpayment) {
        this.isIsDownpayment = isIsDownpayment;
    }

    public void setIsIsAccountReconcile(boolean isIsAccountReconcile) {
        this.isIsAccountReconcile = isIsAccountReconcile;
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

    public void setEpdKey(Object epdKey) {
        this.epdKey = epdKey;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public void setIsIsSameCurrency(boolean isIsSameCurrency) {
        this.isIsSameCurrency = isIsSameCurrency;
    }

    public void setIsDiscountAllocationDirty(boolean isDiscountAllocationDirty) {
        this.isDiscountAllocationDirty = isDiscountAllocationDirty;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setTaxBaseAmount(Object taxBaseAmount) {
        this.taxBaseAmount = taxBaseAmount;
    }

    public void setTermKey(Object termKey) {
        this.termKey = termKey;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setAmountResidual(Object amountResidual) {
        this.amountResidual = amountResidual;
    }

    public void setTaxCalculationRoundingMethod(Object taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod;
    }

    public void setIsReconciled(boolean isReconciled) {
        this.isReconciled = isReconciled;
    }

    public void setJournalGroupIdAsObject(AccountJournalGroup journalGroupIdAsObject) {
        this.journalGroupIdAsObject = journalGroupIdAsObject;
    }

    public void setJournalGroupId(OdooId journalGroupId) {
        this.journalGroupId = journalGroupId;
    }

    public void setCumulatedBalance(Object cumulatedBalance) {
        this.cumulatedBalance = cumulatedBalance;
    }

    public void setMatchedDebitIdsAsList(List<AccountPartialReconcile> matchedDebitIdsAsList) {
        this.matchedDebitIdsAsList = matchedDebitIdsAsList;
    }

    public void setMatchedDebitIds(List<Integer> matchedDebitIds) {
        this.matchedDebitIds = matchedDebitIds;
    }

    public void setStatementIdAsObject(AccountBankStatement statementIdAsObject) {
        this.statementIdAsObject = statementIdAsObject;
    }

    public void setStatementId(OdooId statementId) {
        this.statementId = statementId;
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

    public void setMatchedCreditIdsAsList(List<AccountPartialReconcile> matchedCreditIdsAsList) {
        this.matchedCreditIdsAsList = matchedCreditIdsAsList;
    }

    public void setMatchedCreditIds(List<Integer> matchedCreditIds) {
        this.matchedCreditIds = matchedCreditIds;
    }

    public void setDateMaturity(Date dateMaturity) {
        this.dateMaturity = dateMaturity;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setStatementLineIdAsObject(AccountBankStatementLine statementLineIdAsObject) {
        this.statementLineIdAsObject = statementLineIdAsObject;
    }

    public void setStatementLineId(OdooId statementLineId) {
        this.statementLineId = statementLineId;
    }

    public void setTaxTagIdsAsList(List<AccountAccountTag> taxTagIdsAsList) {
        this.taxTagIdsAsList = taxTagIdsAsList;
    }

    public void setTaxTagIds(List<Integer> taxTagIds) {
        this.taxTagIds = taxTagIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceTotal(Object priceTotal) {
        this.priceTotal = priceTotal;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setMoveType(Object moveType) {
        this.moveType = moveType;
    }

    public void setFullReconcileIdAsObject(AccountFullReconcile fullReconcileIdAsObject) {
        this.fullReconcileIdAsObject = fullReconcileIdAsObject;
    }

    public void setFullReconcileId(OdooId fullReconcileId) {
        this.fullReconcileId = fullReconcileId;
    }

    public void setTaxGroupIdAsObject(AccountTaxGroup taxGroupIdAsObject) {
        this.taxGroupIdAsObject = taxGroupIdAsObject;
    }

    public void setTaxGroupId(OdooId taxGroupId) {
        this.taxGroupId = taxGroupId;
    }

    public void setDiscountAmountCurrency(Object discountAmountCurrency) {
        this.discountAmountCurrency = discountAmountCurrency;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
    }

    public void setAmountResidualCurrency(Object amountResidualCurrency) {
        this.amountResidualCurrency = amountResidualCurrency;
    }

    public void setAccountInternalGroup(Object accountInternalGroup) {
        this.accountInternalGroup = accountInternalGroup;
    }

    public void setDiscountAllocationKey(Object discountAllocationKey) {
        this.discountAllocationKey = discountAllocationKey;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setAnalyticDistribution(Object analyticDistribution) {
        this.analyticDistribution = analyticDistribution;
    }

    public void setCurrencyRate(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setMoveIdAsObject(AccountMove moveIdAsObject) {
        this.moveIdAsObject = moveIdAsObject;
    }

    public void setMoveId(OdooId moveId) {
        this.moveId = moveId;
    }

    public void setPaymentIdAsObject(AccountPayment paymentIdAsObject) {
        this.paymentIdAsObject = paymentIdAsObject;
    }

    public void setPaymentId(OdooId paymentId) {
        this.paymentId = paymentId;
    }

    public void setIsTaxTagInvert(boolean isTaxTagInvert) {
        this.isTaxTagInvert = isTaxTagInvert;
    }

    public void setAmountCurrency(Object amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    public void setEpdNeeded(Object epdNeeded) {
        this.epdNeeded = epdNeeded;
    }

    public void setDebit(Object debit) {
        this.debit = debit;
    }

    public void setIsIsRefund(boolean isIsRefund) {
        this.isIsRefund = isIsRefund;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setDiscountDate(Date discountDate) {
        this.discountDate = discountDate;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDiscountBalance(Object discountBalance) {
        this.discountBalance = discountBalance;
    }

    public void setIsEpdDirty(boolean isEpdDirty) {
        this.isEpdDirty = isEpdDirty;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public void setParentState(Object parentState) {
        this.parentState = parentState;
    }

    public void setAccountIdAsObject(Account accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setIsIsImported(boolean isIsImported) {
        this.isIsImported = isIsImported;
    }

    public void setAnalyticLineIdsAsList(List<AccountAnalyticLine> analyticLineIdsAsList) {
        this.analyticLineIdsAsList = analyticLineIdsAsList;
    }

    public void setAnalyticLineIds(List<Integer> analyticLineIds) {
        this.analyticLineIds = analyticLineIds;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setDiscountAllocationNeeded(Object discountAllocationNeeded) {
        this.discountAllocationNeeded = discountAllocationNeeded;
    }



}