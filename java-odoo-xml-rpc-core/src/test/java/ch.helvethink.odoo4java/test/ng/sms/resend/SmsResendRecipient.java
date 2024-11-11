
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

package ch.helvethink.odoo4java.test.ng.sms.resend;

import ch.helvethink.odoo4java.test.ng.mail.MailNotification;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.sms.SmsResend;;

@OdooObject("sms.resend.recipient")
public class SmsResendRecipient implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String partnerName;

    
    private Object failureType;

    
    private MailNotification notificationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailNotification")
        @OdooModel("mail.MailNotification")
    
    private OdooId notificationId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private SmsResend smsResendIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sms.SmsResend")
        @OdooModel("sms.SmsResend")
    
    private OdooId smsResendId;

    
    private boolean isResend;

    
    private int id;

    
    private Date createDate;

    
    private String smsNumber;


    public SmsResendRecipient() {
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

    public String getPartnerName() {
        return partnerName;
    }

    public Object getFailureType() {
        return failureType;
    }

    public MailNotification getNotificationIdAsObject() {
        return notificationIdAsObject;
    }

    public OdooId getNotificationId() {
        return notificationId;
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

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public SmsResend getSmsResendIdAsObject() {
        return smsResendIdAsObject;
    }

    public OdooId getSmsResendId() {
        return smsResendId;
    }

    public boolean getIsResend() {
        return isResend;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getSmsNumber() {
        return smsNumber;
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

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public void setFailureType(Object failureType) {
        this.failureType = failureType;
    }

    public void setNotificationIdAsObject(MailNotification notificationIdAsObject) {
        this.notificationIdAsObject = notificationIdAsObject;
    }

    public void setNotificationId(OdooId notificationId) {
        this.notificationId = notificationId;
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

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setSmsResendIdAsObject(SmsResend smsResendIdAsObject) {
        this.smsResendIdAsObject = smsResendIdAsObject;
    }

    public void setSmsResendId(OdooId smsResendId) {
        this.smsResendId = smsResendId;
    }

    public void setIsResend(boolean isResend) {
        this.isResend = isResend;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }



}