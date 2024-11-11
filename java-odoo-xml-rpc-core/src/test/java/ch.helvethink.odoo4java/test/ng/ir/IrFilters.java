
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
import ch.helvethink.odoo4java.test.ng.ir.actions.Actions;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("ir.filters")
public class IrFilters implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isActive;

    
    private Object sort;

    
    private Object modelId;

    
    private boolean isIsDefault;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Actions actionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.Actions")
        @OdooModel("ir.actions.Actions")
    
    private OdooId actionId;

    
    private Object domain;

    
    private String name;

    
    private Object context;

    
    private int id;

    
    private Date createDate;


    public IrFilters() {
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

    public boolean getIsActive() {
        return isActive;
    }

    public Object getSort() {
        return sort;
    }

    public Object getModelId() {
        return modelId;
    }

    public boolean getIsIsDefault() {
        return isIsDefault;
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

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Actions getActionIdAsObject() {
        return actionIdAsObject;
    }

    public OdooId getActionId() {
        return actionId;
    }

    public Object getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public Object getContext() {
        return context;
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

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public void setModelId(Object modelId) {
        this.modelId = modelId;
    }

    public void setIsIsDefault(boolean isIsDefault) {
        this.isIsDefault = isIsDefault;
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

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setActionIdAsObject(Actions actionIdAsObject) {
        this.actionIdAsObject = actionIdAsObject;
    }

    public void setActionId(OdooId actionId) {
        this.actionId = actionId;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContext(Object context) {
        this.context = context;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}