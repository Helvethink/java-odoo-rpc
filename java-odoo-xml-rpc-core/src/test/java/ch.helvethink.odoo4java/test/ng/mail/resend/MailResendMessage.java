
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

package ch.helvethink.odoo4java.test.ng.mail.resend;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailNotification;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.resend.MailResendPartner;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.resend.message")
public class MailResendMessage implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private MailMessage mailMessageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId mailMessageId;

    
    private List<MailNotification> notificationIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailNotification")
        @OdooModel("mail.MailNotification")
    
    private List<Integer> notificationIds;

    
    private boolean isCanCancel;

    
    private boolean isCanResend;

    
    private int id;

    
    private List<MailResendPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.resend.MailResendPartner")
        @OdooModel("mail.resend.MailResendPartner")
    
    private List<Integer> partnerIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private boolean isPartnerReadonly;


    public MailResendMessage() {
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

    public MailMessage getMailMessageIdAsObject() {
        return mailMessageIdAsObject;
    }

    public OdooId getMailMessageId() {
        return mailMessageId;
    }

    public List<MailNotification> getNotificationIdsAsList() {
        return notificationIdsAsList;
    }

    public List<Integer> getNotificationIds() {
        return notificationIds;
    }

    public boolean getIsCanCancel() {
        return isCanCancel;
    }

    public boolean getIsCanResend() {
        return isCanResend;
    }

    public int getId() {
        return id;
    }

    public List<MailResendPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
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

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsPartnerReadonly() {
        return isPartnerReadonly;
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

    public void setMailMessageIdAsObject(MailMessage mailMessageIdAsObject) {
        this.mailMessageIdAsObject = mailMessageIdAsObject;
    }

    public void setMailMessageId(OdooId mailMessageId) {
        this.mailMessageId = mailMessageId;
    }

    public void setNotificationIdsAsList(List<MailNotification> notificationIdsAsList) {
        this.notificationIdsAsList = notificationIdsAsList;
    }

    public void setNotificationIds(List<Integer> notificationIds) {
        this.notificationIds = notificationIds;
    }

    public void setIsCanCancel(boolean isCanCancel) {
        this.isCanCancel = isCanCancel;
    }

    public void setIsCanResend(boolean isCanResend) {
        this.isCanResend = isCanResend;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPartnerIdsAsList(List<MailResendPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsPartnerReadonly(boolean isPartnerReadonly) {
        this.isPartnerReadonly = isPartnerReadonly;
    }



}