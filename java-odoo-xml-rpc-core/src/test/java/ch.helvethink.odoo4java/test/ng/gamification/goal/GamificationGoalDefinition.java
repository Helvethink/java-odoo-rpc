
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

package ch.helvethink.odoo4java.test.ng.gamification.goal;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields;
import java.util.Date;;

@OdooObject("gamification.goal.definition")
public class GamificationGoalDefinition implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object displayMode;

    
    private Object description;

    
    private boolean isBatchMode;

    
    private List<IrModel> modelInheritedIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private List<Integer> modelInheritedIds;

    
    private String suffix;

    
    private IrActionsAct_window actionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window")
        @OdooModel("ir.actions.IrActionsAct_window")
    
    private OdooId actionId;

    
    private String fullSuffix;

    
    private int id;

    
    private Object computationMode;

    
    private IrModelFields batchDistinctiveFieldAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId batchDistinctiveField;

    
    private Date createDate;

    
    private IrModelFields fieldDateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId fieldDateId;

    
    private IrModelFields fieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId fieldId;

    
    private boolean isMonetary;

    
    private Object computeCode;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object condition;

    
    private String batchUserExpression;

    
    private String domain;

    
    private String name;

    
    private String resIdField;


    public GamificationGoalDefinition() {
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

    public Object getDisplayMode() {
        return displayMode;
    }

    public Object getDescription() {
        return description;
    }

    public boolean getIsBatchMode() {
        return isBatchMode;
    }

    public List<IrModel> getModelInheritedIdsAsList() {
        return modelInheritedIdsAsList;
    }

    public List<Integer> getModelInheritedIds() {
        return modelInheritedIds;
    }

    public String getSuffix() {
        return suffix;
    }

    public IrActionsAct_window getActionIdAsObject() {
        return actionIdAsObject;
    }

    public OdooId getActionId() {
        return actionId;
    }

    public String getFullSuffix() {
        return fullSuffix;
    }

    public int getId() {
        return id;
    }

    public Object getComputationMode() {
        return computationMode;
    }

    public IrModelFields getBatchDistinctiveFieldAsObject() {
        return batchDistinctiveFieldAsObject;
    }

    public OdooId getBatchDistinctiveField() {
        return batchDistinctiveField;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public IrModelFields getFieldDateIdAsObject() {
        return fieldDateIdAsObject;
    }

    public OdooId getFieldDateId() {
        return fieldDateId;
    }

    public IrModelFields getFieldIdAsObject() {
        return fieldIdAsObject;
    }

    public OdooId getFieldId() {
        return fieldId;
    }

    public boolean getIsMonetary() {
        return isMonetary;
    }

    public Object getComputeCode() {
        return computeCode;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
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

    public Object getCondition() {
        return condition;
    }

    public String getBatchUserExpression() {
        return batchUserExpression;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getResIdField() {
        return resIdField;
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

    public void setDisplayMode(Object displayMode) {
        this.displayMode = displayMode;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setIsBatchMode(boolean isBatchMode) {
        this.isBatchMode = isBatchMode;
    }

    public void setModelInheritedIdsAsList(List<IrModel> modelInheritedIdsAsList) {
        this.modelInheritedIdsAsList = modelInheritedIdsAsList;
    }

    public void setModelInheritedIds(List<Integer> modelInheritedIds) {
        this.modelInheritedIds = modelInheritedIds;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setActionIdAsObject(IrActionsAct_window actionIdAsObject) {
        this.actionIdAsObject = actionIdAsObject;
    }

    public void setActionId(OdooId actionId) {
        this.actionId = actionId;
    }

    public void setFullSuffix(String fullSuffix) {
        this.fullSuffix = fullSuffix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComputationMode(Object computationMode) {
        this.computationMode = computationMode;
    }

    public void setBatchDistinctiveFieldAsObject(IrModelFields batchDistinctiveFieldAsObject) {
        this.batchDistinctiveFieldAsObject = batchDistinctiveFieldAsObject;
    }

    public void setBatchDistinctiveField(OdooId batchDistinctiveField) {
        this.batchDistinctiveField = batchDistinctiveField;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setFieldDateIdAsObject(IrModelFields fieldDateIdAsObject) {
        this.fieldDateIdAsObject = fieldDateIdAsObject;
    }

    public void setFieldDateId(OdooId fieldDateId) {
        this.fieldDateId = fieldDateId;
    }

    public void setFieldIdAsObject(IrModelFields fieldIdAsObject) {
        this.fieldIdAsObject = fieldIdAsObject;
    }

    public void setFieldId(OdooId fieldId) {
        this.fieldId = fieldId;
    }

    public void setIsMonetary(boolean isMonetary) {
        this.isMonetary = isMonetary;
    }

    public void setComputeCode(Object computeCode) {
        this.computeCode = computeCode;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
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

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    public void setBatchUserExpression(String batchUserExpression) {
        this.batchUserExpression = batchUserExpression;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResIdField(String resIdField) {
        this.resIdField = resIdField;
    }



}