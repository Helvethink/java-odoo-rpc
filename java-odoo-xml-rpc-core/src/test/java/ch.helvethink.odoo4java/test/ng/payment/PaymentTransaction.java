
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

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.account.AccountPayment;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.payment.PaymentProvider;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.payment.PaymentMethod;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.payment.PaymentToken;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("payment.transaction")
public class PaymentTransaction implements OdooObj {

    
    private Date writeDate;

    
    private boolean isIsPostProcessed;

    
    private String partnerEmail;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String partnerAddress;

    
    private String paymentMethodCode;

    
    private List<AccountMove> invoiceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> invoiceIds;

    
    private String partnerName;

    
    private String callbackHash;

    
    private String partnerPhone;

    
    private boolean isTokenize;

    
    private boolean isCallbackIsDone;

    
    private String reference;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private PaymentToken tokenIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentToken")
        @OdooModel("payment.PaymentToken")
    
    private OdooId tokenId;

    
    private AccountPayment paymentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountPayment")
        @OdooModel("account.AccountPayment")
    
    private OdooId paymentId;

    
    private IrModel callbackModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId callbackModelId;

    
    private int callbackResId;

    
    private Object state;

    
    private int id;

    
    private int invoicesCount;

    
    private Date createDate;

    
    private Object stateMessage;

    
    private PaymentTransaction sourceTransactionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private OdooId sourceTransactionId;

    
    private String callbackMethod;

    
    private String partnerCity;

    
    private ResCountry partnerCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId partnerCountryId;

    
    private Object amount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object partnerLang;

    
    private Date lastStateChange;

    
    private int refundsCount;

    
    private List<PaymentTransaction> childTransactionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private List<Integer> childTransactionIds;

    
    private int saleOrderIdsNbr;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<SaleOrder> saleOrderIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private List<Integer> saleOrderIds;

    
    private PaymentMethod paymentMethodIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentMethod")
        @OdooModel("payment.PaymentMethod")
    
    private OdooId paymentMethodId;

    
    private ResCountryState partnerStateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId partnerStateId;

    
    private String partnerZip;

    
    private String landingRoute;

    
    private String providerReference;

    
    private PaymentProvider providerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentProvider")
        @OdooModel("payment.PaymentProvider")
    
    private OdooId providerId;

    
    private Object providerCode;

    
    private boolean isIsDonation;

    
    private Object operation;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public PaymentTransaction() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsIsPostProcessed() {
        return isIsPostProcessed;
    }

