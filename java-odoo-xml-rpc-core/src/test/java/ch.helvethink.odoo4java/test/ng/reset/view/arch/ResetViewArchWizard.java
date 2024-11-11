
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

package ch.helvethink.odoo4java.test.ng.reset.view.arch;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;
import java.util.Date;;

@OdooObject("reset.view.arch.wizard")
public class ResetViewArchWizard implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object resetMode;

    
    private IrUiView viewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId viewId;

    
    private Object archToCompare;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object archDiff;

    
    private boolean isHasDiff;

    
    private int id;

    
    private Date createDate;

    
    private IrUiView compareViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId compareViewId;

    
    private String viewName;


    public ResetViewArchWizard() {
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

    public Object getResetMode() {
        return resetMode;
    }

    public IrUiView getViewIdAsObject() {
        return viewIdAsObject;
    }

    public OdooId getViewId() {
        return viewId;
    }

    public Object getArchToCompare() {
        return archToCompare;
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

    public Object getArchDiff() {
        return archDiff;
    }

    public boolean getIsHasDiff() {
        return isHasDiff;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public IrUiView getCompareViewIdAsObject() {
        return compareViewIdAsObject;
    }

    public OdooId getCompareViewId() {
        return compareViewId;
    }

    public String getViewName() {
        return viewName;
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

    public void setResetMode(Object resetMode) {
        this.resetMode = resetMode;
    }

    public void setViewIdAsObject(IrUiView viewIdAsObject) {
        this.viewIdAsObject = viewIdAsObject;
    }

    public void setViewId(OdooId viewId) {
        this.viewId = viewId;
    }

    public void setArchToCompare(Object archToCompare) {
        this.archToCompare = archToCompare;
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

    public void setArchDiff(Object archDiff) {
        this.archDiff = archDiff;
    }

    public void setIsHasDiff(boolean isHasDiff) {
        this.isHasDiff = isHasDiff;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCompareViewIdAsObject(IrUiView compareViewIdAsObject) {
        this.compareViewIdAsObject = compareViewIdAsObject;
    }

    public void setCompareViewId(OdooId compareViewId) {
        this.compareViewId = compareViewId;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }



}