
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

package ch.helvethink.odoo4java.test.ng.sale.advance.payment;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("sale.advance.payment.inv")
public class SaleAdvancePaymentInv implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object advancePaymentMethod;

    
    private Object amountToInvoice;

    
    private boolean isHasDownPayments;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private int id;

    
    private Date createDate;

    
    private Account depositAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId depositAccountId;

    
    private double amount;

    
    private Object fixedAmount;

    
    private boolean isDisplayInvoiceAmountWarning;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isConsolidatedBilling;

    
    private int count;

    
    private Object dateEndInvoiceTimesheet;

    
    private Object amountInvoiced;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<SaleOrder> saleOrderIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private List<Integer> saleOrderIds;

    
    private boolean isInvoicingTimesheetEnabled;

    
    private boolean isDeductDownPayments;

    
    private List<AccountTax> depositTaxesIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> depositTaxesId;

    
    private boolean isDisplayDraftInvoiceWarning;

    
    private Object dateStartInvoiceTimesheet;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public SaleAdvancePaymentInv() {
    // Constructor
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

    public Object getAdvancePaymentMethod() {
        return advancePaymentMethod;
    }

    public Object getAmountToInvoice() {
        return amountToInvoice;
    }

    public boolean getIsHasDownPayments() {
        return isHasDownPayments;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Account getDepositAccountIdAsObject() {
        return depositAccountIdAsObject;
    }

    public OdooId getDepositAccountId() {
        return depositAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public Object getFixedAmount() {
        return fixedAmount;
    }

    public boolean getIsDisplayInvoiceAmountWarning() {
        return isDisplayInvoiceAmountWarning;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsConsolidatedBilling() {
        return isConsolidatedBilling;
    }

    public int getCount() {
        return count;
    }

    public Object getDateEndInvoiceTimesheet() {
        return dateEndInvoiceTimesheet;
    }

    public Object getAmountInvoiced() {
        return amountInvoiced;
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

    public List<SaleOrder> getSaleOrderIdsAsList() {
        return saleOrderIdsAsList;
    }

    public List<Integer> getSaleOrderIds() {
        return saleOrderIds;
    }

    public boolean getIsInvoicingTimesheetEnabled() {
        return isInvoicingTimesheetEnabled;
    }

    public boolean getIsDeductDownPayments() {
        return isDeductDownPayments;
    }

    public List<AccountTax> getDepositTaxesIdAsList() {
        return depositTaxesIdAsList;
    }

    public List<Integer> getDepositTaxesId() {
        return depositTaxesId;
    }

    public boolean getIsDisplayDraftInvoiceWarning() {
        return isDisplayDraftInvoiceWarning;
    }

    public Object getDateStartInvoiceTimesheet() {
        return dateStartInvoiceTimesheet;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
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

    public void setAdvancePaymentMethod(Object advancePaymentMethod) {
        this.advancePaymentMethod = advancePaymentMethod;
    }

    public void setAmountToInvoice(Object amountToInvoice) {
        this.amountToInvoice = amountToInvoice;
    }

    public void setIsHasDownPayments(boolean isHasDownPayments) {
        this.isHasDownPayments = isHasDownPayments;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDepositAccountIdAsObject(Account depositAccountIdAsObject) {
        this.depositAccountIdAsObject = depositAccountIdAsObject;
    }

    public void setDepositAccountId(OdooId depositAccountId) {
        this.depositAccountId = depositAccountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFixedAmount(Object fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public void setIsDisplayInvoiceAmountWarning(boolean isDisplayInvoiceAmountWarning) {
        this.isDisplayInvoiceAmountWarning = isDisplayInvoiceAmountWarning;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsConsolidatedBilling(boolean isConsolidatedBilling) {
        this.isConsolidatedBilling = isConsolidatedBilling;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDateEndInvoiceTimesheet(Object dateEndInvoiceTimesheet) {
        this.dateEndInvoiceTimesheet = dateEndInvoiceTimesheet;
    }

    public void setAmountInvoiced(Object amountInvoiced) {
        this.amountInvoiced = amountInvoiced;
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

    public void setSaleOrderIdsAsList(List<SaleOrder> saleOrderIdsAsList) {
        this.saleOrderIdsAsList = saleOrderIdsAsList;
    }

    public void setSaleOrderIds(List<Integer> saleOrderIds) {
        this.saleOrderIds = saleOrderIds;
    }

    public void setIsInvoicingTimesheetEnabled(boolean isInvoicingTimesheetEnabled) {
        this.isInvoicingTimesheetEnabled = isInvoicingTimesheetEnabled;
    }

    public void setIsDeductDownPayments(boolean isDeductDownPayments) {
        this.isDeductDownPayments = isDeductDownPayments;
    }

    public void setDepositTaxesIdAsList(List<AccountTax> depositTaxesIdAsList) {
        this.depositTaxesIdAsList = depositTaxesIdAsList;
    }

    public void setDepositTaxesId(List<Integer> depositTaxesId) {
        this.depositTaxesId = depositTaxesId;
    }

    public void setIsDisplayDraftInvoiceWarning(boolean isDisplayDraftInvoiceWarning) {
        this.isDisplayDraftInvoiceWarning = isDisplayDraftInvoiceWarning;
    }

    public void setDateStartInvoiceTimesheet(Object dateStartInvoiceTimesheet) {
        this.dateStartInvoiceTimesheet = dateStartInvoiceTimesheet;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}