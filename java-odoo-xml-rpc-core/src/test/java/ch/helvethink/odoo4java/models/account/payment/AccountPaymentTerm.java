
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

package ch.helvethink.odoo4java.models.account.payment;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.payment.term.AccountPaymentTermLine;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCurrency;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.payment.term")
public class AccountPaymentTerm implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("note")
        private Object note;
    

    
        @JsonProperty("example_preview")
        private Object examplePreview;
    

    
        @JsonProperty("fiscal_country_codes")
        private String fiscalCountryCodes;
    

    
        @JsonProperty("early_pay_discount_computation")
        private Object earlyPayDiscountComputation;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("example_preview_discount")
        private Object examplePreviewDiscount;
    

    
        @JsonProperty("example_date")
        private Date exampleDate;
    

    
        @JsonProperty("discount_percentage")
        private double discountPercentage;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("example_amount")
        private Object exampleAmount;
    

    
        private List<AccountPaymentTermLine> lineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.term.AccountPaymentTermLine")
        @OdooModel("account.payment.term.AccountPaymentTermLine")
        @JsonProperty("line_ids")
        private List<Integer> lineIds;
    

    
        @JsonProperty("display_on_invoice")
        private boolean isDisplayOnInvoice;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("discount_days")
        private int discountDays;
    

    
        @JsonProperty("example_invalid")
        private boolean isExampleInvalid;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("early_discount")
        private boolean isEarlyDiscount;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    


    public AccountPaymentTerm() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public Object getExamplePreview() {
        return examplePreview;
    }

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public Object getEarlyPayDiscountComputation() {
        return earlyPayDiscountComputation;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getExamplePreviewDiscount() {
        return examplePreviewDiscount;
    }

    public Date getExampleDate() {
        return exampleDate;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
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

    public int getSequence() {
        return sequence;
    }

    public Object getExampleAmount() {
        return exampleAmount;
    }

    public List<AccountPaymentTermLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public boolean getIsDisplayOnInvoice() {
        return isDisplayOnInvoice;
    }

    public String getName() {
        return name;
    }

    public int getDiscountDays() {
        return discountDays;
    }

    public boolean getIsExampleInvalid() {
        return isExampleInvalid;
    }

    public int getId() {
        return id;
    }

    public boolean getIsEarlyDiscount() {
        return isEarlyDiscount;
    }

    public Date getCreateDate() {
        return createDate;
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

    public void setExamplePreview(Object examplePreview) {
        this.examplePreview = examplePreview;
    }

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setEarlyPayDiscountComputation(Object earlyPayDiscountComputation) {
        this.earlyPayDiscountComputation = earlyPayDiscountComputation;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setExamplePreviewDiscount(Object examplePreviewDiscount) {
        this.examplePreviewDiscount = examplePreviewDiscount;
    }

    public void setExampleDate(Date exampleDate) {
        this.exampleDate = exampleDate;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
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

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setExampleAmount(Object exampleAmount) {
        this.exampleAmount = exampleAmount;
    }

    public void setLineIdsAsList(List<AccountPaymentTermLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setIsDisplayOnInvoice(boolean isDisplayOnInvoice) {
        this.isDisplayOnInvoice = isDisplayOnInvoice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscountDays(int discountDays) {
        this.discountDays = discountDays;
    }

    public void setIsExampleInvalid(boolean isExampleInvalid) {
        this.isExampleInvalid = isExampleInvalid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsEarlyDiscount(boolean isEarlyDiscount) {
        this.isEarlyDiscount = isEarlyDiscount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}