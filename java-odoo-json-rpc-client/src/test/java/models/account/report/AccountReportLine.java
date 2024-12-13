
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

package ch.helvethink.odoo4java.models.account.report;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.account.AccountReport;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("account.report.line")
public class AccountReportLine implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("code")
        private String code;
    

    
        @JsonProperty("print_on_new_page")
        private boolean isPrintOnNewPage;
    

    
        @JsonProperty("user_groupby")
        private String userGroupby;
    

    
        private List<AccountReportLine> childrenIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
        @JsonProperty("children_ids")
        private List<Integer> childrenIds;
    

    
        @JsonProperty("account_codes_formula")
        private String accountCodesFormula;
    

    
        @JsonProperty("domain_formula")
        private String domainFormula;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        @JsonProperty("foldable")
        private boolean isFoldable;
    

    
        @JsonProperty("hide_if_zero")
        private boolean isHideIfZero;
    

    
        @JsonProperty("horizontal_split_side")
        private Object horizontalSplitSide;
    

    
        @JsonProperty("tax_tags_formula")
        private String taxTagsFormula;
    

    
        @JsonProperty("groupby")
        private String groupby;
    

    
        @JsonProperty("external_formula")
        private String externalFormula;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("sequence")
        private int sequence;
    

    
        @JsonProperty("aggregation_formula")
        private String aggregationFormula;
    

    
        private AccountReport reportIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountReport")
        @OdooModel("account.AccountReport")
        @JsonProperty("report_id")
        private OdooId reportId;
    

    
        private AccountReportLine parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        private List<AccountReportExpression> expressionIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.report.AccountReportExpression")
        @OdooModel("account.report.AccountReportExpression")
        @JsonProperty("expression_ids")
        private List<Integer> expressionIds;
    

    
        @JsonProperty("hierarchy_level")
        private int hierarchyLevel;
    


    public AccountReportLine() {
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

    public String getCode() {
        return code;
    }

    public boolean getIsPrintOnNewPage() {
        return isPrintOnNewPage;
    }

    public String getUserGroupby() {
        return userGroupby;
    }

    public List<AccountReportLine> getChildrenIdsAsList() {
        return childrenIdsAsList;
    }

    public List<Integer> getChildrenIds() {
        return childrenIds;
    }

    public String getAccountCodesFormula() {
        return accountCodesFormula;
    }

    public String getDomainFormula() {
        return domainFormula;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsFoldable() {
        return isFoldable;
    }

    public boolean getIsHideIfZero() {
        return isHideIfZero;
    }

    public Object getHorizontalSplitSide() {
        return horizontalSplitSide;
    }

    public String getTaxTagsFormula() {
        return taxTagsFormula;
    }

    public String getGroupby() {
        return groupby;
    }

    public String getExternalFormula() {
        return externalFormula;
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

    public String getAggregationFormula() {
        return aggregationFormula;
    }

    public AccountReport getReportIdAsObject() {
        return reportIdAsObject;
    }

    public OdooId getReportId() {
        return reportId;
    }

    public AccountReportLine getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public List<AccountReportExpression> getExpressionIdsAsList() {
        return expressionIdsAsList;
    }

    public List<Integer> getExpressionIds() {
        return expressionIds;
    }

    public int getHierarchyLevel() {
        return hierarchyLevel;
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setIsPrintOnNewPage(boolean isPrintOnNewPage) {
        this.isPrintOnNewPage = isPrintOnNewPage;
    }

    public void setUserGroupby(String userGroupby) {
        this.userGroupby = userGroupby;
    }

    public void setChildrenIdsAsList(List<AccountReportLine> childrenIdsAsList) {
        this.childrenIdsAsList = childrenIdsAsList;
    }

    public void setChildrenIds(List<Integer> childrenIds) {
        this.childrenIds = childrenIds;
    }

    public void setAccountCodesFormula(String accountCodesFormula) {
        this.accountCodesFormula = accountCodesFormula;
    }

    public void setDomainFormula(String domainFormula) {
        this.domainFormula = domainFormula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    public void setIsHideIfZero(boolean isHideIfZero) {
        this.isHideIfZero = isHideIfZero;
    }

    public void setHorizontalSplitSide(Object horizontalSplitSide) {
        this.horizontalSplitSide = horizontalSplitSide;
    }

    public void setTaxTagsFormula(String taxTagsFormula) {
        this.taxTagsFormula = taxTagsFormula;
    }

    public void setGroupby(String groupby) {
        this.groupby = groupby;
    }

    public void setExternalFormula(String externalFormula) {
        this.externalFormula = externalFormula;
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

    public void setAggregationFormula(String aggregationFormula) {
        this.aggregationFormula = aggregationFormula;
    }

    public void setReportIdAsObject(AccountReport reportIdAsObject) {
        this.reportIdAsObject = reportIdAsObject;
    }

    public void setReportId(OdooId reportId) {
        this.reportId = reportId;
    }

    public void setParentIdAsObject(AccountReportLine parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpressionIdsAsList(List<AccountReportExpression> expressionIdsAsList) {
        this.expressionIdsAsList = expressionIdsAsList;
    }

    public void setExpressionIds(List<Integer> expressionIds) {
        this.expressionIds = expressionIds;
    }

    public void setHierarchyLevel(int hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }



}