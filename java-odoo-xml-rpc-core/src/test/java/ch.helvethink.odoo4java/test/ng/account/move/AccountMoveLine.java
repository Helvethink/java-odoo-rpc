
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

package ch.helvethink.odoo4java.test.ng.account.move;

import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.test.ng.hr.HrExpense;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.account.bank.statement.AccountBankStatementLine;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.account.tax.repartition.AccountTaxRepartitionLine;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.partial.AccountPartialReconcile;
import ch.helvethink.odoo4java.test.ng.account.tax.AccountTaxGroup;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.account.AccountPayment;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.account.reconcile.AccountReconcileModel;
import ch.helvethink.odoo4java.test.ng.account.AccountRoot;
import ch.helvethink.odoo4java.test.ng.account.full.AccountFullReconcile;
import ch.helvethink.odoo4java.test.ng.uom.UomCategory;
import ch.helvethink.odoo4java.test.ng.account.bank.AccountBankStatement;;

@OdooObject("account.move.line")
public class AccountMoveLine implements OdooObj {

    
    private Object date;

    
    private Date writeDate;

    
    private List<SaleOrderLine> saleLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private List<Integer> saleLineIds;

    
    private Object accountType;

    
    private List<AccountTax> taxIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> taxIds;

    
    private AccountRoot accountRootIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountRoot")
        @OdooModel("account.AccountRoot")
    
    private OdooId accountRootId;

    
    private Object priceSubtotal;

    
    private boolean isIsStorno;

    
    private double discount;

    
    private AccountTax groupTaxIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId groupTaxId;

    
    private Object computeAllTax;

    
    private AccountTaxRepartitionLine taxRepartitionLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
    
    private OdooId taxRepartitionLineId;

    
    private AccountTax taxLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId taxLineId;

    
    private String ref;

    
    private AccountReconcileModel reconcileModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.reconcile.AccountReconcileModel")
        @OdooModel("account.reconcile.AccountReconcileModel")
    
    private OdooId reconcileModelId;

    
    private String matchingNumber;

    
    private Object balance;

    
    private String moveName;

    
    private boolean isIsDownpayment;

    
    private boolean isIsAccountReconcile;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private int analyticPrecision;

    
    private Object epdKey;

    
    private int id;

    
    private Object credit;

    
    private boolean isIsSameCurrency;

    
    private boolean isDiscountAllocationDirty;

    
    private Date createDate;

    
    private Object taxBaseAmount;

    
    private Object termKey;

    
    private Object paymentDate;

    
    private Object amountResidual;

    
    private Object taxCalculationRoundingMethod;

    
    private boolean isReconciled;

    
    private Uom productUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId productUomId;

    
    private Object cumulatedBalance;

    
    private List<AccountPartialReconcile> matchedDebitIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
    
    private List<Integer> matchedDebitIds;

    
    private AccountBankStatement statementIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.bank.AccountBankStatement")
        @OdooModel("account.bank.AccountBankStatement")
    
    private OdooId statementId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<AccountPartialReconcile> matchedCreditIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
    
    private List<Integer> matchedCreditIds;

    
    private Object dateMaturity;

    
    private int sequence;

    
    private AccountBankStatementLine statementLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
    
    private OdooId statementLineId;

    
    private boolean isComputeAllTaxDirty;

    
    private List<AccountAccountTag> taxTagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag")
        @OdooModel("account.account.AccountAccountTag")
    
    private List<Integer> taxTagIds;

    
    private String name;

    
    private Object priceTotal;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object moveType;

    
    private AccountFullReconcile fullReconcileIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.full.AccountFullReconcile")
        @OdooModel("account.full.AccountFullReconcile")
    
    private OdooId fullReconcileId;

    
    private AccountTaxGroup taxGroupIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.tax.AccountTaxGroup")
        @OdooModel("account.tax.AccountTaxGroup")
    
    private OdooId taxGroupId;

    
    private Object discountAmountCurrency;

    
    private ResCurrency companyCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrencyId;

    
    private Object amountResidualCurrency;

    
    private Object accountInternalGroup;

    
    private Object discountAllocationKey;

    
    private Object invoiceDate;

    
    private Object displayType;

    
    private Object analyticDistribution;

    
    private double currencyRate;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private boolean isBlocked;

    
    private AccountMove moveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId moveId;

    
    private AccountPayment paymentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountPayment")
        @OdooModel("account.AccountPayment")
    
