
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

package ch.helvethink.odoo4java.test.ng.applicant.send;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrApplicant;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("applicant.send.mail")
public class ApplicantSendMail implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String subject;

    
    private boolean isIsMailTemplateEditor;

    
    private Object body;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String renderModel;

    
    private List<HrApplicant> applicantIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrApplicant")
        @OdooModel("hr.HrApplicant")
    
    private List<Integer> applicantIds;

    
    private boolean isBodyHasTemplateValue;

    
    private boolean isCanEditBody;

    
    private MailTemplate templateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId templateId;

    
    private int id;

    
    private String lang;

    
    private ResPartner authorIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId authorId;

    
    private Date createDate;


    public ApplicantSendMail() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getSubject() {
        return subject;
    }

    public boolean getIsIsMailTemplateEditor() {
        return isIsMailTemplateEditor;
    }

    public Object getBody() {
        return body;
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

    public String getRenderModel() {
        return renderModel;
    }

    public List<HrApplicant> getApplicantIdsAsList() {
        return applicantIdsAsList;
    }

    public List<Integer> getApplicantIds() {
        return applicantIds;
    }

    public boolean getIsBodyHasTemplateValue() {
        return isBodyHasTemplateValue;
    }

    public boolean getIsCanEditBody() {
        return isCanEditBody;
    }

    public MailTemplate getTemplateIdAsObject() {
        return templateIdAsObject;
    }

    public OdooId getTemplateId() {
        return templateId;
    }

    public int getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }

    public ResPartner getAuthorIdAsObject() {
        return authorIdAsObject;
    }

    public OdooId getAuthorId() {
        return authorId;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setIsIsMailTemplateEditor(boolean isIsMailTemplateEditor) {
        this.isIsMailTemplateEditor = isIsMailTemplateEditor;
    }

    public void setBody(Object body) {
        this.body = body;
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

    public void setRenderModel(String renderModel) {
        this.renderModel = renderModel;
    }

    public void setApplicantIdsAsList(List<HrApplicant> applicantIdsAsList) {
        this.applicantIdsAsList = applicantIdsAsList;
    }

    public void setApplicantIds(List<Integer> applicantIds) {
        this.applicantIds = applicantIds;
    }

    public void setIsBodyHasTemplateValue(boolean isBodyHasTemplateValue) {
        this.isBodyHasTemplateValue = isBodyHasTemplateValue;
    }

    public void setIsCanEditBody(boolean isCanEditBody) {
        this.isCanEditBody = isCanEditBody;
    }

    public void setTemplateIdAsObject(MailTemplate templateIdAsObject) {
        this.templateIdAsObject = templateIdAsObject;
    }

    public void setTemplateId(OdooId templateId) {
        this.templateId = templateId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setAuthorIdAsObject(ResPartner authorIdAsObject) {
        this.authorIdAsObject = authorIdAsObject;
    }

    public void setAuthorId(OdooId authorId) {
        this.authorId = authorId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}