
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

package ch.helvethink.odoo4java.test.ng.sale;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.test.ng.utm.UtmMedium;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerIndustry;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.utm.UtmCampaign;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.utm.UtmSource;;

@OdooObject("sale.report")
public class SaleReport implements OdooObj {

    
    private Date date;

    
    private ProductCategory categIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId categId;

    
    private ResPartnerIndustry industryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerIndustry")
        @OdooModel("res.partner.ResPartnerIndustry")
    
    private OdooId industryId;

    
    private double qtyToDeliver;

    
    private Object orderReference;

    
    private Object priceSubtotal;

    
    private Object discountAmount;

    
    private double qtyDelivered;

    
    private double discount;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private Object untaxedAmountInvoiced;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private double qtyInvoiced;

    
    private AccountAnalyticAccount analyticAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId analyticAccountId;

    
    private ResPartner commercialPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId commercialPartnerId;

    
    private Object state;

    
    private ResCountryState stateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId stateId;

    
    private int id;

    
    private UtmMedium mediumIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmMedium")
        @OdooModel("utm.UtmMedium")
    
    private OdooId mediumId;

    
    private UtmCampaign campaignIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmCampaign")
        @OdooModel("utm.UtmCampaign")
    
    private OdooId campaignId;

    
    private Uom productUomAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId productUom;

    
    private Object untaxedAmountToInvoice;

    
    private double qtyToInvoice;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private ProductPricelist pricelistIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId pricelistId;

    
    private double weight;

    
    private String displayName;

    
    private double volume;

    
    private ProductTemplate productTmplIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private OdooId productTmplId;

    
    private String partnerZip;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String name;

    
    private UtmSource sourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmSource")
        @OdooModel("utm.UtmSource")
    
    private OdooId sourceId;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private double productUomQty;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object invoiceStatus;

    
    private Object priceTotal;

    
    private int nbr;


    public SaleReport() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public ProductCategory getCategIdAsObject() {
        return categIdAsObject;
    }

    public OdooId getCategId() {
        return categId;
    }

    public ResPartnerIndustry getIndustryIdAsObject() {
        return industryIdAsObject;
    }

    public OdooId getIndustryId() {
        return industryId;
    }

    public double getQtyToDeliver() {
        return qtyToDeliver;
    }

    public Object getOrderReference() {
        return orderReference;
    }

    public Object getPriceSubtotal() {
        return priceSubtotal;
    }

    public Object getDiscountAmount() {
        return discountAmount;
    }

    public double getQtyDelivered() {
        return qtyDelivered;
    }

    public double getDiscount() {
        return discount;
    }

    public CrmTeam getTeamIdAsObject() {
        return teamIdAsObject;
    }

    public OdooId getTeamId() {
        return teamId;
    }

