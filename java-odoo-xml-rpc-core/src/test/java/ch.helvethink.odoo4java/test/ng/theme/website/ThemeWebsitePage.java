
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

package ch.helvethink.odoo4java.test.ng.theme.website;

import ch.helvethink.odoo4java.test.ng.theme.ir.ui.ThemeIrUiView;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.website.WebsitePage;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("theme.website.page")
public class ThemeWebsitePage implements OdooObj {

    
    private boolean isWebsiteIndexed;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String headerColor;

    
    private boolean isFooterVisible;

    
    private boolean isHeaderVisible;

    
    private boolean isIsPublished;

    
    private ThemeIrUiView viewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.theme.ir.ui.ThemeIrUiView")
        @OdooModel("theme.ir.ui.ThemeIrUiView")
    
    private OdooId viewId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String url;

    
    private List<WebsitePage> copyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private List<Integer> copyIds;

    
    private boolean isHeaderOverlay;

    
    private int id;

    
    private Date createDate;


    public ThemeWebsitePage() {
    // Constructor
    }


    public boolean getIsWebsiteIndexed() {
        return isWebsiteIndexed;
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

    public String getHeaderColor() {
        return headerColor;
    }

    public boolean getIsFooterVisible() {
        return isFooterVisible;
    }

    public boolean getIsHeaderVisible() {
        return isHeaderVisible;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public ThemeIrUiView getViewIdAsObject() {
        return viewIdAsObject;
    }

    public OdooId getViewId() {
        return viewId;
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

    public String getUrl() {
        return url;
    }

    public List<WebsitePage> getCopyIdsAsList() {
        return copyIdsAsList;
    }

    public List<Integer> getCopyIds() {
        return copyIds;
    }

    public boolean getIsHeaderOverlay() {
        return isHeaderOverlay;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setIsWebsiteIndexed(boolean isWebsiteIndexed) {
        this.isWebsiteIndexed = isWebsiteIndexed;
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

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    public void setIsFooterVisible(boolean isFooterVisible) {
        this.isFooterVisible = isFooterVisible;
    }

    public void setIsHeaderVisible(boolean isHeaderVisible) {
        this.isHeaderVisible = isHeaderVisible;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setViewIdAsObject(ThemeIrUiView viewIdAsObject) {
        this.viewIdAsObject = viewIdAsObject;
    }

    public void setViewId(OdooId viewId) {
        this.viewId = viewId;
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

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCopyIdsAsList(List<WebsitePage> copyIdsAsList) {
        this.copyIdsAsList = copyIdsAsList;
    }

    public void setCopyIds(List<Integer> copyIds) {
        this.copyIds = copyIds;
    }

    public void setIsHeaderOverlay(boolean isHeaderOverlay) {
        this.isHeaderOverlay = isHeaderOverlay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}