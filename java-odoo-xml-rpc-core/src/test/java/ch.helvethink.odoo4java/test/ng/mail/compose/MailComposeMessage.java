
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

package ch.helvethink.odoo4java.test.ng.mail.compose;

import ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.ir.IrMail_server;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;;

@OdooObject("mail.compose.message")
public class MailComposeMessage implements OdooObj {

    
    private ResCompany recordCompanyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId recordCompanyId;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isCompositionBatch;

    
    private boolean isAutoDeleteKeepLog;

    
    private String subject;

    
    private boolean isModelIsThread;

    
    private boolean isAutoDelete;

    
    private boolean isUseExclusionList;

    
    private Object body;

    
    private String scheduledDate;

    
    private String renderModel;

    
    private MailActivityType mailActivityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId mailActivityTypeId;

    
    private String replyTo;

    
    private boolean isForceSend;

    
    private boolean isSubtypeIsLog;

    
    private boolean isBodyHasTemplateValue;

    
    private String emailLayoutXmlid;

    
    private Object replyToMode;

    
    private String model;

    
    private int id;

    
    private String lang;

    
    private Object compositionMode;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private Date createDate;

    
    private MailMessageSubtype subtypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype")
        @OdooModel("mail.message.MailMessageSubtype")
    
    private OdooId subtypeId;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private boolean isIsMailTemplateEditor;

    
    private IrMail_server mailServerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrMail_server")
        @OdooModel("ir.IrMail_server")
    
    private OdooId mailServerId;

    
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

    
    private ResUsers resDomainUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId resDomainUserId;

    
    private boolean isReplyToForceNew;

    
    private boolean isEmailAddSignature;

    
    private MailMessage parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId parentId;

    
    private boolean isCanEditBody;

    
    private Object resIds;

    
    private MailTemplate templateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId templateId;

    
    private String recordName;

    
    private ResPartner authorIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId authorId;

    
    private Object resDomain;

    
    private String emailFrom;


    public MailComposeMessage() {
    // Constructor
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

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsCompositionBatch() {
        return isCompositionBatch;
    }

    public boolean getIsAutoDeleteKeepLog() {
        return isAutoDeleteKeepLog;
    }

    public String getSubject() {
        return subject;
    }

    public boolean getIsModelIsThread() {
        return isModelIsThread;
    }

    public boolean getIsAutoDelete() {
        return isAutoDelete;
    }

    public boolean getIsUseExclusionList() {
        return isUseExclusionList;
    }

    public Object getBody() {
        return body;
    }

    public String getScheduledDate() {
        return scheduledDate;
    }

    public String getRenderModel() {
        return renderModel;
    }

    public MailActivityType getMailActivityTypeIdAsObject() {
        return mailActivityTypeIdAsObject;
    }

    public OdooId getMailActivityTypeId() {
        return mailActivityTypeId;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public boolean getIsForceSend() {
        return isForceSend;
    }

    public boolean getIsSubtypeIsLog() {
        return isSubtypeIsLog;
    }

    public boolean getIsBodyHasTemplateValue() {
        return isBodyHasTemplateValue;
    }

    public String getEmailLayoutXmlid() {
        return emailLayoutXmlid;
    }

    public Object getReplyToMode() {
        return replyToMode;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }

    public Object getCompositionMode() {
        return compositionMode;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public Date getCreateDate() {
        return createDate;
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

    public boolean getIsIsMailTemplateEditor() {
        return isIsMailTemplateEditor;
    }

    public IrMail_server getMailServerIdAsObject() {
        return mailServerIdAsObject;
    }

    public OdooId getMailServerId() {
        return mailServerId;
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

    public ResUsers getResDomainUserIdAsObject() {
        return resDomainUserIdAsObject;
    }

    public OdooId getResDomainUserId() {
        return resDomainUserId;
    }

    public boolean getIsReplyToForceNew() {
        return isReplyToForceNew;
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

    public boolean getIsCanEditBody() {
        return isCanEditBody;
    }

    public Object getResIds() {
        return resIds;
    }

    public MailTemplate getTemplateIdAsObject() {
        return templateIdAsObject;
    }

    public OdooId getTemplateId() {
        return templateId;
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

    public Object getResDomain() {
        return resDomain;
    }

    public String getEmailFrom() {
        return emailFrom;
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

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsCompositionBatch(boolean isCompositionBatch) {
        this.isCompositionBatch = isCompositionBatch;
    }

    public void setIsAutoDeleteKeepLog(boolean isAutoDeleteKeepLog) {
        this.isAutoDeleteKeepLog = isAutoDeleteKeepLog;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setIsModelIsThread(boolean isModelIsThread) {
        this.isModelIsThread = isModelIsThread;
    }

    public void setIsAutoDelete(boolean isAutoDelete) {
        this.isAutoDelete = isAutoDelete;
    }

    public void setIsUseExclusionList(boolean isUseExclusionList) {
        this.isUseExclusionList = isUseExclusionList;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setRenderModel(String renderModel) {
        this.renderModel = renderModel;
    }

    public void setMailActivityTypeIdAsObject(MailActivityType mailActivityTypeIdAsObject) {
        this.mailActivityTypeIdAsObject = mailActivityTypeIdAsObject;
    }

    public void setMailActivityTypeId(OdooId mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public void setIsForceSend(boolean isForceSend) {
        this.isForceSend = isForceSend;
    }

    public void setIsSubtypeIsLog(boolean isSubtypeIsLog) {
        this.isSubtypeIsLog = isSubtypeIsLog;
    }

    public void setIsBodyHasTemplateValue(boolean isBodyHasTemplateValue) {
        this.isBodyHasTemplateValue = isBodyHasTemplateValue;
    }

    public void setEmailLayoutXmlid(String emailLayoutXmlid) {
        this.emailLayoutXmlid = emailLayoutXmlid;
    }

    public void setReplyToMode(Object replyToMode) {
        this.replyToMode = replyToMode;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setCompositionMode(Object compositionMode) {
        this.compositionMode = compositionMode;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public void setIsIsMailTemplateEditor(boolean isIsMailTemplateEditor) {
        this.isIsMailTemplateEditor = isIsMailTemplateEditor;
    }

    public void setMailServerIdAsObject(IrMail_server mailServerIdAsObject) {
        this.mailServerIdAsObject = mailServerIdAsObject;
    }

    public void setMailServerId(OdooId mailServerId) {
        this.mailServerId = mailServerId;
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

    public void setResDomainUserIdAsObject(ResUsers resDomainUserIdAsObject) {
        this.resDomainUserIdAsObject = resDomainUserIdAsObject;
    }

    public void setResDomainUserId(OdooId resDomainUserId) {
        this.resDomainUserId = resDomainUserId;
    }

    public void setIsReplyToForceNew(boolean isReplyToForceNew) {
        this.isReplyToForceNew = isReplyToForceNew;
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

    public void setIsCanEditBody(boolean isCanEditBody) {
        this.isCanEditBody = isCanEditBody;
    }

    public void setResIds(Object resIds) {
        this.resIds = resIds;
    }

    public void setTemplateIdAsObject(MailTemplate templateIdAsObject) {
        this.templateIdAsObject = templateIdAsObject;
    }

    public void setTemplateId(OdooId templateId) {
        this.templateId = templateId;
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

    public void setResDomain(Object resDomain) {
        this.resDomain = resDomain;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }



}