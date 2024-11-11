
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

package ch.helvethink.odoo4java.test.ng.res;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelAccess;
import ch.helvethink.odoo4java.test.ng.ir.IrRule;
import ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiMenu;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;;

@OdooObject("res.groups")
public class ResGroups implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int color;

    
    private List<IrUiMenu> menuAccessAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiMenu")
        @OdooModel("ir.ui.IrUiMenu")
    
    private List<Integer> menuAccess;

    
    private List<IrModelAccess> modelAccessAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelAccess")
        @OdooModel("ir.model.IrModelAccess")
    
    private List<Integer> modelAccess;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<ResUsers> usersAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> users;

    
    private List<IrUiView> viewAccessAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private List<Integer> viewAccess;

    
    private String fullName;

    
    private IrModuleCategory categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory")
        @OdooModel("ir.module.IrModuleCategory")
    
    private OdooId categoryId;

    
    private List<ResGroups> impliedIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> impliedIds;

    
    private List<ResGroups> transImpliedIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> transImpliedIds;

    
    private String name;

    
    private Object comment;

    
    private boolean isShare;

    
    private int id;

    
    private List<IrRule> ruleGroupsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrRule")
        @OdooModel("ir.IrRule")
    
    private List<Integer> ruleGroups;

    
    private Date createDate;


    public ResGroups() {
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

    public int getColor() {
        return color;
    }

    public List<IrUiMenu> getMenuAccessAsList() {
        return menuAccessAsList;
    }

    public List<Integer> getMenuAccess() {
        return menuAccess;
    }

    public List<IrModelAccess> getModelAccessAsList() {
        return modelAccessAsList;
    }

    public List<Integer> getModelAccess() {
        return modelAccess;
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

    public List<ResUsers> getUsersAsList() {
        return usersAsList;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public List<IrUiView> getViewAccessAsList() {
        return viewAccessAsList;
    }

    public List<Integer> getViewAccess() {
        return viewAccess;
    }

    public String getFullName() {
        return fullName;
    }

    public IrModuleCategory getCategoryIdAsObject() {
        return categoryIdAsObject;
    }

    public OdooId getCategoryId() {
        return categoryId;
    }

    public List<ResGroups> getImpliedIdsAsList() {
        return impliedIdsAsList;
    }

    public List<Integer> getImpliedIds() {
        return impliedIds;
    }

    public List<ResGroups> getTransImpliedIdsAsList() {
        return transImpliedIdsAsList;
    }

    public List<Integer> getTransImpliedIds() {
        return transImpliedIds;
    }

    public String getName() {
        return name;
    }

    public Object getComment() {
        return comment;
    }

    public boolean getIsShare() {
        return isShare;
    }

    public int getId() {
        return id;
    }

    public List<IrRule> getRuleGroupsAsList() {
        return ruleGroupsAsList;
    }

    public List<Integer> getRuleGroups() {
        return ruleGroups;
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

    public void setColor(int color) {
        this.color = color;
    }

    public void setMenuAccessAsList(List<IrUiMenu> menuAccessAsList) {
        this.menuAccessAsList = menuAccessAsList;
    }

    public void setMenuAccess(List<Integer> menuAccess) {
        this.menuAccess = menuAccess;
    }

    public void setModelAccessAsList(List<IrModelAccess> modelAccessAsList) {
        this.modelAccessAsList = modelAccessAsList;
    }

    public void setModelAccess(List<Integer> modelAccess) {
        this.modelAccess = modelAccess;
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

    public void setUsersAsList(List<ResUsers> usersAsList) {
        this.usersAsList = usersAsList;
    }

    public void setUsers(List<Integer> users) {
        this.users = users;
    }

    public void setViewAccessAsList(List<IrUiView> viewAccessAsList) {
        this.viewAccessAsList = viewAccessAsList;
    }

    public void setViewAccess(List<Integer> viewAccess) {
        this.viewAccess = viewAccess;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCategoryIdAsObject(IrModuleCategory categoryIdAsObject) {
        this.categoryIdAsObject = categoryIdAsObject;
    }

    public void setCategoryId(OdooId categoryId) {
        this.categoryId = categoryId;
    }

    public void setImpliedIdsAsList(List<ResGroups> impliedIdsAsList) {
        this.impliedIdsAsList = impliedIdsAsList;
    }

    public void setImpliedIds(List<Integer> impliedIds) {
        this.impliedIds = impliedIds;
    }

    public void setTransImpliedIdsAsList(List<ResGroups> transImpliedIdsAsList) {
        this.transImpliedIdsAsList = transImpliedIdsAsList;
    }

    public void setTransImpliedIds(List<Integer> transImpliedIds) {
        this.transImpliedIds = transImpliedIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public void setIsShare(boolean isShare) {
        this.isShare = isShare;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRuleGroupsAsList(List<IrRule> ruleGroupsAsList) {
        this.ruleGroupsAsList = ruleGroupsAsList;
    }

    public void setRuleGroups(List<Integer> ruleGroups) {
        this.ruleGroups = ruleGroups;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}