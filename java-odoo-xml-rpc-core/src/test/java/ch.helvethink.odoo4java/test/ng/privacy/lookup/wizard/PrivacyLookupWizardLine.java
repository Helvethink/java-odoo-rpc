
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

package ch.helvethink.odoo4java.test.ng.privacy.lookup.wizard;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.privacy.lookup.PrivacyLookupWizard;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("privacy.lookup.wizard.line")
public class PrivacyLookupWizardLine implements OdooObj {

    
    private Date writeDate;

    
    private boolean isHasActive;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private IrModel resModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId resModelId;

    
    private boolean isIsActive;

    
    private String resModel;

    
    private boolean isIsUnlinked;

    
    private String executionDetails;

    
    private String resName;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private PrivacyLookupWizard wizardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.privacy.lookup.PrivacyLookupWizard")
        @OdooModel("privacy.lookup.PrivacyLookupWizard")
    
    private OdooId wizardId;

    
    private int resId;

    
    private Object resourceRef;

    
    private int id;

    
    private Date createDate;


    public PrivacyLookupWizardLine() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsHasActive() {
        return isHasActive;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public IrModel getResModelIdAsObject() {
        return resModelIdAsObject;
    }

    public OdooId getResModelId() {
        return resModelId;
    }

    public boolean getIsIsActive() {
        return isIsActive;
    }

    public String getResModel() {
        return resModel;
    }

    public boolean getIsIsUnlinked() {
        return isIsUnlinked;
    }

    public String getExecutionDetails() {
        return executionDetails;
    }

    public String getResName() {
        return resName;
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

    public PrivacyLookupWizard getWizardIdAsObject() {
        return wizardIdAsObject;
    }

    public OdooId getWizardId() {
        return wizardId;
    }

    public int getResId() {
        return resId;
    }

    public Object getResourceRef() {
        return resourceRef;
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

    public void setIsHasActive(boolean isHasActive) {
        this.isHasActive = isHasActive;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setResModelIdAsObject(IrModel resModelIdAsObject) {
        this.resModelIdAsObject = resModelIdAsObject;
    }

    public void setResModelId(OdooId resModelId) {
        this.resModelId = resModelId;
    }

    public void setIsIsActive(boolean isIsActive) {
        this.isIsActive = isIsActive;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setIsIsUnlinked(boolean isIsUnlinked) {
        this.isIsUnlinked = isIsUnlinked;
    }

    public void setExecutionDetails(String executionDetails) {
        this.executionDetails = executionDetails;
    }

    public void setResName(String resName) {
        this.resName = resName;
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

    public void setWizardIdAsObject(PrivacyLookupWizard wizardIdAsObject) {
        this.wizardIdAsObject = wizardIdAsObject;
    }

    public void setWizardId(OdooId wizardId) {
        this.wizardId = wizardId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setResourceRef(Object resourceRef) {
        this.resourceRef = resourceRef;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}