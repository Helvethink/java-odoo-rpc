
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

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.website.WebsiteTrack;
import ch.helvethink.odoo4java.test.ng.res.ResLang;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.website.WebsitePage;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("website.visitor")
public class WebsiteVisitor implements OdooObj {

    
    private List<WebsiteTrack> websiteTrackIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteTrack")
        @OdooModel("website.WebsiteTrack")
    
    private List<Integer> websiteTrackIds;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object timezone;

    
    private WebsitePage lastVisitedPageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private OdooId lastVisitedPageId;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String timeSinceLastAction;

    
    private int id;

    
    private Date createDate;

    
    private List<CrmLead> leadIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> leadIds;

    
    private String email;

    
    private int pageCount;

    
    private Date lastConnectionDatetime;

    
    private boolean isIsConnected;

    
    private int visitCount;

    
    private String mobile;

    
    private ResLang langIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private OdooId langId;

    
    private int visitorPageCount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int leadCount;

    
    private String accessToken;

    
    private List<WebsitePage> pageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private List<Integer> pageIds;

    
    private String name;

    
    private Object partnerImage;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private String countryFlag;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;


    public WebsiteVisitor() {
    // Constructor
    }


    public List<WebsiteTrack> getWebsiteTrackIdsAsList() {
        return websiteTrackIdsAsList;
    }

    public List<Integer> getWebsiteTrackIds() {
        return websiteTrackIds;
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

    public Object getTimezone() {
        return timezone;
    }

    public WebsitePage getLastVisitedPageIdAsObject() {
        return lastVisitedPageIdAsObject;
    }

    public OdooId getLastVisitedPageId() {
        return lastVisitedPageId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getTimeSinceLastAction() {
        return timeSinceLastAction;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public List<CrmLead> getLeadIdsAsList() {
        return leadIdsAsList;
    }

    public List<Integer> getLeadIds() {
        return leadIds;
    }

    public String getEmail() {
        return email;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Date getLastConnectionDatetime() {
        return lastConnectionDatetime;
    }

    public boolean getIsIsConnected() {
        return isIsConnected;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public String getMobile() {
        return mobile;
    }

    public ResLang getLangIdAsObject() {
        return langIdAsObject;
    }

    public OdooId getLangId() {
        return langId;
    }

    public int getVisitorPageCount() {
        return visitorPageCount;
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

    public int getLeadCount() {
        return leadCount;
    }

    public String getAccessToken() {
        return accessToken;
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

    public Object getPartnerImage() {
        return partnerImage;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }



    public void setWebsiteTrackIdsAsList(List<WebsiteTrack> websiteTrackIdsAsList) {
        this.websiteTrackIdsAsList = websiteTrackIdsAsList;
    }

    public void setWebsiteTrackIds(List<Integer> websiteTrackIds) {
        this.websiteTrackIds = websiteTrackIds;
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

    public void setTimezone(Object timezone) {
        this.timezone = timezone;
    }

    public void setLastVisitedPageIdAsObject(WebsitePage lastVisitedPageIdAsObject) {
        this.lastVisitedPageIdAsObject = lastVisitedPageIdAsObject;
    }

    public void setLastVisitedPageId(OdooId lastVisitedPageId) {
        this.lastVisitedPageId = lastVisitedPageId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setTimeSinceLastAction(String timeSinceLastAction) {
        this.timeSinceLastAction = timeSinceLastAction;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLeadIdsAsList(List<CrmLead> leadIdsAsList) {
        this.leadIdsAsList = leadIdsAsList;
    }

    public void setLeadIds(List<Integer> leadIds) {
        this.leadIds = leadIds;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setLastConnectionDatetime(Date lastConnectionDatetime) {
        this.lastConnectionDatetime = lastConnectionDatetime;
    }

    public void setIsIsConnected(boolean isIsConnected) {
        this.isIsConnected = isIsConnected;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setLangIdAsObject(ResLang langIdAsObject) {
        this.langIdAsObject = langIdAsObject;
    }

    public void setLangId(OdooId langId) {
        this.langId = langId;
    }

    public void setVisitorPageCount(int visitorPageCount) {
        this.visitorPageCount = visitorPageCount;
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

    public void setLeadCount(int leadCount) {
        this.leadCount = leadCount;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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

    public void setPartnerImage(Object partnerImage) {
        this.partnerImage = partnerImage;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}