
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

package ch.helvethink.odoo4java.test.ng.base.document;

import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.report.ReportPaperformat;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.report.ReportLayout;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView;;

@OdooObject("base.document.layout")
public class BaseDocumentLayout implements OdooObj {

    
    private Object preview;

    
    private Date writeDate;

    
    private List<ResPartnerBank> bankIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private List<Integer> bankIds;

    
    private Object previewLogo;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object reportHeader;

    
    private String city;

    
    private IrUiView externalReportLayoutIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.ui.IrUiView")
        @OdooModel("ir.ui.IrUiView")
    
    private OdooId externalReportLayoutId;

    
    private Object layoutBackground;

    
    private String logoPrimaryColor;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String street;

    
    private String l10nDin5008DocumentTitle;

    
    private ReportPaperformat paperformatIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.report.ReportPaperformat")
        @OdooModel("report.ReportPaperformat")
    
    private OdooId paperformatId;

    
    private Object logo;

    
    private boolean isIsCompanyDetailsEmpty;

    
    private String secondaryColor;

    
    private int id;

    
    private String street2;

    
    private Date createDate;

    
    private String email;

    
    private String zip;

    
    private String website;

    
    private Object reportFooter;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isCustomColors;

    
    private String companyRegistry;

    
    private String logoSecondaryColor;

    
    private String vat;

    
    private ReportLayout reportLayoutIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.report.ReportLayout")
        @OdooModel("report.ReportLayout")
    
    private OdooId reportLayoutId;

    
    private String primaryColor;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private ResCountry accountFiscalCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId accountFiscalCountryId;

    
    private Object l10nDin5008TemplateData;

    
    private Object layoutBackgroundImage;

    
    private String phone;

    
    private String name;

    
    private Object companyDetails;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private Object font;


    public BaseDocumentLayout() {
    // Constructor
    }


    public Object getPreview() {
        return preview;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResPartnerBank> getBankIdsAsList() {
        return bankIdsAsList;
    }

    public List<Integer> getBankIds() {
        return bankIds;
    }

    public Object getPreviewLogo() {
        return previewLogo;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getReportHeader() {
        return reportHeader;
    }

    public String getCity() {
        return city;
    }

    public IrUiView getExternalReportLayoutIdAsObject() {
        return externalReportLayoutIdAsObject;
    }

    public OdooId getExternalReportLayoutId() {
        return externalReportLayoutId;
    }

    public Object getLayoutBackground() {
        return layoutBackground;
    }

    public String getLogoPrimaryColor() {
        return logoPrimaryColor;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getStreet() {
        return street;
    }

    public String getL10nDin5008DocumentTitle() {
        return l10nDin5008DocumentTitle;
    }

    public ReportPaperformat getPaperformatIdAsObject() {
        return paperformatIdAsObject;
    }

    public OdooId getPaperformatId() {
        return paperformatId;
    }

    public Object getLogo() {
        return logo;
    }

    public boolean getIsIsCompanyDetailsEmpty() {
        return isIsCompanyDetailsEmpty;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public int getId() {
        return id;
    }

    public String getStreet2() {
        return street2;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getEmail() {
        return email;
    }

    public String getZip() {
        return zip;
    }

    public String getWebsite() {
        return website;
    }

    public Object getReportFooter() {
        return reportFooter;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsCustomColors() {
        return isCustomColors;
    }

    public String getCompanyRegistry() {
        return companyRegistry;
    }

    public String getLogoSecondaryColor() {
        return logoSecondaryColor;
    }

    public String getVat() {
        return vat;
    }

    public ReportLayout getReportLayoutIdAsObject() {
        return reportLayoutIdAsObject;
    }

    public OdooId getReportLayoutId() {
        return reportLayoutId;
    }

    public String getPrimaryColor() {
        return primaryColor;
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

    public ResCountry getAccountFiscalCountryIdAsObject() {
        return accountFiscalCountryIdAsObject;
    }

    public OdooId getAccountFiscalCountryId() {
        return accountFiscalCountryId;
    }

    public Object getL10nDin5008TemplateData() {
        return l10nDin5008TemplateData;
    }

    public Object getLayoutBackgroundImage() {
        return layoutBackgroundImage;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Object getCompanyDetails() {
        return companyDetails;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public Object getFont() {
        return font;
    }



    public void setPreview(Object preview) {
        this.preview = preview;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setBankIdsAsList(List<ResPartnerBank> bankIdsAsList) {
        this.bankIdsAsList = bankIdsAsList;
    }

    public void setBankIds(List<Integer> bankIds) {
        this.bankIds = bankIds;
    }

    public void setPreviewLogo(Object previewLogo) {
        this.previewLogo = previewLogo;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setReportHeader(Object reportHeader) {
        this.reportHeader = reportHeader;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setExternalReportLayoutIdAsObject(IrUiView externalReportLayoutIdAsObject) {
        this.externalReportLayoutIdAsObject = externalReportLayoutIdAsObject;
    }

    public void setExternalReportLayoutId(OdooId externalReportLayoutId) {
        this.externalReportLayoutId = externalReportLayoutId;
    }

    public void setLayoutBackground(Object layoutBackground) {
        this.layoutBackground = layoutBackground;
    }

    public void setLogoPrimaryColor(String logoPrimaryColor) {
        this.logoPrimaryColor = logoPrimaryColor;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setL10nDin5008DocumentTitle(String l10nDin5008DocumentTitle) {
        this.l10nDin5008DocumentTitle = l10nDin5008DocumentTitle;
    }

    public void setPaperformatIdAsObject(ReportPaperformat paperformatIdAsObject) {
        this.paperformatIdAsObject = paperformatIdAsObject;
    }

    public void setPaperformatId(OdooId paperformatId) {
        this.paperformatId = paperformatId;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public void setIsIsCompanyDetailsEmpty(boolean isIsCompanyDetailsEmpty) {
        this.isIsCompanyDetailsEmpty = isIsCompanyDetailsEmpty;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setReportFooter(Object reportFooter) {
        this.reportFooter = reportFooter;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsCustomColors(boolean isCustomColors) {
        this.isCustomColors = isCustomColors;
    }

    public void setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry;
    }

    public void setLogoSecondaryColor(String logoSecondaryColor) {
        this.logoSecondaryColor = logoSecondaryColor;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setReportLayoutIdAsObject(ReportLayout reportLayoutIdAsObject) {
        this.reportLayoutIdAsObject = reportLayoutIdAsObject;
    }

    public void setReportLayoutId(OdooId reportLayoutId) {
        this.reportLayoutId = reportLayoutId;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
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

    public void setAccountFiscalCountryIdAsObject(ResCountry accountFiscalCountryIdAsObject) {
        this.accountFiscalCountryIdAsObject = accountFiscalCountryIdAsObject;
    }

    public void setAccountFiscalCountryId(OdooId accountFiscalCountryId) {
        this.accountFiscalCountryId = accountFiscalCountryId;
    }

    public void setL10nDin5008TemplateData(Object l10nDin5008TemplateData) {
        this.l10nDin5008TemplateData = l10nDin5008TemplateData;
    }

    public void setLayoutBackgroundImage(Object layoutBackgroundImage) {
        this.layoutBackgroundImage = layoutBackgroundImage;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyDetails(Object companyDetails) {
        this.companyDetails = companyDetails;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setFont(Object font) {
        this.font = font;
    }



}