
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

package ch.helvethink.odoo4java.test.ng.ir.actions.act_window;

import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;
import java.util.Date;;

@OdooObject("ir.actions.act_window.view")
public class IrActionsAct_windowView implements OdooObj {

    
    private Date writeDate;

    
    private int sequence;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private IrActionsAct_window actWindowIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window")
        @OdooModel("ir.actions.IrActionsAct_window")
    
    private OdooId actWindowId;

    
    private IrUiView viewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId viewId;

    
    private Object viewMode;

    
    private int id;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private boolean isMulti;


    public IrActionsAct_windowView() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getSequence() {
        return sequence;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public IrActionsAct_window getActWindowIdAsObject() {
        return actWindowIdAsObject;
    }

    public OdooId getActWindowId() {
        return actWindowId;
    }

    public IrUiView getViewIdAsObject() {
        return viewIdAsObject;
    }

    public OdooId getViewId() {
        return viewId;
    }

    public Object getViewMode() {
        return viewMode;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsMulti() {
        return isMulti;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setActWindowIdAsObject(IrActionsAct_window actWindowIdAsObject) {
        this.actWindowIdAsObject = actWindowIdAsObject;
    }

    public void setActWindowId(OdooId actWindowId) {
        this.actWindowId = actWindowId;
    }

    public void setViewIdAsObject(IrUiView viewIdAsObject) {
        this.viewIdAsObject = viewIdAsObject;
    }

    public void setViewId(OdooId viewId) {
        this.viewId = viewId;
    }

    public void setViewMode(Object viewMode) {
        this.viewMode = viewMode;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsMulti(boolean isMulti) {
        this.isMulti = isMulti;
    }



}