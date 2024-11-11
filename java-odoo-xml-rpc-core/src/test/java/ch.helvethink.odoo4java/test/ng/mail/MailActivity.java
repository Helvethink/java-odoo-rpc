
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
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("mail.activity")
public class MailActivity implements OdooObj {

    
    private Date writeDate;

    
    private Object note;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object activityCategory;

    
    private String resModel;

    
    private String icon;

    
    private Object dateDeadline;

    
    private String resName;

    
    private CalendarEvent calendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId calendarEventId;

    
    private Object dateDone;

    
    private boolean isHasRecommendedActivities;

    
    private Object resId;

    
    private Object state;

    
    private List<MailTemplate> mailTemplateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private List<Integer> mailTemplateIds;

    
    private int id;

    
    private MailActivityType previousActivityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId previousActivityTypeId;

    
    private Date createDate;

    
    private MailActivityType recommendedActivityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId recommendedActivityTypeId;

    
    private String summary;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private Object activityDecoration;

    
    private IrModel resModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId resModelId;

    
    private ResPartner requestPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId requestPartnerId;

    
    private boolean isCanWrite;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isAutomated;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Object chainingType;


    public MailActivity() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getActivityCategory() {
        return activityCategory;
    }

    public String getResModel() {
        return resModel;
    }

    public String getIcon() {
        return icon;
    }

    public Object getDateDeadline() {
        return dateDeadline;
    }

    public String getResName() {
        return resName;
    }

    public CalendarEvent getCalendarEventIdAsObject() {
        return calendarEventIdAsObject;
    }

    public OdooId getCalendarEventId() {
        return calendarEventId;
    }

    public Object getDateDone() {
        return dateDone;
    }

    public boolean getIsHasRecommendedActivities() {
        return isHasRecommendedActivities;
    }

    public Object getResId() {
        return resId;
    }

    public Object getState() {
        return state;
    }

    public List<MailTemplate> getMailTemplateIdsAsList() {
        return mailTemplateIdsAsList;
    }

    public List<Integer> getMailTemplateIds() {
        return mailTemplateIds;
    }

    public int getId() {
        return id;
    }

    public MailActivityType getPreviousActivityTypeIdAsObject() {
        return previousActivityTypeIdAsObject;
    }

    public OdooId getPreviousActivityTypeId() {
        return previousActivityTypeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public MailActivityType getRecommendedActivityTypeIdAsObject() {
        return recommendedActivityTypeIdAsObject;
    }

    public OdooId getRecommendedActivityTypeId() {
        return recommendedActivityTypeId;
    }

    public String getSummary() {
        return summary;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
    }

    public Object getActivityDecoration() {
        return activityDecoration;
    }

    public IrModel getResModelIdAsObject() {
        return resModelIdAsObject;
    }

    public OdooId getResModelId() {
        return resModelId;
    }

    public ResPartner getRequestPartnerIdAsObject() {
        return requestPartnerIdAsObject;
    }

    public OdooId getRequestPartnerId() {
        return requestPartnerId;
    }

    public boolean getIsCanWrite() {
        return isCanWrite;
    }

    public boolean getIsActive() {
        return isActive;
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

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public boolean getIsAutomated() {
        return isAutomated;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Object getChainingType() {
        return chainingType;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setActivityCategory(Object activityCategory) {
        this.activityCategory = activityCategory;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setDateDeadline(Object dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public void setCalendarEventIdAsObject(CalendarEvent calendarEventIdAsObject) {
        this.calendarEventIdAsObject = calendarEventIdAsObject;
    }

    public void setCalendarEventId(OdooId calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public void setDateDone(Object dateDone) {
        this.dateDone = dateDone;
    }

    public void setIsHasRecommendedActivities(boolean isHasRecommendedActivities) {
        this.isHasRecommendedActivities = isHasRecommendedActivities;
    }

    public void setResId(Object resId) {
        this.resId = resId;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setMailTemplateIdsAsList(List<MailTemplate> mailTemplateIdsAsList) {
        this.mailTemplateIdsAsList = mailTemplateIdsAsList;
    }

    public void setMailTemplateIds(List<Integer> mailTemplateIds) {
        this.mailTemplateIds = mailTemplateIds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreviousActivityTypeIdAsObject(MailActivityType previousActivityTypeIdAsObject) {
        this.previousActivityTypeIdAsObject = previousActivityTypeIdAsObject;
    }

    public void setPreviousActivityTypeId(OdooId previousActivityTypeId) {
        this.previousActivityTypeId = previousActivityTypeId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRecommendedActivityTypeIdAsObject(MailActivityType recommendedActivityTypeIdAsObject) {
        this.recommendedActivityTypeIdAsObject = recommendedActivityTypeIdAsObject;
    }

    public void setRecommendedActivityTypeId(OdooId recommendedActivityTypeId) {
        this.recommendedActivityTypeId = recommendedActivityTypeId;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setActivityDecoration(Object activityDecoration) {
        this.activityDecoration = activityDecoration;
    }

    public void setResModelIdAsObject(IrModel resModelIdAsObject) {
        this.resModelIdAsObject = resModelIdAsObject;
    }

    public void setResModelId(OdooId resModelId) {
        this.resModelId = resModelId;
    }

    public void setRequestPartnerIdAsObject(ResPartner requestPartnerIdAsObject) {
        this.requestPartnerIdAsObject = requestPartnerIdAsObject;
    }

    public void setRequestPartnerId(OdooId requestPartnerId) {
        this.requestPartnerId = requestPartnerId;
    }

    public void setIsCanWrite(boolean isCanWrite) {
        this.isCanWrite = isCanWrite;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setIsAutomated(boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setChainingType(Object chainingType) {
        this.chainingType = chainingType;
    }



}