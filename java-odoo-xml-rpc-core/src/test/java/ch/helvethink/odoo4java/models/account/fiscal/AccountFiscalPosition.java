
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

package ch.helvethink.odoo4java.models.account.fiscal;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.fiscal.position.AccountFiscalPositionAccount;
import ch.helvethink.odoo4java.models.account.fiscal.position.AccountFiscalPositionTax;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResCountry;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.res.country.ResCountryGroup;
import ch.helvethink.odoo4java.models.res.country.ResCountryState;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.fiscal.position")
public class AccountFiscalPosition implements OdooObj {

    
        @JsonProperty("auto_apply")
        private boolean isAutoApply;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("note")
        private Object note;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<AccountFiscalPositionAccount> accountIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.position.AccountFiscalPositionAccount")
        @OdooModel("account.fiscal.position.AccountFiscalPositionAccount")
        @JsonProperty("account_ids")
        private List<Integer> accountIds;
    

    
        private List<AccountFiscalPositionTax> taxIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.position.AccountFiscalPositionTax")
        @OdooModel("account.fiscal.position.AccountFiscalPositionTax")
        @JsonProperty("tax_ids")
        private List<Integer> taxIds;
    

    
        @JsonProperty("foreign_vat")
        private String foreignVat;
    

    
        @JsonProperty("zip_from")
        private String zipFrom;
    

    
        private ResCountry companyCountryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("company_country_id")
        private OdooId companyCountryId;
    

    
        @JsonProperty("states_count")
        private int statesCount;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("fiscal_country_codes")
        private String fiscalCountryCodes;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        @JsonProperty("foreign_vat_header_mode")
        private Object foreignVatHeaderMode;
    

    
        @JsonProperty("tax_map")
        private Object taxMap;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("account_map")
        private Object accountMap;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("vat_required")
        private boolean isVatRequired;
    

    
        private ResCountryGroup countryGroupIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryGroup")
        @OdooModel("res.country.ResCountryGroup")
        @JsonProperty("country_group_id")
        private OdooId countryGroupId;
    

    
        @JsonProperty("zip_to")
        private String zipTo;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private List<ResCountryState> stateIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("state_ids")
        private List<Integer> stateIds;
    

    
        private ResCountry countryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country_id")
        private OdooId countryId;
    


    public AccountFiscalPosition() {
    // Constructor
    }


    public boolean getIsAutoApply() {
        return isAutoApply;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<AccountFiscalPositionAccount> getAccountIdsAsList() {
        return accountIdsAsList;
    }

    public List<Integer> getAccountIds() {
        return accountIds;
    }

    public List<AccountFiscalPositionTax> getTaxIdsAsList() {
        return taxIdsAsList;
    }

    public List<Integer> getTaxIds() {
        return taxIds;
    }

    public String getForeignVat() {
        return foreignVat;
    }

    public String getZipFrom() {
        return zipFrom;
    }

    public ResCountry getCompanyCountryIdAsObject() {
        return companyCountryIdAsObject;
    }

    public OdooId getCompanyCountryId() {
        return companyCountryId;
    }

    public int getStatesCount() {
        return statesCount;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getForeignVatHeaderMode() {
        return foreignVatHeaderMode;
    }

    public Object getTaxMap() {
        return taxMap;
    }

    public boolean getIsActive() {
        return isActive;
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

    public Object getAccountMap() {
        return accountMap;
    }

    public int getSequence() {
        return sequence;
    }

    public boolean getIsVatRequired() {
        return isVatRequired;
    }

    public ResCountryGroup getCountryGroupIdAsObject() {
        return countryGroupIdAsObject;
    }

    public OdooId getCountryGroupId() {
        return countryGroupId;
    }

    public String getZipTo() {
        return zipTo;
    }

    public String getName() {
        return name;
    }

    public List<ResCountryState> getStateIdsAsList() {
        return stateIdsAsList;
    }

    public List<Integer> getStateIds() {
        return stateIds;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }



    public void setIsAutoApply(boolean isAutoApply) {
        this.isAutoApply = isAutoApply;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setAccountIdsAsList(List<AccountFiscalPositionAccount> accountIdsAsList) {
        this.accountIdsAsList = accountIdsAsList;
    }

    public void setAccountIds(List<Integer> accountIds) {
        this.accountIds = accountIds;
    }

    public void setTaxIdsAsList(List<AccountFiscalPositionTax> taxIdsAsList) {
        this.taxIdsAsList = taxIdsAsList;
    }

    public void setTaxIds(List<Integer> taxIds) {
        this.taxIds = taxIds;
    }

    public void setForeignVat(String foreignVat) {
        this.foreignVat = foreignVat;
    }

    public void setZipFrom(String zipFrom) {
        this.zipFrom = zipFrom;
    }

    public void setCompanyCountryIdAsObject(ResCountry companyCountryIdAsObject) {
        this.companyCountryIdAsObject = companyCountryIdAsObject;
    }

    public void setCompanyCountryId(OdooId companyCountryId) {
        this.companyCountryId = companyCountryId;
    }

    public void setStatesCount(int statesCount) {
        this.statesCount = statesCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setForeignVatHeaderMode(Object foreignVatHeaderMode) {
        this.foreignVatHeaderMode = foreignVatHeaderMode;
    }

    public void setTaxMap(Object taxMap) {
        this.taxMap = taxMap;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setAccountMap(Object accountMap) {
        this.accountMap = accountMap;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setIsVatRequired(boolean isVatRequired) {
        this.isVatRequired = isVatRequired;
    }

    public void setCountryGroupIdAsObject(ResCountryGroup countryGroupIdAsObject) {
        this.countryGroupIdAsObject = countryGroupIdAsObject;
    }

    public void setCountryGroupId(OdooId countryGroupId) {
        this.countryGroupId = countryGroupId;
    }

    public void setZipTo(String zipTo) {
        this.zipTo = zipTo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStateIdsAsList(List<ResCountryState> stateIdsAsList) {
        this.stateIdsAsList = stateIdsAsList;
    }

    public void setStateIds(List<Integer> stateIds) {
        this.stateIds = stateIds;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}