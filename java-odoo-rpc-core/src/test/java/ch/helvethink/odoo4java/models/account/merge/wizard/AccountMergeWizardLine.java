
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

package ch.helvethink.odoo4java.models.account.merge.wizard;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.Account;
import ch.helvethink.odoo4java.models.account.merge.AccountMergeWizard;
import ch.helvethink.odoo4java.models.res.ResCompany;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.merge.wizard.line")
public class AccountMergeWizardLine implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private List<ResCompany> companyIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResCompany")
        @OdooModel("res.ResCompany")
        @JsonProperty("company_ids")
        private List<Integer> companyIds;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("is_selected")
        private boolean isIsSelected;
    

    
        @JsonProperty("grouping_key")
        private String groupingKey;
    

    
        @JsonProperty("account_has_hashed_entries")
        private boolean isAccountHasHashedEntries;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("display_type")
        private Object displayType;
    

    
        private AccountMergeWizard wizardIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.merge.AccountMergeWizard")
        @OdooModel("account.merge.AccountMergeWizard")
        @JsonProperty("wizard_id")
        private OdooId wizardId;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        private Account accountIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.Account")
        @OdooModel("account.Account")
        @JsonProperty("account_id")
        private OdooId accountId;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("info")
        private String info;
    


    public AccountMergeWizardLine() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<ResCompany> getCompanyIdsAsList() {
        return companyIdsAsList;
    }

    public List<Integer> getCompanyIds() {
        return companyIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public boolean getIsIsSelected() {
        return isIsSelected;
    }

    public String getGroupingKey() {
        return groupingKey;
    }

    public boolean getIsAccountHasHashedEntries() {
        return isAccountHasHashedEntries;
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

    public Object getDisplayType() {
        return displayType;
    }

    public AccountMergeWizard getWizardIdAsObject() {
        return wizardIdAsObject;
    }

    public OdooId getWizardId() {
        return wizardId;
    }

    public int getSequence() {
        return sequence;
    }

    public Account getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getInfo() {
        return info;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setCompanyIdsAsList(List<ResCompany> companyIdsAsList) {
        this.companyIdsAsList = companyIdsAsList;
    }

    public void setCompanyIds(List<Integer> companyIds) {
        this.companyIds = companyIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setIsIsSelected(boolean isIsSelected) {
        this.isIsSelected = isIsSelected;
    }

    public void setGroupingKey(String groupingKey) {
        this.groupingKey = groupingKey;
    }

    public void setIsAccountHasHashedEntries(boolean isAccountHasHashedEntries) {
        this.isAccountHasHashedEntries = isAccountHasHashedEntries;
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

    public void setDisplayType(Object displayType) {
        this.displayType = displayType;
    }

    public void setWizardIdAsObject(AccountMergeWizard wizardIdAsObject) {
        this.wizardIdAsObject = wizardIdAsObject;
    }

    public void setWizardId(OdooId wizardId) {
        this.wizardId = wizardId;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setAccountIdAsObject(Account accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setInfo(String info) {
        this.info = info;
    }



}