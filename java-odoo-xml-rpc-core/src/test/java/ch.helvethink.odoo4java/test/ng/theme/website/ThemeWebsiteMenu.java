
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

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsitePage;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.website.WebsiteMenu;
import ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsiteMenu;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("theme.website.menu")
public class ThemeWebsiteMenu implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String megaMenuClasses;

    
    private Object megaMenuContent;

    
    private boolean isUseMainMenuAsParent;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String url;

    
    private ThemeWebsitePage pageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsitePage")
        @OdooModel("theme.website.ThemeWebsitePage")
    
    private OdooId pageId;

    
    private int sequence;

    
    private List<WebsiteMenu> copyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteMenu")
        @OdooModel("website.WebsiteMenu")
    
    private List<Integer> copyIds;

    
    private ThemeWebsiteMenu parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsiteMenu")
        @OdooModel("theme.website.ThemeWebsiteMenu")
    
    private OdooId parentId;

    
    private String name;

    
    private boolean isNewWindow;

    
    private int id;

    
    private Date createDate;


    public ThemeWebsiteMenu() {
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

    public String getMegaMenuClasses() {
        return megaMenuClasses;
    }

    public Object getMegaMenuContent() {
        return megaMenuContent;
    }

    public boolean getIsUseMainMenuAsParent() {
        return isUseMainMenuAsParent;
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

    public ThemeWebsitePage getPageIdAsObject() {
        return pageIdAsObject;
    }

    public OdooId getPageId() {
        return pageId;
    }

    public int getSequence() {
        return sequence;
    }

    public List<WebsiteMenu> getCopyIdsAsList() {
        return copyIdsAsList;
    }

    public List<Integer> getCopyIds() {
        return copyIds;
    }

    public ThemeWebsiteMenu getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public boolean getIsNewWindow() {
        return isNewWindow;
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

    public void setMegaMenuClasses(String megaMenuClasses) {
        this.megaMenuClasses = megaMenuClasses;
    }

    public void setMegaMenuContent(Object megaMenuContent) {
        this.megaMenuContent = megaMenuContent;
    }

    public void setIsUseMainMenuAsParent(boolean isUseMainMenuAsParent) {
        this.isUseMainMenuAsParent = isUseMainMenuAsParent;
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

    public void setPageIdAsObject(ThemeWebsitePage pageIdAsObject) {
        this.pageIdAsObject = pageIdAsObject;
    }

    public void setPageId(OdooId pageId) {
        this.pageId = pageId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setCopyIdsAsList(List<WebsiteMenu> copyIdsAsList) {
        this.copyIdsAsList = copyIdsAsList;
    }

    public void setCopyIds(List<Integer> copyIds) {
        this.copyIds = copyIds;
    }

    public void setParentIdAsObject(ThemeWebsiteMenu parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsNewWindow(boolean isNewWindow) {
        this.isNewWindow = isNewWindow;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}