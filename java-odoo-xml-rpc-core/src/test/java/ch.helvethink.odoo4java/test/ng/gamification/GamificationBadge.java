
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

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.gamification.goal.GamificationGoalDefinition;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationChallenge;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser;;

@OdooObject("gamification.badge")
public class GamificationBadge implements OdooObj {

    
    private Date writeDate;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isIsPublished;

    
    private int messageHasErrorCounter;

    
    private boolean isCanPublish;

    
    private boolean isHasMessage;

    
    private int grantedUsersCount;

    
    private int id;

    
    private int statMy;

    
    private Date createDate;

    
    private Object image512;

    
    private int grantedCount;

    
    private int remainingSending;

    
    private int messageAttachmentCount;

    
    private Object level;

    
    private boolean isRuleMax;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private Object image1920;

    
    private int statMyThisMonth;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<ResUsers> ruleAuthUserIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> ruleAuthUserIds;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private int grantedEmployeesCount;

    
    private List<GamificationGoalDefinition> goalDefinitionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.goal.GamificationGoalDefinition")
        @OdooModel("gamification.goal.GamificationGoalDefinition")
    
    private List<Integer> goalDefinitionIds;

    
    private List<GamificationBadgeUser> ownerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser")
        @OdooModel("gamification.badge.GamificationBadgeUser")
    
    private List<Integer> ownerIds;

    
    private List<GamificationChallenge> challengeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationChallenge")
        @OdooModel("gamification.GamificationChallenge")
    
    private List<Integer> challengeIds;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private List<ResUsers> uniqueOwnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> uniqueOwnerIds;

    
    private Object description;

    
    private Object ruleAuth;

    
    private int statThisMonth;

    
    private List<GamificationBadge> ruleAuthBadgeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationBadge")
        @OdooModel("gamification.GamificationBadge")
    
    private List<Integer> ruleAuthBadgeIds;

    
    private Object image1024;

    
    private boolean isMessageHasSmsError;

    
    private boolean isWebsitePublished;

    
    private int ruleMaxNumber;

    
    private boolean isMessageHasError;

    
    private String websiteUrl;

    
    private boolean isMessageNeedaction;

    
    private int messageNeedactionCounter;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private Object image128;

    
    private int statMyMonthlySending;


