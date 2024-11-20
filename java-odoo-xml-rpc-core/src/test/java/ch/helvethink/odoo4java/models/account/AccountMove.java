
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

package ch.helvethink.odoo4java.models.account;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine;
import ch.helvethink.odoo4java.models.account.bank.AccountBankStatement;
import ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine;
import ch.helvethink.odoo4java.models.account.cash.AccountCashRounding;
import ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.models.account.journal.AccountJournalGroup;
import ch.helvethink.odoo4java.models.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile;
import ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine;
import ch.helvethink.odoo4java.models.res.*;
import ch.helvethink.odoo4java.models.res.partner.ResPartnerBank;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.move")
public class AccountMove implements OdooObj {

    
        private AccountMove autoPostOriginIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("auto_post_origin_id")
        private OdooId autoPostOriginId;
    

    
        @JsonProperty("restrict_mode_hash_table")
        private boolean isRestrictModeHashTable;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("inalterable_hash")
        private String inalterableHash;
    

    
        @JsonProperty("amount_total_words")
        private String amountTotalWords;
    

    
        private List<AccountMove> duplicatedRefIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("duplicated_ref_ids")
        private List<Integer> duplicatedRefIds;
    

    
        @JsonProperty("is_storno")
        private boolean isIsStorno;
    

    
        @JsonProperty("invoice_date_due")
        private Date invoiceDateDue;
    

    
        @JsonProperty("amount_total")
        private Object amountTotal;
    

    
        @JsonProperty("direction_sign")
        private int directionSign;
    

    
        @JsonProperty("activity_date_deadline")
        private Date activityDateDeadline;
    

    
        private List<AccountMoveLine> invoiceLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("invoice_line_ids")
        private List<Integer> invoiceLineIds;
    

    
        @JsonProperty("activity_state")
        private Object activityState;
    

    
        @JsonProperty("message_has_error_counter")
        private int messageHasErrorCounter;
    

    
        @JsonProperty("purchase_order_count")
        private int purchaseOrderCount;
    

    
        @JsonProperty("tax_country_code")
        private String taxCountryCode;
    

    
        @JsonProperty("amount_total_signed")
        private Object amountTotalSigned;
    

    
        @JsonProperty("state")
        private Object state;
    

    
        @JsonProperty("id")
        private int id;
    

    
        private List<AccountMove> taxCashBasisCreatedMoveIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("tax_cash_basis_created_move_ids")
        private List<Integer> taxCashBasisCreatedMoveIds;
    

    
        @JsonProperty("tax_calculation_rounding_method")
        private Object taxCalculationRoundingMethod;
    

    
        @JsonProperty("amount_residual")
        private Object amountResidual;
    

    
        private List<AccountAnalyticLine> timesheetIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticLine")
        @OdooModel("account.analytic.AccountAnalyticLine")
        @JsonProperty("timesheet_ids")
        private List<Integer> timesheetIds;
    

    
        @JsonProperty("is_purchase_matched")
        private boolean isIsPurchaseMatched;
    

    
        @JsonProperty("message_attachment_count")
        private int messageAttachmentCount;
    

    
        private List<AccountJournal> suitableJournalIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("suitable_journal_ids")
        private List<Integer> suitableJournalIds;
    

    
        @JsonProperty("quick_edit_total_amount")
        private Object quickEditTotalAmount;
    

    
        private AccountJournalGroup journalGroupIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.journal.AccountJournalGroup")
        @OdooModel("account.journal.AccountJournalGroup")
        @JsonProperty("journal_group_id")
        private OdooId journalGroupId;
    

    
        @JsonProperty("is_manually_modified")
        private boolean isIsManuallyModified;
    

    
        private AccountBankStatement statementIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.AccountBankStatement")
        @OdooModel("account.bank.AccountBankStatement")
        @JsonProperty("statement_id")
        private OdooId statementId;
    

    
        @JsonProperty("payment_reference")
        private String paymentReference;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("timesheet_total_duration")
        private int timesheetTotalDuration;
    

    
        @JsonProperty("access_token")
        private String accessToken;
    

    
        @JsonProperty("access_warning")
        private Object accessWarning;
    

    
        private List<AccountMoveLine> lineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
        @JsonProperty("line_ids")
        private List<Integer> lineIds;
    

    
        private AccountBankStatementLine statementLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
        @JsonProperty("statement_line_id")
        private OdooId statementLineId;
    

    
        @JsonProperty("auto_post")
        private Object autoPost;
    

    
        private AccountPartialReconcile taxCashBasisRecIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.partial.AccountPartialReconcile")
        @OdooModel("account.partial.AccountPartialReconcile")
        @JsonProperty("tax_cash_basis_rec_id")
        private OdooId taxCashBasisRecId;
    

    
        private ResUsers userIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("user_id")
        private OdooId userId;
    

    
        @JsonProperty("always_tax_exigible")
        private boolean isAlwaysTaxExigible;
    

    
        @JsonProperty("taxes_legal_notes")
        private Object taxesLegalNotes;
    

    
        @JsonProperty("abnormal_amount_warning")
        private Object abnormalAmountWarning;
    

    
        @JsonProperty("invoice_pdf_report_file")
        private Object invoicePdfReportFile;
    

    
        private AccountCashRounding invoiceCashRoundingIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.cash.AccountCashRounding")
        @OdooModel("account.cash.AccountCashRounding")
        @JsonProperty("invoice_cash_rounding_id")
        private OdooId invoiceCashRoundingId;
    

    
        private ResPartner bankPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("bank_partner_id")
        private OdooId bankPartnerId;
    

    
        @JsonProperty("payment_count")
        private int paymentCount;
    

    
        @JsonProperty("message_is_follower")
        private boolean isMessageIsFollower;
    

    
        private List<AccountPayment> matchedPaymentIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("matched_payment_ids")
        private List<Integer> matchedPaymentIds;
    

    
        @JsonProperty("auto_post_until")
        private Date autoPostUntil;
    

    
        @JsonProperty("partner_credit")
        private Object partnerCredit;
    

    
        @JsonProperty("show_commercial_partner_warning")
        private boolean isShowCommercialPartnerWarning;
    

    
        @JsonProperty("move_type")
        private Object moveType;
    

    
        private AccountPayment originPaymentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("origin_payment_id")
        private OdooId originPaymentId;
    

    
        private ResUsers invoiceUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("invoice_user_id")
        private OdooId invoiceUserId;
    

    
        @JsonProperty("invoice_filter_type_domain")
        private String invoiceFilterTypeDomain;
    

    
        @JsonProperty("ubl_cii_xml_file")
        private Object ublCiiXmlFile;
    

    
        @JsonProperty("secure_sequence_number")
        private int secureSequenceNumber;
    

    
        @JsonProperty("invoice_date")
        private Date invoiceDate;
    

    
        @JsonProperty("is_being_sent")
        private boolean isIsBeingSent;
    

    
        @JsonProperty("needed_terms_dirty")
        private boolean isNeededTermsDirty;
    

    
        private AccountIncoterms invoiceIncotermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountIncoterms")
        @OdooModel("account.AccountIncoterms")
        @JsonProperty("invoice_incoterm_id")
        private OdooId invoiceIncotermId;
    

    
        @JsonProperty("amount_tax")
        private Object amountTax;
    

    
        private AccountPaymentMethodLine preferredPaymentMethodLineIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.method.AccountPaymentMethodLine")
        @OdooModel("account.payment.method.AccountPaymentMethodLine")
        @JsonProperty("preferred_payment_method_line_id")
        private OdooId preferredPaymentMethodLineId;
    

    
        @JsonProperty("amount_untaxed")
        private Object amountUntaxed;
    

    
        private ResPartner commercialPartnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("commercial_partner_id")
        private OdooId commercialPartnerId;
    

    
        @JsonProperty("invoice_source_email")
        private String invoiceSourceEmail;
    

    
        @JsonProperty("show_payment_term_details")
        private boolean isShowPaymentTermDetails;
    

    
        private ResCompany companyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_id")
        private OdooId companyId;
    

    
        private AccountMove reversedEntryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("reversed_entry_id")
        private OdooId reversedEntryId;
    

    
        @JsonProperty("message_has_sms_error")
        private boolean isMessageHasSmsError;
    

    
        @JsonProperty("qr_code_method")
        private Object qrCodeMethod;
    

    
        @JsonProperty("sequence_number")
        private int sequenceNumber;
    

    
        @JsonProperty("invoice_payments_widget")
        private Object invoicePaymentsWidget;
    

    
        @JsonProperty("sale_order_count")
        private int saleOrderCount;
    

    
        @JsonProperty("invoice_origin")
        private String invoiceOrigin;
    

    
        @JsonProperty("amount_tax_signed")
        private Object amountTaxSigned;
    

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("timesheet_count")
        private int timesheetCount;
    

    
        @JsonProperty("type_name")
        private String typeName;
    

    
        @JsonProperty("amount_paid")
        private Object amountPaid;
    

    
        private List<ResPartner> messagePartnerIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("message_partner_ids")
        private List<Integer> messagePartnerIds;
    

    
        private AccountPaymentTerm invoicePaymentTermIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
        @JsonProperty("invoice_payment_term_id")
        private OdooId invoicePaymentTermId;
    

    
        @JsonProperty("need_cancel_request")
        private boolean isNeedCancelRequest;
    

    
        @JsonProperty("show_reset_to_draft_button")
        private boolean isShowResetToDraftButton;
    

    
        @JsonProperty("amount_total_in_currency_signed")
        private Object amountTotalInCurrencySigned;
    

    
        @JsonProperty("quick_encoding_vals")
        private Object quickEncodingVals;
    

    
        @JsonProperty("purchase_order_name")
        private String purchaseOrderName;
    

    
        @JsonProperty("activity_exception_decoration")
        private Object activityExceptionDecoration;
    

    
        @JsonProperty("ref")
        private String ref;
    

    
        @JsonProperty("status_in_payment")
        private Object statusInPayment;
    

    
        @JsonProperty("show_delivery_date")
        private boolean isShowDeliveryDate;
    

    
        @JsonProperty("amount_untaxed_signed")
        private Object amountUntaxedSigned;
    

    
        @JsonProperty("has_message")
        private boolean isHasMessage;
    

    
        private ResPartnerBank partnerBankIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
        @JsonProperty("partner_bank_id")
        private OdooId partnerBankId;
    

    
        @JsonProperty("payment_term_details")
        private Object paymentTermDetails;
    

    
        @JsonProperty("checked")
        private boolean isChecked;
    

    
        @JsonProperty("has_reconciled_entries")
        private boolean isHasReconciledEntries;
    

    
        @JsonProperty("invoice_currency_rate")
        private double invoiceCurrencyRate;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("payment_state")
        private Object paymentState;
    

    
        @JsonProperty("quick_edit_mode")
        private boolean isQuickEditMode;
    

    
        @JsonProperty("sending_data")
        private Object sendingData;
    

    
        private ResUsers activityUserIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("activity_user_id")
        private OdooId activityUserId;
    

    
        @JsonProperty("show_name_warning")
        private boolean isShowNameWarning;
    

    
        @JsonProperty("move_sent_values")
        private Object moveSentValues;
    

    
        @JsonProperty("activity_exception_icon")
        private String activityExceptionIcon;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        @JsonProperty("country_code")
        private String countryCode;
    

    
        @JsonProperty("delivery_date")
        private Date deliveryDate;
    

    
        @JsonProperty("highest_name")
        private String highestName;
    

    
        @JsonProperty("hide_post_button")
        private boolean isHidePostButton;
    

    
        @JsonProperty("tax_totals")
        private Object taxTotals;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private AccountMove taxCashBasisOriginMoveIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("tax_cash_basis_origin_move_id")
        private OdooId taxCashBasisOriginMoveId;
    

    
        @JsonProperty("secured")
        private boolean isSecured;
    

    
        private ResPartner partnerShippingIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_shipping_id")
        private OdooId partnerShippingId;
    

    
        @JsonProperty("show_discount_details")
        private boolean isShowDiscountDetails;
    

    
        @JsonProperty("invoice_has_outstanding")
        private boolean isInvoiceHasOutstanding;
    

    
        @JsonProperty("partner_credit_warning")
        private Object partnerCreditWarning;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("posted_before")
        private boolean isPostedBefore;
    

    
        @JsonProperty("needed_terms")
        private Object neededTerms;
    

    
        @JsonProperty("display_qr_code")
        private boolean isDisplayQrCode;
    

    
        private AccountFiscalPosition fiscalPositionIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
        @JsonProperty("fiscal_position_id")
        private OdooId fiscalPositionId;
    

    
        @JsonProperty("transaction_count")
        private int transactionCount;
    

    
        @JsonProperty("company_price_include")
        private Object companyPriceInclude;
    

    
        @JsonProperty("my_activity_date_deadline")
        private Date myActivityDateDeadline;
    

    
        private List<AccountPayment> paymentIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountPayment")
        @OdooModel("account.AccountPayment")
        @JsonProperty("payment_ids")
        private List<Integer> paymentIds;
    

    
        private ResCurrency companyCurrencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("company_currency_id")
        private OdooId companyCurrencyId;
    

    
        @JsonProperty("next_payment_date")
        private Date nextPaymentDate;
    

    
        private ResPartner partnerIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResPartner")
        @OdooModel("res.ResPartner")
        @JsonProperty("partner_id")
        private OdooId partnerId;
    

    
        @JsonProperty("incoterm_location")
        private String incotermLocation;
    

    
        @JsonProperty("display_inactive_currency_warning")
        private boolean isDisplayInactiveCurrencyWarning;
    

    
        private List<AccountMove> reversalMoveIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("reversal_move_ids")
        private List<Integer> reversalMoveIds;
    

    
        @JsonProperty("made_sequence_gap")
        private boolean isMadeSequenceGap;
    

    
        private AccountMove invoiceVendorBillIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountMove")
        @OdooModel("account.AccountMove")
        @JsonProperty("invoice_vendor_bill_id")
        private OdooId invoiceVendorBillId;
    

    
        @JsonProperty("show_update_fpos")
        private boolean isShowUpdateFpos;
    

    
        private ResCountry taxCountryIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCountry")
        @OdooModel("res.ResCountry")
        @JsonProperty("tax_country_id")
        private OdooId taxCountryId;
    

    
        private List<AccountBankStatementLine> statementLineIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.bank.statement.AccountBankStatementLine")
        @OdooModel("account.bank.statement.AccountBankStatementLine")
        @JsonProperty("statement_line_ids")
        private List<Integer> statementLineIds;
    

    
        private AccountJournal journalIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountJournal")
        @OdooModel("account.AccountJournal")
        @JsonProperty("journal_id")
        private OdooId journalId;
    

    
        @JsonProperty("amount_untaxed_in_currency_signed")
        private Object amountUntaxedInCurrencySigned;
    

    
        @JsonProperty("activity_type_icon")
        private String activityTypeIcon;
    

    
        @JsonProperty("sequence_prefix")
        private String sequencePrefix;
    

    
        @JsonProperty("l10n_ch_is_qr_valid")
        private boolean isL10nChIsQrValid;
    

    
        @JsonProperty("access_url")
        private String accessUrl;
    

    
        @JsonProperty("amount_residual_signed")
        private Object amountResidualSigned;
    

    
        @JsonProperty("invoice_partner_display_name")
        private String invoicePartnerDisplayName;
    

    
        @JsonProperty("message_has_error")
        private boolean isMessageHasError;
    

    
        @JsonProperty("tax_lock_date_message")
        private String taxLockDateMessage;
    

    
        @JsonProperty("message_needaction")
        private boolean isMessageNeedaction;
    

    
        @JsonProperty("activity_summary")
        private String activitySummary;
    

    
        @JsonProperty("narration")
        private Object narration;
    

    
        @JsonProperty("message_needaction_counter")
        private int messageNeedactionCounter;
    

    
        @JsonProperty("is_move_sent")
        private boolean isIsMoveSent;
    

    
        private ResCurrency currencyIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCurrency")
        @OdooModel("res.ResCurrency")
        @JsonProperty("currency_id")
        private OdooId currencyId;
    

    
        @JsonProperty("abnormal_date_warning")
        private Object abnormalDateWarning;
    

    
        @JsonProperty("invoice_outstanding_credits_debits_widget")
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

