
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

package ch.helvethink.odoo4java.test.ng.sms;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sms.SmsTemplate;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("sms.composer")
public class SmsComposer implements OdooObj {

    
    private Date writeDate;

    
    private boolean isMassForceSend;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String resModel;

    
    private String numbers;

    
    private int resIdsCount;

    
    private int recipientInvalidCount;

    
    private Object body;

    
    private int recipientValidCount;

    
    private String recipientSingleNumber;

    
    private String resModelDescription;

    
    private int resId;

    
    private int id;

    
    private Object compositionMode;

    
    private Date createDate;

    
    private Object recipientSingleDescription;

    
    private String recipientSingleNumberItf;

    
    private String numberFieldName;

    
    private boolean isMassUseBlacklist;

    
    private boolean isMassKeepLog;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isRecipientSingleValid;

    
    private String sanitizedNumbers;

    
    private String resIds;

    
    private boolean isCommentSingleRecipient;

    
    private SmsTemplate templateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sms.SmsTemplate")
        @OdooModel("sms.SmsTemplate")
    
    private OdooId templateId;


    public SmsComposer() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsMassForceSend() {
        return isMassForceSend;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getResModel() {
        return resModel;
    }

    public String getNumbers() {
        return numbers;
    }

    public int getResIdsCount() {
        return resIdsCount;
    }

    public int getRecipientInvalidCount() {
        return recipientInvalidCount;
    }

    public Object getBody() {
        return body;
    }

    public int getRecipientValidCount() {
        return recipientValidCount;
    }

    public String getRecipientSingleNumber() {
        return recipientSingleNumber;
    }

    public String getResModelDescription() {
        return resModelDescription;
    }

    public int getResId() {
        return resId;
    }

    public int getId() {
        return id;
    }

    public Object getCompositionMode() {
        return compositionMode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getRecipientSingleDescription() {
        return recipientSingleDescription;
    }

    public String getRecipientSingleNumberItf() {
        return recipientSingleNumberItf;
    }

    public String getNumberFieldName() {
        return numberFieldName;
    }

    public boolean getIsMassUseBlacklist() {
        return isMassUseBlacklist;
    }

    public boolean getIsMassKeepLog() {
        return isMassKeepLog;
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

    public boolean getIsRecipientSingleValid() {
        return isRecipientSingleValid;
    }

    public String getSanitizedNumbers() {
        return sanitizedNumbers;
    }

    public String getResIds() {
        return resIds;
    }

    public boolean getIsCommentSingleRecipient() {
        return isCommentSingleRecipient;
    }

    public SmsTemplate getTemplateIdAsObject() {
        return templateIdAsObject;
    }

    public OdooId getTemplateId() {
        return templateId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsMassForceSend(boolean isMassForceSend) {
        this.isMassForceSend = isMassForceSend;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public void setResIdsCount(int resIdsCount) {
        this.resIdsCount = resIdsCount;
    }

    public void setRecipientInvalidCount(int recipientInvalidCount) {
        this.recipientInvalidCount = recipientInvalidCount;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setRecipientValidCount(int recipientValidCount) {
        this.recipientValidCount = recipientValidCount;
    }

    public void setRecipientSingleNumber(String recipientSingleNumber) {
        this.recipientSingleNumber = recipientSingleNumber;
    }

    public void setResModelDescription(String resModelDescription) {
        this.resModelDescription = resModelDescription;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompositionMode(Object compositionMode) {
        this.compositionMode = compositionMode;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRecipientSingleDescription(Object recipientSingleDescription) {
        this.recipientSingleDescription = recipientSingleDescription;
    }

    public void setRecipientSingleNumberItf(String recipientSingleNumberItf) {
        this.recipientSingleNumberItf = recipientSingleNumberItf;
    }

    public void setNumberFieldName(String numberFieldName) {
        this.numberFieldName = numberFieldName;
    }

    public void setIsMassUseBlacklist(boolean isMassUseBlacklist) {
        this.isMassUseBlacklist = isMassUseBlacklist;
    }

    public void setIsMassKeepLog(boolean isMassKeepLog) {
        this.isMassKeepLog = isMassKeepLog;
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

    public void setIsRecipientSingleValid(boolean isRecipientSingleValid) {
        this.isRecipientSingleValid = isRecipientSingleValid;
    }

    public void setSanitizedNumbers(String sanitizedNumbers) {
        this.sanitizedNumbers = sanitizedNumbers;
    }

    public void setResIds(String resIds) {
        this.resIds = resIds;
    }

    public void setIsCommentSingleRecipient(boolean isCommentSingleRecipient) {
        this.isCommentSingleRecipient = isCommentSingleRecipient;
    }

    public void setTemplateIdAsObject(SmsTemplate templateIdAsObject) {
        this.templateIdAsObject = templateIdAsObject;
    }

    public void setTemplateId(OdooId templateId) {
        this.templateId = templateId;
    }



}