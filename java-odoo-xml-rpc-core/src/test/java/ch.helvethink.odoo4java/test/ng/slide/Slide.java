
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
import ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlideResource;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.test.ng.slide.SlideTag;
import ch.helvethink.odoo4java.test.ng.slide.Slide;
import ch.helvethink.odoo4java.test.ng.slide.SlideEmbed;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlidePartner;
import ch.helvethink.odoo4java.test.ng.slide.SlideQuestion;;

@OdooObject("slide.slide")
public class Slide implements OdooObj {

    
    private int slideViews;

    
    private Date writeDate;

    
    private boolean isUserHasCompleted;

    
    private String websiteMetaTitle;

    
    private double completionTime;

    
    private boolean isIsPublished;

    
    private List<SlideSlidePartner> slidePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlidePartner")
        @OdooModel("slide.slide.SlideSlidePartner")
    
    private List<Integer> slidePartnerIds;

    
    private int quizThirdAttemptReward;

    
    private int totalViews;

    
    private String vimeoId;

    
    private int messageHasErrorCounter;

    
    private int embedCount;

    
    private Date datePublished;

    
    private int id;

    
    private List<SlideQuestion> questionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideQuestion")
        @OdooModel("slide.SlideQuestion")
    
    private List<Integer> questionIds;

    
    private Object videoSourceType;

    
    private int messageAttachmentCount;

    
    private List<SlideTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideTag")
        @OdooModel("slide.SlideTag")
    
    private List<Integer> tagIds;

    
    private List<SlideSlideResource> slideResourceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlideResource")
        @OdooModel("slide.slide.SlideSlideResource")
    
    private List<Integer> slideResourceIds;

    
    private boolean isActive;

    
    private Object sourceType;

    
    private int dislikes;

    
    private Object image1920;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isCanSelfMarkUncompleted;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private int commentsCount;

    
    private int nbrArticle;

    
    private Object embedCodeExternal;

    
    private SlideChannel channelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private OdooId channelId;

    
    private boolean isIsCategory;

    
    private String websiteMetaKeywords;

    
    private boolean isMessageIsFollower;

    
    private String documentGoogleUrl;

    
    private boolean isSlideResourceDownloadable;

    
    private boolean isChannelAllowComment;

    
    private Slide categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private OdooId categoryId;

    
    private List<SlideEmbed> embedIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideEmbed")
        @OdooModel("slide.SlideEmbed")
    
    private List<Integer> embedIds;

    
    private boolean isUserHasCompletedCategory;

    
    private boolean isMessageHasSmsError;

    
    private boolean isWebsitePublished;

    
    private int nbrQuiz;

    
    private String youtubeId;

    
    private String url;

    
    private int publicViews;

    
    private String websiteUrl;

    
    private String websiteMetaOgImg;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private boolean isIsSeoOptimized;

    
    private int quizSecondAttemptReward;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private int questionsCount;

    
    private int totalSlides;

    
    private boolean isCanPublish;

    
    private int nbrInfographic;

    
    private boolean isHasMessage;

    
    private String slideIconClass;

    
    private Date createDate;

    
    private int quizFourthAttemptReward;

    
    private Object image512;

    
    private int likes;

    
    private Object embedCode;

    
    private List<Slide> slideIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private List<Integer> slideIds;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private int nbrDocument;

    
    private String displayName;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private Object slideCategory;

    
    private int sequence;

    
    private Object websiteMetaDescription;

    
    private String imageGoogleUrl;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private boolean isIsNewSlide;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private SlideSlidePartner userMembershipIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.slide.SlideSlidePartner")
        @OdooModel("slide.slide.SlideSlidePartner")
    
    private OdooId userMembershipId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private boolean isIsPreview;

    
    private Object description;

    
    private Object binaryContent;

    
    private Object htmlContent;

    
    private String videoUrl;

    
    private Object documentBinaryContent;

    
    private int nbrVideo;

    
    private String googleDriveId;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private Object channelType;

    
    private int quizFirstAttemptReward;

    
    private int userVote;

    
    private Object image1024;

    
    private Object imageBinaryContent;

    
    private boolean isCanSelfMarkCompleted;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private int messageNeedactionCounter;

    
    private String seoName;

    
    private Object slideType;

    
    private Object image128;

    
    private String websiteShareUrl;


    public Slide() {
    // Constructor
    }