    public Object getUntaxedAmountInvoiced() {
        return untaxedAmountInvoiced;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public double getQtyInvoiced() {
        return qtyInvoiced;
    }

    public AccountAnalyticAccount getAnalyticAccountIdAsObject() {
        return analyticAccountIdAsObject;
    }

    public OdooId getAnalyticAccountId() {
        return analyticAccountId;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public Object getState() {
        return state;
    }

    public ResCountryState getStateIdAsObject() {
        return stateIdAsObject;
    }

    public OdooId getStateId() {
        return stateId;
    }

    public int getId() {
        return id;
    }

    public UtmMedium getMediumIdAsObject() {
        return mediumIdAsObject;
    }

    public OdooId getMediumId() {
        return mediumId;
    }

    public UtmCampaign getCampaignIdAsObject() {
        return campaignIdAsObject;
    }

    public OdooId getCampaignId() {
        return campaignId;
    }

    public Uom getProductUomAsObject() {
        return productUomAsObject;
    }

    public OdooId getProductUom() {
        return productUom;
    }

    public Object getUntaxedAmountToInvoice() {
        return untaxedAmountToInvoice;
    }

    public double getQtyToInvoice() {
        return qtyToInvoice;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public ProductPricelist getPricelistIdAsObject() {
        return pricelistIdAsObject;
    }

    public OdooId getPricelistId() {
        return pricelistId;
    }

    public double getWeight() {
        return weight;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getVolume() {
        return volume;
    }

    public ProductTemplate getProductTmplIdAsObject() {
        return productTmplIdAsObject;
    }

    public OdooId getProductTmplId() {
        return productTmplId;
    }

    public String getPartnerZip() {
        return partnerZip;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public UtmSource getSourceIdAsObject() {
        return sourceIdAsObject;
    }

    public OdooId getSourceId() {
        return sourceId;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public double getProductUomQty() {
        return productUomQty;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Object getInvoiceStatus() {
        return invoiceStatus;
    }

    public Object getPriceTotal() {
        return priceTotal;
    }

    public int getNbr() {
        return nbr;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategIdAsObject(ProductCategory categIdAsObject) {
        this.categIdAsObject = categIdAsObject;
    }

    public void setCategId(OdooId categId) {
        this.categId = categId;
    }

    public void setIndustryIdAsObject(ResPartnerIndustry industryIdAsObject) {
        this.industryIdAsObject = industryIdAsObject;
    }

    public void setIndustryId(OdooId industryId) {
        this.industryId = industryId;
    }

    public void setQtyToDeliver(double qtyToDeliver) {
        this.qtyToDeliver = qtyToDeliver;
    }

    public void setOrderReference(Object orderReference) {
        this.orderReference = orderReference;
    }

    public void setPriceSubtotal(Object priceSubtotal) {
        this.priceSubtotal = priceSubtotal;
    }

    public void setDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setQtyDelivered(double qtyDelivered) {
        this.qtyDelivered = qtyDelivered;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTeamIdAsObject(CrmTeam teamIdAsObject) {
        this.teamIdAsObject = teamIdAsObject;
    }

    public void setTeamId(OdooId teamId) {
        this.teamId = teamId;
    }

    public void setUntaxedAmountInvoiced(Object untaxedAmountInvoiced) {
        this.untaxedAmountInvoiced = untaxedAmountInvoiced;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setQtyInvoiced(double qtyInvoiced) {
        this.qtyInvoiced = qtyInvoiced;
    }

    public void setAnalyticAccountIdAsObject(AccountAnalyticAccount analyticAccountIdAsObject) {
        this.analyticAccountIdAsObject = analyticAccountIdAsObject;
    }

    public void setAnalyticAccountId(OdooId analyticAccountId) {
        this.analyticAccountId = analyticAccountId;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setStateIdAsObject(ResCountryState stateIdAsObject) {
        this.stateIdAsObject = stateIdAsObject;
    }

    public void setStateId(OdooId stateId) {
        this.stateId = stateId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMediumIdAsObject(UtmMedium mediumIdAsObject) {
        this.mediumIdAsObject = mediumIdAsObject;
    }

    public void setMediumId(OdooId mediumId) {
        this.mediumId = mediumId;
    }

    public void setCampaignIdAsObject(UtmCampaign campaignIdAsObject) {
        this.campaignIdAsObject = campaignIdAsObject;
    }

    public void setCampaignId(OdooId campaignId) {
        this.campaignId = campaignId;
    }

    public void setProductUomAsObject(Uom productUomAsObject) {
        this.productUomAsObject = productUomAsObject;
    }

    public void setProductUom(OdooId productUom) {
        this.productUom = productUom;
    }

    public void setUntaxedAmountToInvoice(Object untaxedAmountToInvoice) {
        this.untaxedAmountToInvoice = untaxedAmountToInvoice;
    }

    public void setQtyToInvoice(double qtyToInvoice) {
        this.qtyToInvoice = qtyToInvoice;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setPricelistIdAsObject(ProductPricelist pricelistIdAsObject) {
        this.pricelistIdAsObject = pricelistIdAsObject;
    }

    public void setPricelistId(OdooId pricelistId) {
        this.pricelistId = pricelistId;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setProductTmplIdAsObject(ProductTemplate productTmplIdAsObject) {
        this.productTmplIdAsObject = productTmplIdAsObject;
    }

    public void setProductTmplId(OdooId productTmplId) {
        this.productTmplId = productTmplId;
    }

    public void setPartnerZip(String partnerZip) {
        this.partnerZip = partnerZip;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourceIdAsObject(UtmSource sourceIdAsObject) {
        this.sourceIdAsObject = sourceIdAsObject;
    }

    public void setSourceId(OdooId sourceId) {
        this.sourceId = sourceId;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setProductUomQty(double productUomQty) {
        this.productUomQty = productUomQty;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setInvoiceStatus(Object invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setPriceTotal(Object priceTotal) {
        this.priceTotal = priceTotal;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }



}