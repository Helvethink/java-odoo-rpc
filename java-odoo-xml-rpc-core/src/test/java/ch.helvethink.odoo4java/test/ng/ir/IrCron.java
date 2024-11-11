
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

package ch.helvethink.odoo4java.test.ng.ir;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsServer;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sms.SmsTemplate;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.model.fields.IrModelFieldsSelection;;

@OdooObject("ir.cron")
public class IrCron implements OdooObj {

    
    private Date writeDate;

    
    private int numbercall;

    
    private boolean isDoall;

    
    private IrModelFields linkFieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId linkFieldId;

    
    private Object usage;

    
    private IrModel updateRelatedModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId updateRelatedModelId;

    
    private Object updateBooleanValue;

    
    private String type;

    
    private Object updateM2mOperation;

    
    private Object mailPostMethod;

    
    private String modelName;

    
    private String updatePath;

    
    private IrModel bindingModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId bindingModelId;

    
    private Object activityNote;

    
    private int id;

    
    private Object state;

    
    private Date createDate;

    
    private List<IrModelFields> webhookFieldIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private List<Integer> webhookFieldIds;

    
    private Object intervalType;

    
    private Object bindingType;

    
    private int intervalNumber;

    
    private boolean isActive;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private int priority;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private IrModel crudModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId crudModelId;

    
    private String cronName;

    
    private int sequence;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String name;

    
    private String crudModelName;

    
    private String xmlId;

    
    private Date nextcall;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object code;

    
    private Object evaluationType;

    
    private List<IrActionsServer> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsServer")
        @OdooModel("ir.actions.IrActionsServer")
    
    private List<Integer> childIds;

    
    private List<ResGroups> groupsIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupsId;

    
    private IrActionsServer irActionsServerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsServer")
        @OdooModel("ir.actions.IrActionsServer")
    
    private OdooId irActionsServerId;

    
    private IrModelFields updateFieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId updateFieldId;

    
    private SmsTemplate smsTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sms.SmsTemplate")
        @OdooModel("sms.SmsTemplate")
    
    private OdooId smsTemplateId;

    
    private boolean isMailPostAutofollow;

    
    private int activityDateDeadlineRange;

    
    private String bindingViewTypes;

    
    private Object webhookSamplePayload;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private Object value;

    
    private Object activityUserType;

    
    private String webhookUrl;

    
    private String websitePath;

    
    private boolean isWebsitePublished;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private Object valueFieldToShow;

    
    private IrModelFieldsSelection selectionValueAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.fields.IrModelFieldsSelection")
        @OdooModel("ir.model.fields.IrModelFieldsSelection")
    
    private OdooId selectionValue;

    
    private Object help;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private String websiteUrl;

    
    private List<IrModel> availableModelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private List<Integer> availableModelIds;

    
    private String activitySummary;

    
    private Object resourceRef;

    
    private Object smsMethod;

    
    private MailTemplate templateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId templateId;

    
    private Object activityDateDeadlineRangeType;

    
    private String activityUserFieldName;

    
    private Date lastcall;

    
    private Object updateFieldType;


    public IrCron() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getNumbercall() {
        return numbercall;
    }

    public boolean getIsDoall() {
        return isDoall;
    }

    public IrModelFields getLinkFieldIdAsObject() {
        return linkFieldIdAsObject;
    }

    public OdooId getLinkFieldId() {
        return linkFieldId;
    }

    public Object getUsage() {
        return usage;
    }

    public IrModel getUpdateRelatedModelIdAsObject() {
        return updateRelatedModelIdAsObject;
    }

    public OdooId getUpdateRelatedModelId() {
        return updateRelatedModelId;
    }

    public Object getUpdateBooleanValue() {
        return updateBooleanValue;
    }

    public String getType() {
        return type;
    }

    public Object getUpdateM2mOperation() {
        return updateM2mOperation;
    }

    public Object getMailPostMethod() {
        return mailPostMethod;
    }

    public String getModelName() {
        return modelName;
    }

    public String getUpdatePath() {
        return updatePath;
    }

    public IrModel getBindingModelIdAsObject() {
        return bindingModelIdAsObject;
    }

    public OdooId getBindingModelId() {
        return bindingModelId;
    }

    public Object getActivityNote() {
        return activityNote;
    }

    public int getId() {
        return id;
    }

