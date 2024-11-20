
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

package ch.helvethink.odoo4java.models.res.users.settings;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.res.ResPartner;
import ch.helvethink.odoo4java.models.res.ResUsers;
import ch.helvethink.odoo4java.models.res.users.ResUsersSettings;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("res.users.settings.volumes")
public class ResUsersSettingsVolumes implements OdooObj {

    
        @JsonProperty("volume")
        private double volume;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        private ResPartner guestIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("guest_id")
        private OdooId guestId;
    

    
        private ResUsersSettings userSettingIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.users.ResUsersSettings")
        @OdooModel("res.users.ResUsersSettings")
        @JsonProperty("user_setting_id")
        private OdooId userSettingId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public ResUsersSettingsVolumes() {
    // Constructor
    }


    public double getVolume() {
        return volume;
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

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public ResPartner getGuestIdAsObject() {
        return guestIdAsObject;
    }

    public OdooId getGuestId() {
        return guestId;
    }

    public ResUsersSettings getUserSettingIdAsObject() {
        return userSettingIdAsObject;
    }

    public OdooId getUserSettingId() {
        return userSettingId;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }



    public void setVolume(double volume) {
        this.volume = volume;
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

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setGuestIdAsObject(ResPartner guestIdAsObject) {
        this.guestIdAsObject = guestIdAsObject;
    }

    public void setGuestId(OdooId guestId) {
        this.guestId = guestId;
    }

    public void setUserSettingIdAsObject(ResUsersSettings userSettingIdAsObject) {
        this.userSettingIdAsObject = userSettingIdAsObject;
    }

    public void setUserSettingId(OdooId userSettingId) {
        this.userSettingId = userSettingId;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}