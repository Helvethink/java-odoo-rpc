
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

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.product.ProductTag;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("loyalty.reward")
public class LoyaltyReward implements OdooObj {

    
    private Date writeDate;

    
    private boolean isMultiProduct;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object rewardType;

    
    private LoyaltyProgram programIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram")
        @OdooModel("loyalty.LoyaltyProgram")
    
    private OdooId programId;

    
    private List<Product> allDiscountProductIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> allDiscountProductIds;

    
    private boolean isIsGlobalDiscount;

    
    private String description;

    
    private double discount;

    
    private String rewardProductDomain;

    
    private double requiredPoints;

    
    private boolean isClearWallet;

    
    private String discountProductDomain;

    
    private Uom rewardProductUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId rewardProductUomId;

    
    private int id;

    
    private Date createDate;

    
    private Object discountApplicability;

    
    private Product discountLineProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId discountLineProductId;

    
    private Object discountMaxAmount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<Product> discountProductIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> discountProductIds;

    
    private ProductTag discountProductTagIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTag")
        @OdooModel("product.ProductTag")
    
    private OdooId discountProductTagId;

    
    private boolean isActive;

    
    private ProductCategory discountProductCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId discountProductCategoryId;

    
    private Product rewardProductIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId rewardProductId;

    
    private String pointName;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object discountMode;

    
    private Object programType;

    
    private ProductTag rewardProductTagIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTag")
        @OdooModel("product.ProductTag")
    
    private OdooId rewardProductTagId;

    
    private boolean isUserHasDebug;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private int rewardProductQty;

    
    private List<Product> rewardProductIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> rewardProductIds;


