
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

package ch.helvethink.odoo4java.test.ng.product.pricelist;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;;

@OdooObject("product.pricelist.item")
public class ProductPricelistItem implements OdooObj {

    
    private ProductCategory categIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId categId;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private double priceMinMargin;

    
    private double priceMaxMargin;

    
    private double priceRound;

    
    private double minQuantity;

    
    private Object computePrice;

    
    private String price;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private int id;

    
    private Date createDate;

    
    private String ruleTip;

    
    private double priceDiscount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private ProductPricelist pricelistIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId pricelistId;

    
    private Date dateEnd;

    
    private double fixedPrice;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ProductTemplate productTmplIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private OdooId productTmplId;

    
    private Date dateStart;

    
    private ProductPricelist basePricelistIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId basePricelistId;

    
    private Object appliedOn;

    
    private double percentPrice;

    
    private String name;

    
    private double priceSurcharge;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object base;


    public ProductPricelistItem() {
    // Constructor
    }


    public ProductCategory getCategIdAsObject() {
        return categIdAsObject;
    }

    public OdooId getCategId() {
        return categId;
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

    public double getPriceMinMargin() {
        return priceMinMargin;
    }

    public double getPriceMaxMargin() {
        return priceMaxMargin;
    }

    public double getPriceRound() {
        return priceRound;
    }

    public double getMinQuantity() {
        return minQuantity;
    }

    public Object getComputePrice() {
        return computePrice;
    }

    public String getPrice() {
        return price;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getRuleTip() {
        return ruleTip;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public ProductPricelist getPricelistIdAsObject() {
        return pricelistIdAsObject;
    }

    public OdooId getPricelistId() {
        return pricelistId;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public double getFixedPrice() {
        return fixedPrice;
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

    public ProductTemplate getProductTmplIdAsObject() {
        return productTmplIdAsObject;
    }

    public OdooId getProductTmplId() {
        return productTmplId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public ProductPricelist getBasePricelistIdAsObject() {
        return basePricelistIdAsObject;
    }

    public OdooId getBasePricelistId() {
        return basePricelistId;
    }

    public Object getAppliedOn() {
        return appliedOn;
    }

    public double getPercentPrice() {
        return percentPrice;
    }

    public String getName() {
        return name;
    }

    public double getPriceSurcharge() {
        return priceSurcharge;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Object getBase() {
        return base;
    }



    public void setCategIdAsObject(ProductCategory categIdAsObject) {
        this.categIdAsObject = categIdAsObject;
    }

    public void setCategId(OdooId categId) {
        this.categId = categId;
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

    public void setPriceMinMargin(double priceMinMargin) {
        this.priceMinMargin = priceMinMargin;
    }

    public void setPriceMaxMargin(double priceMaxMargin) {
        this.priceMaxMargin = priceMaxMargin;
    }

    public void setPriceRound(double priceRound) {
        this.priceRound = priceRound;
    }

    public void setMinQuantity(double minQuantity) {
        this.minQuantity = minQuantity;
    }

    public void setComputePrice(Object computePrice) {
        this.computePrice = computePrice;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRuleTip(String ruleTip) {
        this.ruleTip = ruleTip;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setPricelistIdAsObject(ProductPricelist pricelistIdAsObject) {
        this.pricelistIdAsObject = pricelistIdAsObject;
    }

    public void setPricelistId(OdooId pricelistId) {
        this.pricelistId = pricelistId;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setFixedPrice(double fixedPrice) {
        this.fixedPrice = fixedPrice;
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

    public void setProductTmplIdAsObject(ProductTemplate productTmplIdAsObject) {
        this.productTmplIdAsObject = productTmplIdAsObject;
    }

    public void setProductTmplId(OdooId productTmplId) {
        this.productTmplId = productTmplId;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setBasePricelistIdAsObject(ProductPricelist basePricelistIdAsObject) {
        this.basePricelistIdAsObject = basePricelistIdAsObject;
    }

    public void setBasePricelistId(OdooId basePricelistId) {
        this.basePricelistId = basePricelistId;
    }

    public void setAppliedOn(Object appliedOn) {
        this.appliedOn = appliedOn;
    }

    public void setPercentPrice(double percentPrice) {
        this.percentPrice = percentPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceSurcharge(double priceSurcharge) {
        this.priceSurcharge = priceSurcharge;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setBase(Object base) {
        this.base = base;
    }



}