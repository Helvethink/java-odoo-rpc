
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

package ch.helvethink.odoo4java.test.ng.website;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.website.WebsiteMenu;
import ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsiteMenu;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.website.WebsitePage;
import ch.helvethink.odoo4java.test.ng.website.controller.WebsiteControllerPage;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("website.menu")
public class WebsiteMenu implements OdooObj {

    
    private Date writeDate;

    
    private WebsiteControllerPage controllerPageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.controller.WebsiteControllerPage")
        @OdooModel("website.controller.WebsiteControllerPage")
    
    private OdooId controllerPageId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsVisible;

    
    private String megaMenuClasses;

    
    private Object megaMenuContent;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String url;

    
    private WebsitePage pageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private OdooId pageId;

    
    private int sequence;

    
    private List<WebsiteMenu> childIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteMenu")
        @OdooModel("website.WebsiteMenu")
    
    private List<Integer> childId;

    
    private WebsiteMenu parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteMenu")
        @OdooModel("website.WebsiteMenu")
    
    private OdooId parentId;

    
    private String name;

    
    private boolean isNewWindow;

    
    private ThemeWebsiteMenu themeTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsiteMenu")
        @OdooModel("theme.website.ThemeWebsiteMenu")
    
    private OdooId themeTemplateId;

    
    private String parentPath;

    
    private int id;

    
    private Date createDate;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private boolean isIsMegaMenu;


    public WebsiteMenu() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public WebsiteControllerPage getControllerPageIdAsObject() {
        return controllerPageIdAsObject;
    }

    public OdooId getControllerPageId() {
        return controllerPageId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsIsVisible() {
        return isIsVisible;
    }

    public String getMegaMenuClasses() {
        return megaMenuClasses;
    }

    public Object getMegaMenuContent() {
        return megaMenuContent;
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

    public WebsitePage getPageIdAsObject() {
        return pageIdAsObject;
    }

    public OdooId getPageId() {
        return pageId;
    }

    public int getSequence() {
        return sequence;
    }

    public List<WebsiteMenu> getChildIdAsList() {
        return childIdAsList;
    }

    public List<Integer> getChildId() {
        return childId;
    }

    public WebsiteMenu getParentIdAsObject() {
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

    public ThemeWebsiteMenu getThemeTemplateIdAsObject() {
        return themeTemplateIdAsObject;
    }

    public OdooId getThemeTemplateId() {
        return themeTemplateId;
    }

    public String getParentPath() {
        return parentPath;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public boolean getIsIsMegaMenu() {
        return isIsMegaMenu;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setControllerPageIdAsObject(WebsiteControllerPage controllerPageIdAsObject) {
        this.controllerPageIdAsObject = controllerPageIdAsObject;
    }

    public void setControllerPageId(OdooId controllerPageId) {
        this.controllerPageId = controllerPageId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsIsVisible(boolean isIsVisible) {
        this.isIsVisible = isIsVisible;
    }

    public void setMegaMenuClasses(String megaMenuClasses) {
        this.megaMenuClasses = megaMenuClasses;
    }

    public void setMegaMenuContent(Object megaMenuContent) {
        this.megaMenuContent = megaMenuContent;
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

    public void setPageIdAsObject(WebsitePage pageIdAsObject) {
        this.pageIdAsObject = pageIdAsObject;
    }

    public void setPageId(OdooId pageId) {
        this.pageId = pageId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setChildIdAsList(List<WebsiteMenu> childIdAsList) {
        this.childIdAsList = childIdAsList;
    }

    public void setChildId(List<Integer> childId) {
        this.childId = childId;
    }

    public void setParentIdAsObject(WebsiteMenu parentIdAsObject) {
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

    public void setThemeTemplateIdAsObject(ThemeWebsiteMenu themeTemplateIdAsObject) {
        this.themeTemplateIdAsObject = themeTemplateIdAsObject;
    }

    public void setThemeTemplateId(OdooId themeTemplateId) {
        this.themeTemplateId = themeTemplateId;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setIsIsMegaMenu(boolean isIsMegaMenu) {
        this.isIsMegaMenu = isIsMegaMenu;
    }



}