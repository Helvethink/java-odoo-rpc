
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
import ch.helvethink.odoo4java.test.ng.account.account.AccountAccountTag;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.product.ProductCategory;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("product.template")
public class ProductTemplate implements OdooObj {

    
    private Date writeDate;

    
    private Object descriptionPurchase;

    
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

    
    private String volumeUomName;

    
    private int id;

    
    private String uomName;

    
    private Object productProperties;

    
    private String defaultCode;

    
    private Object invoicePolicy;

    
    private int messageAttachmentCount;

    
    private String taxString;

    
    private String fiscalCountryCodes;

    
    private Object expensePolicy;

    
    private boolean isActive;

    
    private Object image1920;

    
    private Object priority;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Uom uomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId uomId;

    
    private String productTooltip;

    
    private boolean isCanBeExpensed;

    
    private boolean isVisibleExpensePolicy;

    
    private int productDocumentCount;

    
    private boolean isMessageIsFollower;

    
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

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private Product productVariantIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productVariantId;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private Object activityExceptionDecoration;

    
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

    
    private Object serviceTracking;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private double weight;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
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

    
    private ProductCategory categIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductCategory")
        @OdooModel("product.ProductCategory")
    
    private OdooId categId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object image256;

    
    private int color;

    
    private List<ProductDocument> productDocumentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductDocument")
        @OdooModel("product.ProductDocument")
    
    private List<Integer> productDocumentIds;

    
    private boolean isSaleOk;

    
    private Object description;

    
    private Object myActivityDateDeadline;

    
    private List<AccountTax> supplierTaxesIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> supplierTaxesId;

    
    private double serviceUpsellThreshold;

    
    private String expensePolicyTooltip;

    
    private Account propertyAccountIncomeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountIncomeId;

    
    private Object detailedType;

    
    private List<ProductSupplierinfo> variantSellerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductSupplierinfo")
        @OdooModel("product.ProductSupplierinfo")
    
    private List<Integer> variantSellerIds;

    
    private Object servicePolicy;

    
    private String activityTypeIcon;

    
    private Object image1024;

    
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

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private int pricelistItemCount;

    
    private Object image128;


    public ProductTemplate() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getDescriptionPurchase() {
        return descriptionPurchase;
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

    public String getVolumeUomName() {
        return volumeUomName;
    }

    public int getId() {
        return id;
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

    public boolean getIsActive() {
        return isActive;
    }

    public Object getImage1920() {
        return image1920;
    }

    public Object getPriority() {
        return priority;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public Uom getUomIdAsObject() {
        return uomIdAsObject;
    }

    public OdooId getUomId() {
        return uomId;
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

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
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

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
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

    public Object getServiceTracking() {
        return serviceTracking;
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

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
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

    public ProductCategory getCategIdAsObject() {
        return categIdAsObject;
    }

    public OdooId getCategId() {
        return categId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
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

    public List<AccountTax> getSupplierTaxesIdAsList() {
        return supplierTaxesIdAsList;
    }

    public List<Integer> getSupplierTaxesId() {
        return supplierTaxesId;
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

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public int getPricelistItemCount() {
        return pricelistItemCount;
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

    public void setVolumeUomName(String volumeUomName) {
        this.volumeUomName = volumeUomName;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setImage1920(Object image1920) {
        this.image1920 = image1920;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setUomIdAsObject(Uom uomIdAsObject) {
        this.uomIdAsObject = uomIdAsObject;
    }

    public void setUomId(OdooId uomId) {
        this.uomId = uomId;
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

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
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

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
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

    public void setServiceTracking(Object serviceTracking) {
        this.serviceTracking = serviceTracking;
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

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

    public void setCategIdAsObject(ProductCategory categIdAsObject) {
        this.categIdAsObject = categIdAsObject;
    }

    public void setCategId(OdooId categId) {
        this.categId = categId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
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

    public void setSupplierTaxesIdAsList(List<AccountTax> supplierTaxesIdAsList) {
        this.supplierTaxesIdAsList = supplierTaxesIdAsList;
    }

    public void setSupplierTaxesId(List<Integer> supplierTaxesId) {
        this.supplierTaxesId = supplierTaxesId;
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

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setPricelistItemCount(int pricelistItemCount) {
        this.pricelistItemCount = pricelistItemCount;
    }

    public void setImage128(Object image128) {
        this.image128 = image128;
    }



}