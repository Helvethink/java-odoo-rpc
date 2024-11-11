
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
import ch.helvethink.odoo4java.test.ng.ir.module.Module;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.demo_failure.IrDemo_failureWizard;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("ir.demo_failure")
public class IrDemo_failure implements OdooObj {

    
    private Date writeDate;

    
    private IrDemo_failureWizard wizardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.demo_failure.IrDemo_failureWizard")
        @OdooModel("ir.demo_failure.IrDemo_failureWizard")
    
    private OdooId wizardId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Module moduleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private OdooId moduleId;

    
    private int id;

    
    private String error;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;


    public IrDemo_failure() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public IrDemo_failureWizard getWizardIdAsObject() {
        return wizardIdAsObject;
    }

    public OdooId getWizardId() {
        return wizardId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Module getModuleIdAsObject() {
        return moduleIdAsObject;
    }

    public OdooId getModuleId() {
        return moduleId;
    }

    public int getId() {
        return id;
    }

    public String getError() {
        return error;
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



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWizardIdAsObject(IrDemo_failureWizard wizardIdAsObject) {
        this.wizardIdAsObject = wizardIdAsObject;
    }

    public void setWizardId(OdooId wizardId) {
        this.wizardId = wizardId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setModuleIdAsObject(Module moduleIdAsObject) {
        this.moduleIdAsObject = moduleIdAsObject;
    }

    public void setModuleId(OdooId moduleId) {
        this.moduleId = moduleId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setError(String error) {
        this.error = error;
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



}