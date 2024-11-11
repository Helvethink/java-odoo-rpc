
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

package ch.helvethink.odoo4java.test.ng.ir.module;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.module.Module;
import ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("ir.module.category")
public class IrModuleCategory implements OdooObj {

    
    private Date writeDate;

    
    private List<Module> moduleIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private List<Integer> moduleIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isVisible;

    
    private Object description;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<IrModuleCategory> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory")
        @OdooModel("ir.module.IrModuleCategory")
    
    private List<Integer> childIds;

    
    private int sequence;

    
    private IrModuleCategory parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory")
        @OdooModel("ir.module.IrModuleCategory")
    
    private OdooId parentId;

    
    private String name;

    
    private boolean isExclusive;

    
    private String xmlId;

    
    private int id;

    
    private Date createDate;


    public IrModuleCategory() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<Module> getModuleIdsAsList() {
        return moduleIdsAsList;
    }

    public List<Integer> getModuleIds() {
        return moduleIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public Object getDescription() {
        return description;
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

    public List<IrModuleCategory> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public int getSequence() {
        return sequence;
    }

    public IrModuleCategory getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public boolean getIsExclusive() {
        return isExclusive;
    }

    public String getXmlId() {
        return xmlId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setModuleIdsAsList(List<Module> moduleIdsAsList) {
        this.moduleIdsAsList = moduleIdsAsList;
    }

    public void setModuleIds(List<Integer> moduleIds) {
        this.moduleIds = moduleIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public void setDescription(Object description) {
        this.description = description;
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

    public void setChildIdsAsList(List<IrModuleCategory> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setParentIdAsObject(IrModuleCategory parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsExclusive(boolean isExclusive) {
        this.isExclusive = isExclusive;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}