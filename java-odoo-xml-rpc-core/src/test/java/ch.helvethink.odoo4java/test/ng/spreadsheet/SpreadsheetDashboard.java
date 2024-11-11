
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

package ch.helvethink.odoo4java.test.ng.spreadsheet;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.spreadsheet.dashboard.SpreadsheetDashboardGroup;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;;

@OdooObject("spreadsheet.dashboard")
public class SpreadsheetDashboard implements OdooObj {

    
    private Date writeDate;

    
    private Object thumbnail;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private SpreadsheetDashboardGroup dashboardGroupIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.spreadsheet.dashboard.SpreadsheetDashboardGroup")
        @OdooModel("spreadsheet.dashboard.SpreadsheetDashboardGroup")
    
    private OdooId dashboardGroupId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object spreadsheetData;

    
    private int sequence;

    
    private String name;

    
    private List<ResGroups> groupIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupIds;

    
    private int id;

    
    private Object spreadsheetBinaryData;

    
    private Date createDate;


    public SpreadsheetDashboard() {
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

    public SpreadsheetDashboardGroup getDashboardGroupIdAsObject() {
        return dashboardGroupIdAsObject;
    }

    public OdooId getDashboardGroupId() {
        return dashboardGroupId;
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

    public int getSequence() {
        return sequence;
    }

    public String getName() {
        return name;
    }

    public List<ResGroups> getGroupIdsAsList() {
        return groupIdsAsList;
    }

    public List<Integer> getGroupIds() {
        return groupIds;
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

    public void setDashboardGroupIdAsObject(SpreadsheetDashboardGroup dashboardGroupIdAsObject) {
        this.dashboardGroupIdAsObject = dashboardGroupIdAsObject;
    }

    public void setDashboardGroupId(OdooId dashboardGroupId) {
        this.dashboardGroupId = dashboardGroupId;
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

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupIdsAsList(List<ResGroups> groupIdsAsList) {
        this.groupIdsAsList = groupIdsAsList;
    }

    public void setGroupIds(List<Integer> groupIds) {
        this.groupIds = groupIds;
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



}