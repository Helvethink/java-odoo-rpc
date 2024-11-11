
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

package ch.helvethink.odoo4java.test.ng.account.report.external;

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportExpression;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.report.external.value")
public class AccountReportExternalValue implements OdooObj {

    
    private Object date;

    
    private Date writeDate;

    
    private AccountReportLine carryoverOriginReportLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
    
    private OdooId carryoverOriginReportLineId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCountry reportCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId reportCountryId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String carryoverOriginExpressionLabel;

    
    private AccountReportExpression targetReportExpressionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportExpression")
        @OdooModel("account.report.AccountReportExpression")
    
    private OdooId targetReportExpressionId;

    
    private AccountReportLine targetReportLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
    
    private OdooId targetReportLineId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String textValue;

    
    private AccountFiscalPosition foreignVatFiscalPositionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private OdooId foreignVatFiscalPositionId;

    
    private String name;

    
    private String targetReportExpressionLabel;

    
    private int id;

    
    private Date createDate;

    
    private double value;


    public AccountReportExternalValue() {
    // Constructor
    }


    public Object getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public AccountReportLine getCarryoverOriginReportLineIdAsObject() {
        return carryoverOriginReportLineIdAsObject;
    }

    public OdooId getCarryoverOriginReportLineId() {
        return carryoverOriginReportLineId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCountry getReportCountryIdAsObject() {
        return reportCountryIdAsObject;
    }

    public OdooId getReportCountryId() {
        return reportCountryId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public String getCarryoverOriginExpressionLabel() {
        return carryoverOriginExpressionLabel;
    }

    public AccountReportExpression getTargetReportExpressionIdAsObject() {
        return targetReportExpressionIdAsObject;
    }

    public OdooId getTargetReportExpressionId() {
        return targetReportExpressionId;
    }

    public AccountReportLine getTargetReportLineIdAsObject() {
        return targetReportLineIdAsObject;
    }

    public OdooId getTargetReportLineId() {
        return targetReportLineId;
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

    public String getTextValue() {
        return textValue;
    }

    public AccountFiscalPosition getForeignVatFiscalPositionIdAsObject() {
        return foreignVatFiscalPositionIdAsObject;
    }

    public OdooId getForeignVatFiscalPositionId() {
        return foreignVatFiscalPositionId;
    }

    public String getName() {
        return name;
    }

    public String getTargetReportExpressionLabel() {
        return targetReportExpressionLabel;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getValue() {
        return value;
    }



    public void setDate(Object date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setCarryoverOriginReportLineIdAsObject(AccountReportLine carryoverOriginReportLineIdAsObject) {
        this.carryoverOriginReportLineIdAsObject = carryoverOriginReportLineIdAsObject;
    }

    public void setCarryoverOriginReportLineId(OdooId carryoverOriginReportLineId) {
        this.carryoverOriginReportLineId = carryoverOriginReportLineId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setReportCountryIdAsObject(ResCountry reportCountryIdAsObject) {
        this.reportCountryIdAsObject = reportCountryIdAsObject;
    }

    public void setReportCountryId(OdooId reportCountryId) {
        this.reportCountryId = reportCountryId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setCarryoverOriginExpressionLabel(String carryoverOriginExpressionLabel) {
        this.carryoverOriginExpressionLabel = carryoverOriginExpressionLabel;
    }

    public void setTargetReportExpressionIdAsObject(AccountReportExpression targetReportExpressionIdAsObject) {
        this.targetReportExpressionIdAsObject = targetReportExpressionIdAsObject;
    }

    public void setTargetReportExpressionId(OdooId targetReportExpressionId) {
        this.targetReportExpressionId = targetReportExpressionId;
    }

    public void setTargetReportLineIdAsObject(AccountReportLine targetReportLineIdAsObject) {
        this.targetReportLineIdAsObject = targetReportLineIdAsObject;
    }

    public void setTargetReportLineId(OdooId targetReportLineId) {
        this.targetReportLineId = targetReportLineId;
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

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public void setForeignVatFiscalPositionIdAsObject(AccountFiscalPosition foreignVatFiscalPositionIdAsObject) {
        this.foreignVatFiscalPositionIdAsObject = foreignVatFiscalPositionIdAsObject;
    }

    public void setForeignVatFiscalPositionId(OdooId foreignVatFiscalPositionId) {
        this.foreignVatFiscalPositionId = foreignVatFiscalPositionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTargetReportExpressionLabel(String targetReportExpressionLabel) {
        this.targetReportExpressionLabel = targetReportExpressionLabel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setValue(double value) {
        this.value = value;
    }



}