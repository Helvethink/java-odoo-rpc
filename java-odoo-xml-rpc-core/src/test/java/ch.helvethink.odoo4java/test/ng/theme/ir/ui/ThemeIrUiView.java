
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

package ch.helvethink.odoo4java.test.ng.theme.ir.ui;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;
import java.util.Date;;

@OdooObject("theme.ir.ui.view")
public class ThemeIrUiView implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object inheritId;

    
    private boolean isActive;

    
    private String type;

    
    private int priority;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object mode;

    
    private List<IrUiView> copyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private List<Integer> copyIds;

    
    private boolean isCustomizeShow;

    
    private String name;

    
    private Object arch;

    
    private int id;

    
    private Date createDate;

    
    private String key;

    
    private String archFs;


    public ThemeIrUiView() {
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

    public Object getInheritId() {
        return inheritId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
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

    public Object getMode() {
        return mode;
    }

    public List<IrUiView> getCopyIdsAsList() {
        return copyIdsAsList;
    }

    public List<Integer> getCopyIds() {
        return copyIds;
    }

    public boolean getIsCustomizeShow() {
        return isCustomizeShow;
    }

    public String getName() {
        return name;
    }

    public Object getArch() {
        return arch;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getKey() {
        return key;
    }

    public String getArchFs() {
        return archFs;
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

    public void setInheritId(Object inheritId) {
        this.inheritId = inheritId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

    public void setMode(Object mode) {
        this.mode = mode;
    }

    public void setCopyIdsAsList(List<IrUiView> copyIdsAsList) {
        this.copyIdsAsList = copyIdsAsList;
    }

    public void setCopyIds(List<Integer> copyIds) {
        this.copyIds = copyIds;
    }

    public void setIsCustomizeShow(boolean isCustomizeShow) {
        this.isCustomizeShow = isCustomizeShow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArch(Object arch) {
        this.arch = arch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setArchFs(String archFs) {
        this.archFs = archFs;
    }



}