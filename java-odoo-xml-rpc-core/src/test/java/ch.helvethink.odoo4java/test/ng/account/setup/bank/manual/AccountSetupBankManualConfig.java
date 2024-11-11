
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

package ch.helvethink.odoo4java.test.ng.account.setup.bank.manual;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResBank;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("account.setup.bank.manual.config")
public class AccountSetupBankManualConfig implements OdooObj {

    
    private Date writeDate;

    
    private int partnerSupplierRank;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object accType;

    
    private ResPartnerBank resPartnerBankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId resPartnerBankId;

    
    private boolean isHasIbanWarning;

    
    private Object activityDateDeadline;

    
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

    
    private String partnerCountryName;

    
    private boolean isHasMessage;

    
    private ResBank bankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResBank")
        @OdooModel("res.ResBank")
    
    private OdooId bankId;

    
    private int id;

    
    private Date createDate;

    
    private int messageAttachmentCount;

    
    private String l10nChQrIban;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String activityExceptionIcon;

    
    private boolean isLockTrustFields;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private int sequence;

    
    private AccountJournal linkedJournalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId linkedJournalId;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private String newJournalName;

    
    private boolean isAllowOutPayment;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isMessageIsFollower;

    
    private int numJournalsWithoutAccount;

    
    private boolean isL10nChDisplayQrBankOptions;

    
    private int partnerCustomerRank;

    
    private Object myActivityDateDeadline;

    
    private String bankBic;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String bankName;

    
    private String moneyTransferService;

    
    private boolean isUserHasGroupValidateBankAccount;

    
    private String accNumber;

    
    private List<AccountJournal> journalIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private List<Integer> journalId;

    
    private String activityTypeIcon;

    
    private String accHolderName;

    
    private boolean isHasMoneyTransferWarning;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String sanitizedAccNumber;

    
    private boolean isMessageHasSmsError;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private List<AccountMove> relatedMovesAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> relatedMoves;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public AccountSetupBankManualConfig() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getPartnerSupplierRank() {
        return partnerSupplierRank;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getAccType() {
        return accType;
    }

    public ResPartnerBank getResPartnerBankIdAsObject() {
        return resPartnerBankIdAsObject;
    }

    public OdooId getResPartnerBankId() {
        return resPartnerBankId;
    }

    public boolean getIsHasIbanWarning() {
        return isHasIbanWarning;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
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

    public String getPartnerCountryName() {
        return partnerCountryName;
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

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public String getL10nChQrIban() {
        return l10nChQrIban;
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

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public boolean getIsLockTrustFields() {
        return isLockTrustFields;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public int getSequence() {
        return sequence;
    }

    public AccountJournal getLinkedJournalIdAsObject() {
        return linkedJournalIdAsObject;
    }

    public OdooId getLinkedJournalId() {
        return linkedJournalId;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public String getNewJournalName() {
        return newJournalName;
    }

    public boolean getIsAllowOutPayment() {
        return isAllowOutPayment;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public int getNumJournalsWithoutAccount() {
        return numJournalsWithoutAccount;
    }

    public boolean getIsL10nChDisplayQrBankOptions() {
        return isL10nChDisplayQrBankOptions;
    }

    public int getPartnerCustomerRank() {
        return partnerCustomerRank;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public String getBankBic() {
        return bankBic;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getMoneyTransferService() {
        return moneyTransferService;
    }

    public boolean getIsUserHasGroupValidateBankAccount() {
        return isUserHasGroupValidateBankAccount;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public List<AccountJournal> getJournalIdAsList() {
        return journalIdAsList;
    }

    public List<Integer> getJournalId() {
        return journalId;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public boolean getIsHasMoneyTransferWarning() {
        return isHasMoneyTransferWarning;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public String getSanitizedAccNumber() {
        return sanitizedAccNumber;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
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

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public List<AccountMove> getRelatedMovesAsList() {
        return relatedMovesAsList;
    }

    public List<Integer> getRelatedMoves() {
        return relatedMoves;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
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

    public void setPartnerSupplierRank(int partnerSupplierRank) {
        this.partnerSupplierRank = partnerSupplierRank;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setAccType(Object accType) {
        this.accType = accType;
    }

    public void setResPartnerBankIdAsObject(ResPartnerBank resPartnerBankIdAsObject) {
        this.resPartnerBankIdAsObject = resPartnerBankIdAsObject;
    }

    public void setResPartnerBankId(OdooId resPartnerBankId) {
        this.resPartnerBankId = resPartnerBankId;
    }

    public void setIsHasIbanWarning(boolean isHasIbanWarning) {
        this.isHasIbanWarning = isHasIbanWarning;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
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

    public void setPartnerCountryName(String partnerCountryName) {
        this.partnerCountryName = partnerCountryName;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setL10nChQrIban(String l10nChQrIban) {
        this.l10nChQrIban = l10nChQrIban;
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

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setIsLockTrustFields(boolean isLockTrustFields) {
        this.isLockTrustFields = isLockTrustFields;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setLinkedJournalIdAsObject(AccountJournal linkedJournalIdAsObject) {
        this.linkedJournalIdAsObject = linkedJournalIdAsObject;
    }

    public void setLinkedJournalId(OdooId linkedJournalId) {
        this.linkedJournalId = linkedJournalId;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setNewJournalName(String newJournalName) {
        this.newJournalName = newJournalName;
    }

    public void setIsAllowOutPayment(boolean isAllowOutPayment) {
        this.isAllowOutPayment = isAllowOutPayment;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setNumJournalsWithoutAccount(int numJournalsWithoutAccount) {
        this.numJournalsWithoutAccount = numJournalsWithoutAccount;
    }

    public void setIsL10nChDisplayQrBankOptions(boolean isL10nChDisplayQrBankOptions) {
        this.isL10nChDisplayQrBankOptions = isL10nChDisplayQrBankOptions;
    }

    public void setPartnerCustomerRank(int partnerCustomerRank) {
        this.partnerCustomerRank = partnerCustomerRank;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setBankBic(String bankBic) {
        this.bankBic = bankBic;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setMoneyTransferService(String moneyTransferService) {
        this.moneyTransferService = moneyTransferService;
    }

    public void setIsUserHasGroupValidateBankAccount(boolean isUserHasGroupValidateBankAccount) {
        this.isUserHasGroupValidateBankAccount = isUserHasGroupValidateBankAccount;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setJournalIdAsList(List<AccountJournal> journalIdAsList) {
        this.journalIdAsList = journalIdAsList;
    }

    public void setJournalId(List<Integer> journalId) {
        this.journalId = journalId;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setIsHasMoneyTransferWarning(boolean isHasMoneyTransferWarning) {
        this.isHasMoneyTransferWarning = isHasMoneyTransferWarning;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setSanitizedAccNumber(String sanitizedAccNumber) {
        this.sanitizedAccNumber = sanitizedAccNumber;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
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

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setRelatedMovesAsList(List<AccountMove> relatedMovesAsList) {
        this.relatedMovesAsList = relatedMovesAsList;
    }

    public void setRelatedMoves(List<Integer> relatedMoves) {
        this.relatedMoves = relatedMoves;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}