
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

package ch.helvethink.odoo4java.test.ng.base.partner.merge.automatic;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.base.partner.merge.BasePartnerMergeLine;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("base.partner.merge.automatic.wizard")
public class BasePartnerMergeAutomaticWizard implements OdooObj {

    
    private Date writeDate;

    
    private boolean isExcludeJournalItem;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isGroupByIsCompany;

    
    private int numberGroup;

    
    private boolean isGroupByName;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isGroupByParentId;

    
    private ResPartner dstPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId dstPartnerId;

    
    private BasePartnerMergeLine currentLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.base.partner.merge.BasePartnerMergeLine")
        @OdooModel("base.partner.merge.BasePartnerMergeLine")
    
    private OdooId currentLineId;

    
    private List<BasePartnerMergeLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.base.partner.merge.BasePartnerMergeLine")
        @OdooModel("base.partner.merge.BasePartnerMergeLine")
    
    private List<Integer> lineIds;

    
    private boolean isGroupByVat;

    
    private boolean isExcludeContact;

    
    private Object state;

    
    private int id;

    
    private List<ResPartner> partnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> partnerIds;

    
    private Date createDate;

    
    private int maximumGroup;

    
    private boolean isGroupByEmail;


    public BasePartnerMergeAutomaticWizard() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsExcludeJournalItem() {
        return isExcludeJournalItem;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsGroupByIsCompany() {
        return isGroupByIsCompany;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public boolean getIsGroupByName() {
        return isGroupByName;
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

    public boolean getIsGroupByParentId() {
        return isGroupByParentId;
    }

    public ResPartner getDstPartnerIdAsObject() {
        return dstPartnerIdAsObject;
    }

    public OdooId getDstPartnerId() {
        return dstPartnerId;
    }

    public BasePartnerMergeLine getCurrentLineIdAsObject() {
        return currentLineIdAsObject;
    }

    public OdooId getCurrentLineId() {
        return currentLineId;
    }

    public List<BasePartnerMergeLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public boolean getIsGroupByVat() {
        return isGroupByVat;
    }

    public boolean getIsExcludeContact() {
        return isExcludeContact;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public List<ResPartner> getPartnerIdsAsList() {
        return partnerIdsAsList;
    }

    public List<Integer> getPartnerIds() {
        return partnerIds;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getMaximumGroup() {
        return maximumGroup;
    }

    public boolean getIsGroupByEmail() {
        return isGroupByEmail;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsExcludeJournalItem(boolean isExcludeJournalItem) {
        this.isExcludeJournalItem = isExcludeJournalItem;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsGroupByIsCompany(boolean isGroupByIsCompany) {
        this.isGroupByIsCompany = isGroupByIsCompany;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void setIsGroupByName(boolean isGroupByName) {
        this.isGroupByName = isGroupByName;
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

    public void setIsGroupByParentId(boolean isGroupByParentId) {
        this.isGroupByParentId = isGroupByParentId;
    }

    public void setDstPartnerIdAsObject(ResPartner dstPartnerIdAsObject) {
        this.dstPartnerIdAsObject = dstPartnerIdAsObject;
    }

    public void setDstPartnerId(OdooId dstPartnerId) {
        this.dstPartnerId = dstPartnerId;
    }

    public void setCurrentLineIdAsObject(BasePartnerMergeLine currentLineIdAsObject) {
        this.currentLineIdAsObject = currentLineIdAsObject;
    }

    public void setCurrentLineId(OdooId currentLineId) {
        this.currentLineId = currentLineId;
    }

    public void setLineIdsAsList(List<BasePartnerMergeLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setIsGroupByVat(boolean isGroupByVat) {
        this.isGroupByVat = isGroupByVat;
    }

    public void setIsExcludeContact(boolean isExcludeContact) {
        this.isExcludeContact = isExcludeContact;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPartnerIdsAsList(List<ResPartner> partnerIdsAsList) {
        this.partnerIdsAsList = partnerIdsAsList;
    }

    public void setPartnerIds(List<Integer> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setMaximumGroup(int maximumGroup) {
        this.maximumGroup = maximumGroup;
    }

    public void setIsGroupByEmail(boolean isGroupByEmail) {
        this.isGroupByEmail = isGroupByEmail;
    }



}