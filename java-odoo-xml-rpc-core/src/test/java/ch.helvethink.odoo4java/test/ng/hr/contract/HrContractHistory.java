
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

package ch.helvethink.odoo4java.test.ng.hr.contract;

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.hr.contract.HrContractType;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.payroll.structure.HrPayrollStructureType;
import ch.helvethink.odoo4java.test.ng.hr.HrContract;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("hr.contract.history")
public class HrContractHistory implements OdooObj {

    
    private HrContract contractIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrContract")
        @OdooModel("hr.HrContract")
    
    private OdooId contractId;

    
    private HrContractType contractTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.contract.HrContractType")
        @OdooModel("hr.contract.HrContractType")
    
    private OdooId contractTypeId;

    
    private Object activityState;

    
    private ResCountry companyCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId companyCountryId;

    
    private boolean isActiveEmployee;

    
    private Object state;

    
    private int id;

    
    private Object dateHired;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private Object wage;

    
    private HrPayrollStructureType structureTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.payroll.structure.HrPayrollStructureType")
        @OdooModel("hr.payroll.structure.HrPayrollStructureType")
    
    private OdooId structureTypeId;

    
    private Object underContractState;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private List<HrContract> contractIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrContract")
        @OdooModel("hr.HrContract")
    
    private List<Integer> contractIds;

    
    private Object dateEnd;

    
    private String displayName;

    
    private String countryCode;

    
    private Object dateStart;

    
    private HrJob jobIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private OdooId jobId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private boolean isIsUnderContract;

    
    private int contractCount;

    
    private ResUsers hrResponsibleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId hrResponsibleId;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public HrContractHistory() {
    // Constructor
    }


    public HrContract getContractIdAsObject() {
        return contractIdAsObject;
    }

    public OdooId getContractId() {
        return contractId;
    }

    public HrContractType getContractTypeIdAsObject() {
        return contractTypeIdAsObject;
    }

    public OdooId getContractTypeId() {
        return contractTypeId;
    }

    public Object getActivityState() {
        return activityState;
    }

    public ResCountry getCompanyCountryIdAsObject() {
        return companyCountryIdAsObject;
    }

    public OdooId getCompanyCountryId() {
        return companyCountryId;
    }

    public boolean getIsActiveEmployee() {
        return isActiveEmployee;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Object getDateHired() {
        return dateHired;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public Object getWage() {
        return wage;
    }

    public HrPayrollStructureType getStructureTypeIdAsObject() {
        return structureTypeIdAsObject;
    }

    public OdooId getStructureTypeId() {
        return structureTypeId;
    }

    public Object getUnderContractState() {
        return underContractState;
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

    public List<HrContract> getContractIdsAsList() {
        return contractIdsAsList;
    }

    public List<Integer> getContractIds() {
        return contractIds;
    }

    public Object getDateEnd() {
        return dateEnd;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Object getDateStart() {
        return dateStart;
    }

    public HrJob getJobIdAsObject() {
        return jobIdAsObject;
    }

    public OdooId getJobId() {
        return jobId;
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

    public boolean getIsIsUnderContract() {
        return isIsUnderContract;
    }

    public int getContractCount() {
        return contractCount;
    }

    public ResUsers getHrResponsibleIdAsObject() {
        return hrResponsibleIdAsObject;
    }

    public OdooId getHrResponsibleId() {
        return hrResponsibleId;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setContractIdAsObject(HrContract contractIdAsObject) {
        this.contractIdAsObject = contractIdAsObject;
    }

    public void setContractId(OdooId contractId) {
        this.contractId = contractId;
    }

    public void setContractTypeIdAsObject(HrContractType contractTypeIdAsObject) {
        this.contractTypeIdAsObject = contractTypeIdAsObject;
    }

    public void setContractTypeId(OdooId contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setCompanyCountryIdAsObject(ResCountry companyCountryIdAsObject) {
        this.companyCountryIdAsObject = companyCountryIdAsObject;
    }

    public void setCompanyCountryId(OdooId companyCountryId) {
        this.companyCountryId = companyCountryId;
    }

    public void setIsActiveEmployee(boolean isActiveEmployee) {
        this.isActiveEmployee = isActiveEmployee;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateHired(Object dateHired) {
        this.dateHired = dateHired;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setWage(Object wage) {
        this.wage = wage;
    }

    public void setStructureTypeIdAsObject(HrPayrollStructureType structureTypeIdAsObject) {
        this.structureTypeIdAsObject = structureTypeIdAsObject;
    }

    public void setStructureTypeId(OdooId structureTypeId) {
        this.structureTypeId = structureTypeId;
    }

    public void setUnderContractState(Object underContractState) {
        this.underContractState = underContractState;
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

    public void setContractIdsAsList(List<HrContract> contractIdsAsList) {
        this.contractIdsAsList = contractIdsAsList;
    }

    public void setContractIds(List<Integer> contractIds) {
        this.contractIds = contractIds;
    }

    public void setDateEnd(Object dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDateStart(Object dateStart) {
        this.dateStart = dateStart;
    }

    public void setJobIdAsObject(HrJob jobIdAsObject) {
        this.jobIdAsObject = jobIdAsObject;
    }

    public void setJobId(OdooId jobId) {
        this.jobId = jobId;
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

    public void setIsIsUnderContract(boolean isIsUnderContract) {
        this.isIsUnderContract = isIsUnderContract;
    }

    public void setContractCount(int contractCount) {
        this.contractCount = contractCount;
    }

    public void setHrResponsibleIdAsObject(ResUsers hrResponsibleIdAsObject) {
        this.hrResponsibleIdAsObject = hrResponsibleIdAsObject;
    }

    public void setHrResponsibleId(OdooId hrResponsibleId) {
        this.hrResponsibleId = hrResponsibleId;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}