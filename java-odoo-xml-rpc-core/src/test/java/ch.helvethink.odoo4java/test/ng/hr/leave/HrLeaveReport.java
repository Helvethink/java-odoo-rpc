
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

package ch.helvethink.odoo4java.test.ng.hr.leave;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.HrLeave;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType;
import ch.helvethink.odoo4java.models.OdooModel;
import java.util.Date;;

@OdooObject("hr.leave.report")
public class HrLeaveReport implements OdooObj {

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private double numberOfDays;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private HrLeave leaveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrLeave")
        @OdooModel("hr.HrLeave")
    
    private OdooId leaveId;

    
    private Date dateTo;

    
    private String displayName;

    
    private HrEmployeeCategory categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory")
        @OdooModel("hr.employee.HrEmployeeCategory")
    
    private OdooId categoryId;

    
    private Object leaveType;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private Object state;

    
    private int id;

    
    private HrLeaveType holidayStatusIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType")
        @OdooModel("hr.leave.HrLeaveType")
    
    private OdooId holidayStatusId;

    
    private Object holidayType;

    
    private Date dateFrom;


    public HrLeaveReport() {
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

    public HrLeave getLeaveIdAsObject() {
        return leaveIdAsObject;
    }

    public OdooId getLeaveId() {
        return leaveId;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public HrEmployeeCategory getCategoryIdAsObject() {
        return categoryIdAsObject;
    }

    public OdooId getCategoryId() {
        return categoryId;
    }

    public Object getLeaveType() {
        return leaveType;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public HrLeaveType getHolidayStatusIdAsObject() {
        return holidayStatusIdAsObject;
    }

    public OdooId getHolidayStatusId() {
        return holidayStatusId;
    }

    public Object getHolidayType() {
        return holidayType;
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

    public void setLeaveIdAsObject(HrLeave leaveIdAsObject) {
        this.leaveIdAsObject = leaveIdAsObject;
    }

    public void setLeaveId(OdooId leaveId) {
        this.leaveId = leaveId;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCategoryIdAsObject(HrEmployeeCategory categoryIdAsObject) {
        this.categoryIdAsObject = categoryIdAsObject;
    }

    public void setCategoryId(OdooId categoryId) {
        this.categoryId = categoryId;
    }

    public void setLeaveType(Object leaveType) {
        this.leaveType = leaveType;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHolidayStatusIdAsObject(HrLeaveType holidayStatusIdAsObject) {
        this.holidayStatusIdAsObject = holidayStatusIdAsObject;
    }

    public void setHolidayStatusId(OdooId holidayStatusId) {
        this.holidayStatusId = holidayStatusId;
    }

    public void setHolidayType(Object holidayType) {
        this.holidayType = holidayType;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }



}