
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

package ch.helvethink.odoo4java.test.ng.website.configurator;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.module.Module;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;
import java.util.Date;;

@OdooObject("website.configurator.feature")
public class WebsiteConfiguratorFeature implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String icon;

    
    private String description;

    
    private IrUiView pageViewIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId pageViewId;

    
    private int menuSequence;

    
    private String featureUrl;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int sequence;

    
    private String websiteConfigPreselection;

    
    private Module moduleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private OdooId moduleId;

    
    private String iapPageCode;

    
    private boolean isMenuCompany;

    
    private String name;

    
    private int id;

    
    private Date createDate;


    public WebsiteConfiguratorFeature() {
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

    public String getDescription() {
        return description;
    }

    public IrUiView getPageViewIdAsObject() {
        return pageViewIdAsObject;
    }

    public OdooId getPageViewId() {
        return pageViewId;
    }

    public int getMenuSequence() {
        return menuSequence;
    }

    public String getFeatureUrl() {
        return featureUrl;
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

    public String getWebsiteConfigPreselection() {
        return websiteConfigPreselection;
    }

    public Module getModuleIdAsObject() {
        return moduleIdAsObject;
    }

    public OdooId getModuleId() {
        return moduleId;
    }

    public String getIapPageCode() {
        return iapPageCode;
    }

    public boolean getIsMenuCompany() {
        return isMenuCompany;
    }

    public String getName() {
        return name;
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

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPageViewIdAsObject(IrUiView pageViewIdAsObject) {
        this.pageViewIdAsObject = pageViewIdAsObject;
    }

    public void setPageViewId(OdooId pageViewId) {
        this.pageViewId = pageViewId;
    }

    public void setMenuSequence(int menuSequence) {
        this.menuSequence = menuSequence;
    }

    public void setFeatureUrl(String featureUrl) {
        this.featureUrl = featureUrl;
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

    public void setWebsiteConfigPreselection(String websiteConfigPreselection) {
        this.websiteConfigPreselection = websiteConfigPreselection;
    }

    public void setModuleIdAsObject(Module moduleIdAsObject) {
        this.moduleIdAsObject = moduleIdAsObject;
    }

    public void setModuleId(OdooId moduleId) {
        this.moduleId = moduleId;
    }

    public void setIapPageCode(String iapPageCode) {
        this.iapPageCode = iapPageCode;
    }

    public void setIsMenuCompany(boolean isMenuCompany) {
        this.isMenuCompany = isMenuCompany;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}