
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

package ch.helvethink.odoo4java.test.ng.slide;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.slide.channel.SlideChannelPartner;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.slide.channel.SlideChannelTag;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.slide.Slide;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlidePartner;;

@OdooObject("slide.channel")
public class SlideChannel implements OdooObj {

    
    private Date writeDate;

    
    private Object promoteStrategy;

    
    private String websiteMetaTitle;

    
    private boolean isIsPublished;

    
    private List<SlideSlidePartner> slidePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlidePartner")
        @OdooModel("slide.slide.SlideSlidePartner")
    
    private List<Integer> slidePartnerIds;

    
    private int totalViews;

    
    private Object ratingAvgText;

    
    private Object activityDateDeadline;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private boolean isCanComment;

    
    private int id;

    
    private double totalTime;

    
    private int messageAttachmentCount;

    
    private List<SlideChannelTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.channel.SlideChannelTag")
        @OdooModel("slide.channel.SlideChannelTag")
    
    private List<Integer> tagIds;

    
    private boolean isIsMember;

    
    private boolean isActive;

    
    private List<ResGroups> enrollGroupIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> enrollGroupIds;

    
    private Object image1920;

    
    private boolean isCompleted;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int karmaSlideVote;

    
    private String accessToken;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private int nbrArticle;

    
    private Slide promotedSlideIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private OdooId promotedSlideId;

    
    private Object ratingLastImage;

    
    private List<SlideChannelPartner> channelPartnerAllIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.channel.SlideChannelPartner")
        @OdooModel("slide.channel.SlideChannelPartner")
    
    private List<Integer> channelPartnerAllIds;

    
    private Object descriptionHtml;

    
    private Object enroll;

    
    private String websiteMetaKeywords;

    
    private boolean isMessageIsFollower;

    
    private boolean isIsMemberInvited;

    
    private int karmaGenChannelFinish;

    
    private int completion;

    
    private double ratingAvgStars;

    
    private MailTemplate completedTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId completedTemplateId;

    
    private List<SlideChannel> prerequisiteOfChannelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> prerequisiteOfChannelIds;

    
    private boolean isMessageHasSmsError;

    
    private boolean isWebsitePublished;

    
    private int nbrQuiz;

    
    private int membersEngagedCount;

    
    private int karmaSlideComment;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private Object descriptionShort;

    
    private boolean isCanReview;

    
    private double ratingPercentageSatisfaction;

    
    private String websiteUrl;

    
    private double ratingLastValue;

    
    private boolean isPrerequisiteUserHasCompleted;

    
    private String websiteMetaOgImg;

    
    private List<SlideChannel> prerequisiteChannelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> prerequisiteChannelIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private int karmaGenChannelRank;

    
    private boolean isIsSeoOptimized;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object coverProperties;

    
    private int membersAllCount;

    
    private boolean isAllowComment;

    
    private List<Slide> slideCategoryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private List<Integer> slideCategoryIds;

    
    private Object enrollMsg;

    
    private List<Slide> slideContentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private List<Integer> slideContentIds;

    
    private boolean isHasRequestedAccess;

    
    private boolean isCanVote;

    
    private Object activityExceptionDecoration;

    
    private int totalSlides;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private boolean isCanPublish;

    
    private int nbrInfographic;

    
    private boolean isHasMessage;

    
    private double ratingAvg;

    
    private Object slideLastUpdate;

    
    private boolean isPartnerHasNewContent;

    
    private Date createDate;

    
    private MailTemplate shareSlideTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId shareSlideTemplateId;

    
    private String websiteDefaultBackgroundImageUrl;

    
    private Object image512;

    
    private List<Slide> slideIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private List<Integer> slideIds;

    
    private Object visibility;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private List<ResGroups> uploadGroupIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> uploadGroupIds;

    
    private int nbrDocument;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private int ratingCount;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private int sequence;

    
    private int totalVotes;

    
    private Object websiteMetaDescription;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private int membersCount;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private int color;

    
    private Object description;

    
    private Object myActivityDateDeadline;

    
    private List<SlideChannelPartner> channelPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.channel.SlideChannelPartner")
        @OdooModel("slide.channel.SlideChannelPartner")
    