    public Object getState() {
        return state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<IrModelFields> getWebhookFieldIdsAsList() {
        return webhookFieldIdsAsList;
    }

    public List<Integer> getWebhookFieldIds() {
        return webhookFieldIds;
    }

    public Object getIntervalType() {
        return intervalType;
    }

    public Object getBindingType() {
        return bindingType;
    }

    public int getIntervalNumber() {
        return intervalNumber;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public int getPriority() {
        return priority;
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

    public IrModel getCrudModelIdAsObject() {
        return crudModelIdAsObject;
    }

    public OdooId getCrudModelId() {
        return crudModelId;
    }

    public String getCronName() {
        return cronName;
    }

    public int getSequence() {
        return sequence;
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

    public String getCrudModelName() {
        return crudModelName;
    }

    public String getXmlId() {
        return xmlId;
    }

    public Date getNextcall() {
        return nextcall;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getCode() {
        return code;
    }

    public Object getEvaluationType() {
        return evaluationType;
    }

    public List<IrActionsServer> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public IrActionsServer getIrActionsServerIdAsObject() {
        return irActionsServerIdAsObject;
    }

    public OdooId getIrActionsServerId() {
        return irActionsServerId;
    }

    public IrModelFields getUpdateFieldIdAsObject() {
        return updateFieldIdAsObject;
    }

    public OdooId getUpdateFieldId() {
        return updateFieldId;
    }

    public SmsTemplate getSmsTemplateIdAsObject() {
        return smsTemplateIdAsObject;
    }

    public OdooId getSmsTemplateId() {
        return smsTemplateId;
    }

    public boolean getIsMailPostAutofollow() {
        return isMailPostAutofollow;
    }

    public int getActivityDateDeadlineRange() {
        return activityDateDeadlineRange;
    }

    public String getBindingViewTypes() {
        return bindingViewTypes;
    }

    public Object getWebhookSamplePayload() {
        return webhookSamplePayload;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public Object getValue() {
        return value;
    }

    public Object getActivityUserType() {
        return activityUserType;
    }

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public String getWebsitePath() {
        return websitePath;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public Object getValueFieldToShow() {
        return valueFieldToShow;
    }

    public IrModelFieldsSelection getSelectionValueAsObject() {
        return selectionValueAsObject;
    }

    public OdooId getSelectionValue() {
        return selectionValue;
    }

    public Object getHelp() {
        return help;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public List<IrModel> getAvailableModelIdsAsList() {
        return availableModelIdsAsList;
    }

    public List<Integer> getAvailableModelIds() {
        return availableModelIds;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public Object getResourceRef() {
        return resourceRef;
    }

    public Object getSmsMethod() {
        return smsMethod;
    }

    public MailTemplate getTemplateIdAsObject() {
        return templateIdAsObject;
    }

    public OdooId getTemplateId() {
        return templateId;
    }

    public Object getActivityDateDeadlineRangeType() {
        return activityDateDeadlineRangeType;
    }

    public String getActivityUserFieldName() {
        return activityUserFieldName;
    }

    public Date getLastcall() {
        return lastcall;
    }

    public Object getUpdateFieldType() {
        return updateFieldType;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setNumbercall(int numbercall) {
        this.numbercall = numbercall;
    }

    public void setIsDoall(boolean isDoall) {
        this.isDoall = isDoall;
    }

    public void setLinkFieldIdAsObject(IrModelFields linkFieldIdAsObject) {
        this.linkFieldIdAsObject = linkFieldIdAsObject;
    }

    public void setLinkFieldId(OdooId linkFieldId) {
        this.linkFieldId = linkFieldId;
    }

    public void setUsage(Object usage) {
        this.usage = usage;
    }

    public void setUpdateRelatedModelIdAsObject(IrModel updateRelatedModelIdAsObject) {
        this.updateRelatedModelIdAsObject = updateRelatedModelIdAsObject;
    }

    public void setUpdateRelatedModelId(OdooId updateRelatedModelId) {
        this.updateRelatedModelId = updateRelatedModelId;
    }

    public void setUpdateBooleanValue(Object updateBooleanValue) {
        this.updateBooleanValue = updateBooleanValue;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUpdateM2mOperation(Object updateM2mOperation) {
        this.updateM2mOperation = updateM2mOperation;
    }

    public void setMailPostMethod(Object mailPostMethod) {
        this.mailPostMethod = mailPostMethod;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setUpdatePath(String updatePath) {
        this.updatePath = updatePath;
    }

    public void setBindingModelIdAsObject(IrModel bindingModelIdAsObject) {
        this.bindingModelIdAsObject = bindingModelIdAsObject;
    }

    public void setBindingModelId(OdooId bindingModelId) {
        this.bindingModelId = bindingModelId;
    }

    public void setActivityNote(Object activityNote) {
        this.activityNote = activityNote;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setWebhookFieldIdsAsList(List<IrModelFields> webhookFieldIdsAsList) {
        this.webhookFieldIdsAsList = webhookFieldIdsAsList;
    }

    public void setWebhookFieldIds(List<Integer> webhookFieldIds) {
        this.webhookFieldIds = webhookFieldIds;
    }

    public void setIntervalType(Object intervalType) {
        this.intervalType = intervalType;
    }

    public void setBindingType(Object bindingType) {
        this.bindingType = bindingType;
    }

    public void setIntervalNumber(int intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

    public void setCrudModelIdAsObject(IrModel crudModelIdAsObject) {
        this.crudModelIdAsObject = crudModelIdAsObject;
    }

    public void setCrudModelId(OdooId crudModelId) {
        this.crudModelId = crudModelId;
    }

    public void setCronName(String cronName) {
        this.cronName = cronName;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
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

    public void setCrudModelName(String crudModelName) {
        this.crudModelName = crudModelName;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }

    public void setNextcall(Date nextcall) {
        this.nextcall = nextcall;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public void setEvaluationType(Object evaluationType) {
        this.evaluationType = evaluationType;
    }

    public void setChildIdsAsList(List<IrActionsServer> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setIrActionsServerIdAsObject(IrActionsServer irActionsServerIdAsObject) {
        this.irActionsServerIdAsObject = irActionsServerIdAsObject;
    }

    public void setIrActionsServerId(OdooId irActionsServerId) {
        this.irActionsServerId = irActionsServerId;
    }

    public void setUpdateFieldIdAsObject(IrModelFields updateFieldIdAsObject) {
        this.updateFieldIdAsObject = updateFieldIdAsObject;
    }

    public void setUpdateFieldId(OdooId updateFieldId) {
        this.updateFieldId = updateFieldId;
    }

    public void setSmsTemplateIdAsObject(SmsTemplate smsTemplateIdAsObject) {
        this.smsTemplateIdAsObject = smsTemplateIdAsObject;
    }

    public void setSmsTemplateId(OdooId smsTemplateId) {
        this.smsTemplateId = smsTemplateId;
    }

    public void setIsMailPostAutofollow(boolean isMailPostAutofollow) {
        this.isMailPostAutofollow = isMailPostAutofollow;
    }

    public void setActivityDateDeadlineRange(int activityDateDeadlineRange) {
        this.activityDateDeadlineRange = activityDateDeadlineRange;
    }

    public void setBindingViewTypes(String bindingViewTypes) {
        this.bindingViewTypes = bindingViewTypes;
    }

    public void setWebhookSamplePayload(Object webhookSamplePayload) {
        this.webhookSamplePayload = webhookSamplePayload;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setActivityUserType(Object activityUserType) {
        this.activityUserType = activityUserType;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public void setWebsitePath(String websitePath) {
        this.websitePath = websitePath;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setValueFieldToShow(Object valueFieldToShow) {
        this.valueFieldToShow = valueFieldToShow;
    }

    public void setSelectionValueAsObject(IrModelFieldsSelection selectionValueAsObject) {
        this.selectionValueAsObject = selectionValueAsObject;
    }

    public void setSelectionValue(OdooId selectionValue) {
        this.selectionValue = selectionValue;
    }

    public void setHelp(Object help) {
        this.help = help;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setAvailableModelIdsAsList(List<IrModel> availableModelIdsAsList) {
        this.availableModelIdsAsList = availableModelIdsAsList;
    }

    public void setAvailableModelIds(List<Integer> availableModelIds) {
        this.availableModelIds = availableModelIds;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setResourceRef(Object resourceRef) {
        this.resourceRef = resourceRef;
    }

    public void setSmsMethod(Object smsMethod) {
        this.smsMethod = smsMethod;
    }

    public void setTemplateIdAsObject(MailTemplate templateIdAsObject) {
        this.templateIdAsObject = templateIdAsObject;
    }

    public void setTemplateId(OdooId templateId) {
        this.templateId = templateId;
    }

    public void setActivityDateDeadlineRangeType(Object activityDateDeadlineRangeType) {
        this.activityDateDeadlineRangeType = activityDateDeadlineRangeType;
    }

    public void setActivityUserFieldName(String activityUserFieldName) {
        this.activityUserFieldName = activityUserFieldName;
    }

    public void setLastcall(Date lastcall) {
        this.lastcall = lastcall;
    }

    public void setUpdateFieldType(Object updateFieldType) {
        this.updateFieldType = updateFieldType;
    }



}