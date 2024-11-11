
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

package ch.helvethink.odoo4java.test.ng.utm;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.utm.UtmTag;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.utm.UtmStage;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("utm.campaign")
public class UtmCampaign implements OdooObj {

    
    private Date writeDate;

    
    private List<UtmTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmTag")
        @OdooModel("utm.UtmTag")
    
    private List<Integer> tagIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsAutoCampaign;

    
    private int color;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private int quotationCount;

    
    private UtmStage stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmStage")
        @OdooModel("utm.UtmStage")
    
    private OdooId stageId;

    
    private boolean isActive;

    
    private int invoicedAmount;

    
    private String title;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int crmLeadCount;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String name;

    
    private int id;

    
    private Date createDate;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private boolean isUseLeads;


    public UtmCampaign() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<UtmTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsIsAutoCampaign() {
        return isIsAutoCampaign;
    }

    public int getColor() {
        return color;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public int getQuotationCount() {
        return quotationCount;
    }

    public UtmStage getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getInvoicedAmount() {
        return invoicedAmount;
    }

    public String getTitle() {
        return title;
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

    public int getCrmLeadCount() {
        return crmLeadCount;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
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

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public boolean getIsUseLeads() {
        return isUseLeads;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setTagIdsAsList(List<UtmTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsIsAutoCampaign(boolean isIsAutoCampaign) {
        this.isIsAutoCampaign = isIsAutoCampaign;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setQuotationCount(int quotationCount) {
        this.quotationCount = quotationCount;
    }

    public void setStageIdAsObject(UtmStage stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setInvoicedAmount(int invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void setCrmLeadCount(int crmLeadCount) {
        this.crmLeadCount = crmLeadCount;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
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

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setIsUseLeads(boolean isUseLeads) {
        this.isUseLeads = isUseLeads;
    }



}