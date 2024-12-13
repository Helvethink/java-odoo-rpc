
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
import ch.helvethink.odoo4java.models.account.bank.AccountBankStatement;
import ch.helvethink.odoo4java.models.account.journal.AccountJournalGroup;
import ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.res.*;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerBank;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.journal")
public class AccountJournal implements OdooObj {

    
        @JsonProperty("restrict_mode_hash_table")
        private boolean isRestrictModeHashTable;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("json_activity_data")
        private Object jsonActivityData;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("current_statement_balance")
        private Object currentStatementBalance;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("type")
        private Object type;
    

    
        private ResPartner companyPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("company_partner_id")
        private OdooId companyPartnerId;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("has_posted_entries")
        private boolean isHasPostedEntries;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        private ResBank bankIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResBank")
        @OdooModel("res.ResBank")
        @JsonProperty("bank_id")
        private OdooId bankId;
    

    
        @JsonProperty("kanban_dashboard_graph")
        private Object kanbanDashboardGraph;
    

    
        @JsonProperty("selected_payment_method_codes")
        private String selectedPaymentMethodCodes;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("default_account_type")
        private String defaultAccountType;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        private AccountBankStatement lastStatementIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.AccountBankStatement")
        @OdooModel("account.bank.AccountBankStatement")
        @JsonProperty("last_statement_id")
        private OdooId lastStatementId;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("access_token")
        private String accessToken;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("bank_acc_number")
        private String bankAccNumber;
    

    
        @JsonProperty("access_warning")
        private Object accessWarning;
    

    
        @JsonProperty("show_on_dashboard")
        private boolean isShowOnDashboard;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("accounting_date")
        private Date accountingDate;
    

    
        @JsonProperty("alias_email")
        private String aliasEmail;
    

    
        private ResPartnerBank bankAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("bank_account_id")
        private OdooId bankAccountId;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        @JsonProperty("autocheck_on_post")
        private boolean isAutocheckOnPost;
    

    
        @JsonProperty("invoice_reference_model")
        private Object invoiceReferenceModel;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("code")
        private String code;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("has_entries")
        private boolean isHasEntries;
    

    
        private Account profitAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("profit_account_id")
        private OdooId profitAccountId;
    

    
        private Account defaultAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("default_account_id")
        private OdooId defaultAccountId;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("invoice_reference_type")
        private Object invoiceReferenceType;
    

    
        @JsonProperty("refund_sequence")
        private boolean isRefundSequence;
    

    
        private List<AccountPaymentMethodLine> outboundPaymentMethodLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("outbound_payment_method_line_ids")
        private List<Integer> outboundPaymentMethodLineIds;
    

    
        @JsonProperty("bank_statements_source")
        private Object bankStatementsSource;
    

    
        @JsonProperty("payment_sequence")
        private boolean isPaymentSequence;
    

    
        @JsonProperty("has_sequence_holes")
        private boolean isHasSequenceHoles;
    

    
        @JsonProperty("entries_count")
        private int entriesCount;
    

    
        private List<Account> accountControlIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_control_ids")
        private List<Integer> accountControlIds;
    

    
        private List<AccountPaymentMethodLine> inboundPaymentMethodLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("inbound_payment_method_line_ids")
        private List<Integer> inboundPaymentMethodLineIds;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("sequence_override_regex")
        private Object sequenceOverrideRegex;
    

    
        @JsonProperty("access_url")
        private String accessUrl;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        private Account lossAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("loss_account_id")
        private OdooId lossAccountId;
    

    
        private List<AccountJournalGroup> journalGroupIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.journal.AccountJournalGroup")
        @OdooModel("account.journal.AccountJournalGroup")
        @JsonProperty("journal_group_ids")
        private List<Integer> journalGroupIds;
    

    
        @JsonProperty("alias_name")
        private String aliasName;
    

    
        @JsonProperty("display_alias_fields")
        private boolean isDisplayAliasFields;
    

    
        @JsonProperty("alias_domain")
        private String aliasDomain;
    

    
        private Account suspenseAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("suspense_account_id")
        private OdooId suspenseAccountId;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("has_unhashed_entries")
        private boolean isHasUnhashedEntries;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        private List<AccountPaymentMethod> availablePaymentMethodIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
        @JsonProperty("available_payment_method_ids")
        private List<Integer> availablePaymentMethodIds;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("kanban_dashboard")
        private Object kanbanDashboard;
    

    
        @JsonProperty("has_statement_lines")
        private boolean isHasStatementLines;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("alias_defaults")
        private Object aliasDefaults;
    


