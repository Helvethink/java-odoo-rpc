
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

package ch.helvethink.odoo4java.test.ng.iap;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.iap.account.IapAccountInfo;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("iap.account")
public class IapAccount implements OdooObj {

    
    private Date writeDate;

    
    private List<ResCompany> companyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> companyIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String serviceName;

    
    private String accountToken;

    
    private String warningEmail;

    
    private String description;

    
    private List<IapAccountInfo> accountInfoIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.iap.account.IapAccountInfo")
        @OdooModel("iap.account.IapAccountInfo")
    
    private List<Integer> accountInfoIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private IapAccountInfo accountInfoIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.iap.account.IapAccountInfo")
        @OdooModel("iap.account.IapAccountInfo")
    
    private OdooId accountInfoId;

    
    private boolean isShowToken;

    
    private String balance;

    
    private boolean isWarnMe;

    
    private String name;

    
    private int id;

    
    private Date createDate;

    
    private double warningThreshold;


    public IapAccount() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResCompany> getCompanyIdsAsList() {
        return companyIdsAsList;
    }

    public List<Integer> getCompanyIds() {
        return companyIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
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

    public List<IapAccountInfo> getAccountInfoIdsAsList() {
        return accountInfoIdsAsList;
    }

    public List<Integer> getAccountInfoIds() {
        return accountInfoIds;
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

    public IapAccountInfo getAccountInfoIdAsObject() {
        return accountInfoIdAsObject;
    }

    public OdooId getAccountInfoId() {
        return accountInfoId;
    }

    public boolean getIsShowToken() {
        return isShowToken;
    }

    public String getBalance() {
        return balance;
    }

    public boolean getIsWarnMe() {
        return isWarnMe;
    }

    public String getName() {
        return name;
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

    public void setCompanyIdsAsList(List<ResCompany> companyIdsAsList) {
        this.companyIdsAsList = companyIdsAsList;
    }

    public void setCompanyIds(List<Integer> companyIds) {
        this.companyIds = companyIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
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

    public void setAccountInfoIdsAsList(List<IapAccountInfo> accountInfoIdsAsList) {
        this.accountInfoIdsAsList = accountInfoIdsAsList;
    }

    public void setAccountInfoIds(List<Integer> accountInfoIds) {
        this.accountInfoIds = accountInfoIds;
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

    public void setAccountInfoIdAsObject(IapAccountInfo accountInfoIdAsObject) {
        this.accountInfoIdAsObject = accountInfoIdAsObject;
    }

    public void setAccountInfoId(OdooId accountInfoId) {
        this.accountInfoId = accountInfoId;
    }

    public void setIsShowToken(boolean isShowToken) {
        this.isShowToken = isShowToken;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setIsWarnMe(boolean isWarnMe) {
        this.isWarnMe = isWarnMe;
    }

    public void setName(String name) {
        this.name = name;
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