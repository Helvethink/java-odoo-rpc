
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

package ch.helvethink.odoo4java.test.ng.hr.leave.accrual;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualLevel;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveAllocation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.leave.accrual.plan")
public class HrLeaveAccrualPlan implements OdooObj {

    
    private Date writeDate;

    
    private List<HrLeaveAllocation> allocationIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveAllocation")
        @OdooModel("hr.leave.HrLeaveAllocation")
    
    private List<Integer> allocationIds;

    
    private int carryoverDay;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isActive;

    
    private Object carryoverDate;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isIsBasedOnWorkedTime;

    
    private int levelCount;

    
    private Object accruedGainTime;

    
    private List<HrLeaveAccrualLevel> levelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualLevel")
        @OdooModel("hr.leave.accrual.HrLeaveAccrualLevel")
    
    private List<Integer> levelIds;

    
    private Object carryoverMonth;

    
    private HrLeaveType timeOffTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.HrLeaveType")
        @OdooModel("hr.leave.HrLeaveType")
    
    private OdooId timeOffTypeId;

    
    private boolean isShowTransitionMode;

    
    private Object transitionMode;

    
    private Object carryoverDayDisplay;

    
    private String name;

    
    private Object addedValueType;

    
    private int id;

    
    private Date createDate;

    
    private int employeesCount;


    public HrLeaveAccrualPlan() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<HrLeaveAllocation> getAllocationIdsAsList() {
        return allocationIdsAsList;
    }

    public List<Integer> getAllocationIds() {
        return allocationIds;
    }

    public int getCarryoverDay() {
        return carryoverDay;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getCarryoverDate() {
        return carryoverDate;
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

    public boolean getIsIsBasedOnWorkedTime() {
        return isIsBasedOnWorkedTime;
    }

    public int getLevelCount() {
        return levelCount;
    }

    public Object getAccruedGainTime() {
        return accruedGainTime;
    }

    public List<HrLeaveAccrualLevel> getLevelIdsAsList() {
        return levelIdsAsList;
    }

    public List<Integer> getLevelIds() {
        return levelIds;
    }

    public Object getCarryoverMonth() {
        return carryoverMonth;
    }

    public HrLeaveType getTimeOffTypeIdAsObject() {
        return timeOffTypeIdAsObject;
    }

    public OdooId getTimeOffTypeId() {
        return timeOffTypeId;
    }

    public boolean getIsShowTransitionMode() {
        return isShowTransitionMode;
    }

    public Object getTransitionMode() {
        return transitionMode;
    }

    public Object getCarryoverDayDisplay() {
        return carryoverDayDisplay;
    }

    public String getName() {
        return name;
    }

    public Object getAddedValueType() {
        return addedValueType;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAllocationIdsAsList(List<HrLeaveAllocation> allocationIdsAsList) {
        this.allocationIdsAsList = allocationIdsAsList;
    }

    public void setAllocationIds(List<Integer> allocationIds) {
        this.allocationIds = allocationIds;
    }

    public void setCarryoverDay(int carryoverDay) {
        this.carryoverDay = carryoverDay;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setCarryoverDate(Object carryoverDate) {
        this.carryoverDate = carryoverDate;
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

    public void setIsIsBasedOnWorkedTime(boolean isIsBasedOnWorkedTime) {
        this.isIsBasedOnWorkedTime = isIsBasedOnWorkedTime;
    }

    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }

    public void setAccruedGainTime(Object accruedGainTime) {
        this.accruedGainTime = accruedGainTime;
    }

    public void setLevelIdsAsList(List<HrLeaveAccrualLevel> levelIdsAsList) {
        this.levelIdsAsList = levelIdsAsList;
    }

    public void setLevelIds(List<Integer> levelIds) {
        this.levelIds = levelIds;
    }

    public void setCarryoverMonth(Object carryoverMonth) {
        this.carryoverMonth = carryoverMonth;
    }

    public void setTimeOffTypeIdAsObject(HrLeaveType timeOffTypeIdAsObject) {
        this.timeOffTypeIdAsObject = timeOffTypeIdAsObject;
    }

    public void setTimeOffTypeId(OdooId timeOffTypeId) {
        this.timeOffTypeId = timeOffTypeId;
    }

    public void setIsShowTransitionMode(boolean isShowTransitionMode) {
        this.isShowTransitionMode = isShowTransitionMode;
    }

    public void setTransitionMode(Object transitionMode) {
        this.transitionMode = transitionMode;
    }

    public void setCarryoverDayDisplay(Object carryoverDayDisplay) {
        this.carryoverDayDisplay = carryoverDayDisplay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddedValueType(Object addedValueType) {
        this.addedValueType = addedValueType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }



}