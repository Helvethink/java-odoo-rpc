
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

package ch.helvethink.odoo4java.models.account.report;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.report.expression")
public class AccountReportExpression implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("report_line_name")
        private String reportLineName;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("label")
        private String label;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("subformula")
        private String subformula;
    

    
        private AccountReportLine reportLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
        @JsonProperty("report_line_id")
        private OdooId reportLineId;
    

    
        @JsonProperty("figure_type")
        private Object figureType;
    

    
        @JsonProperty("engine")
        private Object engine;
    

    
        @JsonProperty("blank_if_zero")
        private boolean isBlankIfZero;
    

    
        @JsonProperty("auditable")
        private boolean isAuditable;
    

    
        @JsonProperty("carryover_target")
        private String carryoverTarget;
    

    
        @JsonProperty("date_scope")
        private Object dateScope;
    

    
        @JsonProperty("formula")
        private String formula;
    

    
        @JsonProperty("green_on_positive")
        private boolean isGreenOnPositive;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
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