    private List<Integer> channelPartnerIds;

    
    private Object ratingLastFeedback;

    
    private int nbrVideo;

    
    private int karmaReview;

    
    private MailTemplate shareChannelTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId shareChannelTemplateId;

    
    private MailTemplate publishTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId publishTemplateId;

    
    private boolean isCanUpload;

    
    private Object channelType;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private String activityTypeIcon;

    
    private Object image1024;

    
    private int membersCompletedCount;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private String seoName;

    
    private Object ratingLastText;

    
    private int membersInvitedCount;

    
    private Object image128;


    public SlideChannel() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getPromoteStrategy() {
        return promoteStrategy;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public List<SlideSlidePartner> getSlidePartnerIdsAsList() {
        return slidePartnerIdsAsList;
    }

    public List<Integer> getSlidePartnerIds() {
        return slidePartnerIds;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public Object getRatingAvgText() {
        return ratingAvgText;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public Object getActivityState() {
        return activityState;
    }

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsCanComment() {
        return isCanComment;
    }

    public int getId() {
        return id;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<SlideChannelTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public boolean getIsIsMember() {
        return isIsMember;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public List<ResGroups> getEnrollGroupIdsAsList() {
        return enrollGroupIdsAsList;
    }

    public List<Integer> getEnrollGroupIds() {
        return enrollGroupIds;
    }

    public Object getImage1920() {
        return image1920;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public int getKarmaSlideVote() {
        return karmaSlideVote;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public int getNbrArticle() {
        return nbrArticle;
    }

    public Slide getPromotedSlideIdAsObject() {
        return promotedSlideIdAsObject;
    }

    public OdooId getPromotedSlideId() {
        return promotedSlideId;
    }

    public Object getRatingLastImage() {
        return ratingLastImage;
    }

    public List<SlideChannelPartner> getChannelPartnerAllIdsAsList() {
        return channelPartnerAllIdsAsList;
    }

    public List<Integer> getChannelPartnerAllIds() {
        return channelPartnerAllIds;
    }

    public Object getDescriptionHtml() {
        return descriptionHtml;
    }

    public Object getEnroll() {
        return enroll;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public boolean getIsIsMemberInvited() {
        return isIsMemberInvited;
    }

    public int getKarmaGenChannelFinish() {
        return karmaGenChannelFinish;
    }

    public int getCompletion() {
        return completion;
    }

    public double getRatingAvgStars() {
        return ratingAvgStars;
    }

    public MailTemplate getCompletedTemplateIdAsObject() {
        return completedTemplateIdAsObject;
    }

    public OdooId getCompletedTemplateId() {
        return completedTemplateId;
    }

    public List<SlideChannel> getPrerequisiteOfChannelIdsAsList() {
        return prerequisiteOfChannelIdsAsList;
    }

    public List<Integer> getPrerequisiteOfChannelIds() {
        return prerequisiteOfChannelIds;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
    }

    public int getNbrQuiz() {
        return nbrQuiz;
    }

    public int getMembersEngagedCount() {
        return membersEngagedCount;
    }

    public int getKarmaSlideComment() {
        return karmaSlideComment;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public Object getDescriptionShort() {
        return descriptionShort;
    }

    public boolean getIsCanReview() {
        return isCanReview;
    }

    public double getRatingPercentageSatisfaction() {
        return ratingPercentageSatisfaction;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public double getRatingLastValue() {
        return ratingLastValue;
    }

    public boolean getIsPrerequisiteUserHasCompleted() {
        return isPrerequisiteUserHasCompleted;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public List<SlideChannel> getPrerequisiteChannelIdsAsList() {
        return prerequisiteChannelIdsAsList;
    }

    public List<Integer> getPrerequisiteChannelIds() {
        return prerequisiteChannelIds;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public int getKarmaGenChannelRank() {
        return karmaGenChannelRank;
    }

    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getCoverProperties() {
        return coverProperties;
    }

    public int getMembersAllCount() {
        return membersAllCount;
    }

    public boolean getIsAllowComment() {
        return isAllowComment;
    }

    public List<Slide> getSlideCategoryIdsAsList() {
        return slideCategoryIdsAsList;
    }

    public List<Integer> getSlideCategoryIds() {
        return slideCategoryIds;
    }

    public Object getEnrollMsg() {
        return enrollMsg;
    }

    public List<Slide> getSlideContentIdsAsList() {
        return slideContentIdsAsList;
    }

    public List<Integer> getSlideContentIds() {
        return slideContentIds;
    }

    public boolean getIsHasRequestedAccess() {
        return isHasRequestedAccess;
    }

    public boolean getIsCanVote() {
        return isCanVote;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public int getTotalSlides() {
        return totalSlides;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public boolean getIsCanPublish() {
        return isCanPublish;
    }

    public int getNbrInfographic() {
        return nbrInfographic;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public double getRatingAvg() {
        return ratingAvg;
    }

    public Object getSlideLastUpdate() {
        return slideLastUpdate;
    }

    public boolean getIsPartnerHasNewContent() {
        return isPartnerHasNewContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public MailTemplate getShareSlideTemplateIdAsObject() {
        return shareSlideTemplateIdAsObject;
    }

    public OdooId getShareSlideTemplateId() {
        return shareSlideTemplateId;
    }

    public String getWebsiteDefaultBackgroundImageUrl() {
        return websiteDefaultBackgroundImageUrl;
    }

    public Object getImage512() {
        return image512;
    }

    public List<Slide> getSlideIdsAsList() {
        return slideIdsAsList;
    }

    public List<Integer> getSlideIds() {
        return slideIds;
    }

    public Object getVisibility() {
        return visibility;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public List<ResGroups> getUploadGroupIdsAsList() {
        return uploadGroupIdsAsList;
    }

    public List<Integer> getUploadGroupIds() {
        return uploadGroupIds;
    }

    public int getNbrDocument() {
        return nbrDocument;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public int getSequence() {
        return sequence;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
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

    public int getMembersCount() {
        return membersCount;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
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

    public int getColor() {
        return color;
    }

    public Object getDescription() {
        return description;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public List<SlideChannelPartner> getChannelPartnerIdsAsList() {
        return channelPartnerIdsAsList;
    }

    public List<Integer> getChannelPartnerIds() {
        return channelPartnerIds;
    }

    public Object getRatingLastFeedback() {
        return ratingLastFeedback;
    }

    public int getNbrVideo() {
        return nbrVideo;
    }

    public int getKarmaReview() {
        return karmaReview;
    }

    public MailTemplate getShareChannelTemplateIdAsObject() {
        return shareChannelTemplateIdAsObject;
    }

    public OdooId getShareChannelTemplateId() {
        return shareChannelTemplateId;
    }

    public MailTemplate getPublishTemplateIdAsObject() {
        return publishTemplateIdAsObject;
    }

    public OdooId getPublishTemplateId() {
        return publishTemplateId;
    }

    public boolean getIsCanUpload() {
        return isCanUpload;
    }

    public Object getChannelType() {
        return channelType;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public Object getImage1024() {
        return image1024;
    }

    public int getMembersCompletedCount() {
        return membersCompletedCount;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getSeoName() {
        return seoName;
    }

    public Object getRatingLastText() {
        return ratingLastText;
    }

    public int getMembersInvitedCount() {
        return membersInvitedCount;
    }

    public Object getImage128() {
        return image128;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPromoteStrategy(Object promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setSlidePartnerIdsAsList(List<SlideSlidePartner> slidePartnerIdsAsList) {
        this.slidePartnerIdsAsList = slidePartnerIdsAsList;
    }

    public void setSlidePartnerIds(List<Integer> slidePartnerIds) {
        this.slidePartnerIds = slidePartnerIds;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public void setRatingAvgText(Object ratingAvgText) {
        this.ratingAvgText = ratingAvgText;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsCanComment(boolean isCanComment) {
        this.isCanComment = isCanComment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTagIdsAsList(List<SlideChannelTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setIsIsMember(boolean isIsMember) {
        this.isIsMember = isIsMember;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setEnrollGroupIdsAsList(List<ResGroups> enrollGroupIdsAsList) {
        this.enrollGroupIdsAsList = enrollGroupIdsAsList;
    }

    public void setEnrollGroupIds(List<Integer> enrollGroupIds) {
        this.enrollGroupIds = enrollGroupIds;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setKarmaSlideVote(int karmaSlideVote) {
        this.karmaSlideVote = karmaSlideVote;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setNbrArticle(int nbrArticle) {
        this.nbrArticle = nbrArticle;
    }

    public void setPromotedSlideIdAsObject(Slide promotedSlideIdAsObject) {
        this.promotedSlideIdAsObject = promotedSlideIdAsObject;
    }

    public void setPromotedSlideId(OdooId promotedSlideId) {
        this.promotedSlideId = promotedSlideId;
    }

    public void setRatingLastImage(Object ratingLastImage) {
        this.ratingLastImage = ratingLastImage;
    }

    public void setChannelPartnerAllIdsAsList(List<SlideChannelPartner> channelPartnerAllIdsAsList) {
        this.channelPartnerAllIdsAsList = channelPartnerAllIdsAsList;
    }

    public void setChannelPartnerAllIds(List<Integer> channelPartnerAllIds) {
        this.channelPartnerAllIds = channelPartnerAllIds;
    }

    public void setDescriptionHtml(Object descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public void setEnroll(Object enroll) {
        this.enroll = enroll;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setIsIsMemberInvited(boolean isIsMemberInvited) {
        this.isIsMemberInvited = isIsMemberInvited;
    }

    public void setKarmaGenChannelFinish(int karmaGenChannelFinish) {
        this.karmaGenChannelFinish = karmaGenChannelFinish;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public void setRatingAvgStars(double ratingAvgStars) {
        this.ratingAvgStars = ratingAvgStars;
    }

    public void setCompletedTemplateIdAsObject(MailTemplate completedTemplateIdAsObject) {
        this.completedTemplateIdAsObject = completedTemplateIdAsObject;
    }

    public void setCompletedTemplateId(OdooId completedTemplateId) {
        this.completedTemplateId = completedTemplateId;
    }

    public void setPrerequisiteOfChannelIdsAsList(List<SlideChannel> prerequisiteOfChannelIdsAsList) {
        this.prerequisiteOfChannelIdsAsList = prerequisiteOfChannelIdsAsList;
    }

    public void setPrerequisiteOfChannelIds(List<Integer> prerequisiteOfChannelIds) {
        this.prerequisiteOfChannelIds = prerequisiteOfChannelIds;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
    }

    public void setNbrQuiz(int nbrQuiz) {
        this.nbrQuiz = nbrQuiz;
    }

    public void setMembersEngagedCount(int membersEngagedCount) {
        this.membersEngagedCount = membersEngagedCount;
    }

    public void setKarmaSlideComment(int karmaSlideComment) {
        this.karmaSlideComment = karmaSlideComment;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setDescriptionShort(Object descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public void setIsCanReview(boolean isCanReview) {
        this.isCanReview = isCanReview;
    }

    public void setRatingPercentageSatisfaction(double ratingPercentageSatisfaction) {
        this.ratingPercentageSatisfaction = ratingPercentageSatisfaction;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setRatingLastValue(double ratingLastValue) {
        this.ratingLastValue = ratingLastValue;
    }

    public void setIsPrerequisiteUserHasCompleted(boolean isPrerequisiteUserHasCompleted) {
        this.isPrerequisiteUserHasCompleted = isPrerequisiteUserHasCompleted;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setPrerequisiteChannelIdsAsList(List<SlideChannel> prerequisiteChannelIdsAsList) {
        this.prerequisiteChannelIdsAsList = prerequisiteChannelIdsAsList;
    }

    public void setPrerequisiteChannelIds(List<Integer> prerequisiteChannelIds) {
        this.prerequisiteChannelIds = prerequisiteChannelIds;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setKarmaGenChannelRank(int karmaGenChannelRank) {
        this.karmaGenChannelRank = karmaGenChannelRank;
    }

    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setCoverProperties(Object coverProperties) {
        this.coverProperties = coverProperties;
    }

    public void setMembersAllCount(int membersAllCount) {
        this.membersAllCount = membersAllCount;
    }

    public void setIsAllowComment(boolean isAllowComment) {
        this.isAllowComment = isAllowComment;
    }

    public void setSlideCategoryIdsAsList(List<Slide> slideCategoryIdsAsList) {
        this.slideCategoryIdsAsList = slideCategoryIdsAsList;
    }

    public void setSlideCategoryIds(List<Integer> slideCategoryIds) {
        this.slideCategoryIds = slideCategoryIds;
    }

    public void setEnrollMsg(Object enrollMsg) {
        this.enrollMsg = enrollMsg;
    }

    public void setSlideContentIdsAsList(List<Slide> slideContentIdsAsList) {
        this.slideContentIdsAsList = slideContentIdsAsList;
    }

    public void setSlideContentIds(List<Integer> slideContentIds) {
        this.slideContentIds = slideContentIds;
    }

    public void setIsHasRequestedAccess(boolean isHasRequestedAccess) {
        this.isHasRequestedAccess = isHasRequestedAccess;
    }

    public void setIsCanVote(boolean isCanVote) {
        this.isCanVote = isCanVote;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setTotalSlides(int totalSlides) {
        this.totalSlides = totalSlides;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setIsCanPublish(boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
    }

    public void setNbrInfographic(int nbrInfographic) {
        this.nbrInfographic = nbrInfographic;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setRatingAvg(double ratingAvg) {
        this.ratingAvg = ratingAvg;
    }

    public void setSlideLastUpdate(Object slideLastUpdate) {
        this.slideLastUpdate = slideLastUpdate;
    }

    public void setIsPartnerHasNewContent(boolean isPartnerHasNewContent) {
        this.isPartnerHasNewContent = isPartnerHasNewContent;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setShareSlideTemplateIdAsObject(MailTemplate shareSlideTemplateIdAsObject) {
        this.shareSlideTemplateIdAsObject = shareSlideTemplateIdAsObject;
    }

    public void setShareSlideTemplateId(OdooId shareSlideTemplateId) {
        this.shareSlideTemplateId = shareSlideTemplateId;
    }

    public void setWebsiteDefaultBackgroundImageUrl(String websiteDefaultBackgroundImageUrl) {
        this.websiteDefaultBackgroundImageUrl = websiteDefaultBackgroundImageUrl;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setSlideIdsAsList(List<Slide> slideIdsAsList) {
        this.slideIdsAsList = slideIdsAsList;
    }

    public void setSlideIds(List<Integer> slideIds) {
        this.slideIds = slideIds;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setUploadGroupIdsAsList(List<ResGroups> uploadGroupIdsAsList) {
        this.uploadGroupIdsAsList = uploadGroupIdsAsList;
    }

    public void setUploadGroupIds(List<Integer> uploadGroupIds) {
        this.uploadGroupIds = uploadGroupIds;
    }

    public void setNbrDocument(int nbrDocument) {
        this.nbrDocument = nbrDocument;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
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

    public void setMembersCount(int membersCount) {
        this.membersCount = membersCount;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
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

    public void setColor(int color) {
        this.color = color;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setChannelPartnerIdsAsList(List<SlideChannelPartner> channelPartnerIdsAsList) {
        this.channelPartnerIdsAsList = channelPartnerIdsAsList;
    }

    public void setChannelPartnerIds(List<Integer> channelPartnerIds) {
        this.channelPartnerIds = channelPartnerIds;
    }

    public void setRatingLastFeedback(Object ratingLastFeedback) {
        this.ratingLastFeedback = ratingLastFeedback;
    }

    public void setNbrVideo(int nbrVideo) {
        this.nbrVideo = nbrVideo;
    }

    public void setKarmaReview(int karmaReview) {
        this.karmaReview = karmaReview;
    }

    public void setShareChannelTemplateIdAsObject(MailTemplate shareChannelTemplateIdAsObject) {
        this.shareChannelTemplateIdAsObject = shareChannelTemplateIdAsObject;
    }

    public void setShareChannelTemplateId(OdooId shareChannelTemplateId) {
        this.shareChannelTemplateId = shareChannelTemplateId;
    }

    public void setPublishTemplateIdAsObject(MailTemplate publishTemplateIdAsObject) {
        this.publishTemplateIdAsObject = publishTemplateIdAsObject;
    }

    public void setPublishTemplateId(OdooId publishTemplateId) {
        this.publishTemplateId = publishTemplateId;
    }

    public void setIsCanUpload(boolean isCanUpload) {
        this.isCanUpload = isCanUpload;
    }

    public void setChannelType(Object channelType) {
        this.channelType = channelType;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setMembersCompletedCount(int membersCompletedCount) {
        this.membersCompletedCount = membersCompletedCount;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public void setRatingLastText(Object ratingLastText) {
        this.ratingLastText = ratingLastText;
    }

    public void setMembersInvitedCount(int membersInvitedCount) {
        this.membersInvitedCount = membersInvitedCount;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }



}