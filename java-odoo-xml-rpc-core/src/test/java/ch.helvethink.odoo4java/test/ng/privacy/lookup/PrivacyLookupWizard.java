
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

package ch.helvethink.odoo4java.test.ng.privacy.lookup;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.privacy.PrivacyLog;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.privacy.lookup.wizard.PrivacyLookupWizardLine;
import java.util.Date;;

@OdooObject("privacy.lookup.wizard")
public class PrivacyLookupWizard implements OdooObj {

    
    private Date writeDate;

    
    private PrivacyLog logIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.privacy.PrivacyLog")
        @OdooModel("privacy.PrivacyLog")
    
    private OdooId logId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int lineCount;

    
    private Object executionDetails;

    
    private Object recordsDescription;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<PrivacyLookupWizardLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.privacy.lookup.wizard.PrivacyLookupWizardLine")
        @OdooModel("privacy.lookup.wizard.PrivacyLookupWizardLine")
    
    private List<Integer> lineIds;

    
    private String name;

    
    private int id;

    
    private Date createDate;

    
    private String email;


    public PrivacyLookupWizard() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public PrivacyLog getLogIdAsObject() {
        return logIdAsObject;
    }

    public OdooId getLogId() {
        return logId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public int getLineCount() {
        return lineCount;
    }

    public Object getExecutionDetails() {
        return executionDetails;
    }

    public Object getRecordsDescription() {
        return recordsDescription;
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

    public List<PrivacyLookupWizardLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getEmail() {
        return email;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setLogIdAsObject(PrivacyLog logIdAsObject) {
        this.logIdAsObject = logIdAsObject;
    }

    public void setLogId(OdooId logId) {
        this.logId = logId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }

    public void setExecutionDetails(Object executionDetails) {
        this.executionDetails = executionDetails;
    }

    public void setRecordsDescription(Object recordsDescription) {
        this.recordsDescription = recordsDescription;
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

    public void setLineIdsAsList(List<PrivacyLookupWizardLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}