
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

package ch.helvethink.odoo4java.test.ng.loyalty;

import ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("loyalty.mail")
public class LoyaltyMail implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private LoyaltyProgram programIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.loyalty.LoyaltyProgram")
        @OdooModel("loyalty.LoyaltyProgram")
    
    private OdooId programId;

    
    private boolean isActive;

    
    private Object trigger;

    
    private int id;

    
    private MailTemplate mailTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId mailTemplateId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;

    
    private double points;


    public LoyaltyMail() {
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

    public LoyaltyProgram getProgramIdAsObject() {
        return programIdAsObject;
    }

    public OdooId getProgramId() {
        return programId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getTrigger() {
        return trigger;
    }

    public int getId() {
        return id;
    }

    public MailTemplate getMailTemplateIdAsObject() {
        return mailTemplateIdAsObject;
    }

    public OdooId getMailTemplateId() {
        return mailTemplateId;
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

    public Date getCreateDate() {
        return createDate;
    }

    public double getPoints() {
        return points;
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

    public void setProgramIdAsObject(LoyaltyProgram programIdAsObject) {
        this.programIdAsObject = programIdAsObject;
    }

    public void setProgramId(OdooId programId) {
        this.programId = programId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setTrigger(Object trigger) {
        this.trigger = trigger;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailTemplateIdAsObject(MailTemplate mailTemplateIdAsObject) {
        this.mailTemplateIdAsObject = mailTemplateIdAsObject;
    }

    public void setMailTemplateId(OdooId mailTemplateId) {
        this.mailTemplateId = mailTemplateId;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setPoints(double points) {
        this.points = points;
    }



}