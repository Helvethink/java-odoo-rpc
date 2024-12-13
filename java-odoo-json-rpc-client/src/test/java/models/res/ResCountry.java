
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

package ch.helvethink.odoo4java.models.res;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.res.country.ResCountryGroup;
import ch.helvethink.odoo4java.models.res.country.ResCountryState;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.country")
public class ResCountry implements OdooObj {

    
        @JsonProperty("address_format")
        private Object addressFormat;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("code")
        private String code;
    

    
        @JsonProperty("image_url")
        private String imageUrl;
    

    
        @JsonProperty("state_required")
        private boolean isStateRequired;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("name_position")
        private Object namePosition;
    

    
        @JsonProperty("zip_required")
        private boolean isZipRequired;
    

    
        @JsonProperty("vat_label")
        private String vatLabel;
    

    
        private List<ResCountryGroup> countryGroupIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryGroup")
        @OdooModel("res.country.ResCountryGroup")
        @JsonProperty("country_group_ids")
        private List<Integer> countryGroupIds;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private List<ResCountryState> stateIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("state_ids")
        private List<Integer> stateIds;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("is_stripe_supported_country")
        private boolean isIsStripeSupportedCountry;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("phone_code")
        private int phoneCode;
    


    public ResCountry() {
    // Constructor
    }


    public Object getAddressFormat() {
        return addressFormat;
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

    public String getCode() {
        return code;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean getIsStateRequired() {
        return isStateRequired;
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

    public Object getNamePosition() {
        return namePosition;
    }

    public boolean getIsZipRequired() {
        return isZipRequired;
    }

    public String getVatLabel() {
        return vatLabel;
    }

    public List<ResCountryGroup> getCountryGroupIdsAsList() {
        return countryGroupIdsAsList;
    }

    public List<Integer> getCountryGroupIds() {
        return countryGroupIds;
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

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsIsStripeSupportedCountry() {
        return isIsStripeSupportedCountry;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public int getPhoneCode() {
        return phoneCode;
    }



    public void setAddressFormat(Object addressFormat) {
        this.addressFormat = addressFormat;
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setIsStateRequired(boolean isStateRequired) {
        this.isStateRequired = isStateRequired;
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

    public void setNamePosition(Object namePosition) {
        this.namePosition = namePosition;
    }

    public void setIsZipRequired(boolean isZipRequired) {
        this.isZipRequired = isZipRequired;
    }

    public void setVatLabel(String vatLabel) {
        this.vatLabel = vatLabel;
    }

    public void setCountryGroupIdsAsList(List<ResCountryGroup> countryGroupIdsAsList) {
        this.countryGroupIdsAsList = countryGroupIdsAsList;
    }

    public void setCountryGroupIds(List<Integer> countryGroupIds) {
        this.countryGroupIds = countryGroupIds;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsIsStripeSupportedCountry(boolean isIsStripeSupportedCountry) {
        this.isIsStripeSupportedCountry = isIsStripeSupportedCountry;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }



}