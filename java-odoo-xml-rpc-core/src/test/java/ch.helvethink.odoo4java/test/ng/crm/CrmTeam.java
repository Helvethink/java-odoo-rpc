
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

package ch.helvethink.odoo4java.test.ng.crm;

import ch.helvethink.odoo4java.test.ng.crm.team.CrmTeamMember;
import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.mail.MailAlias;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;;

@OdooObject("crm.team")
public class CrmTeam implements OdooObj {

    
    private Date writeDate;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private boolean isAssignmentAutoEnabled;

    
    private Object aliasBouncedContent;

    
    private List<ResUsers> memberIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> memberIds;

    
    private String dashboardButtonName;

    
    private Object opportunitiesAmount;

    
    private Object aliasContact;

    
    private boolean isAssignmentOptout;

    
    private int messageHasErrorCounter;

    
    private int aliasParentThreadId;

    
    private boolean isHasMessage;

    
    private boolean isAliasIncomingLocal;

    
    private int id;

    
    private Date createDate;

    
    private int assignmentMax;

    
    private boolean isUseOpportunities;

    
    private List<ResUsers> favoriteUserIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> favoriteUserIds;

    
    private IrModel aliasParentModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasParentModelId;

    
    private int messageAttachmentCount;

    
    private List<CrmTeamMember> crmTeamMemberIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.team.CrmTeamMember")
        @OdooModel("crm.team.CrmTeamMember")
    
    private List<Integer> crmTeamMemberIds;

    
    private double invoiced;

    
    private boolean isActive;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object memberWarning;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private int sequence;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private double invoicedTarget;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private int salesToInvoiceCount;

    
    private List<CrmTeamMember> crmTeamMemberAllIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.team.CrmTeamMember")
        @OdooModel("crm.team.CrmTeamMember")
    
    private List<Integer> crmTeamMemberAllIds;

    
    private int opportunitiesOverdueCount;

    
    private String aliasEmail;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsFavorite;

    
    private int color;

    
    private MailAlias aliasIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailAlias")
        @OdooModel("mail.MailAlias")
    
    private OdooId aliasId;

    
    private String aliasFullName;

    
    private String assignmentDomain;

    
    private IrModel aliasModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasModelId;

    
    private int quotationsCount;

    
    private boolean isIsMembershipMulti;

    
    private Object opportunitiesOverdueAmount;

    
    private int opportunitiesCount;

    
    private boolean isUseLeads;

    
    private int leadUnassignedCount;

    
    private Object dashboardGraphData;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<ResCompany> memberCompanyIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private List<Integer> memberCompanyIds;

    
    private boolean isMessageHasSmsError;

    
    private String aliasName;

    
    private String aliasDomain;

    
    private boolean isMessageHasError;

    
    private Object leadPropertiesDefinition;

    
    private int saleOrderCount;

    
    private boolean isMessageNeedaction;

    
    private int messageNeedactionCounter;

    
    private int aliasForceThreadId;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private double quotationsAmount;

    
    private Object aliasStatus;

    
    private boolean isLeadAllAssignedMonthExceeded;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;

    
    private boolean isAssignmentEnabled;

    
    private int leadAllAssignedMonthCount;

    
    private Object aliasDefaults;


    public CrmTeam() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public boolean getIsAssignmentAutoEnabled() {
        return isAssignmentAutoEnabled;
    }

    public Object getAliasBouncedContent() {
        return aliasBouncedContent;
    }

    public List<ResUsers> getMemberIdsAsList() {
        return memberIdsAsList;
    }

    public List<Integer> getMemberIds() {
        return memberIds;
    }

    public String getDashboardButtonName() {
        return dashboardButtonName;
    }

    public Object getOpportunitiesAmount() {
        return opportunitiesAmount;
    }

    public Object getAliasContact() {
        return aliasContact;
    }

