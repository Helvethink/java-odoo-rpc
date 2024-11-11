
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
import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.HrExpense;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.sale.order.coupon.SaleOrderCouponPoints;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderOption;
import ch.helvethink.odoo4java.test.ng.utm.UtmCampaign;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.crm.CrmTag;
import ch.helvethink.odoo4java.test.ng.utm.UtmSource;
import ch.helvethink.odoo4java.test.ng.utm.UtmMedium;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyRule;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyCard;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("sale.order")
public class SaleOrder implements OdooObj {

    
    private Date writeDate;

    
    private boolean isShowUpdatePricelist;

    
    private List<LoyaltyRule> codeEnabledRuleIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyRule")
        @OdooModel("loyalty.LoyaltyRule")
    
    private List<Integer> codeEnabledRuleIds;

    
    private List<HrExpense> expenseIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrExpense")
        @OdooModel("hr.HrExpense")
    
    private List<Integer> expenseIds;

    
    private List<AccountMove> invoiceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> invoiceIds;

    
    private Object validityDate;

    
    private Object amountTotal;

    
    private Object activityDateDeadline;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private boolean isShowProjectButton;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private Object state;

    
    private int id;

    
    private MailTemplate pendingEmailTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId pendingEmailTemplateId;

    
    private Object taxCalculationRoundingMethod;

    
    private Object l10nDin5008Addresses;

    
    private int messageAttachmentCount;

    
    private List<CrmTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTag")
        @OdooModel("crm.CrmTag")
    
    private List<Integer> tagIds;

    
    private String clientOrderRef;

    
    private ProductPricelist pricelistIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId pricelistId;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int timesheetTotalDuration;

    
    private String accessToken;

    
    private Object l10nDin5008TemplateData;

    
    private Object accessWarning;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private boolean isVisibleProject;

    
    private ResPartner partnerInvoiceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerInvoiceId;

    
    private boolean isMessageIsFollower;

    
    private int projectCount;

    
    private double rewardAmount;

    
    private boolean isRequirePayment;

    
    private Object signature;

    
    private boolean isShowHoursRecordedButton;

    
    private int milestoneCount;

    
    private Object amountToInvoice;

    
    private int expenseCount;

    
    private Date commitmentDate;

    
    private double currencyRate;

    
    private Object amountTax;

    
    private Object amountUntaxed;

    
    private List<SaleOrderLine> orderLineAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private List<Integer> orderLine;

    
    private double amountUndiscounted;

    
    private List<ProjectTask> tasksIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> tasksIds;

    
    private boolean isIsProductMilestone;

    
    private List<LoyaltyCard> appliedCouponIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyCard")
        @OdooModel("loyalty.LoyaltyCard")
    
    private List<Integer> appliedCouponIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isMessageHasSmsError;

    
    private int invoiceCount;

    
    private List<Project> projectIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private List<Integer> projectIds;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private boolean isIsExpired;

    
    private String signedBy;

    
    private List<PaymentTransaction> authorizedTransactionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private List<Integer> authorizedTransactionIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private UtmSource sourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmSource")
        @OdooModel("utm.UtmSource")
    
    private OdooId sourceId;

    
    private double timesheetCount;

    
    private double amountPaid;

    
    private String typeName;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isHasActivePricelist;

    
    private double prepaymentPercent;

    
    private Object activityExceptionDecoration;

    
    private AccountPaymentTerm paymentTermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId paymentTermId;

    
    private String reference;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private Date dateOrder;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private boolean isHasMessage;

    
    private String l10nDin5008DocumentTitle;

    
    private AccountAnalyticAccount analyticAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId analyticAccountId;

    
    private List<PaymentTransaction> transactionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private List<Integer> transactionIds;

    
    private UtmMedium mediumIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmMedium")
        @OdooModel("utm.UtmMedium")
    
    private OdooId mediumId;

    
    private boolean isLocked;

    
    private Date createDate;

    
    private UtmCampaign campaignIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmCampaign")
        @OdooModel("utm.UtmCampaign")
    
    private OdooId campaignId;

    
    private int tasksCount;

    
    private boolean isShowTaskButton;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private Object amountInvoiced;

    
    private String activityExceptionIcon;

    
    private String displayName;

    
    private SaleOrderTemplate saleOrderTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderTemplate")
        @OdooModel("sale.order.SaleOrderTemplate")
    
