
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
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.website.WebsitePage;
import ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsitePage;
import ch.helvethink.odoo4java.test.ng.website.controller.WebsiteControllerPage;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelData;;

@OdooObject("website.page")
public class WebsitePage implements OdooObj {

    
    private Date writeDate;

    
    private boolean isIsSeoOptimized;

    
    private String websiteMetaTitle;

    
    private IrUiView inheritIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId inheritId;

    
    private boolean isHeaderVisible;

    
    private boolean isIsPublished;

    
    private Object archBase;

    
    private Object type;

    
    private Object mode;

    
    private boolean isCanPublish;

    
    private boolean isCustomizeShow;

    
    private String model;

    
    private int id;

    
    private Date createDate;

    
    private boolean isWebsiteIndexed;

    
    private boolean isIsHomepage;

    
    private boolean isArchUpdated;

    
    private String headerColor;

    
    private Object visibility;

    
    private Date datePublish;

    
    private List<IrUiView> inheritChildrenIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private List<Integer> inheritChildrenIds;

    
    private String headerTextColor;

    
    private IrModelData modelDataIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelData")
        @OdooModel("ir.model.IrModelData")
    
    private OdooId modelDataId;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int priority;

    
    private List<WebsiteControllerPage> controllerPageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.controller.WebsiteControllerPage")
        @OdooModel("website.controller.WebsiteControllerPage")
    
    private List<Integer> controllerPageIds;

    
    private WebsitePage firstPageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private OdooId firstPageId;

    
    private String visibilityPasswordDisplay;

    
    private Object websiteMetaDescription;

    
    private List<WebsitePage> pageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private List<Integer> pageIds;

    
    private String name;

    
    private String xmlId;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private String archFs;

    
    private String websiteMetaKeywords;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String visibilityPassword;

    
    private List<ResGroups> groupsIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupsId;

    
    private List<WebsiteMenu> menuIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteMenu")
        @OdooModel("website.WebsiteMenu")
    
    private List<Integer> menuIds;

    
    private Object archPrev;

    
    private ThemeWebsitePage themeTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.theme.website.ThemeWebsitePage")
        @OdooModel("theme.website.ThemeWebsitePage")
    
    private OdooId themeTemplateId;

    
    private boolean isIsInMenu;

    
    private boolean isTrack;

    
    private String key;

    
    private boolean isIsVisible;

    
    private boolean isFooterVisible;

    
    private IrUiView viewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId viewId;

    
    private boolean isWebsitePublished;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private String url;

    
    private Object archDb;

    
    private String websiteUrl;

    
    private boolean isHeaderOverlay;

    
    private String websiteMetaOgImg;

    
    private String seoName;

    
    private Object arch;


    public WebsitePage() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public IrUiView getInheritIdAsObject() {
        return inheritIdAsObject;
    }

    public OdooId getInheritId() {
        return inheritId;
    }