    public boolean getIsAssignmentOptout() {
        return isAssignmentOptout;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public int getAliasParentThreadId() {
        return aliasParentThreadId;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public boolean getIsAliasIncomingLocal() {
        return isAliasIncomingLocal;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getAssignmentMax() {
        return assignmentMax;
    }

    public boolean getIsUseOpportunities() {
        return isUseOpportunities;
    }

    public List<ResUsers> getFavoriteUserIdsAsList() {
        return favoriteUserIdsAsList;
    }

    public List<Integer> getFavoriteUserIds() {
        return favoriteUserIds;
    }

    public IrModel getAliasParentModelIdAsObject() {
        return aliasParentModelIdAsObject;
    }

    public OdooId getAliasParentModelId() {
        return aliasParentModelId;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public List<CrmTeamMember> getCrmTeamMemberIdsAsList() {
        return crmTeamMemberIdsAsList;
    }

    public List<Integer> getCrmTeamMemberIds() {
        return crmTeamMemberIds;
    }

    public double getInvoiced() {
        return invoiced;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
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

    public Object getMemberWarning() {
        return memberWarning;
    }

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public int getSequence() {
        return sequence;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public double getInvoicedTarget() {
        return invoicedTarget;
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

    public int getSalesToInvoiceCount() {
        return salesToInvoiceCount;
    }

    public List<CrmTeamMember> getCrmTeamMemberAllIdsAsList() {
        return crmTeamMemberAllIdsAsList;
    }

    public List<Integer> getCrmTeamMemberAllIds() {
        return crmTeamMemberAllIds;
    }

    public int getOpportunitiesOverdueCount() {
        return opportunitiesOverdueCount;
    }

    public String getAliasEmail() {
        return aliasEmail;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsIsFavorite() {
        return isIsFavorite;
    }

    public int getColor() {
        return color;
    }

    public MailAlias getAliasIdAsObject() {
        return aliasIdAsObject;
    }

    public OdooId getAliasId() {
        return aliasId;
    }

    public String getAliasFullName() {
        return aliasFullName;
    }

    public String getAssignmentDomain() {
        return assignmentDomain;
    }

    public IrModel getAliasModelIdAsObject() {
        return aliasModelIdAsObject;
    }

    public OdooId getAliasModelId() {
        return aliasModelId;
    }

    public int getQuotationsCount() {
        return quotationsCount;
    }

    public boolean getIsIsMembershipMulti() {
        return isIsMembershipMulti;
    }

    public Object getOpportunitiesOverdueAmount() {
        return opportunitiesOverdueAmount;
    }

    public int getOpportunitiesCount() {
        return opportunitiesCount;
    }

    public boolean getIsUseLeads() {
        return isUseLeads;
    }

    public int getLeadUnassignedCount() {
        return leadUnassignedCount;
    }

    public Object getDashboardGraphData() {
        return dashboardGraphData;
    }

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public List<ResCompany> getMemberCompanyIdsAsList() {
        return memberCompanyIdsAsList;
    }

    public List<Integer> getMemberCompanyIds() {
        return memberCompanyIds;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public String getAliasName() {
        return aliasName;
    }

    public String getAliasDomain() {
        return aliasDomain;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public Object getLeadPropertiesDefinition() {
        return leadPropertiesDefinition;
    }

    public int getSaleOrderCount() {
        return saleOrderCount;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public int getAliasForceThreadId() {
        return aliasForceThreadId;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public double getQuotationsAmount() {
        return quotationsAmount;
    }

    public Object getAliasStatus() {
        return aliasStatus;
    }

    public boolean getIsLeadAllAssignedMonthExceeded() {
        return isLeadAllAssignedMonthExceeded;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }

    public boolean getIsAssignmentEnabled() {
        return isAssignmentEnabled;
    }

    public int getLeadAllAssignedMonthCount() {
        return leadAllAssignedMonthCount;
    }

    public Object getAliasDefaults() {
        return aliasDefaults;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setIsAssignmentAutoEnabled(boolean isAssignmentAutoEnabled) {
        this.isAssignmentAutoEnabled = isAssignmentAutoEnabled;
    }

    public void setAliasBouncedContent(Object aliasBouncedContent) {
        this.aliasBouncedContent = aliasBouncedContent;
    }

    public void setMemberIdsAsList(List<ResUsers> memberIdsAsList) {
        this.memberIdsAsList = memberIdsAsList;
    }

    public void setMemberIds(List<Integer> memberIds) {
        this.memberIds = memberIds;
    }

    public void setDashboardButtonName(String dashboardButtonName) {
        this.dashboardButtonName = dashboardButtonName;
    }

    public void setOpportunitiesAmount(Object opportunitiesAmount) {
        this.opportunitiesAmount = opportunitiesAmount;
    }

    public void setAliasContact(Object aliasContact) {
        this.aliasContact = aliasContact;
    }

    public void setIsAssignmentOptout(boolean isAssignmentOptout) {
        this.isAssignmentOptout = isAssignmentOptout;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setAliasParentThreadId(int aliasParentThreadId) {
        this.aliasParentThreadId = aliasParentThreadId;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setIsAliasIncomingLocal(boolean isAliasIncomingLocal) {
        this.isAliasIncomingLocal = isAliasIncomingLocal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAssignmentMax(int assignmentMax) {
        this.assignmentMax = assignmentMax;
    }

    public void setIsUseOpportunities(boolean isUseOpportunities) {
        this.isUseOpportunities = isUseOpportunities;
    }

    public void setFavoriteUserIdsAsList(List<ResUsers> favoriteUserIdsAsList) {
        this.favoriteUserIdsAsList = favoriteUserIdsAsList;
    }

    public void setFavoriteUserIds(List<Integer> favoriteUserIds) {
        this.favoriteUserIds = favoriteUserIds;
    }

    public void setAliasParentModelIdAsObject(IrModel aliasParentModelIdAsObject) {
        this.aliasParentModelIdAsObject = aliasParentModelIdAsObject;
    }

    public void setAliasParentModelId(OdooId aliasParentModelId) {
        this.aliasParentModelId = aliasParentModelId;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setCrmTeamMemberIdsAsList(List<CrmTeamMember> crmTeamMemberIdsAsList) {
        this.crmTeamMemberIdsAsList = crmTeamMemberIdsAsList;
    }

    public void setCrmTeamMemberIds(List<Integer> crmTeamMemberIds) {
        this.crmTeamMemberIds = crmTeamMemberIds;
    }

    public void setInvoiced(double invoiced) {
        this.invoiced = invoiced;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
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

    public void setMemberWarning(Object memberWarning) {
        this.memberWarning = memberWarning;
    }

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setInvoicedTarget(double invoicedTarget) {
        this.invoicedTarget = invoicedTarget;
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

    public void setSalesToInvoiceCount(int salesToInvoiceCount) {
        this.salesToInvoiceCount = salesToInvoiceCount;
    }

    public void setCrmTeamMemberAllIdsAsList(List<CrmTeamMember> crmTeamMemberAllIdsAsList) {
        this.crmTeamMemberAllIdsAsList = crmTeamMemberAllIdsAsList;
    }

    public void setCrmTeamMemberAllIds(List<Integer> crmTeamMemberAllIds) {
        this.crmTeamMemberAllIds = crmTeamMemberAllIds;
    }

    public void setOpportunitiesOverdueCount(int opportunitiesOverdueCount) {
        this.opportunitiesOverdueCount = opportunitiesOverdueCount;
    }

    public void setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsIsFavorite(boolean isIsFavorite) {
        this.isIsFavorite = isIsFavorite;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setAliasIdAsObject(MailAlias aliasIdAsObject) {
        this.aliasIdAsObject = aliasIdAsObject;
    }

    public void setAliasId(OdooId aliasId) {
        this.aliasId = aliasId;
    }

    public void setAliasFullName(String aliasFullName) {
        this.aliasFullName = aliasFullName;
    }

    public void setAssignmentDomain(String assignmentDomain) {
        this.assignmentDomain = assignmentDomain;
    }

    public void setAliasModelIdAsObject(IrModel aliasModelIdAsObject) {
        this.aliasModelIdAsObject = aliasModelIdAsObject;
    }

    public void setAliasModelId(OdooId aliasModelId) {
        this.aliasModelId = aliasModelId;
    }

    public void setQuotationsCount(int quotationsCount) {
        this.quotationsCount = quotationsCount;
    }

    public void setIsIsMembershipMulti(boolean isIsMembershipMulti) {
        this.isIsMembershipMulti = isIsMembershipMulti;
    }

    public void setOpportunitiesOverdueAmount(Object opportunitiesOverdueAmount) {
        this.opportunitiesOverdueAmount = opportunitiesOverdueAmount;
    }

    public void setOpportunitiesCount(int opportunitiesCount) {
        this.opportunitiesCount = opportunitiesCount;
    }

    public void setIsUseLeads(boolean isUseLeads) {
        this.isUseLeads = isUseLeads;
    }

    public void setLeadUnassignedCount(int leadUnassignedCount) {
        this.leadUnassignedCount = leadUnassignedCount;
    }

    public void setDashboardGraphData(Object dashboardGraphData) {
        this.dashboardGraphData = dashboardGraphData;
    }

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setMemberCompanyIdsAsList(List<ResCompany> memberCompanyIdsAsList) {
        this.memberCompanyIdsAsList = memberCompanyIdsAsList;
    }

    public void setMemberCompanyIds(List<Integer> memberCompanyIds) {
        this.memberCompanyIds = memberCompanyIds;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setAliasDomain(String aliasDomain) {
        this.aliasDomain = aliasDomain;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setLeadPropertiesDefinition(Object leadPropertiesDefinition) {
        this.leadPropertiesDefinition = leadPropertiesDefinition;
    }

    public void setSaleOrderCount(int saleOrderCount) {
        this.saleOrderCount = saleOrderCount;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setAliasForceThreadId(int aliasForceThreadId) {
        this.aliasForceThreadId = aliasForceThreadId;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setQuotationsAmount(double quotationsAmount) {
        this.quotationsAmount = quotationsAmount;
    }

    public void setAliasStatus(Object aliasStatus) {
        this.aliasStatus = aliasStatus;
    }

    public void setIsLeadAllAssignedMonthExceeded(boolean isLeadAllAssignedMonthExceeded) {
        this.isLeadAllAssignedMonthExceeded = isLeadAllAssignedMonthExceeded;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }

    public void setIsAssignmentEnabled(boolean isAssignmentEnabled) {
        this.isAssignmentEnabled = isAssignmentEnabled;
    }

    public void setLeadAllAssignedMonthCount(int leadAllAssignedMonthCount) {
        this.leadAllAssignedMonthCount = leadAllAssignedMonthCount;
    }

    public void setAliasDefaults(Object aliasDefaults) {
        this.aliasDefaults = aliasDefaults;
    }



}