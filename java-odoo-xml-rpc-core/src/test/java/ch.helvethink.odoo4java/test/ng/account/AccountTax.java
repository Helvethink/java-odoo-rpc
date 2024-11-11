
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

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.account.tax.repartition.AccountTaxRepartitionLine;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.account.tax.AccountTaxGroup;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("account.tax")
public class AccountTax implements OdooObj {

    
    private Date writeDate;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object typeTaxUse;

    
    private AccountTaxGroup taxGroupIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.tax.AccountTaxGroup")
        @OdooModel("account.tax.AccountTaxGroup")
    
    private OdooId taxGroupId;

    
    private String description;

    
    private boolean isPriceInclude;

    
    private String nameSearchable;

    
    private Account cashBasisTransitionAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId cashBasisTransitionAccountId;

    
    private int messageHasErrorCounter;

    
    private Object amountType;

    
    private boolean isIsBaseAffected;

    
    private boolean isHasMessage;

    
    private String repartitionLinesStr;

    
    private List<AccountTaxRepartitionLine> refundRepartitionLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
    
    private List<Integer> refundRepartitionLineIds;

    
    private int id;

    
    private boolean isIncludeBaseAmount;

    
    private Date createDate;

    
    private Object taxScope;

    
    private List<AccountTaxRepartitionLine> repartitionLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
    
    private List<Integer> repartitionLineIds;

    
    private int messageAttachmentCount;

    
    private double amount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isMessageHasSmsError;

    
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

    
    private String invoiceLabel;

    
    private Object taxExigibility;

    
    private boolean isIsUsed;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private int sequence;

    
    private String countryCode;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private boolean isHideTaxExigibility;

    
    private List<AccountTaxRepartitionLine> invoiceRepartitionLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
    
    private List<Integer> invoiceRepartitionLineIds;

    
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

    
    private List<AccountTax> childrenTaxIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> childrenTaxIds;

    
    private boolean isAnalytic;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;


    public AccountTax() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
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

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getTypeTaxUse() {
        return typeTaxUse;
    }

    public AccountTaxGroup getTaxGroupIdAsObject() {
        return taxGroupIdAsObject;
    }

