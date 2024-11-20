
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

package ch.helvethink.odoo4java.models.account;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine;
import ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerBank;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.payment")
public class AccountPayment implements OdooObj {

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<AccountJournal> availableJournalIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("available_journal_ids")
        private List<Integer> availableJournalIds;
    

    
        @JsonProperty("reconciled_invoices_type")
        private Object reconciledInvoicesType;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("is_matched")
        private boolean isIsMatched;
    

    
        @JsonProperty("need_cancel_request")
        private boolean isNeedCancelRequest;
    

    
        private List<AccountMove> invoiceIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("invoice_ids")
        private List<Integer> invoiceIds;
    

    
        @JsonProperty("reconciled_bills_count")
        private int reconciledBillsCount;
    

    
        @JsonProperty("use_electronic_payment_method")
        private boolean isUseElectronicPaymentMethod;
    

    
        private AccountPaymentMethodLine paymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("payment_method_line_id")
        private OdooId paymentMethodLineId;
    

    
        @JsonProperty("memo")
        private String memo;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("is_sent")
        private boolean isIsSent;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        private ResPartnerBank partnerBankIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("partner_bank_id")
        private OdooId partnerBankId;
    

    
        @JsonProperty("state")
        private Object state;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private List<AccountPayment> duplicatePaymentIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("duplicate_payment_ids")
        private List<Integer> duplicatePaymentIds;
    

    
        @JsonProperty("reconciled_invoices_count")
        private int reconciledInvoicesCount;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        private Account destinationAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("destination_account_id")
        private OdooId destinationAccountId;
    

    
        @JsonProperty("show_partner_bank_account")
        private boolean isShowPartnerBankAccount;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("payment_reference")
        private String paymentReference;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private List<AccountBankStatementLine> reconciledStatementLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
        @JsonProperty("reconciled_statement_line_ids")
        private List<Integer> reconciledStatementLineIds;
    

    
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
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("l10n_ch_reference_warning_msg")
        private String l10nChReferenceWarningMsg;
    

    
        private List<AccountMove> reconciledBillIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("reconciled_bill_ids")
        private List<Integer> reconciledBillIds;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private AccountPayment sourcePaymentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("source_payment_id")
        private OdooId sourcePaymentId;
    

    
        @JsonProperty("payment_method_code")
        private String paymentMethodCode;
    

    
        @JsonProperty("reconciled_statement_lines_count")
        private int reconciledStatementLinesCount;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
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
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("is_reconciled")
        private boolean isIsReconciled;
    

    
        private AccountMove moveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("move_id")
        private OdooId moveId;
    

    
        private AccountPayment pairedInternalTransferPaymentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("paired_internal_transfer_payment_id")
        private OdooId pairedInternalTransferPaymentId;
    

    
        @JsonProperty("qr_code")
        private Object qrCode;
    

    
        @JsonProperty("payment_receipt_title")
        private String paymentReceiptTitle;
    

    
        @JsonProperty("amount_company_currency_signed")
        private Object amountCompanyCurrencySigned;
    

    
        private List<AccountMove> reconciledInvoiceIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("reconciled_invoice_ids")
        private List<Integer> reconciledInvoiceIds;
    

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("amount")
        private Object amount;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("refunds_count")
        private int refundsCount;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        private Account outstandingAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("outstanding_account_id")
        private OdooId outstandingAccountId;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        private AccountPaymentMethod paymentMethodIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
        @JsonProperty("payment_method_id")
        private OdooId paymentMethodId;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("partner_type")
        private Object partnerType;
    

    
        @JsonProperty("amount_available_for_refund")
        private Object amountAvailableForRefund;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("amount_signed")
        private Object amountSigned;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    


    public AccountPayment() {
    // Constructor
    }