    public AccountJournal() {
    // Constructor
    }


    public boolean getIsRestrictModeHashTable() {
        return isRestrictModeHashTable;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getJsonActivityData() {
        return jsonActivityData;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getCurrentStatementBalance() {
        return currentStatementBalance;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getType() {
        return type;
    }

    public ResPartner getCompanyPartnerIdAsObject() {
        return companyPartnerIdAsObject;
    }

    public OdooId getCompanyPartnerId() {
        return companyPartnerId;
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

    public boolean getIsHasPostedEntries() {
        return isHasPostedEntries;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public ResBank getBankIdAsObject() {
        return bankIdAsObject;
    }

    public OdooId getBankId() {
        return bankId;
    }

    public Object getKanbanDashboardGraph() {
        return kanbanDashboardGraph;
    }

    public String getSelectedPaymentMethodCodes() {
        return selectedPaymentMethodCodes;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getDefaultAccountType() {
        return defaultAccountType;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public AccountBankStatement getLastStatementIdAsObject() {
        return lastStatementIdAsObject;
    }

    public OdooId getLastStatementId() {
        return lastStatementId;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
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

    public String getAccessToken() {
        return accessToken;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getBankAccNumber() {
        return bankAccNumber;
    }

    public Object getAccessWarning() {
        return accessWarning;
    }

    public boolean getIsShowOnDashboard() {
        return isShowOnDashboard;
    }

    public String getName() {
        return name;
    }

    public Date getAccountingDate() {
        return accountingDate;
    }

    public String getAliasEmail() {
        return aliasEmail;
    }

    public ResPartnerBank getBankAccountIdAsObject() {
        return bankAccountIdAsObject;
    }

    public OdooId getBankAccountId() {
        return bankAccountId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public boolean getIsAutocheckOnPost() {
        return isAutocheckOnPost;
    }

    public Object getInvoiceReferenceModel() {
        return invoiceReferenceModel;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public boolean getIsHasEntries() {
        return isHasEntries;
    }

    public Account getProfitAccountIdAsObject() {
        return profitAccountIdAsObject;
    }

    public OdooId getProfitAccountId() {
        return profitAccountId;
    }

    public Account getDefaultAccountIdAsObject() {
        return defaultAccountIdAsObject;
    }

    public OdooId getDefaultAccountId() {
        return defaultAccountId;
    }

    public Date getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public Object getInvoiceReferenceType() {
        return invoiceReferenceType;
    }

    public boolean getIsRefundSequence() {
        return isRefundSequence;
    }

    public List<AccountPaymentMethodLine> getOutboundPaymentMethodLineIdsAsList() {
        return outboundPaymentMethodLineIdsAsList;
    }

    public List<Integer> getOutboundPaymentMethodLineIds() {
        return outboundPaymentMethodLineIds;
    }

    public Object getBankStatementsSource() {
        return bankStatementsSource;
    }

    public boolean getIsPaymentSequence() {
        return isPaymentSequence;
    }

    public boolean getIsHasSequenceHoles() {
        return isHasSequenceHoles;
    }

    public int getEntriesCount() {
        return entriesCount;
    }

    public List<Account> getAccountControlIdsAsList() {
        return accountControlIdsAsList;
    }

    public List<Integer> getAccountControlIds() {
        return accountControlIds;
    }

    public List<AccountPaymentMethodLine> getInboundPaymentMethodLineIdsAsList() {
        return inboundPaymentMethodLineIdsAsList;
    }

    public List<Integer> getInboundPaymentMethodLineIds() {
        return inboundPaymentMethodLineIds;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getSequenceOverrideRegex() {
        return sequenceOverrideRegex;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public Account getLossAccountIdAsObject() {
        return lossAccountIdAsObject;
    }

    public OdooId getLossAccountId() {
        return lossAccountId;
    }

    public List<AccountJournalGroup> getJournalGroupIdsAsList() {
        return journalGroupIdsAsList;
    }

    public List<Integer> getJournalGroupIds() {
        return journalGroupIds;
    }

    public String getAliasName() {
        return aliasName;
    }

    public boolean getIsDisplayAliasFields() {
        return isDisplayAliasFields;
    }

    public String getAliasDomain() {
        return aliasDomain;
    }

    public Account getSuspenseAccountIdAsObject() {
        return suspenseAccountIdAsObject;
    }

    public OdooId getSuspenseAccountId() {
        return suspenseAccountId;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsHasUnhashedEntries() {
        return isHasUnhashedEntries;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public List<AccountPaymentMethod> getAvailablePaymentMethodIdsAsList() {
        return availablePaymentMethodIdsAsList;
    }

    public List<Integer> getAvailablePaymentMethodIds() {
        return availablePaymentMethodIds;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public Object getKanbanDashboard() {
        return kanbanDashboard;
    }

    public boolean getIsHasStatementLines() {
        return isHasStatementLines;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Object getAliasDefaults() {
        return aliasDefaults;
    }



    public void setIsRestrictModeHashTable(boolean isRestrictModeHashTable) {
        this.isRestrictModeHashTable = isRestrictModeHashTable;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setJsonActivityData(Object jsonActivityData) {
        this.jsonActivityData = jsonActivityData;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setCurrentStatementBalance(Object currentStatementBalance) {
        this.currentStatementBalance = currentStatementBalance;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setCompanyPartnerIdAsObject(ResPartner companyPartnerIdAsObject) {
        this.companyPartnerIdAsObject = companyPartnerIdAsObject;
    }

    public void setCompanyPartnerId(OdooId companyPartnerId) {
        this.companyPartnerId = companyPartnerId;
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

    public void setIsHasPostedEntries(boolean isHasPostedEntries) {
        this.isHasPostedEntries = isHasPostedEntries;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setBankIdAsObject(ResBank bankIdAsObject) {
        this.bankIdAsObject = bankIdAsObject;
    }

    public void setBankId(OdooId bankId) {
        this.bankId = bankId;
    }

    public void setKanbanDashboardGraph(Object kanbanDashboardGraph) {
        this.kanbanDashboardGraph = kanbanDashboardGraph;
    }

    public void setSelectedPaymentMethodCodes(String selectedPaymentMethodCodes) {
        this.selectedPaymentMethodCodes = selectedPaymentMethodCodes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDefaultAccountType(String defaultAccountType) {
        this.defaultAccountType = defaultAccountType;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setLastStatementIdAsObject(AccountBankStatement lastStatementIdAsObject) {
        this.lastStatementIdAsObject = lastStatementIdAsObject;
    }

    public void setLastStatementId(OdooId lastStatementId) {
        this.lastStatementId = lastStatementId;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
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

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setBankAccNumber(String bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }

    public void setAccessWarning(Object accessWarning) {
        this.accessWarning = accessWarning;
    }

    public void setIsShowOnDashboard(boolean isShowOnDashboard) {
        this.isShowOnDashboard = isShowOnDashboard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountingDate(Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    public void setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail;
    }

    public void setBankAccountIdAsObject(ResPartnerBank bankAccountIdAsObject) {
        this.bankAccountIdAsObject = bankAccountIdAsObject;
    }

    public void setBankAccountId(OdooId bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setIsAutocheckOnPost(boolean isAutocheckOnPost) {
        this.isAutocheckOnPost = isAutocheckOnPost;
    }

    public void setInvoiceReferenceModel(Object invoiceReferenceModel) {
        this.invoiceReferenceModel = invoiceReferenceModel;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setIsHasEntries(boolean isHasEntries) {
        this.isHasEntries = isHasEntries;
    }

    public void setProfitAccountIdAsObject(Account profitAccountIdAsObject) {
        this.profitAccountIdAsObject = profitAccountIdAsObject;
    }

    public void setProfitAccountId(OdooId profitAccountId) {
        this.profitAccountId = profitAccountId;
    }

    public void setDefaultAccountIdAsObject(Account defaultAccountIdAsObject) {
        this.defaultAccountIdAsObject = defaultAccountIdAsObject;
    }

    public void setDefaultAccountId(OdooId defaultAccountId) {
        this.defaultAccountId = defaultAccountId;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setInvoiceReferenceType(Object invoiceReferenceType) {
        this.invoiceReferenceType = invoiceReferenceType;
    }

    public void setIsRefundSequence(boolean isRefundSequence) {
        this.isRefundSequence = isRefundSequence;
    }

    public void setOutboundPaymentMethodLineIdsAsList(List<AccountPaymentMethodLine> outboundPaymentMethodLineIdsAsList) {
        this.outboundPaymentMethodLineIdsAsList = outboundPaymentMethodLineIdsAsList;
    }

    public void setOutboundPaymentMethodLineIds(List<Integer> outboundPaymentMethodLineIds) {
        this.outboundPaymentMethodLineIds = outboundPaymentMethodLineIds;
    }

    public void setBankStatementsSource(Object bankStatementsSource) {
        this.bankStatementsSource = bankStatementsSource;
    }

    public void setIsPaymentSequence(boolean isPaymentSequence) {
        this.isPaymentSequence = isPaymentSequence;
    }

    public void setIsHasSequenceHoles(boolean isHasSequenceHoles) {
        this.isHasSequenceHoles = isHasSequenceHoles;
    }

    public void setEntriesCount(int entriesCount) {
        this.entriesCount = entriesCount;
    }

    public void setAccountControlIdsAsList(List<Account> accountControlIdsAsList) {
        this.accountControlIdsAsList = accountControlIdsAsList;
    }

    public void setAccountControlIds(List<Integer> accountControlIds) {
        this.accountControlIds = accountControlIds;
    }

    public void setInboundPaymentMethodLineIdsAsList(List<AccountPaymentMethodLine> inboundPaymentMethodLineIdsAsList) {
        this.inboundPaymentMethodLineIdsAsList = inboundPaymentMethodLineIdsAsList;
    }

    public void setInboundPaymentMethodLineIds(List<Integer> inboundPaymentMethodLineIds) {
        this.inboundPaymentMethodLineIds = inboundPaymentMethodLineIds;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setSequenceOverrideRegex(Object sequenceOverrideRegex) {
        this.sequenceOverrideRegex = sequenceOverrideRegex;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setLossAccountIdAsObject(Account lossAccountIdAsObject) {
        this.lossAccountIdAsObject = lossAccountIdAsObject;
    }

    public void setLossAccountId(OdooId lossAccountId) {
        this.lossAccountId = lossAccountId;
    }

    public void setJournalGroupIdsAsList(List<AccountJournalGroup> journalGroupIdsAsList) {
        this.journalGroupIdsAsList = journalGroupIdsAsList;
    }

    public void setJournalGroupIds(List<Integer> journalGroupIds) {
        this.journalGroupIds = journalGroupIds;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setIsDisplayAliasFields(boolean isDisplayAliasFields) {
        this.isDisplayAliasFields = isDisplayAliasFields;
    }

    public void setAliasDomain(String aliasDomain) {
        this.aliasDomain = aliasDomain;
    }

    public void setSuspenseAccountIdAsObject(Account suspenseAccountIdAsObject) {
        this.suspenseAccountIdAsObject = suspenseAccountIdAsObject;
    }

    public void setSuspenseAccountId(OdooId suspenseAccountId) {
        this.suspenseAccountId = suspenseAccountId;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsHasUnhashedEntries(boolean isHasUnhashedEntries) {
        this.isHasUnhashedEntries = isHasUnhashedEntries;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setAvailablePaymentMethodIdsAsList(List<AccountPaymentMethod> availablePaymentMethodIdsAsList) {
        this.availablePaymentMethodIdsAsList = availablePaymentMethodIdsAsList;
    }

    public void setAvailablePaymentMethodIds(List<Integer> availablePaymentMethodIds) {
        this.availablePaymentMethodIds = availablePaymentMethodIds;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setKanbanDashboard(Object kanbanDashboard) {
        this.kanbanDashboard = kanbanDashboard;
    }

    public void setIsHasStatementLines(boolean isHasStatementLines) {
        this.isHasStatementLines = isHasStatementLines;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setAliasDefaults(Object aliasDefaults) {
        this.aliasDefaults = aliasDefaults;
    }



}