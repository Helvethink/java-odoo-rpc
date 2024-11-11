
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

package ch.helvethink.odoo4java.test.ng.hr.timesheet.attendance;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("hr.timesheet.attendance.report")
public class HrTimesheetAttendanceReport implements OdooObj {

    
    private Object date;

    
    private double totalTimesheet;

    
    private double attendanceCost;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private int id;

    
    private double totalAttendance;

    
    private String displayName;

    
    private double totalDifference;

    
    private double timesheetsCost;

    
    private double costDifference;


    public HrTimesheetAttendanceReport() {
    // Constructor
    }


    public Object getDate() {
        return date;
    }

    public double getTotalTimesheet() {
        return totalTimesheet;
    }

    public double getAttendanceCost() {
        return attendanceCost;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public int getId() {
        return id;
    }

    public double getTotalAttendance() {
        return totalAttendance;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getTotalDifference() {
        return totalDifference;
    }

    public double getTimesheetsCost() {
        return timesheetsCost;
    }

    public double getCostDifference() {
        return costDifference;
    }



    public void setDate(Object date) {
        this.date = date;
    }

    public void setTotalTimesheet(double totalTimesheet) {
        this.totalTimesheet = totalTimesheet;
    }

    public void setAttendanceCost(double attendanceCost) {
        this.attendanceCost = attendanceCost;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalAttendance(double totalAttendance) {
        this.totalAttendance = totalAttendance;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setTotalDifference(double totalDifference) {
        this.totalDifference = totalDifference;
    }

    public void setTimesheetsCost(double timesheetsCost) {
        this.timesheetsCost = timesheetsCost;
    }

    public void setCostDifference(double costDifference) {
        this.costDifference = costDifference;
    }



}