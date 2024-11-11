
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

package ch.helvethink.odoo4java.test.ng.ir.model;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import ch.helvethink.odoo4java.test.ng.ir.model.fields.IrModelFieldsSelection;;

@OdooObject("ir.model.fields")
public class IrModelFields implements OdooObj {

    
    private String column1;

    
    private String currencyField;

    
    private Date writeDate;

    
    private boolean isCopied;

    
    private boolean isSelectable;

    
    private String column2;

    
    private boolean isWebsiteFormBlacklisted;

    
    private boolean isSanitizeOverridable;

    
    private int tracking;

    
    private boolean isRequired;

    
    private boolean isTranslate;

    
    private String relation;

    
    private Object compute;

    
    private boolean isReadonly;

    
    private String relationField;

    
    private String model;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private String depends;

    
    private IrModelFields relationFieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId relationFieldId;

    
    private boolean isIndex;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String modules;

    
    private boolean isSanitizeForm;

    
    private String selection;

    
    private int size;

    
    private Object ttype;

    
    private String domain;

    
    private String name;

    
    private IrModelFields relatedFieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId relatedFieldId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String fieldDescription;

    
    private Object onDelete;

    
    private boolean isStripClasses;

    
    private String completeName;

    
    private String related;

    
    private boolean isSanitizeStyle;

    
    private boolean isGroupExpand;

    
    private boolean isSanitizeTags;

    
    private List<ResGroups> groupsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groups;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private boolean isStore;

    
    private String relationTable;

    
    private Object help;

    
    private boolean isStripStyle;

    
    private boolean isSanitizeAttributes;

    
    private List<IrModelFieldsSelection> selectionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.fields.IrModelFieldsSelection")
        @OdooModel("ir.model.fields.IrModelFieldsSelection")
    
    private List<Integer> selectionIds;

    
    private boolean isSanitize;


    public IrModelFields() {
    // Constructor
    }


    public String getColumn1() {
        return column1;
    }

