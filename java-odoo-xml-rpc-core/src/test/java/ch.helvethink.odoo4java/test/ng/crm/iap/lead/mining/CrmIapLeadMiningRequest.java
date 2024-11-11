
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

package ch.helvethink.odoo4java.test.ng.crm.iap.lead.mining;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadSeniority;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadIndustry;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadRole;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.crm.CrmTag;;

@OdooObject("crm.iap.lead.mining.request")
public class CrmIapLeadMiningRequest implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private List<ResCountryState> availableStateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private List<Integer> availableStateIds;

    
    private List<ResCountry> countryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private List<Integer> countryIds;

    
    private String leadTotalCredits;

    
    private List<CrmIapLeadRole> roleIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadRole")
        @OdooModel("crm.iap.lead.CrmIapLeadRole")
    
    private List<Integer> roleIds;

    
    private int companySizeMax;

    
    private Object errorType;

    
    private Object state;

    
    private int id;

    
    private String displayLeadLabel;

    
    private Date createDate;

    
    private List<CrmLead> leadIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> leadIds;

    
    private Object contactFilterType;

    
    private List<CrmTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTag")
        @OdooModel("crm.CrmTag")
    
    private List<Integer> tagIds;

    
    private String leadContactsCredits;

    
    private CrmIapLeadSeniority seniorityIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadSeniority")
        @OdooModel("crm.iap.lead.CrmIapLeadSeniority")
    
    private OdooId seniorityId;

    
    private List<CrmIapLeadIndustry> industryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadIndustry")
        @OdooModel("crm.iap.lead.CrmIapLeadIndustry")
    
    private List<Integer> industryIds;

    
    private int companySizeMin;

    
    private int leadCount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int leadNumber;

    
    private Object searchType;

    
    private String leadCredits;

    
    private int contactNumber;

    
    private boolean isFilterOnSize;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private CrmIapLeadRole preferredRoleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.iap.lead.CrmIapLeadRole")
        @OdooModel("crm.iap.lead.CrmIapLeadRole")
    
    private OdooId preferredRoleId;

    
    private String name;

    
    private Object leadType;

    
    private List<ResCountryState> stateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private List<Integer> stateIds;


    public CrmIapLeadMiningRequest() {
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

    public CrmTeam getTeamIdAsObject() {
        return teamIdAsObject;
    }

    public OdooId getTeamId() {
        return teamId;
    }

    public List<ResCountryState> getAvailableStateIdsAsList() {
        return availableStateIdsAsList;
    }

    public List<Integer> getAvailableStateIds() {
        return availableStateIds;
    }

    public List<ResCountry> getCountryIdsAsList() {
        return countryIdsAsList;
    }

    public List<Integer> getCountryIds() {
        return countryIds;
    }

    public String getLeadTotalCredits() {
        return leadTotalCredits;
    }

    public List<CrmIapLeadRole> getRoleIdsAsList() {
        return roleIdsAsList;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public int getCompanySizeMax() {
        return companySizeMax;
    }

    public Object getErrorType() {
        return errorType;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public String getDisplayLeadLabel() {
        return displayLeadLabel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<CrmLead> getLeadIdsAsList() {
        return leadIdsAsList;
    }

    public List<Integer> getLeadIds() {
        return leadIds;
    }

    public Object getContactFilterType() {
        return contactFilterType;
    }

    public List<CrmTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public String getLeadContactsCredits() {
        return leadContactsCredits;
    }

    public CrmIapLeadSeniority getSeniorityIdAsObject() {
        return seniorityIdAsObject;
    }

    public OdooId getSeniorityId() {
        return seniorityId;
    }

    public List<CrmIapLeadIndustry> getIndustryIdsAsList() {
        return industryIdsAsList;
    }

    public List<Integer> getIndustryIds() {
        return industryIds;
    }

    public int getCompanySizeMin() {
        return companySizeMin;
    }

    public int getLeadCount() {
        return leadCount;
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

    public int getLeadNumber() {
        return leadNumber;
    }

    public Object getSearchType() {
        return searchType;
    }

    public String getLeadCredits() {
        return leadCredits;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public boolean getIsFilterOnSize() {
        return isFilterOnSize;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public CrmIapLeadRole getPreferredRoleIdAsObject() {
        return preferredRoleIdAsObject;
    }

    public OdooId getPreferredRoleId() {
        return preferredRoleId;
    }

    public String getName() {
        return name;
    }

    public Object getLeadType() {
        return leadType;
    }

    public List<ResCountryState> getStateIdsAsList() {
        return stateIdsAsList;
    }

    public List<Integer> getStateIds() {
        return stateIds;
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

    public void setTeamIdAsObject(CrmTeam teamIdAsObject) {
        this.teamIdAsObject = teamIdAsObject;
    }

    public void setTeamId(OdooId teamId) {
        this.teamId = teamId;
    }

    public void setAvailableStateIdsAsList(List<ResCountryState> availableStateIdsAsList) {
        this.availableStateIdsAsList = availableStateIdsAsList;
    }

    public void setAvailableStateIds(List<Integer> availableStateIds) {
        this.availableStateIds = availableStateIds;
    }

    public void setCountryIdsAsList(List<ResCountry> countryIdsAsList) {
        this.countryIdsAsList = countryIdsAsList;
    }

    public void setCountryIds(List<Integer> countryIds) {
        this.countryIds = countryIds;
    }

    public void setLeadTotalCredits(String leadTotalCredits) {
        this.leadTotalCredits = leadTotalCredits;
    }

    public void setRoleIdsAsList(List<CrmIapLeadRole> roleIdsAsList) {
        this.roleIdsAsList = roleIdsAsList;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public void setCompanySizeMax(int companySizeMax) {
        this.companySizeMax = companySizeMax;
    }

    public void setErrorType(Object errorType) {
        this.errorType = errorType;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayLeadLabel(String displayLeadLabel) {
        this.displayLeadLabel = displayLeadLabel;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLeadIdsAsList(List<CrmLead> leadIdsAsList) {
        this.leadIdsAsList = leadIdsAsList;
    }

    public void setLeadIds(List<Integer> leadIds) {
        this.leadIds = leadIds;
    }

    public void setContactFilterType(Object contactFilterType) {
        this.contactFilterType = contactFilterType;
    }

    public void setTagIdsAsList(List<CrmTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setLeadContactsCredits(String leadContactsCredits) {
        this.leadContactsCredits = leadContactsCredits;
    }

    public void setSeniorityIdAsObject(CrmIapLeadSeniority seniorityIdAsObject) {
        this.seniorityIdAsObject = seniorityIdAsObject;
    }

    public void setSeniorityId(OdooId seniorityId) {
        this.seniorityId = seniorityId;
    }

    public void setIndustryIdsAsList(List<CrmIapLeadIndustry> industryIdsAsList) {
        this.industryIdsAsList = industryIdsAsList;
    }

    public void setIndustryIds(List<Integer> industryIds) {
        this.industryIds = industryIds;
    }

    public void setCompanySizeMin(int companySizeMin) {
        this.companySizeMin = companySizeMin;
    }

    public void setLeadCount(int leadCount) {
        this.leadCount = leadCount;
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

    public void setLeadNumber(int leadNumber) {
        this.leadNumber = leadNumber;
    }

    public void setSearchType(Object searchType) {
        this.searchType = searchType;
    }

    public void setLeadCredits(String leadCredits) {
        this.leadCredits = leadCredits;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setIsFilterOnSize(boolean isFilterOnSize) {
        this.isFilterOnSize = isFilterOnSize;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setPreferredRoleIdAsObject(CrmIapLeadRole preferredRoleIdAsObject) {
        this.preferredRoleIdAsObject = preferredRoleIdAsObject;
    }

    public void setPreferredRoleId(OdooId preferredRoleId) {
        this.preferredRoleId = preferredRoleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeadType(Object leadType) {
        this.leadType = leadType;
    }

    public void setStateIdsAsList(List<ResCountryState> stateIdsAsList) {
        this.stateIdsAsList = stateIdsAsList;
    }

    public void setStateIds(List<Integer> stateIds) {
        this.stateIds = stateIds;
    }



}