
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

package ch.helvethink.odoo4java.test.ng.account.move;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.move.send")
public class AccountMoveSend implements OdooObj {

    
    private Date writeDate;

    
    private List<AccountMove> moveIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> moveIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String ublPartnerWarning;

    
    private boolean isCheckboxSendByPost;

    
    private boolean isSendByPostReadonly;

    
    private boolean isSendMailReadonly;

    
    private Object mode;

    
    private boolean isEnableSendMail;

    
    private boolean isDisplayMailComposer;

    
    private int id;

    
    private MailTemplate mailTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId mailTemplateId;

    
    private Date createDate;

    
    private boolean isCheckboxUblCiiXml;

    
    private boolean isCheckboxDownload;

    
    private int sendByPostCost;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isEnableUblCiiXml;

    
    private Object sendByPostWarningMessage;

    
    private String mailSubject;

    
    private String checkboxUblCiiLabel;

    
    private String mailLang;

    
    private boolean isCheckboxSendMail;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isShowUblCompanyWarning;

    
    private Object mailAttachmentsWidget;

    
    private boolean isEnableSendByPost;

    
    private boolean isEnableDownload;

    
    private Object mailBody;

    
    private List<ResPartner> mailPartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> mailPartnerIds;

    
    private Object sendMailWarningMessage;


    public AccountMoveSend() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<AccountMove> getMoveIdsAsList() {
        return moveIdsAsList;
    }

    public List<Integer> getMoveIds() {
        return moveIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getUblPartnerWarning() {
        return ublPartnerWarning;
    }

    public boolean getIsCheckboxSendByPost() {
        return isCheckboxSendByPost;
    }

    public boolean getIsSendByPostReadonly() {
        return isSendByPostReadonly;
    }

    public boolean getIsSendMailReadonly() {
        return isSendMailReadonly;
    }

    public Object getMode() {
        return mode;
    }

    public boolean getIsEnableSendMail() {
        return isEnableSendMail;
    }

    public boolean getIsDisplayMailComposer() {
        return isDisplayMailComposer;
    }

    public int getId() {
        return id;
    }

    public MailTemplate getMailTemplateIdAsObject() {
        return mailTemplateIdAsObject;
    }

    public OdooId getMailTemplateId() {
        return mailTemplateId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsCheckboxUblCiiXml() {
        return isCheckboxUblCiiXml;
    }

    public boolean getIsCheckboxDownload() {
        return isCheckboxDownload;
    }

    public int getSendByPostCost() {
        return sendByPostCost;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsEnableUblCiiXml() {
        return isEnableUblCiiXml;
    }

    public Object getSendByPostWarningMessage() {
        return sendByPostWarningMessage;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public String getCheckboxUblCiiLabel() {
        return checkboxUblCiiLabel;
    }

    public String getMailLang() {
        return mailLang;
    }

    public boolean getIsCheckboxSendMail() {
        return isCheckboxSendMail;
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

    public boolean getIsShowUblCompanyWarning() {
        return isShowUblCompanyWarning;
    }

    public Object getMailAttachmentsWidget() {
        return mailAttachmentsWidget;
    }

    public boolean getIsEnableSendByPost() {
        return isEnableSendByPost;
    }

    public boolean getIsEnableDownload() {
        return isEnableDownload;
    }

    public Object getMailBody() {
        return mailBody;
    }

    public List<ResPartner> getMailPartnerIdsAsList() {
        return mailPartnerIdsAsList;
    }

    public List<Integer> getMailPartnerIds() {
        return mailPartnerIds;
    }

    public Object getSendMailWarningMessage() {
        return sendMailWarningMessage;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMoveIdsAsList(List<AccountMove> moveIdsAsList) {
        this.moveIdsAsList = moveIdsAsList;
    }

    public void setMoveIds(List<Integer> moveIds) {
        this.moveIds = moveIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setUblPartnerWarning(String ublPartnerWarning) {
        this.ublPartnerWarning = ublPartnerWarning;
    }

    public void setIsCheckboxSendByPost(boolean isCheckboxSendByPost) {
        this.isCheckboxSendByPost = isCheckboxSendByPost;
    }

    public void setIsSendByPostReadonly(boolean isSendByPostReadonly) {
        this.isSendByPostReadonly = isSendByPostReadonly;
    }

    public void setIsSendMailReadonly(boolean isSendMailReadonly) {
        this.isSendMailReadonly = isSendMailReadonly;
    }

    public void setMode(Object mode) {
        this.mode = mode;
    }

    public void setIsEnableSendMail(boolean isEnableSendMail) {
        this.isEnableSendMail = isEnableSendMail;
    }

    public void setIsDisplayMailComposer(boolean isDisplayMailComposer) {
        this.isDisplayMailComposer = isDisplayMailComposer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailTemplateIdAsObject(MailTemplate mailTemplateIdAsObject) {
        this.mailTemplateIdAsObject = mailTemplateIdAsObject;
    }

    public void setMailTemplateId(OdooId mailTemplateId) {
        this.mailTemplateId = mailTemplateId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsCheckboxUblCiiXml(boolean isCheckboxUblCiiXml) {
        this.isCheckboxUblCiiXml = isCheckboxUblCiiXml;
    }

    public void setIsCheckboxDownload(boolean isCheckboxDownload) {
        this.isCheckboxDownload = isCheckboxDownload;
    }

    public void setSendByPostCost(int sendByPostCost) {
        this.sendByPostCost = sendByPostCost;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsEnableUblCiiXml(boolean isEnableUblCiiXml) {
        this.isEnableUblCiiXml = isEnableUblCiiXml;
    }

    public void setSendByPostWarningMessage(Object sendByPostWarningMessage) {
        this.sendByPostWarningMessage = sendByPostWarningMessage;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public void setCheckboxUblCiiLabel(String checkboxUblCiiLabel) {
        this.checkboxUblCiiLabel = checkboxUblCiiLabel;
    }

    public void setMailLang(String mailLang) {
        this.mailLang = mailLang;
    }

    public void setIsCheckboxSendMail(boolean isCheckboxSendMail) {
        this.isCheckboxSendMail = isCheckboxSendMail;
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

    public void setIsShowUblCompanyWarning(boolean isShowUblCompanyWarning) {
        this.isShowUblCompanyWarning = isShowUblCompanyWarning;
    }

    public void setMailAttachmentsWidget(Object mailAttachmentsWidget) {
        this.mailAttachmentsWidget = mailAttachmentsWidget;
    }

    public void setIsEnableSendByPost(boolean isEnableSendByPost) {
        this.isEnableSendByPost = isEnableSendByPost;
    }

    public void setIsEnableDownload(boolean isEnableDownload) {
        this.isEnableDownload = isEnableDownload;
    }

    public void setMailBody(Object mailBody) {
        this.mailBody = mailBody;
    }

    public void setMailPartnerIdsAsList(List<ResPartner> mailPartnerIdsAsList) {
        this.mailPartnerIdsAsList = mailPartnerIdsAsList;
    }

    public void setMailPartnerIds(List<Integer> mailPartnerIds) {
        this.mailPartnerIds = mailPartnerIds;
    }

    public void setSendMailWarningMessage(Object sendMailWarningMessage) {
        this.sendMailWarningMessage = sendMailWarningMessage;
    }



}