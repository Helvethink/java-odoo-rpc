
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

package ch.helvethink.odoo4java.test.ng.hr;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.mail.MailAlias;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.hr.contract.HrContractType;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.hr.HrApplicant;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;;

@OdooObject("hr.job")
public class HrJob implements OdooObj {

    
    private boolean isIsSeoOptimized;

    
    private Date writeDate;

    
    private int allApplicationCount;

    
    private String websiteMetaTitle;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private int oldApplicationCount;

    
    private boolean isIsPublished;

    
    private Object aliasBouncedContent;

    
    private HrContractType contractTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.contract.HrContractType")
        @OdooModel("hr.contract.HrContractType")
    
    private OdooId contractTypeId;

    
    private int noOfRecruitment;

    
    private Object aliasContact;

    
    private int messageHasErrorCounter;

    
    private int aliasParentThreadId;

    
    private boolean isCanPublish;

    
    private boolean isHasMessage;

    
    private boolean isAliasIncomingLocal;

    
    private int id;

    
    private Date createDate;

    
    private List<ResUsers> favoriteUserIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> favoriteUserIds;

    
    private List<IrAttachment> documentIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private List<Integer> documentIds;

    
    private IrModel aliasParentModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasParentModelId;

    
    private int messageAttachmentCount;

    
    private int noOfHiredEmployee;

    
    private int expectedEmployees;

    
    private List<HrEmployee> employeeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private List<Integer> employeeIds;

    
    private ResPartner addressIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId addressId;

    
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

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private int sequence;

    
    private Object websiteMetaDescription;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private int activitiesToday;

    
    private String name;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;

    
    private String aliasEmail;

    
    private int activitiesOverdue;

    
    private String websiteMetaKeywords;

    
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

    
    private Object description;

    
    private List<ResUsers> interviewerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> interviewerIds;

    
    private String aliasFullName;

    
    private Object applicantPropertiesDefinition;

    
    private IrModel aliasModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasModelId;

    
    private HrEmployee managerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId managerId;

    
    private int applicantHired;

    
    private Object requirements;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private int applicationCount;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private List<HrApplicant> applicationIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrApplicant")
        @OdooModel("hr.HrApplicant")
    
    private List<Integer> applicationIds;

    
    private int noOfEmployee;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private Object jobDetails;

    
    private boolean isMessageHasSmsError;

    
    private boolean isWebsitePublished;

    
    private int newApplicationCount;

    
    private String aliasName;

    
    private String aliasDomain;

    
    private boolean isMessageHasError;

    
    private String websiteUrl;

    
    private boolean isMessageNeedaction;

    
    private int messageNeedactionCounter;

    
    private Object websiteDescription;

    
    private String websiteMetaOgImg;

    
    private String seoName;

    
    private int aliasForceThreadId;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private List<ResUsers> extendedInterviewerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private List<Integer> extendedInterviewerIds;

    
    private Object aliasStatus;

    
    private Object publishedDate;

    
    private int documentsCount;

    
    private Object aliasDefaults;


