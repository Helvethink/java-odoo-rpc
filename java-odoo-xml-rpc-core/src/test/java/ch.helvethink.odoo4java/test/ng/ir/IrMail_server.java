
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

package ch.helvethink.odoo4java.test.ng.ir;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("ir.mail_server")
public class IrMail_server implements OdooObj {

    
    private Object smtpEncryption;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object smtpAuthentication;

    
    private String googleGmailAuthorizationCode;

    
    private String smtpHost;

    
    private String googleGmailAccessToken;

    
    private String smtpUser;

    
    private String googleGmailUri;

    
    private String googleGmailRefreshToken;

    
    private boolean isSmtpDebug;

    
    private int id;

    
    private List<MailTemplate> mailTemplateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private List<Integer> mailTemplateIds;

    
    private Date createDate;

    
    private String smtpPass;

    
    private Object smtpAuthenticationInfo;

    
    private boolean isActive;

    
    private Object smtpSslCertificate;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int sequence;

    
    private int smtpPort;

    
    private String fromFilter;

    
    private int googleGmailAccessTokenExpiration;

    
    private String name;

    
    private Object smtpSslPrivateKey;


    public IrMail_server() {
    // Constructor
    }


    public Object getSmtpEncryption() {
        return smtpEncryption;
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

    public Object getSmtpAuthentication() {
        return smtpAuthentication;
    }

    public String getGoogleGmailAuthorizationCode() {
        return googleGmailAuthorizationCode;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public String getGoogleGmailAccessToken() {
        return googleGmailAccessToken;
    }

    public String getSmtpUser() {
        return smtpUser;
    }

    public String getGoogleGmailUri() {
        return googleGmailUri;
    }

    public String getGoogleGmailRefreshToken() {
        return googleGmailRefreshToken;
    }

    public boolean getIsSmtpDebug() {
        return isSmtpDebug;
    }

    public int getId() {
        return id;
    }

    public List<MailTemplate> getMailTemplateIdsAsList() {
        return mailTemplateIdsAsList;
    }

    public List<Integer> getMailTemplateIds() {
        return mailTemplateIds;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getSmtpPass() {
        return smtpPass;
    }

    public Object getSmtpAuthenticationInfo() {
        return smtpAuthenticationInfo;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getSmtpSslCertificate() {
        return smtpSslCertificate;
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

    public int getSequence() {
        return sequence;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public String getFromFilter() {
        return fromFilter;
    }

    public int getGoogleGmailAccessTokenExpiration() {
        return googleGmailAccessTokenExpiration;
    }

    public String getName() {
        return name;
    }

    public Object getSmtpSslPrivateKey() {
        return smtpSslPrivateKey;
    }



    public void setSmtpEncryption(Object smtpEncryption) {
        this.smtpEncryption = smtpEncryption;
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

    public void setSmtpAuthentication(Object smtpAuthentication) {
        this.smtpAuthentication = smtpAuthentication;
    }

    public void setGoogleGmailAuthorizationCode(String googleGmailAuthorizationCode) {
        this.googleGmailAuthorizationCode = googleGmailAuthorizationCode;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public void setGoogleGmailAccessToken(String googleGmailAccessToken) {
        this.googleGmailAccessToken = googleGmailAccessToken;
    }

    public void setSmtpUser(String smtpUser) {
        this.smtpUser = smtpUser;
    }

    public void setGoogleGmailUri(String googleGmailUri) {
        this.googleGmailUri = googleGmailUri;
    }

    public void setGoogleGmailRefreshToken(String googleGmailRefreshToken) {
        this.googleGmailRefreshToken = googleGmailRefreshToken;
    }

    public void setIsSmtpDebug(boolean isSmtpDebug) {
        this.isSmtpDebug = isSmtpDebug;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailTemplateIdsAsList(List<MailTemplate> mailTemplateIdsAsList) {
        this.mailTemplateIdsAsList = mailTemplateIdsAsList;
    }

    public void setMailTemplateIds(List<Integer> mailTemplateIds) {
        this.mailTemplateIds = mailTemplateIds;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setSmtpPass(String smtpPass) {
        this.smtpPass = smtpPass;
    }

    public void setSmtpAuthenticationInfo(Object smtpAuthenticationInfo) {
        this.smtpAuthenticationInfo = smtpAuthenticationInfo;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setSmtpSslCertificate(Object smtpSslCertificate) {
        this.smtpSslCertificate = smtpSslCertificate;
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

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    public void setFromFilter(String fromFilter) {
        this.fromFilter = fromFilter;
    }

    public void setGoogleGmailAccessTokenExpiration(int googleGmailAccessTokenExpiration) {
        this.googleGmailAccessTokenExpiration = googleGmailAccessTokenExpiration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSmtpSslPrivateKey(Object smtpSslPrivateKey) {
        this.smtpSslPrivateKey = smtpSslPrivateKey;
    }



}