
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

package ch.helvethink.odoo4java.test.ng.account.payment;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.payment.PaymentToken;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine;;

@OdooObject("account.payment.register")
public class AccountPaymentRegister implements OdooObj {

    
    private Date writeDate;

    
    private Object paymentDifferenceHandling;

    
    private List<AccountJournal> availableJournalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private List<Integer> availableJournalIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isUseElectronicPaymentMethod;

    
    private String paymentMethodCode;

    
    private AccountPaymentMethodLine paymentMethodLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
    
    private OdooId paymentMethodLineId;

    
    private ResCurrency companyCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrencyId;

    
    private ResCurrency sourceCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId sourceCurrencyId;

    
    private List<ResPartnerBank> availablePartnerBankIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private List<Integer> availablePartnerBankIds;

    
    private boolean isCanGroupPayments;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private ResPartnerBank partnerBankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId partnerBankId;

    
    private int totalPaymentsAmount;

    
    private int id;

    
    private String communication;

    
    private Date createDate;

    
    private Object paymentDate;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private String writeoffLabel;

    
    private Object amount;

    
    private List<ResPartnerBank> untrustedBankIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private List<Integer> untrustedBankIds;

    
    private List<PaymentToken> suitablePaymentTokenIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentToken")
        @OdooModel("payment.PaymentToken")
    
    private List<Integer> suitablePaymentTokenIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isShowPartnerBankAccount;

    
    private Object sourceAmount;

    
    private Object paymentDifference;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isGroupPayment;

    
    private Object sourceAmountCurrency;

    
    private boolean isRequirePartnerBankAccount;

    
    private List<AccountPaymentMethodLine> availablePaymentMethodLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
    
    private List<Integer> availablePaymentMethodLineIds;

    
    private String countryCode;

    
    private Object paymentType;

    
    private List<AccountMoveLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private List<Integer> lineIds;

    
    private boolean isCanEditWizard;

    
    private PaymentToken paymentTokenIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentToken")
        @OdooModel("payment.PaymentToken")
    
    private OdooId paymentTokenId;

    
    private Object partnerType;

    
    private boolean isWriteoffIsExchangeAccount;

    
    private boolean isHideWriteoffSection;

    
    private boolean isEarlyPaymentDiscountMode;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Account writeoffAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId writeoffAccountId;

    
    private int untrustedPaymentsCount;


    public AccountPaymentRegister() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getPaymentDifferenceHandling() {
        return paymentDifferenceHandling;
    }

    public List<AccountJournal> getAvailableJournalIdsAsList() {
        return availableJournalIdsAsList;
    }