    public LoyaltyReward() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsMultiProduct() {
        return isMultiProduct;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getRewardType() {
        return rewardType;
    }

    public LoyaltyProgram getProgramIdAsObject() {
        return programIdAsObject;
    }

    public OdooId getProgramId() {
        return programId;
    }

    public List<Product> getAllDiscountProductIdsAsList() {
        return allDiscountProductIdsAsList;
    }

    public List<Integer> getAllDiscountProductIds() {
        return allDiscountProductIds;
    }

    public boolean getIsIsGlobalDiscount() {
        return isIsGlobalDiscount;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscount() {
        return discount;
    }

    public String getRewardProductDomain() {
        return rewardProductDomain;
    }

    public double getRequiredPoints() {
        return requiredPoints;
    }

    public boolean getIsClearWallet() {
        return isClearWallet;
    }

    public String getDiscountProductDomain() {
        return discountProductDomain;
    }

    public Uom getRewardProductUomIdAsObject() {
        return rewardProductUomIdAsObject;
    }

    public OdooId getRewardProductUomId() {
        return rewardProductUomId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getDiscountApplicability() {
        return discountApplicability;
    }

    public Product getDiscountLineProductIdAsObject() {
        return discountLineProductIdAsObject;
    }

    public OdooId getDiscountLineProductId() {
        return discountLineProductId;
    }

    public Object getDiscountMaxAmount() {
        return discountMaxAmount;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public List<Product> getDiscountProductIdsAsList() {
        return discountProductIdsAsList;
    }

    public List<Integer> getDiscountProductIds() {
        return discountProductIds;
    }

    public ProductTag getDiscountProductTagIdAsObject() {
        return discountProductTagIdAsObject;
    }

    public OdooId getDiscountProductTagId() {
        return discountProductTagId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public ProductCategory getDiscountProductCategoryIdAsObject() {
        return discountProductCategoryIdAsObject;
    }

    public OdooId getDiscountProductCategoryId() {
        return discountProductCategoryId;
    }

    public Product getRewardProductIdAsObject() {
        return rewardProductIdAsObject;
    }

    public OdooId getRewardProductId() {
        return rewardProductId;
    }

    public String getPointName() {
        return pointName;
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

    public Object getDiscountMode() {
        return discountMode;
    }

    public Object getProgramType() {
        return programType;
    }

    public ProductTag getRewardProductTagIdAsObject() {
        return rewardProductTagIdAsObject;
    }

    public OdooId getRewardProductTagId() {
        return rewardProductTagId;
    }

    public boolean getIsUserHasDebug() {
        return isUserHasDebug;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public int getRewardProductQty() {
        return rewardProductQty;
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

    public void setIsMultiProduct(boolean isMultiProduct) {
        this.isMultiProduct = isMultiProduct;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setRewardType(Object rewardType) {
        this.rewardType = rewardType;
    }

    public void setProgramIdAsObject(LoyaltyProgram programIdAsObject) {
        this.programIdAsObject = programIdAsObject;
    }

    public void setProgramId(OdooId programId) {
        this.programId = programId;
    }

    public void setAllDiscountProductIdsAsList(List<Product> allDiscountProductIdsAsList) {
        this.allDiscountProductIdsAsList = allDiscountProductIdsAsList;
    }

    public void setAllDiscountProductIds(List<Integer> allDiscountProductIds) {
        this.allDiscountProductIds = allDiscountProductIds;
    }

    public void setIsIsGlobalDiscount(boolean isIsGlobalDiscount) {
        this.isIsGlobalDiscount = isIsGlobalDiscount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setRewardProductDomain(String rewardProductDomain) {
        this.rewardProductDomain = rewardProductDomain;
    }

    public void setRequiredPoints(double requiredPoints) {
        this.requiredPoints = requiredPoints;
    }

    public void setIsClearWallet(boolean isClearWallet) {
        this.isClearWallet = isClearWallet;
    }

    public void setDiscountProductDomain(String discountProductDomain) {
        this.discountProductDomain = discountProductDomain;
    }

    public void setRewardProductUomIdAsObject(Uom rewardProductUomIdAsObject) {
        this.rewardProductUomIdAsObject = rewardProductUomIdAsObject;
    }

    public void setRewardProductUomId(OdooId rewardProductUomId) {
        this.rewardProductUomId = rewardProductUomId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDiscountApplicability(Object discountApplicability) {
        this.discountApplicability = discountApplicability;
    }

    public void setDiscountLineProductIdAsObject(Product discountLineProductIdAsObject) {
        this.discountLineProductIdAsObject = discountLineProductIdAsObject;
    }

    public void setDiscountLineProductId(OdooId discountLineProductId) {
        this.discountLineProductId = discountLineProductId;
    }

    public void setDiscountMaxAmount(Object discountMaxAmount) {
        this.discountMaxAmount = discountMaxAmount;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDiscountProductIdsAsList(List<Product> discountProductIdsAsList) {
        this.discountProductIdsAsList = discountProductIdsAsList;
    }

    public void setDiscountProductIds(List<Integer> discountProductIds) {
        this.discountProductIds = discountProductIds;
    }

    public void setDiscountProductTagIdAsObject(ProductTag discountProductTagIdAsObject) {
        this.discountProductTagIdAsObject = discountProductTagIdAsObject;
    }

    public void setDiscountProductTagId(OdooId discountProductTagId) {
        this.discountProductTagId = discountProductTagId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setDiscountProductCategoryIdAsObject(ProductCategory discountProductCategoryIdAsObject) {
        this.discountProductCategoryIdAsObject = discountProductCategoryIdAsObject;
    }

    public void setDiscountProductCategoryId(OdooId discountProductCategoryId) {
        this.discountProductCategoryId = discountProductCategoryId;
    }

    public void setRewardProductIdAsObject(Product rewardProductIdAsObject) {
        this.rewardProductIdAsObject = rewardProductIdAsObject;
    }

    public void setRewardProductId(OdooId rewardProductId) {
        this.rewardProductId = rewardProductId;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
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

    public void setDiscountMode(Object discountMode) {
        this.discountMode = discountMode;
    }

    public void setProgramType(Object programType) {
        this.programType = programType;
    }

    public void setRewardProductTagIdAsObject(ProductTag rewardProductTagIdAsObject) {
        this.rewardProductTagIdAsObject = rewardProductTagIdAsObject;
    }

    public void setRewardProductTagId(OdooId rewardProductTagId) {
        this.rewardProductTagId = rewardProductTagId;
    }

    public void setIsUserHasDebug(boolean isUserHasDebug) {
        this.isUserHasDebug = isUserHasDebug;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setRewardProductQty(int rewardProductQty) {
        this.rewardProductQty = rewardProductQty;
    }

    public void setRewardProductIdsAsList(List<Product> rewardProductIdsAsList) {
        this.rewardProductIdsAsList = rewardProductIdsAsList;
    }

    public void setRewardProductIds(List<Integer> rewardProductIds) {
        this.rewardProductIds = rewardProductIds;
    }



}