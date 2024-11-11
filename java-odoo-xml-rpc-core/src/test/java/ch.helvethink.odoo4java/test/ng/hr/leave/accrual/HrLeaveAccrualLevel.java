
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

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualPlan;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("hr.leave.accrual.level")
public class HrLeaveAccrualLevel implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int yearlyDay;

    
    private Object firstDayDisplay;

    
    private Object startType;

    
    private Object frequency;

    
    private Object accruedGainTime;

    
    private double addedValue;

    
    private Object secondMonthDayDisplay;

    
    private int secondDay;

    
    private boolean isCanModifyValueType;

    
    private int id;

    
    private Date createDate;

    
    private boolean isCapAccruedTime;

    
    private Object secondDayDisplay;

    
    private Object actionWithUnusedAccruals;

    
    private HrLeaveAccrualPlan accrualPlanIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.leave.accrual.HrLeaveAccrualPlan")
        @OdooModel("hr.leave.accrual.HrLeaveAccrualPlan")
    
    private OdooId accrualPlanId;

    
    private double maximumLeave;

    
    private Object yearlyMonth;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object firstMonthDayDisplay;

    
    private Object secondMonth;

    
    private int sequence;

    
    private int secondMonthDay;

    
    private Object frequencyHourlySource;

    
    private int postponeMaxDays;

    
    private Object firstMonth;

    
    private int firstMonthDay;

    
    private Object weekDay;

    
    private Object addedValueType;

    
    private int startCount;

    
    private int firstDay;

    
    private Object yearlyDayDisplay;


    public HrLeaveAccrualLevel() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public int getYearlyDay() {
        return yearlyDay;
    }

    public Object getFirstDayDisplay() {
        return firstDayDisplay;
    }

    public Object getStartType() {
        return startType;
    }

    public Object getFrequency() {
        return frequency;
    }

    public Object getAccruedGainTime() {
        return accruedGainTime;
    }

    public double getAddedValue() {
        return addedValue;
    }

    public Object getSecondMonthDayDisplay() {
        return secondMonthDayDisplay;
    }

    public int getSecondDay() {
        return secondDay;
    }

    public boolean getIsCanModifyValueType() {
        return isCanModifyValueType;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsCapAccruedTime() {
        return isCapAccruedTime;
    }

    public Object getSecondDayDisplay() {
        return secondDayDisplay;
    }

    public Object getActionWithUnusedAccruals() {
        return actionWithUnusedAccruals;
    }

    public HrLeaveAccrualPlan getAccrualPlanIdAsObject() {
        return accrualPlanIdAsObject;
    }

    public OdooId getAccrualPlanId() {
        return accrualPlanId;
    }

    public double getMaximumLeave() {
        return maximumLeave;
    }

    public Object getYearlyMonth() {
        return yearlyMonth;
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

    public Object getFirstMonthDayDisplay() {
        return firstMonthDayDisplay;
    }

    public Object getSecondMonth() {
        return secondMonth;
    }

    public int getSequence() {
        return sequence;
    }

    public int getSecondMonthDay() {
        return secondMonthDay;
    }

    public Object getFrequencyHourlySource() {
        return frequencyHourlySource;
    }

    public int getPostponeMaxDays() {
        return postponeMaxDays;
    }

    public Object getFirstMonth() {
        return firstMonth;
    }

    public int getFirstMonthDay() {
        return firstMonthDay;
    }

    public Object getWeekDay() {
        return weekDay;
    }

    public Object getAddedValueType() {
        return addedValueType;
    }

    public int getStartCount() {
        return startCount;
    }

    public int getFirstDay() {
        return firstDay;
    }

    public Object getYearlyDayDisplay() {
        return yearlyDayDisplay;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setYearlyDay(int yearlyDay) {
        this.yearlyDay = yearlyDay;
    }

    public void setFirstDayDisplay(Object firstDayDisplay) {
        this.firstDayDisplay = firstDayDisplay;
    }

    public void setStartType(Object startType) {
        this.startType = startType;
    }

    public void setFrequency(Object frequency) {
        this.frequency = frequency;
    }

    public void setAccruedGainTime(Object accruedGainTime) {
        this.accruedGainTime = accruedGainTime;
    }

    public void setAddedValue(double addedValue) {
        this.addedValue = addedValue;
    }

    public void setSecondMonthDayDisplay(Object secondMonthDayDisplay) {
        this.secondMonthDayDisplay = secondMonthDayDisplay;
    }

    public void setSecondDay(int secondDay) {
        this.secondDay = secondDay;
    }

    public void setIsCanModifyValueType(boolean isCanModifyValueType) {
        this.isCanModifyValueType = isCanModifyValueType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsCapAccruedTime(boolean isCapAccruedTime) {
        this.isCapAccruedTime = isCapAccruedTime;
    }

    public void setSecondDayDisplay(Object secondDayDisplay) {
        this.secondDayDisplay = secondDayDisplay;
    }

    public void setActionWithUnusedAccruals(Object actionWithUnusedAccruals) {
        this.actionWithUnusedAccruals = actionWithUnusedAccruals;
    }

    public void setAccrualPlanIdAsObject(HrLeaveAccrualPlan accrualPlanIdAsObject) {
        this.accrualPlanIdAsObject = accrualPlanIdAsObject;
    }

    public void setAccrualPlanId(OdooId accrualPlanId) {
        this.accrualPlanId = accrualPlanId;
    }

    public void setMaximumLeave(double maximumLeave) {
        this.maximumLeave = maximumLeave;
    }

    public void setYearlyMonth(Object yearlyMonth) {
        this.yearlyMonth = yearlyMonth;
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

    public void setFirstMonthDayDisplay(Object firstMonthDayDisplay) {
        this.firstMonthDayDisplay = firstMonthDayDisplay;
    }

    public void setSecondMonth(Object secondMonth) {
        this.secondMonth = secondMonth;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setSecondMonthDay(int secondMonthDay) {
        this.secondMonthDay = secondMonthDay;
    }

    public void setFrequencyHourlySource(Object frequencyHourlySource) {
        this.frequencyHourlySource = frequencyHourlySource;
    }

    public void setPostponeMaxDays(int postponeMaxDays) {
        this.postponeMaxDays = postponeMaxDays;
    }

    public void setFirstMonth(Object firstMonth) {
        this.firstMonth = firstMonth;
    }

    public void setFirstMonthDay(int firstMonthDay) {
        this.firstMonthDay = firstMonthDay;
    }

    public void setWeekDay(Object weekDay) {
        this.weekDay = weekDay;
    }

    public void setAddedValueType(Object addedValueType) {
        this.addedValueType = addedValueType;
    }

    public void setStartCount(int startCount) {
        this.startCount = startCount;
    }

    public void setFirstDay(int firstDay) {
        this.firstDay = firstDay;
    }

    public void setYearlyDayDisplay(Object yearlyDayDisplay) {
        this.yearlyDayDisplay = yearlyDayDisplay;
    }



}