
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

package ch.helvethink.odoo4java.test.ng.product;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.product.attribute.ProductAttributeValue;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("product.attribute")
public class ProductAttribute implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ProductTemplate> productTmplIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private List<Integer> productTmplIds;

    
    private List<ProductAttributeValue> valueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.attribute.ProductAttributeValue")
        @OdooModel("product.attribute.ProductAttributeValue")
    
    private List<Integer> valueIds;

    
    private List<ProductTemplateAttributeLine> attributeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine")
        @OdooModel("product.template.attribute.ProductTemplateAttributeLine")
    
    private List<Integer> attributeLineIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object createVariant;

    
    private Object displayType;

    
    private int sequence;

    
    private String name;

    
    private int id;

    
    private int numberRelatedProducts;

    
    private Date createDate;


    public ProductAttribute() {
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

    public List<ProductTemplate> getProductTmplIdsAsList() {
        return productTmplIdsAsList;
    }

    public List<Integer> getProductTmplIds() {
        return productTmplIds;
    }

    public List<ProductAttributeValue> getValueIdsAsList() {
        return valueIdsAsList;
    }

    public List<Integer> getValueIds() {
        return valueIds;
    }

    public List<ProductTemplateAttributeLine> getAttributeLineIdsAsList() {
        return attributeLineIdsAsList;
    }

    public List<Integer> getAttributeLineIds() {
        return attributeLineIds;
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

    public Object getCreateVariant() {
        return createVariant;
    }

    public Object getDisplayType() {
        return displayType;
    }

    public int getSequence() {
        return sequence;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumberRelatedProducts() {
        return numberRelatedProducts;
    }

    public Date getCreateDate() {
        return createDate;
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

    public void setProductTmplIdsAsList(List<ProductTemplate> productTmplIdsAsList) {
        this.productTmplIdsAsList = productTmplIdsAsList;
    }

    public void setProductTmplIds(List<Integer> productTmplIds) {
        this.productTmplIds = productTmplIds;
    }

    public void setValueIdsAsList(List<ProductAttributeValue> valueIdsAsList) {
        this.valueIdsAsList = valueIdsAsList;
    }

    public void setValueIds(List<Integer> valueIds) {
        this.valueIds = valueIds;
    }

    public void setAttributeLineIdsAsList(List<ProductTemplateAttributeLine> attributeLineIdsAsList) {
        this.attributeLineIdsAsList = attributeLineIdsAsList;
    }

    public void setAttributeLineIds(List<Integer> attributeLineIds) {
        this.attributeLineIds = attributeLineIds;
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

    public void setCreateVariant(Object createVariant) {
        this.createVariant = createVariant;
    }

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberRelatedProducts(int numberRelatedProducts) {
        this.numberRelatedProducts = numberRelatedProducts;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}