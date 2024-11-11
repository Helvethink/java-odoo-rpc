
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

package ch.helvethink.odoo4java.test.ng.sale.loyalty.reward;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("sale.loyalty.reward.wizard")
public class SaleLoyaltyRewardWizard implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Product selectedProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId selectedProductId;

    
    private List<LoyaltyReward> rewardIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward")
        @OdooModel("loyalty.LoyaltyReward")
    
    private List<Integer> rewardIds;

    
    private int id;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private SaleOrder orderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId orderId;

    
    private boolean isMultiProductReward;

    
    private LoyaltyReward selectedRewardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward")
        @OdooModel("loyalty.LoyaltyReward")
    
    private OdooId selectedRewardId;

    
    private List<Product> rewardProductIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> rewardProductIds;


    public SaleLoyaltyRewardWizard() {
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

    public Product getSelectedProductIdAsObject() {
        return selectedProductIdAsObject;
    }

    public OdooId getSelectedProductId() {
        return selectedProductId;
    }

    public List<LoyaltyReward> getRewardIdsAsList() {
        return rewardIdsAsList;
    }

    public List<Integer> getRewardIds() {
        return rewardIds;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public SaleOrder getOrderIdAsObject() {
        return orderIdAsObject;
    }

    public OdooId getOrderId() {
        return orderId;
    }

    public boolean getIsMultiProductReward() {
        return isMultiProductReward;
    }

    public LoyaltyReward getSelectedRewardIdAsObject() {
        return selectedRewardIdAsObject;
    }

    public OdooId getSelectedRewardId() {
        return selectedRewardId;
    }

    public List<Product> getRewardProductIdsAsList() {
        return rewardProductIdsAsList;
    }

    public List<Integer> getRewardProductIds() {
        return rewardProductIds;
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

    public void setSelectedProductIdAsObject(Product selectedProductIdAsObject) {
        this.selectedProductIdAsObject = selectedProductIdAsObject;
    }

    public void setSelectedProductId(OdooId selectedProductId) {
        this.selectedProductId = selectedProductId;
    }

    public void setRewardIdsAsList(List<LoyaltyReward> rewardIdsAsList) {
        this.rewardIdsAsList = rewardIdsAsList;
    }

    public void setRewardIds(List<Integer> rewardIds) {
        this.rewardIds = rewardIds;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setOrderIdAsObject(SaleOrder orderIdAsObject) {
        this.orderIdAsObject = orderIdAsObject;
    }

    public void setOrderId(OdooId orderId) {
        this.orderId = orderId;
    }

    public void setIsMultiProductReward(boolean isMultiProductReward) {
        this.isMultiProductReward = isMultiProductReward;
    }

    public void setSelectedRewardIdAsObject(LoyaltyReward selectedRewardIdAsObject) {
        this.selectedRewardIdAsObject = selectedRewardIdAsObject;
    }

    public void setSelectedRewardId(OdooId selectedRewardId) {
        this.selectedRewardId = selectedRewardId;
    }

    public void setRewardProductIdsAsList(List<Product> rewardProductIdsAsList) {
        this.rewardProductIdsAsList = rewardProductIdsAsList;
    }

    public void setRewardProductIds(List<Integer> rewardProductIds) {
        this.rewardProductIds = rewardProductIds;
    }



}