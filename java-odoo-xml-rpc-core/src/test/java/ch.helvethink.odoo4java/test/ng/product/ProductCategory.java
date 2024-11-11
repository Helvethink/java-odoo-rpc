
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
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("product.category")
public class ProductCategory implements OdooObj {

    
    private Date writeDate;

    
    private Object productPropertiesDefinition;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Account propertyAccountExpenseCategIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountExpenseCategId;

    
    private int productCount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String completeName;

    
    private List<ProductCategory> childIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private List<Integer> childId;

    
    private ProductCategory parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId parentId;

    
    private String name;

    
    private String parentPath;

    
    private Account propertyAccountIncomeCategIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountIncomeCategId;

    
    private int id;

    
    private Date createDate;


    public ProductCategory() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getProductPropertiesDefinition() {
        return productPropertiesDefinition;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Account getPropertyAccountExpenseCategIdAsObject() {
        return propertyAccountExpenseCategIdAsObject;
    }

    public OdooId getPropertyAccountExpenseCategId() {
        return propertyAccountExpenseCategId;
    }

    public int getProductCount() {
        return productCount;
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

    public String getCompleteName() {
        return completeName;
    }

    public List<ProductCategory> getChildIdAsList() {
        return childIdAsList;
    }

    public List<Integer> getChildId() {
        return childId;
    }

    public ProductCategory getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public String getParentPath() {
        return parentPath;
    }

    public Account getPropertyAccountIncomeCategIdAsObject() {
        return propertyAccountIncomeCategIdAsObject;
    }

    public OdooId getPropertyAccountIncomeCategId() {
        return propertyAccountIncomeCategId;
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

    public void setProductPropertiesDefinition(Object productPropertiesDefinition) {
        this.productPropertiesDefinition = productPropertiesDefinition;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setPropertyAccountExpenseCategIdAsObject(Account propertyAccountExpenseCategIdAsObject) {
        this.propertyAccountExpenseCategIdAsObject = propertyAccountExpenseCategIdAsObject;
    }

    public void setPropertyAccountExpenseCategId(OdooId propertyAccountExpenseCategId) {
        this.propertyAccountExpenseCategId = propertyAccountExpenseCategId;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
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

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setChildIdAsList(List<ProductCategory> childIdAsList) {
        this.childIdAsList = childIdAsList;
    }

    public void setChildId(List<Integer> childId) {
        this.childId = childId;
    }

    public void setParentIdAsObject(ProductCategory parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public void setPropertyAccountIncomeCategIdAsObject(Account propertyAccountIncomeCategIdAsObject) {
        this.propertyAccountIncomeCategIdAsObject = propertyAccountIncomeCategIdAsObject;
    }

    public void setPropertyAccountIncomeCategId(OdooId propertyAccountIncomeCategId) {
        this.propertyAccountIncomeCategId = propertyAccountIncomeCategId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}