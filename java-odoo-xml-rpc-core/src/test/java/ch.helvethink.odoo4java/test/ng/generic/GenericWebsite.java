
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

package ch.helvethink.odoo4java.test.ng.generic;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.res.ResLang;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.website.WebsiteMenu;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.ir.module.Module;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("website")
public class GenericWebsite implements OdooObj {

    
    private Date writeDate;

    
    private Object customCodeHead;

    
    private List<ResLang> languageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private List<Integer> languageIds;

    
    private String plausibleSharedKey;

    
    private CrmTeam crmDefaultTeamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId crmDefaultTeamId;

    
    private boolean isConfiguratorDone;

    
    private String socialLinkedin;

    
    private String socialInstagram;

    
    private String websiteSlideGoogleAppKey;

    
    private Object logo;

    
    private int id;

    
    private Date createDate;

    
    private Object robotsTxt;

    
    private int languageCount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String socialTiktok;

    
    private int sequence;

    
    private boolean isSpecificUserAccount;

    
    private String socialTwitter;

    
    private String socialFacebook;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String cdnUrl;

    
    private String domain;

    
    private String name;

    
    private String googleMapsApiKey;

    
    private ResLang defaultLangIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResLang")
        @OdooModel("res.ResLang")
    
    private OdooId defaultLangId;

    
    private Object socialDefaultImage;

    
    private boolean isCookiesBar;

    
    private Object cdnFilters;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object authSignupUninvited;

    
    private String socialYoutube;

    
    private String homepageUrl;

    
    private Module themeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private OdooId themeId;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Object customCodeFooter;

    
    private WebsiteMenu menuIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteMenu")
        @OdooModel("website.WebsiteMenu")
    
    private OdooId menuId;

    
    private String plausibleSite;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String socialGithub;

    
    private Object favicon;

    
    private String googleSearchConsole;

    
    private ResUsers crmDefaultUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId crmDefaultUserId;

    
    private boolean isHasSocialDefaultImage;

    
    private boolean isAutoRedirectLang;

    
    private int karmaProfileMin;

    
    private boolean isCdnActivated;

    
    private String googleAnalyticsKey;


    public GenericWebsite() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getCustomCodeHead() {
        return customCodeHead;
    }

    public List<ResLang> getLanguageIdsAsList() {
        return languageIdsAsList;
    }

    public List<Integer> getLanguageIds() {
        return languageIds;
    }

    public String getPlausibleSharedKey() {
        return plausibleSharedKey;
    }

    public CrmTeam getCrmDefaultTeamIdAsObject() {
        return crmDefaultTeamIdAsObject;
    }

    public OdooId getCrmDefaultTeamId() {
        return crmDefaultTeamId;
    }

    public boolean getIsConfiguratorDone() {
        return isConfiguratorDone;
    }

    public String getSocialLinkedin() {
        return socialLinkedin;
    }

    public String getSocialInstagram() {
        return socialInstagram;
    }

    public String getWebsiteSlideGoogleAppKey() {
        return websiteSlideGoogleAppKey;
    }

