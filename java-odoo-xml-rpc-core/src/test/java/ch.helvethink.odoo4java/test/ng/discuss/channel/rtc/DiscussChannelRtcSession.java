
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

package ch.helvethink.odoo4java.test.ng.discuss.channel.rtc;

import ch.helvethink.odoo4java.test.ng.discuss.channel.DiscussChannelMember;
import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.mail.MailGuest;;

@OdooObject("discuss.channel.rtc.session")
public class DiscussChannelRtcSession implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private DiscussChannelMember channelMemberIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.channel.DiscussChannelMember")
        @OdooModel("discuss.channel.DiscussChannelMember")
    
    private OdooId channelMemberId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isIsMuted;

    
    private boolean isIsScreenSharingOn;

    
    private boolean isIsDeaf;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private boolean isIsCameraOn;

    
    private MailGuest guestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailGuest")
        @OdooModel("mail.MailGuest")
    
    private OdooId guestId;

    
    private int id;

    
    private Date createDate;

    
    private DiscussChannel channelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private OdooId channelId;


    public DiscussChannelRtcSession() {
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

    public DiscussChannelMember getChannelMemberIdAsObject() {
        return channelMemberIdAsObject;
    }

    public OdooId getChannelMemberId() {
        return channelMemberId;
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

    public boolean getIsIsMuted() {
        return isIsMuted;
    }

    public boolean getIsIsScreenSharingOn() {
        return isIsScreenSharingOn;
    }

    public boolean getIsIsDeaf() {
        return isIsDeaf;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public boolean getIsIsCameraOn() {
        return isIsCameraOn;
    }

    public MailGuest getGuestIdAsObject() {
        return guestIdAsObject;
    }

    public OdooId getGuestId() {
        return guestId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public DiscussChannel getChannelIdAsObject() {
        return channelIdAsObject;
    }

    public OdooId getChannelId() {
        return channelId;
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

    public void setChannelMemberIdAsObject(DiscussChannelMember channelMemberIdAsObject) {
        this.channelMemberIdAsObject = channelMemberIdAsObject;
    }

    public void setChannelMemberId(OdooId channelMemberId) {
        this.channelMemberId = channelMemberId;
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

    public void setIsIsMuted(boolean isIsMuted) {
        this.isIsMuted = isIsMuted;
    }

    public void setIsIsScreenSharingOn(boolean isIsScreenSharingOn) {
        this.isIsScreenSharingOn = isIsScreenSharingOn;
    }

    public void setIsIsDeaf(boolean isIsDeaf) {
        this.isIsDeaf = isIsDeaf;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setIsIsCameraOn(boolean isIsCameraOn) {
        this.isIsCameraOn = isIsCameraOn;
    }

    public void setGuestIdAsObject(MailGuest guestIdAsObject) {
        this.guestIdAsObject = guestIdAsObject;
    }

    public void setGuestId(OdooId guestId) {
        this.guestId = guestId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setChannelIdAsObject(DiscussChannel channelIdAsObject) {
        this.channelIdAsObject = channelIdAsObject;
    }

    public void setChannelId(OdooId channelId) {
        this.channelId = channelId;
    }



}