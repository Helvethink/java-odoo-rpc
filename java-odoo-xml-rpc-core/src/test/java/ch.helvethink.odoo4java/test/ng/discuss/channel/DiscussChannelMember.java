
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

package ch.helvethink.odoo4java.test.ng.discuss.channel;

import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.discuss.channel.rtc.DiscussChannelRtcSession;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.mail.MailGuest;;

@OdooObject("discuss.channel.member")
public class DiscussChannelMember implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String customChannelName;

    
    private Date lastInterestDt;

    
    private MailMessage fetchedMessageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId fetchedMessageId;

    
    private Date muteUntilDt;

    
    private List<DiscussChannelRtcSession> rtcSessionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.channel.rtc.DiscussChannelRtcSession")
        @OdooModel("discuss.channel.rtc.DiscussChannelRtcSession")
    
    private List<Integer> rtcSessionIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isIsPinned;

    
    private int messageUnreadCounter;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private DiscussChannelRtcSession rtcInvitingSessionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.channel.rtc.DiscussChannelRtcSession")
        @OdooModel("discuss.channel.rtc.DiscussChannelRtcSession")
    
    private OdooId rtcInvitingSessionId;

    
    private MailGuest guestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailGuest")
        @OdooModel("mail.MailGuest")
    
    private OdooId guestId;

    
    private boolean isIsMinimized;

    
    private Object foldState;

    
    private MailMessage seenMessageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId seenMessageId;

    
    private Date lastSeenDt;

    
    private int id;

    
    private Date createDate;

    
    private boolean isIsSelf;

    
    private DiscussChannel channelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private OdooId channelId;

    
    private Object customNotifications;


    public DiscussChannelMember() {
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

    public String getCustomChannelName() {
        return customChannelName;
    }

    public Date getLastInterestDt() {
        return lastInterestDt;
    }

    public MailMessage getFetchedMessageIdAsObject() {
        return fetchedMessageIdAsObject;
    }

    public OdooId getFetchedMessageId() {
        return fetchedMessageId;
    }

    public Date getMuteUntilDt() {
        return muteUntilDt;
    }

    public List<DiscussChannelRtcSession> getRtcSessionIdsAsList() {
        return rtcSessionIdsAsList;
    }

    public List<Integer> getRtcSessionIds() {
        return rtcSessionIds;
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

    public boolean getIsIsPinned() {
        return isIsPinned;
    }

    public int getMessageUnreadCounter() {
        return messageUnreadCounter;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public DiscussChannelRtcSession getRtcInvitingSessionIdAsObject() {
        return rtcInvitingSessionIdAsObject;
    }

    public OdooId getRtcInvitingSessionId() {
        return rtcInvitingSessionId;
    }

    public MailGuest getGuestIdAsObject() {
        return guestIdAsObject;
    }

    public OdooId getGuestId() {
        return guestId;
    }

    public boolean getIsIsMinimized() {
        return isIsMinimized;
    }

    public Object getFoldState() {
        return foldState;
    }

    public MailMessage getSeenMessageIdAsObject() {
        return seenMessageIdAsObject;
    }

    public OdooId getSeenMessageId() {
        return seenMessageId;
    }

    public Date getLastSeenDt() {
        return lastSeenDt;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsIsSelf() {
        return isIsSelf;
    }

    public DiscussChannel getChannelIdAsObject() {
        return channelIdAsObject;
    }

    public OdooId getChannelId() {
        return channelId;
    }

    public Object getCustomNotifications() {
        return customNotifications;
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

    public void setCustomChannelName(String customChannelName) {
        this.customChannelName = customChannelName;
    }

    public void setLastInterestDt(Date lastInterestDt) {
        this.lastInterestDt = lastInterestDt;
    }

    public void setFetchedMessageIdAsObject(MailMessage fetchedMessageIdAsObject) {
        this.fetchedMessageIdAsObject = fetchedMessageIdAsObject;
    }

    public void setFetchedMessageId(OdooId fetchedMessageId) {
        this.fetchedMessageId = fetchedMessageId;
    }

    public void setMuteUntilDt(Date muteUntilDt) {
        this.muteUntilDt = muteUntilDt;
    }

    public void setRtcSessionIdsAsList(List<DiscussChannelRtcSession> rtcSessionIdsAsList) {
        this.rtcSessionIdsAsList = rtcSessionIdsAsList;
    }

    public void setRtcSessionIds(List<Integer> rtcSessionIds) {
        this.rtcSessionIds = rtcSessionIds;
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

    public void setIsIsPinned(boolean isIsPinned) {
        this.isIsPinned = isIsPinned;
    }

    public void setMessageUnreadCounter(int messageUnreadCounter) {
        this.messageUnreadCounter = messageUnreadCounter;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setRtcInvitingSessionIdAsObject(DiscussChannelRtcSession rtcInvitingSessionIdAsObject) {
        this.rtcInvitingSessionIdAsObject = rtcInvitingSessionIdAsObject;
    }

    public void setRtcInvitingSessionId(OdooId rtcInvitingSessionId) {
        this.rtcInvitingSessionId = rtcInvitingSessionId;
    }

    public void setGuestIdAsObject(MailGuest guestIdAsObject) {
        this.guestIdAsObject = guestIdAsObject;
    }

    public void setGuestId(OdooId guestId) {
        this.guestId = guestId;
    }

    public void setIsIsMinimized(boolean isIsMinimized) {
        this.isIsMinimized = isIsMinimized;
    }

    public void setFoldState(Object foldState) {
        this.foldState = foldState;
    }

    public void setSeenMessageIdAsObject(MailMessage seenMessageIdAsObject) {
        this.seenMessageIdAsObject = seenMessageIdAsObject;
    }

    public void setSeenMessageId(OdooId seenMessageId) {
        this.seenMessageId = seenMessageId;
    }

    public void setLastSeenDt(Date lastSeenDt) {
        this.lastSeenDt = lastSeenDt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsIsSelf(boolean isIsSelf) {
        this.isIsSelf = isIsSelf;
    }

    public void setChannelIdAsObject(DiscussChannel channelIdAsObject) {
        this.channelIdAsObject = channelIdAsObject;
    }

    public void setChannelId(OdooId channelId) {
        this.channelId = channelId;
    }

    public void setCustomNotifications(Object customNotifications) {
        this.customNotifications = customNotifications;
    }



}