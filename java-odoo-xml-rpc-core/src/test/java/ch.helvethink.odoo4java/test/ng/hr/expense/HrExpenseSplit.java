
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

package ch.helvethink.odoo4java.test.ng.hr.expense;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.hr.HrExpense;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.expense.split.HrExpenseSplitWizard;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("hr.expense.split")
public class HrExpenseSplit implements OdooObj {

    
    private Date writeDate;

    
    private Object analyticDistributionSearch;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<AccountTax> taxIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> taxIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object taxAmountCurrency;

    
    private boolean isProductHasCost;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object totalAmountCurrency;

    
    private Object analyticDistribution;

    
    private HrExpenseSplitWizard wizardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.expense.split.HrExpenseSplitWizard")
        @OdooModel("hr.expense.split.HrExpenseSplitWizard")
    
    private OdooId wizardId;

    
    private boolean isProductHasTax;

    
    private SaleOrder saleOrderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId saleOrderId;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private int analyticPrecision;

    
    private boolean isCanBeReinvoiced;

    
    private int id;

    
    private Date createDate;

    
    private HrExpense expenseIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrExpense")
        @OdooModel("hr.HrExpense")
    
    private OdooId expenseId;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public HrExpenseSplit() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getAnalyticDistributionSearch() {
        return analyticDistributionSearch;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<AccountTax> getTaxIdsAsList() {
        return taxIdsAsList;
    }

    public List<Integer> getTaxIds() {
        return taxIds;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getTaxAmountCurrency() {
        return taxAmountCurrency;
    }

    public boolean getIsProductHasCost() {
        return isProductHasCost;
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

    public Object getTotalAmountCurrency() {
        return totalAmountCurrency;
    }

    public Object getAnalyticDistribution() {
        return analyticDistribution;
    }

    public HrExpenseSplitWizard getWizardIdAsObject() {
        return wizardIdAsObject;
    }

    public OdooId getWizardId() {
        return wizardId;
    }

    public boolean getIsProductHasTax() {
        return isProductHasTax;
    }

    public SaleOrder getSaleOrderIdAsObject() {
        return saleOrderIdAsObject;
    }

    public OdooId getSaleOrderId() {
        return saleOrderId;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAnalyticPrecision() {
        return analyticPrecision;
    }

    public boolean getIsCanBeReinvoiced() {
        return isCanBeReinvoiced;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
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



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAnalyticDistributionSearch(Object analyticDistributionSearch) {
        this.analyticDistributionSearch = analyticDistributionSearch;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setTaxIdsAsList(List<AccountTax> taxIdsAsList) {
        this.taxIdsAsList = taxIdsAsList;
    }

    public void setTaxIds(List<Integer> taxIds) {
        this.taxIds = taxIds;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setTaxAmountCurrency(Object taxAmountCurrency) {
        this.taxAmountCurrency = taxAmountCurrency;
    }

    public void setIsProductHasCost(boolean isProductHasCost) {
        this.isProductHasCost = isProductHasCost;
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

    public void setTotalAmountCurrency(Object totalAmountCurrency) {
        this.totalAmountCurrency = totalAmountCurrency;
    }

    public void setAnalyticDistribution(Object analyticDistribution) {
        this.analyticDistribution = analyticDistribution;
    }

    public void setWizardIdAsObject(HrExpenseSplitWizard wizardIdAsObject) {
        this.wizardIdAsObject = wizardIdAsObject;
    }

    public void setWizardId(OdooId wizardId) {
        this.wizardId = wizardId;
    }

    public void setIsProductHasTax(boolean isProductHasTax) {
        this.isProductHasTax = isProductHasTax;
    }

    public void setSaleOrderIdAsObject(SaleOrder saleOrderIdAsObject) {
        this.saleOrderIdAsObject = saleOrderIdAsObject;
    }

    public void setSaleOrderId(OdooId saleOrderId) {
        this.saleOrderId = saleOrderId;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnalyticPrecision(int analyticPrecision) {
        this.analyticPrecision = analyticPrecision;
    }

    public void setIsCanBeReinvoiced(boolean isCanBeReinvoiced) {
        this.isCanBeReinvoiced = isCanBeReinvoiced;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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



}