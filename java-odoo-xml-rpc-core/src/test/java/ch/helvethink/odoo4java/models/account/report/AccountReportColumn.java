
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
import ch.helvethink.odoo4java.models.account.AccountReport;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@OdooObject("account.report.column")
public class AccountReportColumn implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("sortable")
        private boolean isSortable;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("figure_type")
        private Object figureType;
    

    
        @JsonProperty("blank_if_zero")
        private boolean isBlankIfZero;
    

    
        private AccountReport reportIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountReport")
        @OdooModel("account.AccountReport")
        @JsonProperty("report_id")
        private OdooId reportId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("expression_label")
        private String expressionLabel;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
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