    public GamificationBadge() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsCanPublish() {
        return isCanPublish;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public int getGrantedUsersCount() {
        return grantedUsersCount;
    }

    public int getId() {
        return id;
    }

    public int getStatMy() {
        return statMy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getImage512() {
        return image512;
    }

    public int getGrantedCount() {
        return grantedCount;
    }

    public int getRemainingSending() {
        return remainingSending;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public Object getLevel() {
        return level;
    }

    public boolean getIsRuleMax() {
        return isRuleMax;
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

    public Object getImage1920() {
        return image1920;
    }

    public int getStatMyThisMonth() {
        return statMyThisMonth;
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

    public List<ResUsers> getRuleAuthUserIdsAsList() {
        return ruleAuthUserIdsAsList;
    }

    public List<Integer> getRuleAuthUserIds() {
        return ruleAuthUserIds;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
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

    public int getGrantedEmployeesCount() {
        return grantedEmployeesCount;
    }

    public List<GamificationGoalDefinition> getGoalDefinitionIdsAsList() {
        return goalDefinitionIdsAsList;
    }

    public List<Integer> getGoalDefinitionIds() {
        return goalDefinitionIds;
    }

    public List<GamificationBadgeUser> getOwnerIdsAsList() {
        return ownerIdsAsList;
    }

    public List<Integer> getOwnerIds() {
        return ownerIds;
    }

    public List<GamificationChallenge> getChallengeIdsAsList() {
        return challengeIdsAsList;
    }

    public List<Integer> getChallengeIds() {
        return challengeIds;
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

    public Object getImage256() {
        return image256;
    }

    public List<ResUsers> getUniqueOwnerIdsAsList() {
        return uniqueOwnerIdsAsList;
    }

    public List<Integer> getUniqueOwnerIds() {
        return uniqueOwnerIds;
    }

    public Object getDescription() {
        return description;
    }

    public Object getRuleAuth() {
        return ruleAuth;
    }

    public int getStatThisMonth() {
        return statThisMonth;
    }

    public List<GamificationBadge> getRuleAuthBadgeIdsAsList() {
        return ruleAuthBadgeIdsAsList;
    }

    public List<Integer> getRuleAuthBadgeIds() {
        return ruleAuthBadgeIds;
    }

    public Object getImage1024() {
        return image1024;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
    }

    public int getRuleMaxNumber() {
        return ruleMaxNumber;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
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

    public int getStatMyMonthlySending() {
        return statMyMonthlySending;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsCanPublish(boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setGrantedUsersCount(int grantedUsersCount) {
        this.grantedUsersCount = grantedUsersCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatMy(int statMy) {
        this.statMy = statMy;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setGrantedCount(int grantedCount) {
        this.grantedCount = grantedCount;
    }

    public void setRemainingSending(int remainingSending) {
        this.remainingSending = remainingSending;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setLevel(Object level) {
        this.level = level;
    }

    public void setIsRuleMax(boolean isRuleMax) {
        this.isRuleMax = isRuleMax;
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

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setStatMyThisMonth(int statMyThisMonth) {
        this.statMyThisMonth = statMyThisMonth;
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

    public void setRuleAuthUserIdsAsList(List<ResUsers> ruleAuthUserIdsAsList) {
        this.ruleAuthUserIdsAsList = ruleAuthUserIdsAsList;
    }

    public void setRuleAuthUserIds(List<Integer> ruleAuthUserIds) {
        this.ruleAuthUserIds = ruleAuthUserIds;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
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

    public void setGrantedEmployeesCount(int grantedEmployeesCount) {
        this.grantedEmployeesCount = grantedEmployeesCount;
    }

    public void setGoalDefinitionIdsAsList(List<GamificationGoalDefinition> goalDefinitionIdsAsList) {
        this.goalDefinitionIdsAsList = goalDefinitionIdsAsList;
    }

    public void setGoalDefinitionIds(List<Integer> goalDefinitionIds) {
        this.goalDefinitionIds = goalDefinitionIds;
    }

    public void setOwnerIdsAsList(List<GamificationBadgeUser> ownerIdsAsList) {
        this.ownerIdsAsList = ownerIdsAsList;
    }

    public void setOwnerIds(List<Integer> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public void setChallengeIdsAsList(List<GamificationChallenge> challengeIdsAsList) {
        this.challengeIdsAsList = challengeIdsAsList;
    }

    public void setChallengeIds(List<Integer> challengeIds) {
        this.challengeIds = challengeIds;
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

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setUniqueOwnerIdsAsList(List<ResUsers> uniqueOwnerIdsAsList) {
        this.uniqueOwnerIdsAsList = uniqueOwnerIdsAsList;
    }

    public void setUniqueOwnerIds(List<Integer> uniqueOwnerIds) {
        this.uniqueOwnerIds = uniqueOwnerIds;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setRuleAuth(Object ruleAuth) {
        this.ruleAuth = ruleAuth;
    }

    public void setStatThisMonth(int statThisMonth) {
        this.statThisMonth = statThisMonth;
    }

    public void setRuleAuthBadgeIdsAsList(List<GamificationBadge> ruleAuthBadgeIdsAsList) {
        this.ruleAuthBadgeIdsAsList = ruleAuthBadgeIdsAsList;
    }

    public void setRuleAuthBadgeIds(List<Integer> ruleAuthBadgeIds) {
        this.ruleAuthBadgeIds = ruleAuthBadgeIds;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
    }

    public void setRuleMaxNumber(int ruleMaxNumber) {
        this.ruleMaxNumber = ruleMaxNumber;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
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

    public void setStatMyMonthlySending(int statMyMonthlySending) {
        this.statMyMonthlySending = statMyMonthlySending;
    }



}