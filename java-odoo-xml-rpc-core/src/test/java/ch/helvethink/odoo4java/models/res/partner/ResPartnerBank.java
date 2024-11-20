
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

package ch.helvethink.odoo4java.models.res.partner;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.AccountJournal;
import ch.helvethink.odoo4java.models.account.AccountMove;
import ch.helvethink.odoo4java.models.res.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.partner.bank")
public class ResPartnerBank implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("partner_supplier_rank")
        private int partnerSupplierRank;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("acc_type")
        private Object accType;
    

    
        @JsonProperty("has_iban_warning")
        private boolean isHasIbanWarning;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("partner_country_name")
        private String partnerCountryName;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        private ResBank bankIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResBank")
        @OdooModel("res.ResBank")
        @JsonProperty("bank_id")
        private OdooId bankId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("l10n_ch_qr_iban")
        private String l10nChQrIban;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("lock_trust_fields")
        private boolean isLockTrustFields;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("allow_out_payment")
        private boolean isAllowOutPayment;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("partner_customer_rank")
        private int partnerCustomerRank;
    

    
        @JsonProperty("l10n_ch_display_qr_bank_options")
        private boolean isL10nChDisplayQrBankOptions;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        @JsonProperty("bank_bic")
        private String bankBic;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("bank_name")
        private String bankName;
    

    
        @JsonProperty("money_transfer_service")
        private String moneyTransferService;
    

    
        @JsonProperty("user_has_group_validate_bank_account")
        private boolean isUserHasGroupValidateBankAccount;
    

    
        @JsonProperty("acc_number")
        private String accNumber;
    

    
        private List<AccountJournal> journalIdAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private List<Integer> journalId;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("acc_holder_name")
        private String accHolderName;
    

    
        @JsonProperty("has_money_transfer_warning")
        private boolean isHasMoneyTransferWarning;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("sanitized_acc_number")
        private String sanitizedAccNumber;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        private List<AccountMove> relatedMovesAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("related_moves")
        private List<Integer> relatedMoves;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    


    public ResPartnerBank() {
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

    public boolean getIsHasIbanWarning() {
        return isHasIbanWarning;
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

    public boolean getIsLockTrustFields() {
        return isLockTrustFields;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean getIsAllowOutPayment() {
        return isAllowOutPayment;
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

    public int getPartnerCustomerRank() {
        return partnerCustomerRank;
    }

    public boolean getIsL10nChDisplayQrBankOptions() {
        return isL10nChDisplayQrBankOptions;
    }

    public Date getMyActivityDateDeadline() {
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

    public void setIsHasIbanWarning(boolean isHasIbanWarning) {
        this.isHasIbanWarning = isHasIbanWarning;
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

    public void setIsLockTrustFields(boolean isLockTrustFields) {
        this.isLockTrustFields = isLockTrustFields;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setIsAllowOutPayment(boolean isAllowOutPayment) {
        this.isAllowOutPayment = isAllowOutPayment;
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

    public void setPartnerCustomerRank(int partnerCustomerRank) {
        this.partnerCustomerRank = partnerCustomerRank;
    }

    public void setIsL10nChDisplayQrBankOptions(boolean isL10nChDisplayQrBankOptions) {
        this.isL10nChDisplayQrBankOptions = isL10nChDisplayQrBankOptions;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
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

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}