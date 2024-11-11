
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
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.payment.PaymentMethod;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.ir.module.Module;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;;

@OdooObject("payment.provider")
public class PaymentProvider implements OdooObj {

    
    private Date writeDate;

    
    private List<ResCurrency> availableCurrencyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private List<Integer> availableCurrencyIds;

    
    private IrUiView inlineFormViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId inlineFormViewId;

    
    private boolean isIsPublished;

    
    private boolean isRequireCurrency;

    
    private List<ResCountry> availableCountryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private List<Integer> availableCountryIds;

    
    private Object authMsg;

    
    private IrUiView redirectFormViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId redirectFormViewId;

    
    private List<PaymentMethod> paymentMethodIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentMethod")
        @OdooModel("payment.PaymentMethod")
    
    private List<Integer> paymentMethodIds;

    
    private boolean isAllowTokenization;

    
    private Object state;

    
    private Object preMsg;

    
    private int id;

    
    private Date createDate;

    
    private boolean isShowPendingMsg;

    
    private boolean isAllowExpressCheckout;

    
    private Object cancelMsg;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private IrUiView tokenInlineFormViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId tokenInlineFormViewId;

    
    private int sequence;

    
    private Object supportRefund;

    
    private Module moduleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private OdooId moduleId;

    
    private boolean isSupportTokenization;

    
    private boolean isShowDoneMsg;

    
    private boolean isSupportExpressCheckout;

    
    private String name;

    
    private Object pendingMsg;

    
    private boolean isShowCredentialsPage;

    
    private boolean isShowCancelMsg;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private Object moduleState;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object code;

    
    private int color;

    
    private IrUiView expressCheckoutFormViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId expressCheckoutFormViewId;

    
    private boolean isShowPreMsg;

    
    private Object soReferenceType;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private Object supportManualCapture;

    
    private boolean isModuleToBuy;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private ResCurrency mainCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId mainCurrencyId;

    
    private boolean isCaptureManually;

    
    private Object maximumAmount;

    
    private boolean isShowAuthMsg;

    
    private boolean isShowAllowTokenization;

    
    private Object doneMsg;

    
    private Object image128;

    
    private boolean isShowAllowExpressCheckout;


    public PaymentProvider() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResCurrency> getAvailableCurrencyIdsAsList() {
        return availableCurrencyIdsAsList;
    }

    public List<Integer> getAvailableCurrencyIds() {
        return availableCurrencyIds;
    }

    public IrUiView getInlineFormViewIdAsObject() {
        return inlineFormViewIdAsObject;
    }