    public boolean getIsHeaderVisible() {
        return isHeaderVisible;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public Object getArchBase() {
        return archBase;
    }

    public Object getType() {
        return type;
    }

    public Object getMode() {
        return mode;
    }

    public boolean getIsCanPublish() {
        return isCanPublish;
    }

    public boolean getIsCustomizeShow() {
        return isCustomizeShow;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsWebsiteIndexed() {
        return isWebsiteIndexed;
    }

    public boolean getIsIsHomepage() {
        return isIsHomepage;
    }

    public boolean getIsArchUpdated() {
        return isArchUpdated;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public Object getVisibility() {
        return visibility;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public List<IrUiView> getInheritChildrenIdsAsList() {
        return inheritChildrenIdsAsList;
    }

    public List<Integer> getInheritChildrenIds() {
        return inheritChildrenIds;
    }

    public String getHeaderTextColor() {
        return headerTextColor;
    }

    public IrModelData getModelDataIdAsObject() {
        return modelDataIdAsObject;
    }

    public OdooId getModelDataId() {
        return modelDataId;
    }

    public boolean getIsActive() {
        return isActive;
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

    public int getPriority() {
        return priority;
    }

    public List<WebsiteControllerPage> getControllerPageIdsAsList() {
        return controllerPageIdsAsList;
    }

    public List<Integer> getControllerPageIds() {
        return controllerPageIds;
    }

    public WebsitePage getFirstPageIdAsObject() {
        return firstPageIdAsObject;
    }

    public OdooId getFirstPageId() {
        return firstPageId;
    }

    public String getVisibilityPasswordDisplay() {
        return visibilityPasswordDisplay;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public List<WebsitePage> getPageIdsAsList() {
        return pageIdsAsList;
    }

    public List<Integer> getPageIds() {
        return pageIds;
    }

    public String getName() {
        return name;
    }

    public String getXmlId() {
        return xmlId;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public String getArchFs() {
        return archFs;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getVisibilityPassword() {
        return visibilityPassword;
    }

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public List<WebsiteMenu> getMenuIdsAsList() {
        return menuIdsAsList;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public Object getArchPrev() {
        return archPrev;
    }

    public ThemeWebsitePage getThemeTemplateIdAsObject() {
        return themeTemplateIdAsObject;
    }

    public OdooId getThemeTemplateId() {
        return themeTemplateId;
    }

    public boolean getIsIsInMenu() {
        return isIsInMenu;
    }

    public boolean getIsTrack() {
        return isTrack;
    }

    public String getKey() {
        return key;
    }

    public boolean getIsIsVisible() {
        return isIsVisible;
    }

    public boolean getIsFooterVisible() {
        return isFooterVisible;
    }

    public IrUiView getViewIdAsObject() {
        return viewIdAsObject;
    }

    public OdooId getViewId() {
        return viewId;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public String getUrl() {
        return url;
    }

    public Object getArchDb() {
        return archDb;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public boolean getIsHeaderOverlay() {
        return isHeaderOverlay;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public String getSeoName() {
        return seoName;
    }

    public Object getArch() {
        return arch;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
    }

    public void setInheritIdAsObject(IrUiView inheritIdAsObject) {
        this.inheritIdAsObject = inheritIdAsObject;
    }

    public void setInheritId(OdooId inheritId) {
        this.inheritId = inheritId;
    }

    public void setIsHeaderVisible(boolean isHeaderVisible) {
        this.isHeaderVisible = isHeaderVisible;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setArchBase(Object archBase) {
        this.archBase = archBase;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setMode(Object mode) {
        this.mode = mode;
    }

    public void setIsCanPublish(boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
    }

    public void setIsCustomizeShow(boolean isCustomizeShow) {
        this.isCustomizeShow = isCustomizeShow;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsWebsiteIndexed(boolean isWebsiteIndexed) {
        this.isWebsiteIndexed = isWebsiteIndexed;
    }

    public void setIsIsHomepage(boolean isIsHomepage) {
        this.isIsHomepage = isIsHomepage;
    }

    public void setIsArchUpdated(boolean isArchUpdated) {
        this.isArchUpdated = isArchUpdated;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public void setInheritChildrenIdsAsList(List<IrUiView> inheritChildrenIdsAsList) {
        this.inheritChildrenIdsAsList = inheritChildrenIdsAsList;
    }

    public void setInheritChildrenIds(List<Integer> inheritChildrenIds) {
        this.inheritChildrenIds = inheritChildrenIds;
    }

    public void setHeaderTextColor(String headerTextColor) {
        this.headerTextColor = headerTextColor;
    }

    public void setModelDataIdAsObject(IrModelData modelDataIdAsObject) {
        this.modelDataIdAsObject = modelDataIdAsObject;
    }

    public void setModelDataId(OdooId modelDataId) {
        this.modelDataId = modelDataId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setControllerPageIdsAsList(List<WebsiteControllerPage> controllerPageIdsAsList) {
        this.controllerPageIdsAsList = controllerPageIdsAsList;
    }

    public void setControllerPageIds(List<Integer> controllerPageIds) {
        this.controllerPageIds = controllerPageIds;
    }

    public void setFirstPageIdAsObject(WebsitePage firstPageIdAsObject) {
        this.firstPageIdAsObject = firstPageIdAsObject;
    }

    public void setFirstPageId(OdooId firstPageId) {
        this.firstPageId = firstPageId;
    }

    public void setVisibilityPasswordDisplay(String visibilityPasswordDisplay) {
        this.visibilityPasswordDisplay = visibilityPasswordDisplay;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
    }

    public void setPageIdsAsList(List<WebsitePage> pageIdsAsList) {
        this.pageIdsAsList = pageIdsAsList;
    }

    public void setPageIds(List<Integer> pageIds) {
        this.pageIds = pageIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setArchFs(String archFs) {
        this.archFs = archFs;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setVisibilityPassword(String visibilityPassword) {
        this.visibilityPassword = visibilityPassword;
    }

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setMenuIdsAsList(List<WebsiteMenu> menuIdsAsList) {
        this.menuIdsAsList = menuIdsAsList;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    public void setArchPrev(Object archPrev) {
        this.archPrev = archPrev;
    }

    public void setThemeTemplateIdAsObject(ThemeWebsitePage themeTemplateIdAsObject) {
        this.themeTemplateIdAsObject = themeTemplateIdAsObject;
    }

    public void setThemeTemplateId(OdooId themeTemplateId) {
        this.themeTemplateId = themeTemplateId;
    }

    public void setIsIsInMenu(boolean isIsInMenu) {
        this.isIsInMenu = isIsInMenu;
    }

    public void setIsTrack(boolean isTrack) {
        this.isTrack = isTrack;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setIsIsVisible(boolean isIsVisible) {
        this.isIsVisible = isIsVisible;
    }

    public void setIsFooterVisible(boolean isFooterVisible) {
        this.isFooterVisible = isFooterVisible;
    }

    public void setViewIdAsObject(IrUiView viewIdAsObject) {
        this.viewIdAsObject = viewIdAsObject;
    }

    public void setViewId(OdooId viewId) {
        this.viewId = viewId;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setArchDb(Object archDb) {
        this.archDb = archDb;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setIsHeaderOverlay(boolean isHeaderOverlay) {
        this.isHeaderOverlay = isHeaderOverlay;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public void setArch(Object arch) {
        this.arch = arch;
    }



}