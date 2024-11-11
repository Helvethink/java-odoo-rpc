
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

package ch.helvethink.odoo4java.test.ng.account;

import ch.helvethink.odoo4java.test.ng.account.AccountReport;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCountry;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.account.report.AccountReportColumn;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("account.report")
public class AccountReport implements OdooObj {

    
    private Date writeDate;

    
    private List<AccountReport> variantReportIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountReport")
        @OdooModel("account.AccountReport")
    
    private List<Integer> variantReportIds;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private AccountReport rootReportIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountReport")
        @OdooModel("account.AccountReport")
    
    private OdooId rootReportId;

    
    private Object defaultOpeningDateFilter;

    
    private boolean isFilterShowDraft;

    
    private Object filterMultiCompany;

    
    private List<AccountReport> sectionReportIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountReport")
        @OdooModel("account.AccountReport")
    
    private List<Integer> sectionReportIds;

    
    private List<AccountReportColumn> columnIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportColumn")
        @OdooModel("account.report.AccountReportColumn")
    
    private List<Integer> columnIds;

    
    private List<AccountReport> sectionMainReportIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountReport")
        @OdooModel("account.AccountReport")
    
    private List<Integer> sectionMainReportIds;

    
    private Object filterHide0Lines;

    
    private boolean isFilterUnreconciled;

    
    private Object filterAccountType;

    
    private boolean isFilterGrowthComparison;

    
    private boolean isFilterPeriodComparison;

    
    private boolean isSearchBar;

    
    private Object availabilityCondition;

    
    private boolean isFilterUnfoldAll;

    
    private boolean isFilterDateRange;

    
    private boolean isFilterAnalytic;

    
    private int id;

    
    private Date createDate;

    
    private Object filterHierarchy;

    
    private boolean isFilterFiscalPosition;

    
    private int loadMoreLimit;

    
    private int prefixGroupsThreshold;

    
    private boolean isActive;

    
    private boolean isUseSections;

    
    private boolean isFilterJournals;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private boolean isFilterPartner;

    
    private int sequence;

    
    private List<AccountReportLine> lineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.report.AccountReportLine")
        @OdooModel("account.report.AccountReportLine")
    
    private List<Integer> lineIds;

    
    private boolean isOnlyTaxExigible;

    
    private Object chartTemplate;

    
    private String name;

    
    private boolean isFilterAmlIrFilters;

    
    private ResCountry countryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCountry")
        @OdooModel("res.ResCountry")
    
    private OdooId countryId;


    public AccountReport() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public List<AccountReport> getVariantReportIdsAsList() {
        return variantReportIdsAsList;
    }