    public Object getLogo() {
        return logo;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getRobotsTxt() {
        return robotsTxt;
    }

    public int getLanguageCount() {
        return languageCount;
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

    public String getSocialTiktok() {
        return socialTiktok;
    }

    public int getSequence() {
        return sequence;
    }

    public boolean getIsSpecificUserAccount() {
        return isSpecificUserAccount;
    }

    public String getSocialTwitter() {
        return socialTwitter;
    }

    public String getSocialFacebook() {
        return socialFacebook;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getCdnUrl() {
        return cdnUrl;
    }

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public String getGoogleMapsApiKey() {
        return googleMapsApiKey;
    }

    public ResLang getDefaultLangIdAsObject() {
        return defaultLangIdAsObject;
    }

    public OdooId getDefaultLangId() {
        return defaultLangId;
    }

    public Object getSocialDefaultImage() {
        return socialDefaultImage;
    }

    public boolean getIsCookiesBar() {
        return isCookiesBar;
    }

    public Object getCdnFilters() {
        return cdnFilters;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getAuthSignupUninvited() {
        return authSignupUninvited;
    }

    public String getSocialYoutube() {
        return socialYoutube;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public Module getThemeIdAsObject() {
        return themeIdAsObject;
    }

    public OdooId getThemeId() {
        return themeId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Object getCustomCodeFooter() {
        return customCodeFooter;
    }

    public WebsiteMenu getMenuIdAsObject() {
        return menuIdAsObject;
    }

    public OdooId getMenuId() {
        return menuId;
    }

    public String getPlausibleSite() {
        return plausibleSite;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public String getSocialGithub() {
        return socialGithub;
    }

    public Object getFavicon() {
        return favicon;
    }

    public String getGoogleSearchConsole() {
        return googleSearchConsole;
    }

    public ResUsers getCrmDefaultUserIdAsObject() {
        return crmDefaultUserIdAsObject;
    }

    public OdooId getCrmDefaultUserId() {
        return crmDefaultUserId;
    }

    public boolean getIsHasSocialDefaultImage() {
        return isHasSocialDefaultImage;
    }

    public boolean getIsAutoRedirectLang() {
        return isAutoRedirectLang;
    }

    public int getKarmaProfileMin() {
        return karmaProfileMin;
    }

    public boolean getIsCdnActivated() {
        return isCdnActivated;
    }

    public String getGoogleAnalyticsKey() {
        return googleAnalyticsKey;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setCustomCodeHead(Object customCodeHead) {
        this.customCodeHead = customCodeHead;
    }

    public void setLanguageIdsAsList(List<ResLang> languageIdsAsList) {
        this.languageIdsAsList = languageIdsAsList;
    }

    public void setLanguageIds(List<Integer> languageIds) {
        this.languageIds = languageIds;
    }

    public void setPlausibleSharedKey(String plausibleSharedKey) {
        this.plausibleSharedKey = plausibleSharedKey;
    }

    public void setCrmDefaultTeamIdAsObject(CrmTeam crmDefaultTeamIdAsObject) {
        this.crmDefaultTeamIdAsObject = crmDefaultTeamIdAsObject;
    }

    public void setCrmDefaultTeamId(OdooId crmDefaultTeamId) {
        this.crmDefaultTeamId = crmDefaultTeamId;
    }

    public void setIsConfiguratorDone(boolean isConfiguratorDone) {
        this.isConfiguratorDone = isConfiguratorDone;
    }

    public void setSocialLinkedin(String socialLinkedin) {
        this.socialLinkedin = socialLinkedin;
    }

    public void setSocialInstagram(String socialInstagram) {
        this.socialInstagram = socialInstagram;
    }

    public void setWebsiteSlideGoogleAppKey(String websiteSlideGoogleAppKey) {
        this.websiteSlideGoogleAppKey = websiteSlideGoogleAppKey;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRobotsTxt(Object robotsTxt) {
        this.robotsTxt = robotsTxt;
    }

    public void setLanguageCount(int languageCount) {
        this.languageCount = languageCount;
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

    public void setSocialTiktok(String socialTiktok) {
        this.socialTiktok = socialTiktok;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setIsSpecificUserAccount(boolean isSpecificUserAccount) {
        this.isSpecificUserAccount = isSpecificUserAccount;
    }

    public void setSocialTwitter(String socialTwitter) {
        this.socialTwitter = socialTwitter;
    }

    public void setSocialFacebook(String socialFacebook) {
        this.socialFacebook = socialFacebook;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setCdnUrl(String cdnUrl) {
        this.cdnUrl = cdnUrl;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoogleMapsApiKey(String googleMapsApiKey) {
        this.googleMapsApiKey = googleMapsApiKey;
    }

    public void setDefaultLangIdAsObject(ResLang defaultLangIdAsObject) {
        this.defaultLangIdAsObject = defaultLangIdAsObject;
    }

    public void setDefaultLangId(OdooId defaultLangId) {
        this.defaultLangId = defaultLangId;
    }

    public void setSocialDefaultImage(Object socialDefaultImage) {
        this.socialDefaultImage = socialDefaultImage;
    }

    public void setIsCookiesBar(boolean isCookiesBar) {
        this.isCookiesBar = isCookiesBar;
    }

    public void setCdnFilters(Object cdnFilters) {
        this.cdnFilters = cdnFilters;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setAuthSignupUninvited(Object authSignupUninvited) {
        this.authSignupUninvited = authSignupUninvited;
    }

    public void setSocialYoutube(String socialYoutube) {
        this.socialYoutube = socialYoutube;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public void setThemeIdAsObject(Module themeIdAsObject) {
        this.themeIdAsObject = themeIdAsObject;
    }

    public void setThemeId(OdooId themeId) {
        this.themeId = themeId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setCustomCodeFooter(Object customCodeFooter) {
        this.customCodeFooter = customCodeFooter;
    }

    public void setMenuIdAsObject(WebsiteMenu menuIdAsObject) {
        this.menuIdAsObject = menuIdAsObject;
    }

    public void setMenuId(OdooId menuId) {
        this.menuId = menuId;
    }

    public void setPlausibleSite(String plausibleSite) {
        this.plausibleSite = plausibleSite;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setSocialGithub(String socialGithub) {
        this.socialGithub = socialGithub;
    }

    public void setFavicon(Object favicon) {
        this.favicon = favicon;
    }

    public void setGoogleSearchConsole(String googleSearchConsole) {
        this.googleSearchConsole = googleSearchConsole;
    }

    public void setCrmDefaultUserIdAsObject(ResUsers crmDefaultUserIdAsObject) {
        this.crmDefaultUserIdAsObject = crmDefaultUserIdAsObject;
    }

    public void setCrmDefaultUserId(OdooId crmDefaultUserId) {
        this.crmDefaultUserId = crmDefaultUserId;
    }

    public void setIsHasSocialDefaultImage(boolean isHasSocialDefaultImage) {
        this.isHasSocialDefaultImage = isHasSocialDefaultImage;
    }

    public void setIsAutoRedirectLang(boolean isAutoRedirectLang) {
        this.isAutoRedirectLang = isAutoRedirectLang;
    }

    public void setKarmaProfileMin(int karmaProfileMin) {
        this.karmaProfileMin = karmaProfileMin;
    }

    public void setIsCdnActivated(boolean isCdnActivated) {
        this.isCdnActivated = isCdnActivated;
    }

    public void setGoogleAnalyticsKey(String googleAnalyticsKey) {
        this.googleAnalyticsKey = googleAnalyticsKey;
    }



}