    private OdooId saleOrderTemplateId;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private Object termsType;

    
    private String countryCode;

    
    private CrmLead opportunityIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private OdooId opportunityId;

    
    private Date expectedDate;

    
    private Object taxTotals;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private ResPartner partnerShippingIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerShippingId;

    
    private List<SaleOrderCouponPoints> couponPointIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.coupon.SaleOrderCouponPoints")
        @OdooModel("sale.order.coupon.SaleOrderCouponPoints")
    
    private List<Integer> couponPointIds;

    
    private Object invoiceStatus;

    
    private Object partnerCreditWarning;

    
    private Object note;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String origin;

    
    private AccountFiscalPosition fiscalPositionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private OdooId fiscalPositionId;

    
    private Object myActivityDateDeadline;

    
    private Date signedOn;

    
    private boolean isShowCreateProjectButton;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private boolean isShowUpdateFpos;

    
    private ResCountry taxCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId taxCountryId;

    
    private List<SaleOrderOption> saleOrderOptionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderOption")
        @OdooModel("sale.order.SaleOrderOption")
    
    private List<Integer> saleOrderOptionIds;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private String activityTypeIcon;

    
    private boolean isRequireSignature;

    
    private String accessUrl;

    
    private Uom timesheetEncodeUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId timesheetEncodeUomId;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public SaleOrder() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsShowUpdatePricelist() {
        return isShowUpdatePricelist;
    }

    public List<LoyaltyRule> getCodeEnabledRuleIdsAsList() {
        return codeEnabledRuleIdsAsList;
    }

    public List<Integer> getCodeEnabledRuleIds() {
        return codeEnabledRuleIds;
    }

    public List<HrExpense> getExpenseIdsAsList() {
        return expenseIdsAsList;
    }

    public List<Integer> getExpenseIds() {
        return expenseIds;
    }

    public List<AccountMove> getInvoiceIdsAsList() {
        return invoiceIdsAsList;
    }

    public List<Integer> getInvoiceIds() {
        return invoiceIds;
    }

    public Object getValidityDate() {
        return validityDate;
    }

    public Object getAmountTotal() {
        return amountTotal;
    }

    public Object getActivityDateDeadline() {
        return activityDateDeadline;
    }

    public CrmTeam getTeamIdAsObject() {
        return teamIdAsObject;
    }

    public OdooId getTeamId() {
        return teamId;
    }