    public OdooId getInlineFormViewId() {
        return inlineFormViewId;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public boolean getIsRequireCurrency() {
        return isRequireCurrency;
    }

    public List<ResCountry> getAvailableCountryIdsAsList() {
        return availableCountryIdsAsList;
    }

    public List<Integer> getAvailableCountryIds() {
        return availableCountryIds;
    }

    public Object getAuthMsg() {
        return authMsg;
    }

    public IrUiView getRedirectFormViewIdAsObject() {
        return redirectFormViewIdAsObject;
    }

    public OdooId getRedirectFormViewId() {
        return redirectFormViewId;
    }

    public List<PaymentMethod> getPaymentMethodIdsAsList() {
        return paymentMethodIdsAsList;
    }

    public List<Integer> getPaymentMethodIds() {
        return paymentMethodIds;
    }

    public boolean getIsAllowTokenization() {
        return isAllowTokenization;
    }

    public Object getState() {
        return state;
    }

    public Object getPreMsg() {
        return preMsg;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsShowPendingMsg() {
        return isShowPendingMsg;
    }

    public boolean getIsAllowExpressCheckout() {
        return isAllowExpressCheckout;
    }

    public Object getCancelMsg() {
        return cancelMsg;
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

    public IrUiView getTokenInlineFormViewIdAsObject() {
        return tokenInlineFormViewIdAsObject;
    }

    public OdooId getTokenInlineFormViewId() {
        return tokenInlineFormViewId;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getSupportRefund() {
        return supportRefund;
    }

    public Module getModuleIdAsObject() {
        return moduleIdAsObject;
    }

    public OdooId getModuleId() {
        return moduleId;
    }

    public boolean getIsSupportTokenization() {
        return isSupportTokenization;
    }

    public boolean getIsShowDoneMsg() {
        return isShowDoneMsg;
    }

    public boolean getIsSupportExpressCheckout() {
        return isSupportExpressCheckout;
    }

    public String getName() {
        return name;
    }

    public Object getPendingMsg() {
        return pendingMsg;
    }

    public boolean getIsShowCredentialsPage() {
        return isShowCredentialsPage;
    }

    public boolean getIsShowCancelMsg() {
        return isShowCancelMsg;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public Object getModuleState() {
        return moduleState;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public IrUiView getExpressCheckoutFormViewIdAsObject() {
        return expressCheckoutFormViewIdAsObject;
    }

    public OdooId getExpressCheckoutFormViewId() {
        return expressCheckoutFormViewId;
    }

    public boolean getIsShowPreMsg() {
        return isShowPreMsg;
    }

    public Object getSoReferenceType() {
        return soReferenceType;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public Object getSupportManualCapture() {
        return supportManualCapture;
    }

    public boolean getIsModuleToBuy() {
        return isModuleToBuy;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public ResCurrency getMainCurrencyIdAsObject() {
        return mainCurrencyIdAsObject;
    }

    public OdooId getMainCurrencyId() {
        return mainCurrencyId;
    }

    public boolean getIsCaptureManually() {
        return isCaptureManually;
    }

    public Object getMaximumAmount() {
        return maximumAmount;
    }

    public boolean getIsShowAuthMsg() {
        return isShowAuthMsg;
    }

    public boolean getIsShowAllowTokenization() {
        return isShowAllowTokenization;
    }

    public Object getDoneMsg() {
        return doneMsg;
    }

    public Object getImage128() {
        return image128;
    }

    public boolean getIsShowAllowExpressCheckout() {
        return isShowAllowExpressCheckout;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAvailableCurrencyIdsAsList(List<ResCurrency> availableCurrencyIdsAsList) {
        this.availableCurrencyIdsAsList = availableCurrencyIdsAsList;
    }

    public void setAvailableCurrencyIds(List<Integer> availableCurrencyIds) {
        this.availableCurrencyIds = availableCurrencyIds;
    }

    public void setInlineFormViewIdAsObject(IrUiView inlineFormViewIdAsObject) {
        this.inlineFormViewIdAsObject = inlineFormViewIdAsObject;
    }

    public void setInlineFormViewId(OdooId inlineFormViewId) {
        this.inlineFormViewId = inlineFormViewId;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setIsRequireCurrency(boolean isRequireCurrency) {
        this.isRequireCurrency = isRequireCurrency;
    }

    public void setAvailableCountryIdsAsList(List<ResCountry> availableCountryIdsAsList) {
        this.availableCountryIdsAsList = availableCountryIdsAsList;
    }

    public void setAvailableCountryIds(List<Integer> availableCountryIds) {
        this.availableCountryIds = availableCountryIds;
    }

    public void setAuthMsg(Object authMsg) {
        this.authMsg = authMsg;
    }

    public void setRedirectFormViewIdAsObject(IrUiView redirectFormViewIdAsObject) {
        this.redirectFormViewIdAsObject = redirectFormViewIdAsObject;
    }

    public void setRedirectFormViewId(OdooId redirectFormViewId) {
        this.redirectFormViewId = redirectFormViewId;
    }

    public void setPaymentMethodIdsAsList(List<PaymentMethod> paymentMethodIdsAsList) {
        this.paymentMethodIdsAsList = paymentMethodIdsAsList;
    }

    public void setPaymentMethodIds(List<Integer> paymentMethodIds) {
        this.paymentMethodIds = paymentMethodIds;
    }

    public void setIsAllowTokenization(boolean isAllowTokenization) {
        this.isAllowTokenization = isAllowTokenization;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setPreMsg(Object preMsg) {
        this.preMsg = preMsg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsShowPendingMsg(boolean isShowPendingMsg) {
        this.isShowPendingMsg = isShowPendingMsg;
    }

    public void setIsAllowExpressCheckout(boolean isAllowExpressCheckout) {
        this.isAllowExpressCheckout = isAllowExpressCheckout;
    }

    public void setCancelMsg(Object cancelMsg) {
        this.cancelMsg = cancelMsg;
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

    public void setTokenInlineFormViewIdAsObject(IrUiView tokenInlineFormViewIdAsObject) {
        this.tokenInlineFormViewIdAsObject = tokenInlineFormViewIdAsObject;
    }

    public void setTokenInlineFormViewId(OdooId tokenInlineFormViewId) {
        this.tokenInlineFormViewId = tokenInlineFormViewId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setSupportRefund(Object supportRefund) {
        this.supportRefund = supportRefund;
    }

    public void setModuleIdAsObject(Module moduleIdAsObject) {
        this.moduleIdAsObject = moduleIdAsObject;
    }

    public void setModuleId(OdooId moduleId) {
        this.moduleId = moduleId;
    }

    public void setIsSupportTokenization(boolean isSupportTokenization) {
        this.isSupportTokenization = isSupportTokenization;
    }

    public void setIsShowDoneMsg(boolean isShowDoneMsg) {
        this.isShowDoneMsg = isShowDoneMsg;
    }

    public void setIsSupportExpressCheckout(boolean isSupportExpressCheckout) {
        this.isSupportExpressCheckout = isSupportExpressCheckout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPendingMsg(Object pendingMsg) {
        this.pendingMsg = pendingMsg;
    }

    public void setIsShowCredentialsPage(boolean isShowCredentialsPage) {
        this.isShowCredentialsPage = isShowCredentialsPage;
    }

    public void setIsShowCancelMsg(boolean isShowCancelMsg) {
        this.isShowCancelMsg = isShowCancelMsg;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setModuleState(Object moduleState) {
        this.moduleState = moduleState;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setExpressCheckoutFormViewIdAsObject(IrUiView expressCheckoutFormViewIdAsObject) {
        this.expressCheckoutFormViewIdAsObject = expressCheckoutFormViewIdAsObject;
    }

    public void setExpressCheckoutFormViewId(OdooId expressCheckoutFormViewId) {
        this.expressCheckoutFormViewId = expressCheckoutFormViewId;
    }

    public void setIsShowPreMsg(boolean isShowPreMsg) {
        this.isShowPreMsg = isShowPreMsg;
    }

    public void setSoReferenceType(Object soReferenceType) {
        this.soReferenceType = soReferenceType;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setSupportManualCapture(Object supportManualCapture) {
        this.supportManualCapture = supportManualCapture;
    }

    public void setIsModuleToBuy(boolean isModuleToBuy) {
        this.isModuleToBuy = isModuleToBuy;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setMainCurrencyIdAsObject(ResCurrency mainCurrencyIdAsObject) {
        this.mainCurrencyIdAsObject = mainCurrencyIdAsObject;
    }

    public void setMainCurrencyId(OdooId mainCurrencyId) {
        this.mainCurrencyId = mainCurrencyId;
    }

    public void setIsCaptureManually(boolean isCaptureManually) {
        this.isCaptureManually = isCaptureManually;
    }

    public void setMaximumAmount(Object maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public void setIsShowAuthMsg(boolean isShowAuthMsg) {
        this.isShowAuthMsg = isShowAuthMsg;
    }

    public void setIsShowAllowTokenization(boolean isShowAllowTokenization) {
        this.isShowAllowTokenization = isShowAllowTokenization;
    }

    public void setDoneMsg(Object doneMsg) {
        this.doneMsg = doneMsg;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }

    public void setIsShowAllowExpressCheckout(boolean isShowAllowExpressCheckout) {
        this.isShowAllowExpressCheckout = isShowAllowExpressCheckout;
    }



}