
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

package ch.helvethink.odoo4java.test.ng.res;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.test.ng.resource.Resource;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition;
import ch.helvethink.odoo4java.test.ng.auth_totp.Auth_totpDevice;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerIndustry;
import ch.helvethink.odoo4java.test.ng.res.country.ResCountryState;
import ch.helvethink.odoo4java.test.ng.mail.MailActivity;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank;
import ch.helvethink.odoo4java.test.ng.microsoft.calendar.MicrosoftCalendarCredentials;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.gamification.karma.GamificationKarmaTracking;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import ch.helvethink.odoo4java.test.ng.payment.PaymentToken;
import ch.helvethink.odoo4java.test.ng.gamification.karma.GamificationKarmaRank;
import ch.helvethink.odoo4java.test.ng.ir.actions.Actions;
import ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerTitle;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.resume.HrResumeLine;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm;
import ch.helvethink.odoo4java.test.ng.product.ProductPricelist;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor;
import ch.helvethink.odoo4java.test.ng.res.users.ResUsersLog;
import ch.helvethink.odoo4java.test.ng.res.users.ResUsersApikeys;
import ch.helvethink.odoo4java.test.ng.res.users.ResUsersSettings;
import ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeSkill;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.test.ng.crm.team.CrmTeamMember;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationGoal;
import ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser;;

@OdooObject("res.users")
public class ResUsers implements OdooObj {

    
    private Date writeDate;

    
    private ResCountryState privateStateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId privateStateId;

    
    private ResPartnerBank employeeBankAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId employeeBankAccountId;

    
    private List<MailMessage> starredMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> starredMessageIds;

    
    private String websiteMetaTitle;

    
    private Object avatar1920;

    
    private List<AccountMove> invoiceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private List<Integer> invoiceIds;

    
    private String workPhone;

    
    private Object spouseBirthdate;

    
    private Object activityDateDeadline;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private Object selGroups141516;

    
    private boolean isDisplayExtraHours;

    
    private Object activityState;

    
    private String password;

    
    private Actions actionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.Actions")
        @OdooModel("ir.actions.Actions")
    
    private OdooId actionId;

    
    private GamificationKarmaRank nextRankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.karma.GamificationKarmaRank")
        @OdooModel("gamification.karma.GamificationKarmaRank")
    
    private OdooId nextRankId;

    
    private String identificationId;

    
    private Object state;

    
    private HrWorkLocation fridayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId fridayLocationId;

    
    private List<Resource> resourceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.Resource")
        @OdooModel("resource.Resource")
    
    private List<Integer> resourceIds;

    
    private int journalItemCount;

    
    private boolean isIsSystem;

    
    private String fiscalCountryCodes;

    
    private Object creditToInvoice;

    
    private List<CrmTeamMember> crmTeamMemberIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.team.CrmTeamMember")
        @OdooModel("crm.team.CrmTeamMember")
    
    private List<Integer> crmTeamMemberIds;

    
    private Object selGroups24;

    
    private HrWorkLocation saturdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId saturdayLocationId;

    
    private boolean isActive;

    
    private boolean isIsBlacklisted;

    
    private String spouseCompleteName;

    
    private String permitNo;

    
    private AccountPaymentTerm propertyPaymentTermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId propertyPaymentTermId;

    
    private Object selGroups2830;

    
    private boolean isRequestOvertime;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String companyName;

    
    private ResourceCalendar employeeResourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId employeeResourceCalendarId;

    
    private double daysSalesOutstanding;

    
    private int slideChannelCompanyCount;

    
    private Object notificationType;

    
    private Object odoobotState;

    
    private List<ResCompany> companyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> companyIds;

    
    private String websiteMetaKeywords;

    
    private Object selGroups4647;

    
    private String imStatus;

    
    private GamificationKarmaRank rankIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.karma.GamificationKarmaRank")
        @OdooModel("gamification.karma.GamificationKarmaRank")
    
    private OdooId rankId;

    
    private boolean isMessageIsFollower;

    
    private ResUsers leaveManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId leaveManagerId;

    
    private boolean isTotpEnabled;

    
    private Object avatar1024;

    
    private String phoneMobileSearch;

    
    private Object ublCiiFormat;

    
    private List<Auth_totpDevice> totpTrustedDeviceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.auth_totp.Auth_totpDevice")
        @OdooModel("auth_totp.Auth_totpDevice")
    
    private List<Integer> totpTrustedDeviceIds;

    
    private int bronzeBadge;

    
    private ResUsers expenseManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId expenseManagerId;

    
    private double totalOvertime;

    
    private List<ResPartnerCategory> categoryIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerCategory")
        @OdooModel("res.partner.ResPartnerCategory")
    
    private List<Integer> categoryId;

    
    private ResCountry countryOfBirthAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryOfBirth;

    
    private Object hrIconDisplay;

    
    private String signupUrl;

    
    private AccountFiscalPosition propertyAccountPositionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.fiscal.AccountFiscalPosition")
        @OdooModel("account.fiscal.AccountFiscalPosition")
    
    private OdooId propertyAccountPositionId;

    
    private String email;

    
    private Object selGroups36;

    
    private Object selGroups35;

    
    private List<HrResumeLine> resumeLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.resume.HrResumeLine")
        @OdooModel("hr.resume.HrResumeLine")
    
    private List<Integer> resumeLineIds;

    
    private int karma;

    
    private String website;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private List<AccountAnalyticAccount> contractIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private List<Integer> contractIds;

    
    private String privateStreet2;

    
    private String companyRegistry;

    
    private List<ResUsers> userIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> userIds;

    
    private boolean isMessageHasSmsError;

    
    private int paymentTokenCount;

    
    private List<PaymentToken> paymentTokenIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.payment.PaymentToken")
        @OdooModel("payment.PaymentToken")
    
    private List<Integer> paymentTokenIds;

    
    private MailActivityType activityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId activityTypeId;

    
    private CrmTeam saleTeamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId saleTeamId;

    
    private Date signupExpiration;

    
    private String websiteUrl;

    
    private boolean isIsPublic;

    
    private boolean isIsCompany;

    
    private int companiesCount;

    
    private boolean isIsSeoOptimized;

    
    private Object companyType;

    
    private Object saleWarn;

    
    private Date microsoftLastSyncDate;

    
    private List<GamificationKarmaTracking> karmaTrackingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.karma.GamificationKarmaTracking")
        @OdooModel("gamification.karma.GamificationKarmaTracking")
    
    private List<Integer> karmaTrackingIds;

    
    private Object tz;

    
    private MicrosoftCalendarCredentials microsoftCalendarAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.microsoft.calendar.MicrosoftCalendarCredentials")
        @OdooModel("microsoft.calendar.MicrosoftCalendarCredentials")
    
    private OdooId microsoftCalendarAccountId;

    
    private int rulesCount;

    
    private Object privateLang;

    
    private ResUsersSettings resUsersSettingsIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.users.ResUsersSettings")
        @OdooModel("res.users.ResUsersSettings")
    
    private OdooId resUsersSettingsId;

    
    private Object activityExceptionDecoration;

    
    private boolean isPartnerShare;

    
    private int taskCount;

    
    private Object selGroups6162;

    
    private List<MailActivity> activityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailActivity")
        @OdooModel("mail.MailActivity")
    
    private List<Integer> activityIds;

    
    private String ref;

    
    private Object websiteShortDescription;

    
    private String tzOffset;

    
    private String commercialCompanyName;

    
    private boolean isInGroup73;

    
    private boolean isInGroup72;

    
    private List<HrEmployeeCategory> categoryIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeCategory")
        @OdooModel("hr.employee.HrEmployeeCategory")
    
    private List<Integer> categoryIds;

    
    private String jobTitle;

    
    private String barcode;

    
    private List<GamificationGoal> goalIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationGoal")
        @OdooModel("gamification.GamificationGoal")
    
    private List<Integer> goalIds;

    
    private int targetSalesInvoiced;

    
    private ProductPricelist propertyProductPricelistAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.ProductPricelist")
        @OdooModel("product.ProductPricelist")
    
    private OdooId propertyProductPricelist;

    
    private String hoursLastMonthDisplay;

    
    private int opportunityCount;

    
    private List<HrEmployee> employeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> employeeIds;

    
    private boolean isActivePartner;

    
    private ResPartner addressIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId addressId;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String allocationDisplay;

    
    private boolean isHasUnreconciledEntries;

    
    private String countryCode;

    
    private boolean isInGroup68;

    
    private List<WebsiteVisitor> visitorIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor")
        @OdooModel("website.WebsiteVisitor")
    
    private List<Integer> visitorIds;

    
    private boolean isInGroup67;

    
    private boolean isInGroup66;

    
    private boolean isInGroup65;

    
    private boolean isInGroup64;

    
    private String name;

    
    private boolean isInGroup63;

    
    private ResPartner sameVatPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId sameVatPartnerId;

    
    private Object currentLeaveState;

    
    private Object trust;

    
    private String workEmail;

    
    private ResPartnerIndustry industryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerIndustry")
        @OdooModel("res.partner.ResPartnerIndustry")
    
    private OdooId industryId;

    
    private Object image256;

    
    private int color;

    
    private Object debitLimit;

    
    private boolean isInGroup6;

    
    private boolean isInGroup7;

    
    private boolean isInGroup8;

    
    private Object myActivityDateDeadline;

    
    private boolean isInGroup9;

    
    private Object avatar512;

    
    private ResPartnerTitle titleAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerTitle")
        @OdooModel("res.partner.ResPartnerTitle")
    
    private OdooId title;

    
    private double allocationCount;

    
    private boolean isInGroup3;

    
    private ResUsers attendanceManagerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId attendanceManagerId;

    
    private List<ResGroups> groupsIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupsId;

    
    private boolean isInGroup5;

    
    private String emergencyPhone;

    
    private int goldBadge;

    
    private Account propertyAccountPayableIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountPayableId;

    
    private String completeName;

    
    private boolean isInGroup58;

    
    private Object lastActivity;

    
    private boolean isInGroup57;

    
    private Object selGroups74;

    
    private String street;

    
    private Date calendarLastNotifAck;

    
    private boolean isInGroup52;

    
    private boolean isInGroup51;

    
    private int silverBadge;

    
    private String contactAddress;

    
    private int loyaltyCardCount;

    
    private Object image1024;

    
    private int targetSalesDone;

    
    private double partnerLatitude;

    
    private String mobile;

    
    private HrWorkLocation thursdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId thursdayLocationId;

    
    private String privatePhone;

    
    private boolean isSignupValid;

    
    private String signupType;

    
    private boolean isInGroup39;

    
    private Object marital;

    
    private Object saleWarnMsg;

    
    private Object selGroups5556;

    
    private Object userGroupWarning;

    
    private String signupToken;

    
    private Object selGroups697071;

    
    private String newPassword;

    
    private String studyField;

    
    private Object websiteDescription;

    
    private String seoName;

    
    private boolean isInGroup40;

    
    private Object comment;

    
    private int supplierRank;

    
    private List<SlideChannel> slideChannelCompletedIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> slideChannelCompletedIds;

    
    private int employeesCount;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private Object image128;

    
    private ResPartner sameCompanyRegistryPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId sameCompanyRegistryPartnerId;

    
    private List<ResPartnerBank> bankIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private List<Integer> bankIds;

    
    private HrWorkLocation tuesdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId tuesdayLocationId;

    
    private String privateCity;

    
    private Object selGroups5960;

    
    private boolean isIsPublished;

    
    private Date microsoftCalendarTokenValidity;

    
    private Date loginDate;

    
    private Object selGroups434445;

    
    private Object type;

    
    private Object peppolEas;

    
    private int targetSalesWon;

    
    private String passportId;

    
    private int slideChannelCount;

    
    private CalendarEvent activityCalendarEventIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private OdooId activityCalendarEventId;

    
    private boolean isInGroup38;

    
    private int messageHasErrorCounter;

    
    private boolean isInGroup37;

    
    private boolean isInGroup34;

    
    private int children;

    
    private boolean isInGroup33;

    
    private boolean isInGroup32;

    
    private boolean isInGroup31;

    
    private int id;

    
    private int messageBounce;

    
    private ResCountryState stateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.country.ResCountryState")
        @OdooModel("res.country.ResCountryState")
    
