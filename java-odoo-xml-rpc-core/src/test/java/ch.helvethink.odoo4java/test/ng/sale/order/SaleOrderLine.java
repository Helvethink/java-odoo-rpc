
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

package ch.helvethink.odoo4java.test.ng.sale.order;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.product.ProductPackaging;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderOption;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.AccountTax;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue;
import ch.helvethink.odoo4java.test.ng.project.ProjectMilestone;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.product.attribute.custom.ProductAttributeCustomValue;
import ch.helvethink.odoo4java.test.ng.product.pricelist.ProductPricelistItem;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyCard;
import ch.helvethink.odoo4java.test.ng.product.ProductTemplate;
import ch.helvethink.odoo4java.test.ng.uom.UomCategory;;

@OdooObject("sale.order.line")
public class SaleOrderLine implements OdooObj {

    
    private Date writeDate;

    
    private Object priceSubtotal;

    
    private List<ProjectMilestone> reachedMilestonesIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectMilestone")
        @OdooModel("project.ProjectMilestone")
    
    private List<Integer> reachedMilestonesIds;

    
    private double qtyDelivered;

    
    private double discount;

    
    private ProductPackaging productPackagingIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPackaging")
        @OdooModel("product.ProductPackaging")
    
    private OdooId productPackagingId;

    
    private ResUsers salesmanIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId salesmanId;

    
    private Object untaxedAmountInvoiced;

    
    private boolean isIsService;

    
    private Object qtyDeliveredMethod;

    
    private LoyaltyCard couponIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyCard")
        @OdooModel("loyalty.LoyaltyCard")
    
    private OdooId couponId;

    
    private boolean isIsDownpayment;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private boolean isRemainingHoursAvailable;

    
    private boolean isIsConfigurableProduct;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private List<ProductAttributeCustomValue> productCustomAttributeValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.attribute.custom.ProductAttributeCustomValue")
        @OdooModel("product.attribute.custom.ProductAttributeCustomValue")
    
    private List<Integer> productCustomAttributeValueIds;

    
    private int analyticPrecision;

    
    private Object state;

    
    private int id;

    
    private double pointsCost;

    
    private Date createDate;

    
    private Object untaxedAmountToInvoice;

    
    private Object taxCalculationRoundingMethod;

    
    private boolean isHasDisplayedWarningUpsell;

    
    private List<AccountAnalyticLine> timesheetIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> timesheetIds;

    
    private boolean isIsExpense;

    
    private boolean isIsRewardLine;

    
    private List<ProductTemplateAttributeValue> productTemplateAttributeValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue")
        @OdooModel("product.template.attribute.ProductTemplateAttributeValue")
    
    private List<Integer> productTemplateAttributeValueIds;

    
    private double customerLead;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private double remainingHours;

    
    private List<AccountTax> taxIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountTax")
        @OdooModel("account.AccountTax")
    
    private List<Integer> taxId;

    
    private int sequence;

    
    private Object name;

    
    private SaleOrder orderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId orderId;

    
    private Object priceTotal;

    
    private Object invoiceStatus;

    
    private Object priceReduceTaxexcl;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String rewardIdentifierCode;

    
    private ProductPricelistItem pricelistItemIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.pricelist.ProductPricelistItem")
        @OdooModel("product.pricelist.ProductPricelistItem")
    
    private OdooId pricelistItemId;

    
    private ProductTemplate productTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductTemplate")
        @OdooModel("product.ProductTemplate")
    
    private OdooId productTemplateId;

    
    private ProjectTask taskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId taskId;

    
    private double productPackagingQty;

    
    private Object displayType;

    
    private Object analyticDistribution;

    
    private double qtyInvoiced;

    
    private ResCountry taxCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId taxCountryId;

    
    private List<ProductTemplateAttributeValue> productNoVariantAttributeValueIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.template.attribute.ProductTemplateAttributeValue")
        @OdooModel("product.template.attribute.ProductTemplateAttributeValue")
    
    private List<Integer> productNoVariantAttributeValueIds;

    
    private Uom productUomAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId productUom;

    
    private Object priceReduceTaxinc;

    
    private List<SaleOrderOption> saleOrderOptionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderOption")
        @OdooModel("sale.order.SaleOrderOption")
    
