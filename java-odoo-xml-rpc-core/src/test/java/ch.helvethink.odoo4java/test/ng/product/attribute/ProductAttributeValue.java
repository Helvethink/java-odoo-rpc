
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

package ch.helvethink.odoo4java.test.ng.product.attribute;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.ProductAttribute;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("product.attribute.value")
public class ProductAttributeValue implements OdooObj {

    
    private double defaultExtraPrice;

    
    private Date writeDate;

    
    private Object image;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsUsedOnProducts;

    
    private int color;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<ProductTemplateAttributeLine> pavAttributeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine")
        @OdooModel("product.template.attribute.ProductTemplateAttributeLine")
    
    private List<Integer> pavAttributeLineIds;

    
    private Object displayType;

    
    private int sequence;

    
    private String htmlColor;

    
    private ProductAttribute attributeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductAttribute")
        @OdooModel("product.ProductAttribute")
    
    private OdooId attributeId;

    
    private String name;

    
    private boolean isIsCustom;

    
    private int id;

    
    private Date createDate;


    public ProductAttributeValue() {
    // Constructor
    }


    public double getDefaultExtraPrice() {
        return defaultExtraPrice;
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

    public boolean getIsIsUsedOnProducts() {
        return isIsUsedOnProducts;
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

    public List<ProductTemplateAttributeLine> getPavAttributeLineIdsAsList() {
        return pavAttributeLineIdsAsList;
    }

    public List<Integer> getPavAttributeLineIds() {
        return pavAttributeLineIds;
    }

    public Object getDisplayType() {
        return displayType;
    }

    public int getSequence() {
        return sequence;
    }

    public String getHtmlColor() {
        return htmlColor;
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

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setDefaultExtraPrice(double defaultExtraPrice) {
        this.defaultExtraPrice = defaultExtraPrice;
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

    public void setIsIsUsedOnProducts(boolean isIsUsedOnProducts) {
        this.isIsUsedOnProducts = isIsUsedOnProducts;
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

    public void setPavAttributeLineIdsAsList(List<ProductTemplateAttributeLine> pavAttributeLineIdsAsList) {
        this.pavAttributeLineIdsAsList = pavAttributeLineIdsAsList;
    }

    public void setPavAttributeLineIds(List<Integer> pavAttributeLineIds) {
        this.pavAttributeLineIds = pavAttributeLineIds;
    }

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setHtmlColor(String htmlColor) {
        this.htmlColor = htmlColor;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}