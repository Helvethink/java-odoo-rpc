
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

package ch.helvethink.odoo4java.test.ng.product;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.test.ng.product.ProductSupplierinfo;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.product.ProductTag;
import ch.helvethink.odoo4java.test.ng.product.ProductPackaging;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.product.ProductDocument;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue;
import ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("product.product")
public class Product implements OdooObj {

    
    private Date writeDate;

    
    private Object descriptionPurchase;

    
    private double totalCost;

    
    private String combinationIndices;

    
    private boolean isCanImageVariant1024BeZoomed;

    
    private Object invoiceState;

    
    private Object activityDateDeadline;

    
    private boolean isCanImage1024BeZoomed;

    
    private Object type;

    
    private List<ProductTemplateAttributeLine> attributeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine")
        @OdooModel("product.template.attribute.ProductTemplateAttributeLine")
    
    private List<Integer> attributeLineIds;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private List<ProductSupplierinfo> sellerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductSupplierinfo")
        @OdooModel("product.ProductSupplierinfo")
    
    private List<Integer> sellerIds;

    
    private double expectedMarginRate;

    
    private String volumeUomName;

    
    private boolean isProductCatalogProductIsInSaleOrder;

    
    private double saleExpected;

    
    private int id;

    
    private String standardPriceUpdateWarning;

    
    private String uomName;

    
    private Object productProperties;

    
    private String defaultCode;

    
    private Object invoicePolicy;

    
    private Object imageVariant512;

    
    private int messageAttachmentCount;

    
    private String taxString;

    
    private String fiscalCountryCodes;

    
    private Object expensePolicy;

    
    private double salesGap;

    
    private boolean isActive;

    
    private Object image1920;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object priority;

    
    private double saleAvgPrice;

    
    private ProductTemplate productTmplIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private OdooId productTmplId;

    
    private Uom uomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId uomId;

    
    private List<ProductTag> additionalProductTagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTag")
        @OdooModel("product.ProductTag")
    
    private List<Integer> additionalProductTagIds;

    
    private String productTooltip;

    
    private boolean isCanBeExpensed;

    
    private boolean isVisibleExpensePolicy;

    
    private int productDocumentCount;

    
    private double priceExtra;

    
    private boolean isMessageIsFollower;

    
    private double normalCost;

    
    private Uom uomPoIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId uomPoId;

    
    private List<AccountTax> taxesIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> taxesId;

    
    private List<ProductTemplate> optionalProductIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private List<Integer> optionalProductIds;

    
    private Object saleLineWarn;

    
    private boolean isPurchaseOk;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<ProductTag> productTagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTag")
        @OdooModel("product.ProductTag")
    
    private List<Integer> productTagIds;

    
    private String weightUomName;

    
    private boolean isMessageHasSmsError;

    
    private double salesCount;

    
    private double listPrice;

    
    private Account propertyAccountExpenseIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountExpenseId;

    
    private List<AccountAccountTag> accountTagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag")
        @OdooModel("account.account.AccountAccountTag")
    
    private List<Integer> accountTagIds;

    
    private Project projectTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectTemplateId;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private String serviceUpsellThresholdRatio;

    
    private double purchaseNumInvoiced;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private Product productVariantIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productVariantId;

    
    private double purchaseGap;

    
    private String partnerRef;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private double lstPrice;

    
    private Object activityExceptionDecoration;

    
    private double expectedMargin;

    
    private Object descriptionSale;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private int productVariantCount;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private boolean isHasMessage;

    
    private Date createDate;

    
    private String barcode;

    
    private Object image512;

    
    private List<Product> productVariantIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private List<Integer> productVariantIds;

    
    private double standardPrice;

    
    private List<ProductTemplateAttributeValue> productTemplateVariantValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue")
        @OdooModel("product.template.attribute.ProductTemplateAttributeValue")
    
    private List<Integer> productTemplateVariantValueIds;

    
    private Object serviceTracking;

    
    private List<ProductTemplateAttributeValue> productTemplateAttributeValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue")
        @OdooModel("product.template.attribute.ProductTemplateAttributeValue")
    
    private List<Integer> productTemplateAttributeValueIds;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private double weight;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private Object dateTo;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private List<ProductTag> allProductTagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTag")
        @OdooModel("product.ProductTag")
    
    private List<Integer> allProductTagIds;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private double volume;

    
    private int sequence;

    
    private List<ProductPackaging> packagingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPackaging")
        @OdooModel("product.ProductPackaging")
    
