
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

import ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.mail.Mail;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.link.MailLinkPreview;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.mail.message.MailMessageReaction;
import ch.helvethink.odoo4java.test.ng.ir.IrMail_server;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.snailmail.SnailmailLetter;
import ch.helvethink.odoo4java.test.ng.mail.MailNotification;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.mail.tracking.MailTrackingValue;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;
import ch.helvethink.odoo4java.test.ng.mail.MailGuest;;

@OdooObject("mail.message")
public class MailMessage implements OdooObj {

    
    private Date date;

    
    private ResCompany recordCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId recordCompanyId;

    
    private Date writeDate;

    
    private boolean isIsInternal;

    
    private String subject;

    
    private double ratingValue;

    
    private Object body;

    
    private boolean isStarred;

    
    private String replyTo;

    
    private MailGuest authorGuestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailGuest")
        @OdooModel("mail.MailGuest")
    
    private OdooId authorGuestId;

    
    private String emailLayoutXmlid;

    
    private String model;

    
    private int id;

    
    private Date createDate;

    
    private List<ResPartner> notifiedPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> notifiedPartnerIds;

    
    private List<MailMessageReaction> reactionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageReaction")
        @OdooModel("mail.message.MailMessageReaction")
    
    private List<Integer> reactionIds;

    
    private MailMessageSubtype subtypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype")
        @OdooModel("mail.message.MailMessageSubtype")
    
    private OdooId subtypeId;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private boolean isSnailmailError;

    
    private List<MailTrackingValue> trackingValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.tracking.MailTrackingValue")
        @OdooModel("mail.tracking.MailTrackingValue")
    
    private List<Integer> trackingValueIds;

    
    private Object messageType;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private MailAliasDomain recordAliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId recordAliasDomainId;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private boolean isEmailAddSignature;

    
    private MailMessage parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId parentId;

    
    private String recordName;

    
    private ResPartner authorIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId authorId;

    
    private List<SnailmailLetter> letterIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.snailmail.SnailmailLetter")
        @OdooModel("snailmail.SnailmailLetter")
    
    private List<Integer> letterIds;

    
    private String preview;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String description;

    
    private List<MailMessage> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> childIds;

    
    private boolean isHasSmsError;

    
    private boolean isNeedaction;

    
    private boolean isHasError;

    
    private MailActivityType mailActivityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId mailActivityTypeId;

    
    private Date pinnedAt;

    
    private Object resId;

    
    private List<Mail> mailIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.Mail")
        @OdooModel("mail.Mail")
    
    private List<Integer> mailIds;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private List<ResPartner> starredPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> starredPartnerIds;

    
    private IrMail_server mailServerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrMail_server")
        @OdooModel("ir.IrMail_server")
    
    private OdooId mailServerId;

    
    private boolean isIsCurrentUserOrGuestAuthor;

    
    private String messageId;

    
    private Object authorAvatar;

    
    private boolean isReplyToForceNew;

    
    private List<MailLinkPreview> linkPreviewIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.link.MailLinkPreview")
        @OdooModel("mail.link.MailLinkPreview")
    
    private List<Integer> linkPreviewIds;

    
    private List<MailNotification> notificationIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailNotification")
        @OdooModel("mail.MailNotification")
    
    private List<Integer> notificationIds;

    
    private String emailFrom;


    public MailMessage() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public ResCompany getRecordCompanyIdAsObject() {
        return recordCompanyIdAsObject;
    }

