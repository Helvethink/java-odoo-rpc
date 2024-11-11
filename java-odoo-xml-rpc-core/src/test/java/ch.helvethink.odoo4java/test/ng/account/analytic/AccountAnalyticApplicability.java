
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

package ch.helvethink.odoo4java.test.ng.account.analytic;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticPlan;;

@OdooObject("account.analytic.applicability")
public class AccountAnalyticApplicability implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ProductCategory productCategIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId productCategId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String accountPrefix;

    
    private boolean isDisplayAccountPrefix;

    
    private AccountAnalyticPlan analyticPlanIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticPlan")
        @OdooModel("account.analytic.AccountAnalyticPlan")
    
    private OdooId analyticPlanId;

    
    private Object businessDomain;

    
    private Object applicability;

    
    private int id;

    
    private Date createDate;


    public AccountAnalyticApplicability() {
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

    public ProductCategory getProductCategIdAsObject() {
        return productCategIdAsObject;
    }

    public OdooId getProductCategId() {
        return productCategId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
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

    public String getAccountPrefix() {
        return accountPrefix;
    }

    public boolean getIsDisplayAccountPrefix() {
        return isDisplayAccountPrefix;
    }

    public AccountAnalyticPlan getAnalyticPlanIdAsObject() {
        return analyticPlanIdAsObject;
    }

    public OdooId getAnalyticPlanId() {
        return analyticPlanId;
    }

    public Object getBusinessDomain() {
        return businessDomain;
    }

    public Object getApplicability() {
        return applicability;
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

    public void setProductCategIdAsObject(ProductCategory productCategIdAsObject) {
        this.productCategIdAsObject = productCategIdAsObject;
    }

    public void setProductCategId(OdooId productCategId) {
        this.productCategId = productCategId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
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

    public void setAccountPrefix(String accountPrefix) {
        this.accountPrefix = accountPrefix;
    }

    public void setIsDisplayAccountPrefix(boolean isDisplayAccountPrefix) {
        this.isDisplayAccountPrefix = isDisplayAccountPrefix;
    }

    public void setAnalyticPlanIdAsObject(AccountAnalyticPlan analyticPlanIdAsObject) {
        this.analyticPlanIdAsObject = analyticPlanIdAsObject;
    }

    public void setAnalyticPlanId(OdooId analyticPlanId) {
        this.analyticPlanId = analyticPlanId;
    }

    public void setBusinessDomain(Object businessDomain) {
        this.businessDomain = businessDomain;
    }

    public void setApplicability(Object applicability) {
        this.applicability = applicability;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}