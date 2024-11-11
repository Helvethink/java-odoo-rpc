
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
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.mail.Mail;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.snailmail.SnailmailLetter;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.sms.SmsTracker;
import ch.helvethink.odoo4java.test.ng.sms.Sms;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("mail.notification")
public class MailNotification implements OdooObj {

    
    private Object notificationType;

    
    private int smsIdInt;

    
    private MailMessage mailMessageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId mailMessageId;

    
    private Object failureType;

    
    private Object notificationStatus;

    
    private Object failureReason;

    
    private SnailmailLetter letterIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.snailmail.SnailmailLetter")
        @OdooModel("snailmail.SnailmailLetter")
    
    private OdooId letterId;

    
    private String displayName;

    
    private List<SmsTracker> smsTrackerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sms.SmsTracker")
        @OdooModel("sms.SmsTracker")
    
    private List<Integer> smsTrackerIds;

    
    private Date readDate;

    
    private boolean isIsRead;

    
    private Sms smsIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sms.Sms")
        @OdooModel("sms.Sms")
    
    private OdooId smsId;

    
    private ResPartner resPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId resPartnerId;

    
    private Mail mailMailIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.Mail")
        @OdooModel("mail.Mail")
    
    private OdooId mailMailId;

    
    private int id;

    
    private ResPartner authorIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId authorId;

    
    private String smsNumber;


    public MailNotification() {
    // Constructor
    }


    public Object getNotificationType() {
        return notificationType;
    }

    public int getSmsIdInt() {
        return smsIdInt;
    }

    public MailMessage getMailMessageIdAsObject() {
        return mailMessageIdAsObject;
    }

    public OdooId getMailMessageId() {
        return mailMessageId;
    }

    public Object getFailureType() {
        return failureType;
    }

    public Object getNotificationStatus() {
        return notificationStatus;
    }

    public Object getFailureReason() {
        return failureReason;
    }

    public SnailmailLetter getLetterIdAsObject() {
        return letterIdAsObject;
    }

    public OdooId getLetterId() {
        return letterId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<SmsTracker> getSmsTrackerIdsAsList() {
        return smsTrackerIdsAsList;
    }

    public List<Integer> getSmsTrackerIds() {
        return smsTrackerIds;
    }

    public Date getReadDate() {
        return readDate;
    }

    public boolean getIsIsRead() {
        return isIsRead;
    }

    public Sms getSmsIdAsObject() {
        return smsIdAsObject;
    }

    public OdooId getSmsId() {
        return smsId;
    }

    public ResPartner getResPartnerIdAsObject() {
        return resPartnerIdAsObject;
    }

    public OdooId getResPartnerId() {
        return resPartnerId;
    }

    public Mail getMailMailIdAsObject() {
        return mailMailIdAsObject;
    }

    public OdooId getMailMailId() {
        return mailMailId;
    }

    public int getId() {
        return id;
    }

    public ResPartner getAuthorIdAsObject() {
        return authorIdAsObject;
    }

    public OdooId getAuthorId() {
        return authorId;
    }

    public String getSmsNumber() {
        return smsNumber;
    }



    public void setNotificationType(Object notificationType) {
        this.notificationType = notificationType;
    }

    public void setSmsIdInt(int smsIdInt) {
        this.smsIdInt = smsIdInt;
    }

    public void setMailMessageIdAsObject(MailMessage mailMessageIdAsObject) {
        this.mailMessageIdAsObject = mailMessageIdAsObject;
    }

    public void setMailMessageId(OdooId mailMessageId) {
        this.mailMessageId = mailMessageId;
    }

    public void setFailureType(Object failureType) {
        this.failureType = failureType;
    }

    public void setNotificationStatus(Object notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public void setFailureReason(Object failureReason) {
        this.failureReason = failureReason;
    }

    public void setLetterIdAsObject(SnailmailLetter letterIdAsObject) {
        this.letterIdAsObject = letterIdAsObject;
    }

    public void setLetterId(OdooId letterId) {
        this.letterId = letterId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setSmsTrackerIdsAsList(List<SmsTracker> smsTrackerIdsAsList) {
        this.smsTrackerIdsAsList = smsTrackerIdsAsList;
    }

    public void setSmsTrackerIds(List<Integer> smsTrackerIds) {
        this.smsTrackerIds = smsTrackerIds;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public void setIsIsRead(boolean isIsRead) {
        this.isIsRead = isIsRead;
    }

    public void setSmsIdAsObject(Sms smsIdAsObject) {
        this.smsIdAsObject = smsIdAsObject;
    }

    public void setSmsId(OdooId smsId) {
        this.smsId = smsId;
    }

    public void setResPartnerIdAsObject(ResPartner resPartnerIdAsObject) {
        this.resPartnerIdAsObject = resPartnerIdAsObject;
    }

    public void setResPartnerId(OdooId resPartnerId) {
        this.resPartnerId = resPartnerId;
    }

    public void setMailMailIdAsObject(Mail mailMailIdAsObject) {
        this.mailMailIdAsObject = mailMailIdAsObject;
    }

    public void setMailMailId(OdooId mailMailId) {
        this.mailMailId = mailMailId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthorIdAsObject(ResPartner authorIdAsObject) {
        this.authorIdAsObject = authorIdAsObject;
    }

    public void setAuthorId(OdooId authorId) {
        this.authorId = authorId;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }



}