    public List<Integer> getAvailableJournalIds() {
        return availableJournalIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsUseElectronicPaymentMethod() {
        return isUseElectronicPaymentMethod;
    }

    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    public AccountPaymentMethodLine getPaymentMethodLineIdAsObject() {
        return paymentMethodLineIdAsObject;
    }

    public OdooId getPaymentMethodLineId() {
        return paymentMethodLineId;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
    }

    public ResCurrency getSourceCurrencyIdAsObject() {
        return sourceCurrencyIdAsObject;
    }

    public OdooId getSourceCurrencyId() {
        return sourceCurrencyId;
    }

    public List<ResPartnerBank> getAvailablePartnerBankIdsAsList() {
        return availablePartnerBankIdsAsList;
    }

    public List<Integer> getAvailablePartnerBankIds() {
        return availablePartnerBankIds;
    }

    public boolean getIsCanGroupPayments() {
        return isCanGroupPayments;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public ResPartnerBank getPartnerBankIdAsObject() {
        return partnerBankIdAsObject;
    }

    public OdooId getPartnerBankId() {
        return partnerBankId;
    }

    public int getTotalPaymentsAmount() {
        return totalPaymentsAmount;
    }

    public int getId() {
        return id;
    }

    public String getCommunication() {
        return communication;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getPaymentDate() {
        return paymentDate;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public String getWriteoffLabel() {
        return writeoffLabel;
    }

    public Object getAmount() {
        return amount;
    }

    public List<ResPartnerBank> getUntrustedBankIdsAsList() {
        return untrustedBankIdsAsList;
    }

    public List<Integer> getUntrustedBankIds() {
        return untrustedBankIds;
    }

    public List<PaymentToken> getSuitablePaymentTokenIdsAsList() {
        return suitablePaymentTokenIdsAsList;
    }

    public List<Integer> getSuitablePaymentTokenIds() {
        return suitablePaymentTokenIds;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsShowPartnerBankAccount() {
        return isShowPartnerBankAccount;
    }

    public Object getSourceAmount() {
        return sourceAmount;
    }

    public Object getPaymentDifference() {
        return paymentDifference;
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

    public boolean getIsGroupPayment() {
        return isGroupPayment;
    }

    public Object getSourceAmountCurrency() {
        return sourceAmountCurrency;
    }

    public boolean getIsRequirePartnerBankAccount() {
        return isRequirePartnerBankAccount;
    }

    public List<AccountPaymentMethodLine> getAvailablePaymentMethodLineIdsAsList() {
        return availablePaymentMethodLineIdsAsList;
    }

    public List<Integer> getAvailablePaymentMethodLineIds() {
        return availablePaymentMethodLineIds;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Object getPaymentType() {
        return paymentType;
    }

    public List<AccountMoveLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public boolean getIsCanEditWizard() {
        return isCanEditWizard;
    }

    public PaymentToken getPaymentTokenIdAsObject() {
        return paymentTokenIdAsObject;
    }

    public OdooId getPaymentTokenId() {
        return paymentTokenId;
    }

    public Object getPartnerType() {
        return partnerType;
    }

    public boolean getIsWriteoffIsExchangeAccount() {
        return isWriteoffIsExchangeAccount;
    }

    public boolean getIsHideWriteoffSection() {
        return isHideWriteoffSection;
    }

    public boolean getIsEarlyPaymentDiscountMode() {
        return isEarlyPaymentDiscountMode;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Account getWriteoffAccountIdAsObject() {
        return writeoffAccountIdAsObject;
    }

    public OdooId getWriteoffAccountId() {
        return writeoffAccountId;
    }

    public int getUntrustedPaymentsCount() {
        return untrustedPaymentsCount;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPaymentDifferenceHandling(Object paymentDifferenceHandling) {
        this.paymentDifferenceHandling = paymentDifferenceHandling;
    }

    public void setAvailableJournalIdsAsList(List<AccountJournal> availableJournalIdsAsList) {
        this.availableJournalIdsAsList = availableJournalIdsAsList;
    }

    public void setAvailableJournalIds(List<Integer> availableJournalIds) {
        this.availableJournalIds = availableJournalIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsUseElectronicPaymentMethod(boolean isUseElectronicPaymentMethod) {
        this.isUseElectronicPaymentMethod = isUseElectronicPaymentMethod;
    }

    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    public void setPaymentMethodLineIdAsObject(AccountPaymentMethodLine paymentMethodLineIdAsObject) {
        this.paymentMethodLineIdAsObject = paymentMethodLineIdAsObject;
    }

    public void setPaymentMethodLineId(OdooId paymentMethodLineId) {
        this.paymentMethodLineId = paymentMethodLineId;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
    }

    public void setSourceCurrencyIdAsObject(ResCurrency sourceCurrencyIdAsObject) {
        this.sourceCurrencyIdAsObject = sourceCurrencyIdAsObject;
    }

    public void setSourceCurrencyId(OdooId sourceCurrencyId) {
        this.sourceCurrencyId = sourceCurrencyId;
    }

    public void setAvailablePartnerBankIdsAsList(List<ResPartnerBank> availablePartnerBankIdsAsList) {
        this.availablePartnerBankIdsAsList = availablePartnerBankIdsAsList;
    }

    public void setAvailablePartnerBankIds(List<Integer> availablePartnerBankIds) {
        this.availablePartnerBankIds = availablePartnerBankIds;
    }

    public void setIsCanGroupPayments(boolean isCanGroupPayments) {
        this.isCanGroupPayments = isCanGroupPayments;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setPartnerBankIdAsObject(ResPartnerBank partnerBankIdAsObject) {
        this.partnerBankIdAsObject = partnerBankIdAsObject;
    }

    public void setPartnerBankId(OdooId partnerBankId) {
        this.partnerBankId = partnerBankId;
    }

    public void setTotalPaymentsAmount(int totalPaymentsAmount) {
        this.totalPaymentsAmount = totalPaymentsAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPaymentDate(Object paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setWriteoffLabel(String writeoffLabel) {
        this.writeoffLabel = writeoffLabel;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setUntrustedBankIdsAsList(List<ResPartnerBank> untrustedBankIdsAsList) {
        this.untrustedBankIdsAsList = untrustedBankIdsAsList;
    }

    public void setUntrustedBankIds(List<Integer> untrustedBankIds) {
        this.untrustedBankIds = untrustedBankIds;
    }

    public void setSuitablePaymentTokenIdsAsList(List<PaymentToken> suitablePaymentTokenIdsAsList) {
        this.suitablePaymentTokenIdsAsList = suitablePaymentTokenIdsAsList;
    }

    public void setSuitablePaymentTokenIds(List<Integer> suitablePaymentTokenIds) {
        this.suitablePaymentTokenIds = suitablePaymentTokenIds;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsShowPartnerBankAccount(boolean isShowPartnerBankAccount) {
        this.isShowPartnerBankAccount = isShowPartnerBankAccount;
    }

    public void setSourceAmount(Object sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public void setPaymentDifference(Object paymentDifference) {
        this.paymentDifference = paymentDifference;
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

    public void setIsGroupPayment(boolean isGroupPayment) {
        this.isGroupPayment = isGroupPayment;
    }

    public void setSourceAmountCurrency(Object sourceAmountCurrency) {
        this.sourceAmountCurrency = sourceAmountCurrency;
    }

    public void setIsRequirePartnerBankAccount(boolean isRequirePartnerBankAccount) {
        this.isRequirePartnerBankAccount = isRequirePartnerBankAccount;
    }

    public void setAvailablePaymentMethodLineIdsAsList(List<AccountPaymentMethodLine> availablePaymentMethodLineIdsAsList) {
        this.availablePaymentMethodLineIdsAsList = availablePaymentMethodLineIdsAsList;
    }

    public void setAvailablePaymentMethodLineIds(List<Integer> availablePaymentMethodLineIds) {
        this.availablePaymentMethodLineIds = availablePaymentMethodLineIds;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPaymentType(Object paymentType) {
        this.paymentType = paymentType;
    }

    public void setLineIdsAsList(List<AccountMoveLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setIsCanEditWizard(boolean isCanEditWizard) {
        this.isCanEditWizard = isCanEditWizard;
    }

    public void setPaymentTokenIdAsObject(PaymentToken paymentTokenIdAsObject) {
        this.paymentTokenIdAsObject = paymentTokenIdAsObject;
    }

    public void setPaymentTokenId(OdooId paymentTokenId) {
        this.paymentTokenId = paymentTokenId;
    }

    public void setPartnerType(Object partnerType) {
        this.partnerType = partnerType;
    }

    public void setIsWriteoffIsExchangeAccount(boolean isWriteoffIsExchangeAccount) {
        this.isWriteoffIsExchangeAccount = isWriteoffIsExchangeAccount;
    }

    public void setIsHideWriteoffSection(boolean isHideWriteoffSection) {
        this.isHideWriteoffSection = isHideWriteoffSection;
    }

    public void setIsEarlyPaymentDiscountMode(boolean isEarlyPaymentDiscountMode) {
        this.isEarlyPaymentDiscountMode = isEarlyPaymentDiscountMode;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setWriteoffAccountIdAsObject(Account writeoffAccountIdAsObject) {
        this.writeoffAccountIdAsObject = writeoffAccountIdAsObject;
    }

    public void setWriteoffAccountId(OdooId writeoffAccountId) {
        this.writeoffAccountId = writeoffAccountId;
    }

    public void setUntrustedPaymentsCount(int untrustedPaymentsCount) {
        this.untrustedPaymentsCount = untrustedPaymentsCount;
    }



}