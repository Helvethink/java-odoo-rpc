
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

package ch.helvethink.odoo4java.test.ng.account;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.test.ng.hr.expense.HrExpenseSheet;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.AccountIncoterms;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.test.ng.account.bank.statement.AccountBankStatementLine;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.utm.UtmCampaign;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.account.partial.AccountPartialReconcile;
import ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.test.ng.utm.UtmSource;
import ch.helvethink.odoo4java.test.ng.utm.UtmMedium;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.account.AccountPayment;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction;
import ch.helvethink.odoo4java.test.ng.account.cash.AccountCashRounding;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.account.bank.AccountBankStatement;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("account.move")
public class AccountMove implements OdooObj {

    
    private AccountMove autoPostOriginIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId autoPostOriginId;

    
    private boolean isRestrictModeHashTable;

    
    private Date writeDate;

    
    private String inalterableHash;

    
    private String amountTotalWords;

    
    private List<AccountMove> duplicatedRefIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> duplicatedRefIds;

    
    private IrAttachment messageMainAttachmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId messageMainAttachmentId;

    
    private boolean isIsStorno;

    
    private Object invoiceDateDue;

    
    private Object amountTotal;

    
    private int directionSign;

    
    private Object activityDateDeadline;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private List<AccountMoveLine> invoiceLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private List<Integer> invoiceLineIds;

    
    private Object activityState;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private int messageHasErrorCounter;

    
    private String taxCountryCode;

    
    private Object amountTotalSigned;

    
    private Object state;

    
    private int id;

    
    private List<AccountMove> taxCashBasisCreatedMoveIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> taxCashBasisCreatedMoveIds;

    
    private Object taxCalculationRoundingMethod;

    
    private Object amountResidual;

    
    private Object l10nDin5008Addresses;

    
    private List<IrAttachment> attachmentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> attachmentIds;

    
    private List<AccountAnalyticLine> timesheetIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
    
    private List<Integer> timesheetIds;

    
    private int messageAttachmentCount;

    
    private List<AccountJournal> suitableJournalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private List<Integer> suitableJournalIds;

    
    private Object quickEditTotalAmount;

    
    private AccountBankStatement statementIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.bank.AccountBankStatement")
        @OdooModel("account.bank.AccountBankStatement")
    
    private OdooId statementId;

    
    private String paymentReference;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int timesheetTotalDuration;

    
    private String accessToken;

    
    private Object l10nDin5008TemplateData;

    
    private Object accessWarning;

    
    private List<AccountMoveLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private List<Integer> lineIds;

    
    private AccountBankStatementLine statementLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
    
    private OdooId statementLineId;

    
    private Object autoPost;

    
    private AccountPartialReconcile taxCashBasisRecIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
    
    private OdooId taxCashBasisRecId;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private boolean isAlwaysTaxExigible;

    
    private Object sendAndPrintValues;

    
    private Object invoicePdfReportFile;

    
    private AccountCashRounding invoiceCashRoundingIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.cash.AccountCashRounding")
        @OdooModel("account.cash.AccountCashRounding")
    
    private OdooId invoiceCashRoundingId;

    
    private ResPartner bankPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId bankPartnerId;

    
    private boolean isMessageIsFollower;

    
    private Object autoPostUntil;

    
    private Object partnerCredit;

    
    private Object moveType;

    
    private ResUsers invoiceUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId invoiceUserId;

    
    private String invoiceFilterTypeDomain;

    
    private Object ublCiiXmlFile;

    
    private int secureSequenceNumber;

    
    private Object invoiceDate;

    
    private boolean isIsBeingSent;

    
    private boolean isNeededTermsDirty;

    
    private AccountIncoterms invoiceIncotermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountIncoterms")
        @OdooModel("account.AccountIncoterms")
    
    private OdooId invoiceIncotermId;

    
    private Object amountTax;

    
    private Object amountUntaxed;

    
    private ResPartner commercialPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId commercialPartnerId;

    
    private String invoiceSourceEmail;

    
    private boolean isShowPaymentTermDetails;

    
    private HrExpenseSheet expenseSheetIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.expense.HrExpenseSheet")
        @OdooModel("hr.expense.HrExpenseSheet")
    
