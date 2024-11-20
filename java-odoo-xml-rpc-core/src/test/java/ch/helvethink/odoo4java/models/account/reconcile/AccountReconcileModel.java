
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

package ch.helvethink.odoo4java.models.account.reconcile;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.reconcile.model.AccountReconcileModelLine;
import ch.helvethink.odoo4java.models.account.reconcile.model.partner.AccountReconcileModelPartnerMapping;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerCategory;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.reconcile.model")
public class AccountReconcileModel implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("match_note")
        private Object matchNote;
    

    
        @JsonProperty("match_same_currency")
        private boolean isMatchSameCurrency;
    

    
        @JsonProperty("match_text_location_reference")
        private boolean isMatchTextLocationReference;
    

    
        @JsonProperty("match_text_location_label")
        private boolean isMatchTextLocationLabel;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("number_entries")
        private int numberEntries;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("decimal_separator")
        private String decimalSeparator;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("show_decimal_separator")
        private boolean isShowDecimalSeparator;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("match_text_location_note")
        private boolean isMatchTextLocationNote;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private List<AccountJournal> matchJournalIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("match_journal_ids")
        private List<Integer> matchJournalIds;
    

    
        @JsonProperty("match_amount_min")
        private double matchAmountMin;
    

    
        @JsonProperty("matching_order")
        private Object matchingOrder;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        private List<AccountReconcileModelLine> lineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.reconcile.model.AccountReconcileModelLine")
        @OdooModel("account.reconcile.model.AccountReconcileModelLine")
        @JsonProperty("line_ids")
        private List<Integer> lineIds;
    

    
        @JsonProperty("past_months_limit")
        private int pastMonthsLimit;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("match_note_param")
        private String matchNoteParam;
    

    
        @JsonProperty("match_amount_max")
        private double matchAmountMax;
    

    
        @JsonProperty("match_amount")
        private Object matchAmount;
    

    
        @JsonProperty("payment_tolerance_type")
        private Object paymentToleranceType;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<ResPartner> matchPartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("match_partner_ids")
        private List<Integer> matchPartnerIds;
    

    
        @JsonProperty("match_transaction_type_param")
        private String matchTransactionTypeParam;
    

    
        @JsonProperty("rule_type")
        private Object ruleType;
    

    
        @JsonProperty("match_label_param")
        private String matchLabelParam;
    

    
        @JsonProperty("match_nature")
        private Object matchNature;
    

    
        @JsonProperty("to_check")
        private boolean isToCheck;
    

    
        @JsonProperty("counterpart_type")
        private Object counterpartType;
    

    
        @JsonProperty("payment_tolerance_param")
        private double paymentToleranceParam;
    

    
        private List<ResPartnerCategory> matchPartnerCategoryIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
        @JsonProperty("match_partner_category_ids")
        private List<Integer> matchPartnerCategoryIds;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("auto_reconcile")
        private boolean isAutoReconcile;
    

    
        @JsonProperty("allow_payment_tolerance")
        private boolean isAllowPaymentTolerance;
    

    
        private List<AccountReconcileModelPartnerMapping> partnerMappingLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.reconcile.model.partner.AccountReconcileModelPartnerMapping")
        @OdooModel("account.reconcile.model.partner.AccountReconcileModelPartnerMapping")
        @JsonProperty("partner_mapping_line_ids")
        private List<Integer> partnerMappingLineIds;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("match_label")
        private Object matchLabel;
    

    
        @JsonProperty("match_partner")
        private boolean isMatchPartner;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("match_transaction_type")
        private Object matchTransactionType;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    


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

    public Object getCounterpartType() {
        return counterpartType;
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

    public void setCounterpartType(Object counterpartType) {
        this.counterpartType = counterpartType;
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



}