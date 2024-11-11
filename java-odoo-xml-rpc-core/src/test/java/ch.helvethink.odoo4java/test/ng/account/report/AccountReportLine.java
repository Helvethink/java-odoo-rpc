
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

package ch.helvethink.odoo4java.test.ng.account.report;

import java.util.List;
import ch.helvethink.odoo4java.test.ng.account.AccountReport;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportExpression;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.actions.Actions;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.report.line")
public class AccountReportLine implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private boolean isHideIfZero;

    
    private String groupby;

    
    private String externalFormula;

    
    private boolean isPrintOnNewPage;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String userGroupby;

    
    private int sequence;

    
    private List<AccountReportLine> childrenIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
    
    private List<Integer> childrenIds;

    
    private String aggregationFormula;

    
    private String accountCodesFormula;

    
    private Actions actionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.Actions")
        @OdooModel("ir.actions.Actions")
    
    private OdooId actionId;

    
    private AccountReport reportIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountReport")
        @OdooModel("account.AccountReport")
    
    private OdooId reportId;

    
    private AccountReportLine parentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
    
    private OdooId parentId;

    
    private String name;

    
    private String domainFormula;

    
    private int id;

    
    private List<AccountReportExpression> expressionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportExpression")
        @OdooModel("account.report.AccountReportExpression")
    
    private List<Integer> expressionIds;

    
    private Date createDate;

    
    private boolean isFoldable;

    
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

    public boolean getIsHideIfZero() {
        return isHideIfZero;
    }

    public String getGroupby() {
        return groupby;
    }

    public String getExternalFormula() {
        return externalFormula;
    }

    public boolean getIsPrintOnNewPage() {
        return isPrintOnNewPage;
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

    public String getUserGroupby() {
        return userGroupby;
    }

    public int getSequence() {
        return sequence;
    }

    public List<AccountReportLine> getChildrenIdsAsList() {
        return childrenIdsAsList;
    }

    public List<Integer> getChildrenIds() {
        return childrenIds;
    }

    public String getAggregationFormula() {
        return aggregationFormula;
    }

    public String getAccountCodesFormula() {
        return accountCodesFormula;
    }

    public Actions getActionIdAsObject() {
        return actionIdAsObject;
    }

    public OdooId getActionId() {
        return actionId;
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

    public String getDomainFormula() {
        return domainFormula;
    }

    public int getId() {
        return id;
    }

    public List<AccountReportExpression> getExpressionIdsAsList() {
        return expressionIdsAsList;
    }

    public List<Integer> getExpressionIds() {
        return expressionIds;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsFoldable() {
        return isFoldable;
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

    public void setIsHideIfZero(boolean isHideIfZero) {
        this.isHideIfZero = isHideIfZero;
    }

    public void setGroupby(String groupby) {
        this.groupby = groupby;
    }

    public void setExternalFormula(String externalFormula) {
        this.externalFormula = externalFormula;
    }

    public void setIsPrintOnNewPage(boolean isPrintOnNewPage) {
        this.isPrintOnNewPage = isPrintOnNewPage;
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

    public void setUserGroupby(String userGroupby) {
        this.userGroupby = userGroupby;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setChildrenIdsAsList(List<AccountReportLine> childrenIdsAsList) {
        this.childrenIdsAsList = childrenIdsAsList;
    }

    public void setChildrenIds(List<Integer> childrenIds) {
        this.childrenIds = childrenIds;
    }

    public void setAggregationFormula(String aggregationFormula) {
        this.aggregationFormula = aggregationFormula;
    }

    public void setAccountCodesFormula(String accountCodesFormula) {
        this.accountCodesFormula = accountCodesFormula;
    }

    public void setActionIdAsObject(Actions actionIdAsObject) {
        this.actionIdAsObject = actionIdAsObject;
    }

    public void setActionId(OdooId actionId) {
        this.actionId = actionId;
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

    public void setDomainFormula(String domainFormula) {
        this.domainFormula = domainFormula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExpressionIdsAsList(List<AccountReportExpression> expressionIdsAsList) {
        this.expressionIdsAsList = expressionIdsAsList;
    }

    public void setExpressionIds(List<Integer> expressionIds) {
        this.expressionIds = expressionIds;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    public void setHierarchyLevel(int hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }



}