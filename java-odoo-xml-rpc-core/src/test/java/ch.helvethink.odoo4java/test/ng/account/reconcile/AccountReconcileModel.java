
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

package ch.helvethink.odoo4java.test.ng.account.reconcile;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.account.reconcile.model.AccountReconcileModelLine;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory;
import ch.helvethink.odoo4java.test.ng.account.reconcile.model.partner.AccountReconcileModelPartnerMapping;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("account.reconcile.model")
public class AccountReconcileModel implements OdooObj {

    
    private Date writeDate;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object matchNote;

    
    private boolean isMatchSameCurrency;

    
    private boolean isMatchTextLocationReference;

    
    private boolean isMatchTextLocationLabel;

    
    private int messageHasErrorCounter;

    
    private boolean isHasMessage;

    
    private int numberEntries;

    
    private int id;

    
    private Date createDate;

    
    private String decimalSeparator;

    
    private int messageAttachmentCount;

    
    private boolean isShowDecimalSeparator;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private boolean isMatchTextLocationNote;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<AccountJournal> matchJournalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private List<Integer> matchJournalIds;

    
    private double matchAmountMin;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private Object matchingOrder;

    
    private int sequence;

    
    private List<AccountReconcileModelLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.reconcile.model.AccountReconcileModelLine")
        @OdooModel("account.reconcile.model.AccountReconcileModelLine")
    
    private List<Integer> lineIds;

    
    private int pastMonthsLimit;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private String matchNoteParam;

    
    private double matchAmountMax;

    
    private Object matchAmount;

    
    private Object paymentToleranceType;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ResPartner> matchPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> matchPartnerIds;

    
    private String matchTransactionTypeParam;

    
    private Object ruleType;

    
    private String matchLabelParam;

    
    private Object matchNature;

    
    private boolean isToCheck;

    
    private double paymentToleranceParam;

    
    private List<ResPartnerCategory> matchPartnerCategoryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
    
    private List<Integer> matchPartnerCategoryIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isMessageHasSmsError;

    
    private boolean isAutoReconcile;

    
    private boolean isAllowPaymentTolerance;

    
    private List<AccountReconcileModelPartnerMapping> partnerMappingLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.reconcile.model.partner.AccountReconcileModelPartnerMapping")
        @OdooModel("account.reconcile.model.partner.AccountReconcileModelPartnerMapping")
    
    private List<Integer> partnerMappingLineIds;

    
    private boolean isMessageHasError;

    
    private Object matchLabel;

    
    private boolean isMatchPartner;

    
    private boolean isMessageNeedaction;

    
    private Object matchTransactionType;

    
    private int messageNeedactionCounter;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;


    public AccountReconcileModel() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getMatchNote() {
        return matchNote;
    }

    public boolean getIsMatchSameCurrency() {
        return isMatchSameCurrency;
    }

    public boolean getIsMatchTextLocationReference() {
        return isMatchTextLocationReference;
    }

