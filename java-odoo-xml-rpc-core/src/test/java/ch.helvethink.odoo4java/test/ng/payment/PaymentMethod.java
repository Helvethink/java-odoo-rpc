
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

package ch.helvethink.odoo4java.test.ng.payment;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.payment.PaymentProvider;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.payment.PaymentMethod;;

@OdooObject("payment.method")
public class PaymentMethod implements OdooObj {

    
    private List<PaymentProvider> providerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentProvider")
        @OdooModel("payment.PaymentProvider")
    
    private List<Integer> providerIds;

    
    private Date writeDate;

    
    private Object image;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private PaymentMethod primaryPaymentMethodIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentMethod")
        @OdooModel("payment.PaymentMethod")
    
    private OdooId primaryPaymentMethodId;

    
    private boolean isIsPrimary;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<ResCurrency> supportedCurrencyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private List<Integer> supportedCurrencyIds;

    
    private List<ResCountry> supportedCountryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private List<Integer> supportedCountryIds;

    
    private int sequence;

    
    private Object imagePaymentForm;

    
    private Object supportRefund;

    
    private boolean isSupportTokenization;

    
    private List<PaymentMethod> brandIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentMethod")
        @OdooModel("payment.PaymentMethod")
    
    private List<Integer> brandIds;

    
    private boolean isSupportExpressCheckout;

    
    private String name;

    
    private int id;

    
    private Date createDate;


    public PaymentMethod() {
    // Constructor
    }


    public List<PaymentProvider> getProviderIdsAsList() {
        return providerIdsAsList;
    }

    public List<Integer> getProviderIds() {
        return providerIds;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getImage() {
        return image;
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

    public PaymentMethod getPrimaryPaymentMethodIdAsObject() {
        return primaryPaymentMethodIdAsObject;
    }

    public OdooId getPrimaryPaymentMethodId() {
        return primaryPaymentMethodId;
    }

    public boolean getIsIsPrimary() {
        return isIsPrimary;
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

    public List<ResCurrency> getSupportedCurrencyIdsAsList() {
        return supportedCurrencyIdsAsList;
    }

    public List<Integer> getSupportedCurrencyIds() {
        return supportedCurrencyIds;
    }

    public List<ResCountry> getSupportedCountryIdsAsList() {
        return supportedCountryIdsAsList;
    }

    public List<Integer> getSupportedCountryIds() {
        return supportedCountryIds;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getImagePaymentForm() {
        return imagePaymentForm;
    }

    public Object getSupportRefund() {
        return supportRefund;
    }

    public boolean getIsSupportTokenization() {
        return isSupportTokenization;
    }

    public List<PaymentMethod> getBrandIdsAsList() {
        return brandIdsAsList;
    }

    public List<Integer> getBrandIds() {
        return brandIds;
    }

    public boolean getIsSupportExpressCheckout() {
        return isSupportExpressCheckout;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setProviderIdsAsList(List<PaymentProvider> providerIdsAsList) {
        this.providerIdsAsList = providerIdsAsList;
    }

    public void setProviderIds(List<Integer> providerIds) {
        this.providerIds = providerIds;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setImage(Object image) {
        this.image = image;
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

    public void setPrimaryPaymentMethodIdAsObject(PaymentMethod primaryPaymentMethodIdAsObject) {
        this.primaryPaymentMethodIdAsObject = primaryPaymentMethodIdAsObject;
    }

    public void setPrimaryPaymentMethodId(OdooId primaryPaymentMethodId) {
        this.primaryPaymentMethodId = primaryPaymentMethodId;
    }

    public void setIsIsPrimary(boolean isIsPrimary) {
        this.isIsPrimary = isIsPrimary;
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

    public void setSupportedCurrencyIdsAsList(List<ResCurrency> supportedCurrencyIdsAsList) {
        this.supportedCurrencyIdsAsList = supportedCurrencyIdsAsList;
    }

    public void setSupportedCurrencyIds(List<Integer> supportedCurrencyIds) {
        this.supportedCurrencyIds = supportedCurrencyIds;
    }

    public void setSupportedCountryIdsAsList(List<ResCountry> supportedCountryIdsAsList) {
        this.supportedCountryIdsAsList = supportedCountryIdsAsList;
    }

    public void setSupportedCountryIds(List<Integer> supportedCountryIds) {
        this.supportedCountryIds = supportedCountryIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setImagePaymentForm(Object imagePaymentForm) {
        this.imagePaymentForm = imagePaymentForm;
    }

    public void setSupportRefund(Object supportRefund) {
        this.supportRefund = supportRefund;
    }

    public void setIsSupportTokenization(boolean isSupportTokenization) {
        this.isSupportTokenization = isSupportTokenization;
    }

    public void setBrandIdsAsList(List<PaymentMethod> brandIdsAsList) {
        this.brandIdsAsList = brandIdsAsList;
    }

    public void setBrandIds(List<Integer> brandIds) {
        this.brandIds = brandIds;
    }

    public void setIsSupportExpressCheckout(boolean isSupportExpressCheckout) {
        this.isSupportExpressCheckout = isSupportExpressCheckout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}