    public Date getDate() {
        return date;
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

    public Object getReconciledInvoicesType() {
        return reconciledInvoicesType;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public boolean getIsIsMatched() {
        return isIsMatched;
    }

    public boolean getIsNeedCancelRequest() {
        return isNeedCancelRequest;
    }

    public List<AccountMove> getInvoiceIdsAsList() {
        return invoiceIdsAsList;
    }

    public List<Integer> getInvoiceIds() {
        return invoiceIds;
    }

    public int getReconciledBillsCount() {
        return reconciledBillsCount;
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

    public String getMemo() {
        return memo;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsIsSent() {
        return isIsSent;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public ResPartnerBank getPartnerBankIdAsObject() {
        return partnerBankIdAsObject;
    }

    public OdooId getPartnerBankId() {
        return partnerBankId;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
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

    public int getReconciledInvoicesCount() {
        return reconciledInvoicesCount;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public Account getDestinationAccountIdAsObject() {
        return destinationAccountIdAsObject;
    }

    public OdooId getDestinationAccountId() {
        return destinationAccountId;
    }

    public boolean getIsShowPartnerBankAccount() {
        return isShowPartnerBankAccount;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getPaymentReference() {
        return paymentReference;
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

    public List<AccountBankStatementLine> getReconciledStatementLineIdsAsList() {
        return reconciledStatementLineIdsAsList;
    }

    public List<Integer> getReconciledStatementLineIds() {
        return reconciledStatementLineIds;
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

    public String getName() {
        return name;
    }

    public String getL10nChReferenceWarningMsg() {
        return l10nChReferenceWarningMsg;
    }

    public List<AccountMove> getReconciledBillIdsAsList() {
        return reconciledBillIdsAsList;
    }

    public List<Integer> getReconciledBillIds() {
        return reconciledBillIds;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public AccountPayment getSourcePaymentIdAsObject() {
        return sourcePaymentIdAsObject;
    }

    public OdooId getSourcePaymentId() {
        return sourcePaymentId;
    }

    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    public int getReconciledStatementLinesCount() {
        return reconciledStatementLinesCount;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
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

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public boolean getIsIsReconciled() {
        return isIsReconciled;
    }

    public AccountMove getMoveIdAsObject() {
        return moveIdAsObject;
    }

    public OdooId getMoveId() {
        return moveId;
    }

    public AccountPayment getPairedInternalTransferPaymentIdAsObject() {
        return pairedInternalTransferPaymentIdAsObject;
    }

    public OdooId getPairedInternalTransferPaymentId() {
        return pairedInternalTransferPaymentId;
    }

    public Object getQrCode() {
        return qrCode;
    }

    public String getPaymentReceiptTitle() {
        return paymentReceiptTitle;
    }

    public Object getAmountCompanyCurrencySigned() {
        return amountCompanyCurrencySigned;
    }

    public List<AccountMove> getReconciledInvoiceIdsAsList() {
        return reconciledInvoiceIdsAsList;
    }

    public List<Integer> getReconciledInvoiceIds() {
        return reconciledInvoiceIds;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
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

    public int getRefundsCount() {
        return refundsCount;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public Account getOutstandingAccountIdAsObject() {
        return outstandingAccountIdAsObject;
    }

    public OdooId getOutstandingAccountId() {
        return outstandingAccountId;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public AccountPaymentMethod getPaymentMethodIdAsObject() {
        return paymentMethodIdAsObject;
    }

    public OdooId getPaymentMethodId() {
        return paymentMethodId;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public Object getPartnerType() {
        return partnerType;
    }

    public Object getAmountAvailableForRefund() {
        return amountAvailableForRefund;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public Object getAmountSigned() {
        return amountSigned;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setDate(Date date) {
        this.date = date;
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

    public void setReconciledInvoicesType(Object reconciledInvoicesType) {
        this.reconciledInvoicesType = reconciledInvoicesType;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setIsIsMatched(boolean isIsMatched) {
        this.isIsMatched = isIsMatched;
    }

    public void setIsNeedCancelRequest(boolean isNeedCancelRequest) {
        this.isNeedCancelRequest = isNeedCancelRequest;
    }

    public void setInvoiceIdsAsList(List<AccountMove> invoiceIdsAsList) {
        this.invoiceIdsAsList = invoiceIdsAsList;
    }

    public void setInvoiceIds(List<Integer> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public void setReconciledBillsCount(int reconciledBillsCount) {
        this.reconciledBillsCount = reconciledBillsCount;
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

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsIsSent(boolean isIsSent) {
        this.isIsSent = isIsSent;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setPartnerBankIdAsObject(ResPartnerBank partnerBankIdAsObject) {
        this.partnerBankIdAsObject = partnerBankIdAsObject;
    }

    public void setPartnerBankId(OdooId partnerBankId) {
        this.partnerBankId = partnerBankId;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setReconciledInvoicesCount(int reconciledInvoicesCount) {
        this.reconciledInvoicesCount = reconciledInvoicesCount;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setDestinationAccountIdAsObject(Account destinationAccountIdAsObject) {
        this.destinationAccountIdAsObject = destinationAccountIdAsObject;
    }

    public void setDestinationAccountId(OdooId destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public void setIsShowPartnerBankAccount(boolean isShowPartnerBankAccount) {
        this.isShowPartnerBankAccount = isShowPartnerBankAccount;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
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

    public void setReconciledStatementLineIdsAsList(List<AccountBankStatementLine> reconciledStatementLineIdsAsList) {
        this.reconciledStatementLineIdsAsList = reconciledStatementLineIdsAsList;
    }

    public void setReconciledStatementLineIds(List<Integer> reconciledStatementLineIds) {
        this.reconciledStatementLineIds = reconciledStatementLineIds;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setL10nChReferenceWarningMsg(String l10nChReferenceWarningMsg) {
        this.l10nChReferenceWarningMsg = l10nChReferenceWarningMsg;
    }

    public void setReconciledBillIdsAsList(List<AccountMove> reconciledBillIdsAsList) {
        this.reconciledBillIdsAsList = reconciledBillIdsAsList;
    }

    public void setReconciledBillIds(List<Integer> reconciledBillIds) {
        this.reconciledBillIds = reconciledBillIds;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setSourcePaymentIdAsObject(AccountPayment sourcePaymentIdAsObject) {
        this.sourcePaymentIdAsObject = sourcePaymentIdAsObject;
    }

    public void setSourcePaymentId(OdooId sourcePaymentId) {
        this.sourcePaymentId = sourcePaymentId;
    }

    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    public void setReconciledStatementLinesCount(int reconciledStatementLinesCount) {
        this.reconciledStatementLinesCount = reconciledStatementLinesCount;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
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

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setIsIsReconciled(boolean isIsReconciled) {
        this.isIsReconciled = isIsReconciled;
    }

    public void setMoveIdAsObject(AccountMove moveIdAsObject) {
        this.moveIdAsObject = moveIdAsObject;
    }

    public void setMoveId(OdooId moveId) {
        this.moveId = moveId;
    }

    public void setPairedInternalTransferPaymentIdAsObject(AccountPayment pairedInternalTransferPaymentIdAsObject) {
        this.pairedInternalTransferPaymentIdAsObject = pairedInternalTransferPaymentIdAsObject;
    }

    public void setPairedInternalTransferPaymentId(OdooId pairedInternalTransferPaymentId) {
        this.pairedInternalTransferPaymentId = pairedInternalTransferPaymentId;
    }

    public void setQrCode(Object qrCode) {
        this.qrCode = qrCode;
    }

    public void setPaymentReceiptTitle(String paymentReceiptTitle) {
        this.paymentReceiptTitle = paymentReceiptTitle;
    }

    public void setAmountCompanyCurrencySigned(Object amountCompanyCurrencySigned) {
        this.amountCompanyCurrencySigned = amountCompanyCurrencySigned;
    }

    public void setReconciledInvoiceIdsAsList(List<AccountMove> reconciledInvoiceIdsAsList) {
        this.reconciledInvoiceIdsAsList = reconciledInvoiceIdsAsList;
    }

    public void setReconciledInvoiceIds(List<Integer> reconciledInvoiceIds) {
        this.reconciledInvoiceIds = reconciledInvoiceIds;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
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

    public void setRefundsCount(int refundsCount) {
        this.refundsCount = refundsCount;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setOutstandingAccountIdAsObject(Account outstandingAccountIdAsObject) {
        this.outstandingAccountIdAsObject = outstandingAccountIdAsObject;
    }

    public void setOutstandingAccountId(OdooId outstandingAccountId) {
        this.outstandingAccountId = outstandingAccountId;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setPaymentMethodIdAsObject(AccountPaymentMethod paymentMethodIdAsObject) {
        this.paymentMethodIdAsObject = paymentMethodIdAsObject;
    }

    public void setPaymentMethodId(OdooId paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setPartnerType(Object partnerType) {
        this.partnerType = partnerType;
    }

    public void setAmountAvailableForRefund(Object amountAvailableForRefund) {
        this.amountAvailableForRefund = amountAvailableForRefund;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setAmountSigned(Object amountSigned) {
        this.amountSigned = amountSigned;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}