    private OdooId stateId;

    
    private int bankAccountCount;

    
    private String privateEmail;

    
    private int employeeCount;

    
    private String zip;

    
    private List<DiscussChannel> channelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.DiscussChannel")
        @OdooModel("discuss.DiscussChannel")
    
    private List<Integer> channelIds;

    
    private int messageAttachmentCount;

    
    private String ssnid;

    
    private boolean isMicrosoftSynchronizationStopped;

    
    private boolean isIsAbsent;

    
    private String vat;

    
    private HrEmployee employeeParentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeParentId;

    
    private Object image1920;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<SaleOrder> saleOrderIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private List<Integer> saleOrderIds;

    
    private boolean isInGroup19;

    
    private boolean isInGroup18;

    
    private boolean isInGroup17;

    
    private boolean isInGroup26;

    
    private Object employeeType;

    
    private boolean isInGroup25;

    
    private boolean isInGroup24;

    
    private boolean isInGroup23;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private String phone;

    
    private String additionalInfo;

    
    private boolean isInGroup22;

    
    private boolean isInGroup21;

    
    private String contactAddressInline;

    
    private boolean isInGroup20;

    
    private String peppolEndpoint;

    
    private HrWorkLocation wednesdayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId wednesdayLocationId;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;

    
    private List<ResUsersSettings> resUsersSettingsIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.users.ResUsersSettings")
        @OdooModel("res.users.ResUsersSettings")
    
    private List<Integer> resUsersSettingsIds;

    
    private Object gender;

    
    private List<ResCompany> refCompanyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> refCompanyIds;

    
    private Object signature;

    
    private String microsoftCalendarToken;

    
    private String city;

    
    private String login;

    
    private List<ResPartner> childIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> childIds;

    
    private String microsoftCalendarSyncToken;

    
    private String vehicle;

    
    private Date lastTimeEntriesChecked;

    
    private boolean isCreateEmployee;

    
    private Object leaveDateTo;

    
    private boolean isInGroup13;

    
    private boolean isInGroup12;

    
    private ResPartner commercialPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId commercialPartnerId;

    
    private boolean isShare;

    
    private boolean isUsePartnerCreditLimit;

    
    private String street2;

    
    private Object debit;

    
    private List<ResUsersLog> logIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.users.ResUsersLog")
        @OdooModel("res.users.ResUsersLog")
    
    private List<Integer> logIds;

    
    private ResourceCalendar resourceCalendarIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.ResourceCalendar")
        @OdooModel("resource.ResourceCalendar")
    
    private OdooId resourceCalendarId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object invoiceWarnMsg;

    
    private List<ResUsersApikeys> apiKeyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.users.ResUsersApikeys")
        @OdooModel("res.users.ResUsersApikeys")
    
    private List<Integer> apiKeyIds;

    
    private boolean isCanEdit;

    
    private boolean isWebsitePublished;

    
    private List<ProjectTask> taskIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private List<Integer> taskIds;

    
    private List<Project> projectIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private List<Integer> projectIds;

    
    private boolean isShowCreditLimit;

    
    private String lastActivityTime;

    
    private int saleOrderCount;

    
    private String websiteMetaOgImg;

    
    private ResPartner selfAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId self;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private boolean isShowLeaves;

    
    private ResPartner workContactIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId workContactId;

    
    private Object date;

    
    private String parentName;

    
    private Date lastCheckOut;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isPhoneBlacklisted;

    
    private ResCountry privateCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId privateCountryId;

    
    private boolean isMobileBlacklisted;

    
    private boolean isOdoobotFailed;

    
    private boolean isEmployee;

    
    private double partnerLongitude;

    
    private Object invoiceWarn;

    
    private Object avatar256;

    
    private int meetingCount;

    
    private String pin;

    
    private boolean isCanPublish;

    
    private boolean isHasMessage;

    
    private String function;

    
    private Date createDate;

    
    private Object credit;

    
    private List<SlideChannel> slideChannelIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private List<Integer> slideChannelIds;

    
    private Object image512;

    
    private String microsoftCalendarRtoken;

    
    private Object selGroups4142;

    
    private String privateStreet;

    
    private ResUsers activityUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId activityUserId;

    
    private Object hrPresenceState;

    
    private HrWorkLocation sundayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId sundayLocationId;

    
    private String displayName;

    
    private String activityExceptionIcon;

    
    private Object avatar128;

    
    private List<CrmLead> opportunityIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private List<Integer> opportunityIds;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private String visaNo;

    
    private Object selGroups5354;

    
    private Object websiteMetaDescription;

    
    private ResPartner parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId parentId;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private Object totalInvoiced;

    
    private String emailNormalized;

    
    private ResCountry employeeCountryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId employeeCountryId;

    
    private double hoursLastMonth;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private Object birthday;

    
    private HrWorkLocation mondayLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId mondayLocationId;

    
    private ResPartnerBank bankAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.partner.ResPartnerBank")
        @OdooModel("res.partner.ResPartnerBank")
    
    private OdooId bankAccountId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String allocationRemainingDisplay;

    
    private int activeLangCount;

    
    private int accessesCount;

    
    private int groupsCount;

    
    private Object selGroups11011;

    
    private Object certificate;

    
    private Object selGroups484950;

    
    private HrEmployee createEmployeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId createEmployeeId;

    
    private List<CrmTeam> crmTeamIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private List<Integer> crmTeamIds;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String studySchool;

    
    private int customerRank;

    
    private String mobilePhone;

    
    private int partnerGid;

    
    private List<HrEmployeeSkill> employeeSkillIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.employee.HrEmployeeSkill")
        @OdooModel("hr.employee.HrEmployeeSkill")
    
    private List<Integer> employeeSkillIds;

    
    private double creditLimit;

    
    private Object lang;

    
    private Date lastCheckIn;

    
    private String emailFormatted;

    
    private String activityTypeIcon;

    
    private Object attendanceState;

    
    private int duplicatedBankAccountPartnersCount;

    
    private Account propertyAccountReceivableIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId propertyAccountReceivableId;

    
    private HrWorkLocation workLocationIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.work.HrWorkLocation")
        @OdooModel("hr.work.HrWorkLocation")
    
    private OdooId workLocationId;

    
    private List<CalendarEvent> meetingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.calendar.CalendarEvent")
        @OdooModel("calendar.CalendarEvent")
    
    private List<Integer> meetingIds;

    
    private String privateZip;

    
    private boolean isPhoneSanitizedBlacklisted;

    
    private List<GamificationBadgeUser> badgeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.badge.GamificationBadgeUser")
        @OdooModel("gamification.badge.GamificationBadgeUser")
    
    private List<Integer> badgeIds;

    
    private Object visaExpire;

    
    private String placeOfBirth;

    
    private HrEmployee coachIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId coachId;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private int kmHomeWork;

    
    private String activitySummary;

    
    private int messageNeedactionCounter;

    
    private AccountPaymentTerm propertySupplierPaymentTermIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.payment.AccountPaymentTerm")
        @OdooModel("account.payment.AccountPaymentTerm")
    
    private OdooId propertySupplierPaymentTermId;

    
    private String phoneSanitized;

    
    private String emergencyContact;

    
    private Object additionalNote;


    public ResUsers() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResCountryState getPrivateStateIdAsObject() {
        return privateStateIdAsObject;
    }

    public OdooId getPrivateStateId() {
        return privateStateId;
    }

    public ResPartnerBank getEmployeeBankAccountIdAsObject() {
        return employeeBankAccountIdAsObject;
    }

    public OdooId getEmployeeBankAccountId() {
        return employeeBankAccountId;
    }

    public List<MailMessage> getStarredMessageIdsAsList() {
        return starredMessageIdsAsList;
    }

