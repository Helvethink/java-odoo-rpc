
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

package ch.helvethink.odoo4java.test.ng.ir.actions;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.ir.actions.act_window.IrActionsAct_windowView;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;;

@OdooObject("ir.actions.act_window")
public class IrActionsAct_window implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String resModel;

    
    private String viewMode;

    
    private String usage;

    
    private String type;

    
    private IrUiView searchViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId searchViewId;

    
    private List<ResGroups> groupsIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupsId;

    
    private List<IrActionsAct_windowView> viewIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.act_window.IrActionsAct_windowView")
        @OdooModel("ir.actions.act_window.IrActionsAct_windowView")
    
    private List<Integer> viewIds;

    
    private IrModel bindingModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId bindingModelId;

    
    private int resId;

    
    private String context;

    
    private int limit;

    
    private String bindingViewTypes;

    
    private int id;

    
    private Date createDate;

    
    private Object views;

    
    private Object bindingType;

    
    private IrUiView viewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId viewId;

    
    private String mobileViewMode;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object target;

    
    private boolean isFilter;

    
    private Object help;

    
    private String domain;

    
    private String name;

    
    private String xmlId;


    public IrActionsAct_window() {
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

    public String getResModel() {
        return resModel;
    }

    public String getViewMode() {
        return viewMode;
    }

    public String getUsage() {
        return usage;
    }

    public String getType() {
        return type;
    }

    public IrUiView getSearchViewIdAsObject() {
        return searchViewIdAsObject;
    }

    public OdooId getSearchViewId() {
        return searchViewId;
    }

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public List<IrActionsAct_windowView> getViewIdsAsList() {
        return viewIdsAsList;
    }

    public List<Integer> getViewIds() {
        return viewIds;
    }

    public IrModel getBindingModelIdAsObject() {
        return bindingModelIdAsObject;
    }

    public OdooId getBindingModelId() {
        return bindingModelId;
    }

    public int getResId() {
        return resId;
    }

    public String getContext() {
        return context;
    }

    public int getLimit() {
        return limit;
    }

    public String getBindingViewTypes() {
        return bindingViewTypes;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getViews() {
        return views;
    }

    public Object getBindingType() {
        return bindingType;
    }

    public IrUiView getViewIdAsObject() {
        return viewIdAsObject;
    }

    public OdooId getViewId() {
        return viewId;
    }

    public String getMobileViewMode() {
        return mobileViewMode;
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

    public Object getTarget() {
        return target;
    }

    public boolean getIsFilter() {
        return isFilter;
    }

    public Object getHelp() {
        return help;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getXmlId() {
        return xmlId;
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

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setViewMode(String viewMode) {
        this.viewMode = viewMode;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSearchViewIdAsObject(IrUiView searchViewIdAsObject) {
        this.searchViewIdAsObject = searchViewIdAsObject;
    }

    public void setSearchViewId(OdooId searchViewId) {
        this.searchViewId = searchViewId;
    }

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setViewIdsAsList(List<IrActionsAct_windowView> viewIdsAsList) {
        this.viewIdsAsList = viewIdsAsList;
    }

    public void setViewIds(List<Integer> viewIds) {
        this.viewIds = viewIds;
    }

    public void setBindingModelIdAsObject(IrModel bindingModelIdAsObject) {
        this.bindingModelIdAsObject = bindingModelIdAsObject;
    }

    public void setBindingModelId(OdooId bindingModelId) {
        this.bindingModelId = bindingModelId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setBindingViewTypes(String bindingViewTypes) {
        this.bindingViewTypes = bindingViewTypes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setViews(Object views) {
        this.views = views;
    }

    public void setBindingType(Object bindingType) {
        this.bindingType = bindingType;
    }

    public void setViewIdAsObject(IrUiView viewIdAsObject) {
        this.viewIdAsObject = viewIdAsObject;
    }

    public void setViewId(OdooId viewId) {
        this.viewId = viewId;
    }

    public void setMobileViewMode(String mobileViewMode) {
        this.mobileViewMode = mobileViewMode;
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

    public void setTarget(Object target) {
        this.target = target;
    }

    public void setIsFilter(boolean isFilter) {
        this.isFilter = isFilter;
    }

    public void setHelp(Object help) {
        this.help = help;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }



}