    public List<Integer> getVariantReportIds() {
        return variantReportIds;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public AccountReport getRootReportIdAsObject() {
        return rootReportIdAsObject;
    }

    public OdooId getRootReportId() {
        return rootReportId;
    }

    public Object getDefaultOpeningDateFilter() {
        return defaultOpeningDateFilter;
    }

    public boolean getIsFilterShowDraft() {
        return isFilterShowDraft;
    }

    public Object getFilterMultiCompany() {
        return filterMultiCompany;
    }

    public List<AccountReport> getSectionReportIdsAsList() {
        return sectionReportIdsAsList;
    }

    public List<Integer> getSectionReportIds() {
        return sectionReportIds;
    }

    public List<AccountReportColumn> getColumnIdsAsList() {
        return columnIdsAsList;
    }

    public List<Integer> getColumnIds() {
        return columnIds;
    }

    public List<AccountReport> getSectionMainReportIdsAsList() {
        return sectionMainReportIdsAsList;
    }

    public List<Integer> getSectionMainReportIds() {
        return sectionMainReportIds;
    }

    public Object getFilterHide0Lines() {
        return filterHide0Lines;
    }

    public boolean getIsFilterUnreconciled() {
        return isFilterUnreconciled;
    }

    public Object getFilterAccountType() {
        return filterAccountType;
    }

    public boolean getIsFilterGrowthComparison() {
        return isFilterGrowthComparison;
    }

    public boolean getIsFilterPeriodComparison() {
        return isFilterPeriodComparison;
    }

    public boolean getIsSearchBar() {
        return isSearchBar;
    }

    public Object getAvailabilityCondition() {
        return availabilityCondition;
    }

    public boolean getIsFilterUnfoldAll() {
        return isFilterUnfoldAll;
    }

    public boolean getIsFilterDateRange() {
        return isFilterDateRange;
    }

    public boolean getIsFilterAnalytic() {
        return isFilterAnalytic;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getFilterHierarchy() {
        return filterHierarchy;
    }

    public boolean getIsFilterFiscalPosition() {
        return isFilterFiscalPosition;
    }

    public int getLoadMoreLimit() {
        return loadMoreLimit;
    }

    public int getPrefixGroupsThreshold() {
        return prefixGroupsThreshold;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean getIsUseSections() {
        return isUseSections;
    }

    public boolean getIsFilterJournals() {
        return isFilterJournals;
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

    public boolean getIsFilterPartner() {
        return isFilterPartner;
    }

    public int getSequence() {
        return sequence;
    }

    public List<AccountReportLine> getLineIdsAsList() {
        return lineIdsAsList;
    }

    public List<Integer> getLineIds() {
        return lineIds;
    }

    public boolean getIsOnlyTaxExigible() {
        return isOnlyTaxExigible;
    }

    public Object getChartTemplate() {
        return chartTemplate;
    }

    public String getName() {
        return name;
    }

    public boolean getIsFilterAmlIrFilters() {
        return isFilterAmlIrFilters;
    }

    public ResCountry getCountryIdAsObject() {
        return countryIdAsObject;
    }

    public OdooId getCountryId() {
        return countryId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setVariantReportIdsAsList(List<AccountReport> variantReportIdsAsList) {
        this.variantReportIdsAsList = variantReportIdsAsList;
    }

    public void setVariantReportIds(List<Integer> variantReportIds) {
        this.variantReportIds = variantReportIds;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setRootReportIdAsObject(AccountReport rootReportIdAsObject) {
        this.rootReportIdAsObject = rootReportIdAsObject;
    }

    public void setRootReportId(OdooId rootReportId) {
        this.rootReportId = rootReportId;
    }

    public void setDefaultOpeningDateFilter(Object defaultOpeningDateFilter) {
        this.defaultOpeningDateFilter = defaultOpeningDateFilter;
    }

    public void setIsFilterShowDraft(boolean isFilterShowDraft) {
        this.isFilterShowDraft = isFilterShowDraft;
    }

    public void setFilterMultiCompany(Object filterMultiCompany) {
        this.filterMultiCompany = filterMultiCompany;
    }

    public void setSectionReportIdsAsList(List<AccountReport> sectionReportIdsAsList) {
        this.sectionReportIdsAsList = sectionReportIdsAsList;
    }

    public void setSectionReportIds(List<Integer> sectionReportIds) {
        this.sectionReportIds = sectionReportIds;
    }

    public void setColumnIdsAsList(List<AccountReportColumn> columnIdsAsList) {
        this.columnIdsAsList = columnIdsAsList;
    }

    public void setColumnIds(List<Integer> columnIds) {
        this.columnIds = columnIds;
    }

    public void setSectionMainReportIdsAsList(List<AccountReport> sectionMainReportIdsAsList) {
        this.sectionMainReportIdsAsList = sectionMainReportIdsAsList;
    }

    public void setSectionMainReportIds(List<Integer> sectionMainReportIds) {
        this.sectionMainReportIds = sectionMainReportIds;
    }

    public void setFilterHide0Lines(Object filterHide0Lines) {
        this.filterHide0Lines = filterHide0Lines;
    }

    public void setIsFilterUnreconciled(boolean isFilterUnreconciled) {
        this.isFilterUnreconciled = isFilterUnreconciled;
    }

    public void setFilterAccountType(Object filterAccountType) {
        this.filterAccountType = filterAccountType;
    }

    public void setIsFilterGrowthComparison(boolean isFilterGrowthComparison) {
        this.isFilterGrowthComparison = isFilterGrowthComparison;
    }

    public void setIsFilterPeriodComparison(boolean isFilterPeriodComparison) {
        this.isFilterPeriodComparison = isFilterPeriodComparison;
    }

    public void setIsSearchBar(boolean isSearchBar) {
        this.isSearchBar = isSearchBar;
    }

    public void setAvailabilityCondition(Object availabilityCondition) {
        this.availabilityCondition = availabilityCondition;
    }

    public void setIsFilterUnfoldAll(boolean isFilterUnfoldAll) {
        this.isFilterUnfoldAll = isFilterUnfoldAll;
    }

    public void setIsFilterDateRange(boolean isFilterDateRange) {
        this.isFilterDateRange = isFilterDateRange;
    }

    public void setIsFilterAnalytic(boolean isFilterAnalytic) {
        this.isFilterAnalytic = isFilterAnalytic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setFilterHierarchy(Object filterHierarchy) {
        this.filterHierarchy = filterHierarchy;
    }

    public void setIsFilterFiscalPosition(boolean isFilterFiscalPosition) {
        this.isFilterFiscalPosition = isFilterFiscalPosition;
    }

    public void setLoadMoreLimit(int loadMoreLimit) {
        this.loadMoreLimit = loadMoreLimit;
    }

    public void setPrefixGroupsThreshold(int prefixGroupsThreshold) {
        this.prefixGroupsThreshold = prefixGroupsThreshold;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsUseSections(boolean isUseSections) {
        this.isUseSections = isUseSections;
    }

    public void setIsFilterJournals(boolean isFilterJournals) {
        this.isFilterJournals = isFilterJournals;
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

    public void setIsFilterPartner(boolean isFilterPartner) {
        this.isFilterPartner = isFilterPartner;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setLineIdsAsList(List<AccountReportLine> lineIdsAsList) {
        this.lineIdsAsList = lineIdsAsList;
    }

    public void setLineIds(List<Integer> lineIds) {
        this.lineIds = lineIds;
    }

    public void setIsOnlyTaxExigible(boolean isOnlyTaxExigible) {
        this.isOnlyTaxExigible = isOnlyTaxExigible;
    }

    public void setChartTemplate(Object chartTemplate) {
        this.chartTemplate = chartTemplate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsFilterAmlIrFilters(boolean isFilterAmlIrFilters) {
        this.isFilterAmlIrFilters = isFilterAmlIrFilters;
    }

    public void setCountryIdAsObject(ResCountry countryIdAsObject) {
        this.countryIdAsObject = countryIdAsObject;
    }

    public void setCountryId(OdooId countryId) {
        this.countryId = countryId;
    }



}