    private OdooId paymentId;

    
    private boolean isTaxTagInvert;

    
    private Object amountCurrency;

    
    private Object epdNeeded;

    
    private Object debit;

    
    private boolean isIsRefund;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private Object analyticDistributionSearch;

    
    private Object discountDate;

    
    private double quantity;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object discountBalance;

    
    private Object taxKey;

    
    private boolean isEpdDirty;

    
    private double priceUnit;

    
    private Object parentState;

    
    private Account accountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId accountId;

    
    private List<AccountAnalyticLine> analyticLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> analyticLineIds;

    
    private HrExpense expenseIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrExpense")
        @OdooModel("hr.HrExpense")
    
    private OdooId expenseId;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private UomCategory productUomCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.UomCategory")
        @OdooModel("uom.UomCategory")
    
    private OdooId productUomCategoryId;

    
    private Object discountAllocationNeeded;


    public AccountMoveLine() {
    // Constructor
    }


    public Object getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public List<SaleOrderLine> getSaleLineIdsAsList() {
        return saleLineIdsAsList;
    }

    public List<Integer> getSaleLineIds() {
        return saleLineIds;
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

    public Object getComputeAllTax() {
        return computeAllTax;
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

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
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

    public Object getPaymentDate() {
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

    public Uom getProductUomIdAsObject() {
        return productUomIdAsObject;
    }

    public OdooId getProductUomId() {
        return productUomId;
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

    public Object getDateMaturity() {
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

    public boolean getIsComputeAllTaxDirty() {
        return isComputeAllTaxDirty;
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

    public Object getInvoiceDate() {
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

    public boolean getIsBlocked() {
        return isBlocked;
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

    public Object getAnalyticDistributionSearch() {
        return analyticDistributionSearch;
    }

    public Object getDiscountDate() {
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

    public Object getTaxKey() {
        return taxKey;
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

    public List<AccountAnalyticLine> getAnalyticLineIdsAsList() {
        return analyticLineIdsAsList;
    }

    public List<Integer> getAnalyticLineIds() {
        return analyticLineIds;
    }

    public HrExpense getExpenseIdAsObject() {
        return expenseIdAsObject;
    }

    public OdooId getExpenseId() {
        return expenseId;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public UomCategory getProductUomCategoryIdAsObject() {
        return productUomCategoryIdAsObject;
    }

    public OdooId getProductUomCategoryId() {
        return productUomCategoryId;
    }

    public Object getDiscountAllocationNeeded() {
        return discountAllocationNeeded;
    }



    public void setDate(Object date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setSaleLineIdsAsList(List<SaleOrderLine> saleLineIdsAsList) {
        this.saleLineIdsAsList = saleLineIdsAsList;
    }

    public void setSaleLineIds(List<Integer> saleLineIds) {
        this.saleLineIds = saleLineIds;
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

    public void setComputeAllTax(Object computeAllTax) {
        this.computeAllTax = computeAllTax;
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

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
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

    public void setPaymentDate(Object paymentDate) {
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

    public void setProductUomIdAsObject(Uom productUomIdAsObject) {
        this.productUomIdAsObject = productUomIdAsObject;
    }

    public void setProductUomId(OdooId productUomId) {
        this.productUomId = productUomId;
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

    public void setDateMaturity(Object dateMaturity) {
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

    public void setIsComputeAllTaxDirty(boolean isComputeAllTaxDirty) {
        this.isComputeAllTaxDirty = isComputeAllTaxDirty;
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

    public void setInvoiceDate(Object invoiceDate) {
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

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
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

    public void setAnalyticDistributionSearch(Object analyticDistributionSearch) {
        this.analyticDistributionSearch = analyticDistributionSearch;
    }

    public void setDiscountDate(Object discountDate) {
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

    public void setTaxKey(Object taxKey) {
        this.taxKey = taxKey;
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

    public void setAnalyticLineIdsAsList(List<AccountAnalyticLine> analyticLineIdsAsList) {
        this.analyticLineIdsAsList = analyticLineIdsAsList;
    }

    public void setAnalyticLineIds(List<Integer> analyticLineIds) {
        this.analyticLineIds = analyticLineIds;
    }

    public void setExpenseIdAsObject(HrExpense expenseIdAsObject) {
        this.expenseIdAsObject = expenseIdAsObject;
    }

    public void setExpenseId(OdooId expenseId) {
        this.expenseId = expenseId;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setProductUomCategoryIdAsObject(UomCategory productUomCategoryIdAsObject) {
        this.productUomCategoryIdAsObject = productUomCategoryIdAsObject;
    }

    public void setProductUomCategoryId(OdooId productUomCategoryId) {
        this.productUomCategoryId = productUomCategoryId;
    }

    public void setDiscountAllocationNeeded(Object discountAllocationNeeded) {
        this.discountAllocationNeeded = discountAllocationNeeded;
    }



}