    public List<Integer> getStarredMessageIds() {
        return starredMessageIds;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public Object getAvatar1920() {
        return avatar1920;
    }

    public List<AccountMove> getInvoiceIdsAsList() {
        return invoiceIdsAsList;
    }

    public List<Integer> getInvoiceIds() {
        return invoiceIds;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public Object getSpouseBirthdate() {
        return spouseBirthdate;
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

    public Object getSelGroups141516() {
        return selGroups141516;
    }

    public boolean getIsDisplayExtraHours() {
        return isDisplayExtraHours;
    }

    public Object getActivityState() {
        return activityState;
    }

    public String getPassword() {
        return password;
    }

    public Actions getActionIdAsObject() {
        return actionIdAsObject;
    }

    public OdooId getActionId() {
        return actionId;
    }

    public GamificationKarmaRank getNextRankIdAsObject() {
        return nextRankIdAsObject;
    }

    public OdooId getNextRankId() {
        return nextRankId;
    }

    public String getIdentificationId() {
        return identificationId;
    }

    public Object getState() {
        return state;
    }

    public HrWorkLocation getFridayLocationIdAsObject() {
        return fridayLocationIdAsObject;
    }

    public OdooId getFridayLocationId() {
        return fridayLocationId;
    }

    public List<Resource> getResourceIdsAsList() {
        return resourceIdsAsList;
    }

    public List<Integer> getResourceIds() {
        return resourceIds;
    }

    public int getJournalItemCount() {
        return journalItemCount;
    }

    public boolean getIsIsSystem() {
        return isIsSystem;
    }

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public Object getCreditToInvoice() {
        return creditToInvoice;
    }

    public List<CrmTeamMember> getCrmTeamMemberIdsAsList() {
        return crmTeamMemberIdsAsList;
    }

    public List<Integer> getCrmTeamMemberIds() {
        return crmTeamMemberIds;
    }

    public Object getSelGroups24() {
        return selGroups24;
    }

    public HrWorkLocation getSaturdayLocationIdAsObject() {
        return saturdayLocationIdAsObject;
    }

    public OdooId getSaturdayLocationId() {
        return saturdayLocationId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean getIsIsBlacklisted() {
        return isIsBlacklisted;
    }

    public String getSpouseCompleteName() {
        return spouseCompleteName;
    }

    public String getPermitNo() {
        return permitNo;
    }

    public AccountPaymentTerm getPropertyPaymentTermIdAsObject() {
        return propertyPaymentTermIdAsObject;
    }

    public OdooId getPropertyPaymentTermId() {
        return propertyPaymentTermId;
    }

    public Object getSelGroups2830() {
        return selGroups2830;
    }

    public boolean getIsRequestOvertime() {
        return isRequestOvertime;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ResourceCalendar getEmployeeResourceCalendarIdAsObject() {
        return employeeResourceCalendarIdAsObject;
    }

    public OdooId getEmployeeResourceCalendarId() {
        return employeeResourceCalendarId;
    }

    public double getDaysSalesOutstanding() {
        return daysSalesOutstanding;
    }

    public int getSlideChannelCompanyCount() {
        return slideChannelCompanyCount;
    }

    public Object getNotificationType() {
        return notificationType;
    }

    public Object getOdoobotState() {
        return odoobotState;
    }

    public List<ResCompany> getCompanyIdsAsList() {
        return companyIdsAsList;
    }

    public List<Integer> getCompanyIds() {
        return companyIds;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
    }

    public Object getSelGroups4647() {
        return selGroups4647;
    }

    public String getImStatus() {
        return imStatus;
    }

    public GamificationKarmaRank getRankIdAsObject() {
        return rankIdAsObject;
    }

    public OdooId getRankId() {
        return rankId;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getLeaveManagerIdAsObject() {
        return leaveManagerIdAsObject;
    }

    public OdooId getLeaveManagerId() {
        return leaveManagerId;
    }

    public boolean getIsTotpEnabled() {
        return isTotpEnabled;
    }

    public Object getAvatar1024() {
        return avatar1024;
    }

    public String getPhoneMobileSearch() {
        return phoneMobileSearch;
    }

    public Object getUblCiiFormat() {
        return ublCiiFormat;
    }

    public List<Auth_totpDevice> getTotpTrustedDeviceIdsAsList() {
        return totpTrustedDeviceIdsAsList;
    }

    public List<Integer> getTotpTrustedDeviceIds() {
        return totpTrustedDeviceIds;
    }

    public int getBronzeBadge() {
        return bronzeBadge;
    }

    public ResUsers getExpenseManagerIdAsObject() {
        return expenseManagerIdAsObject;
    }

    public OdooId getExpenseManagerId() {
        return expenseManagerId;
    }

    public double getTotalOvertime() {
        return totalOvertime;
    }

    public List<ResPartnerCategory> getCategoryIdAsList() {
        return categoryIdAsList;
    }

    public List<Integer> getCategoryId() {
        return categoryId;
    }

    public ResCountry getCountryOfBirthAsObject() {
        return countryOfBirthAsObject;
    }

    public OdooId getCountryOfBirth() {
        return countryOfBirth;
    }

    public Object getHrIconDisplay() {
        return hrIconDisplay;
    }

    public String getSignupUrl() {
        return signupUrl;
    }

    public AccountFiscalPosition getPropertyAccountPositionIdAsObject() {
        return propertyAccountPositionIdAsObject;
    }

    public OdooId getPropertyAccountPositionId() {
        return propertyAccountPositionId;
    }

    public String getEmail() {
        return email;
    }

    public Object getSelGroups36() {
        return selGroups36;
    }

    public Object getSelGroups35() {
        return selGroups35;
    }

    public List<HrResumeLine> getResumeLineIdsAsList() {
        return resumeLineIdsAsList;
    }

    public List<Integer> getResumeLineIds() {
        return resumeLineIds;
    }

    public int getKarma() {
        return karma;
    }

    public String getWebsite() {
        return website;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public List<AccountAnalyticAccount> getContractIdsAsList() {
        return contractIdsAsList;
    }

    public List<Integer> getContractIds() {
        return contractIds;
    }

    public String getPrivateStreet2() {
        return privateStreet2;
    }

    public String getCompanyRegistry() {
        return companyRegistry;
    }

    public List<ResUsers> getUserIdsAsList() {
        return userIdsAsList;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public int getPaymentTokenCount() {
        return paymentTokenCount;
    }

    public List<PaymentToken> getPaymentTokenIdsAsList() {
        return paymentTokenIdsAsList;
    }

    public List<Integer> getPaymentTokenIds() {
        return paymentTokenIds;
    }

    public MailActivityType getActivityTypeIdAsObject() {
        return activityTypeIdAsObject;
    }

    public OdooId getActivityTypeId() {
        return activityTypeId;
    }

    public CrmTeam getSaleTeamIdAsObject() {
        return saleTeamIdAsObject;
    }

    public OdooId getSaleTeamId() {
        return saleTeamId;
    }

    public Date getSignupExpiration() {
        return signupExpiration;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public boolean getIsIsPublic() {
        return isIsPublic;
    }

    public boolean getIsIsCompany() {
        return isIsCompany;
    }

    public int getCompaniesCount() {
        return companiesCount;
    }

    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public Object getCompanyType() {
        return companyType;
    }

    public Object getSaleWarn() {
        return saleWarn;
    }

    public Date getMicrosoftLastSyncDate() {
        return microsoftLastSyncDate;
    }

    public List<GamificationKarmaTracking> getKarmaTrackingIdsAsList() {
        return karmaTrackingIdsAsList;
    }

    public List<Integer> getKarmaTrackingIds() {
        return karmaTrackingIds;
    }

    public Object getTz() {
        return tz;
    }

    public MicrosoftCalendarCredentials getMicrosoftCalendarAccountIdAsObject() {
        return microsoftCalendarAccountIdAsObject;
    }

    public OdooId getMicrosoftCalendarAccountId() {
        return microsoftCalendarAccountId;
    }

    public int getRulesCount() {
        return rulesCount;
    }

    public Object getPrivateLang() {
        return privateLang;
    }

    public ResUsersSettings getResUsersSettingsIdAsObject() {
        return resUsersSettingsIdAsObject;
    }

    public OdooId getResUsersSettingsId() {
        return resUsersSettingsId;
    }

    public Object getActivityExceptionDecoration() {
        return activityExceptionDecoration;
    }

    public boolean getIsPartnerShare() {
        return isPartnerShare;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public Object getSelGroups6162() {
        return selGroups6162;
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

    public Object getWebsiteShortDescription() {
        return websiteShortDescription;
    }

    public String getTzOffset() {
        return tzOffset;
    }

    public String getCommercialCompanyName() {
        return commercialCompanyName;
    }

    public boolean getIsInGroup73() {
        return isInGroup73;
    }

    public boolean getIsInGroup72() {
        return isInGroup72;
    }

    public List<HrEmployeeCategory> getCategoryIdsAsList() {
        return categoryIdsAsList;
    }

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getBarcode() {
        return barcode;
    }

    public List<GamificationGoal> getGoalIdsAsList() {
        return goalIdsAsList;
    }

    public List<Integer> getGoalIds() {
        return goalIds;
    }

    public int getTargetSalesInvoiced() {
        return targetSalesInvoiced;
    }

    public ProductPricelist getPropertyProductPricelistAsObject() {
        return propertyProductPricelistAsObject;
    }

    public OdooId getPropertyProductPricelist() {
        return propertyProductPricelist;
    }

    public String getHoursLastMonthDisplay() {
        return hoursLastMonthDisplay;
    }

    public int getOpportunityCount() {
        return opportunityCount;
    }

    public List<HrEmployee> getEmployeeIdsAsList() {
        return employeeIdsAsList;
    }

    public List<Integer> getEmployeeIds() {
        return employeeIds;
    }

    public boolean getIsActivePartner() {
        return isActivePartner;
    }

    public ResPartner getAddressIdAsObject() {
        return addressIdAsObject;
    }

    public OdooId getAddressId() {
        return addressId;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public String getAllocationDisplay() {
        return allocationDisplay;
    }

    public boolean getIsHasUnreconciledEntries() {
        return isHasUnreconciledEntries;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean getIsInGroup68() {
        return isInGroup68;
    }

    public List<WebsiteVisitor> getVisitorIdsAsList() {
        return visitorIdsAsList;
    }

    public List<Integer> getVisitorIds() {
        return visitorIds;
    }

    public boolean getIsInGroup67() {
        return isInGroup67;
    }

    public boolean getIsInGroup66() {
        return isInGroup66;
    }

    public boolean getIsInGroup65() {
        return isInGroup65;
    }

    public boolean getIsInGroup64() {
        return isInGroup64;
    }

    public String getName() {
        return name;
    }

    public boolean getIsInGroup63() {
        return isInGroup63;
    }

    public ResPartner getSameVatPartnerIdAsObject() {
        return sameVatPartnerIdAsObject;
    }

    public OdooId getSameVatPartnerId() {
        return sameVatPartnerId;
    }

    public Object getCurrentLeaveState() {
        return currentLeaveState;
    }

    public Object getTrust() {
        return trust;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public ResPartnerIndustry getIndustryIdAsObject() {
        return industryIdAsObject;
    }

    public OdooId getIndustryId() {
        return industryId;
    }

    public Object getImage256() {
        return image256;
    }

    public int getColor() {
        return color;
    }

    public Object getDebitLimit() {
        return debitLimit;
    }

    public boolean getIsInGroup6() {
        return isInGroup6;
    }

    public boolean getIsInGroup7() {
        return isInGroup7;
    }

    public boolean getIsInGroup8() {
        return isInGroup8;
    }

    public Object getMyActivityDateDeadline() {
        return myActivityDateDeadline;
    }

    public boolean getIsInGroup9() {
        return isInGroup9;
    }

    public Object getAvatar512() {
        return avatar512;
    }

    public ResPartnerTitle getTitleAsObject() {
        return titleAsObject;
    }

    public OdooId getTitle() {
        return title;
    }

    public double getAllocationCount() {
        return allocationCount;
    }

    public boolean getIsInGroup3() {
        return isInGroup3;
    }

    public ResUsers getAttendanceManagerIdAsObject() {
        return attendanceManagerIdAsObject;
    }

    public OdooId getAttendanceManagerId() {
        return attendanceManagerId;
    }

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public boolean getIsInGroup5() {
        return isInGroup5;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public int getGoldBadge() {
        return goldBadge;
    }

    public Account getPropertyAccountPayableIdAsObject() {
        return propertyAccountPayableIdAsObject;
    }

    public OdooId getPropertyAccountPayableId() {
        return propertyAccountPayableId;
    }

    public String getCompleteName() {
        return completeName;
    }

    public boolean getIsInGroup58() {
        return isInGroup58;
    }

    public Object getLastActivity() {
        return lastActivity;
    }

    public boolean getIsInGroup57() {
        return isInGroup57;
    }

    public Object getSelGroups74() {
        return selGroups74;
    }

    public String getStreet() {
        return street;
    }

    public Date getCalendarLastNotifAck() {
        return calendarLastNotifAck;
    }

    public boolean getIsInGroup52() {
        return isInGroup52;
    }

    public boolean getIsInGroup51() {
        return isInGroup51;
    }

    public int getSilverBadge() {
        return silverBadge;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public int getLoyaltyCardCount() {
        return loyaltyCardCount;
    }

    public Object getImage1024() {
        return image1024;
    }

    public int getTargetSalesDone() {
        return targetSalesDone;
    }

    public double getPartnerLatitude() {
        return partnerLatitude;
    }

    public String getMobile() {
        return mobile;
    }

    public HrWorkLocation getThursdayLocationIdAsObject() {
        return thursdayLocationIdAsObject;
    }

    public OdooId getThursdayLocationId() {
        return thursdayLocationId;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public boolean getIsSignupValid() {
        return isSignupValid;
    }

    public String getSignupType() {
        return signupType;
    }

    public boolean getIsInGroup39() {
        return isInGroup39;
    }

    public Object getMarital() {
        return marital;
    }

    public Object getSaleWarnMsg() {
        return saleWarnMsg;
    }

    public Object getSelGroups5556() {
        return selGroups5556;
    }

    public Object getUserGroupWarning() {
        return userGroupWarning;
    }

    public String getSignupToken() {
        return signupToken;
    }

    public Object getSelGroups697071() {
        return selGroups697071;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getStudyField() {
        return studyField;
    }

    public Object getWebsiteDescription() {
        return websiteDescription;
    }

    public String getSeoName() {
        return seoName;
    }

    public boolean getIsInGroup40() {
        return isInGroup40;
    }

    public Object getComment() {
        return comment;
    }

    public int getSupplierRank() {
        return supplierRank;
    }

    public List<SlideChannel> getSlideChannelCompletedIdsAsList() {
        return slideChannelCompletedIdsAsList;
    }

    public List<Integer> getSlideChannelCompletedIds() {
        return slideChannelCompletedIds;
    }

    public int getEmployeesCount() {
        return employeesCount;
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

    public ResPartner getSameCompanyRegistryPartnerIdAsObject() {
        return sameCompanyRegistryPartnerIdAsObject;
    }

    public OdooId getSameCompanyRegistryPartnerId() {
        return sameCompanyRegistryPartnerId;
    }

    public List<ResPartnerBank> getBankIdsAsList() {
        return bankIdsAsList;
    }

    public List<Integer> getBankIds() {
        return bankIds;
    }

    public HrWorkLocation getTuesdayLocationIdAsObject() {
        return tuesdayLocationIdAsObject;
    }

    public OdooId getTuesdayLocationId() {
        return tuesdayLocationId;
    }

    public String getPrivateCity() {
        return privateCity;
    }

    public Object getSelGroups5960() {
        return selGroups5960;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public Date getMicrosoftCalendarTokenValidity() {
        return microsoftCalendarTokenValidity;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public Object getSelGroups434445() {
        return selGroups434445;
    }

    public Object getType() {
        return type;
    }

    public Object getPeppolEas() {
        return peppolEas;
    }

    public int getTargetSalesWon() {
        return targetSalesWon;
    }

    public String getPassportId() {
        return passportId;
    }

    public int getSlideChannelCount() {
        return slideChannelCount;
    }

    public CalendarEvent getActivityCalendarEventIdAsObject() {
        return activityCalendarEventIdAsObject;
    }

    public OdooId getActivityCalendarEventId() {
        return activityCalendarEventId;
    }

    public boolean getIsInGroup38() {
        return isInGroup38;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public boolean getIsInGroup37() {
        return isInGroup37;
    }

    public boolean getIsInGroup34() {
        return isInGroup34;
    }

    public int getChildren() {
        return children;
    }

    public boolean getIsInGroup33() {
        return isInGroup33;
    }

    public boolean getIsInGroup32() {
        return isInGroup32;
    }

    public boolean getIsInGroup31() {
        return isInGroup31;
    }

    public int getId() {
        return id;
    }

    public int getMessageBounce() {
        return messageBounce;
    }

    public ResCountryState getStateIdAsObject() {
        return stateIdAsObject;
    }

    public OdooId getStateId() {
        return stateId;
    }

    public int getBankAccountCount() {
        return bankAccountCount;
    }

    public String getPrivateEmail() {
        return privateEmail;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getZip() {
        return zip;
    }

    public List<DiscussChannel> getChannelIdsAsList() {
        return channelIdsAsList;
    }

    public List<Integer> getChannelIds() {
        return channelIds;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public String getSsnid() {
        return ssnid;
    }

    public boolean getIsMicrosoftSynchronizationStopped() {
        return isMicrosoftSynchronizationStopped;
    }

    public boolean getIsIsAbsent() {
        return isIsAbsent;
    }

    public String getVat() {
        return vat;
    }

    public HrEmployee getEmployeeParentIdAsObject() {
        return employeeParentIdAsObject;
    }

    public OdooId getEmployeeParentId() {
        return employeeParentId;
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

    public List<SaleOrder> getSaleOrderIdsAsList() {
        return saleOrderIdsAsList;
    }

    public List<Integer> getSaleOrderIds() {
        return saleOrderIds;
    }

    public boolean getIsInGroup19() {
        return isInGroup19;
    }

    public boolean getIsInGroup18() {
        return isInGroup18;
    }

    public boolean getIsInGroup17() {
        return isInGroup17;
    }

    public boolean getIsInGroup26() {
        return isInGroup26;
    }

    public Object getEmployeeType() {
        return employeeType;
    }

    public boolean getIsInGroup25() {
        return isInGroup25;
    }

    public boolean getIsInGroup24() {
        return isInGroup24;
    }

    public boolean getIsInGroup23() {
        return isInGroup23;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public boolean getIsInGroup22() {
        return isInGroup22;
    }

    public boolean getIsInGroup21() {
        return isInGroup21;
    }

    public String getContactAddressInline() {
        return contactAddressInline;
    }

    public boolean getIsInGroup20() {
        return isInGroup20;
    }

    public String getPeppolEndpoint() {
        return peppolEndpoint;
    }

    public HrWorkLocation getWednesdayLocationIdAsObject() {
        return wednesdayLocationIdAsObject;
    }

    public OdooId getWednesdayLocationId() {
        return wednesdayLocationId;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }

    public List<ResUsersSettings> getResUsersSettingsIdsAsList() {
        return resUsersSettingsIdsAsList;
    }

    public List<Integer> getResUsersSettingsIds() {
        return resUsersSettingsIds;
    }

    public Object getGender() {
        return gender;
    }

    public List<ResCompany> getRefCompanyIdsAsList() {
        return refCompanyIdsAsList;
    }

    public List<Integer> getRefCompanyIds() {
        return refCompanyIds;
    }

    public Object getSignature() {
        return signature;
    }

    public String getMicrosoftCalendarToken() {
        return microsoftCalendarToken;
    }

    public String getCity() {
        return city;
    }

    public String getLogin() {
        return login;
    }

    public List<ResPartner> getChildIdsAsList() {
        return childIdsAsList;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public String getMicrosoftCalendarSyncToken() {
        return microsoftCalendarSyncToken;
    }

    public String getVehicle() {
        return vehicle;
    }

    public Date getLastTimeEntriesChecked() {
        return lastTimeEntriesChecked;
    }

    public boolean getIsCreateEmployee() {
        return isCreateEmployee;
    }

    public Object getLeaveDateTo() {
        return leaveDateTo;
    }

    public boolean getIsInGroup13() {
        return isInGroup13;
    }

    public boolean getIsInGroup12() {
        return isInGroup12;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public boolean getIsShare() {
        return isShare;
    }

    public boolean getIsUsePartnerCreditLimit() {
        return isUsePartnerCreditLimit;
    }

    public String getStreet2() {
        return street2;
    }

    public Object getDebit() {
        return debit;
    }

    public List<ResUsersLog> getLogIdsAsList() {
        return logIdsAsList;
    }

    public List<Integer> getLogIds() {
        return logIds;
    }

    public ResourceCalendar getResourceCalendarIdAsObject() {
        return resourceCalendarIdAsObject;
    }

    public OdooId getResourceCalendarId() {
        return resourceCalendarId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getInvoiceWarnMsg() {
        return invoiceWarnMsg;
    }

    public List<ResUsersApikeys> getApiKeyIdsAsList() {
        return apiKeyIdsAsList;
    }

    public List<Integer> getApiKeyIds() {
        return apiKeyIds;
    }

    public boolean getIsCanEdit() {
        return isCanEdit;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
    }

    public List<ProjectTask> getTaskIdsAsList() {
        return taskIdsAsList;
    }

    public List<Integer> getTaskIds() {
        return taskIds;
    }

    public List<Project> getProjectIdsAsList() {
        return projectIdsAsList;
    }

    public List<Integer> getProjectIds() {
        return projectIds;
    }

    public boolean getIsShowCreditLimit() {
        return isShowCreditLimit;
    }

    public String getLastActivityTime() {
        return lastActivityTime;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public ResPartner getSelfAsObject() {
        return selfAsObject;
    }

    public OdooId getSelf() {
        return self;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public boolean getIsShowLeaves() {
        return isShowLeaves;
    }

    public ResPartner getWorkContactIdAsObject() {
        return workContactIdAsObject;
    }

    public OdooId getWorkContactId() {
        return workContactId;
    }

    public Object getDate() {
        return date;
    }

    public String getParentName() {
        return parentName;
    }

    public Date getLastCheckOut() {
        return lastCheckOut;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public boolean getIsPhoneBlacklisted() {
        return isPhoneBlacklisted;
    }

    public ResCountry getPrivateCountryIdAsObject() {
        return privateCountryIdAsObject;
    }

    public OdooId getPrivateCountryId() {
        return privateCountryId;
    }

    public boolean getIsMobileBlacklisted() {
        return isMobileBlacklisted;
    }

    public boolean getIsOdoobotFailed() {
        return isOdoobotFailed;
    }

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public double getPartnerLongitude() {
        return partnerLongitude;
    }

    public Object getInvoiceWarn() {
        return invoiceWarn;
    }

    public Object getAvatar256() {
        return avatar256;
    }

    public int getMeetingCount() {
        return meetingCount;
    }

    public String getPin() {
        return pin;
    }

    public boolean getIsCanPublish() {
        return isCanPublish;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getFunction() {
        return function;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getCredit() {
        return credit;
    }

    public List<SlideChannel> getSlideChannelIdsAsList() {
        return slideChannelIdsAsList;
    }

    public List<Integer> getSlideChannelIds() {
        return slideChannelIds;
    }

    public Object getImage512() {
        return image512;
    }

    public String getMicrosoftCalendarRtoken() {
        return microsoftCalendarRtoken;
    }

    public Object getSelGroups4142() {
        return selGroups4142;
    }

    public String getPrivateStreet() {
        return privateStreet;
    }

    public ResUsers getActivityUserIdAsObject() {
        return activityUserIdAsObject;
    }

    public OdooId getActivityUserId() {
        return activityUserId;
    }

    public Object getHrPresenceState() {
        return hrPresenceState;
    }

    public HrWorkLocation getSundayLocationIdAsObject() {
        return sundayLocationIdAsObject;
    }

    public OdooId getSundayLocationId() {
        return sundayLocationId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getActivityExceptionIcon() {
        return activityExceptionIcon;
    }

    public Object getAvatar128() {
        return avatar128;
    }

    public List<CrmLead> getOpportunityIdsAsList() {
        return opportunityIdsAsList;
    }

    public List<Integer> getOpportunityIds() {
        return opportunityIds;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public String getVisaNo() {
        return visaNo;
    }

    public Object getSelGroups5354() {
        return selGroups5354;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public ResPartner getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public Object getTotalInvoiced() {
        return totalInvoiced;
    }

    public String getEmailNormalized() {
        return emailNormalized;
    }

    public ResCountry getEmployeeCountryIdAsObject() {
        return employeeCountryIdAsObject;
    }

    public OdooId getEmployeeCountryId() {
        return employeeCountryId;
    }

    public double getHoursLastMonth() {
        return hoursLastMonth;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public Object getBirthday() {
        return birthday;
    }

    public HrWorkLocation getMondayLocationIdAsObject() {
        return mondayLocationIdAsObject;
    }

    public OdooId getMondayLocationId() {
        return mondayLocationId;
    }

    public ResPartnerBank getBankAccountIdAsObject() {
        return bankAccountIdAsObject;
    }

    public OdooId getBankAccountId() {
        return bankAccountId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getAllocationRemainingDisplay() {
        return allocationRemainingDisplay;
    }

    public int getActiveLangCount() {
        return activeLangCount;
    }

    public int getAccessesCount() {
        return accessesCount;
    }

    public int getGroupsCount() {
        return groupsCount;
    }

    public Object getSelGroups11011() {
        return selGroups11011;
    }

    public Object getCertificate() {
        return certificate;
    }

    public Object getSelGroups484950() {
        return selGroups484950;
    }

    public HrEmployee getCreateEmployeeIdAsObject() {
        return createEmployeeIdAsObject;
    }

    public OdooId getCreateEmployeeId() {
        return createEmployeeId;
    }

    public List<CrmTeam> getCrmTeamIdsAsList() {
        return crmTeamIdsAsList;
    }

    public List<Integer> getCrmTeamIds() {
        return crmTeamIds;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getStudySchool() {
        return studySchool;
    }

    public int getCustomerRank() {
        return customerRank;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public int getPartnerGid() {
        return partnerGid;
    }

    public List<HrEmployeeSkill> getEmployeeSkillIdsAsList() {
        return employeeSkillIdsAsList;
    }

    public List<Integer> getEmployeeSkillIds() {
        return employeeSkillIds;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Object getLang() {
        return lang;
    }

    public Date getLastCheckIn() {
        return lastCheckIn;
    }

    public String getEmailFormatted() {
        return emailFormatted;
    }

    public String getActivityTypeIcon() {
        return activityTypeIcon;
    }

    public Object getAttendanceState() {
        return attendanceState;
    }

    public int getDuplicatedBankAccountPartnersCount() {
        return duplicatedBankAccountPartnersCount;
    }

    public Account getPropertyAccountReceivableIdAsObject() {
        return propertyAccountReceivableIdAsObject;
    }

    public OdooId getPropertyAccountReceivableId() {
        return propertyAccountReceivableId;
    }

    public HrWorkLocation getWorkLocationIdAsObject() {
        return workLocationIdAsObject;
    }

    public OdooId getWorkLocationId() {
        return workLocationId;
    }

    public List<CalendarEvent> getMeetingIdsAsList() {
        return meetingIdsAsList;
    }

    public List<Integer> getMeetingIds() {
        return meetingIds;
    }

    public String getPrivateZip() {
        return privateZip;
    }

    public boolean getIsPhoneSanitizedBlacklisted() {
        return isPhoneSanitizedBlacklisted;
    }

    public List<GamificationBadgeUser> getBadgeIdsAsList() {
        return badgeIdsAsList;
    }

    public List<Integer> getBadgeIds() {
        return badgeIds;
    }

    public Object getVisaExpire() {
        return visaExpire;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public HrEmployee getCoachIdAsObject() {
        return coachIdAsObject;
    }

    public OdooId getCoachId() {
        return coachId;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getKmHomeWork() {
        return kmHomeWork;
    }

    public String getActivitySummary() {
        return activitySummary;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public AccountPaymentTerm getPropertySupplierPaymentTermIdAsObject() {
        return propertySupplierPaymentTermIdAsObject;
    }

    public OdooId getPropertySupplierPaymentTermId() {
        return propertySupplierPaymentTermId;
    }

    public String getPhoneSanitized() {
        return phoneSanitized;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public Object getAdditionalNote() {
        return additionalNote;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPrivateStateIdAsObject(ResCountryState privateStateIdAsObject) {
        this.privateStateIdAsObject = privateStateIdAsObject;
    }

    public void setPrivateStateId(OdooId privateStateId) {
        this.privateStateId = privateStateId;
    }

    public void setEmployeeBankAccountIdAsObject(ResPartnerBank employeeBankAccountIdAsObject) {
        this.employeeBankAccountIdAsObject = employeeBankAccountIdAsObject;
    }

    public void setEmployeeBankAccountId(OdooId employeeBankAccountId) {
        this.employeeBankAccountId = employeeBankAccountId;
    }

    public void setStarredMessageIdsAsList(List<MailMessage> starredMessageIdsAsList) {
        this.starredMessageIdsAsList = starredMessageIdsAsList;
    }

    public void setStarredMessageIds(List<Integer> starredMessageIds) {
        this.starredMessageIds = starredMessageIds;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
    }

    public void setAvatar1920(Object avatar1920) {
        this.avatar1920 = avatar1920;
    }

    public void setInvoiceIdsAsList(List<AccountMove> invoiceIdsAsList) {
        this.invoiceIdsAsList = invoiceIdsAsList;
    }

    public void setInvoiceIds(List<Integer> invoiceIds) {
        this.invoiceIds = invoiceIds;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public void setSpouseBirthdate(Object spouseBirthdate) {
        this.spouseBirthdate = spouseBirthdate;
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

    public void setSelGroups141516(Object selGroups141516) {
        this.selGroups141516 = selGroups141516;
    }

    public void setIsDisplayExtraHours(boolean isDisplayExtraHours) {
        this.isDisplayExtraHours = isDisplayExtraHours;
    }

    public void setActivityState(Object activityState) {
        this.activityState = activityState;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActionIdAsObject(Actions actionIdAsObject) {
        this.actionIdAsObject = actionIdAsObject;
    }

    public void setActionId(OdooId actionId) {
        this.actionId = actionId;
    }

    public void setNextRankIdAsObject(GamificationKarmaRank nextRankIdAsObject) {
        this.nextRankIdAsObject = nextRankIdAsObject;
    }

    public void setNextRankId(OdooId nextRankId) {
        this.nextRankId = nextRankId;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setFridayLocationIdAsObject(HrWorkLocation fridayLocationIdAsObject) {
        this.fridayLocationIdAsObject = fridayLocationIdAsObject;
    }

    public void setFridayLocationId(OdooId fridayLocationId) {
        this.fridayLocationId = fridayLocationId;
    }

    public void setResourceIdsAsList(List<Resource> resourceIdsAsList) {
        this.resourceIdsAsList = resourceIdsAsList;
    }

    public void setResourceIds(List<Integer> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public void setJournalItemCount(int journalItemCount) {
        this.journalItemCount = journalItemCount;
    }

    public void setIsIsSystem(boolean isIsSystem) {
        this.isIsSystem = isIsSystem;
    }

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setCreditToInvoice(Object creditToInvoice) {
        this.creditToInvoice = creditToInvoice;
    }

    public void setCrmTeamMemberIdsAsList(List<CrmTeamMember> crmTeamMemberIdsAsList) {
        this.crmTeamMemberIdsAsList = crmTeamMemberIdsAsList;
    }

    public void setCrmTeamMemberIds(List<Integer> crmTeamMemberIds) {
        this.crmTeamMemberIds = crmTeamMemberIds;
    }

    public void setSelGroups24(Object selGroups24) {
        this.selGroups24 = selGroups24;
    }

    public void setSaturdayLocationIdAsObject(HrWorkLocation saturdayLocationIdAsObject) {
        this.saturdayLocationIdAsObject = saturdayLocationIdAsObject;
    }

    public void setSaturdayLocationId(OdooId saturdayLocationId) {
        this.saturdayLocationId = saturdayLocationId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsIsBlacklisted(boolean isIsBlacklisted) {
        this.isIsBlacklisted = isIsBlacklisted;
    }

    public void setSpouseCompleteName(String spouseCompleteName) {
        this.spouseCompleteName = spouseCompleteName;
    }

    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }

    public void setPropertyPaymentTermIdAsObject(AccountPaymentTerm propertyPaymentTermIdAsObject) {
        this.propertyPaymentTermIdAsObject = propertyPaymentTermIdAsObject;
    }

    public void setPropertyPaymentTermId(OdooId propertyPaymentTermId) {
        this.propertyPaymentTermId = propertyPaymentTermId;
    }

    public void setSelGroups2830(Object selGroups2830) {
        this.selGroups2830 = selGroups2830;
    }

    public void setIsRequestOvertime(boolean isRequestOvertime) {
        this.isRequestOvertime = isRequestOvertime;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeeResourceCalendarIdAsObject(ResourceCalendar employeeResourceCalendarIdAsObject) {
        this.employeeResourceCalendarIdAsObject = employeeResourceCalendarIdAsObject;
    }

    public void setEmployeeResourceCalendarId(OdooId employeeResourceCalendarId) {
        this.employeeResourceCalendarId = employeeResourceCalendarId;
    }

    public void setDaysSalesOutstanding(double daysSalesOutstanding) {
        this.daysSalesOutstanding = daysSalesOutstanding;
    }

    public void setSlideChannelCompanyCount(int slideChannelCompanyCount) {
        this.slideChannelCompanyCount = slideChannelCompanyCount;
    }

    public void setNotificationType(Object notificationType) {
        this.notificationType = notificationType;
    }

    public void setOdoobotState(Object odoobotState) {
        this.odoobotState = odoobotState;
    }

    public void setCompanyIdsAsList(List<ResCompany> companyIdsAsList) {
        this.companyIdsAsList = companyIdsAsList;
    }

    public void setCompanyIds(List<Integer> companyIds) {
        this.companyIds = companyIds;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
    }

    public void setSelGroups4647(Object selGroups4647) {
        this.selGroups4647 = selGroups4647;
    }

    public void setImStatus(String imStatus) {
        this.imStatus = imStatus;
    }

    public void setRankIdAsObject(GamificationKarmaRank rankIdAsObject) {
        this.rankIdAsObject = rankIdAsObject;
    }

    public void setRankId(OdooId rankId) {
        this.rankId = rankId;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setLeaveManagerIdAsObject(ResUsers leaveManagerIdAsObject) {
        this.leaveManagerIdAsObject = leaveManagerIdAsObject;
    }

    public void setLeaveManagerId(OdooId leaveManagerId) {
        this.leaveManagerId = leaveManagerId;
    }

    public void setIsTotpEnabled(boolean isTotpEnabled) {
        this.isTotpEnabled = isTotpEnabled;
    }

    public void setAvatar1024(Object avatar1024) {
        this.avatar1024 = avatar1024;
    }

    public void setPhoneMobileSearch(String phoneMobileSearch) {
        this.phoneMobileSearch = phoneMobileSearch;
    }

    public void setUblCiiFormat(Object ublCiiFormat) {
        this.ublCiiFormat = ublCiiFormat;
    }

    public void setTotpTrustedDeviceIdsAsList(List<Auth_totpDevice> totpTrustedDeviceIdsAsList) {
        this.totpTrustedDeviceIdsAsList = totpTrustedDeviceIdsAsList;
    }

    public void setTotpTrustedDeviceIds(List<Integer> totpTrustedDeviceIds) {
        this.totpTrustedDeviceIds = totpTrustedDeviceIds;
    }

    public void setBronzeBadge(int bronzeBadge) {
        this.bronzeBadge = bronzeBadge;
    }

    public void setExpenseManagerIdAsObject(ResUsers expenseManagerIdAsObject) {
        this.expenseManagerIdAsObject = expenseManagerIdAsObject;
    }

    public void setExpenseManagerId(OdooId expenseManagerId) {
        this.expenseManagerId = expenseManagerId;
    }

    public void setTotalOvertime(double totalOvertime) {
        this.totalOvertime = totalOvertime;
    }

    public void setCategoryIdAsList(List<ResPartnerCategory> categoryIdAsList) {
        this.categoryIdAsList = categoryIdAsList;
    }

    public void setCategoryId(List<Integer> categoryId) {
        this.categoryId = categoryId;
    }

    public void setCountryOfBirthAsObject(ResCountry countryOfBirthAsObject) {
        this.countryOfBirthAsObject = countryOfBirthAsObject;
    }

    public void setCountryOfBirth(OdooId countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setHrIconDisplay(Object hrIconDisplay) {
        this.hrIconDisplay = hrIconDisplay;
    }

    public void setSignupUrl(String signupUrl) {
        this.signupUrl = signupUrl;
    }

    public void setPropertyAccountPositionIdAsObject(AccountFiscalPosition propertyAccountPositionIdAsObject) {
        this.propertyAccountPositionIdAsObject = propertyAccountPositionIdAsObject;
    }

    public void setPropertyAccountPositionId(OdooId propertyAccountPositionId) {
        this.propertyAccountPositionId = propertyAccountPositionId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSelGroups36(Object selGroups36) {
        this.selGroups36 = selGroups36;
    }

    public void setSelGroups35(Object selGroups35) {
        this.selGroups35 = selGroups35;
    }

    public void setResumeLineIdsAsList(List<HrResumeLine> resumeLineIdsAsList) {
        this.resumeLineIdsAsList = resumeLineIdsAsList;
    }

    public void setResumeLineIds(List<Integer> resumeLineIds) {
        this.resumeLineIds = resumeLineIds;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setContractIdsAsList(List<AccountAnalyticAccount> contractIdsAsList) {
        this.contractIdsAsList = contractIdsAsList;
    }

    public void setContractIds(List<Integer> contractIds) {
        this.contractIds = contractIds;
    }

    public void setPrivateStreet2(String privateStreet2) {
        this.privateStreet2 = privateStreet2;
    }

    public void setCompanyRegistry(String companyRegistry) {
        this.companyRegistry = companyRegistry;
    }

    public void setUserIdsAsList(List<ResUsers> userIdsAsList) {
        this.userIdsAsList = userIdsAsList;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setPaymentTokenCount(int paymentTokenCount) {
        this.paymentTokenCount = paymentTokenCount;
    }

    public void setPaymentTokenIdsAsList(List<PaymentToken> paymentTokenIdsAsList) {
        this.paymentTokenIdsAsList = paymentTokenIdsAsList;
    }

    public void setPaymentTokenIds(List<Integer> paymentTokenIds) {
        this.paymentTokenIds = paymentTokenIds;
    }

    public void setActivityTypeIdAsObject(MailActivityType activityTypeIdAsObject) {
        this.activityTypeIdAsObject = activityTypeIdAsObject;
    }

    public void setActivityTypeId(OdooId activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public void setSaleTeamIdAsObject(CrmTeam saleTeamIdAsObject) {
        this.saleTeamIdAsObject = saleTeamIdAsObject;
    }

    public void setSaleTeamId(OdooId saleTeamId) {
        this.saleTeamId = saleTeamId;
    }

    public void setSignupExpiration(Date signupExpiration) {
        this.signupExpiration = signupExpiration;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setIsIsPublic(boolean isIsPublic) {
        this.isIsPublic = isIsPublic;
    }

    public void setIsIsCompany(boolean isIsCompany) {
        this.isIsCompany = isIsCompany;
    }

    public void setCompaniesCount(int companiesCount) {
        this.companiesCount = companiesCount;
    }

    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setCompanyType(Object companyType) {
        this.companyType = companyType;
    }

    public void setSaleWarn(Object saleWarn) {
        this.saleWarn = saleWarn;
    }

    public void setMicrosoftLastSyncDate(Date microsoftLastSyncDate) {
        this.microsoftLastSyncDate = microsoftLastSyncDate;
    }

    public void setKarmaTrackingIdsAsList(List<GamificationKarmaTracking> karmaTrackingIdsAsList) {
        this.karmaTrackingIdsAsList = karmaTrackingIdsAsList;
    }

    public void setKarmaTrackingIds(List<Integer> karmaTrackingIds) {
        this.karmaTrackingIds = karmaTrackingIds;
    }

    public void setTz(Object tz) {
        this.tz = tz;
    }

    public void setMicrosoftCalendarAccountIdAsObject(MicrosoftCalendarCredentials microsoftCalendarAccountIdAsObject) {
        this.microsoftCalendarAccountIdAsObject = microsoftCalendarAccountIdAsObject;
    }

    public void setMicrosoftCalendarAccountId(OdooId microsoftCalendarAccountId) {
        this.microsoftCalendarAccountId = microsoftCalendarAccountId;
    }

    public void setRulesCount(int rulesCount) {
        this.rulesCount = rulesCount;
    }

    public void setPrivateLang(Object privateLang) {
        this.privateLang = privateLang;
    }

    public void setResUsersSettingsIdAsObject(ResUsersSettings resUsersSettingsIdAsObject) {
        this.resUsersSettingsIdAsObject = resUsersSettingsIdAsObject;
    }

    public void setResUsersSettingsId(OdooId resUsersSettingsId) {
        this.resUsersSettingsId = resUsersSettingsId;
    }

    public void setActivityExceptionDecoration(Object activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration;
    }

    public void setIsPartnerShare(boolean isPartnerShare) {
        this.isPartnerShare = isPartnerShare;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public void setSelGroups6162(Object selGroups6162) {
        this.selGroups6162 = selGroups6162;
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

    public void setWebsiteShortDescription(Object websiteShortDescription) {
        this.websiteShortDescription = websiteShortDescription;
    }

    public void setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
    }

    public void setCommercialCompanyName(String commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName;
    }

    public void setIsInGroup73(boolean isInGroup73) {
        this.isInGroup73 = isInGroup73;
    }

    public void setIsInGroup72(boolean isInGroup72) {
        this.isInGroup72 = isInGroup72;
    }

    public void setCategoryIdsAsList(List<HrEmployeeCategory> categoryIdsAsList) {
        this.categoryIdsAsList = categoryIdsAsList;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setGoalIdsAsList(List<GamificationGoal> goalIdsAsList) {
        this.goalIdsAsList = goalIdsAsList;
    }

    public void setGoalIds(List<Integer> goalIds) {
        this.goalIds = goalIds;
    }

    public void setTargetSalesInvoiced(int targetSalesInvoiced) {
        this.targetSalesInvoiced = targetSalesInvoiced;
    }

    public void setPropertyProductPricelistAsObject(ProductPricelist propertyProductPricelistAsObject) {
        this.propertyProductPricelistAsObject = propertyProductPricelistAsObject;
    }

    public void setPropertyProductPricelist(OdooId propertyProductPricelist) {
        this.propertyProductPricelist = propertyProductPricelist;
    }

    public void setHoursLastMonthDisplay(String hoursLastMonthDisplay) {
        this.hoursLastMonthDisplay = hoursLastMonthDisplay;
    }

    public void setOpportunityCount(int opportunityCount) {
        this.opportunityCount = opportunityCount;
    }

    public void setEmployeeIdsAsList(List<HrEmployee> employeeIdsAsList) {
        this.employeeIdsAsList = employeeIdsAsList;
    }

    public void setEmployeeIds(List<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public void setIsActivePartner(boolean isActivePartner) {
        this.isActivePartner = isActivePartner;
    }

    public void setAddressIdAsObject(ResPartner addressIdAsObject) {
        this.addressIdAsObject = addressIdAsObject;
    }

    public void setAddressId(OdooId addressId) {
        this.addressId = addressId;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setAllocationDisplay(String allocationDisplay) {
        this.allocationDisplay = allocationDisplay;
    }

    public void setIsHasUnreconciledEntries(boolean isHasUnreconciledEntries) {
        this.isHasUnreconciledEntries = isHasUnreconciledEntries;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setIsInGroup68(boolean isInGroup68) {
        this.isInGroup68 = isInGroup68;
    }

    public void setVisitorIdsAsList(List<WebsiteVisitor> visitorIdsAsList) {
        this.visitorIdsAsList = visitorIdsAsList;
    }

    public void setVisitorIds(List<Integer> visitorIds) {
        this.visitorIds = visitorIds;
    }

    public void setIsInGroup67(boolean isInGroup67) {
        this.isInGroup67 = isInGroup67;
    }

    public void setIsInGroup66(boolean isInGroup66) {
        this.isInGroup66 = isInGroup66;
    }

    public void setIsInGroup65(boolean isInGroup65) {
        this.isInGroup65 = isInGroup65;
    }

    public void setIsInGroup64(boolean isInGroup64) {
        this.isInGroup64 = isInGroup64;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsInGroup63(boolean isInGroup63) {
        this.isInGroup63 = isInGroup63;
    }

    public void setSameVatPartnerIdAsObject(ResPartner sameVatPartnerIdAsObject) {
        this.sameVatPartnerIdAsObject = sameVatPartnerIdAsObject;
    }

    public void setSameVatPartnerId(OdooId sameVatPartnerId) {
        this.sameVatPartnerId = sameVatPartnerId;
    }

    public void setCurrentLeaveState(Object currentLeaveState) {
        this.currentLeaveState = currentLeaveState;
    }

    public void setTrust(Object trust) {
        this.trust = trust;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public void setIndustryIdAsObject(ResPartnerIndustry industryIdAsObject) {
        this.industryIdAsObject = industryIdAsObject;
    }

    public void setIndustryId(OdooId industryId) {
        this.industryId = industryId;
    }

    public void setImage256(Object image256) {
        this.image256 = image256;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDebitLimit(Object debitLimit) {
        this.debitLimit = debitLimit;
    }

    public void setIsInGroup6(boolean isInGroup6) {
        this.isInGroup6 = isInGroup6;
    }

    public void setIsInGroup7(boolean isInGroup7) {
        this.isInGroup7 = isInGroup7;
    }

    public void setIsInGroup8(boolean isInGroup8) {
        this.isInGroup8 = isInGroup8;
    }

    public void setMyActivityDateDeadline(Object myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline;
    }

    public void setIsInGroup9(boolean isInGroup9) {
        this.isInGroup9 = isInGroup9;
    }

    public void setAvatar512(Object avatar512) {
        this.avatar512 = avatar512;
    }

    public void setTitleAsObject(ResPartnerTitle titleAsObject) {
        this.titleAsObject = titleAsObject;
    }

    public void setTitle(OdooId title) {
        this.title = title;
    }

    public void setAllocationCount(double allocationCount) {
        this.allocationCount = allocationCount;
    }

    public void setIsInGroup3(boolean isInGroup3) {
        this.isInGroup3 = isInGroup3;
    }

    public void setAttendanceManagerIdAsObject(ResUsers attendanceManagerIdAsObject) {
        this.attendanceManagerIdAsObject = attendanceManagerIdAsObject;
    }

    public void setAttendanceManagerId(OdooId attendanceManagerId) {
        this.attendanceManagerId = attendanceManagerId;
    }

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setIsInGroup5(boolean isInGroup5) {
        this.isInGroup5 = isInGroup5;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public void setGoldBadge(int goldBadge) {
        this.goldBadge = goldBadge;
    }

    public void setPropertyAccountPayableIdAsObject(Account propertyAccountPayableIdAsObject) {
        this.propertyAccountPayableIdAsObject = propertyAccountPayableIdAsObject;
    }

    public void setPropertyAccountPayableId(OdooId propertyAccountPayableId) {
        this.propertyAccountPayableId = propertyAccountPayableId;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setIsInGroup58(boolean isInGroup58) {
        this.isInGroup58 = isInGroup58;
    }

    public void setLastActivity(Object lastActivity) {
        this.lastActivity = lastActivity;
    }

    public void setIsInGroup57(boolean isInGroup57) {
        this.isInGroup57 = isInGroup57;
    }

    public void setSelGroups74(Object selGroups74) {
        this.selGroups74 = selGroups74;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCalendarLastNotifAck(Date calendarLastNotifAck) {
        this.calendarLastNotifAck = calendarLastNotifAck;
    }

    public void setIsInGroup52(boolean isInGroup52) {
        this.isInGroup52 = isInGroup52;
    }

    public void setIsInGroup51(boolean isInGroup51) {
        this.isInGroup51 = isInGroup51;
    }

    public void setSilverBadge(int silverBadge) {
        this.silverBadge = silverBadge;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public void setLoyaltyCardCount(int loyaltyCardCount) {
        this.loyaltyCardCount = loyaltyCardCount;
    }

    public void setImage1024(Object image1024) {
        this.image1024 = image1024;
    }

    public void setTargetSalesDone(int targetSalesDone) {
        this.targetSalesDone = targetSalesDone;
    }

    public void setPartnerLatitude(double partnerLatitude) {
        this.partnerLatitude = partnerLatitude;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setThursdayLocationIdAsObject(HrWorkLocation thursdayLocationIdAsObject) {
        this.thursdayLocationIdAsObject = thursdayLocationIdAsObject;
    }

    public void setThursdayLocationId(OdooId thursdayLocationId) {
        this.thursdayLocationId = thursdayLocationId;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }

    public void setIsSignupValid(boolean isSignupValid) {
        this.isSignupValid = isSignupValid;
    }

    public void setSignupType(String signupType) {
        this.signupType = signupType;
    }

    public void setIsInGroup39(boolean isInGroup39) {
        this.isInGroup39 = isInGroup39;
    }

    public void setMarital(Object marital) {
        this.marital = marital;
    }

    public void setSaleWarnMsg(Object saleWarnMsg) {
        this.saleWarnMsg = saleWarnMsg;
    }

    public void setSelGroups5556(Object selGroups5556) {
        this.selGroups5556 = selGroups5556;
    }

    public void setUserGroupWarning(Object userGroupWarning) {
        this.userGroupWarning = userGroupWarning;
    }

    public void setSignupToken(String signupToken) {
        this.signupToken = signupToken;
    }

    public void setSelGroups697071(Object selGroups697071) {
        this.selGroups697071 = selGroups697071;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public void setWebsiteDescription(Object websiteDescription) {
        this.websiteDescription = websiteDescription;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }

    public void setIsInGroup40(boolean isInGroup40) {
        this.isInGroup40 = isInGroup40;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public void setSupplierRank(int supplierRank) {
        this.supplierRank = supplierRank;
    }

    public void setSlideChannelCompletedIdsAsList(List<SlideChannel> slideChannelCompletedIdsAsList) {
        this.slideChannelCompletedIdsAsList = slideChannelCompletedIdsAsList;
    }

    public void setSlideChannelCompletedIds(List<Integer> slideChannelCompletedIds) {
        this.slideChannelCompletedIds = slideChannelCompletedIds;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
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

    public void setSameCompanyRegistryPartnerIdAsObject(ResPartner sameCompanyRegistryPartnerIdAsObject) {
        this.sameCompanyRegistryPartnerIdAsObject = sameCompanyRegistryPartnerIdAsObject;
    }

    public void setSameCompanyRegistryPartnerId(OdooId sameCompanyRegistryPartnerId) {
        this.sameCompanyRegistryPartnerId = sameCompanyRegistryPartnerId;
    }

    public void setBankIdsAsList(List<ResPartnerBank> bankIdsAsList) {
        this.bankIdsAsList = bankIdsAsList;
    }

    public void setBankIds(List<Integer> bankIds) {
        this.bankIds = bankIds;
    }

    public void setTuesdayLocationIdAsObject(HrWorkLocation tuesdayLocationIdAsObject) {
        this.tuesdayLocationIdAsObject = tuesdayLocationIdAsObject;
    }

    public void setTuesdayLocationId(OdooId tuesdayLocationId) {
        this.tuesdayLocationId = tuesdayLocationId;
    }

    public void setPrivateCity(String privateCity) {
        this.privateCity = privateCity;
    }

    public void setSelGroups5960(Object selGroups5960) {
        this.selGroups5960 = selGroups5960;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setMicrosoftCalendarTokenValidity(Date microsoftCalendarTokenValidity) {
        this.microsoftCalendarTokenValidity = microsoftCalendarTokenValidity;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setSelGroups434445(Object selGroups434445) {
        this.selGroups434445 = selGroups434445;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setPeppolEas(Object peppolEas) {
        this.peppolEas = peppolEas;
    }

    public void setTargetSalesWon(int targetSalesWon) {
        this.targetSalesWon = targetSalesWon;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public void setSlideChannelCount(int slideChannelCount) {
        this.slideChannelCount = slideChannelCount;
    }

    public void setActivityCalendarEventIdAsObject(CalendarEvent activityCalendarEventIdAsObject) {
        this.activityCalendarEventIdAsObject = activityCalendarEventIdAsObject;
    }

    public void setActivityCalendarEventId(OdooId activityCalendarEventId) {
        this.activityCalendarEventId = activityCalendarEventId;
    }

    public void setIsInGroup38(boolean isInGroup38) {
        this.isInGroup38 = isInGroup38;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setIsInGroup37(boolean isInGroup37) {
        this.isInGroup37 = isInGroup37;
    }

    public void setIsInGroup34(boolean isInGroup34) {
        this.isInGroup34 = isInGroup34;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setIsInGroup33(boolean isInGroup33) {
        this.isInGroup33 = isInGroup33;
    }

    public void setIsInGroup32(boolean isInGroup32) {
        this.isInGroup32 = isInGroup32;
    }

    public void setIsInGroup31(boolean isInGroup31) {
        this.isInGroup31 = isInGroup31;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessageBounce(int messageBounce) {
        this.messageBounce = messageBounce;
    }

    public void setStateIdAsObject(ResCountryState stateIdAsObject) {
        this.stateIdAsObject = stateIdAsObject;
    }

    public void setStateId(OdooId stateId) {
        this.stateId = stateId;
    }

    public void setBankAccountCount(int bankAccountCount) {
        this.bankAccountCount = bankAccountCount;
    }

    public void setPrivateEmail(String privateEmail) {
        this.privateEmail = privateEmail;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setChannelIdsAsList(List<DiscussChannel> channelIdsAsList) {
        this.channelIdsAsList = channelIdsAsList;
    }

    public void setChannelIds(List<Integer> channelIds) {
        this.channelIds = channelIds;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setSsnid(String ssnid) {
        this.ssnid = ssnid;
    }

    public void setIsMicrosoftSynchronizationStopped(boolean isMicrosoftSynchronizationStopped) {
        this.isMicrosoftSynchronizationStopped = isMicrosoftSynchronizationStopped;
    }

    public void setIsIsAbsent(boolean isIsAbsent) {
        this.isIsAbsent = isIsAbsent;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setEmployeeParentIdAsObject(HrEmployee employeeParentIdAsObject) {
        this.employeeParentIdAsObject = employeeParentIdAsObject;
    }

    public void setEmployeeParentId(OdooId employeeParentId) {
        this.employeeParentId = employeeParentId;
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

    public void setSaleOrderIdsAsList(List<SaleOrder> saleOrderIdsAsList) {
        this.saleOrderIdsAsList = saleOrderIdsAsList;
    }

    public void setSaleOrderIds(List<Integer> saleOrderIds) {
        this.saleOrderIds = saleOrderIds;
    }

    public void setIsInGroup19(boolean isInGroup19) {
        this.isInGroup19 = isInGroup19;
    }

    public void setIsInGroup18(boolean isInGroup18) {
        this.isInGroup18 = isInGroup18;
    }

    public void setIsInGroup17(boolean isInGroup17) {
        this.isInGroup17 = isInGroup17;
    }

    public void setIsInGroup26(boolean isInGroup26) {
        this.isInGroup26 = isInGroup26;
    }

    public void setEmployeeType(Object employeeType) {
        this.employeeType = employeeType;
    }

    public void setIsInGroup25(boolean isInGroup25) {
        this.isInGroup25 = isInGroup25;
    }

    public void setIsInGroup24(boolean isInGroup24) {
        this.isInGroup24 = isInGroup24;
    }

    public void setIsInGroup23(boolean isInGroup23) {
        this.isInGroup23 = isInGroup23;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setIsInGroup22(boolean isInGroup22) {
        this.isInGroup22 = isInGroup22;
    }

    public void setIsInGroup21(boolean isInGroup21) {
        this.isInGroup21 = isInGroup21;
    }

    public void setContactAddressInline(String contactAddressInline) {
        this.contactAddressInline = contactAddressInline;
    }

    public void setIsInGroup20(boolean isInGroup20) {
        this.isInGroup20 = isInGroup20;
    }

    public void setPeppolEndpoint(String peppolEndpoint) {
        this.peppolEndpoint = peppolEndpoint;
    }

    public void setWednesdayLocationIdAsObject(HrWorkLocation wednesdayLocationIdAsObject) {
        this.wednesdayLocationIdAsObject = wednesdayLocationIdAsObject;
    }

    public void setWednesdayLocationId(OdooId wednesdayLocationId) {
        this.wednesdayLocationId = wednesdayLocationId;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }

    public void setResUsersSettingsIdsAsList(List<ResUsersSettings> resUsersSettingsIdsAsList) {
        this.resUsersSettingsIdsAsList = resUsersSettingsIdsAsList;
    }

    public void setResUsersSettingsIds(List<Integer> resUsersSettingsIds) {
        this.resUsersSettingsIds = resUsersSettingsIds;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public void setRefCompanyIdsAsList(List<ResCompany> refCompanyIdsAsList) {
        this.refCompanyIdsAsList = refCompanyIdsAsList;
    }

    public void setRefCompanyIds(List<Integer> refCompanyIds) {
        this.refCompanyIds = refCompanyIds;
    }

    public void setSignature(Object signature) {
        this.signature = signature;
    }

    public void setMicrosoftCalendarToken(String microsoftCalendarToken) {
        this.microsoftCalendarToken = microsoftCalendarToken;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setChildIdsAsList(List<ResPartner> childIdsAsList) {
        this.childIdsAsList = childIdsAsList;
    }

    public void setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
    }

    public void setMicrosoftCalendarSyncToken(String microsoftCalendarSyncToken) {
        this.microsoftCalendarSyncToken = microsoftCalendarSyncToken;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setLastTimeEntriesChecked(Date lastTimeEntriesChecked) {
        this.lastTimeEntriesChecked = lastTimeEntriesChecked;
    }

    public void setIsCreateEmployee(boolean isCreateEmployee) {
        this.isCreateEmployee = isCreateEmployee;
    }

    public void setLeaveDateTo(Object leaveDateTo) {
        this.leaveDateTo = leaveDateTo;
    }

    public void setIsInGroup13(boolean isInGroup13) {
        this.isInGroup13 = isInGroup13;
    }

    public void setIsInGroup12(boolean isInGroup12) {
        this.isInGroup12 = isInGroup12;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public void setIsShare(boolean isShare) {
        this.isShare = isShare;
    }

    public void setIsUsePartnerCreditLimit(boolean isUsePartnerCreditLimit) {
        this.isUsePartnerCreditLimit = isUsePartnerCreditLimit;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public void setDebit(Object debit) {
        this.debit = debit;
    }

    public void setLogIdsAsList(List<ResUsersLog> logIdsAsList) {
        this.logIdsAsList = logIdsAsList;
    }

    public void setLogIds(List<Integer> logIds) {
        this.logIds = logIds;
    }

    public void setResourceCalendarIdAsObject(ResourceCalendar resourceCalendarIdAsObject) {
        this.resourceCalendarIdAsObject = resourceCalendarIdAsObject;
    }

    public void setResourceCalendarId(OdooId resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setInvoiceWarnMsg(Object invoiceWarnMsg) {
        this.invoiceWarnMsg = invoiceWarnMsg;
    }

    public void setApiKeyIdsAsList(List<ResUsersApikeys> apiKeyIdsAsList) {
        this.apiKeyIdsAsList = apiKeyIdsAsList;
    }

    public void setApiKeyIds(List<Integer> apiKeyIds) {
        this.apiKeyIds = apiKeyIds;
    }

    public void setIsCanEdit(boolean isCanEdit) {
        this.isCanEdit = isCanEdit;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
    }

    public void setTaskIdsAsList(List<ProjectTask> taskIdsAsList) {
        this.taskIdsAsList = taskIdsAsList;
    }

    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
    }

    public void setProjectIdsAsList(List<Project> projectIdsAsList) {
        this.projectIdsAsList = projectIdsAsList;
    }

    public void setProjectIds(List<Integer> projectIds) {
        this.projectIds = projectIds;
    }

    public void setIsShowCreditLimit(boolean isShowCreditLimit) {
        this.isShowCreditLimit = isShowCreditLimit;
    }

    public void setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setSelfAsObject(ResPartner selfAsObject) {
        this.selfAsObject = selfAsObject;
    }

    public void setSelf(OdooId self) {
        this.self = self;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setIsShowLeaves(boolean isShowLeaves) {
        this.isShowLeaves = isShowLeaves;
    }

    public void setWorkContactIdAsObject(ResPartner workContactIdAsObject) {
        this.workContactIdAsObject = workContactIdAsObject;
    }

    public void setWorkContactId(OdooId workContactId) {
        this.workContactId = workContactId;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setLastCheckOut(Date lastCheckOut) {
        this.lastCheckOut = lastCheckOut;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setIsPhoneBlacklisted(boolean isPhoneBlacklisted) {
        this.isPhoneBlacklisted = isPhoneBlacklisted;
    }

    public void setPrivateCountryIdAsObject(ResCountry privateCountryIdAsObject) {
        this.privateCountryIdAsObject = privateCountryIdAsObject;
    }

    public void setPrivateCountryId(OdooId privateCountryId) {
        this.privateCountryId = privateCountryId;
    }

    public void setIsMobileBlacklisted(boolean isMobileBlacklisted) {
        this.isMobileBlacklisted = isMobileBlacklisted;
    }

    public void setIsOdoobotFailed(boolean isOdoobotFailed) {
        this.isOdoobotFailed = isOdoobotFailed;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public void setPartnerLongitude(double partnerLongitude) {
        this.partnerLongitude = partnerLongitude;
    }

    public void setInvoiceWarn(Object invoiceWarn) {
        this.invoiceWarn = invoiceWarn;
    }

    public void setAvatar256(Object avatar256) {
        this.avatar256 = avatar256;
    }

    public void setMeetingCount(int meetingCount) {
        this.meetingCount = meetingCount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setIsCanPublish(boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public void setSlideChannelIdsAsList(List<SlideChannel> slideChannelIdsAsList) {
        this.slideChannelIdsAsList = slideChannelIdsAsList;
    }

    public void setSlideChannelIds(List<Integer> slideChannelIds) {
        this.slideChannelIds = slideChannelIds;
    }

    public void setImage512(Object image512) {
        this.image512 = image512;
    }

    public void setMicrosoftCalendarRtoken(String microsoftCalendarRtoken) {
        this.microsoftCalendarRtoken = microsoftCalendarRtoken;
    }

    public void setSelGroups4142(Object selGroups4142) {
        this.selGroups4142 = selGroups4142;
    }

    public void setPrivateStreet(String privateStreet) {
        this.privateStreet = privateStreet;
    }

    public void setActivityUserIdAsObject(ResUsers activityUserIdAsObject) {
        this.activityUserIdAsObject = activityUserIdAsObject;
    }

    public void setActivityUserId(OdooId activityUserId) {
        this.activityUserId = activityUserId;
    }

    public void setHrPresenceState(Object hrPresenceState) {
        this.hrPresenceState = hrPresenceState;
    }

    public void setSundayLocationIdAsObject(HrWorkLocation sundayLocationIdAsObject) {
        this.sundayLocationIdAsObject = sundayLocationIdAsObject;
    }

    public void setSundayLocationId(OdooId sundayLocationId) {
        this.sundayLocationId = sundayLocationId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon;
    }

    public void setAvatar128(Object avatar128) {
        this.avatar128 = avatar128;
    }

    public void setOpportunityIdsAsList(List<CrmLead> opportunityIdsAsList) {
        this.opportunityIdsAsList = opportunityIdsAsList;
    }

    public void setOpportunityIds(List<Integer> opportunityIds) {
        this.opportunityIds = opportunityIds;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }

    public void setSelGroups5354(Object selGroups5354) {
        this.selGroups5354 = selGroups5354;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
    }

    public void setParentIdAsObject(ResPartner parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setTotalInvoiced(Object totalInvoiced) {
        this.totalInvoiced = totalInvoiced;
    }

    public void setEmailNormalized(String emailNormalized) {
        this.emailNormalized = emailNormalized;
    }

    public void setEmployeeCountryIdAsObject(ResCountry employeeCountryIdAsObject) {
        this.employeeCountryIdAsObject = employeeCountryIdAsObject;
    }

    public void setEmployeeCountryId(OdooId employeeCountryId) {
        this.employeeCountryId = employeeCountryId;
    }

    public void setHoursLastMonth(double hoursLastMonth) {
        this.hoursLastMonth = hoursLastMonth;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public void setMondayLocationIdAsObject(HrWorkLocation mondayLocationIdAsObject) {
        this.mondayLocationIdAsObject = mondayLocationIdAsObject;
    }

    public void setMondayLocationId(OdooId mondayLocationId) {
        this.mondayLocationId = mondayLocationId;
    }

    public void setBankAccountIdAsObject(ResPartnerBank bankAccountIdAsObject) {
        this.bankAccountIdAsObject = bankAccountIdAsObject;
    }

    public void setBankAccountId(OdooId bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setAllocationRemainingDisplay(String allocationRemainingDisplay) {
        this.allocationRemainingDisplay = allocationRemainingDisplay;
    }

    public void setActiveLangCount(int activeLangCount) {
        this.activeLangCount = activeLangCount;
    }

    public void setAccessesCount(int accessesCount) {
        this.accessesCount = accessesCount;
    }

    public void setGroupsCount(int groupsCount) {
        this.groupsCount = groupsCount;
    }

    public void setSelGroups11011(Object selGroups11011) {
        this.selGroups11011 = selGroups11011;
    }

    public void setCertificate(Object certificate) {
        this.certificate = certificate;
    }

    public void setSelGroups484950(Object selGroups484950) {
        this.selGroups484950 = selGroups484950;
    }

    public void setCreateEmployeeIdAsObject(HrEmployee createEmployeeIdAsObject) {
        this.createEmployeeIdAsObject = createEmployeeIdAsObject;
    }

    public void setCreateEmployeeId(OdooId createEmployeeId) {
        this.createEmployeeId = createEmployeeId;
    }

    public void setCrmTeamIdsAsList(List<CrmTeam> crmTeamIdsAsList) {
        this.crmTeamIdsAsList = crmTeamIdsAsList;
    }

    public void setCrmTeamIds(List<Integer> crmTeamIds) {
        this.crmTeamIds = crmTeamIds;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setStudySchool(String studySchool) {
        this.studySchool = studySchool;
    }

    public void setCustomerRank(int customerRank) {
        this.customerRank = customerRank;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPartnerGid(int partnerGid) {
        this.partnerGid = partnerGid;
    }

    public void setEmployeeSkillIdsAsList(List<HrEmployeeSkill> employeeSkillIdsAsList) {
        this.employeeSkillIdsAsList = employeeSkillIdsAsList;
    }

    public void setEmployeeSkillIds(List<Integer> employeeSkillIds) {
        this.employeeSkillIds = employeeSkillIds;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setLang(Object lang) {
        this.lang = lang;
    }

    public void setLastCheckIn(Date lastCheckIn) {
        this.lastCheckIn = lastCheckIn;
    }

    public void setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted;
    }

    public void setActivityTypeIcon(String activityTypeIcon) {
        this.activityTypeIcon = activityTypeIcon;
    }

    public void setAttendanceState(Object attendanceState) {
        this.attendanceState = attendanceState;
    }

    public void setDuplicatedBankAccountPartnersCount(int duplicatedBankAccountPartnersCount) {
        this.duplicatedBankAccountPartnersCount = duplicatedBankAccountPartnersCount;
    }

    public void setPropertyAccountReceivableIdAsObject(Account propertyAccountReceivableIdAsObject) {
        this.propertyAccountReceivableIdAsObject = propertyAccountReceivableIdAsObject;
    }

    public void setPropertyAccountReceivableId(OdooId propertyAccountReceivableId) {
        this.propertyAccountReceivableId = propertyAccountReceivableId;
    }

    public void setWorkLocationIdAsObject(HrWorkLocation workLocationIdAsObject) {
        this.workLocationIdAsObject = workLocationIdAsObject;
    }

    public void setWorkLocationId(OdooId workLocationId) {
        this.workLocationId = workLocationId;
    }

    public void setMeetingIdsAsList(List<CalendarEvent> meetingIdsAsList) {
        this.meetingIdsAsList = meetingIdsAsList;
    }

    public void setMeetingIds(List<Integer> meetingIds) {
        this.meetingIds = meetingIds;
    }

    public void setPrivateZip(String privateZip) {
        this.privateZip = privateZip;
    }

    public void setIsPhoneSanitizedBlacklisted(boolean isPhoneSanitizedBlacklisted) {
        this.isPhoneSanitizedBlacklisted = isPhoneSanitizedBlacklisted;
    }

    public void setBadgeIdsAsList(List<GamificationBadgeUser> badgeIdsAsList) {
        this.badgeIdsAsList = badgeIdsAsList;
    }

    public void setBadgeIds(List<Integer> badgeIds) {
        this.badgeIds = badgeIds;
    }

    public void setVisaExpire(Object visaExpire) {
        this.visaExpire = visaExpire;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setCoachIdAsObject(HrEmployee coachIdAsObject) {
        this.coachIdAsObject = coachIdAsObject;
    }

    public void setCoachId(OdooId coachId) {
        this.coachId = coachId;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setKmHomeWork(int kmHomeWork) {
        this.kmHomeWork = kmHomeWork;
    }

    public void setActivitySummary(String activitySummary) {
        this.activitySummary = activitySummary;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setPropertySupplierPaymentTermIdAsObject(AccountPaymentTerm propertySupplierPaymentTermIdAsObject) {
        this.propertySupplierPaymentTermIdAsObject = propertySupplierPaymentTermIdAsObject;
    }

    public void setPropertySupplierPaymentTermId(OdooId propertySupplierPaymentTermId) {
        this.propertySupplierPaymentTermId = propertySupplierPaymentTermId;
    }

    public void setPhoneSanitized(String phoneSanitized) {
        this.phoneSanitized = phoneSanitized;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setAdditionalNote(Object additionalNote) {
        this.additionalNote = additionalNote;
    }



}