    public String getCurrencyField() {
        return currencyField;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsCopied() {
        return isCopied;
    }

    public boolean getIsSelectable() {
        return isSelectable;
    }

    public String getColumn2() {
        return column2;
    }

    public boolean getIsWebsiteFormBlacklisted() {
        return isWebsiteFormBlacklisted;
    }

    public boolean getIsSanitizeOverridable() {
        return isSanitizeOverridable;
    }

    public int getTracking() {
        return tracking;
    }

    public boolean getIsRequired() {
        return isRequired;
    }

    public boolean getIsTranslate() {
        return isTranslate;
    }

    public String getRelation() {
        return relation;
    }

    public Object getCompute() {
        return compute;
    }

    public boolean getIsReadonly() {
        return isReadonly;
    }

    public String getRelationField() {
        return relationField;
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

    public String getDepends() {
        return depends;
    }

    public IrModelFields getRelationFieldIdAsObject() {
        return relationFieldIdAsObject;
    }

    public OdooId getRelationFieldId() {
        return relationFieldId;
    }

    public boolean getIsIndex() {
        return isIndex;
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

    public String getModules() {
        return modules;
    }

    public boolean getIsSanitizeForm() {
        return isSanitizeForm;
    }

    public String getSelection() {
        return selection;
    }

    public int getSize() {
        return size;
    }

    public Object getTtype() {
        return ttype;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public IrModelFields getRelatedFieldIdAsObject() {
        return relatedFieldIdAsObject;
    }

    public OdooId getRelatedFieldId() {
        return relatedFieldId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getFieldDescription() {
        return fieldDescription;
    }

    public Object getOnDelete() {
        return onDelete;
    }

    public boolean getIsStripClasses() {
        return isStripClasses;
    }

    public String getCompleteName() {
        return completeName;
    }

    public String getRelated() {
        return related;
    }

    public boolean getIsSanitizeStyle() {
        return isSanitizeStyle;
    }

    public boolean getIsGroupExpand() {
        return isGroupExpand;
    }

    public boolean getIsSanitizeTags() {
        return isSanitizeTags;
    }

    public List<ResGroups> getGroupsAsList() {
        return groupsAsList;
    }

    public List<Integer> getGroups() {
        return groups;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public boolean getIsStore() {
        return isStore;
    }

    public String getRelationTable() {
        return relationTable;
    }

    public Object getHelp() {
        return help;
    }

    public boolean getIsStripStyle() {
        return isStripStyle;
    }

    public boolean getIsSanitizeAttributes() {
        return isSanitizeAttributes;
    }

    public List<IrModelFieldsSelection> getSelectionIdsAsList() {
        return selectionIdsAsList;
    }

    public List<Integer> getSelectionIds() {
        return selectionIds;
    }

    public boolean getIsSanitize() {
        return isSanitize;
    }



    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public void setCurrencyField(String currencyField) {
        this.currencyField = currencyField;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsCopied(boolean isCopied) {
        this.isCopied = isCopied;
    }

    public void setIsSelectable(boolean isSelectable) {
        this.isSelectable = isSelectable;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public void setIsWebsiteFormBlacklisted(boolean isWebsiteFormBlacklisted) {
        this.isWebsiteFormBlacklisted = isWebsiteFormBlacklisted;
    }

    public void setIsSanitizeOverridable(boolean isSanitizeOverridable) {
        this.isSanitizeOverridable = isSanitizeOverridable;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public void setIsTranslate(boolean isTranslate) {
        this.isTranslate = isTranslate;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setCompute(Object compute) {
        this.compute = compute;
    }

    public void setIsReadonly(boolean isReadonly) {
        this.isReadonly = isReadonly;
    }

    public void setRelationField(String relationField) {
        this.relationField = relationField;
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

    public void setDepends(String depends) {
        this.depends = depends;
    }

    public void setRelationFieldIdAsObject(IrModelFields relationFieldIdAsObject) {
        this.relationFieldIdAsObject = relationFieldIdAsObject;
    }

    public void setRelationFieldId(OdooId relationFieldId) {
        this.relationFieldId = relationFieldId;
    }

    public void setIsIndex(boolean isIndex) {
        this.isIndex = isIndex;
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

    public void setModules(String modules) {
        this.modules = modules;
    }

    public void setIsSanitizeForm(boolean isSanitizeForm) {
        this.isSanitizeForm = isSanitizeForm;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTtype(Object ttype) {
        this.ttype = ttype;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelatedFieldIdAsObject(IrModelFields relatedFieldIdAsObject) {
        this.relatedFieldIdAsObject = relatedFieldIdAsObject;
    }

    public void setRelatedFieldId(OdooId relatedFieldId) {
        this.relatedFieldId = relatedFieldId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    public void setOnDelete(Object onDelete) {
        this.onDelete = onDelete;
    }

    public void setIsStripClasses(boolean isStripClasses) {
        this.isStripClasses = isStripClasses;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public void setIsSanitizeStyle(boolean isSanitizeStyle) {
        this.isSanitizeStyle = isSanitizeStyle;
    }

    public void setIsGroupExpand(boolean isGroupExpand) {
        this.isGroupExpand = isGroupExpand;
    }

    public void setIsSanitizeTags(boolean isSanitizeTags) {
        this.isSanitizeTags = isSanitizeTags;
    }

    public void setGroupsAsList(List<ResGroups> groupsAsList) {
        this.groupsAsList = groupsAsList;
    }

    public void setGroups(List<Integer> groups) {
        this.groups = groups;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setIsStore(boolean isStore) {
        this.isStore = isStore;
    }

    public void setRelationTable(String relationTable) {
        this.relationTable = relationTable;
    }

    public void setHelp(Object help) {
        this.help = help;
    }

    public void setIsStripStyle(boolean isStripStyle) {
        this.isStripStyle = isStripStyle;
    }

    public void setIsSanitizeAttributes(boolean isSanitizeAttributes) {
        this.isSanitizeAttributes = isSanitizeAttributes;
    }

    public void setSelectionIdsAsList(List<IrModelFieldsSelection> selectionIdsAsList) {
        this.selectionIdsAsList = selectionIdsAsList;
    }

    public void setSelectionIds(List<Integer> selectionIds) {
        this.selectionIds = selectionIds;
    }

    public void setIsSanitize(boolean isSanitize) {
        this.isSanitize = isSanitize;
    }



}