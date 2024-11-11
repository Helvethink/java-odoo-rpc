
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

package ch.helvethink.odoo4java.test.ng.hr.leave.employee.type;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType;
import ch.helvethink.odoo4java.models.OdooModel;
import java.util.Date;;

@OdooObject("hr.leave.employee.type.report")
public class HrLeaveEmployeeTypeReport implements OdooObj {

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private double numberOfDays;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private HrLeaveType leaveTypeAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType")
        @OdooModel("hr.leave.HrLeaveType")
    
    private OdooId leaveType;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private boolean isActiveEmployee;

    
    private Object holidayStatus;

    
    private Object state;

    
    private Date dateTo;

    
    private int id;

    
    private String displayName;

    
    private Date dateFrom;


    public HrLeaveEmployeeTypeReport() {
    // Constructor
    }


    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public double getNumberOfDays() {
        return numberOfDays;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public HrLeaveType getLeaveTypeAsObject() {
        return leaveTypeAsObject;
    }

    public OdooId getLeaveType() {
        return leaveType;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public boolean getIsActiveEmployee() {
        return isActiveEmployee;
    }

    public Object getHolidayStatus() {
        return holidayStatus;
    }

    public Object getState() {
        return state;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Date getDateFrom() {
        return dateFrom;
    }



    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setLeaveTypeAsObject(HrLeaveType leaveTypeAsObject) {
        this.leaveTypeAsObject = leaveTypeAsObject;
    }

    public void setLeaveType(OdooId leaveType) {
        this.leaveType = leaveType;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setIsActiveEmployee(boolean isActiveEmployee) {
        this.isActiveEmployee = isActiveEmployee;
    }

    public void setHolidayStatus(Object holidayStatus) {
        this.holidayStatus = holidayStatus;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }



}