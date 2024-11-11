
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

package ch.helvethink.odoo4java.test.ng.product.label;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("product.label.layout")
public class ProductLabelLayout implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ProductTemplate> productTmplIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private List<Integer> productTmplIds;

    
    private Object printFormat;

    
    private int columns;

    
    private ProductPricelist pricelistIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId pricelistId;

    
    private int rows;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<Product> productIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> productIds;

    
    private Object extraHtml;

    
    private int customQuantity;

    
    private int id;

    
    private Date createDate;


    public ProductLabelLayout() {
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

    public Object getPrintFormat() {
        return printFormat;
    }

    public int getColumns() {
        return columns;
    }

    public ProductPricelist getPricelistIdAsObject() {
        return pricelistIdAsObject;
    }

    public OdooId getPricelistId() {
        return pricelistId;
    }

    public int getRows() {
        return rows;
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

    public List<Product> getProductIdsAsList() {
        return productIdsAsList;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    public Object getExtraHtml() {
        return extraHtml;
    }

    public int getCustomQuantity() {
        return customQuantity;
    }

    public int getId() {
        return id;
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

    public void setPrintFormat(Object printFormat) {
        this.printFormat = printFormat;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setPricelistIdAsObject(ProductPricelist pricelistIdAsObject) {
        this.pricelistIdAsObject = pricelistIdAsObject;
    }

    public void setPricelistId(OdooId pricelistId) {
        this.pricelistId = pricelistId;
    }

    public void setRows(int rows) {
        this.rows = rows;
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

    public void setProductIdsAsList(List<Product> productIdsAsList) {
        this.productIdsAsList = productIdsAsList;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }

    public void setExtraHtml(Object extraHtml) {
        this.extraHtml = extraHtml;
    }

    public void setCustomQuantity(int customQuantity) {
        this.customQuantity = customQuantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}