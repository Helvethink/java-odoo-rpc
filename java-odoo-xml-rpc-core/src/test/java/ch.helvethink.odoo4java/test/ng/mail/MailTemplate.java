
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

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsReport;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.ir.IrMail_server;
import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("mail.template")
public class MailTemplate implements OdooObj {

    
    private Date writeDate;

    
    private Object bodyHtml;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String subject;

    
    private String templateFs;

    
    private boolean isAutoDelete;

    
    private Object description;

    
    private String scheduledDate;

    
    private String renderModel;

    
    private boolean isUseDefaultTo;

    
    private String replyTo;

    
    private IrActionsAct_window refIrActWindowAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window")
        @OdooModel("ir.actions.IrActionsAct_window")
    
    private OdooId refIrActWindow;

    
    private String emailLayoutXmlid;

    
    private String model;

    
    private int id;

    
    private String lang;

    
    private Date createDate;

    
    private String emailTo;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private boolean isIsTemplateEditor;

    
    private boolean isCanWrite;

    
    private IrMail_server mailServerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrMail_server")
        @OdooModel("ir.IrMail_server")
    
    private OdooId mailServerId;

    
    private boolean isActive;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String partnerTo;

    
    private Object templateCategory;

    
    private List<IrActionsReport> reportTemplateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsReport")
        @OdooModel("ir.actions.IrActionsReport")
    
    private List<Integer> reportTemplateIds;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String name;

    
    private String emailCc;

    
    private String emailFrom;


    public MailTemplate() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getBodyHtml() {
        return bodyHtml;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getSubject() {
        return subject;
    }

    public String getTemplateFs() {
        return templateFs;
    }

    public boolean getIsAutoDelete() {
        return isAutoDelete;
    }

    public Object getDescription() {
        return description;
    }

    public String getScheduledDate() {
        return scheduledDate;
    }

    public String getRenderModel() {
        return renderModel;
    }

    public boolean getIsUseDefaultTo() {
        return isUseDefaultTo;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public IrActionsAct_window getRefIrActWindowAsObject() {
        return refIrActWindowAsObject;
    }

    public OdooId getRefIrActWindow() {
        return refIrActWindow;
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

    public String getLang() {
        return lang;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
    }

    public boolean getIsIsTemplateEditor() {
        return isIsTemplateEditor;
    }

    public boolean getIsCanWrite() {
        return isCanWrite;
    }

    public IrMail_server getMailServerIdAsObject() {
        return mailServerIdAsObject;
    }

    public OdooId getMailServerId() {
        return mailServerId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
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

    public String getPartnerTo() {
        return partnerTo;
    }

    public Object getTemplateCategory() {
        return templateCategory;
    }

    public List<IrActionsReport> getReportTemplateIdsAsList() {
        return reportTemplateIdsAsList;
    }

    public List<Integer> getReportTemplateIds() {
        return reportTemplateIds;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmailCc() {
        return emailCc;
    }

    public String getEmailFrom() {
        return emailFrom;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setBodyHtml(Object bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTemplateFs(String templateFs) {
        this.templateFs = templateFs;
    }

    public void setIsAutoDelete(boolean isAutoDelete) {
        this.isAutoDelete = isAutoDelete;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setRenderModel(String renderModel) {
        this.renderModel = renderModel;
    }

    public void setIsUseDefaultTo(boolean isUseDefaultTo) {
        this.isUseDefaultTo = isUseDefaultTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public void setRefIrActWindowAsObject(IrActionsAct_window refIrActWindowAsObject) {
        this.refIrActWindowAsObject = refIrActWindowAsObject;
    }

    public void setRefIrActWindow(OdooId refIrActWindow) {
        this.refIrActWindow = refIrActWindow;
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

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setIsIsTemplateEditor(boolean isIsTemplateEditor) {
        this.isIsTemplateEditor = isIsTemplateEditor;
    }

    public void setIsCanWrite(boolean isCanWrite) {
        this.isCanWrite = isCanWrite;
    }

    public void setMailServerIdAsObject(IrMail_server mailServerIdAsObject) {
        this.mailServerIdAsObject = mailServerIdAsObject;
    }

    public void setMailServerId(OdooId mailServerId) {
        this.mailServerId = mailServerId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
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

    public void setPartnerTo(String partnerTo) {
        this.partnerTo = partnerTo;
    }

    public void setTemplateCategory(Object templateCategory) {
        this.templateCategory = templateCategory;
    }

    public void setReportTemplateIdsAsList(List<IrActionsReport> reportTemplateIdsAsList) {
        this.reportTemplateIdsAsList = reportTemplateIdsAsList;
    }

    public void setReportTemplateIds(List<Integer> reportTemplateIds) {
        this.reportTemplateIds = reportTemplateIds;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }



}