    public HrJob() {
    // Constructor
    }


    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public int getAllApplicationCount() {
        return allApplicationCount;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public int getOldApplicationCount() {
        return oldApplicationCount;
    }

    public boolean getIsIsPublished() {
        return isIsPublished;
    }

    public Object getAliasBouncedContent() {
        return aliasBouncedContent;
    }

    public HrContractType getContractTypeIdAsObject() {
        return contractTypeIdAsObject;
    }

    public OdooId getContractTypeId() {
        return contractTypeId;
    }

    public int getNoOfRecruitment() {
        return noOfRecruitment;
    }

    public Object getAliasContact() {
        return aliasContact;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public int getAliasParentThreadId() {
        return aliasParentThreadId;
    }

    public boolean getIsCanPublish() {
        return isCanPublish;
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

    public List<ResUsers> getFavoriteUserIdsAsList() {
        return favoriteUserIdsAsList;
    }

    public List<Integer> getFavoriteUserIds() {
        return favoriteUserIds;
    }

    public List<IrAttachment> getDocumentIdsAsList() {
        return documentIdsAsList;
    }

    public List<Integer> getDocumentIds() {
        return documentIds;
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

    public int getNoOfHiredEmployee() {
        return noOfHiredEmployee;
    }

    public int getExpectedEmployees() {
        return expectedEmployees;
    }

    public List<HrEmployee> getEmployeeIdsAsList() {
        return employeeIdsAsList;
    }

    public List<Integer> getEmployeeIds() {
        return employeeIds;
    }

    public ResPartner getAddressIdAsObject() {
        return addressIdAsObject;
    }

    public OdooId getAddressId() {
        return addressId;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public int getSequence() {
        return sequence;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public int getActivitiesToday() {
        return activitiesToday;
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

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
    }

    public String getAliasEmail() {
        return aliasEmail;
    }

    public int getActivitiesOverdue() {
        return activitiesOverdue;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
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

    public Object getDescription() {
        return description;
    }

    public List<ResUsers> getInterviewerIdsAsList() {
        return interviewerIdsAsList;
    }

    public List<Integer> getInterviewerIds() {
        return interviewerIds;
    }

    public String getAliasFullName() {
        return aliasFullName;
    }

    public Object getApplicantPropertiesDefinition() {
        return applicantPropertiesDefinition;
    }

    public IrModel getAliasModelIdAsObject() {
        return aliasModelIdAsObject;
    }

    public OdooId getAliasModelId() {
        return aliasModelId;
    }

    public HrEmployee getManagerIdAsObject() {
        return managerIdAsObject;
    }

    public OdooId getManagerId() {
        return managerId;
    }

    public int getApplicantHired() {
        return applicantHired;
    }

    public Object getRequirements() {
        return requirements;
    }

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
    }

    public int getApplicationCount() {
        return applicationCount;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public List<HrApplicant> getApplicationIdsAsList() {
        return applicationIdsAsList;
    }

    public List<Integer> getApplicationIds() {
        return applicationIds;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public Object getJobDetails() {
        return jobDetails;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public boolean getIsWebsitePublished() {
        return isWebsitePublished;
    }

    public int getNewApplicationCount() {
        return newApplicationCount;
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

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public Object getWebsiteDescription() {
        return websiteDescription;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public String getSeoName() {
        return seoName;
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

    public List<ResUsers> getExtendedInterviewerIdsAsList() {
        return extendedInterviewerIdsAsList;
    }

    public List<Integer> getExtendedInterviewerIds() {
        return extendedInterviewerIds;
    }

    public Object getAliasStatus() {
        return aliasStatus;
    }

    public Object getPublishedDate() {
        return publishedDate;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public Object getAliasDefaults() {
        return aliasDefaults;
    }



    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAllApplicationCount(int allApplicationCount) {
        this.allApplicationCount = allApplicationCount;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setOldApplicationCount(int oldApplicationCount) {
        this.oldApplicationCount = oldApplicationCount;
    }

    public void setIsIsPublished(boolean isIsPublished) {
        this.isIsPublished = isIsPublished;
    }

    public void setAliasBouncedContent(Object aliasBouncedContent) {
        this.aliasBouncedContent = aliasBouncedContent;
    }

    public void setContractTypeIdAsObject(HrContractType contractTypeIdAsObject) {
        this.contractTypeIdAsObject = contractTypeIdAsObject;
    }

    public void setContractTypeId(OdooId contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public void setNoOfRecruitment(int noOfRecruitment) {
        this.noOfRecruitment = noOfRecruitment;
    }

    public void setAliasContact(Object aliasContact) {
        this.aliasContact = aliasContact;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setAliasParentThreadId(int aliasParentThreadId) {
        this.aliasParentThreadId = aliasParentThreadId;
    }

    public void setIsCanPublish(boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
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

    public void setFavoriteUserIdsAsList(List<ResUsers> favoriteUserIdsAsList) {
        this.favoriteUserIdsAsList = favoriteUserIdsAsList;
    }

    public void setFavoriteUserIds(List<Integer> favoriteUserIds) {
        this.favoriteUserIds = favoriteUserIds;
    }

    public void setDocumentIdsAsList(List<IrAttachment> documentIdsAsList) {
        this.documentIdsAsList = documentIdsAsList;
    }

    public void setDocumentIds(List<Integer> documentIds) {
        this.documentIds = documentIds;
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

    public void setNoOfHiredEmployee(int noOfHiredEmployee) {
        this.noOfHiredEmployee = noOfHiredEmployee;
    }

    public void setExpectedEmployees(int expectedEmployees) {
        this.expectedEmployees = expectedEmployees;
    }

    public void setEmployeeIdsAsList(List<HrEmployee> employeeIdsAsList) {
        this.employeeIdsAsList = employeeIdsAsList;
    }

    public void setEmployeeIds(List<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public void setAddressIdAsObject(ResPartner addressIdAsObject) {
        this.addressIdAsObject = addressIdAsObject;
    }

    public void setAddressId(OdooId addressId) {
        this.addressId = addressId;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setActivitiesToday(int activitiesToday) {
        this.activitiesToday = activitiesToday;
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

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }

    public void setAliasEmail(String aliasEmail) {
        this.aliasEmail = aliasEmail;
    }

    public void setActivitiesOverdue(int activitiesOverdue) {
        this.activitiesOverdue = activitiesOverdue;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
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

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setInterviewerIdsAsList(List<ResUsers> interviewerIdsAsList) {
        this.interviewerIdsAsList = interviewerIdsAsList;
    }

    public void setInterviewerIds(List<Integer> interviewerIds) {
        this.interviewerIds = interviewerIds;
    }

    public void setAliasFullName(String aliasFullName) {
        this.aliasFullName = aliasFullName;
    }

    public void setApplicantPropertiesDefinition(Object applicantPropertiesDefinition) {
        this.applicantPropertiesDefinition = applicantPropertiesDefinition;
    }

    public void setAliasModelIdAsObject(IrModel aliasModelIdAsObject) {
        this.aliasModelIdAsObject = aliasModelIdAsObject;
    }

    public void setAliasModelId(OdooId aliasModelId) {
        this.aliasModelId = aliasModelId;
    }

    public void setManagerIdAsObject(HrEmployee managerIdAsObject) {
        this.managerIdAsObject = managerIdAsObject;
    }

    public void setManagerId(OdooId managerId) {
        this.managerId = managerId;
    }

    public void setApplicantHired(int applicantHired) {
        this.applicantHired = applicantHired;
    }

    public void setRequirements(Object requirements) {
        this.requirements = requirements;
    }

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
    }

    public void setApplicationCount(int applicationCount) {
        this.applicationCount = applicationCount;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setApplicationIdsAsList(List<HrApplicant> applicationIdsAsList) {
        this.applicationIdsAsList = applicationIdsAsList;
    }

    public void setApplicationIds(List<Integer> applicationIds) {
        this.applicationIds = applicationIds;
    }

    public void setNoOfEmployee(int noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setJobDetails(Object jobDetails) {
        this.jobDetails = jobDetails;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setIsWebsitePublished(boolean isWebsitePublished) {
        this.isWebsitePublished = isWebsitePublished;
    }

    public void setNewApplicationCount(int newApplicationCount) {
        this.newApplicationCount = newApplicationCount;
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

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setWebsiteDescription(Object websiteDescription) {
        this.websiteDescription = websiteDescription;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
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

    public void setExtendedInterviewerIdsAsList(List<ResUsers> extendedInterviewerIdsAsList) {
        this.extendedInterviewerIdsAsList = extendedInterviewerIdsAsList;
    }

    public void setExtendedInterviewerIds(List<Integer> extendedInterviewerIds) {
        this.extendedInterviewerIds = extendedInterviewerIds;
    }

    public void setAliasStatus(Object aliasStatus) {
        this.aliasStatus = aliasStatus;
    }

    public void setPublishedDate(Object publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setDocumentsCount(int documentsCount) {
        this.documentsCount = documentsCount;
    }

    public void setAliasDefaults(Object aliasDefaults) {
        this.aliasDefaults = aliasDefaults;
    }



}