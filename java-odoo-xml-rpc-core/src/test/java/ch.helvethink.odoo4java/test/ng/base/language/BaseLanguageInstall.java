
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

package ch.helvethink.odoo4java.test.ng.base.language;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.res.ResLang;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;;

@OdooObject("base.language.install")
public class BaseLanguageInstall implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResLang firstLangIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private OdooId firstLangId;

    
    private List<GenericWebsite> websiteIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private List<Integer> websiteIds;

    
    private int id;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private boolean isOverwrite;

    
    private List<ResLang> langIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private List<Integer> langIds;


    public BaseLanguageInstall() {
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

    public ResLang getFirstLangIdAsObject() {
        return firstLangIdAsObject;
    }

    public OdooId getFirstLangId() {
        return firstLangId;
    }

    public List<GenericWebsite> getWebsiteIdsAsList() {
        return websiteIdsAsList;
    }

    public List<Integer> getWebsiteIds() {
        return websiteIds;
    }

    public int getId() {
        return id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsOverwrite() {
        return isOverwrite;
    }

    public List<ResLang> getLangIdsAsList() {
        return langIdsAsList;
    }

    public List<Integer> getLangIds() {
        return langIds;
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

    public void setFirstLangIdAsObject(ResLang firstLangIdAsObject) {
        this.firstLangIdAsObject = firstLangIdAsObject;
    }

    public void setFirstLangId(OdooId firstLangId) {
        this.firstLangId = firstLangId;
    }

    public void setWebsiteIdsAsList(List<GenericWebsite> websiteIdsAsList) {
        this.websiteIdsAsList = websiteIdsAsList;
    }

    public void setWebsiteIds(List<Integer> websiteIds) {
        this.websiteIds = websiteIds;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsOverwrite(boolean isOverwrite) {
        this.isOverwrite = isOverwrite;
    }

    public void setLangIdsAsList(List<ResLang> langIdsAsList) {
        this.langIdsAsList = langIdsAsList;
    }

    public void setLangIds(List<Integer> langIds) {
        this.langIds = langIds;
    }



}