    private List<Integer> packagingIds;

    
    private List<ProductTemplateAttributeLine> validProductTemplateAttributeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeLine")
        @OdooModel("product.template.attribute.ProductTemplateAttributeLine")
    
    private List<Integer> validProductTemplateAttributeLineIds;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private Object dateFrom;

    
    private ProductCategory categIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId categId;

    
    private Object imageVariant128;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private Object image256;

    
    private int color;

    
    private List<ProductDocument> productDocumentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductDocument")
        @OdooModel("product.ProductDocument")
    
    private List<Integer> productDocumentIds;

    
    private boolean isSaleOk;

    
    private Object description;

    
    private Object myActivityDateDeadline;

    
    private double totalMargin;

    
    private List<AccountTax> supplierTaxesIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> supplierTaxesId;

    
    private double saleNumInvoiced;

    
    private Object imageVariant1024;

    
    private double serviceUpsellThreshold;

    
    private String expensePolicyTooltip;

    
    private Account propertyAccountIncomeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountIncomeId;

    
    private Object detailedType;

    
    private double turnover;

    
    private List<ProductSupplierinfo> variantSellerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductSupplierinfo")
        @OdooModel("product.ProductSupplierinfo")
    
    private List<Integer> variantSellerIds;

    
    private Object servicePolicy;

    
    private String activityTypeIcon;

    
    private Object image1024;

    
    private double totalMarginRate;

    
    private Object imageVariant1920;

    
    private Object imageVariant256;

    
    private boolean isMessageHasError;

    
    private Object serviceType;

    
    private boolean isHasConfigurableAttributes;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private boolean isIsProductVariant;

    
    private int messageNeedactionCounter;

    
    private ResCurrency costCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId costCurrencyId;

    
    private Object saleLineWarnMsg;

    
    private double purchaseAvgPrice;

    
    private int pricelistItemCount;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object image128;