    public String getPartnerEmail() {
        return partnerEmail;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getPartnerAddress() {
        return partnerAddress;
    }

    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    public List<AccountMove> getInvoiceIdsAsList() {
        return invoiceIdsAsList;
    }

    public List<Integer> getInvoiceIds() {
        return invoiceIds;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public String getCallbackHash() {
        return callbackHash;
    }

    public String getPartnerPhone() {
        return partnerPhone;
    }

    public boolean getIsTokenize() {
        return isTokenize;
    }

    public boolean getIsCallbackIsDone() {
        return isCallbackIsDone;
    }

    public String getReference() {
        return reference;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public PaymentToken getTokenIdAsObject() {
        return tokenIdAsObject;
    }

    public OdooId getTokenId() {
        return tokenId;
    }

    public AccountPayment getPaymentIdAsObject() {
        return paymentIdAsObject;
    }

    public OdooId getPaymentId() {
        return paymentId;
    }

    public IrModel getCallbackModelIdAsObject() {
        return callbackModelIdAsObject;
    }

    public OdooId getCallbackModelId() {
        return callbackModelId;
    }

    public int getCallbackResId() {
        return callbackResId;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public int getInvoicesCount() {
        return invoicesCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getStateMessage() {
        return stateMessage;
    }

    public PaymentTransaction getSourceTransactionIdAsObject() {
        return sourceTransactionIdAsObject;
    }

    public OdooId getSourceTransactionId() {
        return sourceTransactionId;
    }

    public String getCallbackMethod() {
        return callbackMethod;
    }

    public String getPartnerCity() {
        return partnerCity;
    }

    public ResCountry getPartnerCountryIdAsObject() {
        return partnerCountryIdAsObject;
    }

    public OdooId getPartnerCountryId() {
        return partnerCountryId;
    }

    public Object getAmount() {
        return amount;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getPartnerLang() {
        return partnerLang;
    }

    public Date getLastStateChange() {
        return lastStateChange;
    }

    public int getRefundsCount() {
        return refundsCount;
    }

    public List<PaymentTransaction> getChildTransactionIdsAsList() {
        return childTransactionIdsAsList;
    }

    public List<Integer> getChildTransactionIds() {
        return childTransactionIds;
    }

    public int getSaleOrderIdsNbr() {
        return saleOrderIdsNbr;
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

    public List<SaleOrder> getSaleOrderIdsAsList() {
        return saleOrderIdsAsList;
    }

    public List<Integer> getSaleOrderIds() {
        return saleOrderIds;
    }

    public PaymentMethod getPaymentMethodIdAsObject() {
        return paymentMethodIdAsObject;
    }

    public OdooId getPaymentMethodId() {
        return paymentMethodId;
    }

    public ResCountryState getPartnerStateIdAsObject() {
        return partnerStateIdAsObject;
    }

    public OdooId getPartnerStateId() {
        return partnerStateId;
    }

    public String getPartnerZip() {
        return partnerZip;
    }

    public String getLandingRoute() {
        return landingRoute;
    }

    public String getProviderReference() {
        return providerReference;
    }

    public PaymentProvider getProviderIdAsObject() {
        return providerIdAsObject;
    }

    public OdooId getProviderId() {
        return providerId;
    }

    public Object getProviderCode() {
        return providerCode;
    }

    public boolean getIsIsDonation() {
        return isIsDonation;
    }

    public Object getOperation() {
        return operation;
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

    public void setIsIsPostProcessed(boolean isIsPostProcessed) {
        this.isIsPostProcessed = isIsPostProcessed;
    }

    public void setPartnerEmail(String partnerEmail) {
        this.partnerEmail = partnerEmail;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setPartnerAddress(String partnerAddress) {
        this.partnerAddress = partnerAddress;
    }

    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    public void setInvoiceIdsAsList(List<AccountMove> invoiceIdsAsList) {
        this.invoiceIdsAsList = invoiceIdsAsList;
    }

    public void setInvoiceIds(List<Integer> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public void setCallbackHash(String callbackHash) {
        this.callbackHash = callbackHash;
    }

    public void setPartnerPhone(String partnerPhone) {
        this.partnerPhone = partnerPhone;
    }

    public void setIsTokenize(boolean isTokenize) {
        this.isTokenize = isTokenize;
    }

    public void setIsCallbackIsDone(boolean isCallbackIsDone) {
        this.isCallbackIsDone = isCallbackIsDone;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setTokenIdAsObject(PaymentToken tokenIdAsObject) {
        this.tokenIdAsObject = tokenIdAsObject;
    }

    public void setTokenId(OdooId tokenId) {
        this.tokenId = tokenId;
    }

    public void setPaymentIdAsObject(AccountPayment paymentIdAsObject) {
        this.paymentIdAsObject = paymentIdAsObject;
    }

    public void setPaymentId(OdooId paymentId) {
        this.paymentId = paymentId;
    }

    public void setCallbackModelIdAsObject(IrModel callbackModelIdAsObject) {
        this.callbackModelIdAsObject = callbackModelIdAsObject;
    }

    public void setCallbackModelId(OdooId callbackModelId) {
        this.callbackModelId = callbackModelId;
    }

    public void setCallbackResId(int callbackResId) {
        this.callbackResId = callbackResId;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInvoicesCount(int invoicesCount) {
        this.invoicesCount = invoicesCount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setStateMessage(Object stateMessage) {
        this.stateMessage = stateMessage;
    }

    public void setSourceTransactionIdAsObject(PaymentTransaction sourceTransactionIdAsObject) {
        this.sourceTransactionIdAsObject = sourceTransactionIdAsObject;
    }

    public void setSourceTransactionId(OdooId sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }

    public void setCallbackMethod(String callbackMethod) {
        this.callbackMethod = callbackMethod;
    }

    public void setPartnerCity(String partnerCity) {
        this.partnerCity = partnerCity;
    }

    public void setPartnerCountryIdAsObject(ResCountry partnerCountryIdAsObject) {
        this.partnerCountryIdAsObject = partnerCountryIdAsObject;
    }

    public void setPartnerCountryId(OdooId partnerCountryId) {
        this.partnerCountryId = partnerCountryId;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setPartnerLang(Object partnerLang) {
        this.partnerLang = partnerLang;
    }

    public void setLastStateChange(Date lastStateChange) {
        this.lastStateChange = lastStateChange;
    }

    public void setRefundsCount(int refundsCount) {
        this.refundsCount = refundsCount;
    }

    public void setChildTransactionIdsAsList(List<PaymentTransaction> childTransactionIdsAsList) {
        this.childTransactionIdsAsList = childTransactionIdsAsList;
    }

    public void setChildTransactionIds(List<Integer> childTransactionIds) {
        this.childTransactionIds = childTransactionIds;
    }

    public void setSaleOrderIdsNbr(int saleOrderIdsNbr) {
        this.saleOrderIdsNbr = saleOrderIdsNbr;
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

    public void setSaleOrderIdsAsList(List<SaleOrder> saleOrderIdsAsList) {
        this.saleOrderIdsAsList = saleOrderIdsAsList;
    }

    public void setSaleOrderIds(List<Integer> saleOrderIds) {
        this.saleOrderIds = saleOrderIds;
    }

    public void setPaymentMethodIdAsObject(PaymentMethod paymentMethodIdAsObject) {
        this.paymentMethodIdAsObject = paymentMethodIdAsObject;
    }

    public void setPaymentMethodId(OdooId paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setPartnerStateIdAsObject(ResCountryState partnerStateIdAsObject) {
        this.partnerStateIdAsObject = partnerStateIdAsObject;
    }

    public void setPartnerStateId(OdooId partnerStateId) {
        this.partnerStateId = partnerStateId;
    }

    public void setPartnerZip(String partnerZip) {
        this.partnerZip = partnerZip;
    }

    public void setLandingRoute(String landingRoute) {
        this.landingRoute = landingRoute;
    }

    public void setProviderReference(String providerReference) {
        this.providerReference = providerReference;
    }

    public void setProviderIdAsObject(PaymentProvider providerIdAsObject) {
        this.providerIdAsObject = providerIdAsObject;
    }

    public void setProviderId(OdooId providerId) {
        this.providerId = providerId;
    }

    public void setProviderCode(Object providerCode) {
        this.providerCode = providerCode;
    }

    public void setIsIsDonation(boolean isIsDonation) {
        this.isIsDonation = isIsDonation;
    }

    public void setOperation(Object operation) {
        this.operation = operation;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}