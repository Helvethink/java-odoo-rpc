
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

package ch.helvethink.odoo4java.test.ng.crm.activity;

import ch.helvethink.odoo4java.test.ng.crm.CrmTeam;
import ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType;
import ch.helvethink.odoo4java.test.ng.crm.CrmLead;
import ch.helvethink.odoo4java.test.ng.crm.CrmStage;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.crm.CrmTag;;

@OdooObject("crm.activity.report")
public class CrmActivityReport implements OdooObj {

    
    private Date date;

    
    private Date leadCreateDate;

    
    private List<CrmTag> tagIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTag")
        @OdooModel("crm.CrmTag")
    
    private List<Integer> tagIds;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private CrmStage stageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmStage")
        @OdooModel("crm.CrmStage")
    
    private OdooId stageId;

    
    private boolean isActive;

    
    private Object dateDeadline;

    
    private CrmTeam teamIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmTeam")
        @OdooModel("crm.CrmTeam")
    
    private OdooId teamId;

    
    private Object body;

    
    private String displayName;

    
    private MailActivityType mailActivityTypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.activity.MailActivityType")
        @OdooModel("mail.activity.MailActivityType")
    
    private OdooId mailActivityTypeId;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Date dateClosed;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Object leadType;

    
    private int id;

    
    private Date dateConversion;

    
    private ResPartner authorIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId authorId;

    
    private CrmLead leadIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.crm.CrmLead")
        @OdooModel("crm.CrmLead")
    
    private OdooId leadId;

    
    private MailMessageSubtype subtypeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype")
        @OdooModel("mail.message.MailMessageSubtype")
    
    private OdooId subtypeId;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;


    public CrmActivityReport() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public Date getLeadCreateDate() {
        return leadCreateDate;
    }

    public List<CrmTag> getTagIdsAsList() {
        return tagIdsAsList;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public CrmStage getStageIdAsObject() {
        return stageIdAsObject;
    }

    public OdooId getStageId() {
        return stageId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getDateDeadline() {
        return dateDeadline;
    }

    public CrmTeam getTeamIdAsObject() {
        return teamIdAsObject;
    }

    public OdooId getTeamId() {
        return teamId;
    }

    public Object getBody() {
        return body;
    }

    public String getDisplayName() {
        return displayName;
    }

    public MailActivityType getMailActivityTypeIdAsObject() {
        return mailActivityTypeIdAsObject;
    }

    public OdooId getMailActivityTypeId() {
        return mailActivityTypeId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Date getDateClosed() {
        return dateClosed;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Object getLeadType() {
        return leadType;
    }

    public int getId() {
        return id;
    }

    public Date getDateConversion() {
        return dateConversion;
    }

    public ResPartner getAuthorIdAsObject() {
        return authorIdAsObject;
    }

    public OdooId getAuthorId() {
        return authorId;
    }

    public CrmLead getLeadIdAsObject() {
        return leadIdAsObject;
    }

    public OdooId getLeadId() {
        return leadId;
    }

    public MailMessageSubtype getSubtypeIdAsObject() {
        return subtypeIdAsObject;
    }

    public OdooId getSubtypeId() {
        return subtypeId;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setLeadCreateDate(Date leadCreateDate) {
        this.leadCreateDate = leadCreateDate;
    }

    public void setTagIdsAsList(List<CrmTag> tagIdsAsList) {
        this.tagIdsAsList = tagIdsAsList;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setStageIdAsObject(CrmStage stageIdAsObject) {
        this.stageIdAsObject = stageIdAsObject;
    }

    public void setStageId(OdooId stageId) {
        this.stageId = stageId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setDateDeadline(Object dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setTeamIdAsObject(CrmTeam teamIdAsObject) {
        this.teamIdAsObject = teamIdAsObject;
    }

    public void setTeamId(OdooId teamId) {
        this.teamId = teamId;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setMailActivityTypeIdAsObject(MailActivityType mailActivityTypeIdAsObject) {
        this.mailActivityTypeIdAsObject = mailActivityTypeIdAsObject;
    }

    public void setMailActivityTypeId(OdooId mailActivityTypeId) {
        this.mailActivityTypeId = mailActivityTypeId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setLeadType(Object leadType) {
        this.leadType = leadType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateConversion(Date dateConversion) {
        this.dateConversion = dateConversion;
    }

    public void setAuthorIdAsObject(ResPartner authorIdAsObject) {
        this.authorIdAsObject = authorIdAsObject;
    }

    public void setAuthorId(OdooId authorId) {
        this.authorId = authorId;
    }

    public void setLeadIdAsObject(CrmLead leadIdAsObject) {
        this.leadIdAsObject = leadIdAsObject;
    }

    public void setLeadId(OdooId leadId) {
        this.leadId = leadId;
    }

    public void setSubtypeIdAsObject(MailMessageSubtype subtypeIdAsObject) {
        this.subtypeIdAsObject = subtypeIdAsObject;
    }

    public void setSubtypeId(OdooId subtypeId) {
        this.subtypeId = subtypeId;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}