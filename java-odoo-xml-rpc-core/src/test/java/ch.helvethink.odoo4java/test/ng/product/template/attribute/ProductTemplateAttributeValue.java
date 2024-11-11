
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

package ch.helvethink.odoo4java.test.ng.product.template.attribute;

import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeExclusion;
import ch.helvethink.odoo4java.test.ng.product.attribute.ProductAttributeValue;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.ProductAttribute;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;;

@OdooObject("product.template.attribute.value")
public class ProductTemplateAttributeValue implements OdooObj {

    
    private Date writeDate;

    
    private boolean isPtavActive;

    
    private Object image;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ProductTemplateAttributeLine attributeLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine")
        @OdooModel("product.template.attribute.ProductTemplateAttributeLine")
    
    private OdooId attributeLineId;

    
    private Object displayType;

    
    private ProductTemplate productTmplIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private OdooId productTmplId;

    
    private List<ProductTemplateAttributeExclusion> excludeForAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeExclusion")
        @OdooModel("product.template.attribute.ProductTemplateAttributeExclusion")
    
    private List<Integer> excludeFor;

    
    private String htmlColor;

    
    private ProductAttributeValue productAttributeValueIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.attribute.ProductAttributeValue")
        @OdooModel("product.attribute.ProductAttributeValue")
    
    private OdooId productAttributeValueId;

    
    private ProductAttribute attributeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductAttribute")
        @OdooModel("product.ProductAttribute")
    
    private OdooId attributeId;

    
    private String name;

    
    private boolean isIsCustom;

    
    private List<Product> ptavProductVariantIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> ptavProductVariantIds;

    
    private double priceExtra;

    
    private int id;

    
    private Date createDate;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public ProductTemplateAttributeValue() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsPtavActive() {
        return isPtavActive;
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

    public int getColor() {
        return color;
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

    public ProductTemplateAttributeLine getAttributeLineIdAsObject() {
        return attributeLineIdAsObject;
    }

    public OdooId getAttributeLineId() {
        return attributeLineId;
    }

    public Object getDisplayType() {
        return displayType;
    }

    public ProductTemplate getProductTmplIdAsObject() {
        return productTmplIdAsObject;
    }

    public OdooId getProductTmplId() {
        return productTmplId;
    }

    public List<ProductTemplateAttributeExclusion> getExcludeForAsList() {
        return excludeForAsList;
    }

    public List<Integer> getExcludeFor() {
        return excludeFor;
    }

    public String getHtmlColor() {
        return htmlColor;
    }

    public ProductAttributeValue getProductAttributeValueIdAsObject() {
        return productAttributeValueIdAsObject;
    }

    public OdooId getProductAttributeValueId() {
        return productAttributeValueId;
    }

    public ProductAttribute getAttributeIdAsObject() {
        return attributeIdAsObject;
    }

    public OdooId getAttributeId() {
        return attributeId;
    }

    public String getName() {
        return name;
    }

    public boolean getIsIsCustom() {
        return isIsCustom;
    }

    public List<Product> getPtavProductVariantIdsAsList() {
        return ptavProductVariantIdsAsList;
    }

    public List<Integer> getPtavProductVariantIds() {
        return ptavProductVariantIds;
    }

    public double getPriceExtra() {
        return priceExtra;
    }

    public int getId() {
        return id;
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

    public void setIsPtavActive(boolean isPtavActive) {
        this.isPtavActive = isPtavActive;
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

    public void setColor(int color) {
        this.color = color;
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

    public void setAttributeLineIdAsObject(ProductTemplateAttributeLine attributeLineIdAsObject) {
        this.attributeLineIdAsObject = attributeLineIdAsObject;
    }

    public void setAttributeLineId(OdooId attributeLineId) {
        this.attributeLineId = attributeLineId;
    }

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setProductTmplIdAsObject(ProductTemplate productTmplIdAsObject) {
        this.productTmplIdAsObject = productTmplIdAsObject;
    }

    public void setProductTmplId(OdooId productTmplId) {
        this.productTmplId = productTmplId;
    }

    public void setExcludeForAsList(List<ProductTemplateAttributeExclusion> excludeForAsList) {
        this.excludeForAsList = excludeForAsList;
    }

    public void setExcludeFor(List<Integer> excludeFor) {
        this.excludeFor = excludeFor;
    }

    public void setHtmlColor(String htmlColor) {
        this.htmlColor = htmlColor;
    }

    public void setProductAttributeValueIdAsObject(ProductAttributeValue productAttributeValueIdAsObject) {
        this.productAttributeValueIdAsObject = productAttributeValueIdAsObject;
    }

    public void setProductAttributeValueId(OdooId productAttributeValueId) {
        this.productAttributeValueId = productAttributeValueId;
    }

    public void setAttributeIdAsObject(ProductAttribute attributeIdAsObject) {
        this.attributeIdAsObject = attributeIdAsObject;
    }

    public void setAttributeId(OdooId attributeId) {
        this.attributeId = attributeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsIsCustom(boolean isIsCustom) {
        this.isIsCustom = isIsCustom;
    }

    public void setPtavProductVariantIdsAsList(List<Product> ptavProductVariantIdsAsList) {
        this.ptavProductVariantIdsAsList = ptavProductVariantIdsAsList;
    }

    public void setPtavProductVariantIds(List<Integer> ptavProductVariantIds) {
        this.ptavProductVariantIds = ptavProductVariantIds;
    }

    public void setPriceExtra(double priceExtra) {
        this.priceExtra = priceExtra;
    }

    public void setId(int id) {
        this.id = id;
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