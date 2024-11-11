
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

package ch.helvethink.odoo4java.test.ng.discuss;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.discuss.channel.rtc.DiscussChannelRtcSession;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.discuss.channel.DiscussChannelMember;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("discuss.channel")
public class DiscussChannel implements OdooObj {

    
    private Date writeDate;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private String sfuServerUrl;

    
    private Object description;

    
    private List<HrDepartment> subscriptionDepartmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private List<Integer> subscriptionDepartmentIds;

    
    private List<DiscussChannelRtcSession> rtcSessionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.channel.rtc.DiscussChannelRtcSession")
        @OdooModel("discuss.channel.rtc.DiscussChannelRtcSession")
    
    private List<Integer> rtcSessionIds;

    
    private String uuid;

    
    private String invitationUrl;

    
    private List<ResPartner> channelPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> channelPartnerIds;

    
    private String sfuChannelUuid;

    
    private List<MailMessage> pinnedMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> pinnedMessageIds;

    
    private int messageHasErrorCounter;

    
    private List<DiscussChannelMember> channelMemberIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.channel.DiscussChannelMember")
        @OdooModel("discuss.channel.DiscussChannelMember")
    
    private List<Integer> channelMemberIds;

    
    private boolean isAllowPublicUpload;

    
    private boolean isHasMessage;

    
    private List<ResGroups> groupIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupIds;

    
    private boolean isIsChat;

    
    private int id;

    
    private Object channelType;

    
    private int memberCount;

    
    private Date createDate;

    
    private int messageAttachmentCount;

    
    private boolean isIsMember;

    
    private ResGroups groupPublicIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private OdooId groupPublicId;

    
    private boolean isMessageHasSmsError;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private boolean isIsEditable;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object avatar128;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private boolean isMessageHasError;

    
    private Object defaultDisplayMode;

    
    private boolean isMessageNeedaction;

    
    private int messageNeedactionCounter;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private Object image128;


    public DiscussChannel() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public String getSfuServerUrl() {
        return sfuServerUrl;
    }

    public Object getDescription() {
        return description;
    }

    public List<HrDepartment> getSubscriptionDepartmentIdsAsList() {
        return subscriptionDepartmentIdsAsList;
    }

    public List<Integer> getSubscriptionDepartmentIds() {
        return subscriptionDepartmentIds;
    }

    public List<DiscussChannelRtcSession> getRtcSessionIdsAsList() {
        return rtcSessionIdsAsList;
    }

    public List<Integer> getRtcSessionIds() {
        return rtcSessionIds;
    }

    public String getUuid() {
        return uuid;
    }

    public String getInvitationUrl() {
        return invitationUrl;
    }

    public List<ResPartner> getChannelPartnerIdsAsList() {
        return channelPartnerIdsAsList;
    }

    public List<Integer> getChannelPartnerIds() {
        return channelPartnerIds;
    }

    public String getSfuChannelUuid() {
        return sfuChannelUuid;
    }

    public List<MailMessage> getPinnedMessageIdsAsList() {
        return pinnedMessageIdsAsList;
    }

    public List<Integer> getPinnedMessageIds() {
        return pinnedMessageIds;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public List<DiscussChannelMember> getChannelMemberIdsAsList() {
        return channelMemberIdsAsList;
    }

    public List<Integer> getChannelMemberIds() {
        return channelMemberIds;
    }

    public boolean getIsAllowPublicUpload() {
        return isAllowPublicUpload;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public List<ResGroups> getGroupIdsAsList() {
        return groupIdsAsList;
    }

    public List<Integer> getGroupIds() {
        return groupIds;
    }

    public boolean getIsIsChat() {
        return isIsChat;
    }

    public int getId() {
        return id;
    }

    public Object getChannelType() {
        return channelType;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public boolean getIsIsMember() {
        return isIsMember;
    }

    public ResGroups getGroupPublicIdAsObject() {
        return groupPublicIdAsObject;
    }

    public OdooId getGroupPublicId() {
        return groupPublicId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public boolean getIsIsEditable() {
        return isIsEditable;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public Object getDefaultDisplayMode() {
        return defaultDisplayMode;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getName() {
        return name;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public Object getImage128() {
        return image128;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setSfuServerUrl(String sfuServerUrl) {
        this.sfuServerUrl = sfuServerUrl;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setSubscriptionDepartmentIdsAsList(List<HrDepartment> subscriptionDepartmentIdsAsList) {
        this.subscriptionDepartmentIdsAsList = subscriptionDepartmentIdsAsList;
    }

    public void setSubscriptionDepartmentIds(List<Integer> subscriptionDepartmentIds) {
        this.subscriptionDepartmentIds = subscriptionDepartmentIds;
    }

    public void setRtcSessionIdsAsList(List<DiscussChannelRtcSession> rtcSessionIdsAsList) {
        this.rtcSessionIdsAsList = rtcSessionIdsAsList;
    }

    public void setRtcSessionIds(List<Integer> rtcSessionIds) {
        this.rtcSessionIds = rtcSessionIds;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setInvitationUrl(String invitationUrl) {
        this.invitationUrl = invitationUrl;
    }

    public void setChannelPartnerIdsAsList(List<ResPartner> channelPartnerIdsAsList) {
        this.channelPartnerIdsAsList = channelPartnerIdsAsList;
    }

    public void setChannelPartnerIds(List<Integer> channelPartnerIds) {
        this.channelPartnerIds = channelPartnerIds;
    }

    public void setSfuChannelUuid(String sfuChannelUuid) {
        this.sfuChannelUuid = sfuChannelUuid;
    }

    public void setPinnedMessageIdsAsList(List<MailMessage> pinnedMessageIdsAsList) {
        this.pinnedMessageIdsAsList = pinnedMessageIdsAsList;
    }

    public void setPinnedMessageIds(List<Integer> pinnedMessageIds) {
        this.pinnedMessageIds = pinnedMessageIds;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setChannelMemberIdsAsList(List<DiscussChannelMember> channelMemberIdsAsList) {
        this.channelMemberIdsAsList = channelMemberIdsAsList;
    }

    public void setChannelMemberIds(List<Integer> channelMemberIds) {
        this.channelMemberIds = channelMemberIds;
    }

    public void setIsAllowPublicUpload(boolean isAllowPublicUpload) {
        this.isAllowPublicUpload = isAllowPublicUpload;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setGroupIdsAsList(List<ResGroups> groupIdsAsList) {
        this.groupIdsAsList = groupIdsAsList;
    }

    public void setGroupIds(List<Integer> groupIds) {
        this.groupIds = groupIds;
    }

    public void setIsIsChat(boolean isIsChat) {
        this.isIsChat = isIsChat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChannelType(Object channelType) {
        this.channelType = channelType;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setIsIsMember(boolean isIsMember) {
        this.isIsMember = isIsMember;
    }

    public void setGroupPublicIdAsObject(ResGroups groupPublicIdAsObject) {
        this.groupPublicIdAsObject = groupPublicIdAsObject;
    }

    public void setGroupPublicId(OdooId groupPublicId) {
        this.groupPublicId = groupPublicId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setIsIsEditable(boolean isIsEditable) {
        this.isIsEditable = isIsEditable;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setDefaultDisplayMode(Object defaultDisplayMode) {
        this.defaultDisplayMode = defaultDisplayMode;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }



}