    public boolean getIsIsStorno() {
        return isIsStorno;
    }

    public Date getInvoiceDateDue() {
        return invoiceDateDue;
    }

    public Object getAmountTotal() {
        return amountTotal;
    }

    public int getDirectionSign() {
        return directionSign;
    }

    public Date getActivityDateDeadline() {
        return activityDateDeadline;
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

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public int getPurchaseOrderCount() {
        return purchaseOrderCount;
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

    public List<AccountAnalyticLine> getTimesheetIdsAsList() {
        return timesheetIdsAsList;
    }

    public List<Integer> getTimesheetIds() {
        return timesheetIds;
    }

    public boolean getIsIsPurchaseMatched() {
        return isIsPurchaseMatched;
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

    public AccountJournalGroup getJournalGroupIdAsObject() {
        return journalGroupIdAsObject;
    }

    public OdooId getJournalGroupId() {
        return journalGroupId;
    }

    public boolean getIsIsManuallyModified() {
        return isIsManuallyModified;
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

    public Object getTaxesLegalNotes() {
        return taxesLegalNotes;
    }

    public Object getAbnormalAmountWarning() {
        return abnormalAmountWarning;
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

    public int getPaymentCount() {
        return paymentCount;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public List<AccountPayment> getMatchedPaymentIdsAsList() {
        return matchedPaymentIdsAsList;
    }

    public List<Integer> getMatchedPaymentIds() {
        return matchedPaymentIds;
    }

    public Date getAutoPostUntil() {
        return autoPostUntil;
    }

    public Object getPartnerCredit() {
        return partnerCredit;
    }

    public boolean getIsShowCommercialPartnerWarning() {
        return isShowCommercialPartnerWarning;
    }

    public Object getMoveType() {
        return moveType;
    }

    public AccountPayment getOriginPaymentIdAsObject() {
        return originPaymentIdAsObject;
    }

    public OdooId getOriginPaymentId() {
        return originPaymentId;
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

    public Date getInvoiceDate() {
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

    public AccountPaymentMethodLine getPreferredPaymentMethodLineIdAsObject() {
        return preferredPaymentMethodLineIdAsObject;
    }

    public OdooId getPreferredPaymentMethodLineId() {
        return preferredPaymentMethodLineId;
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

    public int getSequenceNumber() {
        return sequenceNumber;
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

    public Object getAmountTaxSigned() {
        return amountTaxSigned;
    }

    public Date getDate() {
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

    public Object getQuickEncodingVals() {
        return quickEncodingVals;
    }

    public String getPurchaseOrderName() {
        return purchaseOrderName;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public String getRef() {
        return ref;
    }

    public Object getStatusInPayment() {
        return statusInPayment;
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

    public ResPartnerBank getPartnerBankIdAsObject() {
        return partnerBankIdAsObject;
    }

    public OdooId getPartnerBankId() {
        return partnerBankId;
    }

    public Object getPaymentTermDetails() {
        return paymentTermDetails;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public boolean getIsHasReconciledEntries() {
        return isHasReconciledEntries;
    }

    public double getInvoiceCurrencyRate() {
        return invoiceCurrencyRate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getPaymentState() {
        return paymentState;
    }

    public boolean getIsQuickEditMode() {
        return isQuickEditMode;
    }

    public Object getSendingData() {
        return sendingData;
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

    public Object getMoveSentValues() {
        return moveSentValues;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Date getDeliveryDate() {
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

    public AccountMove getTaxCashBasisOriginMoveIdAsObject() {
        return taxCashBasisOriginMoveIdAsObject;
    }

    public OdooId getTaxCashBasisOriginMoveId() {
        return taxCashBasisOriginMoveId;
    }

    public boolean getIsSecured() {
        return isSecured;
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

    public int getTransactionCount() {
        return transactionCount;
    }

    public Object getCompanyPriceInclude() {
        return companyPriceInclude;
    }

    public Date getMyActivityDateDeadline() {
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

    public Date getNextPaymentDate() {
        return nextPaymentDate;
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

    public List<AccountMove> getReversalMoveIdsAsList() {
        return reversalMoveIdsAsList;
    }

    public List<Integer> getReversalMoveIds() {
        return reversalMoveIds;
    }

    public boolean getIsMadeSequenceGap() {
        return isMadeSequenceGap;
    }

    public AccountMove getInvoiceVendorBillIdAsObject() {
        return invoiceVendorBillIdAsObject;
    }

    public OdooId getInvoiceVendorBillId() {
        return invoiceVendorBillId;
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

    public Object getAmountUntaxedInCurrencySigned() {
        return amountUntaxedInCurrencySigned;
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

    public boolean getIsMessageHasError() {
        return isMessageHasError;
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

    public Object getAbnormalDateWarning() {
        return abnormalDateWarning;
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

    public void setIsIsStorno(boolean isIsStorno) {
        this.isIsStorno = isIsStorno;
    }

    public void setInvoiceDateDue(Date invoiceDateDue) {
        this.invoiceDateDue = invoiceDateDue;
    }

    public void setAmountTotal(Object amountTotal) {
        this.amountTotal = amountTotal;
    }

    public void setDirectionSign(int directionSign) {
        this.directionSign = directionSign;
    }

    public void setActivityDateDeadline(Date activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
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

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setPurchaseOrderCount(int purchaseOrderCount) {
        this.purchaseOrderCount = purchaseOrderCount;
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

    public void setTimesheetIdsAsList(List<AccountAnalyticLine> timesheetIdsAsList) {
        this.timesheetIdsAsList = timesheetIdsAsList;
    }

    public void setTimesheetIds(List<Integer> timesheetIds) {
        this.timesheetIds = timesheetIds;
    }

    public void setIsIsPurchaseMatched(boolean isIsPurchaseMatched) {
        this.isIsPurchaseMatched = isIsPurchaseMatched;
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

    public void setJournalGroupIdAsObject(AccountJournalGroup journalGroupIdAsObject) {
        this.journalGroupIdAsObject = journalGroupIdAsObject;
    }

    public void setJournalGroupId(OdooId journalGroupId) {
        this.journalGroupId = journalGroupId;
    }

    public void setIsIsManuallyModified(boolean isIsManuallyModified) {
        this.isIsManuallyModified = isIsManuallyModified;
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

    public void setTaxesLegalNotes(Object taxesLegalNotes) {
        this.taxesLegalNotes = taxesLegalNotes;
    }

    public void setAbnormalAmountWarning(Object abnormalAmountWarning) {
        this.abnormalAmountWarning = abnormalAmountWarning;
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

    public void setPaymentCount(int paymentCount) {
        this.paymentCount = paymentCount;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setMatchedPaymentIdsAsList(List<AccountPayment> matchedPaymentIdsAsList) {
        this.matchedPaymentIdsAsList = matchedPaymentIdsAsList;
    }

    public void setMatchedPaymentIds(List<Integer> matchedPaymentIds) {
        this.matchedPaymentIds = matchedPaymentIds;
    }

    public void setAutoPostUntil(Date autoPostUntil) {
        this.autoPostUntil = autoPostUntil;
    }

    public void setPartnerCredit(Object partnerCredit) {
        this.partnerCredit = partnerCredit;
    }

    public void setIsShowCommercialPartnerWarning(boolean isShowCommercialPartnerWarning) {
        this.isShowCommercialPartnerWarning = isShowCommercialPartnerWarning;
    }

    public void setMoveType(Object moveType) {
        this.moveType = moveType;
    }

    public void setOriginPaymentIdAsObject(AccountPayment originPaymentIdAsObject) {
        this.originPaymentIdAsObject = originPaymentIdAsObject;
    }

    public void setOriginPaymentId(OdooId originPaymentId) {
        this.originPaymentId = originPaymentId;
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

    public void setInvoiceDate(Date invoiceDate) {
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

    public void setPreferredPaymentMethodLineIdAsObject(AccountPaymentMethodLine preferredPaymentMethodLineIdAsObject) {
        this.preferredPaymentMethodLineIdAsObject = preferredPaymentMethodLineIdAsObject;
    }

    public void setPreferredPaymentMethodLineId(OdooId preferredPaymentMethodLineId) {
        this.preferredPaymentMethodLineId = preferredPaymentMethodLineId;
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

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    public void setAmountTaxSigned(Object amountTaxSigned) {
        this.amountTaxSigned = amountTaxSigned;
    }

    public void setDate(Date date) {
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

    public void setQuickEncodingVals(Object quickEncodingVals) {
        this.quickEncodingVals = quickEncodingVals;
    }

    public void setPurchaseOrderName(String purchaseOrderName) {
        this.purchaseOrderName = purchaseOrderName;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setStatusInPayment(Object statusInPayment) {
        this.statusInPayment = statusInPayment;
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

    public void setPartnerBankIdAsObject(ResPartnerBank partnerBankIdAsObject) {
        this.partnerBankIdAsObject = partnerBankIdAsObject;
    }

    public void setPartnerBankId(OdooId partnerBankId) {
        this.partnerBankId = partnerBankId;
    }

    public void setPaymentTermDetails(Object paymentTermDetails) {
        this.paymentTermDetails = paymentTermDetails;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public void setIsHasReconciledEntries(boolean isHasReconciledEntries) {
        this.isHasReconciledEntries = isHasReconciledEntries;
    }

    public void setInvoiceCurrencyRate(double invoiceCurrencyRate) {
        this.invoiceCurrencyRate = invoiceCurrencyRate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPaymentState(Object paymentState) {
        this.paymentState = paymentState;
    }

    public void setIsQuickEditMode(boolean isQuickEditMode) {
        this.isQuickEditMode = isQuickEditMode;
    }

    public void setSendingData(Object sendingData) {
        this.sendingData = sendingData;
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

    public void setMoveSentValues(Object moveSentValues) {
        this.moveSentValues = moveSentValues;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setDeliveryDate(Date deliveryDate) {
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

    public void setTaxCashBasisOriginMoveIdAsObject(AccountMove taxCashBasisOriginMoveIdAsObject) {
        this.taxCashBasisOriginMoveIdAsObject = taxCashBasisOriginMoveIdAsObject;
    }

    public void setTaxCashBasisOriginMoveId(OdooId taxCashBasisOriginMoveId) {
        this.taxCashBasisOriginMoveId = taxCashBasisOriginMoveId;
    }

    public void setIsSecured(boolean isSecured) {
        this.isSecured = isSecured;
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

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public void setCompanyPriceInclude(Object companyPriceInclude) {
        this.companyPriceInclude = companyPriceInclude;
    }

    public void setMyActivityDateDeadline(Date myActivityDateDeadline) {
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

    public void setNextPaymentDate(Date nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
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

    public void setReversalMoveIdsAsList(List<AccountMove> reversalMoveIdsAsList) {
        this.reversalMoveIdsAsList = reversalMoveIdsAsList;
    }

    public void setReversalMoveIds(List<Integer> reversalMoveIds) {
        this.reversalMoveIds = reversalMoveIds;
    }

    public void setIsMadeSequenceGap(boolean isMadeSequenceGap) {
        this.isMadeSequenceGap = isMadeSequenceGap;
    }

    public void setInvoiceVendorBillIdAsObject(AccountMove invoiceVendorBillIdAsObject) {
        this.invoiceVendorBillIdAsObject = invoiceVendorBillIdAsObject;
    }

    public void setInvoiceVendorBillId(OdooId invoiceVendorBillId) {
        this.invoiceVendorBillId = invoiceVendorBillId;
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

    public void setAmountUntaxedInCurrencySigned(Object amountUntaxedInCurrencySigned) {
        this.amountUntaxedInCurrencySigned = amountUntaxedInCurrencySigned;
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

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
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

    public void setAbnormalDateWarning(Object abnormalDateWarning) {
        this.abnormalDateWarning = abnormalDateWarning;
    }

    public void setInvoiceOutstandingCreditsDebitsWidget(Object invoiceOutstandingCreditsDebitsWidget) {
        this.invoiceOutstandingCreditsDebitsWidget = invoiceOutstandingCreditsDebitsWidget;
    }



}