    public Product() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getDescriptionPurchase() {
        return descriptionPurchase;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getCombinationIndices() {
        return combinationIndices;
    }

    public boolean getIsCanImageVariant1024BeZoomed() {
        return isCanImageVariant1024BeZoomed;
    }

    public Object getInvoiceState() {
        return invoiceState;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public boolean getIsCanImage1024BeZoomed() {
        return isCanImage1024BeZoomed;
    }

    public Object getType() {
        return type;
    }

    public List<ProductTemplateAttributeLine> getAttributeLineIdsAsList() {
        return attributeLineIdsAsList;
    }

    public List<Integer> getAttributeLineIds() {
        return attributeLineIds;
    }

    public Object getActivityState() {
        return activityState;
    }

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public List<ProductSupplierinfo> getSellerIdsAsList() {
        return sellerIdsAsList;
    }

    public List<Integer> getSellerIds() {
        return sellerIds;
    }

    public double getExpectedMarginRate() {
        return expectedMarginRate;
    }

    public String getVolumeUomName() {
        return volumeUomName;
    }

    public boolean getIsProductCatalogProductIsInSaleOrder() {
        return isProductCatalogProductIsInSaleOrder;
    }

    public double getSaleExpected() {
        return saleExpected;
    }

    public int getId() {
        return id;
    }

    public String getStandardPriceUpdateWarning() {
        return standardPriceUpdateWarning;
    }

    public String getUomName() {
        return uomName;
    }

    public Object getProductProperties() {
        return productProperties;
    }

    public String getDefaultCode() {
        return defaultCode;
    }

    public Object getInvoicePolicy() {
        return invoicePolicy;
    }

    public Object getImageVariant512() {
        return imageVariant512;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public String getTaxString() {
        return taxString;
    }

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public Object getExpensePolicy() {
        return expensePolicy;
    }

    public double getSalesGap() {
        return salesGap;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getImage1920() {
        return image1920;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public Object getPriority() {
        return priority;
    }

    public double getSaleAvgPrice() {
        return saleAvgPrice;
    }

    public ProductTemplate getProductTmplIdAsObject() {
        return productTmplIdAsObject;
    }

    public OdooId getProductTmplId() {
        return productTmplId;
    }

    public Uom getUomIdAsObject() {
        return uomIdAsObject;
    }

    public OdooId getUomId() {
        return uomId;
    }

    public List<ProductTag> getAdditionalProductTagIdsAsList() {
        return additionalProductTagIdsAsList;
    }

    public List<Integer> getAdditionalProductTagIds() {
        return additionalProductTagIds;
    }

    public String getProductTooltip() {
        return productTooltip;
    }

    public boolean getIsCanBeExpensed() {
        return isCanBeExpensed;
    }

    public boolean getIsVisibleExpensePolicy() {
        return isVisibleExpensePolicy;
    }

    public int getProductDocumentCount() {
        return productDocumentCount;
    }

    public double getPriceExtra() {
        return priceExtra;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public double getNormalCost() {
        return normalCost;
    }

    public Uom getUomPoIdAsObject() {
        return uomPoIdAsObject;
    }

    public OdooId getUomPoId() {
        return uomPoId;
    }

    public List<AccountTax> getTaxesIdAsList() {
        return taxesIdAsList;
    }

    public List<Integer> getTaxesId() {
        return taxesId;
    }

    public List<ProductTemplate> getOptionalProductIdsAsList() {
        return optionalProductIdsAsList;
    }

    public List<Integer> getOptionalProductIds() {
        return optionalProductIds;
    }

    public Object getSaleLineWarn() {
        return saleLineWarn;
    }

    public boolean getIsPurchaseOk() {
        return isPurchaseOk;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public List<ProductTag> getProductTagIdsAsList() {
        return productTagIdsAsList;
    }

    public List<Integer> getProductTagIds() {
        return productTagIds;
    }

    public String getWeightUomName() {
        return weightUomName;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public double getSalesCount() {
        return salesCount;
    }

    public double getListPrice() {
        return listPrice;
    }

    public Account getPropertyAccountExpenseIdAsObject() {
        return propertyAccountExpenseIdAsObject;
    }

    public OdooId getPropertyAccountExpenseId() {
        return propertyAccountExpenseId;
    }

    public List<AccountAccountTag> getAccountTagIdsAsList() {
        return accountTagIdsAsList;
    }

    public List<Integer> getAccountTagIds() {
        return accountTagIds;
    }

    public Project getProjectTemplateIdAsObject() {
        return projectTemplateIdAsObject;
    }

    public OdooId getProjectTemplateId() {
        return projectTemplateId;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public String getServiceUpsellThresholdRatio() {
        return serviceUpsellThresholdRatio;
    }

    public double getPurchaseNumInvoiced() {
        return purchaseNumInvoiced;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public Product getProductVariantIdAsObject() {
        return productVariantIdAsObject;
    }

    public OdooId getProductVariantId() {
        return productVariantId;
    }

    public double getPurchaseGap() {
        return purchaseGap;
    }

    public String getPartnerRef() {
        return partnerRef;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public double getLstPrice() {
        return lstPrice;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public double getExpectedMargin() {
        return expectedMargin;
    }

    public Object getDescriptionSale() {
        return descriptionSale;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public int getProductVariantCount() {
        return productVariantCount;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getBarcode() {
        return barcode;
    }

    public Object getImage512() {
        return image512;
    }

    public List<Product> getProductVariantIdsAsList() {
        return productVariantIdsAsList;
    }

    public List<Integer> getProductVariantIds() {
        return productVariantIds;
    }

    public double getStandardPrice() {
        return standardPrice;
    }

    public List<ProductTemplateAttributeValue> getProductTemplateVariantValueIdsAsList() {
        return productTemplateVariantValueIdsAsList;
    }

    public List<Integer> getProductTemplateVariantValueIds() {
        return productTemplateVariantValueIds;
    }

    public Object getServiceTracking() {
        return serviceTracking;
    }

    public List<ProductTemplateAttributeValue> getProductTemplateAttributeValueIdsAsList() {
        return productTemplateAttributeValueIdsAsList;
    }

    public List<Integer> getProductTemplateAttributeValueIds() {
        return productTemplateAttributeValueIds;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public double getWeight() {
        return weight;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public Object getDateTo() {
        return dateTo;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<ProductTag> getAllProductTagIdsAsList() {
        return allProductTagIdsAsList;
    }

    public List<Integer> getAllProductTagIds() {
        return allProductTagIds;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public double getVolume() {
        return volume;
    }

    public int getSequence() {
        return sequence;
    }

    public List<ProductPackaging> getPackagingIdsAsList() {
        return packagingIdsAsList;
    }

    public List<Integer> getPackagingIds() {
        return packagingIds;
    }

    public List<ProductTemplateAttributeLine> getValidProductTemplateAttributeLineIdsAsList() {
        return validProductTemplateAttributeLineIdsAsList;
    }

    public List<Integer> getValidProductTemplateAttributeLineIds() {
        return validProductTemplateAttributeLineIds;
    }

    public String getName() {
        return name;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public Object getDateFrom() {
        return dateFrom;
    }

    public ProductCategory getCategIdAsObject() {
        return categIdAsObject;
    }

    public OdooId getCategId() {
        return categId;
    }

    public Object getImageVariant128() {
        return imageVariant128;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getCode() {
        return code;
    }

    public Object getImage256() {
        return image256;
    }

    public int getColor() {
        return color;
    }

    public List<ProductDocument> getProductDocumentIdsAsList() {
        return productDocumentIdsAsList;
    }

    public List<Integer> getProductDocumentIds() {
        return productDocumentIds;
    }

    public boolean getIsSaleOk() {
        return isSaleOk;
    }

    public Object getDescription() {
        return description;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public double getTotalMargin() {
        return totalMargin;
    }

    public List<AccountTax> getSupplierTaxesIdAsList() {
        return supplierTaxesIdAsList;
    }

    public List<Integer> getSupplierTaxesId() {
        return supplierTaxesId;
    }

    public double getSaleNumInvoiced() {
        return saleNumInvoiced;
    }

    public Object getImageVariant1024() {
        return imageVariant1024;
    }

    public double getServiceUpsellThreshold() {
        return serviceUpsellThreshold;
    }

    public String getExpensePolicyTooltip() {
        return expensePolicyTooltip;
    }

    public Account getPropertyAccountIncomeIdAsObject() {
        return propertyAccountIncomeIdAsObject;
    }

    public OdooId getPropertyAccountIncomeId() {
        return propertyAccountIncomeId;
    }

    public Object getDetailedType() {
        return detailedType;
    }

    public double getTurnover() {
        return turnover;
    }

    public List<ProductSupplierinfo> getVariantSellerIdsAsList() {
        return variantSellerIdsAsList;
    }

    public List<Integer> getVariantSellerIds() {
        return variantSellerIds;
    }

    public Object getServicePolicy() {
        return servicePolicy;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public Object getImage1024() {
        return image1024;
    }

    public double getTotalMarginRate() {
        return totalMarginRate;
    }

    public Object getImageVariant1920() {
        return imageVariant1920;
    }

    public Object getImageVariant256() {
        return imageVariant256;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public Object getServiceType() {
        return serviceType;
    }

    public boolean getIsHasConfigurableAttributes() {
        return isHasConfigurableAttributes;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public boolean getIsIsProductVariant() {
        return isIsProductVariant;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public ResCurrency getCostCurrencyIdAsObject() {
        return costCurrencyIdAsObject;
    }

    public OdooId getCostCurrencyId() {
        return costCurrencyId;
    }

    public Object getSaleLineWarnMsg() {
        return saleLineWarnMsg;
    }

    public double getPurchaseAvgPrice() {
        return purchaseAvgPrice;
    }

    public int getPricelistItemCount() {
        return pricelistItemCount;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Object getImage128() {
        return image128;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setDescriptionPurchase(Object descriptionPurchase) {
        this.descriptionPurchase = descriptionPurchase;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setCombinationIndices(String combinationIndices) {
        this.combinationIndices = combinationIndices;
    }

    public void setIsCanImageVariant1024BeZoomed(boolean isCanImageVariant1024BeZoomed) {
        this.isCanImageVariant1024BeZoomed = isCanImageVariant1024BeZoomed;
    }

    public void setInvoiceState(Object invoiceState) {
        this.invoiceState = invoiceState;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setIsCanImage1024BeZoomed(boolean isCanImage1024BeZoomed) {
        this.isCanImage1024BeZoomed = isCanImage1024BeZoomed;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setAttributeLineIdsAsList(List<ProductTemplateAttributeLine> attributeLineIdsAsList) {
        this.attributeLineIdsAsList = attributeLineIdsAsList;
    }

    public void setAttributeLineIds(List<Integer> attributeLineIds) {
        this.attributeLineIds = attributeLineIds;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setSellerIdsAsList(List<ProductSupplierinfo> sellerIdsAsList) {
        this.sellerIdsAsList = sellerIdsAsList;
    }

    public void setSellerIds(List<Integer> sellerIds) {
        this.sellerIds = sellerIds;
    }

    public void setExpectedMarginRate(double expectedMarginRate) {
        this.expectedMarginRate = expectedMarginRate;
    }

    public void setVolumeUomName(String volumeUomName) {
        this.volumeUomName = volumeUomName;
    }

    public void setIsProductCatalogProductIsInSaleOrder(boolean isProductCatalogProductIsInSaleOrder) {
        this.isProductCatalogProductIsInSaleOrder = isProductCatalogProductIsInSaleOrder;
    }

    public void setSaleExpected(double saleExpected) {
        this.saleExpected = saleExpected;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStandardPriceUpdateWarning(String standardPriceUpdateWarning) {
        this.standardPriceUpdateWarning = standardPriceUpdateWarning;
    }

    public void setUomName(String uomName) {
        this.uomName = uomName;
    }

    public void setProductProperties(Object productProperties) {
        this.productProperties = productProperties;
    }

    public void setDefaultCode(String defaultCode) {
        this.defaultCode = defaultCode;
    }

    public void setInvoicePolicy(Object invoicePolicy) {
        this.invoicePolicy = invoicePolicy;
    }

    public void setImageVariant512(Object imageVariant512) {
        this.imageVariant512 = imageVariant512;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTaxString(String taxString) {
        this.taxString = taxString;
    }

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setExpensePolicy(Object expensePolicy) {
        this.expensePolicy = expensePolicy;
    }

    public void setSalesGap(double salesGap) {
        this.salesGap = salesGap;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public void setSaleAvgPrice(double saleAvgPrice) {
        this.saleAvgPrice = saleAvgPrice;
    }

    public void setProductTmplIdAsObject(ProductTemplate productTmplIdAsObject) {
        this.productTmplIdAsObject = productTmplIdAsObject;
    }

    public void setProductTmplId(OdooId productTmplId) {
        this.productTmplId = productTmplId;
    }

    public void setUomIdAsObject(Uom uomIdAsObject) {
        this.uomIdAsObject = uomIdAsObject;
    }

    public void setUomId(OdooId uomId) {
        this.uomId = uomId;
    }

    public void setAdditionalProductTagIdsAsList(List<ProductTag> additionalProductTagIdsAsList) {
        this.additionalProductTagIdsAsList = additionalProductTagIdsAsList;
    }

    public void setAdditionalProductTagIds(List<Integer> additionalProductTagIds) {
        this.additionalProductTagIds = additionalProductTagIds;
    }

    public void setProductTooltip(String productTooltip) {
        this.productTooltip = productTooltip;
    }

    public void setIsCanBeExpensed(boolean isCanBeExpensed) {
        this.isCanBeExpensed = isCanBeExpensed;
    }

    public void setIsVisibleExpensePolicy(boolean isVisibleExpensePolicy) {
        this.isVisibleExpensePolicy = isVisibleExpensePolicy;
    }

    public void setProductDocumentCount(int productDocumentCount) {
        this.productDocumentCount = productDocumentCount;
    }

    public void setPriceExtra(double priceExtra) {
        this.priceExtra = priceExtra;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setNormalCost(double normalCost) {
        this.normalCost = normalCost;
    }

    public void setUomPoIdAsObject(Uom uomPoIdAsObject) {
        this.uomPoIdAsObject = uomPoIdAsObject;
    }

    public void setUomPoId(OdooId uomPoId) {
        this.uomPoId = uomPoId;
    }

    public void setTaxesIdAsList(List<AccountTax> taxesIdAsList) {
        this.taxesIdAsList = taxesIdAsList;
    }

    public void setTaxesId(List<Integer> taxesId) {
        this.taxesId = taxesId;
    }

    public void setOptionalProductIdsAsList(List<ProductTemplate> optionalProductIdsAsList) {
        this.optionalProductIdsAsList = optionalProductIdsAsList;
    }

    public void setOptionalProductIds(List<Integer> optionalProductIds) {
        this.optionalProductIds = optionalProductIds;
    }

    public void setSaleLineWarn(Object saleLineWarn) {
        this.saleLineWarn = saleLineWarn;
    }

    public void setIsPurchaseOk(boolean isPurchaseOk) {
        this.isPurchaseOk = isPurchaseOk;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setProductTagIdsAsList(List<ProductTag> productTagIdsAsList) {
        this.productTagIdsAsList = productTagIdsAsList;
    }

    public void setProductTagIds(List<Integer> productTagIds) {
        this.productTagIds = productTagIds;
    }

    public void setWeightUomName(String weightUomName) {
        this.weightUomName = weightUomName;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setSalesCount(double salesCount) {
        this.salesCount = salesCount;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public void setPropertyAccountExpenseIdAsObject(Account propertyAccountExpenseIdAsObject) {
        this.propertyAccountExpenseIdAsObject = propertyAccountExpenseIdAsObject;
    }

    public void setPropertyAccountExpenseId(OdooId propertyAccountExpenseId) {
        this.propertyAccountExpenseId = propertyAccountExpenseId;
    }

    public void setAccountTagIdsAsList(List<AccountAccountTag> accountTagIdsAsList) {
        this.accountTagIdsAsList = accountTagIdsAsList;
    }

    public void setAccountTagIds(List<Integer> accountTagIds) {
        this.accountTagIds = accountTagIds;
    }

    public void setProjectTemplateIdAsObject(Project projectTemplateIdAsObject) {
        this.projectTemplateIdAsObject = projectTemplateIdAsObject;
    }

    public void setProjectTemplateId(OdooId projectTemplateId) {
        this.projectTemplateId = projectTemplateId;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setServiceUpsellThresholdRatio(String serviceUpsellThresholdRatio) {
        this.serviceUpsellThresholdRatio = serviceUpsellThresholdRatio;
    }

    public void setPurchaseNumInvoiced(double purchaseNumInvoiced) {
        this.purchaseNumInvoiced = purchaseNumInvoiced;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setProductVariantIdAsObject(Product productVariantIdAsObject) {
        this.productVariantIdAsObject = productVariantIdAsObject;
    }

    public void setProductVariantId(OdooId productVariantId) {
        this.productVariantId = productVariantId;
    }

    public void setPurchaseGap(double purchaseGap) {
        this.purchaseGap = purchaseGap;
    }

    public void setPartnerRef(String partnerRef) {
        this.partnerRef = partnerRef;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setLstPrice(double lstPrice) {
        this.lstPrice = lstPrice;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setExpectedMargin(double expectedMargin) {
        this.expectedMargin = expectedMargin;
    }

    public void setDescriptionSale(Object descriptionSale) {
        this.descriptionSale = descriptionSale;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setProductVariantCount(int productVariantCount) {
        this.productVariantCount = productVariantCount;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setProductVariantIdsAsList(List<Product> productVariantIdsAsList) {
        this.productVariantIdsAsList = productVariantIdsAsList;
    }

    public void setProductVariantIds(List<Integer> productVariantIds) {
        this.productVariantIds = productVariantIds;
    }

    public void setStandardPrice(double standardPrice) {
        this.standardPrice = standardPrice;
    }

    public void setProductTemplateVariantValueIdsAsList(List<ProductTemplateAttributeValue> productTemplateVariantValueIdsAsList) {
        this.productTemplateVariantValueIdsAsList = productTemplateVariantValueIdsAsList;
    }

    public void setProductTemplateVariantValueIds(List<Integer> productTemplateVariantValueIds) {
        this.productTemplateVariantValueIds = productTemplateVariantValueIds;
    }

    public void setServiceTracking(Object serviceTracking) {
        this.serviceTracking = serviceTracking;
    }

    public void setProductTemplateAttributeValueIdsAsList(List<ProductTemplateAttributeValue> productTemplateAttributeValueIdsAsList) {
        this.productTemplateAttributeValueIdsAsList = productTemplateAttributeValueIdsAsList;
    }

    public void setProductTemplateAttributeValueIds(List<Integer> productTemplateAttributeValueIds) {
        this.productTemplateAttributeValueIds = productTemplateAttributeValueIds;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setDateTo(Object dateTo) {
        this.dateTo = dateTo;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAllProductTagIdsAsList(List<ProductTag> allProductTagIdsAsList) {
        this.allProductTagIdsAsList = allProductTagIdsAsList;
    }

    public void setAllProductTagIds(List<Integer> allProductTagIds) {
        this.allProductTagIds = allProductTagIds;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setPackagingIdsAsList(List<ProductPackaging> packagingIdsAsList) {
        this.packagingIdsAsList = packagingIdsAsList;
    }

    public void setPackagingIds(List<Integer> packagingIds) {
        this.packagingIds = packagingIds;
    }

    public void setValidProductTemplateAttributeLineIdsAsList(List<ProductTemplateAttributeLine> validProductTemplateAttributeLineIdsAsList) {
        this.validProductTemplateAttributeLineIdsAsList = validProductTemplateAttributeLineIdsAsList;
    }

    public void setValidProductTemplateAttributeLineIds(List<Integer> validProductTemplateAttributeLineIds) {
        this.validProductTemplateAttributeLineIds = validProductTemplateAttributeLineIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setDateFrom(Object dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setCategIdAsObject(ProductCategory categIdAsObject) {
        this.categIdAsObject = categIdAsObject;
    }

    public void setCategId(OdooId categId) {
        this.categId = categId;
    }

    public void setImageVariant128(Object imageVariant128) {
        this.imageVariant128 = imageVariant128;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setProductDocumentIdsAsList(List<ProductDocument> productDocumentIdsAsList) {
        this.productDocumentIdsAsList = productDocumentIdsAsList;
    }

    public void setProductDocumentIds(List<Integer> productDocumentIds) {
        this.productDocumentIds = productDocumentIds;
    }

    public void setIsSaleOk(boolean isSaleOk) {
        this.isSaleOk = isSaleOk;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setTotalMargin(double totalMargin) {
        this.totalMargin = totalMargin;
    }

    public void setSupplierTaxesIdAsList(List<AccountTax> supplierTaxesIdAsList) {
        this.supplierTaxesIdAsList = supplierTaxesIdAsList;
    }

    public void setSupplierTaxesId(List<Integer> supplierTaxesId) {
        this.supplierTaxesId = supplierTaxesId;
    }

    public void setSaleNumInvoiced(double saleNumInvoiced) {
        this.saleNumInvoiced = saleNumInvoiced;
    }

    public void setImageVariant1024(Object imageVariant1024) {
        this.imageVariant1024 = imageVariant1024;
    }

    public void setServiceUpsellThreshold(double serviceUpsellThreshold) {
        this.serviceUpsellThreshold = serviceUpsellThreshold;
    }

    public void setExpensePolicyTooltip(String expensePolicyTooltip) {
        this.expensePolicyTooltip = expensePolicyTooltip;
    }

    public void setPropertyAccountIncomeIdAsObject(Account propertyAccountIncomeIdAsObject) {
        this.propertyAccountIncomeIdAsObject = propertyAccountIncomeIdAsObject;
    }

    public void setPropertyAccountIncomeId(OdooId propertyAccountIncomeId) {
        this.propertyAccountIncomeId = propertyAccountIncomeId;
    }

    public void setDetailedType(Object detailedType) {
        this.detailedType = detailedType;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public void setVariantSellerIdsAsList(List<ProductSupplierinfo> variantSellerIdsAsList) {
        this.variantSellerIdsAsList = variantSellerIdsAsList;
    }

    public void setVariantSellerIds(List<Integer> variantSellerIds) {
        this.variantSellerIds = variantSellerIds;
    }

    public void setServicePolicy(Object servicePolicy) {
        this.servicePolicy = servicePolicy;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setTotalMarginRate(double totalMarginRate) {
        this.totalMarginRate = totalMarginRate;
    }

    public void setImageVariant1920(Object imageVariant1920) {
        this.imageVariant1920 = imageVariant1920;
    }

    public void setImageVariant256(Object imageVariant256) {
        this.imageVariant256 = imageVariant256;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setServiceType(Object serviceType) {
        this.serviceType = serviceType;
    }

    public void setIsHasConfigurableAttributes(boolean isHasConfigurableAttributes) {
        this.isHasConfigurableAttributes = isHasConfigurableAttributes;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setIsIsProductVariant(boolean isIsProductVariant) {
        this.isIsProductVariant = isIsProductVariant;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setCostCurrencyIdAsObject(ResCurrency costCurrencyIdAsObject) {
        this.costCurrencyIdAsObject = costCurrencyIdAsObject;
    }

    public void setCostCurrencyId(OdooId costCurrencyId) {
        this.costCurrencyId = costCurrencyId;
    }

    public void setSaleLineWarnMsg(Object saleLineWarnMsg) {
        this.saleLineWarnMsg = saleLineWarnMsg;
    }

    public void setPurchaseAvgPrice(double purchaseAvgPrice) {
        this.purchaseAvgPrice = purchaseAvgPrice;
    }

    public void setPricelistItemCount(int pricelistItemCount) {
        this.pricelistItemCount = pricelistItemCount;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }



}