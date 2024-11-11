
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

package ch.helvethink.odoo4java.test.ng.digest;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("digest.digest")
public class Digest implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int kpiProjectTaskOpenedValue;

    
    private boolean isKpiResUsersConnected;

    
    private int kpiCrmLeadCreatedValue;

    
    private Object nextRunDate;

    
    private int kpiResUsersConnectedValue;

    
    private int kpiHrRecruitmentNewColleaguesValue;

    
    private boolean isKpiAccountTotalRevenue;

    
    private boolean isKpiCrmLeadCreated;

    
    private boolean isKpiProjectTaskOpened;

    
    private Object kpiAllSaleTotalValue;

    
    private Object state;

    
    private int id;

    
    private int kpiMailMessageTotalValue;

    
    private Date createDate;

    
    private boolean isKpiCrmOpportunitiesWon;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private boolean isKpiHrRecruitmentNewColleagues;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int kpiCrmOpportunitiesWonValue;

    
    private String name;

    
    private Object periodicity;

    
    private boolean isIsSubscribed;

    
    private Object kpiAccountTotalRevenueValue;

    
    private boolean isKpiAllSaleTotal;

    
    private boolean isKpiMailMessageTotal;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private String availableFields;


    public Digest() {
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

    public int getKpiProjectTaskOpenedValue() {
        return kpiProjectTaskOpenedValue;
    }

    public boolean getIsKpiResUsersConnected() {
        return isKpiResUsersConnected;
    }

    public int getKpiCrmLeadCreatedValue() {
        return kpiCrmLeadCreatedValue;
    }

    public Object getNextRunDate() {
        return nextRunDate;
    }

    public int getKpiResUsersConnectedValue() {
        return kpiResUsersConnectedValue;
    }

    public int getKpiHrRecruitmentNewColleaguesValue() {
        return kpiHrRecruitmentNewColleaguesValue;
    }

    public boolean getIsKpiAccountTotalRevenue() {
        return isKpiAccountTotalRevenue;
    }

    public boolean getIsKpiCrmLeadCreated() {
        return isKpiCrmLeadCreated;
    }

    public boolean getIsKpiProjectTaskOpened() {
        return isKpiProjectTaskOpened;
    }

    public Object getKpiAllSaleTotalValue() {
        return kpiAllSaleTotalValue;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public int getKpiMailMessageTotalValue() {
        return kpiMailMessageTotalValue;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsKpiCrmOpportunitiesWon() {
        return isKpiCrmOpportunitiesWon;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public boolean getIsKpiHrRecruitmentNewColleagues() {
        return isKpiHrRecruitmentNewColleagues;
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

    public int getKpiCrmOpportunitiesWonValue() {
        return kpiCrmOpportunitiesWonValue;
    }

    public String getName() {
        return name;
    }

    public Object getPeriodicity() {
        return periodicity;
    }

    public boolean getIsIsSubscribed() {
        return isIsSubscribed;
    }

    public Object getKpiAccountTotalRevenueValue() {
        return kpiAccountTotalRevenueValue;
    }

    public boolean getIsKpiAllSaleTotal() {
        return isKpiAllSaleTotal;
    }

    public boolean getIsKpiMailMessageTotal() {
        return isKpiMailMessageTotal;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public String getAvailableFields() {
        return availableFields;
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

    public void setKpiProjectTaskOpenedValue(int kpiProjectTaskOpenedValue) {
        this.kpiProjectTaskOpenedValue = kpiProjectTaskOpenedValue;
    }

    public void setIsKpiResUsersConnected(boolean isKpiResUsersConnected) {
        this.isKpiResUsersConnected = isKpiResUsersConnected;
    }

    public void setKpiCrmLeadCreatedValue(int kpiCrmLeadCreatedValue) {
        this.kpiCrmLeadCreatedValue = kpiCrmLeadCreatedValue;
    }

    public void setNextRunDate(Object nextRunDate) {
        this.nextRunDate = nextRunDate;
    }

    public void setKpiResUsersConnectedValue(int kpiResUsersConnectedValue) {
        this.kpiResUsersConnectedValue = kpiResUsersConnectedValue;
    }

    public void setKpiHrRecruitmentNewColleaguesValue(int kpiHrRecruitmentNewColleaguesValue) {
        this.kpiHrRecruitmentNewColleaguesValue = kpiHrRecruitmentNewColleaguesValue;
    }

    public void setIsKpiAccountTotalRevenue(boolean isKpiAccountTotalRevenue) {
        this.isKpiAccountTotalRevenue = isKpiAccountTotalRevenue;
    }

    public void setIsKpiCrmLeadCreated(boolean isKpiCrmLeadCreated) {
        this.isKpiCrmLeadCreated = isKpiCrmLeadCreated;
    }

    public void setIsKpiProjectTaskOpened(boolean isKpiProjectTaskOpened) {
        this.isKpiProjectTaskOpened = isKpiProjectTaskOpened;
    }

    public void setKpiAllSaleTotalValue(Object kpiAllSaleTotalValue) {
        this.kpiAllSaleTotalValue = kpiAllSaleTotalValue;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKpiMailMessageTotalValue(int kpiMailMessageTotalValue) {
        this.kpiMailMessageTotalValue = kpiMailMessageTotalValue;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsKpiCrmOpportunitiesWon(boolean isKpiCrmOpportunitiesWon) {
        this.isKpiCrmOpportunitiesWon = isKpiCrmOpportunitiesWon;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setIsKpiHrRecruitmentNewColleagues(boolean isKpiHrRecruitmentNewColleagues) {
        this.isKpiHrRecruitmentNewColleagues = isKpiHrRecruitmentNewColleagues;
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

    public void setKpiCrmOpportunitiesWonValue(int kpiCrmOpportunitiesWonValue) {
        this.kpiCrmOpportunitiesWonValue = kpiCrmOpportunitiesWonValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeriodicity(Object periodicity) {
        this.periodicity = periodicity;
    }

    public void setIsIsSubscribed(boolean isIsSubscribed) {
        this.isIsSubscribed = isIsSubscribed;
    }

    public void setKpiAccountTotalRevenueValue(Object kpiAccountTotalRevenueValue) {
        this.kpiAccountTotalRevenueValue = kpiAccountTotalRevenueValue;
    }

    public void setIsKpiAllSaleTotal(boolean isKpiAllSaleTotal) {
        this.isKpiAllSaleTotal = isKpiAllSaleTotal;
    }

    public void setIsKpiMailMessageTotal(boolean isKpiMailMessageTotal) {
        this.isKpiMailMessageTotal = isKpiMailMessageTotal;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setAvailableFields(String availableFields) {
        this.availableFields = availableFields;
    }



}