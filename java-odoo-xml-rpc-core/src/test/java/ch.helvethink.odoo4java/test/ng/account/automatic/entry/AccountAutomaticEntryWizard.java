
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

package ch.helvethink.odoo4java.test.ng.account.automatic.entry;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine;;

@OdooObject("account.automatic.entry.wizard")
public class AccountAutomaticEntryWizard implements OdooObj {

    
    private Object date;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private Date writeDate;

    
    private Object accountType;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<AccountMoveLine> moveLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private List<Integer> moveLineIds;

    
    private Account expenseAccrualAccountAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId expenseAccrualAccount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Account destinationAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId destinationAccountId;

    
    private String lockDateMessage;

    
    private boolean isDisplayCurrencyHelper;

    
    private ResCurrency companyCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrencyId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object moveData;

    
    private Object totalAmount;

    
    private double percentage;

    
    private Object action;

    
    private int id;

    
    private Object previewMoveData;

    
    private Account revenueAccrualAccountAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId revenueAccrualAccount;

    
    private Date createDate;


    public AccountAutomaticEntryWizard() {
    // Constructor
    }


    public Object getDate() {
        return date;
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

    public Object getAccountType() {
        return accountType;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<AccountMoveLine> getMoveLineIdsAsList() {
        return moveLineIdsAsList;
    }

    public List<Integer> getMoveLineIds() {
        return moveLineIds;
    }

    public Account getExpenseAccrualAccountAsObject() {
        return expenseAccrualAccountAsObject;
    }

    public OdooId getExpenseAccrualAccount() {
        return expenseAccrualAccount;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Account getDestinationAccountIdAsObject() {
        return destinationAccountIdAsObject;
    }

    public OdooId getDestinationAccountId() {
        return destinationAccountId;
    }

    public String getLockDateMessage() {
        return lockDateMessage;
    }

    public boolean getIsDisplayCurrencyHelper() {
        return isDisplayCurrencyHelper;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
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

    public Object getMoveData() {
        return moveData;
    }

    public Object getTotalAmount() {
        return totalAmount;
    }

    public double getPercentage() {
        return percentage;
    }

    public Object getAction() {
        return action;
    }

    public int getId() {
        return id;
    }

    public Object getPreviewMoveData() {
        return previewMoveData;
    }

    public Account getRevenueAccrualAccountAsObject() {
        return revenueAccrualAccountAsObject;
    }

    public OdooId getRevenueAccrualAccount() {
        return revenueAccrualAccount;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setDate(Object date) {
        this.date = date;
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

    public void setAccountType(Object accountType) {
        this.accountType = accountType;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setMoveLineIdsAsList(List<AccountMoveLine> moveLineIdsAsList) {
        this.moveLineIdsAsList = moveLineIdsAsList;
    }

    public void setMoveLineIds(List<Integer> moveLineIds) {
        this.moveLineIds = moveLineIds;
    }

    public void setExpenseAccrualAccountAsObject(Account expenseAccrualAccountAsObject) {
        this.expenseAccrualAccountAsObject = expenseAccrualAccountAsObject;
    }

    public void setExpenseAccrualAccount(OdooId expenseAccrualAccount) {
        this.expenseAccrualAccount = expenseAccrualAccount;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDestinationAccountIdAsObject(Account destinationAccountIdAsObject) {
        this.destinationAccountIdAsObject = destinationAccountIdAsObject;
    }

    public void setDestinationAccountId(OdooId destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public void setLockDateMessage(String lockDateMessage) {
        this.lockDateMessage = lockDateMessage;
    }

    public void setIsDisplayCurrencyHelper(boolean isDisplayCurrencyHelper) {
        this.isDisplayCurrencyHelper = isDisplayCurrencyHelper;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
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

    public void setMoveData(Object moveData) {
        this.moveData = moveData;
    }

    public void setTotalAmount(Object totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreviewMoveData(Object previewMoveData) {
        this.previewMoveData = previewMoveData;
    }

    public void setRevenueAccrualAccountAsObject(Account revenueAccrualAccountAsObject) {
        this.revenueAccrualAccountAsObject = revenueAccrualAccountAsObject;
    }

    public void setRevenueAccrualAccount(OdooId revenueAccrualAccount) {
        this.revenueAccrualAccount = revenueAccrualAccount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}