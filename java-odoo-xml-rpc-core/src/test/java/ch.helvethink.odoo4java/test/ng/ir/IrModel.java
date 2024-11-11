
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
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelAccess;
import ch.helvethink.odoo4java.test.ng.ir.IrRule;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;;

@OdooObject("ir.model")
public class IrModel implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsMailActivity;

    
    private boolean isWebsiteFormAccess;

    
    private boolean isIsMailBlacklist;

    
    private List<IrUiView> viewIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private List<Integer> viewIds;

    
    private IrModelFields websiteFormDefaultFieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId websiteFormDefaultFieldId;

    
    private String model;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private String order;

    
    private Object info;

    
    private List<IrModelFields> fieldIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private List<Integer> fieldId;

    
    private String websiteFormLabel;

    
    private int count;

    
    private boolean isIsMailThread;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<IrModelAccess> accessIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelAccess")
        @OdooModel("ir.model.IrModelAccess")
    
    private List<Integer> accessIds;

    
    private String modules;

    
    private List<IrRule> ruleIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrRule")
        @OdooModel("ir.IrRule")
    
    private List<Integer> ruleIds;

    
    private boolean isTransient;

    
    private String websiteFormKey;

    
    private String name;

    
    private boolean isIsMailThreadSms;

    
    private List<IrModel> inheritedModelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private List<Integer> inheritedModelIds;


    public IrModel() {
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

    public boolean getIsIsMailActivity() {
        return isIsMailActivity;
    }

    public boolean getIsWebsiteFormAccess() {
        return isWebsiteFormAccess;
    }

    public boolean getIsIsMailBlacklist() {
        return isIsMailBlacklist;
    }

    public List<IrUiView> getViewIdsAsList() {
        return viewIdsAsList;
    }

    public List<Integer> getViewIds() {
        return viewIds;
    }

    public IrModelFields getWebsiteFormDefaultFieldIdAsObject() {
        return websiteFormDefaultFieldIdAsObject;
    }

    public OdooId getWebsiteFormDefaultFieldId() {
        return websiteFormDefaultFieldId;
    }

    public String getModel() {
        return model;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getOrder() {
        return order;
    }

    public Object getInfo() {
        return info;
    }

    public List<IrModelFields> getFieldIdAsList() {
        return fieldIdAsList;
    }

    public List<Integer> getFieldId() {
        return fieldId;
    }

    public String getWebsiteFormLabel() {
        return websiteFormLabel;
    }

    public int getCount() {
        return count;
    }

    public boolean getIsIsMailThread() {
        return isIsMailThread;
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

    public List<IrModelAccess> getAccessIdsAsList() {
        return accessIdsAsList;
    }

    public List<Integer> getAccessIds() {
        return accessIds;
    }

    public String getModules() {
        return modules;
    }

    public List<IrRule> getRuleIdsAsList() {
        return ruleIdsAsList;
    }

    public List<Integer> getRuleIds() {
        return ruleIds;
    }

    public boolean getIsTransient() {
        return isTransient;
    }

    public String getWebsiteFormKey() {
        return websiteFormKey;
    }

    public String getName() {
        return name;
    }

    public boolean getIsIsMailThreadSms() {
        return isIsMailThreadSms;
    }

    public List<IrModel> getInheritedModelIdsAsList() {
        return inheritedModelIdsAsList;
    }

    public List<Integer> getInheritedModelIds() {
        return inheritedModelIds;
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

    public void setIsIsMailActivity(boolean isIsMailActivity) {
        this.isIsMailActivity = isIsMailActivity;
    }

    public void setIsWebsiteFormAccess(boolean isWebsiteFormAccess) {
        this.isWebsiteFormAccess = isWebsiteFormAccess;
    }

    public void setIsIsMailBlacklist(boolean isIsMailBlacklist) {
        this.isIsMailBlacklist = isIsMailBlacklist;
    }

    public void setViewIdsAsList(List<IrUiView> viewIdsAsList) {
        this.viewIdsAsList = viewIdsAsList;
    }

    public void setViewIds(List<Integer> viewIds) {
        this.viewIds = viewIds;
    }

    public void setWebsiteFormDefaultFieldIdAsObject(IrModelFields websiteFormDefaultFieldIdAsObject) {
        this.websiteFormDefaultFieldIdAsObject = websiteFormDefaultFieldIdAsObject;
    }

    public void setWebsiteFormDefaultFieldId(OdooId websiteFormDefaultFieldId) {
        this.websiteFormDefaultFieldId = websiteFormDefaultFieldId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setFieldIdAsList(List<IrModelFields> fieldIdAsList) {
        this.fieldIdAsList = fieldIdAsList;
    }

    public void setFieldId(List<Integer> fieldId) {
        this.fieldId = fieldId;
    }

    public void setWebsiteFormLabel(String websiteFormLabel) {
        this.websiteFormLabel = websiteFormLabel;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIsIsMailThread(boolean isIsMailThread) {
        this.isIsMailThread = isIsMailThread;
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

    public void setAccessIdsAsList(List<IrModelAccess> accessIdsAsList) {
        this.accessIdsAsList = accessIdsAsList;
    }

    public void setAccessIds(List<Integer> accessIds) {
        this.accessIds = accessIds;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    public void setRuleIdsAsList(List<IrRule> ruleIdsAsList) {
        this.ruleIdsAsList = ruleIdsAsList;
    }

    public void setRuleIds(List<Integer> ruleIds) {
        this.ruleIds = ruleIds;
    }

    public void setIsTransient(boolean isTransient) {
        this.isTransient = isTransient;
    }

    public void setWebsiteFormKey(String websiteFormKey) {
        this.websiteFormKey = websiteFormKey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsIsMailThreadSms(boolean isIsMailThreadSms) {
        this.isIsMailThreadSms = isIsMailThreadSms;
    }

    public void setInheritedModelIdsAsList(List<IrModel> inheritedModelIdsAsList) {
        this.inheritedModelIdsAsList = inheritedModelIdsAsList;
    }

    public void setInheritedModelIds(List<Integer> inheritedModelIds) {
        this.inheritedModelIds = inheritedModelIds;
    }



}