    private OdooId expenseSheetId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private AccountMove reversedEntryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId reversedEntryId;

    
    private boolean isMessageHasSmsError;

    
    private Object qrCodeMethod;

    
    private IrAttachment invoicePdfReportIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId invoicePdfReportId;

    
    private IrAttachment ublCiiXmlIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId ublCiiXmlId;

    
    private int sequenceNumber;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private Object invoicePaymentsWidget;

    
    private int saleOrderCount;

    
    private String invoiceOrigin;

    
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

    
    private Object amountTaxSigned;

    
    private Object date;

    
    private int timesheetCount;

    
    private String typeName;

    
    private Object amountPaid;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private AccountPaymentTerm invoicePaymentTermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId invoicePaymentTermId;

    
    private boolean isNeedCancelRequest;

    
    private boolean isShowResetToDraftButton;

    
    private Object amountTotalInCurrencySigned;

    
    private boolean isMadeSequenceHole;

    
    private Object quickEncodingVals;

    
    private Object activityExceptionDecoration;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private String ref;

    
    private boolean isShowDeliveryDate;

    
    private Object amountUntaxedSigned;

    
    private boolean isHasMessage;

    
    private String l10nDin5008DocumentTitle;

    
    private ResPartnerBank partnerBankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId partnerBankId;

    
    private Object paymentTermDetails;

    
    private boolean isHasReconciledEntries;

    
    private List<PaymentTransaction> transactionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentTransaction")
        @OdooModel("payment.PaymentTransaction")
    
    private List<Integer> transactionIds;

    
    private UtmMedium mediumIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmMedium")
        @OdooModel("utm.UtmMedium")
    
    private OdooId mediumId;

    
    private String stringToHash;

    
    private Date createDate;

    
    private UtmCampaign campaignIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmCampaign")
        @OdooModel("utm.UtmCampaign")
    
    private OdooId campaignId;

    
    private Object paymentState;

    
    private boolean isQuickEditMode;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private boolean isShowNameWarning;

    
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

    
    private String countryCode;

    
    private Object deliveryDate;

    
    private String highestName;

    
    private boolean isHidePostButton;

    
    private Object taxTotals;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private AccountMove taxCashBasisOriginMoveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId taxCashBasisOriginMoveId;

    
    private ResPartner partnerShippingIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerShippingId;

    
    private boolean isShowDiscountDetails;

    
    private boolean isInvoiceHasOutstanding;

    
    private Object partnerCreditWarning;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isPostedBefore;

    
    private Object neededTerms;

    
    private boolean isDisplayQrCode;

    
    private AccountFiscalPosition fiscalPositionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private OdooId fiscalPositionId;

    
    private Object myActivityDateDeadline;

    
    private List<AccountPayment> paymentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountPayment")
        @OdooModel("account.AccountPayment")
    
    private List<Integer> paymentIds;

    
    private ResCurrency companyCurrencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId companyCurrencyId;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String incotermLocation;

    
    private boolean isDisplayInactiveCurrencyWarning;

    
    private AccountPayment paymentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountPayment")
        @OdooModel("account.AccountPayment")
    
    private OdooId paymentId;

    
    private AccountMove invoiceVendorBillIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId invoiceVendorBillId;

    
    private boolean isToCheck;

    
    private ResCountry taxCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId taxCountryId;

    
    private List<AccountBankStatementLine> statementLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
    
    private List<Integer> statementLineIds;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private String activityTypeIcon;

    
    private String sequencePrefix;

    
    private boolean isL10nChIsQrValid;

    
    private String accessUrl;

    
    private Object amountResidualSigned;

    
    private String invoicePartnerDisplayName;

    
    private Uom timesheetEncodeUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId timesheetEncodeUomId;

    
    private boolean isMessageHasError;

    
    private List<AccountMove> reversalMoveIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> reversalMoveId;

    
    private String taxLockDateMessage;

    
    private boolean isMessageNeedaction;

    
    private String activitySummary;

    
    private Object narration;

    
    private int messageNeedactionCounter;

    
    private boolean isIsMoveSent;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object invoiceOutstandingCreditsDebitsWidget;


    public AccountMove() {
    // Constructor
    }


    public AccountMove getAutoPostOriginIdAsObject() {
        return autoPostOriginIdAsObject;
    }

    public OdooId getAutoPostOriginId() {
        return autoPostOriginId;
    }