    public int getSlideViews() {
        return slideViews;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsUserHasCompleted() {
        return isUserHasCompleted;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public double getCompletionTime() {
        return completionTime;
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

    public int getQuizThirdAttemptReward() {
        return quizThirdAttemptReward;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public String getVimeoId() {
        return vimeoId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public int getEmbedCount() {
        return embedCount;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public int getId() {
        return id;
    }

    public List<SlideQuestion> getQuestionIdsAsList() {
        return questionIdsAsList;
    }

    public List<Integer> getQuestionIds() {
        return questionIds;
    }

    public Object getVideoSourceType() {
        return videoSourceType;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<SlideTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public List<SlideSlideResource> getSlideResourceIdsAsList() {
        return slideResourceIdsAsList;
    }

    public List<Integer> getSlideResourceIds() {
        return slideResourceIds;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getSourceType() {
        return sourceType;
    }

    public int getDislikes() {
        return dislikes;
    }

    public Object getImage1920() {
        return image1920;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public boolean getIsCanSelfMarkUncompleted() {
        return isCanSelfMarkUncompleted;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getNbrArticle() {
        return nbrArticle;
    }

    public Object getEmbedCodeExternal() {
        return embedCodeExternal;
    }

    public SlideChannel getChannelIdAsObject() {
        return channelIdAsObject;
    }

    public OdooId getChannelId() {
        return channelId;
    }

    public boolean getIsIsCategory() {
        return isIsCategory;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public String getDocumentGoogleUrl() {
        return documentGoogleUrl;
    }

    public boolean getIsSlideResourceDownloadable() {
        return isSlideResourceDownloadable;
    }

    public boolean getIsChannelAllowComment() {
        return isChannelAllowComment;
    }

    public Slide getCategoryIdAsObject() {
        return categoryIdAsObject;
    }

    public OdooId getCategoryId() {
        return categoryId;
    }

    public List<SlideEmbed> getEmbedIdsAsList() {
        return embedIdsAsList;
    }

    public List<Integer> getEmbedIds() {
        return embedIds;
    }

    public boolean getIsUserHasCompletedCategory() {
        return isUserHasCompletedCategory;
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

    public String getYoutubeId() {
        return youtubeId;
    }

    public String getUrl() {
        return url;
    }

    public int getPublicViews() {
        return publicViews;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public int getQuizSecondAttemptReward() {
        return quizSecondAttemptReward;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public int getQuestionsCount() {
        return questionsCount;
    }

    public int getTotalSlides() {
        return totalSlides;
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

    public String getSlideIconClass() {
        return slideIconClass;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getQuizFourthAttemptReward() {
        return quizFourthAttemptReward;
    }

    public Object getImage512() {
        return image512;
    }

    public int getLikes() {
        return likes;
    }

    public Object getEmbedCode() {
        return embedCode;
    }

    public List<Slide> getSlideIdsAsList() {
        return slideIdsAsList;
    }

    public List<Integer> getSlideIds() {
        return slideIds;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public int getNbrDocument() {
        return nbrDocument;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public Object getSlideCategory() {
        return slideCategory;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public String getImageGoogleUrl() {
        return imageGoogleUrl;
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

    public boolean getIsIsNewSlide() {
        return isIsNewSlide;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public SlideSlidePartner getUserMembershipIdAsObject() {
        return userMembershipIdAsObject;
    }

    public OdooId getUserMembershipId() {
        return userMembershipId;
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

    public boolean getIsIsPreview() {
        return isIsPreview;
    }

    public Object getDescription() {
        return description;
    }

    public Object getBinaryContent() {
        return binaryContent;
    }

    public Object getHtmlContent() {
        return htmlContent;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Object getDocumentBinaryContent() {
        return documentBinaryContent;
    }

    public int getNbrVideo() {
        return nbrVideo;
    }

    public String getGoogleDriveId() {
        return googleDriveId;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public Object getChannelType() {
        return channelType;
    }

    public int getQuizFirstAttemptReward() {
        return quizFirstAttemptReward;
    }

    public int getUserVote() {
        return userVote;
    }

    public Object getImage1024() {
        return image1024;
    }

    public Object getImageBinaryContent() {
        return imageBinaryContent;
    }

    public boolean getIsCanSelfMarkCompleted() {
        return isCanSelfMarkCompleted;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public String getSeoName() {
        return seoName;
    }

    public Object getSlideType() {
        return slideType;
    }

    public Object getImage128() {
        return image128;
    }

    public String getWebsiteShareUrl() {
        return websiteShareUrl;
    }



    public void setSlideViews(int slideViews) {
        this.slideViews = slideViews;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsUserHasCompleted(boolean isUserHasCompleted) {
        this.isUserHasCompleted = isUserHasCompleted;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
    }

    public void setCompletionTime(double completionTime) {
        this.completionTime = completionTime;
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

    public void setQuizThirdAttemptReward(int quizThirdAttemptReward) {
        this.quizThirdAttemptReward = quizThirdAttemptReward;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public void setVimeoId(String vimeoId) {
        this.vimeoId = vimeoId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setEmbedCount(int embedCount) {
        this.embedCount = embedCount;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestionIdsAsList(List<SlideQuestion> questionIdsAsList) {
        this.questionIdsAsList = questionIdsAsList;
    }

    public void setQuestionIds(List<Integer> questionIds) {
        this.questionIds = questionIds;
    }

    public void setVideoSourceType(Object videoSourceType) {
        this.videoSourceType = videoSourceType;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTagIdsAsList(List<SlideTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setSlideResourceIdsAsList(List<SlideSlideResource> slideResourceIdsAsList) {
        this.slideResourceIdsAsList = slideResourceIdsAsList;
    }

    public void setSlideResourceIds(List<Integer> slideResourceIds) {
        this.slideResourceIds = slideResourceIds;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setSourceType(Object sourceType) {
        this.sourceType = sourceType;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setIsCanSelfMarkUncompleted(boolean isCanSelfMarkUncompleted) {
        this.isCanSelfMarkUncompleted = isCanSelfMarkUncompleted;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public void setNbrArticle(int nbrArticle) {
        this.nbrArticle = nbrArticle;
    }

    public void setEmbedCodeExternal(Object embedCodeExternal) {
        this.embedCodeExternal = embedCodeExternal;
    }

    public void setChannelIdAsObject(SlideChannel channelIdAsObject) {
        this.channelIdAsObject = channelIdAsObject;
    }

    public void setChannelId(OdooId channelId) {
        this.channelId = channelId;
    }

    public void setIsIsCategory(boolean isIsCategory) {
        this.isIsCategory = isIsCategory;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setDocumentGoogleUrl(String documentGoogleUrl) {
        this.documentGoogleUrl = documentGoogleUrl;
    }

    public void setIsSlideResourceDownloadable(boolean isSlideResourceDownloadable) {
        this.isSlideResourceDownloadable = isSlideResourceDownloadable;
    }

    public void setIsChannelAllowComment(boolean isChannelAllowComment) {
        this.isChannelAllowComment = isChannelAllowComment;
    }

    public void setCategoryIdAsObject(Slide categoryIdAsObject) {
        this.categoryIdAsObject = categoryIdAsObject;
    }

    public void setCategoryId(OdooId categoryId) {
        this.categoryId = categoryId;
    }

    public void setEmbedIdsAsList(List<SlideEmbed> embedIdsAsList) {
        this.embedIdsAsList = embedIdsAsList;
    }

    public void setEmbedIds(List<Integer> embedIds) {
        this.embedIds = embedIds;
    }

    public void setIsUserHasCompletedCategory(boolean isUserHasCompletedCategory) {
        this.isUserHasCompletedCategory = isUserHasCompletedCategory;
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

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPublicViews(int publicViews) {
        this.publicViews = publicViews;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setQuizSecondAttemptReward(int quizSecondAttemptReward) {
        this.quizSecondAttemptReward = quizSecondAttemptReward;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setQuestionsCount(int questionsCount) {
        this.questionsCount = questionsCount;
    }

    public void setTotalSlides(int totalSlides) {
        this.totalSlides = totalSlides;
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

    public void setSlideIconClass(String slideIconClass) {
        this.slideIconClass = slideIconClass;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setQuizFourthAttemptReward(int quizFourthAttemptReward) {
        this.quizFourthAttemptReward = quizFourthAttemptReward;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setEmbedCode(Object embedCode) {
        this.embedCode = embedCode;
    }

    public void setSlideIdsAsList(List<Slide> slideIdsAsList) {
        this.slideIdsAsList = slideIdsAsList;
    }

    public void setSlideIds(List<Integer> slideIds) {
        this.slideIds = slideIds;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setNbrDocument(int nbrDocument) {
        this.nbrDocument = nbrDocument;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setSlideCategory(Object slideCategory) {
        this.slideCategory = slideCategory;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
    }

    public void setImageGoogleUrl(String imageGoogleUrl) {
        this.imageGoogleUrl = imageGoogleUrl;
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

    public void setIsIsNewSlide(boolean isIsNewSlide) {
        this.isIsNewSlide = isIsNewSlide;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setUserMembershipIdAsObject(SlideSlidePartner userMembershipIdAsObject) {
        this.userMembershipIdAsObject = userMembershipIdAsObject;
    }

    public void setUserMembershipId(OdooId userMembershipId) {
        this.userMembershipId = userMembershipId;
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

    public void setIsIsPreview(boolean isIsPreview) {
        this.isIsPreview = isIsPreview;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setBinaryContent(Object binaryContent) {
        this.binaryContent = binaryContent;
    }

    public void setHtmlContent(Object htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setDocumentBinaryContent(Object documentBinaryContent) {
        this.documentBinaryContent = documentBinaryContent;
    }

    public void setNbrVideo(int nbrVideo) {
        this.nbrVideo = nbrVideo;
    }

    public void setGoogleDriveId(String googleDriveId) {
        this.googleDriveId = googleDriveId;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setChannelType(Object channelType) {
        this.channelType = channelType;
    }

    public void setQuizFirstAttemptReward(int quizFirstAttemptReward) {
        this.quizFirstAttemptReward = quizFirstAttemptReward;
    }

    public void setUserVote(int userVote) {
        this.userVote = userVote;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setImageBinaryContent(Object imageBinaryContent) {
        this.imageBinaryContent = imageBinaryContent;
    }

    public void setIsCanSelfMarkCompleted(boolean isCanSelfMarkCompleted) {
        this.isCanSelfMarkCompleted = isCanSelfMarkCompleted;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public void setSlideType(Object slideType) {
        this.slideType = slideType;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }

    public void setWebsiteShareUrl(String websiteShareUrl) {
        this.websiteShareUrl = websiteShareUrl;
    }



}