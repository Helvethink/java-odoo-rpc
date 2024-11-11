
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

package ch.helvethink.odoo4java.test.ng.iap.account;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.iap.IapAccount;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("iap.account.info")
public class IapAccountInfo implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String accountUuidHashed;

    
    private String serviceName;

    
    private String accountToken;

    
    private String warningEmail;

    
    private String description;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String unitName;

    
    private IapAccount accountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.iap.IapAccount")
        @OdooModel("iap.IapAccount")
    
    private OdooId accountId;

    
    private double balance;

    
    private boolean isWarnMe;

    
    private int id;

    
    private Date createDate;

    
    private double warningThreshold;


    public IapAccountInfo() {
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

    public String getAccountUuidHashed() {
        return accountUuidHashed;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getAccountToken() {
        return accountToken;
    }

    public String getWarningEmail() {
        return warningEmail;
    }

    public String getDescription() {
        return description;
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

    public String getUnitName() {
        return unitName;
    }

    public IapAccount getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean getIsWarnMe() {
        return isWarnMe;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getWarningThreshold() {
        return warningThreshold;
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

    public void setAccountUuidHashed(String accountUuidHashed) {
        this.accountUuidHashed = accountUuidHashed;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken;
    }

    public void setWarningEmail(String warningEmail) {
        this.warningEmail = warningEmail;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setAccountIdAsObject(IapAccount accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIsWarnMe(boolean isWarnMe) {
        this.isWarnMe = isWarnMe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setWarningThreshold(double warningThreshold) {
        this.warningThreshold = warningThreshold;
    }



}