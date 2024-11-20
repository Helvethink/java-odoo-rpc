
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

package ch.helvethink.odoo4java.models.account.payment;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.AccountPayment;
import ch.helvethink.odoo4java.models.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerBank;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.payment.register")
public class AccountPaymentRegister implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<AccountJournal> availableJournalIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("available_journal_ids")
        private List<Integer> availableJournalIds;
    

    
        @JsonProperty("use_electronic_payment_method")
        private boolean isUseElectronicPaymentMethod;
    

    
        private AccountPaymentMethodLine paymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("payment_method_line_id")
        private OdooId paymentMethodLineId;
    

    
        private ResCurrency sourceCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("source_currency_id")
        private OdooId sourceCurrencyId;
    

    
        private ResPartnerBank partnerBankIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("partner_bank_id")
        private OdooId partnerBankId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("communication")
        private String communication;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private List<AccountPayment> duplicatePaymentIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("duplicate_payment_ids")
        private List<Integer> duplicatePaymentIds;
    

    
        @JsonProperty("payment_date")
        private Date paymentDate;
    

    
        private List<ResPartnerBank> untrustedBankIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("untrusted_bank_ids")
        private List<Integer> untrustedBankIds;
    

    
        @JsonProperty("show_partner_bank_account")
        private boolean isShowPartnerBankAccount;
    

    
        @JsonProperty("installments_mode")
        private Object installmentsMode;
    

    
        @JsonProperty("payment_difference")
        private Object paymentDifference;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("custom_user_amount")
        private Object customUserAmount;
    

    
        @JsonProperty("require_partner_bank_account")
        private boolean isRequirePartnerBankAccount;
    

    
        private List<AccountPaymentMethodLine> availablePaymentMethodLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("available_payment_method_line_ids")
        private List<Integer> availablePaymentMethodLineIds;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("payment_type")
        private Object paymentType;
    

    
        private List<AccountMoveLine> lineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("line_ids")
        private List<Integer> lineIds;
    

    
        @JsonProperty("show_payment_difference")
        private boolean isShowPaymentDifference;
    

    
        @JsonProperty("payment_difference_handling")
        private Object paymentDifferenceHandling;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("payment_method_code")
        private String paymentMethodCode;
    

    
        private ResCurrency companyCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("company_currency_id")
        private OdooId companyCurrencyId;
    

    
        private List<ResPartnerBank> availablePartnerBankIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("available_partner_bank_ids")
        private List<Integer> availablePartnerBankIds;
    

    
        @JsonProperty("can_group_payments")
        private boolean isCanGroupPayments;
    

    
        @JsonProperty("batches")
        private Object batches;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("total_payments_amount")
        private int totalPaymentsAmount;
    

    
        @JsonProperty("qr_code")
        private Object qrCode;
    

    
        @JsonProperty("is_register_payment_on_draft")
        private boolean isIsRegisterPaymentOnDraft;
    

    
        @JsonProperty("installments_switch_html")
        private Object installmentsSwitchHtml;
    

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("writeoff_label")
        private String writeoffLabel;
    

    
        @JsonProperty("amount")
        private Object amount;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("installments_switch_amount")
        private Object installmentsSwitchAmount;
    

    
        private List<ResPartner> missingAccountPartnersAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("missing_account_partners")
        private List<Integer> missingAccountPartners;
    

    
        @JsonProperty("source_amount")
        private Object sourceAmount;
    

    
        @JsonProperty("group_payment")
        private boolean isGroupPayment;
    

    
        @JsonProperty("source_amount_currency")
        private Object sourceAmountCurrency;
    

    
        @JsonProperty("can_edit_wizard")
        private boolean isCanEditWizard;
    

    
        private ResCurrency customUserCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("custom_user_currency_id")
        private OdooId customUserCurrencyId;
    

    
        @JsonProperty("actionable_errors")
        private Object actionableErrors;
    

    
        @JsonProperty("partner_type")
        private Object partnerType;
    

    
        @JsonProperty("writeoff_is_exchange_account")
        private boolean isWriteoffIsExchangeAccount;
    

    
        @JsonProperty("hide_writeoff_section")
        private boolean isHideWriteoffSection;
    

    
        @JsonProperty("early_payment_discount_mode")
        private boolean isEarlyPaymentDiscountMode;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        private Account writeoffAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("writeoff_account_id")
        private OdooId writeoffAccountId;
    

    
        @JsonProperty("untrusted_payments_count")
        private int untrustedPaymentsCount;
    


    public AccountPaymentRegister() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<AccountJournal> getAvailableJournalIdsAsList() {
        return availableJournalIdsAsList;
    }

    public List<Integer> getAvailableJournalIds() {
        return availableJournalIds;
    }

    public boolean getIsUseElectronicPaymentMethod() {
        return isUseElectronicPaymentMethod;
    }

    public AccountPaymentMethodLine getPaymentMethodLineIdAsObject() {
        return paymentMethodLineIdAsObject;
    }

    public OdooId getPaymentMethodLineId() {
        return paymentMethodLineId;
    }

    public ResCurrency getSourceCurrencyIdAsObject() {
        return sourceCurrencyIdAsObject;
    }

    public OdooId getSourceCurrencyId() {
        return sourceCurrencyId;
    }

    public ResPartnerBank getPartnerBankIdAsObject() {
        return partnerBankIdAsObject;
    }

    public OdooId getPartnerBankId() {
        return partnerBankId;
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

    public List<AccountPayment> getDuplicatePaymentIdsAsList() {
        return duplicatePaymentIdsAsList;
    }

    public List<Integer> getDuplicatePaymentIds() {
        return duplicatePaymentIds;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public List<ResPartnerBank> getUntrustedBankIdsAsList() {
        return untrustedBankIdsAsList;
    }

    public List<Integer> getUntrustedBankIds() {
        return untrustedBankIds;
    }

    public boolean getIsShowPartnerBankAccount() {
        return isShowPartnerBankAccount;
    }

    public Object getInstallmentsMode() {
        return installmentsMode;
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

    public Object getCustomUserAmount() {
        return customUserAmount;
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

    public boolean getIsShowPaymentDifference() {
        return isShowPaymentDifference;
    }

    public Object getPaymentDifferenceHandling() {
        return paymentDifferenceHandling;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
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

    public Object getBatches() {
        return batches;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public int getTotalPaymentsAmount() {
        return totalPaymentsAmount;
    }

    public Object getQrCode() {
        return qrCode;
    }

    public boolean getIsIsRegisterPaymentOnDraft() {
        return isIsRegisterPaymentOnDraft;
    }

    public Object getInstallmentsSwitchHtml() {
        return installmentsSwitchHtml;
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getInstallmentsSwitchAmount() {
        return installmentsSwitchAmount;
    }

    public List<ResPartner> getMissingAccountPartnersAsList() {
        return missingAccountPartnersAsList;
    }

    public List<Integer> getMissingAccountPartners() {
        return missingAccountPartners;
    }

    public Object getSourceAmount() {
        return sourceAmount;
    }

    public boolean getIsGroupPayment() {
        return isGroupPayment;
    }

    public Object getSourceAmountCurrency() {
        return sourceAmountCurrency;
    }

    public boolean getIsCanEditWizard() {
        return isCanEditWizard;
    }

    public ResCurrency getCustomUserCurrencyIdAsObject() {
        return customUserCurrencyIdAsObject;
    }

    public OdooId getCustomUserCurrencyId() {
        return customUserCurrencyId;
    }

    public Object getActionableErrors() {
        return actionableErrors;
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

    public void setAvailableJournalIdsAsList(List<AccountJournal> availableJournalIdsAsList) {
        this.availableJournalIdsAsList = availableJournalIdsAsList;
    }

    public void setAvailableJournalIds(List<Integer> availableJournalIds) {
        this.availableJournalIds = availableJournalIds;
    }

    public void setIsUseElectronicPaymentMethod(boolean isUseElectronicPaymentMethod) {
        this.isUseElectronicPaymentMethod = isUseElectronicPaymentMethod;
    }

    public void setPaymentMethodLineIdAsObject(AccountPaymentMethodLine paymentMethodLineIdAsObject) {
        this.paymentMethodLineIdAsObject = paymentMethodLineIdAsObject;
    }

    public void setPaymentMethodLineId(OdooId paymentMethodLineId) {
        this.paymentMethodLineId = paymentMethodLineId;
    }

    public void setSourceCurrencyIdAsObject(ResCurrency sourceCurrencyIdAsObject) {
        this.sourceCurrencyIdAsObject = sourceCurrencyIdAsObject;
    }

    public void setSourceCurrencyId(OdooId sourceCurrencyId) {
        this.sourceCurrencyId = sourceCurrencyId;
    }

    public void setPartnerBankIdAsObject(ResPartnerBank partnerBankIdAsObject) {
        this.partnerBankIdAsObject = partnerBankIdAsObject;
    }

    public void setPartnerBankId(OdooId partnerBankId) {
        this.partnerBankId = partnerBankId;
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

    public void setDuplicatePaymentIdsAsList(List<AccountPayment> duplicatePaymentIdsAsList) {
        this.duplicatePaymentIdsAsList = duplicatePaymentIdsAsList;
    }

    public void setDuplicatePaymentIds(List<Integer> duplicatePaymentIds) {
        this.duplicatePaymentIds = duplicatePaymentIds;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setUntrustedBankIdsAsList(List<ResPartnerBank> untrustedBankIdsAsList) {
        this.untrustedBankIdsAsList = untrustedBankIdsAsList;
    }

    public void setUntrustedBankIds(List<Integer> untrustedBankIds) {
        this.untrustedBankIds = untrustedBankIds;
    }

    public void setIsShowPartnerBankAccount(boolean isShowPartnerBankAccount) {
        this.isShowPartnerBankAccount = isShowPartnerBankAccount;
    }

    public void setInstallmentsMode(Object installmentsMode) {
        this.installmentsMode = installmentsMode;
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

    public void setCustomUserAmount(Object customUserAmount) {
        this.customUserAmount = customUserAmount;
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

    public void setIsShowPaymentDifference(boolean isShowPaymentDifference) {
        this.isShowPaymentDifference = isShowPaymentDifference;
    }

    public void setPaymentDifferenceHandling(Object paymentDifferenceHandling) {
        this.paymentDifferenceHandling = paymentDifferenceHandling;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
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

    public void setBatches(Object batches) {
        this.batches = batches;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setTotalPaymentsAmount(int totalPaymentsAmount) {
        this.totalPaymentsAmount = totalPaymentsAmount;
    }

    public void setQrCode(Object qrCode) {
        this.qrCode = qrCode;
    }

    public void setIsIsRegisterPaymentOnDraft(boolean isIsRegisterPaymentOnDraft) {
        this.isIsRegisterPaymentOnDraft = isIsRegisterPaymentOnDraft;
    }

    public void setInstallmentsSwitchHtml(Object installmentsSwitchHtml) {
        this.installmentsSwitchHtml = installmentsSwitchHtml;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setInstallmentsSwitchAmount(Object installmentsSwitchAmount) {
        this.installmentsSwitchAmount = installmentsSwitchAmount;
    }

    public void setMissingAccountPartnersAsList(List<ResPartner> missingAccountPartnersAsList) {
        this.missingAccountPartnersAsList = missingAccountPartnersAsList;
    }

    public void setMissingAccountPartners(List<Integer> missingAccountPartners) {
        this.missingAccountPartners = missingAccountPartners;
    }

    public void setSourceAmount(Object sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public void setIsGroupPayment(boolean isGroupPayment) {
        this.isGroupPayment = isGroupPayment;
    }

    public void setSourceAmountCurrency(Object sourceAmountCurrency) {
        this.sourceAmountCurrency = sourceAmountCurrency;
    }

    public void setIsCanEditWizard(boolean isCanEditWizard) {
        this.isCanEditWizard = isCanEditWizard;
    }

    public void setCustomUserCurrencyIdAsObject(ResCurrency customUserCurrencyIdAsObject) {
        this.customUserCurrencyIdAsObject = customUserCurrencyIdAsObject;
    }

    public void setCustomUserCurrencyId(OdooId customUserCurrencyId) {
        this.customUserCurrencyId = customUserCurrencyId;
    }

    public void setActionableErrors(Object actionableErrors) {
        this.actionableErrors = actionableErrors;
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