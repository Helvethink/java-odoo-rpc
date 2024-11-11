
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

package ch.helvethink.odoo4java.test.ng.account;

import ch.helvethink.odoo4java.test.ng.account.journal.AccountJournalGroup;
import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentMethod;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.test.ng.mail.MailAlias;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResBank;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.ir.IrSequence;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.account.bank.AccountBankStatement;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("account.journal")
public class AccountJournal implements OdooObj {

    
    private boolean isRestrictModeHashTable;

    
    private Date writeDate;

    
    private Object jsonActivityData;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object currentStatementBalance;

    
    private Object activityDateDeadline;

    
    private Object type;

    
    private ResPartner companyPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId companyPartnerId;

    
    private Object activityState;

    
    private Object activityExceptionDecoration;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private boolean isHasMessage;

    
    private ResBank bankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResBank")
        @OdooModel("res.ResBank")
    
    private OdooId bankId;

    
    private Object kanbanDashboardGraph;

    
    private String selectedPaymentMethodCodes;

    
    private int id;

    
    private Date createDate;

    
    private String defaultAccountType;

    
    private ResUsers saleActivityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId saleActivityUserId;

    
    private int messageAttachmentCount;

    
    private Object saleActivityNote;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private AccountBankStatement lastStatementIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.bank.AccountBankStatement")
        @OdooModel("account.bank.AccountBankStatement")
    
    private OdooId lastStatementId;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String accessToken;

    
    private int sequence;

    
    private String countryCode;

    
    private String bankAccNumber;

    
    private IrSequence secureSequenceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrSequence")
        @OdooModel("ir.IrSequence")
    
    private OdooId secureSequenceId;

    
    private Object accessWarning;

    
    private boolean isShowOnDashboard;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private Object accountingDate;

    
    private String aliasEmail;

    
    private ResPartnerBank bankAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId bankAccountId;

    
    private boolean isMessageIsFollower;

    
    private Object invoiceReferenceModel;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private int color;

    
    private MailAlias aliasIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailAlias")
        @OdooModel("mail.MailAlias")
    
    private OdooId aliasId;

    
    private Account profitAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId profitAccountId;

    
    private Account defaultAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId defaultAccountId;

    
    private Object myActivityDateDeadline;

    
    private Object invoiceReferenceType;

    
    private boolean isRefundSequence;

    
    private List<AccountPaymentMethodLine> outboundPaymentMethodLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
    
    private List<Integer> outboundPaymentMethodLineIds;

    
    private Object bankStatementsSource;

    
    private boolean isPaymentSequence;

    
    private boolean isHasSequenceHoles;

    
    private int entriesCount;

    
    private List<Account> accountControlIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private List<Integer> accountControlIds;

    
    private List<AccountPaymentMethodLine> inboundPaymentMethodLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
    
    private List<Integer> inboundPaymentMethodLineIds;

    
    private String activityTypeIcon;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object sequenceOverrideRegex;

    
    private String accessUrl;

    
    private boolean isMessageHasSmsError;

    
    private Account lossAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId lossAccountId;

    
    private List<AccountJournalGroup> journalGroupIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.journal.AccountJournalGroup")
        @OdooModel("account.journal.AccountJournalGroup")
    
    private List<Integer> journalGroupIds;

    
    private MailActivityType saleActivityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId saleActivityTypeId;

    
    private String aliasName;

    
    private String aliasDomain;

    
    private Account suspenseAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId suspenseAccountId;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private List<AccountPaymentMethod> availablePaymentMethodIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentMethod")
        @OdooModel("account.payment.AccountPaymentMethod")
    
    private List<Integer> availablePaymentMethodIds;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private Object kanbanDashboard;

    
    private boolean isHasStatementLines;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
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

    public Object getActivityDateDeadline() {
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

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
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

    public ResUsers getSaleActivityUserIdAsObject() {
        return saleActivityUserIdAsObject;
    }

    public OdooId getSaleActivityUserId() {
        return saleActivityUserId;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public Object getSaleActivityNote() {
        return saleActivityNote;
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

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
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

    public IrSequence getSecureSequenceIdAsObject() {
        return secureSequenceIdAsObject;
    }

    public OdooId getSecureSequenceId() {
        return secureSequenceId;
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

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public Object getAccountingDate() {
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

    public MailAlias getAliasIdAsObject() {
        return aliasIdAsObject;
    }

    public OdooId getAliasId() {
        return aliasId;
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

    public Object getMyActivityDateDeadline() {
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

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
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

    public MailActivityType getSaleActivityTypeIdAsObject() {
        return saleActivityTypeIdAsObject;
    }

    public OdooId getSaleActivityTypeId() {
        return saleActivityTypeId;
    }

    public String getAliasName() {
        return aliasName;
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

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
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

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
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

    public void setActivityDateDeadline(Object activityDateDeadline) {
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

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
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

    public void setSaleActivityUserIdAsObject(ResUsers saleActivityUserIdAsObject) {
        this.saleActivityUserIdAsObject = saleActivityUserIdAsObject;
    }

    public void setSaleActivityUserId(OdooId saleActivityUserId) {
        this.saleActivityUserId = saleActivityUserId;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setSaleActivityNote(Object saleActivityNote) {
        this.saleActivityNote = saleActivityNote;
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

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
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

    public void setSecureSequenceIdAsObject(IrSequence secureSequenceIdAsObject) {
        this.secureSequenceIdAsObject = secureSequenceIdAsObject;
    }

    public void setSecureSequenceId(OdooId secureSequenceId) {
        this.secureSequenceId = secureSequenceId;
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

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setAccountingDate(Object accountingDate) {
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

    public void setAliasIdAsObject(MailAlias aliasIdAsObject) {
        this.aliasIdAsObject = aliasIdAsObject;
    }

    public void setAliasId(OdooId aliasId) {
        this.aliasId = aliasId;
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

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
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

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
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

    public void setSaleActivityTypeIdAsObject(MailActivityType saleActivityTypeIdAsObject) {
        this.saleActivityTypeIdAsObject = saleActivityTypeIdAsObject;
    }

    public void setSaleActivityTypeId(OdooId saleActivityTypeId) {
        this.saleActivityTypeId = saleActivityTypeId;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
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

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
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

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
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