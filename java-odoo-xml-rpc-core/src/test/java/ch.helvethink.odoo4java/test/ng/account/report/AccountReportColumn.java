
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

import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window;
import ch.helvethink.odoo4java.test.ng.account.AccountReport;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.report.column")
public class AccountReportColumn implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isSortable;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private IrActionsAct_window customAuditActionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window")
        @OdooModel("ir.actions.IrActionsAct_window")
    
    private OdooId customAuditActionId;

    
    private int sequence;

    
    private Object figureType;

    
    private boolean isBlankIfZero;

    
    private AccountReport reportIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountReport")
        @OdooModel("account.AccountReport")
    
    private OdooId reportId;

    
    private String name;

    
    private String expressionLabel;

    
    private int id;

    
    private Date createDate;


    public AccountReportColumn() {
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

    public boolean getIsSortable() {
        return isSortable;
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

    public IrActionsAct_window getCustomAuditActionIdAsObject() {
        return customAuditActionIdAsObject;
    }

    public OdooId getCustomAuditActionId() {
        return customAuditActionId;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getFigureType() {
        return figureType;
    }

    public boolean getIsBlankIfZero() {
        return isBlankIfZero;
    }

    public AccountReport getReportIdAsObject() {
        return reportIdAsObject;
    }

    public OdooId getReportId() {
        return reportId;
    }

    public String getName() {
        return name;
    }

    public String getExpressionLabel() {
        return expressionLabel;
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

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsSortable(boolean isSortable) {
        this.isSortable = isSortable;
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

    public void setCustomAuditActionIdAsObject(IrActionsAct_window customAuditActionIdAsObject) {
        this.customAuditActionIdAsObject = customAuditActionIdAsObject;
    }

    public void setCustomAuditActionId(OdooId customAuditActionId) {
        this.customAuditActionId = customAuditActionId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setFigureType(Object figureType) {
        this.figureType = figureType;
    }

    public void setIsBlankIfZero(boolean isBlankIfZero) {
        this.isBlankIfZero = isBlankIfZero;
    }

    public void setReportIdAsObject(AccountReport reportIdAsObject) {
        this.reportIdAsObject = reportIdAsObject;
    }

    public void setReportId(OdooId reportId) {
        this.reportId = reportId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpressionLabel(String expressionLabel) {
        this.expressionLabel = expressionLabel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}