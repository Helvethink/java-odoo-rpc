
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

package ch.helvethink.odoo4java.models.account.analytic;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.analytic.plan")
public class AccountAnalyticPlan implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        private List<AccountAnalyticAccount> accountIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
        @JsonProperty("account_ids")
        private List<Integer> accountIds;
    

    
        @JsonProperty("color")
        private int color;
    

    
        private List<AccountAnalyticApplicability> applicabilityIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticApplicability")
        @OdooModel("account.analytic.AccountAnalyticApplicability")
        @JsonProperty("applicability_ids")
        private List<Integer> applicabilityIds;
    

    
        @JsonProperty("children_count")
        private int childrenCount;
    

    
        @JsonProperty("description")
        private Object description;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("default_applicability")
        private Object defaultApplicability;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        private List<AccountAnalyticPlan> childrenIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticPlan")
        @OdooModel("account.analytic.AccountAnalyticPlan")
        @JsonProperty("children_ids")
        private List<Integer> childrenIds;
    

    
        @JsonProperty("complete_name")
        private String completeName;
    

    
        private AccountAnalyticPlan parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticPlan")
        @OdooModel("account.analytic.AccountAnalyticPlan")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("parent_path")
        private String parentPath;
    

    
        private AccountAnalyticPlan rootIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.analytic.AccountAnalyticPlan")
        @OdooModel("account.analytic.AccountAnalyticPlan")
        @JsonProperty("root_id")
        private OdooId rootId;
    

    
        @JsonProperty("all_account_count")
        private int allAccountCount;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("account_count")
        private int accountCount;
    


    public AccountAnalyticPlan() {
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

    public List<AccountAnalyticAccount> getAccountIdsAsList() {
        return accountIdsAsList;
    }

    public List<Integer> getAccountIds() {
        return accountIds;
    }

    public int getColor() {
        return color;
    }

    public List<AccountAnalyticApplicability> getApplicabilityIdsAsList() {
        return applicabilityIdsAsList;
    }

    public List<Integer> getApplicabilityIds() {
        return applicabilityIds;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public Object getDescription() {
        return description;
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

    public Object getDefaultApplicability() {
        return defaultApplicability;
    }

    public int getSequence() {
        return sequence;
    }

    public List<AccountAnalyticPlan> getChildrenIdsAsList() {
        return childrenIdsAsList;
    }

    public List<Integer> getChildrenIds() {
        return childrenIds;
    }

    public String getCompleteName() {
        return completeName;
    }

    public AccountAnalyticPlan getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public String getParentPath() {
        return parentPath;
    }

    public AccountAnalyticPlan getRootIdAsObject() {
        return rootIdAsObject;
    }

    public OdooId getRootId() {
        return rootId;
    }

    public int getAllAccountCount() {
        return allAccountCount;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getAccountCount() {
        return accountCount;
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

    public void setAccountIdsAsList(List<AccountAnalyticAccount> accountIdsAsList) {
        this.accountIdsAsList = accountIdsAsList;
    }

    public void setAccountIds(List<Integer> accountIds) {
        this.accountIds = accountIds;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setApplicabilityIdsAsList(List<AccountAnalyticApplicability> applicabilityIdsAsList) {
        this.applicabilityIdsAsList = applicabilityIdsAsList;
    }

    public void setApplicabilityIds(List<Integer> applicabilityIds) {
        this.applicabilityIds = applicabilityIds;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void setDescription(Object description) {
        this.description = description;
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

    public void setDefaultApplicability(Object defaultApplicability) {
        this.defaultApplicability = defaultApplicability;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setChildrenIdsAsList(List<AccountAnalyticPlan> childrenIdsAsList) {
        this.childrenIdsAsList = childrenIdsAsList;
    }

    public void setChildrenIds(List<Integer> childrenIds) {
        this.childrenIds = childrenIds;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public void setParentIdAsObject(AccountAnalyticPlan parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public void setRootIdAsObject(AccountAnalyticPlan rootIdAsObject) {
        this.rootIdAsObject = rootIdAsObject;
    }

    public void setRootId(OdooId rootId) {
        this.rootId = rootId;
    }

    public void setAllAccountCount(int allAccountCount) {
        this.allAccountCount = allAccountCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAccountCount(int accountCount) {
        this.accountCount = accountCount;
    }



}