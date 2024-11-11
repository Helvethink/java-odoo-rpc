
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

import ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("mail.followers")
public class MailFollowers implements OdooObj {

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private boolean isIsActive;

    
    private String resModel;

    
    private Object resId;

    
    private List<MailMessageSubtype> subtypeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.message.MailMessageSubtype")
        @OdooModel("mail.message.MailMessageSubtype")
    
    private List<Integer> subtypeIds;

    
    private String name;

    
    private int id;

    
    private String displayName;

    
    private String email;


    public MailFollowers() {
    // Constructor
    }


    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public boolean getIsIsActive() {
        return isIsActive;
    }

    public String getResModel() {
        return resModel;
    }

    public Object getResId() {
        return resId;
    }

    public List<MailMessageSubtype> getSubtypeIdsAsList() {
        return subtypeIdsAsList;
    }

    public List<Integer> getSubtypeIds() {
        return subtypeIds;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }



    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setIsIsActive(boolean isIsActive) {
        this.isIsActive = isIsActive;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setResId(Object resId) {
        this.resId = resId;
    }

    public void setSubtypeIdsAsList(List<MailMessageSubtype> subtypeIdsAsList) {
        this.subtypeIdsAsList = subtypeIdsAsList;
    }

    public void setSubtypeIds(List<Integer> subtypeIds) {
        this.subtypeIds = subtypeIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}