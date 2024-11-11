
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

package ch.helvethink.odoo4java.test.ng.mail;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.alias")
public class MailAlias implements OdooObj {

    
    private Date writeDate;

    
    private IrModel aliasParentModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasParentModelId;

    
    private MailAliasDomain aliasDomainIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.alias.MailAliasDomain")
        @OdooModel("mail.alias.MailAliasDomain")
    
    private OdooId aliasDomainId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Object aliasBouncedContent;

    
    private String aliasFullName;

    
    private String aliasName;

    
    private String displayName;

    
    private Object aliasContact;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String aliasDomain;

    
    private IrModel aliasModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId aliasModelId;

    
    private int aliasParentThreadId;

    
    private boolean isAliasIncomingLocal;

    
    private int aliasForceThreadId;

    
    private int id;

    
    private Object aliasStatus;

    
    private Date createDate;

    
    private Object aliasDefaults;


    public MailAlias() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public IrModel getAliasParentModelIdAsObject() {
        return aliasParentModelIdAsObject;
    }

    public OdooId getAliasParentModelId() {
        return aliasParentModelId;
    }

    public MailAliasDomain getAliasDomainIdAsObject() {
        return aliasDomainIdAsObject;
    }

    public OdooId getAliasDomainId() {
        return aliasDomainId;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Object getAliasBouncedContent() {
        return aliasBouncedContent;
    }

    public String getAliasFullName() {
        return aliasFullName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getAliasContact() {
        return aliasContact;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public String getAliasDomain() {
        return aliasDomain;
    }

    public IrModel getAliasModelIdAsObject() {
        return aliasModelIdAsObject;
    }

    public OdooId getAliasModelId() {
        return aliasModelId;
    }

    public int getAliasParentThreadId() {
        return aliasParentThreadId;
    }

    public boolean getIsAliasIncomingLocal() {
        return isAliasIncomingLocal;
    }

    public int getAliasForceThreadId() {
        return aliasForceThreadId;
    }

    public int getId() {
        return id;
    }

    public Object getAliasStatus() {
        return aliasStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getAliasDefaults() {
        return aliasDefaults;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setAliasParentModelIdAsObject(IrModel aliasParentModelIdAsObject) {
        this.aliasParentModelIdAsObject = aliasParentModelIdAsObject;
    }

    public void setAliasParentModelId(OdooId aliasParentModelId) {
        this.aliasParentModelId = aliasParentModelId;
    }

    public void setAliasDomainIdAsObject(MailAliasDomain aliasDomainIdAsObject) {
        this.aliasDomainIdAsObject = aliasDomainIdAsObject;
    }

    public void setAliasDomainId(OdooId aliasDomainId) {
        this.aliasDomainId = aliasDomainId;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setAliasBouncedContent(Object aliasBouncedContent) {
        this.aliasBouncedContent = aliasBouncedContent;
    }

    public void setAliasFullName(String aliasFullName) {
        this.aliasFullName = aliasFullName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAliasContact(Object aliasContact) {
        this.aliasContact = aliasContact;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setAliasDomain(String aliasDomain) {
        this.aliasDomain = aliasDomain;
    }

    public void setAliasModelIdAsObject(IrModel aliasModelIdAsObject) {
        this.aliasModelIdAsObject = aliasModelIdAsObject;
    }

    public void setAliasModelId(OdooId aliasModelId) {
        this.aliasModelId = aliasModelId;
    }

    public void setAliasParentThreadId(int aliasParentThreadId) {
        this.aliasParentThreadId = aliasParentThreadId;
    }

    public void setIsAliasIncomingLocal(boolean isAliasIncomingLocal) {
        this.isAliasIncomingLocal = isAliasIncomingLocal;
    }

    public void setAliasForceThreadId(int aliasForceThreadId) {
        this.aliasForceThreadId = aliasForceThreadId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAliasStatus(Object aliasStatus) {
        this.aliasStatus = aliasStatus;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAliasDefaults(Object aliasDefaults) {
        this.aliasDefaults = aliasDefaults;
    }



}