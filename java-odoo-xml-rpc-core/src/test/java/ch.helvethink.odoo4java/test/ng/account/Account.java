
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

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("account.account")
public class Account implements OdooObj {

    
    private Date writeDate;

    
    private Object note;

    
    private boolean isMessageIsFollower;

    
    private Object accountType;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private String code;

    
    private List<AccountTax> taxIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> taxIds;

    
    private boolean isDeprecated;

    
    private boolean isUsed;

    
    private ResCurrency companyCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrencyId;

    
    private Object openingCredit;

    
    private int messageHasErrorCounter;

    
    private int relatedTaxesAmount;

    
    private boolean isHasMessage;

    
    private boolean isIncludeInitialBalance;

    
    private Object openingDebit;

    
    private double currentBalance;

    
    private boolean isNonTrade;

    
    private AccountRoot rootIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountRoot")
        @OdooModel("account.AccountRoot")
    
    private OdooId rootId;

    
    private Object openingBalance;

    
    private int id;

    
    private Date createDate;

    
    private List<AccountJournal> allowedJournalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private List<Integer> allowedJournalIds;

    
    private int messageAttachmentCount;

    
    private List<AccountAccountTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag")
        @OdooModel("account.account.AccountAccountTag")
    
    private List<Integer> tagIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isMessageHasSmsError;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private boolean isReconcile;

    
    private boolean isMessageHasError;

    
    private AccountGroup groupIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountGroup")
        @OdooModel("account.AccountGroup")
    
    private OdooId groupId;

    
    private boolean isMessageNeedaction;

    
    private Object internalGroup;

    
    private int messageNeedactionCounter;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public Account() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
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

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public String getCode() {
        return code;
    }

    public List<AccountTax> getTaxIdsAsList() {
        return taxIdsAsList;
    }

    public List<Integer> getTaxIds() {
        return taxIds;
    }

    public boolean getIsDeprecated() {
        return isDeprecated;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
    }

    public Object getOpeningCredit() {
        return openingCredit;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public int getRelatedTaxesAmount() {
        return relatedTaxesAmount;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public boolean getIsIncludeInitialBalance() {
        return isIncludeInitialBalance;
    }

    public Object getOpeningDebit() {
        return openingDebit;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public boolean getIsNonTrade() {
        return isNonTrade;
    }

    public AccountRoot getRootIdAsObject() {
        return rootIdAsObject;
    }

    public OdooId getRootId() {
        return rootId;
    }

    public Object getOpeningBalance() {
        return openingBalance;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<AccountJournal> getAllowedJournalIdsAsList() {
        return allowedJournalIdsAsList;
    }

    public List<Integer> getAllowedJournalIds() {
        return allowedJournalIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<AccountAccountTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public boolean getIsReconcile() {
        return isReconcile;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public AccountGroup getGroupIdAsObject() {
        return groupIdAsObject;
    }

    public OdooId getGroupId() {
        return groupId;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public Object getInternalGroup() {
        return internalGroup;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
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

    public void setNote(Object note) {
        this.note = note;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
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

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTaxIdsAsList(List<AccountTax> taxIdsAsList) {
        this.taxIdsAsList = taxIdsAsList;
    }

    public void setTaxIds(List<Integer> taxIds) {
        this.taxIds = taxIds;
    }

    public void setIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
    }

    public void setOpeningCredit(Object openingCredit) {
        this.openingCredit = openingCredit;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setRelatedTaxesAmount(int relatedTaxesAmount) {
        this.relatedTaxesAmount = relatedTaxesAmount;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setIsIncludeInitialBalance(boolean isIncludeInitialBalance) {
        this.isIncludeInitialBalance = isIncludeInitialBalance;
    }

    public void setOpeningDebit(Object openingDebit) {
        this.openingDebit = openingDebit;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setIsNonTrade(boolean isNonTrade) {
        this.isNonTrade = isNonTrade;
    }

    public void setRootIdAsObject(AccountRoot rootIdAsObject) {
        this.rootIdAsObject = rootIdAsObject;
    }

    public void setRootId(OdooId rootId) {
        this.rootId = rootId;
    }

    public void setOpeningBalance(Object openingBalance) {
        this.openingBalance = openingBalance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAllowedJournalIdsAsList(List<AccountJournal> allowedJournalIdsAsList) {
        this.allowedJournalIdsAsList = allowedJournalIdsAsList;
    }

    public void setAllowedJournalIds(List<Integer> allowedJournalIds) {
        this.allowedJournalIds = allowedJournalIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTagIdsAsList(List<AccountAccountTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setIsReconcile(boolean isReconcile) {
        this.isReconcile = isReconcile;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setGroupIdAsObject(AccountGroup groupIdAsObject) {
        this.groupIdAsObject = groupIdAsObject;
    }

    public void setGroupId(OdooId groupId) {
        this.groupId = groupId;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setInternalGroup(Object internalGroup) {
        this.internalGroup = internalGroup;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
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