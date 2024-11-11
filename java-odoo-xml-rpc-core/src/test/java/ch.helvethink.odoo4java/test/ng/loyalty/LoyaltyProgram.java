
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

package ch.helvethink.odoo4java.test.ng.loyalty;

import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyRule;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyCard;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyMail;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("loyalty.program")
public class LoyaltyProgram implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<LoyaltyCard> couponIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyCard")
        @OdooModel("loyalty.LoyaltyCard")
    
    private List<Integer> couponIds;

    
    private int couponCount;

    
    private Product paymentProgramDiscountProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId paymentProgramDiscountProductId;

    
    private boolean isSaleOk;

    
    private List<Product> triggerProductIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> triggerProductIds;

    
    private int id;

    
    private MailTemplate mailTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId mailTemplateId;

    
    private Date createDate;

    
    private boolean isIsNominative;

    
    private boolean isAvailableOn;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private int orderCount;

    
    private String currencySymbol;

    
    private int maxUsage;

    
    private Object appliesOn;

    
    private boolean isActive;

    
    private Object dateTo;

    
    private Object trigger;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int sequence;

    
    private Object programType;

    
    private boolean isLimitUsage;

    
    private List<LoyaltyRule> ruleIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyRule")
        @OdooModel("loyalty.LoyaltyRule")
    
    private List<Integer> ruleIds;

    
    private List<LoyaltyMail> communicationPlanIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyMail")
        @OdooModel("loyalty.LoyaltyMail")
    
    private List<Integer> communicationPlanIds;

    
    private boolean isPortalVisible;

    
    private String name;

    
    private int totalOrderCount;

    
    private List<LoyaltyReward> rewardIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward")
        @OdooModel("loyalty.LoyaltyReward")
    
    private List<Integer> rewardIds;

    
    private List<ProductPricelist> pricelistIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private List<Integer> pricelistIds;

    
    private String portalPointName;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private String couponCountDisplay;

    
    private Object dateFrom;

    
    private boolean isIsPaymentProgram;


    public LoyaltyProgram() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<LoyaltyCard> getCouponIdsAsList() {
        return couponIdsAsList;
    }

    public List<Integer> getCouponIds() {
        return couponIds;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public Product getPaymentProgramDiscountProductIdAsObject() {
        return paymentProgramDiscountProductIdAsObject;
    }

    public OdooId getPaymentProgramDiscountProductId() {
        return paymentProgramDiscountProductId;
    }

    public boolean getIsSaleOk() {
        return isSaleOk;
    }

    public List<Product> getTriggerProductIdsAsList() {
        return triggerProductIdsAsList;
    }

    public List<Integer> getTriggerProductIds() {
        return triggerProductIds;
    }

    public int getId() {
        return id;
    }

    public MailTemplate getMailTemplateIdAsObject() {
        return mailTemplateIdAsObject;
    }

    public OdooId getMailTemplateId() {
        return mailTemplateId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsIsNominative() {
        return isIsNominative;
    }

    public boolean getIsAvailableOn() {
        return isAvailableOn;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public int getMaxUsage() {
        return maxUsage;
    }

    public Object getAppliesOn() {
        return appliesOn;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getDateTo() {
        return dateTo;
    }

    public Object getTrigger() {
        return trigger;
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

    public Object getProgramType() {
        return programType;
    }

    public boolean getIsLimitUsage() {
        return isLimitUsage;
    }

    public List<LoyaltyRule> getRuleIdsAsList() {
        return ruleIdsAsList;
    }

    public List<Integer> getRuleIds() {
        return ruleIds;
    }

    public List<LoyaltyMail> getCommunicationPlanIdsAsList() {
        return communicationPlanIdsAsList;
    }

    public List<Integer> getCommunicationPlanIds() {
        return communicationPlanIds;
    }

    public boolean getIsPortalVisible() {
        return isPortalVisible;
    }

    public String getName() {
        return name;
    }

    public int getTotalOrderCount() {
        return totalOrderCount;
    }

    public List<LoyaltyReward> getRewardIdsAsList() {
        return rewardIdsAsList;
    }

    public List<Integer> getRewardIds() {
        return rewardIds;
    }

    public List<ProductPricelist> getPricelistIdsAsList() {
        return pricelistIdsAsList;
    }

    public List<Integer> getPricelistIds() {
        return pricelistIds;
    }

    public String getPortalPointName() {
        return portalPointName;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public String getCouponCountDisplay() {
        return couponCountDisplay;
    }

    public Object getDateFrom() {
        return dateFrom;
    }

    public boolean getIsIsPaymentProgram() {
        return isIsPaymentProgram;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCouponIdsAsList(List<LoyaltyCard> couponIdsAsList) {
        this.couponIdsAsList = couponIdsAsList;
    }

    public void setCouponIds(List<Integer> couponIds) {
        this.couponIds = couponIds;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public void setPaymentProgramDiscountProductIdAsObject(Product paymentProgramDiscountProductIdAsObject) {
        this.paymentProgramDiscountProductIdAsObject = paymentProgramDiscountProductIdAsObject;
    }

    public void setPaymentProgramDiscountProductId(OdooId paymentProgramDiscountProductId) {
        this.paymentProgramDiscountProductId = paymentProgramDiscountProductId;
    }

    public void setIsSaleOk(boolean isSaleOk) {
        this.isSaleOk = isSaleOk;
    }

    public void setTriggerProductIdsAsList(List<Product> triggerProductIdsAsList) {
        this.triggerProductIdsAsList = triggerProductIdsAsList;
    }

    public void setTriggerProductIds(List<Integer> triggerProductIds) {
        this.triggerProductIds = triggerProductIds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailTemplateIdAsObject(MailTemplate mailTemplateIdAsObject) {
        this.mailTemplateIdAsObject = mailTemplateIdAsObject;
    }

    public void setMailTemplateId(OdooId mailTemplateId) {
        this.mailTemplateId = mailTemplateId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsIsNominative(boolean isIsNominative) {
        this.isIsNominative = isIsNominative;
    }

    public void setIsAvailableOn(boolean isAvailableOn) {
        this.isAvailableOn = isAvailableOn;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setMaxUsage(int maxUsage) {
        this.maxUsage = maxUsage;
    }

    public void setAppliesOn(Object appliesOn) {
        this.appliesOn = appliesOn;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setDateTo(Object dateTo) {
        this.dateTo = dateTo;
    }

    public void setTrigger(Object trigger) {
        this.trigger = trigger;
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

    public void setProgramType(Object programType) {
        this.programType = programType;
    }

    public void setIsLimitUsage(boolean isLimitUsage) {
        this.isLimitUsage = isLimitUsage;
    }

    public void setRuleIdsAsList(List<LoyaltyRule> ruleIdsAsList) {
        this.ruleIdsAsList = ruleIdsAsList;
    }

    public void setRuleIds(List<Integer> ruleIds) {
        this.ruleIds = ruleIds;
    }

    public void setCommunicationPlanIdsAsList(List<LoyaltyMail> communicationPlanIdsAsList) {
        this.communicationPlanIdsAsList = communicationPlanIdsAsList;
    }

    public void setCommunicationPlanIds(List<Integer> communicationPlanIds) {
        this.communicationPlanIds = communicationPlanIds;
    }

    public void setIsPortalVisible(boolean isPortalVisible) {
        this.isPortalVisible = isPortalVisible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalOrderCount(int totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
    }

    public void setRewardIdsAsList(List<LoyaltyReward> rewardIdsAsList) {
        this.rewardIdsAsList = rewardIdsAsList;
    }

    public void setRewardIds(List<Integer> rewardIds) {
        this.rewardIds = rewardIds;
    }

    public void setPricelistIdsAsList(List<ProductPricelist> pricelistIdsAsList) {
        this.pricelistIdsAsList = pricelistIdsAsList;
    }

    public void setPricelistIds(List<Integer> pricelistIds) {
        this.pricelistIds = pricelistIds;
    }

    public void setPortalPointName(String portalPointName) {
        this.portalPointName = portalPointName;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setCouponCountDisplay(String couponCountDisplay) {
        this.couponCountDisplay = couponCountDisplay;
    }

    public void setDateFrom(Object dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setIsIsPaymentProgram(boolean isIsPaymentProgram) {
        this.isIsPaymentProgram = isIsPaymentProgram;
    }



}