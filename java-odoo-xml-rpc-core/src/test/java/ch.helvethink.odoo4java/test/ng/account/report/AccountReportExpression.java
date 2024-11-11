
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

package ch.helvethink.odoo4java.test.ng.account.report;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.report.expression")
public class AccountReportExpression implements OdooObj {

    
    private Date writeDate;

    
    private String reportLineName;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String label;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String subformula;

    
    private AccountReportLine reportLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
    
    private OdooId reportLineId;

    
    private Object figureType;

    
    private Object engine;

    
    private boolean isBlankIfZero;

    
    private boolean isAuditable;

    
    private String carryoverTarget;

    
    private Object dateScope;

    
    private String formula;

    
    private boolean isGreenOnPositive;

    
    private int id;

    
    private Date createDate;


    public AccountReportExpression() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public String getReportLineName() {
        return reportLineName;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getLabel() {
        return label;
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

    public String getSubformula() {
        return subformula;
    }

    public AccountReportLine getReportLineIdAsObject() {
        return reportLineIdAsObject;
    }

    public OdooId getReportLineId() {
        return reportLineId;
    }

    public Object getFigureType() {
        return figureType;
    }

    public Object getEngine() {
        return engine;
    }

    public boolean getIsBlankIfZero() {
        return isBlankIfZero;
    }

    public boolean getIsAuditable() {
        return isAuditable;
    }

    public String getCarryoverTarget() {
        return carryoverTarget;
    }

    public Object getDateScope() {
        return dateScope;
    }

    public String getFormula() {
        return formula;
    }

    public boolean getIsGreenOnPositive() {
        return isGreenOnPositive;
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

    public void setReportLineName(String reportLineName) {
        this.reportLineName = reportLineName;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public void setSubformula(String subformula) {
        this.subformula = subformula;
    }

    public void setReportLineIdAsObject(AccountReportLine reportLineIdAsObject) {
        this.reportLineIdAsObject = reportLineIdAsObject;
    }

    public void setReportLineId(OdooId reportLineId) {
        this.reportLineId = reportLineId;
    }

    public void setFigureType(Object figureType) {
        this.figureType = figureType;
    }

    public void setEngine(Object engine) {
        this.engine = engine;
    }

    public void setIsBlankIfZero(boolean isBlankIfZero) {
        this.isBlankIfZero = isBlankIfZero;
    }

    public void setIsAuditable(boolean isAuditable) {
        this.isAuditable = isAuditable;
    }

    public void setCarryoverTarget(String carryoverTarget) {
        this.carryoverTarget = carryoverTarget;
    }

    public void setDateScope(Object dateScope) {
        this.dateScope = dateScope;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setIsGreenOnPositive(boolean isGreenOnPositive) {
        this.isGreenOnPositive = isGreenOnPositive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}