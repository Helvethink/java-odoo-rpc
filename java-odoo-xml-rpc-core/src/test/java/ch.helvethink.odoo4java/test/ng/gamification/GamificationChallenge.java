
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

package ch.helvethink.odoo4java.test.ng.gamification;

import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.gamification.challenge.GamificationChallengeLine;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("gamification.challenge")
public class GamificationChallenge implements OdooObj {

    
    private Object endDate;

    
    private DiscussChannel reportMessageGroupIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private OdooId reportMessageGroupId;

    
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

    
    private Object visibilityMode;

    
    private Object description;

    
    private GamificationBadge rewardFirstIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge")
        @OdooModel("gamification.GamificationBadge")
    
    private OdooId rewardFirstId;

    
    private Object nextReportDate;

    
    private GamificationBadge rewardSecondIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge")
        @OdooModel("gamification.GamificationBadge")
    
    private OdooId rewardSecondId;

    
    private MailTemplate reportTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId reportTemplateId;

    
    private List<ResUsers> invitedUserIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> invitedUserIds;

    
    private GamificationBadge rewardThirdIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge")
        @OdooModel("gamification.GamificationBadge")
    
    private OdooId rewardThirdId;

    
    private Object lastReportDate;

    
    private int messageHasErrorCounter;

    
    private ResUsers managerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId managerId;

    
    private String userDomain;

    
    private boolean isHasMessage;

    
    private boolean isRewardFailure;

    
    private Object reportMessageFrequency;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private Object startDate;

    
    private boolean isRewardRealtime;

    
    private int remindUpdateDelay;

    
    private int messageAttachmentCount;

    
    private Object period;

    
    private Object challengeCategory;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private boolean isMessageHasSmsError;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private boolean isMessageHasError;

    
    private List<GamificationChallengeLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.challenge.GamificationChallengeLine")
        @OdooModel("gamification.challenge.GamificationChallengeLine")
    
    private List<Integer> lineIds;

    
    private int userCount;

    
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

    
    private GamificationBadge rewardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge")
        @OdooModel("gamification.GamificationBadge")
    
    private OdooId rewardId;


    public GamificationChallenge() {
    // Constructor
    }


    public Object getEndDate() {
        return endDate;
    }

    public DiscussChannel getReportMessageGroupIdAsObject() {
        return reportMessageGroupIdAsObject;
    }

