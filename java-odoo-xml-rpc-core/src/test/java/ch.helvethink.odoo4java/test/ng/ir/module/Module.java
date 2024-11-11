
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

package ch.helvethink.odoo4java.test.ng.ir.module;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.module.module.IrModuleModuleDependency;
import ch.helvethink.odoo4java.test.ng.ir.module.module.IrModuleModuleExclusion;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("ir.module.module")
public class Module implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String icon;

    
    private Object description;

    
    private Object menusByModule;

    
    private boolean isAutoInstall;

    
    private boolean isDemo;

    
    private String maintainer;

    
    private boolean isIsInstalledOnCurrentWebsite;

    
    private IrModuleCategory categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.IrModuleCategory")
        @OdooModel("ir.module.IrModuleCategory")
    
    private OdooId categoryId;

    
    private String latestVersion;

    
    private boolean isImported;

    
    private Object state;

    
    private int id;

    
    private Date createDate;

    
    private Object reportsByModule;

    
    private String summary;

    
    private String website;

    
    private List<IrModuleModuleExclusion> exclusionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.module.IrModuleModuleExclusion")
        @OdooModel("ir.module.module.IrModuleModuleExclusion")
    
    private List<Integer> exclusionIds;

    
    private Object moduleType;

    
    private Object accountTemplates;

    
    private String author;

    
    private String installedVersion;

    
    private String shortdesc;

    
    private Object iconImage;

    
    private String iconFlag;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String url;

    
    private int sequence;

    
    private Object license;

    
    private boolean isApplication;

    
    private String name;

    
    private boolean isToBuy;

    
    private List<IrAttachment> imageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> imageIds;

    
    private Object viewsByModule;

    
    private Object descriptionHtml;

    
    private Object contributors;

    
    private boolean isHasIap;

    
    private List<IrModuleModuleDependency> dependenciesIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.module.IrModuleModuleDependency")
        @OdooModel("ir.module.module.IrModuleModuleDependency")
    
    private List<Integer> dependenciesId;

    
    private String publishedVersion;


    public Module() {
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

    public String getIcon() {
        return icon;
    }

    public Object getDescription() {
        return description;
    }

    public Object getMenusByModule() {
        return menusByModule;
    }

    public boolean getIsAutoInstall() {
        return isAutoInstall;
    }

    public boolean getIsDemo() {
        return isDemo;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public boolean getIsIsInstalledOnCurrentWebsite() {
        return isIsInstalledOnCurrentWebsite;
    }

    public IrModuleCategory getCategoryIdAsObject() {
        return categoryIdAsObject;
    }

    public OdooId getCategoryId() {
        return categoryId;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public boolean getIsImported() {
        return isImported;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getReportsByModule() {
        return reportsByModule;
    }

    public String getSummary() {
        return summary;
    }

    public String getWebsite() {
        return website;
    }

    public List<IrModuleModuleExclusion> getExclusionIdsAsList() {
        return exclusionIdsAsList;
    }

    public List<Integer> getExclusionIds() {
        return exclusionIds;
    }

    public Object getModuleType() {
        return moduleType;
    }

    public Object getAccountTemplates() {
        return accountTemplates;
    }

    public String getAuthor() {
        return author;
    }

    public String getInstalledVersion() {
        return installedVersion;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public Object getIconImage() {
        return iconImage;
    }

    public String getIconFlag() {
        return iconFlag;
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

    public int getSequence() {
        return sequence;
    }

    public Object getLicense() {
        return license;
    }

    public boolean getIsApplication() {
        return isApplication;
    }

    public String getName() {
        return name;
    }

    public boolean getIsToBuy() {
        return isToBuy;
    }

    public List<IrAttachment> getImageIdsAsList() {
        return imageIdsAsList;
    }

    public List<Integer> getImageIds() {
        return imageIds;
    }

    public Object getViewsByModule() {
        return viewsByModule;
    }

    public Object getDescriptionHtml() {
        return descriptionHtml;
    }

    public Object getContributors() {
        return contributors;
    }

    public boolean getIsHasIap() {
        return isHasIap;
    }

    public List<IrModuleModuleDependency> getDependenciesIdAsList() {
        return dependenciesIdAsList;
    }

    public List<Integer> getDependenciesId() {
        return dependenciesId;
    }

    public String getPublishedVersion() {
        return publishedVersion;
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

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMenusByModule(Object menusByModule) {
        this.menusByModule = menusByModule;
    }

    public void setIsAutoInstall(boolean isAutoInstall) {
        this.isAutoInstall = isAutoInstall;
    }

    public void setIsDemo(boolean isDemo) {
        this.isDemo = isDemo;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public void setIsIsInstalledOnCurrentWebsite(boolean isIsInstalledOnCurrentWebsite) {
        this.isIsInstalledOnCurrentWebsite = isIsInstalledOnCurrentWebsite;
    }

    public void setCategoryIdAsObject(IrModuleCategory categoryIdAsObject) {
        this.categoryIdAsObject = categoryIdAsObject;
    }

    public void setCategoryId(OdooId categoryId) {
        this.categoryId = categoryId;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public void setIsImported(boolean isImported) {
        this.isImported = isImported;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setReportsByModule(Object reportsByModule) {
        this.reportsByModule = reportsByModule;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setExclusionIdsAsList(List<IrModuleModuleExclusion> exclusionIdsAsList) {
        this.exclusionIdsAsList = exclusionIdsAsList;
    }

    public void setExclusionIds(List<Integer> exclusionIds) {
        this.exclusionIds = exclusionIds;
    }

    public void setModuleType(Object moduleType) {
        this.moduleType = moduleType;
    }

    public void setAccountTemplates(Object accountTemplates) {
        this.accountTemplates = accountTemplates;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public void setIconImage(Object iconImage) {
        this.iconImage = iconImage;
    }

    public void setIconFlag(String iconFlag) {
        this.iconFlag = iconFlag;
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

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public void setIsApplication(boolean isApplication) {
        this.isApplication = isApplication;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsToBuy(boolean isToBuy) {
        this.isToBuy = isToBuy;
    }

    public void setImageIdsAsList(List<IrAttachment> imageIdsAsList) {
        this.imageIdsAsList = imageIdsAsList;
    }

    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public void setViewsByModule(Object viewsByModule) {
        this.viewsByModule = viewsByModule;
    }

    public void setDescriptionHtml(Object descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public void setIsHasIap(boolean isHasIap) {
        this.isHasIap = isHasIap;
    }

    public void setDependenciesIdAsList(List<IrModuleModuleDependency> dependenciesIdAsList) {
        this.dependenciesIdAsList = dependenciesIdAsList;
    }

    public void setDependenciesId(List<Integer> dependenciesId) {
        this.dependenciesId = dependenciesId;
    }

    public void setPublishedVersion(String publishedVersion) {
        this.publishedVersion = publishedVersion;
    }



}