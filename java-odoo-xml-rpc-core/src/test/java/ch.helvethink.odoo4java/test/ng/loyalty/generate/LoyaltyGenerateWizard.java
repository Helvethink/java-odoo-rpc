
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

package ch.helvethink.odoo4java.test.ng.loyalty.generate;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory;
import java.util.Date;;

@OdooObject("loyalty.generate.wizard")
public class LoyaltyGenerateWizard implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int couponQty;

    
    private LoyaltyProgram programIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram")
        @OdooModel("loyalty.LoyaltyProgram")
    
    private OdooId programId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object mode;

    
    private String pointsName;

    
    private Object programType;

    
    private Object validUntil;

    
    private List<ResPartner> customerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> customerIds;

    
    private List<ResPartnerCategory> customerTagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
    
    private List<Integer> customerTagIds;

    
    private boolean isWillSendMail;

    
    private int id;

    
    private double pointsGranted;

    
    private Date createDate;


    public LoyaltyGenerateWizard() {
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

    public int getCouponQty() {
        return couponQty;
    }

    public LoyaltyProgram getProgramIdAsObject() {
        return programIdAsObject;
    }

    public OdooId getProgramId() {
        return programId;
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

    public Object getMode() {
        return mode;
    }

    public String getPointsName() {
        return pointsName;
    }

    public Object getProgramType() {
        return programType;
    }

    public Object getValidUntil() {
        return validUntil;
    }

    public List<ResPartner> getCustomerIdsAsList() {
        return customerIdsAsList;
    }

    public List<Integer> getCustomerIds() {
        return customerIds;
    }

    public List<ResPartnerCategory> getCustomerTagIdsAsList() {
        return customerTagIdsAsList;
    }

    public List<Integer> getCustomerTagIds() {
        return customerTagIds;
    }

    public boolean getIsWillSendMail() {
        return isWillSendMail;
    }

    public int getId() {
        return id;
    }

    public double getPointsGranted() {
        return pointsGranted;
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

    public void setCouponQty(int couponQty) {
        this.couponQty = couponQty;
    }

    public void setProgramIdAsObject(LoyaltyProgram programIdAsObject) {
        this.programIdAsObject = programIdAsObject;
    }

    public void setProgramId(OdooId programId) {
        this.programId = programId;
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

    public void setMode(Object mode) {
        this.mode = mode;
    }

    public void setPointsName(String pointsName) {
        this.pointsName = pointsName;
    }

    public void setProgramType(Object programType) {
        this.programType = programType;
    }

    public void setValidUntil(Object validUntil) {
        this.validUntil = validUntil;
    }

    public void setCustomerIdsAsList(List<ResPartner> customerIdsAsList) {
        this.customerIdsAsList = customerIdsAsList;
    }

    public void setCustomerIds(List<Integer> customerIds) {
        this.customerIds = customerIds;
    }

    public void setCustomerTagIdsAsList(List<ResPartnerCategory> customerTagIdsAsList) {
        this.customerTagIdsAsList = customerTagIdsAsList;
    }

    public void setCustomerTagIds(List<Integer> customerTagIds) {
        this.customerTagIds = customerTagIds;
    }

    public void setIsWillSendMail(boolean isWillSendMail) {
        this.isWillSendMail = isWillSendMail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPointsGranted(double pointsGranted) {
        this.pointsGranted = pointsGranted;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}