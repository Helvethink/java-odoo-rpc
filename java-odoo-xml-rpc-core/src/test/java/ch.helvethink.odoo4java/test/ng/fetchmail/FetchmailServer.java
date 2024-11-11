
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

package ch.helvethink.odoo4java.test.ng.fetchmail;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.mail.Mail;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("fetchmail.server")
public class FetchmailServer implements OdooObj {

    
    private Date date;

    
    private Date writeDate;

    
    private String server;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object configuration;

    
    private Object serverTypeInfo;

    
    private String googleGmailAuthorizationCode;

    
    private String googleGmailAccessToken;

    
    private String password;

    
    private String googleGmailUri;

    
    private boolean isIsSsl;

    
    private String googleGmailRefreshToken;

    
    private Object state;

    
    private boolean isAttach;

    
    private int id;

    
    private Date createDate;

    
    private boolean isOriginal;

    
    private boolean isActive;

    
    private int priority;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private IrModel objectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId objectId;

    
    private String script;

    
    private int port;

    
    private int googleGmailAccessTokenExpiration;

    
    private String name;

    
    private List<Mail> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.Mail")
        @OdooModel("mail.Mail")
    
    private List<Integer> messageIds;

    
    private String user;

    
    private Object serverType;


    public FetchmailServer() {
    // Constructor
    }


    public Date getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public String getServer() {
        return server;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getConfiguration() {
        return configuration;
    }

    public Object getServerTypeInfo() {
        return serverTypeInfo;
    }

    public String getGoogleGmailAuthorizationCode() {
        return googleGmailAuthorizationCode;
    }

    public String getGoogleGmailAccessToken() {
        return googleGmailAccessToken;
    }

    public String getPassword() {
        return password;
    }

    public String getGoogleGmailUri() {
        return googleGmailUri;
    }

    public boolean getIsIsSsl() {
        return isIsSsl;
    }

    public String getGoogleGmailRefreshToken() {
        return googleGmailRefreshToken;
    }

    public Object getState() {
        return state;
    }

    public boolean getIsAttach() {
        return isAttach;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsOriginal() {
        return isOriginal;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getPriority() {
        return priority;
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

    public IrModel getObjectIdAsObject() {
        return objectIdAsObject;
    }

    public OdooId getObjectId() {
        return objectId;
    }

    public String getScript() {
        return script;
    }

    public int getPort() {
        return port;
    }

    public int getGoogleGmailAccessTokenExpiration() {
        return googleGmailAccessTokenExpiration;
    }

    public String getName() {
        return name;
    }

    public List<Mail> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public String getUser() {
        return user;
    }

    public Object getServerType() {
        return serverType;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setConfiguration(Object configuration) {
        this.configuration = configuration;
    }

    public void setServerTypeInfo(Object serverTypeInfo) {
        this.serverTypeInfo = serverTypeInfo;
    }

    public void setGoogleGmailAuthorizationCode(String googleGmailAuthorizationCode) {
        this.googleGmailAuthorizationCode = googleGmailAuthorizationCode;
    }

    public void setGoogleGmailAccessToken(String googleGmailAccessToken) {
        this.googleGmailAccessToken = googleGmailAccessToken;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGoogleGmailUri(String googleGmailUri) {
        this.googleGmailUri = googleGmailUri;
    }

    public void setIsIsSsl(boolean isIsSsl) {
        this.isIsSsl = isIsSsl;
    }

    public void setGoogleGmailRefreshToken(String googleGmailRefreshToken) {
        this.googleGmailRefreshToken = googleGmailRefreshToken;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setIsAttach(boolean isAttach) {
        this.isAttach = isAttach;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsOriginal(boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

    public void setObjectIdAsObject(IrModel objectIdAsObject) {
        this.objectIdAsObject = objectIdAsObject;
    }

    public void setObjectId(OdooId objectId) {
        this.objectId = objectId;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setGoogleGmailAccessTokenExpiration(int googleGmailAccessTokenExpiration) {
        this.googleGmailAccessTokenExpiration = googleGmailAccessTokenExpiration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessageIdsAsList(List<Mail> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setServerType(Object serverType) {
        this.serverType = serverType;
    }



}