    public boolean getIsRestrictModeHashTable() {
        return isRestrictModeHashTable;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public String getInalterableHash() {
        return inalterableHash;
    }

    public String getAmountTotalWords() {
        return amountTotalWords;
    }

    public List<AccountMove> getDuplicatedRefIdsAsList() {
        return duplicatedRefIdsAsList;
    }

    public List<Integer> getDuplicatedRefIds() {
        return duplicatedRefIds;
    }

    public IrAttachment getMessageMainAttachmentIdAsObject() {
        return messageMainAttachmentIdAsObject;
    }

    public OdooId getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    public boolean getIsIsStorno() {
        return isIsStorno;
    }

    public Object getInvoiceDateDue() {
        return invoiceDateDue;
    }

    public Object getAmountTotal() {
        return amountTotal;
    }

    public int getDirectionSign() {
        return directionSign;
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

    public List<AccountMoveLine> getInvoiceLineIdsAsList() {
        return invoiceLineIdsAsList;
    }

    public List<Integer> getInvoiceLineIds() {
        return invoiceLineIds;
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

    public String getTaxCountryCode() {
        return taxCountryCode;
    }

    public Object getAmountTotalSigned() {
        return amountTotalSigned;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public List<AccountMove> getTaxCashBasisCreatedMoveIdsAsList() {
        return taxCashBasisCreatedMoveIdsAsList;
    }

    public List<Integer> getTaxCashBasisCreatedMoveIds() {
        return taxCashBasisCreatedMoveIds;
    }

    public Object getTaxCalculationRoundingMethod() {
        return taxCalculationRoundingMethod;
    }

    public Object getAmountResidual() {
        return amountResidual;
    }

    public Object getL10nDin5008Addresses() {
        return l10nDin5008Addresses;
    }

    public List<IrAttachment> getAttachmentIdsAsList() {
        return attachmentIdsAsList;
    }

    public List<Integer> getAttachmentIds() {
        return attachmentIds;
    }

    public List<AccountAnalyticLine> getTimesheetIdsAsList() {
        return timesheetIdsAsList;
    }

    public List<Integer> getTimesheetIds() {
        return timesheetIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<AccountJournal> getSuitableJournalIdsAsList() {
        return suitableJournalIdsAsList;
    }

    public List<Integer> getSuitableJournalIds() {
        return suitableJournalIds;
    }

    public Object getQuickEditTotalAmount() {
        return quickEditTotalAmount;
    }

    public AccountBankStatement getStatementIdAsObject() {
        return statementIdAsObject;
    }

    public OdooId getStatementId() {
        return statementId;
    }

    public String getPaymentReference() {
        return paymentReference;
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

    public List<AccountMoveLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public AccountBankStatementLine getStatementLineIdAsObject() {
        return statementLineIdAsObject;
    }

    public OdooId getStatementLineId() {
        return statementLineId;
    }

    public Object getAutoPost() {
        return autoPost;
    }

    public AccountPartialReconcile getTaxCashBasisRecIdAsObject() {
        return taxCashBasisRecIdAsObject;
    }

    public OdooId getTaxCashBasisRecId() {
        return taxCashBasisRecId;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public boolean getIsAlwaysTaxExigible() {
        return isAlwaysTaxExigible;
    }

    public Object getSendAndPrintValues() {
        return sendAndPrintValues;
    }

    public Object getInvoicePdfReportFile() {
        return invoicePdfReportFile;
    }

    public AccountCashRounding getInvoiceCashRoundingIdAsObject() {
        return invoiceCashRoundingIdAsObject;
    }

    public OdooId getInvoiceCashRoundingId() {
        return invoiceCashRoundingId;
    }

    public ResPartner getBankPartnerIdAsObject() {
        return bankPartnerIdAsObject;
    }

    public OdooId getBankPartnerId() {
        return bankPartnerId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public Object getAutoPostUntil() {
        return autoPostUntil;
    }

    public Object getPartnerCredit() {
        return partnerCredit;
    }

    public Object getMoveType() {
        return moveType;
    }

    public ResUsers getInvoiceUserIdAsObject() {
        return invoiceUserIdAsObject;
    }

    public OdooId getInvoiceUserId() {
        return invoiceUserId;
    }

    public String getInvoiceFilterTypeDomain() {
        return invoiceFilterTypeDomain;
    }

    public Object getUblCiiXmlFile() {
        return ublCiiXmlFile;
    }

    public int getSecureSequenceNumber() {
        return secureSequenceNumber;
    }

    public Object getInvoiceDate() {
        return invoiceDate;
    }

    public boolean getIsIsBeingSent() {
        return isIsBeingSent;
    }

    public boolean getIsNeededTermsDirty() {
        return isNeededTermsDirty;
    }

    public AccountIncoterms getInvoiceIncotermIdAsObject() {
        return invoiceIncotermIdAsObject;
    }

    public OdooId getInvoiceIncotermId() {
        return invoiceIncotermId;
    }

    public Object getAmountTax() {
        return amountTax;
    }

    public Object getAmountUntaxed() {
        return amountUntaxed;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public String getInvoiceSourceEmail() {
        return invoiceSourceEmail;
    }

    public boolean getIsShowPaymentTermDetails() {
        return isShowPaymentTermDetails;
    }

    public HrExpenseSheet getExpenseSheetIdAsObject() {
        return expenseSheetIdAsObject;
    }

    public OdooId getExpenseSheetId() {
        return expenseSheetId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public AccountMove getReversedEntryIdAsObject() {
        return reversedEntryIdAsObject;
    }

    public OdooId getReversedEntryId() {
        return reversedEntryId;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public Object getQrCodeMethod() {
        return qrCodeMethod;
    }

    public IrAttachment getInvoicePdfReportIdAsObject() {
        return invoicePdfReportIdAsObject;
    }

    public OdooId getInvoicePdfReportId() {
        return invoicePdfReportId;
    }

    public IrAttachment getUblCiiXmlIdAsObject() {
        return ublCiiXmlIdAsObject;
    }

    public OdooId getUblCiiXmlId() {
        return ublCiiXmlId;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public Object getInvoicePaymentsWidget() {
        return invoicePaymentsWidget;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public String getInvoiceOrigin() {
        return invoiceOrigin;
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

    public Object getAmountTaxSigned() {
        return amountTaxSigned;
    }

    public Object getDate() {
        return date;
    }

    public int getTimesheetCount() {
        return timesheetCount;
    }

    public String getTypeName() {
        return typeName;
    }

    public Object getAmountPaid() {
        return amountPaid;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public AccountPaymentTerm getInvoicePaymentTermIdAsObject() {
        return invoicePaymentTermIdAsObject;
    }

    public OdooId getInvoicePaymentTermId() {
        return invoicePaymentTermId;
    }

    public boolean getIsNeedCancelRequest() {
        return isNeedCancelRequest;
    }

    public boolean getIsShowResetToDraftButton() {
        return isShowResetToDraftButton;
    }

    public Object getAmountTotalInCurrencySigned() {
        return amountTotalInCurrencySigned;
    }

    public boolean getIsMadeSequenceHole() {
        return isMadeSequenceHole;
    }

    public Object getQuickEncodingVals() {
        return quickEncodingVals;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public List<MailActivity> getActivityIdsAsList() {
        return activityIdsAsList;
    }

    public List<Integer> getActivityIds() {
        return activityIds;
    }

    public String getRef() {
        return ref;
    }

    public boolean getIsShowDeliveryDate() {
        return isShowDeliveryDate;
    }

    public Object getAmountUntaxedSigned() {
        return amountUntaxedSigned;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getL10nDin5008DocumentTitle() {
        return l10nDin5008DocumentTitle;
    }

    public ResPartnerBank getPartnerBankIdAsObject() {
        return partnerBankIdAsObject;
    }

    public OdooId getPartnerBankId() {
        return partnerBankId;
    }

    public Object getPaymentTermDetails() {
        return paymentTermDetails;
    }

    public boolean getIsHasReconciledEntries() {
        return isHasReconciledEntries;
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

    public String getStringToHash() {
        return stringToHash;
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

    public Object getPaymentState() {
        return paymentState;
    }

    public boolean getIsQuickEditMode() {
        return isQuickEditMode;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public boolean getIsShowNameWarning() {
        return isShowNameWarning;
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

    public String getCountryCode() {
        return countryCode;
    }

    public Object getDeliveryDate() {
        return deliveryDate;
    }

    public String getHighestName() {
        return highestName;
    }

    public boolean getIsHidePostButton() {
        return isHidePostButton;
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

    public AccountMove getTaxCashBasisOriginMoveIdAsObject() {
        return taxCashBasisOriginMoveIdAsObject;
    }

    public OdooId getTaxCashBasisOriginMoveId() {
        return taxCashBasisOriginMoveId;
    }

    public ResPartner getPartnerShippingIdAsObject() {
        return partnerShippingIdAsObject;
    }

    public OdooId getPartnerShippingId() {
        return partnerShippingId;
    }

    public boolean getIsShowDiscountDetails() {
        return isShowDiscountDetails;
    }

    public boolean getIsInvoiceHasOutstanding() {
        return isInvoiceHasOutstanding;
    }

    public Object getPartnerCreditWarning() {
        return partnerCreditWarning;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsPostedBefore() {
        return isPostedBefore;
    }

    public Object getNeededTerms() {
        return neededTerms;
    }

    public boolean getIsDisplayQrCode() {
        return isDisplayQrCode;
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

    public List<AccountPayment> getPaymentIdsAsList() {
        return paymentIdsAsList;
    }

    public List<Integer> getPaymentIds() {
        return paymentIds;
    }

    public ResCurrency getCompanyCurrencyIdAsObject() {
        return companyCurrencyIdAsObject;
    }

    public OdooId getCompanyCurrencyId() {
        return companyCurrencyId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getIncotermLocation() {
        return incotermLocation;
    }

    public boolean getIsDisplayInactiveCurrencyWarning() {
        return isDisplayInactiveCurrencyWarning;
    }

    public AccountPayment getPaymentIdAsObject() {
        return paymentIdAsObject;
    }

    public OdooId getPaymentId() {
        return paymentId;
    }

    public AccountMove getInvoiceVendorBillIdAsObject() {
        return invoiceVendorBillIdAsObject;
    }

    public OdooId getInvoiceVendorBillId() {
        return invoiceVendorBillId;
    }

    public boolean getIsToCheck() {
        return isToCheck;
    }

    public ResCountry getTaxCountryIdAsObject() {
        return taxCountryIdAsObject;
    }

    public OdooId getTaxCountryId() {
        return taxCountryId;
    }

    public List<AccountBankStatementLine> getStatementLineIdsAsList() {
        return statementLineIdsAsList;
    }

    public List<Integer> getStatementLineIds() {
        return statementLineIds;
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

    public String getSequencePrefix() {
        return sequencePrefix;
    }

    public boolean getIsL10nChIsQrValid() {
        return isL10nChIsQrValid;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public Object getAmountResidualSigned() {
        return amountResidualSigned;
    }

    public String getInvoicePartnerDisplayName() {
        return invoicePartnerDisplayName;
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

    public List<AccountMove> getReversalMoveIdAsList() {
        return reversalMoveIdAsList;
    }

    public List<Integer> getReversalMoveId() {
        return reversalMoveId;
    }

    public String getTaxLockDateMessage() {
        return taxLockDateMessage;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public Object getNarration() {
        return narration;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public boolean getIsIsMoveSent() {
        return isIsMoveSent;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public Object getInvoiceOutstandingCreditsDebitsWidget() {
        return invoiceOutstandingCreditsDebitsWidget;
    }



    public void setAutoPostOriginIdAsObject(AccountMove autoPostOriginIdAsObject) {
        this.autoPostOriginIdAsObject = autoPostOriginIdAsObject;
    }

    public void setAutoPostOriginId(OdooId autoPostOriginId) {
        this.autoPostOriginId = autoPostOriginId;
    }

    public void setIsRestrictModeHashTable(boolean isRestrictModeHashTable) {
        this.isRestrictModeHashTable = isRestrictModeHashTable;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setInalterableHash(String inalterableHash) {
        this.inalterableHash = inalterableHash;
    }

    public void setAmountTotalWords(String amountTotalWords) {
        this.amountTotalWords = amountTotalWords;
    }

    public void setDuplicatedRefIdsAsList(List<AccountMove> duplicatedRefIdsAsList) {
        this.duplicatedRefIdsAsList = duplicatedRefIdsAsList;
    }

    public void setDuplicatedRefIds(List<Integer> duplicatedRefIds) {
        this.duplicatedRefIds = duplicatedRefIds;
    }

    public void setMessageMainAttachmentIdAsObject(IrAttachment messageMainAttachmentIdAsObject) {
        this.messageMainAttachmentIdAsObject = messageMainAttachmentIdAsObject;
    }

    public void setMessageMainAttachmentId(OdooId messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    public void setIsIsStorno(boolean isIsStorno) {
        this.isIsStorno = isIsStorno;
    }

    public void setInvoiceDateDue(Object invoiceDateDue) {
        this.invoiceDateDue = invoiceDateDue;
    }

    public void setAmountTotal(Object amountTotal) {
        this.amountTotal = amountTotal;
    }

    public void setDirectionSign(int directionSign) {
        this.directionSign = directionSign;
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

    public void setInvoiceLineIdsAsList(List<AccountMoveLine> invoiceLineIdsAsList) {
        this.invoiceLineIdsAsList = invoiceLineIdsAsList;
    }

    public void setInvoiceLineIds(List<Integer> invoiceLineIds) {
        this.invoiceLineIds = invoiceLineIds;
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

    public void setTaxCountryCode(String taxCountryCode) {
        this.taxCountryCode = taxCountryCode;
    }

    public void setAmountTotalSigned(Object amountTotalSigned) {
        this.amountTotalSigned = amountTotalSigned;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaxCashBasisCreatedMoveIdsAsList(List<AccountMove> taxCashBasisCreatedMoveIdsAsList) {
        this.taxCashBasisCreatedMoveIdsAsList = taxCashBasisCreatedMoveIdsAsList;
    }

    public void setTaxCashBasisCreatedMoveIds(List<Integer> taxCashBasisCreatedMoveIds) {
        this.taxCashBasisCreatedMoveIds = taxCashBasisCreatedMoveIds;
    }

    public void setTaxCalculationRoundingMethod(Object taxCalculationRoundingMethod) {
        this.taxCalculationRoundingMethod = taxCalculationRoundingMethod;
    }

    public void setAmountResidual(Object amountResidual) {
        this.amountResidual = amountResidual;
    }

    public void setL10nDin5008Addresses(Object l10nDin5008Addresses) {
        this.l10nDin5008Addresses = l10nDin5008Addresses;
    }

    public void setAttachmentIdsAsList(List<IrAttachment> attachmentIdsAsList) {
        this.attachmentIdsAsList = attachmentIdsAsList;
    }

    public void setAttachmentIds(List<Integer> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public void setTimesheetIdsAsList(List<AccountAnalyticLine> timesheetIdsAsList) {
        this.timesheetIdsAsList = timesheetIdsAsList;
    }

    public void setTimesheetIds(List<Integer> timesheetIds) {
        this.timesheetIds = timesheetIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setSuitableJournalIdsAsList(List<AccountJournal> suitableJournalIdsAsList) {
        this.suitableJournalIdsAsList = suitableJournalIdsAsList;
    }

    public void setSuitableJournalIds(List<Integer> suitableJournalIds) {
        this.suitableJournalIds = suitableJournalIds;
    }

    public void setQuickEditTotalAmount(Object quickEditTotalAmount) {
        this.quickEditTotalAmount = quickEditTotalAmount;
    }

    public void setStatementIdAsObject(AccountBankStatement statementIdAsObject) {
        this.statementIdAsObject = statementIdAsObject;
    }

    public void setStatementId(OdooId statementId) {
        this.statementId = statementId;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
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

    public void setLineIdsAsList(List<AccountMoveLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setStatementLineIdAsObject(AccountBankStatementLine statementLineIdAsObject) {
        this.statementLineIdAsObject = statementLineIdAsObject;
    }

    public void setStatementLineId(OdooId statementLineId) {
        this.statementLineId = statementLineId;
    }

    public void setAutoPost(Object autoPost) {
        this.autoPost = autoPost;
    }

    public void setTaxCashBasisRecIdAsObject(AccountPartialReconcile taxCashBasisRecIdAsObject) {
        this.taxCashBasisRecIdAsObject = taxCashBasisRecIdAsObject;
    }

    public void setTaxCashBasisRecId(OdooId taxCashBasisRecId) {
        this.taxCashBasisRecId = taxCashBasisRecId;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setIsAlwaysTaxExigible(boolean isAlwaysTaxExigible) {
        this.isAlwaysTaxExigible = isAlwaysTaxExigible;
    }

    public void setSendAndPrintValues(Object sendAndPrintValues) {
        this.sendAndPrintValues = sendAndPrintValues;
    }

    public void setInvoicePdfReportFile(Object invoicePdfReportFile) {
        this.invoicePdfReportFile = invoicePdfReportFile;
    }

    public void setInvoiceCashRoundingIdAsObject(AccountCashRounding invoiceCashRoundingIdAsObject) {
        this.invoiceCashRoundingIdAsObject = invoiceCashRoundingIdAsObject;
    }

    public void setInvoiceCashRoundingId(OdooId invoiceCashRoundingId) {
        this.invoiceCashRoundingId = invoiceCashRoundingId;
    }

    public void setBankPartnerIdAsObject(ResPartner bankPartnerIdAsObject) {
        this.bankPartnerIdAsObject = bankPartnerIdAsObject;
    }

    public void setBankPartnerId(OdooId bankPartnerId) {
        this.bankPartnerId = bankPartnerId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setAutoPostUntil(Object autoPostUntil) {
        this.autoPostUntil = autoPostUntil;
    }

    public void setPartnerCredit(Object partnerCredit) {
        this.partnerCredit = partnerCredit;
    }

    public void setMoveType(Object moveType) {
        this.moveType = moveType;
    }

    public void setInvoiceUserIdAsObject(ResUsers invoiceUserIdAsObject) {
        this.invoiceUserIdAsObject = invoiceUserIdAsObject;
    }

    public void setInvoiceUserId(OdooId invoiceUserId) {
        this.invoiceUserId = invoiceUserId;
    }

    public void setInvoiceFilterTypeDomain(String invoiceFilterTypeDomain) {
        this.invoiceFilterTypeDomain = invoiceFilterTypeDomain;
    }

    public void setUblCiiXmlFile(Object ublCiiXmlFile) {
        this.ublCiiXmlFile = ublCiiXmlFile;
    }

    public void setSecureSequenceNumber(int secureSequenceNumber) {
        this.secureSequenceNumber = secureSequenceNumber;
    }

    public void setInvoiceDate(Object invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setIsIsBeingSent(boolean isIsBeingSent) {
        this.isIsBeingSent = isIsBeingSent;
    }

    public void setIsNeededTermsDirty(boolean isNeededTermsDirty) {
        this.isNeededTermsDirty = isNeededTermsDirty;
    }

    public void setInvoiceIncotermIdAsObject(AccountIncoterms invoiceIncotermIdAsObject) {
        this.invoiceIncotermIdAsObject = invoiceIncotermIdAsObject;
    }

    public void setInvoiceIncotermId(OdooId invoiceIncotermId) {
        this.invoiceIncotermId = invoiceIncotermId;
    }

    public void setAmountTax(Object amountTax) {
        this.amountTax = amountTax;
    }

    public void setAmountUntaxed(Object amountUntaxed) {
        this.amountUntaxed = amountUntaxed;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public void setInvoiceSourceEmail(String invoiceSourceEmail) {
        this.invoiceSourceEmail = invoiceSourceEmail;
    }

    public void setIsShowPaymentTermDetails(boolean isShowPaymentTermDetails) {
        this.isShowPaymentTermDetails = isShowPaymentTermDetails;
    }

    public void setExpenseSheetIdAsObject(HrExpenseSheet expenseSheetIdAsObject) {
        this.expenseSheetIdAsObject = expenseSheetIdAsObject;
    }

    public void setExpenseSheetId(OdooId expenseSheetId) {
        this.expenseSheetId = expenseSheetId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setReversedEntryIdAsObject(AccountMove reversedEntryIdAsObject) {
        this.reversedEntryIdAsObject = reversedEntryIdAsObject;
    }

    public void setReversedEntryId(OdooId reversedEntryId) {
        this.reversedEntryId = reversedEntryId;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setQrCodeMethod(Object qrCodeMethod) {
        this.qrCodeMethod = qrCodeMethod;
    }

    public void setInvoicePdfReportIdAsObject(IrAttachment invoicePdfReportIdAsObject) {
        this.invoicePdfReportIdAsObject = invoicePdfReportIdAsObject;
    }

    public void setInvoicePdfReportId(OdooId invoicePdfReportId) {
        this.invoicePdfReportId = invoicePdfReportId;
    }

    public void setUblCiiXmlIdAsObject(IrAttachment ublCiiXmlIdAsObject) {
        this.ublCiiXmlIdAsObject = ublCiiXmlIdAsObject;
    }

    public void setUblCiiXmlId(OdooId ublCiiXmlId) {
        this.ublCiiXmlId = ublCiiXmlId;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setInvoicePaymentsWidget(Object invoicePaymentsWidget) {
        this.invoicePaymentsWidget = invoicePaymentsWidget;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setInvoiceOrigin(String invoiceOrigin) {
        this.invoiceOrigin = invoiceOrigin;
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

    public void setAmountTaxSigned(Object amountTaxSigned) {
        this.amountTaxSigned = amountTaxSigned;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public void setTimesheetCount(int timesheetCount) {
        this.timesheetCount = timesheetCount;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setAmountPaid(Object amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setInvoicePaymentTermIdAsObject(AccountPaymentTerm invoicePaymentTermIdAsObject) {
        this.invoicePaymentTermIdAsObject = invoicePaymentTermIdAsObject;
    }

    public void setInvoicePaymentTermId(OdooId invoicePaymentTermId) {
        this.invoicePaymentTermId = invoicePaymentTermId;
    }

    public void setIsNeedCancelRequest(boolean isNeedCancelRequest) {
        this.isNeedCancelRequest = isNeedCancelRequest;
    }

    public void setIsShowResetToDraftButton(boolean isShowResetToDraftButton) {
        this.isShowResetToDraftButton = isShowResetToDraftButton;
    }

    public void setAmountTotalInCurrencySigned(Object amountTotalInCurrencySigned) {
        this.amountTotalInCurrencySigned = amountTotalInCurrencySigned;
    }

    public void setIsMadeSequenceHole(boolean isMadeSequenceHole) {
        this.isMadeSequenceHole = isMadeSequenceHole;
    }

    public void setQuickEncodingVals(Object quickEncodingVals) {
        this.quickEncodingVals = quickEncodingVals;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setActivityIdsAsList(List<MailActivity> activityIdsAsList) {
        this.activityIdsAsList = activityIdsAsList;
    }

    public void setActivityIds(List<Integer> activityIds) {
        this.activityIds = activityIds;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setIsShowDeliveryDate(boolean isShowDeliveryDate) {
        this.isShowDeliveryDate = isShowDeliveryDate;
    }

    public void setAmountUntaxedSigned(Object amountUntaxedSigned) {
        this.amountUntaxedSigned = amountUntaxedSigned;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setL10nDin5008DocumentTitle(String l10nDin5008DocumentTitle) {
        this.l10nDin5008DocumentTitle = l10nDin5008DocumentTitle;
    }

    public void setPartnerBankIdAsObject(ResPartnerBank partnerBankIdAsObject) {
        this.partnerBankIdAsObject = partnerBankIdAsObject;
    }

    public void setPartnerBankId(OdooId partnerBankId) {
        this.partnerBankId = partnerBankId;
    }

    public void setPaymentTermDetails(Object paymentTermDetails) {
        this.paymentTermDetails = paymentTermDetails;
    }

    public void setIsHasReconciledEntries(boolean isHasReconciledEntries) {
        this.isHasReconciledEntries = isHasReconciledEntries;
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

    public void setStringToHash(String stringToHash) {
        this.stringToHash = stringToHash;
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

    public void setPaymentState(Object paymentState) {
        this.paymentState = paymentState;
    }

    public void setIsQuickEditMode(boolean isQuickEditMode) {
        this.isQuickEditMode = isQuickEditMode;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setIsShowNameWarning(boolean isShowNameWarning) {
        this.isShowNameWarning = isShowNameWarning;
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

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDeliveryDate(Object deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setHighestName(String highestName) {
        this.highestName = highestName;
    }

    public void setIsHidePostButton(boolean isHidePostButton) {
        this.isHidePostButton = isHidePostButton;
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

    public void setTaxCashBasisOriginMoveIdAsObject(AccountMove taxCashBasisOriginMoveIdAsObject) {
        this.taxCashBasisOriginMoveIdAsObject = taxCashBasisOriginMoveIdAsObject;
    }

    public void setTaxCashBasisOriginMoveId(OdooId taxCashBasisOriginMoveId) {
        this.taxCashBasisOriginMoveId = taxCashBasisOriginMoveId;
    }

    public void setPartnerShippingIdAsObject(ResPartner partnerShippingIdAsObject) {
        this.partnerShippingIdAsObject = partnerShippingIdAsObject;
    }

    public void setPartnerShippingId(OdooId partnerShippingId) {
        this.partnerShippingId = partnerShippingId;
    }

    public void setIsShowDiscountDetails(boolean isShowDiscountDetails) {
        this.isShowDiscountDetails = isShowDiscountDetails;
    }

    public void setIsInvoiceHasOutstanding(boolean isInvoiceHasOutstanding) {
        this.isInvoiceHasOutstanding = isInvoiceHasOutstanding;
    }

    public void setPartnerCreditWarning(Object partnerCreditWarning) {
        this.partnerCreditWarning = partnerCreditWarning;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsPostedBefore(boolean isPostedBefore) {
        this.isPostedBefore = isPostedBefore;
    }

    public void setNeededTerms(Object neededTerms) {
        this.neededTerms = neededTerms;
    }

    public void setIsDisplayQrCode(boolean isDisplayQrCode) {
        this.isDisplayQrCode = isDisplayQrCode;
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

    public void setPaymentIdsAsList(List<AccountPayment> paymentIdsAsList) {
        this.paymentIdsAsList = paymentIdsAsList;
    }

    public void setPaymentIds(List<Integer> paymentIds) {
        this.paymentIds = paymentIds;
    }

    public void setCompanyCurrencyIdAsObject(ResCurrency companyCurrencyIdAsObject) {
        this.companyCurrencyIdAsObject = companyCurrencyIdAsObject;
    }

    public void setCompanyCurrencyId(OdooId companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setIncotermLocation(String incotermLocation) {
        this.incotermLocation = incotermLocation;
    }

    public void setIsDisplayInactiveCurrencyWarning(boolean isDisplayInactiveCurrencyWarning) {
        this.isDisplayInactiveCurrencyWarning = isDisplayInactiveCurrencyWarning;
    }

    public void setPaymentIdAsObject(AccountPayment paymentIdAsObject) {
        this.paymentIdAsObject = paymentIdAsObject;
    }

    public void setPaymentId(OdooId paymentId) {
        this.paymentId = paymentId;
    }

    public void setInvoiceVendorBillIdAsObject(AccountMove invoiceVendorBillIdAsObject) {
        this.invoiceVendorBillIdAsObject = invoiceVendorBillIdAsObject;
    }

    public void setInvoiceVendorBillId(OdooId invoiceVendorBillId) {
        this.invoiceVendorBillId = invoiceVendorBillId;
    }

    public void setIsToCheck(boolean isToCheck) {
        this.isToCheck = isToCheck;
    }

    public void setTaxCountryIdAsObject(ResCountry taxCountryIdAsObject) {
        this.taxCountryIdAsObject = taxCountryIdAsObject;
    }

    public void setTaxCountryId(OdooId taxCountryId) {
        this.taxCountryId = taxCountryId;
    }

    public void setStatementLineIdsAsList(List<AccountBankStatementLine> statementLineIdsAsList) {
        this.statementLineIdsAsList = statementLineIdsAsList;
    }

    public void setStatementLineIds(List<Integer> statementLineIds) {
        this.statementLineIds = statementLineIds;
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

    public void setSequencePrefix(String sequencePrefix) {
        this.sequencePrefix = sequencePrefix;
    }

    public void setIsL10nChIsQrValid(boolean isL10nChIsQrValid) {
        this.isL10nChIsQrValid = isL10nChIsQrValid;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public void setAmountResidualSigned(Object amountResidualSigned) {
        this.amountResidualSigned = amountResidualSigned;
    }

    public void setInvoicePartnerDisplayName(String invoicePartnerDisplayName) {
        this.invoicePartnerDisplayName = invoicePartnerDisplayName;
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

    public void setReversalMoveIdAsList(List<AccountMove> reversalMoveIdAsList) {
        this.reversalMoveIdAsList = reversalMoveIdAsList;
    }

    public void setReversalMoveId(List<Integer> reversalMoveId) {
        this.reversalMoveId = reversalMoveId;
    }

    public void setTaxLockDateMessage(String taxLockDateMessage) {
        this.taxLockDateMessage = taxLockDateMessage;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setNarration(Object narration) {
        this.narration = narration;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setIsIsMoveSent(boolean isIsMoveSent) {
        this.isIsMoveSent = isIsMoveSent;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setInvoiceOutstandingCreditsDebitsWidget(Object invoiceOutstandingCreditsDebitsWidget) {
        this.invoiceOutstandingCreditsDebitsWidget = invoiceOutstandingCreditsDebitsWidget;
    }



}