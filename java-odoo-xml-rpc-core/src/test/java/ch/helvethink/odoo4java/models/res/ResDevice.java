
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
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("res.device")
public class ResDevice implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("country")
        private String country;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("city")
        private String city;
    

    
        @JsonProperty("device_type")
        private Object deviceType;
    

    
        @JsonProperty("ip_address")
        private String ipAddress;
    

    
        @JsonProperty("revoked")
        private boolean isRevoked;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("platform")
        private String platform;
    

    
        @JsonProperty("first_activity")
        private Date firstActivity;
    

    
        @JsonProperty("last_activity")
        private Date lastActivity;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("browser")
        private String browser;
    

    
        @JsonProperty("session_identifier")
        private String sessionIdentifier;
    

    
        @JsonProperty("linked_ip_addresses")
        private Object linkedIpAddresses;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("is_current")
        private boolean isIsCurrent;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public ResDevice() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public String getCountry() {
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

    public Object getDeviceType() {
        return deviceType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public boolean getIsRevoked() {
        return isRevoked;
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

    public String getPlatform() {
        return platform;
    }

    public Date getFirstActivity() {
        return firstActivity;
    }

    public Date getLastActivity() {
        return lastActivity;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getBrowser() {
        return browser;
    }

    public String getSessionIdentifier() {
        return sessionIdentifier;
    }

    public Object getLinkedIpAddresses() {
        return linkedIpAddresses;
    }

    public int getId() {
        return id;
    }

    public boolean getIsIsCurrent() {
        return isIsCurrent;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setCountry(String country) {
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

    public void setDeviceType(Object deviceType) {
        this.deviceType = deviceType;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setIsRevoked(boolean isRevoked) {
        this.isRevoked = isRevoked;
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

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setFirstActivity(Date firstActivity) {
        this.firstActivity = firstActivity;
    }

    public void setLastActivity(Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setSessionIdentifier(String sessionIdentifier) {
        this.sessionIdentifier = sessionIdentifier;
    }

    public void setLinkedIpAddresses(Object linkedIpAddresses) {
        this.linkedIpAddresses = linkedIpAddresses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsIsCurrent(boolean isIsCurrent) {
        this.isIsCurrent = isIsCurrent;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}