    public OdooId getTaxGroupId() {
        return taxGroupId;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsPriceInclude() {
        return isPriceInclude;
    }

    public String getNameSearchable() {
        return nameSearchable;
    }

    public Account getCashBasisTransitionAccountIdAsObject() {
        return cashBasisTransitionAccountIdAsObject;
    }

    public OdooId getCashBasisTransitionAccountId() {
        return cashBasisTransitionAccountId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public Object getAmountType() {
        return amountType;
    }

    public boolean getIsIsBaseAffected() {
        return isIsBaseAffected;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getRepartitionLinesStr() {
        return repartitionLinesStr;
    }

    public List<AccountTaxRepartitionLine> getRefundRepartitionLineIdsAsList() {
        return refundRepartitionLineIdsAsList;
    }

    public List<Integer> getRefundRepartitionLineIds() {
        return refundRepartitionLineIds;
    }

    public int getId() {
        return id;
    }

    public boolean getIsIncludeBaseAmount() {
        return isIncludeBaseAmount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getTaxScope() {
        return taxScope;
    }

    public List<AccountTaxRepartitionLine> getRepartitionLineIdsAsList() {
        return repartitionLineIdsAsList;
    }

    public List<Integer> getRepartitionLineIds() {
        return repartitionLineIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public double getAmount() {
        return amount;
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

    public String getInvoiceLabel() {
        return invoiceLabel;
    }

    public Object getTaxExigibility() {
        return taxExigibility;
    }

    public boolean getIsIsUsed() {
        return isIsUsed;
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

    public String getCountryCode() {
        return countryCode;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public boolean getIsHideTaxExigibility() {
        return isHideTaxExigibility;
    }

    public List<AccountTaxRepartitionLine> getInvoiceRepartitionLineIdsAsList() {
        return invoiceRepartitionLineIdsAsList;
    }

    public List<Integer> getInvoiceRepartitionLineIds() {
        return invoiceRepartitionLineIds;
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

    public List<AccountTax> getChildrenTaxIdsAsList() {
        return childrenTaxIdsAsList;
    }

    public List<Integer> getChildrenTaxIds() {
        return childrenTaxIds;
    }

    public boolean getIsAnalytic() {
        return isAnalytic;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
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

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setTypeTaxUse(Object typeTaxUse) {
        this.typeTaxUse = typeTaxUse;
    }

    public void setTaxGroupIdAsObject(AccountTaxGroup taxGroupIdAsObject) {
        this.taxGroupIdAsObject = taxGroupIdAsObject;
    }

    public void setTaxGroupId(OdooId taxGroupId) {
        this.taxGroupId = taxGroupId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsPriceInclude(boolean isPriceInclude) {
        this.isPriceInclude = isPriceInclude;
    }

    public void setNameSearchable(String nameSearchable) {
        this.nameSearchable = nameSearchable;
    }

    public void setCashBasisTransitionAccountIdAsObject(Account cashBasisTransitionAccountIdAsObject) {
        this.cashBasisTransitionAccountIdAsObject = cashBasisTransitionAccountIdAsObject;
    }

    public void setCashBasisTransitionAccountId(OdooId cashBasisTransitionAccountId) {
        this.cashBasisTransitionAccountId = cashBasisTransitionAccountId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setAmountType(Object amountType) {
        this.amountType = amountType;
    }

    public void setIsIsBaseAffected(boolean isIsBaseAffected) {
        this.isIsBaseAffected = isIsBaseAffected;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setRepartitionLinesStr(String repartitionLinesStr) {
        this.repartitionLinesStr = repartitionLinesStr;
    }

    public void setRefundRepartitionLineIdsAsList(List<AccountTaxRepartitionLine> refundRepartitionLineIdsAsList) {
        this.refundRepartitionLineIdsAsList = refundRepartitionLineIdsAsList;
    }

    public void setRefundRepartitionLineIds(List<Integer> refundRepartitionLineIds) {
        this.refundRepartitionLineIds = refundRepartitionLineIds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsIncludeBaseAmount(boolean isIncludeBaseAmount) {
        this.isIncludeBaseAmount = isIncludeBaseAmount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setTaxScope(Object taxScope) {
        this.taxScope = taxScope;
    }

    public void setRepartitionLineIdsAsList(List<AccountTaxRepartitionLine> repartitionLineIdsAsList) {
        this.repartitionLineIdsAsList = repartitionLineIdsAsList;
    }

    public void setRepartitionLineIds(List<Integer> repartitionLineIds) {
        this.repartitionLineIds = repartitionLineIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public void setInvoiceLabel(String invoiceLabel) {
        this.invoiceLabel = invoiceLabel;
    }

    public void setTaxExigibility(Object taxExigibility) {
        this.taxExigibility = taxExigibility;
    }

    public void setIsIsUsed(boolean isIsUsed) {
        this.isIsUsed = isIsUsed;
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

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setIsHideTaxExigibility(boolean isHideTaxExigibility) {
        this.isHideTaxExigibility = isHideTaxExigibility;
    }

    public void setInvoiceRepartitionLineIdsAsList(List<AccountTaxRepartitionLine> invoiceRepartitionLineIdsAsList) {
        this.invoiceRepartitionLineIdsAsList = invoiceRepartitionLineIdsAsList;
    }

    public void setInvoiceRepartitionLineIds(List<Integer> invoiceRepartitionLineIds) {
        this.invoiceRepartitionLineIds = invoiceRepartitionLineIds;
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

    public void setChildrenTaxIdsAsList(List<AccountTax> childrenTaxIdsAsList) {
        this.childrenTaxIdsAsList = childrenTaxIdsAsList;
    }

    public void setChildrenTaxIds(List<Integer> childrenTaxIds) {
        this.childrenTaxIds = childrenTaxIds;
    }

    public void setIsAnalytic(boolean isAnalytic) {
        this.isAnalytic = isAnalytic;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}