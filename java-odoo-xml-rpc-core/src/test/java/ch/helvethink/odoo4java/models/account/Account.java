
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
import ch.helvethink.odoo4java.models.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.models.account.code.AccountCodeMapping;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.account")
public class Account implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("note")
        private Object note;
    

    
        private List<ResCompany> companyIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_ids")
        private List<Integer> companyIds;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        @JsonProperty("account_type")
        private Object accountType;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("code")
        private String code;
    

    
        private List<AccountTax> taxIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("tax_ids")
        private List<Integer> taxIds;
    

    
        private List<AccountCodeMapping> codeMappingIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.code.AccountCodeMapping")
        @OdooModel("account.code.AccountCodeMapping")
        @JsonProperty("code_mapping_ids")
        private List<Integer> codeMappingIds;
    

    
        @JsonProperty("deprecated")
        private boolean isDeprecated;
    

    
        @JsonProperty("code_store")
        private String codeStore;
    

    
        @JsonProperty("used")
        private boolean isUsed;
    

    
        private ResCurrency companyCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("company_currency_id")
        private OdooId companyCurrencyId;
    

    
        @JsonProperty("opening_credit")
        private Object openingCredit;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("related_taxes_amount")
        private int relatedTaxesAmount;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("include_initial_balance")
        private boolean isIncludeInitialBalance;
    

    
        @JsonProperty("opening_debit")
        private Object openingDebit;
    

    
        @JsonProperty("current_balance")
        private double currentBalance;
    

    
        @JsonProperty("non_trade")
        private boolean isNonTrade;
    

    
        private AccountRoot rootIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountRoot")
        @OdooModel("account.AccountRoot")
        @JsonProperty("root_id")
        private OdooId rootId;
    

    
        @JsonProperty("opening_balance")
        private Object openingBalance;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private List<AccountJournal> allowedJournalIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("allowed_journal_ids")
        private List<Integer> allowedJournalIds;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        private List<AccountAccountTag> tagIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.account.AccountAccountTag")
        @OdooModel("account.account.AccountAccountTag")
        @JsonProperty("tag_ids")
        private List<Integer> tagIds;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("company_fiscal_country_code")
        private String companyFiscalCountryCode;
    

    
        @JsonProperty("placeholder_code")
        private String placeholderCode;
    

    
        @JsonProperty("reconcile")
        private boolean isReconcile;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        private AccountGroup groupIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountGroup")
        @OdooModel("account.AccountGroup")
        @JsonProperty("group_id")
        private OdooId groupId;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("internal_group")
        private Object internalGroup;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("display_mapping_tab")
        private boolean isDisplayMappingTab;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
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

    public List<ResCompany> getCompanyIdsAsList() {
        return companyIdsAsList;
    }

    public List<Integer> getCompanyIds() {
        return companyIds;
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

    public List<AccountCodeMapping> getCodeMappingIdsAsList() {
        return codeMappingIdsAsList;
    }

    public List<Integer> getCodeMappingIds() {
        return codeMappingIds;
    }

    public boolean getIsDeprecated() {
        return isDeprecated;
    }

    public String getCodeStore() {
        return codeStore;
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

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
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

    public String getCompanyFiscalCountryCode() {
        return companyFiscalCountryCode;
    }

    public String getPlaceholderCode() {
        return placeholderCode;
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

    public boolean getIsDisplayMappingTab() {
        return isDisplayMappingTab;
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

    public void setCompanyIdsAsList(List<ResCompany> companyIdsAsList) {
        this.companyIdsAsList = companyIdsAsList;
    }

    public void setCompanyIds(List<Integer> companyIds) {
        this.companyIds = companyIds;
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

    public void setCodeMappingIdsAsList(List<AccountCodeMapping> codeMappingIdsAsList) {
        this.codeMappingIdsAsList = codeMappingIdsAsList;
    }

    public void setCodeMappingIds(List<Integer> codeMappingIds) {
        this.codeMappingIds = codeMappingIds;
    }

    public void setIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    public void setCodeStore(String codeStore) {
        this.codeStore = codeStore;
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

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
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

    public void setCompanyFiscalCountryCode(String companyFiscalCountryCode) {
        this.companyFiscalCountryCode = companyFiscalCountryCode;
    }

    public void setPlaceholderCode(String placeholderCode) {
        this.placeholderCode = placeholderCode;
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

    public void setIsDisplayMappingTab(boolean isDisplayMappingTab) {
        this.isDisplayMappingTab = isDisplayMappingTab;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}