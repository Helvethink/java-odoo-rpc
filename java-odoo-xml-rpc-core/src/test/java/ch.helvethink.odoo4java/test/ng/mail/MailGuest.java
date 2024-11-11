
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

package ch.helvethink.odoo4java.test.ng.mail;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.guest")
public class MailGuest implements OdooObj {

    
    private List<DiscussChannel> channelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private List<Integer> channelIds;

    
    private Date writeDate;

    
    private String imStatus;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private Object avatar1920;

    
    private Object image1024;

    
    private Object timezone;

    
    private Object avatar1024;

    
    private Object image1920;

    
    private Object avatar512;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object avatar128;

    
    private String accessToken;

    
    private Object avatar256;

    
    private String name;

    
    private int id;

    
    private Object lang;

    
    private Date createDate;

    
    private Object image512;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private Object image128;


    public MailGuest() {
    // Constructor
    }


    public List<DiscussChannel> getChannelIdsAsList() {
        return channelIdsAsList;
    }

    public List<Integer> getChannelIds() {
        return channelIds;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public String getImStatus() {
        return imStatus;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getImage256() {
        return image256;
    }

    public Object getAvatar1920() {
        return avatar1920;
    }

    public Object getImage1024() {
        return image1024;
    }

    public Object getTimezone() {
        return timezone;
    }

    public Object getAvatar1024() {
        return avatar1024;
    }

    public Object getImage1920() {
        return image1920;
    }

    public Object getAvatar512() {
        return avatar512;
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

    public Object getAvatar128() {
        return avatar128;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Object getAvatar256() {
        return avatar256;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Object getLang() {
        return lang;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getImage512() {
        return image512;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public Object getImage128() {
        return image128;
    }



    public void setChannelIdsAsList(List<DiscussChannel> channelIdsAsList) {
        this.channelIdsAsList = channelIdsAsList;
    }

    public void setChannelIds(List<Integer> channelIds) {
        this.channelIds = channelIds;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setImStatus(String imStatus) {
        this.imStatus = imStatus;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setAvatar1920(Object avatar1920) {
        this.avatar1920 = avatar1920;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setTimezone(Object timezone) {
        this.timezone = timezone;
    }

    public void setAvatar1024(Object avatar1024) {
        this.avatar1024 = avatar1024;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setAvatar512(Object avatar512) {
        this.avatar512 = avatar512;
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

    public void setAvatar128(Object avatar128) {
        this.avatar128 = avatar128;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setAvatar256(Object avatar256) {
        this.avatar256 = avatar256;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLang(Object lang) {
        this.lang = lang;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }



}