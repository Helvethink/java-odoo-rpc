
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

package ch.helvethink.odoo4java.test.ng.hr.employee.cv;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.employee.cv.wizard")
public class HrEmployeeCvWizard implements OdooObj {

    
    private Date writeDate;

    
    private boolean isCanShowOthers;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<HrEmployee> employeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> employeeIds;

    
    private boolean isShowSkills;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String colorPrimary;

    
    private boolean isShowOthers;

    
    private String colorSecondary;

    
    private boolean isShowContact;

    
    private int id;

    
    private boolean isCanShowSkills;

    
    private Date createDate;


    public HrEmployeeCvWizard() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsCanShowOthers() {
        return isCanShowOthers;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<HrEmployee> getEmployeeIdsAsList() {
        return employeeIdsAsList;
    }

    public List<Integer> getEmployeeIds() {
        return employeeIds;
    }

    public boolean getIsShowSkills() {
        return isShowSkills;
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

    public String getColorPrimary() {
        return colorPrimary;
    }

    public boolean getIsShowOthers() {
        return isShowOthers;
    }

    public String getColorSecondary() {
        return colorSecondary;
    }

    public boolean getIsShowContact() {
        return isShowContact;
    }

    public int getId() {
        return id;
    }

    public boolean getIsCanShowSkills() {
        return isCanShowSkills;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsCanShowOthers(boolean isCanShowOthers) {
        this.isCanShowOthers = isCanShowOthers;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setEmployeeIdsAsList(List<HrEmployee> employeeIdsAsList) {
        this.employeeIdsAsList = employeeIdsAsList;
    }

    public void setEmployeeIds(List<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public void setIsShowSkills(boolean isShowSkills) {
        this.isShowSkills = isShowSkills;
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

    public void setColorPrimary(String colorPrimary) {
        this.colorPrimary = colorPrimary;
    }

    public void setIsShowOthers(boolean isShowOthers) {
        this.isShowOthers = isShowOthers;
    }

    public void setColorSecondary(String colorSecondary) {
        this.colorSecondary = colorSecondary;
    }

    public void setIsShowContact(boolean isShowContact) {
        this.isShowContact = isShowContact;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsCanShowSkills(boolean isCanShowSkills) {
        this.isCanShowSkills = isCanShowSkills;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}