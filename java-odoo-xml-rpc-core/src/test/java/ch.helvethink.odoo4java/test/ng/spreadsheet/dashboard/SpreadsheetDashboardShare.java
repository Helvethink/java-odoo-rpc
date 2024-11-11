
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

package ch.helvethink.odoo4java.test.ng.spreadsheet.dashboard;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.spreadsheet.SpreadsheetDashboard;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("spreadsheet.dashboard.share")
public class SpreadsheetDashboardShare implements OdooObj {

    
    private Date writeDate;

    
    private Object thumbnail;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String fullUrl;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object spreadsheetData;

    
    private String accessToken;

    
    private Object excelExport;

    
    private String name;

    
    private int id;

    
    private Object spreadsheetBinaryData;

    
    private Date createDate;

    
    private SpreadsheetDashboard dashboardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.spreadsheet.SpreadsheetDashboard")
        @OdooModel("spreadsheet.SpreadsheetDashboard")
    
    private OdooId dashboardId;


    public SpreadsheetDashboardShare() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getThumbnail() {
        return thumbnail;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getFullUrl() {
        return fullUrl;
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

    public Object getSpreadsheetData() {
        return spreadsheetData;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Object getExcelExport() {
        return excelExport;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Object getSpreadsheetBinaryData() {
        return spreadsheetBinaryData;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public SpreadsheetDashboard getDashboardIdAsObject() {
        return dashboardIdAsObject;
    }

    public OdooId getDashboardId() {
        return dashboardId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setThumbnail(Object thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
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

    public void setSpreadsheetData(Object spreadsheetData) {
        this.spreadsheetData = spreadsheetData;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setExcelExport(Object excelExport) {
        this.excelExport = excelExport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpreadsheetBinaryData(Object spreadsheetBinaryData) {
        this.spreadsheetBinaryData = spreadsheetBinaryData;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDashboardIdAsObject(SpreadsheetDashboard dashboardIdAsObject) {
        this.dashboardIdAsObject = dashboardIdAsObject;
    }

    public void setDashboardId(OdooId dashboardId) {
        this.dashboardId = dashboardId;
    }



}