    public boolean getIsMatchTextLocationLabel() {
        return isMatchTextLocationLabel;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public int getNumberEntries() {
        return numberEntries;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public boolean getIsShowDecimalSeparator() {
        return isShowDecimalSeparator;
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

    public boolean getIsMatchTextLocationNote() {
        return isMatchTextLocationNote;
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

    public List<AccountJournal> getMatchJournalIdsAsList() {
        return matchJournalIdsAsList;
    }

    public List<Integer> getMatchJournalIds() {
        return matchJournalIds;
    }

    public double getMatchAmountMin() {
        return matchAmountMin;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public Object getMatchingOrder() {
        return matchingOrder;
    }

    public int getSequence() {
        return sequence;
    }

    public List<AccountReconcileModelLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public int getPastMonthsLimit() {
        return pastMonthsLimit;
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

    public String getMatchNoteParam() {
        return matchNoteParam;
    }

    public double getMatchAmountMax() {
        return matchAmountMax;
    }

    public Object getMatchAmount() {
        return matchAmount;
    }

    public Object getPaymentToleranceType() {
        return paymentToleranceType;
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

    public List<ResPartner> getMatchPartnerIdsAsList() {
        return matchPartnerIdsAsList;
    }

    public List<Integer> getMatchPartnerIds() {
        return matchPartnerIds;
    }

    public String getMatchTransactionTypeParam() {
        return matchTransactionTypeParam;
    }

    public Object getRuleType() {
        return ruleType;
    }

    public String getMatchLabelParam() {
        return matchLabelParam;
    }

    public Object getMatchNature() {
        return matchNature;
    }

    public boolean getIsToCheck() {
        return isToCheck;
    }

    public double getPaymentToleranceParam() {
        return paymentToleranceParam;
    }

    public List<ResPartnerCategory> getMatchPartnerCategoryIdsAsList() {
        return matchPartnerCategoryIdsAsList;
    }

    public List<Integer> getMatchPartnerCategoryIds() {
        return matchPartnerCategoryIds;
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

    public boolean getIsAutoReconcile() {
        return isAutoReconcile;
    }

    public boolean getIsAllowPaymentTolerance() {
        return isAllowPaymentTolerance;
    }

    public List<AccountReconcileModelPartnerMapping> getPartnerMappingLineIdsAsList() {
        return partnerMappingLineIdsAsList;
    }

    public List<Integer> getPartnerMappingLineIds() {
        return partnerMappingLineIds;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public Object getMatchLabel() {
        return matchLabel;
    }

    public boolean getIsMatchPartner() {
        return isMatchPartner;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public Object getMatchTransactionType() {
        return matchTransactionType;
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



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setMatchNote(Object matchNote) {
        this.matchNote = matchNote;
    }

    public void setIsMatchSameCurrency(boolean isMatchSameCurrency) {
        this.isMatchSameCurrency = isMatchSameCurrency;
    }

    public void setIsMatchTextLocationReference(boolean isMatchTextLocationReference) {
        this.isMatchTextLocationReference = isMatchTextLocationReference;
    }

    public void setIsMatchTextLocationLabel(boolean isMatchTextLocationLabel) {
        this.isMatchTextLocationLabel = isMatchTextLocationLabel;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setNumberEntries(int numberEntries) {
        this.numberEntries = numberEntries;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setIsShowDecimalSeparator(boolean isShowDecimalSeparator) {
        this.isShowDecimalSeparator = isShowDecimalSeparator;
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

    public void setIsMatchTextLocationNote(boolean isMatchTextLocationNote) {
        this.isMatchTextLocationNote = isMatchTextLocationNote;
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

    public void setMatchJournalIdsAsList(List<AccountJournal> matchJournalIdsAsList) {
        this.matchJournalIdsAsList = matchJournalIdsAsList;
    }

    public void setMatchJournalIds(List<Integer> matchJournalIds) {
        this.matchJournalIds = matchJournalIds;
    }

    public void setMatchAmountMin(double matchAmountMin) {
        this.matchAmountMin = matchAmountMin;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setMatchingOrder(Object matchingOrder) {
        this.matchingOrder = matchingOrder;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setLineIdsAsList(List<AccountReconcileModelLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setPastMonthsLimit(int pastMonthsLimit) {
        this.pastMonthsLimit = pastMonthsLimit;
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

    public void setMatchNoteParam(String matchNoteParam) {
        this.matchNoteParam = matchNoteParam;
    }

    public void setMatchAmountMax(double matchAmountMax) {
        this.matchAmountMax = matchAmountMax;
    }

    public void setMatchAmount(Object matchAmount) {
        this.matchAmount = matchAmount;
    }

    public void setPaymentToleranceType(Object paymentToleranceType) {
        this.paymentToleranceType = paymentToleranceType;
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

    public void setMatchPartnerIdsAsList(List<ResPartner> matchPartnerIdsAsList) {
        this.matchPartnerIdsAsList = matchPartnerIdsAsList;
    }

    public void setMatchPartnerIds(List<Integer> matchPartnerIds) {
        this.matchPartnerIds = matchPartnerIds;
    }

    public void setMatchTransactionTypeParam(String matchTransactionTypeParam) {
        this.matchTransactionTypeParam = matchTransactionTypeParam;
    }

    public void setRuleType(Object ruleType) {
        this.ruleType = ruleType;
    }

    public void setMatchLabelParam(String matchLabelParam) {
        this.matchLabelParam = matchLabelParam;
    }

    public void setMatchNature(Object matchNature) {
        this.matchNature = matchNature;
    }

    public void setIsToCheck(boolean isToCheck) {
        this.isToCheck = isToCheck;
    }

    public void setPaymentToleranceParam(double paymentToleranceParam) {
        this.paymentToleranceParam = paymentToleranceParam;
    }

    public void setMatchPartnerCategoryIdsAsList(List<ResPartnerCategory> matchPartnerCategoryIdsAsList) {
        this.matchPartnerCategoryIdsAsList = matchPartnerCategoryIdsAsList;
    }

    public void setMatchPartnerCategoryIds(List<Integer> matchPartnerCategoryIds) {
        this.matchPartnerCategoryIds = matchPartnerCategoryIds;
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

    public void setIsAutoReconcile(boolean isAutoReconcile) {
        this.isAutoReconcile = isAutoReconcile;
    }

    public void setIsAllowPaymentTolerance(boolean isAllowPaymentTolerance) {
        this.isAllowPaymentTolerance = isAllowPaymentTolerance;
    }

    public void setPartnerMappingLineIdsAsList(List<AccountReconcileModelPartnerMapping> partnerMappingLineIdsAsList) {
        this.partnerMappingLineIdsAsList = partnerMappingLineIdsAsList;
    }

    public void setPartnerMappingLineIds(List<Integer> partnerMappingLineIds) {
        this.partnerMappingLineIds = partnerMappingLineIds;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setMatchLabel(Object matchLabel) {
        this.matchLabel = matchLabel;
    }

    public void setIsMatchPartner(boolean isMatchPartner) {
        this.isMatchPartner = isMatchPartner;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMatchTransactionType(Object matchTransactionType) {
        this.matchTransactionType = matchTransactionType;
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



}