    public OdooId getRecordCompanyId() {
        return recordCompanyId;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsIsInternal() {
        return isIsInternal;
    }

    public String getSubject() {
        return subject;
    }

    public double getRatingValue() {
        return ratingValue;
    }

    public Object getBody() {
        return body;
    }

    public boolean getIsStarred() {
        return isStarred;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public MailGuest getAuthorGuestIdAsObject() {
        return authorGuestIdAsObject;
    }

    public OdooId getAuthorGuestId() {
        return authorGuestId;
    }

    public String getEmailLayoutXmlid() {
        return emailLayoutXmlid;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<ResPartner> getNotifiedPartnerIdsAsList() {
        return notifiedPartnerIdsAsList;
    }

    public List<Integer> getNotifiedPartnerIds() {
        return notifiedPartnerIds;
    }

    public List<MailMessageReaction> getReactionIdsAsList() {
        return reactionIdsAsList;
    }

    public List<Integer> getReactionIds() {
        return reactionIds;
    }

    public MailMessageSubtype getSubtypeIdAsObject() {
        return subtypeIdAsObject;
    }

    public OdooId getSubtypeId() {
        return subtypeId;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
    }

    public boolean getIsSnailmailError() {
        return isSnailmailError;
    }

    public List<MailTrackingValue> getTrackingValueIdsAsList() {
        return trackingValueIdsAsList;
    }

    public List<Integer> getTrackingValueIds() {
        return trackingValueIds;
    }

    public Object getMessageType() {
        return messageType;
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

    public MailAliasDomain getRecordAliasDomainIdAsObject() {
        return recordAliasDomainIdAsObject;
    }

    public OdooId getRecordAliasDomainId() {
        return recordAliasDomainId;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public boolean getIsEmailAddSignature() {
        return isEmailAddSignature;
    }

    public MailMessage getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getRecordName() {
        return recordName;
    }

    public ResPartner getAuthorIdAsObject() {
        return authorIdAsObject;
    }

    public OdooId getAuthorId() {
        return authorId;
    }

    public List<SnailmailLetter> getLetterIdsAsList() {
        return letterIdsAsList;
    }

    public List<Integer> getLetterIds() {
        return letterIds;
    }

    public String getPreview() {
        return preview;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getDescription() {
        return description;
    }

    public List<MailMessage> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public boolean getIsHasSmsError() {
        return isHasSmsError;
    }

    public boolean getIsNeedaction() {
        return isNeedaction;
    }

    public boolean getIsHasError() {
        return isHasError;
    }

    public MailActivityType getMailActivityTypeIdAsObject() {
        return mailActivityTypeIdAsObject;
    }

    public OdooId getMailActivityTypeId() {
        return mailActivityTypeId;
    }

    public Date getPinnedAt() {
        return pinnedAt;
    }

    public Object getResId() {
        return resId;
    }

    public List<Mail> getMailIdsAsList() {
        return mailIdsAsList;
    }

    public List<Integer> getMailIds() {
        return mailIds;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public List<ResPartner> getStarredPartnerIdsAsList() {
        return starredPartnerIdsAsList;
    }

    public List<Integer> getStarredPartnerIds() {
        return starredPartnerIds;
    }

    public IrMail_server getMailServerIdAsObject() {
        return mailServerIdAsObject;
    }

    public OdooId getMailServerId() {
        return mailServerId;
    }

    public boolean getIsIsCurrentUserOrGuestAuthor() {
        return isIsCurrentUserOrGuestAuthor;
    }

    public String getMessageId() {
        return messageId;
    }

    public Object getAuthorAvatar() {
        return authorAvatar;
    }

    public boolean getIsReplyToForceNew() {
        return isReplyToForceNew;
    }

    public List<MailLinkPreview> getLinkPreviewIdsAsList() {
        return linkPreviewIdsAsList;
    }

    public List<Integer> getLinkPreviewIds() {
        return linkPreviewIds;
    }

    public List<MailNotification> getNotificationIdsAsList() {
        return notificationIdsAsList;
    }

    public List<Integer> getNotificationIds() {
        return notificationIds;
    }

    public String getEmailFrom() {
        return emailFrom;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setRecordCompanyIdAsObject(ResCompany recordCompanyIdAsObject) {
        this.recordCompanyIdAsObject = recordCompanyIdAsObject;
    }

    public void setRecordCompanyId(OdooId recordCompanyId) {
        this.recordCompanyId = recordCompanyId;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsIsInternal(boolean isIsInternal) {
        this.isIsInternal = isIsInternal;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRatingValue(double ratingValue) {
        this.ratingValue = ratingValue;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setIsStarred(boolean isStarred) {
        this.isStarred = isStarred;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public void setAuthorGuestIdAsObject(MailGuest authorGuestIdAsObject) {
        this.authorGuestIdAsObject = authorGuestIdAsObject;
    }

    public void setAuthorGuestId(OdooId authorGuestId) {
        this.authorGuestId = authorGuestId;
    }

    public void setEmailLayoutXmlid(String emailLayoutXmlid) {
        this.emailLayoutXmlid = emailLayoutXmlid;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setNotifiedPartnerIdsAsList(List<ResPartner> notifiedPartnerIdsAsList) {
        this.notifiedPartnerIdsAsList = notifiedPartnerIdsAsList;
    }

    public void setNotifiedPartnerIds(List<Integer> notifiedPartnerIds) {
        this.notifiedPartnerIds = notifiedPartnerIds;
    }

    public void setReactionIdsAsList(List<MailMessageReaction> reactionIdsAsList) {
        this.reactionIdsAsList = reactionIdsAsList;
    }

    public void setReactionIds(List<Integer> reactionIds) {
        this.reactionIds = reactionIds;
    }

    public void setSubtypeIdAsObject(MailMessageSubtype subtypeIdAsObject) {
        this.subtypeIdAsObject = subtypeIdAsObject;
    }

    public void setSubtypeId(OdooId subtypeId) {
        this.subtypeId = subtypeId;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setIsSnailmailError(boolean isSnailmailError) {
        this.isSnailmailError = isSnailmailError;
    }

    public void setTrackingValueIdsAsList(List<MailTrackingValue> trackingValueIdsAsList) {
        this.trackingValueIdsAsList = trackingValueIdsAsList;
    }

    public void setTrackingValueIds(List<Integer> trackingValueIds) {
        this.trackingValueIds = trackingValueIds;
    }

    public void setMessageType(Object messageType) {
        this.messageType = messageType;
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

    public void setRecordAliasDomainIdAsObject(MailAliasDomain recordAliasDomainIdAsObject) {
        this.recordAliasDomainIdAsObject = recordAliasDomainIdAsObject;
    }

    public void setRecordAliasDomainId(OdooId recordAliasDomainId) {
        this.recordAliasDomainId = recordAliasDomainId;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setIsEmailAddSignature(boolean isEmailAddSignature) {
        this.isEmailAddSignature = isEmailAddSignature;
    }

    public void setParentIdAsObject(MailMessage parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public void setAuthorIdAsObject(ResPartner authorIdAsObject) {
        this.authorIdAsObject = authorIdAsObject;
    }

    public void setAuthorId(OdooId authorId) {
        this.authorId = authorId;
    }

    public void setLetterIdsAsList(List<SnailmailLetter> letterIdsAsList) {
        this.letterIdsAsList = letterIdsAsList;
    }

    public void setLetterIds(List<Integer> letterIds) {
        this.letterIds = letterIds;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setChildIdsAsList(List<MailMessage> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setIsHasSmsError(boolean isHasSmsError) {
        this.isHasSmsError = isHasSmsError;
    }

    public void setIsNeedaction(boolean isNeedaction) {
        this.isNeedaction = isNeedaction;
    }

    public void setIsHasError(boolean isHasError) {
        this.isHasError = isHasError;
    }

    public void setMailActivityTypeIdAsObject(MailActivityType mailActivityTypeIdAsObject) {
        this.mailActivityTypeIdAsObject = mailActivityTypeIdAsObject;
    }

    public void setMailActivityTypeId(OdooId mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId;
    }

    public void setPinnedAt(Date pinnedAt) {
        this.pinnedAt = pinnedAt;
    }

    public void setResId(Object resId) {
        this.resId = resId;
    }

    public void setMailIdsAsList(List<Mail> mailIdsAsList) {
        this.mailIdsAsList = mailIdsAsList;
    }

    public void setMailIds(List<Integer> mailIds) {
        this.mailIds = mailIds;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setStarredPartnerIdsAsList(List<ResPartner> starredPartnerIdsAsList) {
        this.starredPartnerIdsAsList = starredPartnerIdsAsList;
    }

    public void setStarredPartnerIds(List<Integer> starredPartnerIds) {
        this.starredPartnerIds = starredPartnerIds;
    }

    public void setMailServerIdAsObject(IrMail_server mailServerIdAsObject) {
        this.mailServerIdAsObject = mailServerIdAsObject;
    }

    public void setMailServerId(OdooId mailServerId) {
        this.mailServerId = mailServerId;
    }

    public void setIsIsCurrentUserOrGuestAuthor(boolean isIsCurrentUserOrGuestAuthor) {
        this.isIsCurrentUserOrGuestAuthor = isIsCurrentUserOrGuestAuthor;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setAuthorAvatar(Object authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    public void setIsReplyToForceNew(boolean isReplyToForceNew) {
        this.isReplyToForceNew = isReplyToForceNew;
    }

    public void setLinkPreviewIdsAsList(List<MailLinkPreview> linkPreviewIdsAsList) {
        this.linkPreviewIdsAsList = linkPreviewIdsAsList;
    }

    public void setLinkPreviewIds(List<Integer> linkPreviewIds) {
        this.linkPreviewIds = linkPreviewIds;
    }

    public void setNotificationIdsAsList(List<MailNotification> notificationIdsAsList) {
        this.notificationIdsAsList = notificationIdsAsList;
    }

    public void setNotificationIds(List<Integer> notificationIds) {
        this.notificationIds = notificationIds;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }



}