
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

package ch.helvethink.odoo4java.test.ng.snailmail;

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsReport;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.MailNotification;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("snailmail.letter")
public class SnailmailLetter implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isColor;

    
    private String city;

    
    private boolean isDuplex;

    
    private boolean isCover;

    
    private String infoMsg;

    
    private String reference;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String street;

    
    private int resId;

    
    private IrAttachment attachmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId attachmentId;

    
    private String model;

    
    private Object state;

    
    private String street2;

    
    private ResCountryState stateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId stateId;

    
    private int id;

    
    private Date createDate;

    
    private String zip;

    
    private String attachmentFname;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private MailMessage messageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId messageId;

    
    private IrActionsReport reportTemplateAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsReport")
        @OdooModel("ir.actions.IrActionsReport")
    
    private OdooId reportTemplate;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private List<MailNotification> notificationIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailNotification")
        @OdooModel("mail.MailNotification")
    
    private List<Integer> notificationIds;

    
    private Object errorCode;

    
    private Object attachmentDatas;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;


    public SnailmailLetter() {
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

    public boolean getIsColor() {
        return isColor;
    }

    public String getCity() {
        return city;
    }

    public boolean getIsDuplex() {
        return isDuplex;
    }

    public boolean getIsCover() {
        return isCover;
    }

    public String getInfoMsg() {
        return infoMsg;
    }

    public String getReference() {
        return reference;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getStreet() {
        return street;
    }

    public int getResId() {
        return resId;
    }

    public IrAttachment getAttachmentIdAsObject() {
        return attachmentIdAsObject;
    }

    public OdooId getAttachmentId() {
        return attachmentId;
    }

    public String getModel() {
        return model;
    }

    public Object getState() {
        return state;
    }

    public String getStreet2() {
        return street2;
    }

    public ResCountryState getStateIdAsObject() {
        return stateIdAsObject;
    }

    public OdooId getStateId() {
        return stateId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getZip() {
        return zip;
    }

    public String getAttachmentFname() {
        return attachmentFname;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public MailMessage getMessageIdAsObject() {
        return messageIdAsObject;
    }

    public OdooId getMessageId() {
        return messageId;
    }

    public IrActionsReport getReportTemplateAsObject() {
        return reportTemplateAsObject;
    }

    public OdooId getReportTemplate() {
        return reportTemplate;
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

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public List<MailNotification> getNotificationIdsAsList() {
        return notificationIdsAsList;
    }

    public List<Integer> getNotificationIds() {
        return notificationIds;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    public Object getAttachmentDatas() {
        return attachmentDatas;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
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

    public void setIsColor(boolean isColor) {
        this.isColor = isColor;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setIsDuplex(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public void setIsCover(boolean isCover) {
        this.isCover = isCover;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setAttachmentIdAsObject(IrAttachment attachmentIdAsObject) {
        this.attachmentIdAsObject = attachmentIdAsObject;
    }

    public void setAttachmentId(OdooId attachmentId) {
        this.attachmentId = attachmentId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setStateIdAsObject(ResCountryState stateIdAsObject) {
        this.stateIdAsObject = stateIdAsObject;
    }

    public void setStateId(OdooId stateId) {
        this.stateId = stateId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setAttachmentFname(String attachmentFname) {
        this.attachmentFname = attachmentFname;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setMessageIdAsObject(MailMessage messageIdAsObject) {
        this.messageIdAsObject = messageIdAsObject;
    }

    public void setMessageId(OdooId messageId) {
        this.messageId = messageId;
    }

    public void setReportTemplateAsObject(IrActionsReport reportTemplateAsObject) {
        this.reportTemplateAsObject = reportTemplateAsObject;
    }

    public void setReportTemplate(OdooId reportTemplate) {
        this.reportTemplate = reportTemplate;
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

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setNotificationIdsAsList(List<MailNotification> notificationIdsAsList) {
        this.notificationIdsAsList = notificationIdsAsList;
    }

    public void setNotificationIds(List<Integer> notificationIds) {
        this.notificationIds = notificationIds;
    }

    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public void setAttachmentDatas(Object attachmentDatas) {
        this.attachmentDatas = attachmentDatas;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}