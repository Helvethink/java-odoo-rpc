
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

package ch.helvethink.odoo4java.test.ng.sale.order.template;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.uom.UomCategory;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("sale.order.template.line")
public class SaleOrderTemplateLine implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Uom productUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId productUomId;

    
    private SaleOrderTemplate saleOrderTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate")
        @OdooModel("sale.order.SaleOrderTemplate")
    
    private OdooId saleOrderTemplateId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object displayType;

    
    private int sequence;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private Object name;

    
    private int id;

    
    private Date createDate;

    
    private UomCategory productUomCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.UomCategory")
        @OdooModel("uom.UomCategory")
    
    private OdooId productUomCategoryId;

    
    private double productUomQty;


    public SaleOrderTemplateLine() {
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Uom getProductUomIdAsObject() {
        return productUomIdAsObject;
    }

    public OdooId getProductUomId() {
        return productUomId;
    }

    public SaleOrderTemplate getSaleOrderTemplateIdAsObject() {
        return saleOrderTemplateIdAsObject;
    }

    public OdooId getSaleOrderTemplateId() {
        return saleOrderTemplateId;
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

    public Object getDisplayType() {
        return displayType;
    }

    public int getSequence() {
        return sequence;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public Object getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public UomCategory getProductUomCategoryIdAsObject() {
        return productUomCategoryIdAsObject;
    }

    public OdooId getProductUomCategoryId() {
        return productUomCategoryId;
    }

    public double getProductUomQty() {
        return productUomQty;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setProductUomIdAsObject(Uom productUomIdAsObject) {
        this.productUomIdAsObject = productUomIdAsObject;
    }

    public void setProductUomId(OdooId productUomId) {
        this.productUomId = productUomId;
    }

    public void setSaleOrderTemplateIdAsObject(SaleOrderTemplate saleOrderTemplateIdAsObject) {
        this.saleOrderTemplateIdAsObject = saleOrderTemplateIdAsObject;
    }

    public void setSaleOrderTemplateId(OdooId saleOrderTemplateId) {
        this.saleOrderTemplateId = saleOrderTemplateId;
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

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setProductUomCategoryIdAsObject(UomCategory productUomCategoryIdAsObject) {
        this.productUomCategoryIdAsObject = productUomCategoryIdAsObject;
    }

    public void setProductUomCategoryId(OdooId productUomCategoryId) {
        this.productUomCategoryId = productUomCategoryId;
    }

    public void setProductUomQty(double productUomQty) {
        this.productUomQty = productUomQty;
    }



}