    public boolean getIsShowProjectButton() {
        return isShowProjectButton;
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

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public MailTemplate getPendingEmailTemplateIdAsObject() {
        return pendingEmailTemplateIdAsObject;
    }

    public OdooId getPendingEmailTemplateId() {
        return pendingEmailTemplateId;
    }

    public Object getTaxCalculationRoundingMethod() {
        return taxCalculationRoundingMethod;
    }

    public Object getL10nDin5008Addresses() {
        return l10nDin5008Addresses;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<CrmTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public String getClientOrderRef() {
        return clientOrderRef;
    }

    public ProductPricelist getPricelistIdAsObject() {
        return pricelistIdAsObject;
    }

    public OdooId getPricelistId() {
        return pricelistId;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public int getTimesheetTotalDuration() {
        return timesheetTotalDuration;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Object getL10nDin5008TemplateData() {
        return l10nDin5008TemplateData;
    }

    public Object getAccessWarning() {
        return accessWarning;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public boolean getIsVisibleProject() {
        return isVisibleProject;
    }

    public ResPartner getPartnerInvoiceIdAsObject() {
        return partnerInvoiceIdAsObject;
    }

    public OdooId getPartnerInvoiceId() {
        return partnerInvoiceId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public double getRewardAmount() {
        return rewardAmount;
    }

    public boolean getIsRequirePayment() {
        return isRequirePayment;
    }

    public Object getSignature() {
        return signature;
    }

    public boolean getIsShowHoursRecordedButton() {
        return isShowHoursRecordedButton;
    }

    public int getMilestoneCount() {
        return milestoneCount;
    }

    public Object getAmountToInvoice() {
        return amountToInvoice;
    }

    public int getExpenseCount() {
        return expenseCount;
    }

    public Date getCommitmentDate() {
        return commitmentDate;
    }

    public double getCurrencyRate() {
        return currencyRate;
    }

    public Object getAmountTax() {
        return amountTax;
    }

    public Object getAmountUntaxed() {
        return amountUntaxed;
    }

    public List<SaleOrderLine> getOrderLineAsList() {
        return orderLineAsList;
    }

    public List<Integer> getOrderLine() {
        return orderLine;
    }

    public double getAmountUndiscounted() {
        return amountUndiscounted;
    }

    public List<ProjectTask> getTasksIdsAsList() {
        return tasksIdsAsList;
    }

    public List<Integer> getTasksIds() {
        return tasksIds;
    }

    public boolean getIsIsProductMilestone() {
        return isIsProductMilestone;
    }

    public List<LoyaltyCard> getAppliedCouponIdsAsList() {
        return appliedCouponIdsAsList;
    }

    public List<Integer> getAppliedCouponIds() {
        return appliedCouponIds;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public int getInvoiceCount() {
        return invoiceCount;
    }

    public List<Project> getProjectIdsAsList() {
        return projectIdsAsList;
    }

    public List<Integer> getProjectIds() {
        return projectIds;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public boolean getIsIsExpired() {
        return isIsExpired;
    }

    public String getSignedBy() {
        return signedBy;
    }

    public List<PaymentTransaction> getAuthorizedTransactionIdsAsList() {
        return authorizedTransactionIdsAsList;
    }

    public List<Integer> getAuthorizedTransactionIds() {
        return authorizedTransactionIds;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public UtmSource getSourceIdAsObject() {
        return sourceIdAsObject;
    }

    public OdooId getSourceId() {
        return sourceId;
    }

    public double getTimesheetCount() {
        return timesheetCount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public boolean getIsHasActivePricelist() {
        return isHasActivePricelist;
    }

    public double getPrepaymentPercent() {
        return prepaymentPercent;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public AccountPaymentTerm getPaymentTermIdAsObject() {
        return paymentTermIdAsObject;
    }

    public OdooId getPaymentTermId() {
        return paymentTermId;
    }

    public String getReference() {
        return reference;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public Date getDateOrder() {
        return dateOrder;
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

    public String getL10nDin5008DocumentTitle() {
        return l10nDin5008DocumentTitle;
    }

    public AccountAnalyticAccount getAnalyticAccountIdAsObject() {
        return analyticAccountIdAsObject;
    }

    public OdooId getAnalyticAccountId() {
        return analyticAccountId;
    }

    public List<PaymentTransaction> getTransactionIdsAsList() {
        return transactionIdsAsList;
    }

    public List<Integer> getTransactionIds() {
        return transactionIds;
    }

    public UtmMedium getMediumIdAsObject() {
        return mediumIdAsObject;
    }

    public OdooId getMediumId() {
        return mediumId;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public UtmCampaign getCampaignIdAsObject() {
        return campaignIdAsObject;
    }

    public OdooId getCampaignId() {
        return campaignId;
    }

    public int getTasksCount() {
        return tasksCount;
    }

    public boolean getIsShowTaskButton() {
        return isShowTaskButton;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public Object getAmountInvoiced() {
        return amountInvoiced;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public SaleOrderTemplate getSaleOrderTemplateIdAsObject() {
        return saleOrderTemplateIdAsObject;
    }

    public OdooId getSaleOrderTemplateId() {
        return saleOrderTemplateId;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public Object getTermsType() {
        return termsType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public CrmLead getOpportunityIdAsObject() {
        return opportunityIdAsObject;
    }

    public OdooId getOpportunityId() {
        return opportunityId;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public Object getTaxTotals() {
        return taxTotals;
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

    public ResPartner getPartnerShippingIdAsObject() {
        return partnerShippingIdAsObject;
    }

    public OdooId getPartnerShippingId() {
        return partnerShippingId;
    }

    public List<SaleOrderCouponPoints> getCouponPointIdsAsList() {
        return couponPointIdsAsList;
    }

    public List<Integer> getCouponPointIds() {
        return couponPointIds;
    }

    public Object getInvoiceStatus() {
        return invoiceStatus;
    }

    public Object getPartnerCreditWarning() {
        return partnerCreditWarning;
    }

    public Object getNote() {
        return note;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getOrigin() {
        return origin;
    }

    public AccountFiscalPosition getFiscalPositionIdAsObject() {
        return fiscalPositionIdAsObject;
    }

    public OdooId getFiscalPositionId() {
        return fiscalPositionId;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public Date getSignedOn() {
        return signedOn;
    }

    public boolean getIsShowCreateProjectButton() {
        return isShowCreateProjectButton;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public boolean getIsShowUpdateFpos() {
        return isShowUpdateFpos;
    }

    public ResCountry getTaxCountryIdAsObject() {
        return taxCountryIdAsObject;
    }

    public OdooId getTaxCountryId() {
        return taxCountryId;
    }

    public List<SaleOrderOption> getSaleOrderOptionIdsAsList() {
        return saleOrderOptionIdsAsList;
    }

    public List<Integer> getSaleOrderOptionIds() {
        return saleOrderOptionIds;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public boolean getIsRequireSignature() {
        return isRequireSignature;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public Uom getTimesheetEncodeUomIdAsObject() {
        return timesheetEncodeUomIdAsObject;
    }

    public OdooId getTimesheetEncodeUomId() {
        return timesheetEncodeUomId;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsShowUpdatePricelist(boolean isShowUpdatePricelist) {
        this.isShowUpdatePricelist = isShowUpdatePricelist;
    }

    public void setCodeEnabledRuleIdsAsList(List<LoyaltyRule> codeEnabledRuleIdsAsList) {
        this.codeEnabledRuleIdsAsList = codeEnabledRuleIdsAsList;
    }

    public void setCodeEnabledRuleIds(List<Integer> codeEnabledRuleIds) {
        this.codeEnabledRuleIds = codeEnabledRuleIds;
    }

    public void setExpenseIdsAsList(List<HrExpense> expenseIdsAsList) {
        this.expenseIdsAsList = expenseIdsAsList;
    }

    public void setExpenseIds(List<Integer> expenseIds) {
        this.expenseIds = expenseIds;
    }

    public void setInvoiceIdsAsList(List<AccountMove> invoiceIdsAsList) {
        this.invoiceIdsAsList = invoiceIdsAsList;
    }

    public void setInvoiceIds(List<Integer> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public void setValidityDate(Object validityDate) {
        this.validityDate = validityDate;
    }

    public void setAmountTotal(Object amountTotal) {
        this.amountTotal = amountTotal;
    }

    public void setActivityDateDeadline(Object activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    public void setTeamIdAsObject(CrmTeam teamIdAsObject) {
        this.teamIdAsObject = teamIdAsObject;
    }

    public void setTeamId(OdooId teamId) {
        this.teamId = teamId;
    }

    public void setIsShowProjectButton(boolean isShowProjectButton) {
        this.isShowProjectButton = isShowProjectButton;
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

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPendingEmailTemplateIdAsObject(MailTemplate pendingEmailTemplateIdAsObject) {
        this.pendingEmailTemplateIdAsObject = pendingEmailTemplateIdAsObject;
    }

    public void setPendingEmailTemplateId(OdooId pendingEmailTemplateId) {
        this.pendingEmailTemplateId = pendingEmailTemplateId;
    }

    public void setTaxCalculationRoundingMethod(Object taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod;
    }

    public void setL10nDin5008Addresses(Object l10nDin5008Addresses) {
        this.l10nDin5008Addresses = l10nDin5008Addresses;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setTagIdsAsList(List<CrmTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setClientOrderRef(String clientOrderRef) {
        this.clientOrderRef = clientOrderRef;
    }

    public void setPricelistIdAsObject(ProductPricelist pricelistIdAsObject) {
        this.pricelistIdAsObject = pricelistIdAsObject;
    }

    public void setPricelistId(OdooId pricelistId) {
        this.pricelistId = pricelistId;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setTimesheetTotalDuration(int timesheetTotalDuration) {
        this.timesheetTotalDuration = timesheetTotalDuration;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setL10nDin5008TemplateData(Object l10nDin5008TemplateData) {
        this.l10nDin5008TemplateData = l10nDin5008TemplateData;
    }

    public void setAccessWarning(Object accessWarning) {
        this.accessWarning = accessWarning;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setIsVisibleProject(boolean isVisibleProject) {
        this.isVisibleProject = isVisibleProject;
    }

    public void setPartnerInvoiceIdAsObject(ResPartner partnerInvoiceIdAsObject) {
        this.partnerInvoiceIdAsObject = partnerInvoiceIdAsObject;
    }

    public void setPartnerInvoiceId(OdooId partnerInvoiceId) {
        this.partnerInvoiceId = partnerInvoiceId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    public void setRewardAmount(double rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public void setIsRequirePayment(boolean isRequirePayment) {
        this.isRequirePayment = isRequirePayment;
    }

    public void setSignature(Object signature) {
        this.signature = signature;
    }

    public void setIsShowHoursRecordedButton(boolean isShowHoursRecordedButton) {
        this.isShowHoursRecordedButton = isShowHoursRecordedButton;
    }

    public void setMilestoneCount(int milestoneCount) {
        this.milestoneCount = milestoneCount;
    }

    public void setAmountToInvoice(Object amountToInvoice) {
        this.amountToInvoice = amountToInvoice;
    }

    public void setExpenseCount(int expenseCount) {
        this.expenseCount = expenseCount;
    }

    public void setCommitmentDate(Date commitmentDate) {
        this.commitmentDate = commitmentDate;
    }

    public void setCurrencyRate(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public void setAmountTax(Object amountTax) {
        this.amountTax = amountTax;
    }

    public void setAmountUntaxed(Object amountUntaxed) {
        this.amountUntaxed = amountUntaxed;
    }

    public void setOrderLineAsList(List<SaleOrderLine> orderLineAsList) {
        this.orderLineAsList = orderLineAsList;
    }

    public void setOrderLine(List<Integer> orderLine) {
        this.orderLine = orderLine;
    }

    public void setAmountUndiscounted(double amountUndiscounted) {
        this.amountUndiscounted = amountUndiscounted;
    }

    public void setTasksIdsAsList(List<ProjectTask> tasksIdsAsList) {
        this.tasksIdsAsList = tasksIdsAsList;
    }

    public void setTasksIds(List<Integer> tasksIds) {
        this.tasksIds = tasksIds;
    }

    public void setIsIsProductMilestone(boolean isIsProductMilestone) {
        this.isIsProductMilestone = isIsProductMilestone;
    }

    public void setAppliedCouponIdsAsList(List<LoyaltyCard> appliedCouponIdsAsList) {
        this.appliedCouponIdsAsList = appliedCouponIdsAsList;
    }

    public void setAppliedCouponIds(List<Integer> appliedCouponIds) {
        this.appliedCouponIds = appliedCouponIds;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setInvoiceCount(int invoiceCount) {
        this.invoiceCount = invoiceCount;
    }

    public void setProjectIdsAsList(List<Project> projectIdsAsList) {
        this.projectIdsAsList = projectIdsAsList;
    }

    public void setProjectIds(List<Integer> projectIds) {
        this.projectIds = projectIds;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setIsIsExpired(boolean isIsExpired) {
        this.isIsExpired = isIsExpired;
    }

    public void setSignedBy(String signedBy) {
        this.signedBy = signedBy;
    }

    public void setAuthorizedTransactionIdsAsList(List<PaymentTransaction> authorizedTransactionIdsAsList) {
        this.authorizedTransactionIdsAsList = authorizedTransactionIdsAsList;
    }

    public void setAuthorizedTransactionIds(List<Integer> authorizedTransactionIds) {
        this.authorizedTransactionIds = authorizedTransactionIds;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setSourceIdAsObject(UtmSource sourceIdAsObject) {
        this.sourceIdAsObject = sourceIdAsObject;
    }

    public void setSourceId(OdooId sourceId) {
        this.sourceId = sourceId;
    }

    public void setTimesheetCount(double timesheetCount) {
        this.timesheetCount = timesheetCount;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setIsHasActivePricelist(boolean isHasActivePricelist) {
        this.isHasActivePricelist = isHasActivePricelist;
    }

    public void setPrepaymentPercent(double prepaymentPercent) {
        this.prepaymentPercent = prepaymentPercent;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setPaymentTermIdAsObject(AccountPaymentTerm paymentTermIdAsObject) {
        this.paymentTermIdAsObject = paymentTermIdAsObject;
    }

    public void setPaymentTermId(OdooId paymentTermId) {
        this.paymentTermId = paymentTermId;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
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

    public void setL10nDin5008DocumentTitle(String l10nDin5008DocumentTitle) {
        this.l10nDin5008DocumentTitle = l10nDin5008DocumentTitle;
    }

    public void setAnalyticAccountIdAsObject(AccountAnalyticAccount analyticAccountIdAsObject) {
        this.analyticAccountIdAsObject = analyticAccountIdAsObject;
    }

    public void setAnalyticAccountId(OdooId analyticAccountId) {
        this.analyticAccountId = analyticAccountId;
    }

    public void setTransactionIdsAsList(List<PaymentTransaction> transactionIdsAsList) {
        this.transactionIdsAsList = transactionIdsAsList;
    }

    public void setTransactionIds(List<Integer> transactionIds) {
        this.transactionIds = transactionIds;
    }

    public void setMediumIdAsObject(UtmMedium mediumIdAsObject) {
        this.mediumIdAsObject = mediumIdAsObject;
    }

    public void setMediumId(OdooId mediumId) {
        this.mediumId = mediumId;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCampaignIdAsObject(UtmCampaign campaignIdAsObject) {
        this.campaignIdAsObject = campaignIdAsObject;
    }

    public void setCampaignId(OdooId campaignId) {
        this.campaignId = campaignId;
    }

    public void setTasksCount(int tasksCount) {
        this.tasksCount = tasksCount;
    }

    public void setIsShowTaskButton(boolean isShowTaskButton) {
        this.isShowTaskButton = isShowTaskButton;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setAmountInvoiced(Object amountInvoiced) {
        this.amountInvoiced = amountInvoiced;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setSaleOrderTemplateIdAsObject(SaleOrderTemplate saleOrderTemplateIdAsObject) {
        this.saleOrderTemplateIdAsObject = saleOrderTemplateIdAsObject;
    }

    public void setSaleOrderTemplateId(OdooId saleOrderTemplateId) {
        this.saleOrderTemplateId = saleOrderTemplateId;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setTermsType(Object termsType) {
        this.termsType = termsType;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setOpportunityIdAsObject(CrmLead opportunityIdAsObject) {
        this.opportunityIdAsObject = opportunityIdAsObject;
    }

    public void setOpportunityId(OdooId opportunityId) {
        this.opportunityId = opportunityId;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public void setTaxTotals(Object taxTotals) {
        this.taxTotals = taxTotals;
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

    public void setPartnerShippingIdAsObject(ResPartner partnerShippingIdAsObject) {
        this.partnerShippingIdAsObject = partnerShippingIdAsObject;
    }

    public void setPartnerShippingId(OdooId partnerShippingId) {
        this.partnerShippingId = partnerShippingId;
    }

    public void setCouponPointIdsAsList(List<SaleOrderCouponPoints> couponPointIdsAsList) {
        this.couponPointIdsAsList = couponPointIdsAsList;
    }

    public void setCouponPointIds(List<Integer> couponPointIds) {
        this.couponPointIds = couponPointIds;
    }

    public void setInvoiceStatus(Object invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setPartnerCreditWarning(Object partnerCreditWarning) {
        this.partnerCreditWarning = partnerCreditWarning;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setFiscalPositionIdAsObject(AccountFiscalPosition fiscalPositionIdAsObject) {
        this.fiscalPositionIdAsObject = fiscalPositionIdAsObject;
    }

    public void setFiscalPositionId(OdooId fiscalPositionId) {
        this.fiscalPositionId = fiscalPositionId;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setSignedOn(Date signedOn) {
        this.signedOn = signedOn;
    }

    public void setIsShowCreateProjectButton(boolean isShowCreateProjectButton) {
        this.isShowCreateProjectButton = isShowCreateProjectButton;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setIsShowUpdateFpos(boolean isShowUpdateFpos) {
        this.isShowUpdateFpos = isShowUpdateFpos;
    }

    public void setTaxCountryIdAsObject(ResCountry taxCountryIdAsObject) {
        this.taxCountryIdAsObject = taxCountryIdAsObject;
    }

    public void setTaxCountryId(OdooId taxCountryId) {
        this.taxCountryId = taxCountryId;
    }

    public void setSaleOrderOptionIdsAsList(List<SaleOrderOption> saleOrderOptionIdsAsList) {
        this.saleOrderOptionIdsAsList = saleOrderOptionIdsAsList;
    }

    public void setSaleOrderOptionIds(List<Integer> saleOrderOptionIds) {
        this.saleOrderOptionIds = saleOrderOptionIds;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setIsRequireSignature(boolean isRequireSignature) {
        this.isRequireSignature = isRequireSignature;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public void setTimesheetEncodeUomIdAsObject(Uom timesheetEncodeUomIdAsObject) {
        this.timesheetEncodeUomIdAsObject = timesheetEncodeUomIdAsObject;
    }

    public void setTimesheetEncodeUomId(OdooId timesheetEncodeUomId) {
        this.timesheetEncodeUomId = timesheetEncodeUomId;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}