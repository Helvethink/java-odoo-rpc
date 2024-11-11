
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

package ch.helvethink.odoo4java.test.ng.hr.recruitment;

import ch.helvethink.odoo4java.test.ng.utm.UtmMedium;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.hr.HrJob;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.mail.MailAlias;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.utm.UtmSource;;

@OdooObject("hr.recruitment.source")
public class HrRecruitmentSource implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private MailAlias aliasIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailAlias")
        @OdooModel("mail.MailAlias")
    
    private OdooId aliasId;

    
    private String hasDomain;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String url;

    
    private HrJob jobIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrJob")
        @OdooModel("hr.HrJob")
    
    private OdooId jobId;

    
    private String name;

    
    private UtmSource sourceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmSource")
        @OdooModel("utm.UtmSource")
    
    private OdooId sourceId;

    
    private int id;

    
    private UtmMedium mediumIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.utm.UtmMedium")
        @OdooModel("utm.UtmMedium")
    
    private OdooId mediumId;

    
    private Date createDate;

    
    private String email;


    public HrRecruitmentSource() {
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

    public MailAlias getAliasIdAsObject() {
        return aliasIdAsObject;
    }

    public OdooId getAliasId() {
        return aliasId;
    }

    public String getHasDomain() {
        return hasDomain;
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

    public String getUrl() {
        return url;
    }

    public HrJob getJobIdAsObject() {
        return jobIdAsObject;
    }

    public OdooId getJobId() {
        return jobId;
    }

    public String getName() {
        return name;
    }

    public UtmSource getSourceIdAsObject() {
        return sourceIdAsObject;
    }

    public OdooId getSourceId() {
        return sourceId;
    }

    public int getId() {
        return id;
    }

    public UtmMedium getMediumIdAsObject() {
        return mediumIdAsObject;
    }

    public OdooId getMediumId() {
        return mediumId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getEmail() {
        return email;
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

    public void setAliasIdAsObject(MailAlias aliasIdAsObject) {
        this.aliasIdAsObject = aliasIdAsObject;
    }

    public void setAliasId(OdooId aliasId) {
        this.aliasId = aliasId;
    }

    public void setHasDomain(String hasDomain) {
        this.hasDomain = hasDomain;
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

    public void setUrl(String url) {
        this.url = url;
    }

    public void setJobIdAsObject(HrJob jobIdAsObject) {
        this.jobIdAsObject = jobIdAsObject;
    }

    public void setJobId(OdooId jobId) {
        this.jobId = jobId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSourceIdAsObject(UtmSource sourceIdAsObject) {
        this.sourceIdAsObject = sourceIdAsObject;
    }

    public void setSourceId(OdooId sourceId) {
        this.sourceId = sourceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMediumIdAsObject(UtmMedium mediumIdAsObject) {
        this.mediumIdAsObject = mediumIdAsObject;
    }

    public void setMediumId(OdooId mediumId) {
        this.mediumId = mediumId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}