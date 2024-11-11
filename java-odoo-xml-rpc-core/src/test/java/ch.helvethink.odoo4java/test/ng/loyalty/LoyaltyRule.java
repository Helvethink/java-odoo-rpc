
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
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.product.ProductTag;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("loyalty.rule")
public class LoyaltyRule implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private ProductTag productTagIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTag")
        @OdooModel("product.ProductTag")
    
    private OdooId productTagId;

    
    private LoyaltyProgram programIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram")
        @OdooModel("loyalty.LoyaltyProgram")
    
    private OdooId programId;

    
    private Object rewardPointMode;

    
    private double rewardPointAmount;

    
    private Object minimumAmount;

    
    private ProductCategory productCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId productCategoryId;

    
    private Object mode;

    
    private int minimumQty;

    
    private int id;

    
    private Date createDate;

    
    private String rewardPointName;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String productDomain;

    
    private boolean isRewardPointSplit;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object programType;

    
    private List<Product> productIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> productIds;

    
    private Object minimumAmountTaxMode;

    
    private boolean isUserHasDebug;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public LoyaltyRule() {
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

    public String getCode() {
        return code;
    }

    public ProductTag getProductTagIdAsObject() {
        return productTagIdAsObject;
    }

    public OdooId getProductTagId() {
        return productTagId;
    }

    public LoyaltyProgram getProgramIdAsObject() {
        return programIdAsObject;
    }

    public OdooId getProgramId() {
        return programId;
    }

    public Object getRewardPointMode() {
        return rewardPointMode;
    }

    public double getRewardPointAmount() {
        return rewardPointAmount;
    }

    public Object getMinimumAmount() {
        return minimumAmount;
    }

    public ProductCategory getProductCategoryIdAsObject() {
        return productCategoryIdAsObject;
    }

    public OdooId getProductCategoryId() {
        return productCategoryId;
    }

    public Object getMode() {
        return mode;
    }

    public int getMinimumQty() {
        return minimumQty;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getRewardPointName() {
        return rewardPointName;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public String getProductDomain() {
        return productDomain;
    }

    public boolean getIsRewardPointSplit() {
        return isRewardPointSplit;
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

    public Object getProgramType() {
        return programType;
    }

    public List<Product> getProductIdsAsList() {
        return productIdsAsList;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    public Object getMinimumAmountTaxMode() {
        return minimumAmountTaxMode;
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



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
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

    public void setProductTagIdAsObject(ProductTag productTagIdAsObject) {
        this.productTagIdAsObject = productTagIdAsObject;
    }

    public void setProductTagId(OdooId productTagId) {
        this.productTagId = productTagId;
    }

    public void setProgramIdAsObject(LoyaltyProgram programIdAsObject) {
        this.programIdAsObject = programIdAsObject;
    }

    public void setProgramId(OdooId programId) {
        this.programId = programId;
    }

    public void setRewardPointMode(Object rewardPointMode) {
        this.rewardPointMode = rewardPointMode;
    }

    public void setRewardPointAmount(double rewardPointAmount) {
        this.rewardPointAmount = rewardPointAmount;
    }

    public void setMinimumAmount(Object minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public void setProductCategoryIdAsObject(ProductCategory productCategoryIdAsObject) {
        this.productCategoryIdAsObject = productCategoryIdAsObject;
    }

    public void setProductCategoryId(OdooId productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public void setMode(Object mode) {
        this.mode = mode;
    }

    public void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRewardPointName(String rewardPointName) {
        this.rewardPointName = rewardPointName;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setProductDomain(String productDomain) {
        this.productDomain = productDomain;
    }

    public void setIsRewardPointSplit(boolean isRewardPointSplit) {
        this.isRewardPointSplit = isRewardPointSplit;
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

    public void setProgramType(Object programType) {
        this.programType = programType;
    }

    public void setProductIdsAsList(List<Product> productIdsAsList) {
        this.productIdsAsList = productIdsAsList;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }

    public void setMinimumAmountTaxMode(Object minimumAmountTaxMode) {
        this.minimumAmountTaxMode = minimumAmountTaxMode;
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



}