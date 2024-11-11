
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

package ch.helvethink.odoo4java.test.ng.sale.order;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.uom.UomCategory;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("sale.order.option")
public class SaleOrderOption implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private double quantity;

    
    private double discount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private SaleOrderLine lineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private OdooId lineId;

    
    private double priceUnit;

    
    private int sequence;

    
    private Uom uomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId uomId;

    
    private boolean isIsPresent;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private Object name;

    
    private int id;

    
    private Date createDate;

    
    private SaleOrder orderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId orderId;

    
    private UomCategory productUomCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.UomCategory")
        @OdooModel("uom.UomCategory")
    
    private OdooId productUomCategoryId;


    public SaleOrderOption() {
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

    public double getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
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

    public SaleOrderLine getLineIdAsObject() {
        return lineIdAsObject;
    }

    public OdooId getLineId() {
        return lineId;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public int getSequence() {
        return sequence;
    }

    public Uom getUomIdAsObject() {
        return uomIdAsObject;
    }

    public OdooId getUomId() {
        return uomId;
    }

    public boolean getIsIsPresent() {
        return isIsPresent;
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

    public SaleOrder getOrderIdAsObject() {
        return orderIdAsObject;
    }

    public OdooId getOrderId() {
        return orderId;
    }

    public UomCategory getProductUomCategoryIdAsObject() {
        return productUomCategoryIdAsObject;
    }

    public OdooId getProductUomCategoryId() {
        return productUomCategoryId;
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

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
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

    public void setLineIdAsObject(SaleOrderLine lineIdAsObject) {
        this.lineIdAsObject = lineIdAsObject;
    }

    public void setLineId(OdooId lineId) {
        this.lineId = lineId;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setUomIdAsObject(Uom uomIdAsObject) {
        this.uomIdAsObject = uomIdAsObject;
    }

    public void setUomId(OdooId uomId) {
        this.uomId = uomId;
    }

    public void setIsIsPresent(boolean isIsPresent) {
        this.isIsPresent = isIsPresent;
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

    public void setOrderIdAsObject(SaleOrder orderIdAsObject) {
        this.orderIdAsObject = orderIdAsObject;
    }

    public void setOrderId(OdooId orderId) {
        this.orderId = orderId;
    }

    public void setProductUomCategoryIdAsObject(UomCategory productUomCategoryIdAsObject) {
        this.productUomCategoryIdAsObject = productUomCategoryIdAsObject;
    }

    public void setProductUomCategoryId(OdooId productUomCategoryId) {
        this.productUomCategoryId = productUomCategoryId;
    }



}