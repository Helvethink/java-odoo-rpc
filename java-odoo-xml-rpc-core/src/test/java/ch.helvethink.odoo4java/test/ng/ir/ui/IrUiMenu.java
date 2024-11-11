
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

package ch.helvethink.odoo4java.test.ng.ir.ui;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiMenu;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;;

@OdooObject("ir.ui.menu")
public class IrUiMenu implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object webIconData;

    
    private boolean isActive;

    
    private String webIcon;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<ResGroups> groupsIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupsId;

    
    private int sequence;

    
    private String completeName;

    
    private List<IrUiMenu> childIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiMenu")
        @OdooModel("ir.ui.IrUiMenu")
    
    private List<Integer> childId;

    
    private IrUiMenu parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiMenu")
        @OdooModel("ir.ui.IrUiMenu")
    
    private OdooId parentId;

    
    private String name;

    
    private Object action;

    
    private String parentPath;

    
    private int id;

    
    private Date createDate;


    public IrUiMenu() {
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

    public Object getWebIconData() {
        return webIconData;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getWebIcon() {
        return webIcon;
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

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCompleteName() {
        return completeName;
    }

    public List<IrUiMenu> getChildIdAsList() {
        return childIdAsList;
    }

    public List<Integer> getChildId() {
        return childId;
    }

    public IrUiMenu getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public Object getAction() {
        return action;
    }

    public String getParentPath() {
        return parentPath;
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

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setWebIconData(Object webIconData) {
        this.webIconData = webIconData;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setWebIcon(String webIcon) {
        this.webIcon = webIcon;
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

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setChildIdAsList(List<IrUiMenu> childIdAsList) {
        this.childIdAsList = childIdAsList;
    }

    public void setChildId(List<Integer> childId) {
        this.childId = childId;
    }

    public void setParentIdAsObject(IrUiMenu parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}