
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
import ch.helvethink.odoo4java.models.account.tax.AccountTaxGroup;
import ch.helvethink.odoo4java.models.account.tax.repartition.AccountTaxRepartitionLine;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCountry;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.tax")
public class AccountTax implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        @JsonProperty("type_tax_use")
        private Object typeTaxUse;
    

    
        @JsonProperty("name_searchable")
        private String nameSearchable;
    

    
        private Account cashBasisTransitionAccountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("cash_basis_transition_account_id")
        private OdooId cashBasisTransitionAccountId;
    

    
        @JsonProperty("has_negative_factor")
        private boolean isHasNegativeFactor;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("amount_type")
        private Object amountType;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        @JsonProperty("repartition_lines_str")
        private String repartitionLinesStr;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("include_base_amount")
        private boolean isIncludeBaseAmount;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("tax_scope")
        private Object taxScope;
    

    
        private List<AccountTaxRepartitionLine> repartitionLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
        @JsonProperty("repartition_line_ids")
        private List<Integer> repartitionLineIds;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        @JsonProperty("price_include_override")
        private Object priceIncludeOverride;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("tax_exigibility")
        private Object taxExigibility;
    

    
        @JsonProperty("is_used")
        private boolean isIsUsed;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private ResCountry countryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_id")
        private OdooId countryId;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private AccountTaxGroup taxGroupIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.tax.AccountTaxGroup")
        @OdooModel("account.tax.AccountTaxGroup")
        @JsonProperty("tax_group_id")
        private OdooId taxGroupId;
    

    
        @JsonProperty("description")
        private Object description;
    

    
        @JsonProperty("price_include")
        private boolean isPriceInclude;
    

    
        @JsonProperty("company_price_include")
        private Object companyPriceInclude;
    

    
        @JsonProperty("is_base_affected")
        private boolean isIsBaseAffected;
    

    
        private List<AccountTaxRepartitionLine> refundRepartitionLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
        @JsonProperty("refund_repartition_line_ids")
        private List<Integer> refundRepartitionLineIds;
    

    
        @JsonProperty("amount")
        private double amount;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("invoice_legal_notes")
        private Object invoiceLegalNotes;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("invoice_label")
        private String invoiceLabel;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("hide_tax_exigibility")
        private boolean isHideTaxExigibility;
    

    
        private List<AccountTaxRepartitionLine> invoiceRepartitionLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.tax.repartition.AccountTaxRepartitionLine")
        @OdooModel("account.tax.repartition.AccountTaxRepartitionLine")
        @JsonProperty("invoice_repartition_line_ids")
        private List<Integer> invoiceRepartitionLineIds;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        private List<AccountTax> childrenTaxIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountTax")
        @OdooModel("account.AccountTax")
        @JsonProperty("children_tax_ids")
        private List<Integer> childrenTaxIds;
    

    
        @JsonProperty("analytic")
        private boolean isAnalytic;
    


    public AccountTax() {
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

    public Object getTypeTaxUse() {
        return typeTaxUse;
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

    public boolean getIsHasNegativeFactor() {
        return isHasNegativeFactor;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public Object getAmountType() {
        return amountType;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getRepartitionLinesStr() {
        return repartitionLinesStr;
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

    public Object getPriceIncludeOverride() {
        return priceIncludeOverride;
    }

    public boolean getIsActive() {
        return isActive;
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

    public Object getTaxExigibility() {
        return taxExigibility;
    }

    public boolean getIsIsUsed() {
        return isIsUsed;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
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

    public AccountTaxGroup getTaxGroupIdAsObject() {
        return taxGroupIdAsObject;
    }

    public OdooId getTaxGroupId() {
        return taxGroupId;
    }

    public Object getDescription() {
        return description;
    }

    public boolean getIsPriceInclude() {
        return isPriceInclude;
    }

    public Object getCompanyPriceInclude() {
        return companyPriceInclude;
    }

    public boolean getIsIsBaseAffected() {
        return isIsBaseAffected;
    }

    public List<AccountTaxRepartitionLine> getRefundRepartitionLineIdsAsList() {
        return refundRepartitionLineIdsAsList;
    }

    public List<Integer> getRefundRepartitionLineIds() {
        return refundRepartitionLineIds;
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

    public Object getInvoiceLegalNotes() {
        return invoiceLegalNotes;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public String getInvoiceLabel() {
        return invoiceLabel;
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

    public List<AccountTax> getChildrenTaxIdsAsList() {
        return childrenTaxIdsAsList;
    }

    public List<Integer> getChildrenTaxIds() {
        return childrenTaxIds;
    }

    public boolean getIsAnalytic() {
        return isAnalytic;
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

    public void setTypeTaxUse(Object typeTaxUse) {
        this.typeTaxUse = typeTaxUse;
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

    public void setIsHasNegativeFactor(boolean isHasNegativeFactor) {
        this.isHasNegativeFactor = isHasNegativeFactor;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setAmountType(Object amountType) {
        this.amountType = amountType;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setRepartitionLinesStr(String repartitionLinesStr) {
        this.repartitionLinesStr = repartitionLinesStr;
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

    public void setPriceIncludeOverride(Object priceIncludeOverride) {
        this.priceIncludeOverride = priceIncludeOverride;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setTaxExigibility(Object taxExigibility) {
        this.taxExigibility = taxExigibility;
    }

    public void setIsIsUsed(boolean isIsUsed) {
        this.isIsUsed = isIsUsed;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
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

    public void setTaxGroupIdAsObject(AccountTaxGroup taxGroupIdAsObject) {
        this.taxGroupIdAsObject = taxGroupIdAsObject;
    }

    public void setTaxGroupId(OdooId taxGroupId) {
        this.taxGroupId = taxGroupId;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setIsPriceInclude(boolean isPriceInclude) {
        this.isPriceInclude = isPriceInclude;
    }

    public void setCompanyPriceInclude(Object companyPriceInclude) {
        this.companyPriceInclude = companyPriceInclude;
    }

    public void setIsIsBaseAffected(boolean isIsBaseAffected) {
        this.isIsBaseAffected = isIsBaseAffected;
    }

    public void setRefundRepartitionLineIdsAsList(List<AccountTaxRepartitionLine> refundRepartitionLineIdsAsList) {
        this.refundRepartitionLineIdsAsList = refundRepartitionLineIdsAsList;
    }

    public void setRefundRepartitionLineIds(List<Integer> refundRepartitionLineIds) {
        this.refundRepartitionLineIds = refundRepartitionLineIds;
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

    public void setInvoiceLegalNotes(Object invoiceLegalNotes) {
        this.invoiceLegalNotes = invoiceLegalNotes;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setInvoiceLabel(String invoiceLabel) {
        this.invoiceLabel = invoiceLabel;
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

    public void setChildrenTaxIdsAsList(List<AccountTax> childrenTaxIdsAsList) {
        this.childrenTaxIdsAsList = childrenTaxIdsAsList;
    }

    public void setChildrenTaxIds(List<Integer> childrenTaxIds) {
        this.childrenTaxIds = childrenTaxIds;
    }

    public void setIsAnalytic(boolean isAnalytic) {
        this.isAnalytic = isAnalytic;
    }



}