    public OdooId getReportMessageGroupId() {
        return reportMessageGroupId;
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

    public Object getVisibilityMode() {
        return visibilityMode;
    }

    public Object getDescription() {
        return description;
    }

    public GamificationBadge getRewardFirstIdAsObject() {
        return rewardFirstIdAsObject;
    }

    public OdooId getRewardFirstId() {
        return rewardFirstId;
    }

    public Object getNextReportDate() {
        return nextReportDate;
    }

    public GamificationBadge getRewardSecondIdAsObject() {
        return rewardSecondIdAsObject;
    }

    public OdooId getRewardSecondId() {
        return rewardSecondId;
    }

    public MailTemplate getReportTemplateIdAsObject() {
        return reportTemplateIdAsObject;
    }

    public OdooId getReportTemplateId() {
        return reportTemplateId;
    }

    public List<ResUsers> getInvitedUserIdsAsList() {
        return invitedUserIdsAsList;
    }

    public List<Integer> getInvitedUserIds() {
        return invitedUserIds;
    }

    public GamificationBadge getRewardThirdIdAsObject() {
        return rewardThirdIdAsObject;
    }

    public OdooId getRewardThirdId() {
        return rewardThirdId;
    }

    public Object getLastReportDate() {
        return lastReportDate;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public ResUsers getManagerIdAsObject() {
        return managerIdAsObject;
    }

    public OdooId getManagerId() {
        return managerId;
    }

    public String getUserDomain() {
        return userDomain;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public boolean getIsRewardFailure() {
        return isRewardFailure;
    }

    public Object getReportMessageFrequency() {
        return reportMessageFrequency;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getStartDate() {
        return startDate;
    }

    public boolean getIsRewardRealtime() {
        return isRewardRealtime;
    }

    public int getRemindUpdateDelay() {
        return remindUpdateDelay;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public Object getPeriod() {
        return period;
    }

    public Object getChallengeCategory() {
        return challengeCategory;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public List<GamificationChallengeLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public int getUserCount() {
        return userCount;
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

    public GamificationBadge getRewardIdAsObject() {
        return rewardIdAsObject;
    }

    public OdooId getRewardId() {
        return rewardId;
    }



    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public void setReportMessageGroupIdAsObject(DiscussChannel reportMessageGroupIdAsObject) {
        this.reportMessageGroupIdAsObject = reportMessageGroupIdAsObject;
    }

    public void setReportMessageGroupId(OdooId reportMessageGroupId) {
        this.reportMessageGroupId = reportMessageGroupId;
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

    public void setVisibilityMode(Object visibilityMode) {
        this.visibilityMode = visibilityMode;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setRewardFirstIdAsObject(GamificationBadge rewardFirstIdAsObject) {
        this.rewardFirstIdAsObject = rewardFirstIdAsObject;
    }

    public void setRewardFirstId(OdooId rewardFirstId) {
        this.rewardFirstId = rewardFirstId;
    }

    public void setNextReportDate(Object nextReportDate) {
        this.nextReportDate = nextReportDate;
    }

    public void setRewardSecondIdAsObject(GamificationBadge rewardSecondIdAsObject) {
        this.rewardSecondIdAsObject = rewardSecondIdAsObject;
    }

    public void setRewardSecondId(OdooId rewardSecondId) {
        this.rewardSecondId = rewardSecondId;
    }

    public void setReportTemplateIdAsObject(MailTemplate reportTemplateIdAsObject) {
        this.reportTemplateIdAsObject = reportTemplateIdAsObject;
    }

    public void setReportTemplateId(OdooId reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
    }

    public void setInvitedUserIdsAsList(List<ResUsers> invitedUserIdsAsList) {
        this.invitedUserIdsAsList = invitedUserIdsAsList;
    }

    public void setInvitedUserIds(List<Integer> invitedUserIds) {
        this.invitedUserIds = invitedUserIds;
    }

    public void setRewardThirdIdAsObject(GamificationBadge rewardThirdIdAsObject) {
        this.rewardThirdIdAsObject = rewardThirdIdAsObject;
    }

    public void setRewardThirdId(OdooId rewardThirdId) {
        this.rewardThirdId = rewardThirdId;
    }

    public void setLastReportDate(Object lastReportDate) {
        this.lastReportDate = lastReportDate;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setManagerIdAsObject(ResUsers managerIdAsObject) {
        this.managerIdAsObject = managerIdAsObject;
    }

    public void setManagerId(OdooId managerId) {
        this.managerId = managerId;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setIsRewardFailure(boolean isRewardFailure) {
        this.isRewardFailure = isRewardFailure;
    }

    public void setReportMessageFrequency(Object reportMessageFrequency) {
        this.reportMessageFrequency = reportMessageFrequency;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public void setIsRewardRealtime(boolean isRewardRealtime) {
        this.isRewardRealtime = isRewardRealtime;
    }

    public void setRemindUpdateDelay(int remindUpdateDelay) {
        this.remindUpdateDelay = remindUpdateDelay;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setPeriod(Object period) {
        this.period = period;
    }

    public void setChallengeCategory(Object challengeCategory) {
        this.challengeCategory = challengeCategory;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setLineIdsAsList(List<GamificationChallengeLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
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

    public void setRewardIdAsObject(GamificationBadge rewardIdAsObject) {
        this.rewardIdAsObject = rewardIdAsObject;
    }

    public void setRewardId(OdooId rewardId) {
        this.rewardId = rewardId;
    }



}