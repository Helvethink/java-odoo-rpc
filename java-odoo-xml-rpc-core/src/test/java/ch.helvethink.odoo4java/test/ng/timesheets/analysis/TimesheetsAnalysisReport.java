
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

package ch.helvethink.odoo4java.test.ng.timesheets.analysis;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;;

@OdooObject("timesheets.analysis.report")
public class TimesheetsAnalysisReport implements OdooObj {

    
    private Object date;

    
    private Object amount;

    
    private double timesheetRevenues;

    
    private double margin;

    
    private double billableTime;

    
    private double nonBillableTime;

    
    private ProjectTask parentTaskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId parentTaskId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private ProjectTask taskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId taskId;

    
    private double unitAmount;

    
    private String displayName;

    
    private Object timesheetInvoiceType;

    
    private SaleOrderLine soLineAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private OdooId soLine;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private HrEmployee managerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId managerId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private int id;

    
    private SaleOrder orderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId orderId;

    
    private AccountMove timesheetInvoiceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId timesheetInvoiceId;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public TimesheetsAnalysisReport() {
    // Constructor
    }


    public Object getDate() {
        return date;
    }

    public Object getAmount() {
        return amount;
    }

    public double getTimesheetRevenues() {
        return timesheetRevenues;
    }

    public double getMargin() {
        return margin;
    }

    public double getBillableTime() {
        return billableTime;
    }

    public double getNonBillableTime() {
        return nonBillableTime;
    }

    public ProjectTask getParentTaskIdAsObject() {
        return parentTaskIdAsObject;
    }

    public OdooId getParentTaskId() {
        return parentTaskId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public ProjectTask getTaskIdAsObject() {
        return taskIdAsObject;
    }

    public OdooId getTaskId() {
        return taskId;
    }

    public double getUnitAmount() {
        return unitAmount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getTimesheetInvoiceType() {
        return timesheetInvoiceType;
    }

    public SaleOrderLine getSoLineAsObject() {
        return soLineAsObject;
    }

    public OdooId getSoLine() {
        return soLine;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public HrEmployee getManagerIdAsObject() {
        return managerIdAsObject;
    }

    public OdooId getManagerId() {
        return managerId;
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

    public int getId() {
        return id;
    }

    public SaleOrder getOrderIdAsObject() {
        return orderIdAsObject;
    }

    public OdooId getOrderId() {
        return orderId;
    }

    public AccountMove getTimesheetInvoiceIdAsObject() {
        return timesheetInvoiceIdAsObject;
    }

    public OdooId getTimesheetInvoiceId() {
        return timesheetInvoiceId;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setDate(Object date) {
        this.date = date;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setTimesheetRevenues(double timesheetRevenues) {
        this.timesheetRevenues = timesheetRevenues;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public void setBillableTime(double billableTime) {
        this.billableTime = billableTime;
    }

    public void setNonBillableTime(double nonBillableTime) {
        this.nonBillableTime = nonBillableTime;
    }

    public void setParentTaskIdAsObject(ProjectTask parentTaskIdAsObject) {
        this.parentTaskIdAsObject = parentTaskIdAsObject;
    }

    public void setParentTaskId(OdooId parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setTaskIdAsObject(ProjectTask taskIdAsObject) {
        this.taskIdAsObject = taskIdAsObject;
    }

    public void setTaskId(OdooId taskId) {
        this.taskId = taskId;
    }

    public void setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setTimesheetInvoiceType(Object timesheetInvoiceType) {
        this.timesheetInvoiceType = timesheetInvoiceType;
    }

    public void setSoLineAsObject(SaleOrderLine soLineAsObject) {
        this.soLineAsObject = soLineAsObject;
    }

    public void setSoLine(OdooId soLine) {
        this.soLine = soLine;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setManagerIdAsObject(HrEmployee managerIdAsObject) {
        this.managerIdAsObject = managerIdAsObject;
    }

    public void setManagerId(OdooId managerId) {
        this.managerId = managerId;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderIdAsObject(SaleOrder orderIdAsObject) {
        this.orderIdAsObject = orderIdAsObject;
    }

    public void setOrderId(OdooId orderId) {
        this.orderId = orderId;
    }

    public void setTimesheetInvoiceIdAsObject(AccountMove timesheetInvoiceIdAsObject) {
        this.timesheetInvoiceIdAsObject = timesheetInvoiceIdAsObject;
    }

    public void setTimesheetInvoiceId(OdooId timesheetInvoiceId) {
        this.timesheetInvoiceId = timesheetInvoiceId;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}