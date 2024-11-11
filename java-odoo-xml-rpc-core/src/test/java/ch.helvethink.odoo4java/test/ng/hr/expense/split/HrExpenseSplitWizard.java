
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

package ch.helvethink.odoo4java.test.ng.hr.expense.split;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.hr.expense.HrExpenseSplit;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrExpense;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.expense.split.wizard")
public class HrExpenseSplitWizard implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<HrExpenseSplit> expenseSplitLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.expense.HrExpenseSplit")
        @OdooModel("hr.expense.HrExpenseSplit")
    
    private List<Integer> expenseSplitLineIds;

    
    private Object taxAmountCurrency;

    
    private boolean isSplitPossible;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object totalAmountCurrency;

    
    private Object totalAmountCurrencyOriginal;

    
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


    public HrExpenseSplitWizard() {
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

    public List<HrExpenseSplit> getExpenseSplitLineIdsAsList() {
        return expenseSplitLineIdsAsList;
    }

    public List<Integer> getExpenseSplitLineIds() {
        return expenseSplitLineIds;
    }

    public Object getTaxAmountCurrency() {
        return taxAmountCurrency;
    }

    public boolean getIsSplitPossible() {
        return isSplitPossible;
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

    public Object getTotalAmountCurrencyOriginal() {
        return totalAmountCurrencyOriginal;
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

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setExpenseSplitLineIdsAsList(List<HrExpenseSplit> expenseSplitLineIdsAsList) {
        this.expenseSplitLineIdsAsList = expenseSplitLineIdsAsList;
    }

    public void setExpenseSplitLineIds(List<Integer> expenseSplitLineIds) {
        this.expenseSplitLineIds = expenseSplitLineIds;
    }

    public void setTaxAmountCurrency(Object taxAmountCurrency) {
        this.taxAmountCurrency = taxAmountCurrency;
    }

    public void setIsSplitPossible(boolean isSplitPossible) {
        this.isSplitPossible = isSplitPossible;
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

    public void setTotalAmountCurrencyOriginal(Object totalAmountCurrencyOriginal) {
        this.totalAmountCurrencyOriginal = totalAmountCurrencyOriginal;
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