    private List<Integer> saleOrderOptionIds;

    
    private Object analyticDistributionSearch;

    
    private double qtyToInvoice;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private double priceTax;

    
    private ResPartner orderPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId orderPartnerId;

    
    private double priceUnit;

    
    private Object productType;

    
    private boolean isProductUpdatable;

    
    private boolean isProductUomReadonly;

    
    private LoyaltyReward rewardIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyReward")
        @OdooModel("loyalty.LoyaltyReward")
    
    private OdooId rewardId;

    
    private List<AccountAnalyticLine> analyticLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> analyticLineIds;

    
    private List<AccountMoveLine> invoiceLinesAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private List<Integer> invoiceLines;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private UomCategory productUomCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.UomCategory")
        @OdooModel("uom.UomCategory")
    
    private OdooId productUomCategoryId;

    
    private double productUomQty;


    public SaleOrderLine() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public Object getPriceSubtotal() {
        return priceSubtotal;
    }

    public List<ProjectMilestone> getReachedMilestonesIdsAsList() {
        return reachedMilestonesIdsAsList;
    }

    public List<Integer> getReachedMilestonesIds() {
        return reachedMilestonesIds;
    }

    public double getQtyDelivered() {
        return qtyDelivered;
    }

    public double getDiscount() {
        return discount;
    }

    public ProductPackaging getProductPackagingIdAsObject() {
        return productPackagingIdAsObject;
    }

    public OdooId getProductPackagingId() {
        return productPackagingId;
    }

    public ResUsers getSalesmanIdAsObject() {
        return salesmanIdAsObject;
    }

    public OdooId getSalesmanId() {
        return salesmanId;
    }

    public Object getUntaxedAmountInvoiced() {
        return untaxedAmountInvoiced;
    }

    public boolean getIsIsService() {
        return isIsService;
    }

    public Object getQtyDeliveredMethod() {
        return qtyDeliveredMethod;
    }

    public LoyaltyCard getCouponIdAsObject() {
        return couponIdAsObject;
    }

    public OdooId getCouponId() {
        return couponId;
    }

