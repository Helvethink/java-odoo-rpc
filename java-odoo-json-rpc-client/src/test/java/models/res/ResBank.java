
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
import ch.helvethink.odoo4java.models.res.country.ResCountryState;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("res.bank")
public class ResBank implements OdooObj {

    
        @JsonProperty("zip")
        private String zip;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResCountry countryAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("country")
        private OdooId country;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("city")
        private String city;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("phone")
        private String phone;
    

    
        @JsonProperty("street")
        private String street;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("street2")
        private String street2;
    

    
        private ResCountryState stateAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
        @JsonProperty("state")
        private OdooId state;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("bic")
        private String bic;
    

    
        @JsonProperty("email")
        private String email;
    


    public ResBank() {
    // Constructor
    }


    public String getZip() {
        return zip;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public ResCountry getCountryAsObject() {
        return countryAsObject;
    }

    public OdooId getCountry() {
        return country;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getCity() {
        return city;
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

    public String getCountryCode() {
        return countryCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getStreet() {
        return street;
    }

    public String getName() {
        return name;
    }

    public String getStreet2() {
        return street2;
    }

    public ResCountryState getStateAsObject() {
        return stateAsObject;
    }

    public OdooId getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getBic() {
        return bic;
    }

    public String getEmail() {
        return email;
    }



    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setCountryAsObject(ResCountry countryAsObject) {
        this.countryAsObject = countryAsObject;
    }

    public void setCountry(OdooId country) {
        this.country = country;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCity(String city) {
        this.city = city;
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

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setStateAsObject(ResCountryState stateAsObject) {
        this.stateAsObject = stateAsObject;
    }

    public void setState(OdooId state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}