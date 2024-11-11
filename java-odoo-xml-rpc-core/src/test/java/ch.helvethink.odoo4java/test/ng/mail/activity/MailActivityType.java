
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

package ch.helvethink.odoo4java.test.ng.mail.activity;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.activity.type")
public class MailActivityType implements OdooObj {

    
    private Date writeDate;

    
    private Object decorationType;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private MailActivityType triggeredNextTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId triggeredNextTypeId;

    
    private int delayCount;

    
    private Object resModel;

    
    private String icon;

    
    private Object defaultNote;

    
    private boolean isResModelChange;

    
    private List<MailActivityType> previousTypeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private List<Integer> previousTypeIds;

    
    private Object delayUnit;

    
    private ResUsers defaultUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId defaultUserId;

    
    private List<MailTemplate> mailTemplateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private List<Integer> mailTemplateIds;

    
    private int id;

    
    private Date createDate;

    
    private String summary;

    
    private Object initialResModel;

    
    private boolean isActive;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String displayName;

    
    private int sequence;

    
    private List<MailActivityType> suggestedNextTypeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private List<Integer> suggestedNextTypeIds;

    
    private boolean isKeepDone;

    
    private String delayLabel;

    
    private Object delayFrom;

    
    private String name;

    
    private Object chainingType;

    
    private Object category;


    public MailActivityType() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getDecorationType() {
        return decorationType;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public MailActivityType getTriggeredNextTypeIdAsObject() {
        return triggeredNextTypeIdAsObject;
    }

    public OdooId getTriggeredNextTypeId() {
        return triggeredNextTypeId;
    }

    public int getDelayCount() {
        return delayCount;
    }

    public Object getResModel() {
        return resModel;
    }

    public String getIcon() {
        return icon;
    }

    public Object getDefaultNote() {
        return defaultNote;
    }

    public boolean getIsResModelChange() {
        return isResModelChange;
    }

    public List<MailActivityType> getPreviousTypeIdsAsList() {
        return previousTypeIdsAsList;
    }

    public List<Integer> getPreviousTypeIds() {
        return previousTypeIds;
    }

    public Object getDelayUnit() {
        return delayUnit;
    }

    public ResUsers getDefaultUserIdAsObject() {
        return defaultUserIdAsObject;
    }

    public OdooId getDefaultUserId() {
        return defaultUserId;
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

    public Date getCreateDate() {
        return createDate;
    }

    public String getSummary() {
        return summary;
    }

    public Object getInitialResModel() {
        return initialResModel;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getSequence() {
        return sequence;
    }

    public List<MailActivityType> getSuggestedNextTypeIdsAsList() {
        return suggestedNextTypeIdsAsList;
    }

    public List<Integer> getSuggestedNextTypeIds() {
        return suggestedNextTypeIds;
    }

    public boolean getIsKeepDone() {
        return isKeepDone;
    }

    public String getDelayLabel() {
        return delayLabel;
    }

    public Object getDelayFrom() {
        return delayFrom;
    }

    public String getName() {
        return name;
    }

    public Object getChainingType() {
        return chainingType;
    }

    public Object getCategory() {
        return category;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setDecorationType(Object decorationType) {
        this.decorationType = decorationType;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setTriggeredNextTypeIdAsObject(MailActivityType triggeredNextTypeIdAsObject) {
        this.triggeredNextTypeIdAsObject = triggeredNextTypeIdAsObject;
    }

    public void setTriggeredNextTypeId(OdooId triggeredNextTypeId) {
        this.triggeredNextTypeId = triggeredNextTypeId;
    }

    public void setDelayCount(int delayCount) {
        this.delayCount = delayCount;
    }

    public void setResModel(Object resModel) {
        this.resModel = resModel;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setDefaultNote(Object defaultNote) {
        this.defaultNote = defaultNote;
    }

    public void setIsResModelChange(boolean isResModelChange) {
        this.isResModelChange = isResModelChange;
    }

    public void setPreviousTypeIdsAsList(List<MailActivityType> previousTypeIdsAsList) {
        this.previousTypeIdsAsList = previousTypeIdsAsList;
    }

    public void setPreviousTypeIds(List<Integer> previousTypeIds) {
        this.previousTypeIds = previousTypeIds;
    }

    public void setDelayUnit(Object delayUnit) {
        this.delayUnit = delayUnit;
    }

    public void setDefaultUserIdAsObject(ResUsers defaultUserIdAsObject) {
        this.defaultUserIdAsObject = defaultUserIdAsObject;
    }

    public void setDefaultUserId(OdooId defaultUserId) {
        this.defaultUserId = defaultUserId;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setInitialResModel(Object initialResModel) {
        this.initialResModel = initialResModel;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setSuggestedNextTypeIdsAsList(List<MailActivityType> suggestedNextTypeIdsAsList) {
        this.suggestedNextTypeIdsAsList = suggestedNextTypeIdsAsList;
    }

    public void setSuggestedNextTypeIds(List<Integer> suggestedNextTypeIds) {
        this.suggestedNextTypeIds = suggestedNextTypeIds;
    }

    public void setIsKeepDone(boolean isKeepDone) {
        this.isKeepDone = isKeepDone;
    }

    public void setDelayLabel(String delayLabel) {
        this.delayLabel = delayLabel;
    }

    public void setDelayFrom(Object delayFrom) {
        this.delayFrom = delayFrom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChainingType(Object chainingType) {
        this.chainingType = chainingType;
    }

    public void setCategory(Object category) {
        this.category = category;
    }



}