    public boolean getIsIsDownpayment() {
        return isIsDownpayment;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public boolean getIsRemainingHoursAvailable() {
        return isRemainingHoursAvailable;
    }

    public boolean getIsIsConfigurableProduct() {
        return isIsConfigurableProduct;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public List<ProductAttributeCustomValue> getProductCustomAttributeValueIdsAsList() {
        return productCustomAttributeValueIdsAsList;
    }

    public List<Integer> getProductCustomAttributeValueIds() {
        return productCustomAttributeValueIds;
    }

    public int getAnalyticPrecision() {
        return analyticPrecision;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public double getPointsCost() {
        return pointsCost;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getUntaxedAmountToInvoice() {
        return untaxedAmountToInvoice;
    }

    public Object getTaxCalculationRoundingMethod() {
        return taxCalculationRoundingMethod;
    }

    public boolean getIsHasDisplayedWarningUpsell() {
        return isHasDisplayedWarningUpsell;
    }

    public List<AccountAnalyticLine> getTimesheetIdsAsList() {
        return timesheetIdsAsList;
    }

    public List<Integer> getTimesheetIds() {
        return timesheetIds;
    }

    public boolean getIsIsExpense() {
        return isIsExpense;
    }

    public boolean getIsIsRewardLine() {
        return isIsRewardLine;
    }

    public List<ProductTemplateAttributeValue> getProductTemplateAttributeValueIdsAsList() {
        return productTemplateAttributeValueIdsAsList;
    }

    public List<Integer> getProductTemplateAttributeValueIds() {
        return productTemplateAttributeValueIds;
    }

    public double getCustomerLead() {
        return customerLead;
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

    public double getRemainingHours() {
        return remainingHours;
    }

    public List<AccountTax> getTaxIdAsList() {
        return taxIdAsList;
    }

    public List<Integer> getTaxId() {
        return taxId;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getName() {
        return name;
    }

    public SaleOrder getOrderIdAsObject() {
        return orderIdAsObject;
    }

    public OdooId getOrderId() {
        return orderId;
    }

    public Object getPriceTotal() {
        return priceTotal;
    }

    public Object getInvoiceStatus() {
        return invoiceStatus;
    }

    public Object getPriceReduceTaxexcl() {
        return priceReduceTaxexcl;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getRewardIdentifierCode() {
        return rewardIdentifierCode;
    }

    public ProductPricelistItem getPricelistItemIdAsObject() {
        return pricelistItemIdAsObject;
    }

    public OdooId getPricelistItemId() {
        return pricelistItemId;
    }

    public ProductTemplate getProductTemplateIdAsObject() {
        return productTemplateIdAsObject;
    }

    public OdooId getProductTemplateId() {
        return productTemplateId;
    }

    public ProjectTask getTaskIdAsObject() {
        return taskIdAsObject;
    }

    public OdooId getTaskId() {
        return taskId;
    }

    public double getProductPackagingQty() {
        return productPackagingQty;
    }

    public Object getDisplayType() {
        return displayType;
    }

    public Object getAnalyticDistribution() {
        return analyticDistribution;
    }

    public double getQtyInvoiced() {
        return qtyInvoiced;
    }

    public ResCountry getTaxCountryIdAsObject() {
        return taxCountryIdAsObject;
    }

    public OdooId getTaxCountryId() {
        return taxCountryId;
    }

    public List<ProductTemplateAttributeValue> getProductNoVariantAttributeValueIdsAsList() {
        return productNoVariantAttributeValueIdsAsList;
    }

    public List<Integer> getProductNoVariantAttributeValueIds() {
        return productNoVariantAttributeValueIds;
    }

    public Uom getProductUomAsObject() {
        return productUomAsObject;
    }

    public OdooId getProductUom() {
        return productUom;
    }

    public Object getPriceReduceTaxinc() {
        return priceReduceTaxinc;
    }

    public List<SaleOrderOption> getSaleOrderOptionIdsAsList() {
        return saleOrderOptionIdsAsList;
    }

    public List<Integer> getSaleOrderOptionIds() {
        return saleOrderOptionIds;
    }

    public Object getAnalyticDistributionSearch() {
        return analyticDistributionSearch;
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

    public double getPriceTax() {
        return priceTax;
    }

    public ResPartner getOrderPartnerIdAsObject() {
        return orderPartnerIdAsObject;
    }

    public OdooId getOrderPartnerId() {
        return orderPartnerId;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public Object getProductType() {
        return productType;
    }

    public boolean getIsProductUpdatable() {
        return isProductUpdatable;
    }

    public boolean getIsProductUomReadonly() {
        return isProductUomReadonly;
    }

    public LoyaltyReward getRewardIdAsObject() {
        return rewardIdAsObject;
    }

    public OdooId getRewardId() {
        return rewardId;
    }

    public List<AccountAnalyticLine> getAnalyticLineIdsAsList() {
        return analyticLineIdsAsList;
    }

    public List<Integer> getAnalyticLineIds() {
        return analyticLineIds;
    }

    public List<AccountMoveLine> getInvoiceLinesAsList() {
        return invoiceLinesAsList;
    }

    public List<Integer> getInvoiceLines() {
        return invoiceLines;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public UomCategory getProductUomCategoryIdAsObject() {
        return productUomCategoryIdAsObject;
    }

    public OdooId getProductUomCategoryId() {
        return productUomCategoryId;
    }

    public double getProductUomQty() {
        return productUomQty;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPriceSubtotal(Object priceSubtotal) {
        this.priceSubtotal = priceSubtotal;
    }

    public void setReachedMilestonesIdsAsList(List<ProjectMilestone> reachedMilestonesIdsAsList) {
        this.reachedMilestonesIdsAsList = reachedMilestonesIdsAsList;
    }

    public void setReachedMilestonesIds(List<Integer> reachedMilestonesIds) {
        this.reachedMilestonesIds = reachedMilestonesIds;
    }

    public void setQtyDelivered(double qtyDelivered) {
        this.qtyDelivered = qtyDelivered;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setProductPackagingIdAsObject(ProductPackaging productPackagingIdAsObject) {
        this.productPackagingIdAsObject = productPackagingIdAsObject;
    }

    public void setProductPackagingId(OdooId productPackagingId) {
        this.productPackagingId = productPackagingId;
    }

    public void setSalesmanIdAsObject(ResUsers salesmanIdAsObject) {
        this.salesmanIdAsObject = salesmanIdAsObject;
    }

    public void setSalesmanId(OdooId salesmanId) {
        this.salesmanId = salesmanId;
    }

    public void setUntaxedAmountInvoiced(Object untaxedAmountInvoiced) {
        this.untaxedAmountInvoiced = untaxedAmountInvoiced;
    }

    public void setIsIsService(boolean isIsService) {
        this.isIsService = isIsService;
    }

    public void setQtyDeliveredMethod(Object qtyDeliveredMethod) {
        this.qtyDeliveredMethod = qtyDeliveredMethod;
    }

    public void setCouponIdAsObject(LoyaltyCard couponIdAsObject) {
        this.couponIdAsObject = couponIdAsObject;
    }

    public void setCouponId(OdooId couponId) {
        this.couponId = couponId;
    }

    public void setIsIsDownpayment(boolean isIsDownpayment) {
        this.isIsDownpayment = isIsDownpayment;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setIsRemainingHoursAvailable(boolean isRemainingHoursAvailable) {
        this.isRemainingHoursAvailable = isRemainingHoursAvailable;
    }

    public void setIsIsConfigurableProduct(boolean isIsConfigurableProduct) {
        this.isIsConfigurableProduct = isIsConfigurableProduct;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setProductCustomAttributeValueIdsAsList(List<ProductAttributeCustomValue> productCustomAttributeValueIdsAsList) {
        this.productCustomAttributeValueIdsAsList = productCustomAttributeValueIdsAsList;
    }

    public void setProductCustomAttributeValueIds(List<Integer> productCustomAttributeValueIds) {
        this.productCustomAttributeValueIds = productCustomAttributeValueIds;
    }

    public void setAnalyticPrecision(int analyticPrecision) {
        this.analyticPrecision = analyticPrecision;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPointsCost(double pointsCost) {
        this.pointsCost = pointsCost;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setUntaxedAmountToInvoice(Object untaxedAmountToInvoice) {
        this.untaxedAmountToInvoice = untaxedAmountToInvoice;
    }

    public void setTaxCalculationRoundingMethod(Object taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod;
    }

    public void setIsHasDisplayedWarningUpsell(boolean isHasDisplayedWarningUpsell) {
        this.isHasDisplayedWarningUpsell = isHasDisplayedWarningUpsell;
    }

    public void setTimesheetIdsAsList(List<AccountAnalyticLine> timesheetIdsAsList) {
        this.timesheetIdsAsList = timesheetIdsAsList;
    }

    public void setTimesheetIds(List<Integer> timesheetIds) {
        this.timesheetIds = timesheetIds;
    }

    public void setIsIsExpense(boolean isIsExpense) {
        this.isIsExpense = isIsExpense;
    }

    public void setIsIsRewardLine(boolean isIsRewardLine) {
        this.isIsRewardLine = isIsRewardLine;
    }

    public void setProductTemplateAttributeValueIdsAsList(List<ProductTemplateAttributeValue> productTemplateAttributeValueIdsAsList) {
        this.productTemplateAttributeValueIdsAsList = productTemplateAttributeValueIdsAsList;
    }

    public void setProductTemplateAttributeValueIds(List<Integer> productTemplateAttributeValueIds) {
        this.productTemplateAttributeValueIds = productTemplateAttributeValueIds;
    }

    public void setCustomerLead(double customerLead) {
        this.customerLead = customerLead;
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

    public void setRemainingHours(double remainingHours) {
        this.remainingHours = remainingHours;
    }

    public void setTaxIdAsList(List<AccountTax> taxIdAsList) {
        this.taxIdAsList = taxIdAsList;
    }

    public void setTaxId(List<Integer> taxId) {
        this.taxId = taxId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setOrderIdAsObject(SaleOrder orderIdAsObject) {
        this.orderIdAsObject = orderIdAsObject;
    }

    public void setOrderId(OdooId orderId) {
        this.orderId = orderId;
    }

    public void setPriceTotal(Object priceTotal) {
        this.priceTotal = priceTotal;
    }

    public void setInvoiceStatus(Object invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setPriceReduceTaxexcl(Object priceReduceTaxexcl) {
        this.priceReduceTaxexcl = priceReduceTaxexcl;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setRewardIdentifierCode(String rewardIdentifierCode) {
        this.rewardIdentifierCode = rewardIdentifierCode;
    }

    public void setPricelistItemIdAsObject(ProductPricelistItem pricelistItemIdAsObject) {
        this.pricelistItemIdAsObject = pricelistItemIdAsObject;
    }

    public void setPricelistItemId(OdooId pricelistItemId) {
        this.pricelistItemId = pricelistItemId;
    }

    public void setProductTemplateIdAsObject(ProductTemplate productTemplateIdAsObject) {
        this.productTemplateIdAsObject = productTemplateIdAsObject;
    }

    public void setProductTemplateId(OdooId productTemplateId) {
        this.productTemplateId = productTemplateId;
    }

    public void setTaskIdAsObject(ProjectTask taskIdAsObject) {
        this.taskIdAsObject = taskIdAsObject;
    }

    public void setTaskId(OdooId taskId) {
        this.taskId = taskId;
    }

    public void setProductPackagingQty(double productPackagingQty) {
        this.productPackagingQty = productPackagingQty;
    }

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setAnalyticDistribution(Object analyticDistribution) {
        this.analyticDistribution = analyticDistribution;
    }

    public void setQtyInvoiced(double qtyInvoiced) {
        this.qtyInvoiced = qtyInvoiced;
    }

    public void setTaxCountryIdAsObject(ResCountry taxCountryIdAsObject) {
        this.taxCountryIdAsObject = taxCountryIdAsObject;
    }

    public void setTaxCountryId(OdooId taxCountryId) {
        this.taxCountryId = taxCountryId;
    }

    public void setProductNoVariantAttributeValueIdsAsList(List<ProductTemplateAttributeValue> productNoVariantAttributeValueIdsAsList) {
        this.productNoVariantAttributeValueIdsAsList = productNoVariantAttributeValueIdsAsList;
    }

    public void setProductNoVariantAttributeValueIds(List<Integer> productNoVariantAttributeValueIds) {
        this.productNoVariantAttributeValueIds = productNoVariantAttributeValueIds;
    }

    public void setProductUomAsObject(Uom productUomAsObject) {
        this.productUomAsObject = productUomAsObject;
    }

    public void setProductUom(OdooId productUom) {
        this.productUom = productUom;
    }

    public void setPriceReduceTaxinc(Object priceReduceTaxinc) {
        this.priceReduceTaxinc = priceReduceTaxinc;
    }

    public void setSaleOrderOptionIdsAsList(List<SaleOrderOption> saleOrderOptionIdsAsList) {
        this.saleOrderOptionIdsAsList = saleOrderOptionIdsAsList;
    }

    public void setSaleOrderOptionIds(List<Integer> saleOrderOptionIds) {
        this.saleOrderOptionIds = saleOrderOptionIds;
    }

    public void setAnalyticDistributionSearch(Object analyticDistributionSearch) {
        this.analyticDistributionSearch = analyticDistributionSearch;
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

    public void setPriceTax(double priceTax) {
        this.priceTax = priceTax;
    }

    public void setOrderPartnerIdAsObject(ResPartner orderPartnerIdAsObject) {
        this.orderPartnerIdAsObject = orderPartnerIdAsObject;
    }

    public void setOrderPartnerId(OdooId orderPartnerId) {
        this.orderPartnerId = orderPartnerId;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public void setProductType(Object productType) {
        this.productType = productType;
    }

    public void setIsProductUpdatable(boolean isProductUpdatable) {
        this.isProductUpdatable = isProductUpdatable;
    }

    public void setIsProductUomReadonly(boolean isProductUomReadonly) {
        this.isProductUomReadonly = isProductUomReadonly;
    }

    public void setRewardIdAsObject(LoyaltyReward rewardIdAsObject) {
        this.rewardIdAsObject = rewardIdAsObject;
    }

    public void setRewardId(OdooId rewardId) {
        this.rewardId = rewardId;
    }

    public void setAnalyticLineIdsAsList(List<AccountAnalyticLine> analyticLineIdsAsList) {
        this.analyticLineIdsAsList = analyticLineIdsAsList;
    }

    public void setAnalyticLineIds(List<Integer> analyticLineIds) {
        this.analyticLineIds = analyticLineIds;
    }

    public void setInvoiceLinesAsList(List<AccountMoveLine> invoiceLinesAsList) {
        this.invoiceLinesAsList = invoiceLinesAsList;
    }

    public void setInvoiceLines(List<Integer> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setProductUomCategoryIdAsObject(UomCategory productUomCategoryIdAsObject) {
        this.productUomCategoryIdAsObject = productUomCategoryIdAsObject;
    }

    public void setProductUomCategoryId(OdooId productUomCategoryId) {
        this.productUomCategoryId = productUomCategoryId;
    }

    public void setProductUomQty(double productUomQty) {
        this.productUomQty = productUomQty;
    }



}