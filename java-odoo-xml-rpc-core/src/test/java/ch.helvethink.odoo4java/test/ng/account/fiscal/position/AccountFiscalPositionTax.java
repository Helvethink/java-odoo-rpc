
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

package ch.helvethink.odoo4java.test.ng.account.fiscal.position;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.fiscal.position.tax")
public class AccountFiscalPositionTax implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private int id;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private boolean isTaxDestActive;

    
    private AccountTax taxSrcIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId taxSrcId;

    
    private AccountFiscalPosition positionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private OdooId positionId;

    
    private AccountTax taxDestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private OdooId taxDestId;


    public AccountFiscalPositionTax() {
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

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsTaxDestActive() {
        return isTaxDestActive;
    }

    public AccountTax getTaxSrcIdAsObject() {
        return taxSrcIdAsObject;
    }

    public OdooId getTaxSrcId() {
        return taxSrcId;
    }

    public AccountFiscalPosition getPositionIdAsObject() {
        return positionIdAsObject;
    }

    public OdooId getPositionId() {
        return positionId;
    }

    public AccountTax getTaxDestIdAsObject() {
        return taxDestIdAsObject;
    }

    public OdooId getTaxDestId() {
        return taxDestId;
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

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsTaxDestActive(boolean isTaxDestActive) {
        this.isTaxDestActive = isTaxDestActive;
    }

    public void setTaxSrcIdAsObject(AccountTax taxSrcIdAsObject) {
        this.taxSrcIdAsObject = taxSrcIdAsObject;
    }

    public void setTaxSrcId(OdooId taxSrcId) {
        this.taxSrcId = taxSrcId;
    }

    public void setPositionIdAsObject(AccountFiscalPosition positionIdAsObject) {
        this.positionIdAsObject = positionIdAsObject;
    }

    public void setPositionId(OdooId positionId) {
        this.positionId = positionId;
    }

    public void setTaxDestIdAsObject(AccountTax taxDestIdAsObject) {
        this.taxDestIdAsObject = taxDestIdAsObject;
    }

    public void setTaxDestId(OdooId taxDestId) {
        this.taxDestId = taxDestId;
    }



}