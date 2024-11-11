
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

package ch.helvethink.odoo4java.test.ng.mail.tracking;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("mail.tracking.value")
public class MailTrackingValue implements OdooObj {

    
    private IrModelFields fieldIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId fieldId;

    
    private Date writeDate;

    
    private int oldValueInteger;

    
    private double oldValueFloat;

    
    private Object newValueText;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private Date newValueDatetime;

    
    private MailMessage mailMessageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId mailMessageId;

    
    private String fieldGroups;

    
    private int newValueInteger;

    
    private double newValueFloat;

    
    private String oldValueChar;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object oldValueText;

    
    private Object fieldInfo;

    
    private String newValueChar;

    
    private Date oldValueDatetime;

    
    private int id;

    
    private Date createDate;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public MailTrackingValue() {
    // Constructor
    }


    public IrModelFields getFieldIdAsObject() {
        return fieldIdAsObject;
    }

    public OdooId getFieldId() {
        return fieldId;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public int getOldValueInteger() {
        return oldValueInteger;
    }

    public double getOldValueFloat() {
        return oldValueFloat;
    }

    public Object getNewValueText() {
        return newValueText;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public Date getNewValueDatetime() {
        return newValueDatetime;
    }

    public MailMessage getMailMessageIdAsObject() {
        return mailMessageIdAsObject;
    }

    public OdooId getMailMessageId() {
        return mailMessageId;
    }

    public String getFieldGroups() {
        return fieldGroups;
    }

    public int getNewValueInteger() {
        return newValueInteger;
    }

    public double getNewValueFloat() {
        return newValueFloat;
    }

    public String getOldValueChar() {
        return oldValueChar;
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

    public Object getOldValueText() {
        return oldValueText;
    }

    public Object getFieldInfo() {
        return fieldInfo;
    }

    public String getNewValueChar() {
        return newValueChar;
    }

    public Date getOldValueDatetime() {
        return oldValueDatetime;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setFieldIdAsObject(IrModelFields fieldIdAsObject) {
        this.fieldIdAsObject = fieldIdAsObject;
    }

    public void setFieldId(OdooId fieldId) {
        this.fieldId = fieldId;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setOldValueInteger(int oldValueInteger) {
        this.oldValueInteger = oldValueInteger;
    }

    public void setOldValueFloat(double oldValueFloat) {
        this.oldValueFloat = oldValueFloat;
    }

    public void setNewValueText(Object newValueText) {
        this.newValueText = newValueText;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setNewValueDatetime(Date newValueDatetime) {
        this.newValueDatetime = newValueDatetime;
    }

    public void setMailMessageIdAsObject(MailMessage mailMessageIdAsObject) {
        this.mailMessageIdAsObject = mailMessageIdAsObject;
    }

    public void setMailMessageId(OdooId mailMessageId) {
        this.mailMessageId = mailMessageId;
    }

    public void setFieldGroups(String fieldGroups) {
        this.fieldGroups = fieldGroups;
    }

    public void setNewValueInteger(int newValueInteger) {
        this.newValueInteger = newValueInteger;
    }

    public void setNewValueFloat(double newValueFloat) {
        this.newValueFloat = newValueFloat;
    }

    public void setOldValueChar(String oldValueChar) {
        this.oldValueChar = oldValueChar;
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

    public void setOldValueText(Object oldValueText) {
        this.oldValueText = oldValueText;
    }

    public void setFieldInfo(Object fieldInfo) {
        this.fieldInfo = fieldInfo;
    }

    public void setNewValueChar(String newValueChar) {
        this.newValueChar = newValueChar;
    }

    public void setOldValueDatetime(Date oldValueDatetime) {
        this.oldValueDatetime = oldValueDatetime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}