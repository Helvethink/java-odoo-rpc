
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

package ch.helvethink.odoo4java.test.ng.report;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsReport;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("report.paperformat")
public class ReportPaperformat implements OdooObj {

    
    private Date writeDate;

    
    private Object orientation;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private double printPageHeight;

    
    private double marginTop;

    
    private Object format;

    
    private boolean isDisableShrinking;

    
    private double printPageWidth;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private double marginRight;

    
    private int pageWidth;

    
    private List<IrActionsReport> reportIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsReport")
        @OdooModel("ir.actions.IrActionsReport")
    
    private List<Integer> reportIds;

    
    private double marginLeft;

    
    private double marginBottom;

    
    private boolean isDefault;

    
    private int headerSpacing;

    
    private boolean isHeaderLine;

    
    private String name;

    
    private int id;

    
    private int dpi;

    
    private Date createDate;

    
    private int pageHeight;


    public ReportPaperformat() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getOrientation() {
        return orientation;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public double getPrintPageHeight() {
        return printPageHeight;
    }

    public double getMarginTop() {
        return marginTop;
    }

    public Object getFormat() {
        return format;
    }

    public boolean getIsDisableShrinking() {
        return isDisableShrinking;
    }

    public double getPrintPageWidth() {
        return printPageWidth;
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

    public double getMarginRight() {
        return marginRight;
    }

    public int getPageWidth() {
        return pageWidth;
    }

    public List<IrActionsReport> getReportIdsAsList() {
        return reportIdsAsList;
    }

    public List<Integer> getReportIds() {
        return reportIds;
    }

    public double getMarginLeft() {
        return marginLeft;
    }

    public double getMarginBottom() {
        return marginBottom;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public int getHeaderSpacing() {
        return headerSpacing;
    }

    public boolean getIsHeaderLine() {
        return isHeaderLine;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDpi() {
        return dpi;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getPageHeight() {
        return pageHeight;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setOrientation(Object orientation) {
        this.orientation = orientation;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setPrintPageHeight(double printPageHeight) {
        this.printPageHeight = printPageHeight;
    }

    public void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }

    public void setFormat(Object format) {
        this.format = format;
    }

    public void setIsDisableShrinking(boolean isDisableShrinking) {
        this.isDisableShrinking = isDisableShrinking;
    }

    public void setPrintPageWidth(double printPageWidth) {
        this.printPageWidth = printPageWidth;
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

    public void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    public void setReportIdsAsList(List<IrActionsReport> reportIdsAsList) {
        this.reportIdsAsList = reportIdsAsList;
    }

    public void setReportIds(List<Integer> reportIds) {
        this.reportIds = reportIds;
    }

    public void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }

    public void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setHeaderSpacing(int headerSpacing) {
        this.headerSpacing = headerSpacing;
    }

    public void setIsHeaderLine(boolean isHeaderLine) {
        this.isHeaderLine = isHeaderLine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPageHeight(int pageHeight) {
        this.pageHeight = pageHeight;
    }



}