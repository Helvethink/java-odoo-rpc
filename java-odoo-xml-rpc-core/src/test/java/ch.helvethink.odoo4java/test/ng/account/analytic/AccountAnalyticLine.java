
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

package ch.helvethink.odoo4java.test.ng.account.analytic;

import ch.helvethink.odoo4java.test.ng.project.Project;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.account.Account;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResCurrency;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.project.ProjectTask;
import ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine;
import ch.helvethink.odoo4java.test.ng.account.AccountMove;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.sale.SaleOrder;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.test.ng.product.Product;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.hr.HrLeave;
import ch.helvethink.odoo4java.test.ng.uom.Uom;
import ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine;
import ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarLeaves;
import ch.helvethink.odoo4java.test.ng.uom.UomCategory;;

@OdooObject("account.analytic.line")
public class AccountAnalyticLine implements OdooObj {

    
    private Object date;

    
    private Date writeDate;

    
    private HrLeave holidayIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrLeave")
        @OdooModel("hr.HrLeave")
    
    private OdooId holidayId;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private ProjectTask parentTaskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId parentTaskId;

    
    private ResourceCalendarLeaves globalLeaveIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.resource.calendar.ResourceCalendarLeaves")
        @OdooModel("resource.calendar.ResourceCalendarLeaves")
    
    private OdooId globalLeaveId;

    
    private boolean isReadonlyTimesheet;

    
    private ProjectTask taskIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.ProjectTask")
        @OdooModel("project.ProjectTask")
    
    private OdooId taskId;

    
    private String ref;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Project projectIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.project.Project")
        @OdooModel("project.Project")
    
    private OdooId projectId;

    
    private HrEmployee managerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId managerId;

    
    private String l10nDin5008DocumentTitle;

    
    private Product productIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.product.Product")
        @OdooModel("product.Product")
    
    private OdooId productId;

    
    private boolean isAllowBillable;

    
    private Uom encodingUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId encodingUomId;

    
    private AccountMoveLine moveLineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.move.AccountMoveLine")
        @OdooModel("account.move.AccountMoveLine")
    
    private OdooId moveLineId;

    
    private ResPartner commercialPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId commercialPartnerId;

    
    private int id;

    
    private Date createDate;

    
    private String jobTitle;

    
    private AccountMove timesheetInvoiceIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountMove")
        @OdooModel("account.AccountMove")
    
    private OdooId timesheetInvoiceId;

    
    private AccountAnalyticAccount autoAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId autoAccountId;

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private Object amount;

    
    private Uom productUomIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.Uom")
        @OdooModel("uom.Uom")
    
    private OdooId productUomId;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private Account generalAccountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.Account")
        @OdooModel("account.Account")
    
    private OdooId generalAccountId;

    
    private double unitAmount;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<SaleOrderLine> allowedSoLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private List<Integer> allowedSoLineIds;

    
    private Object timesheetInvoiceType;

    
    private Object l10nDin5008TemplateData;

    
    private AccountAnalyticAccount accountIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.analytic.AccountAnalyticAccount")
        @OdooModel("account.analytic.AccountAnalyticAccount")
    
    private OdooId accountId;

    
    private SaleOrderLine soLineAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.SaleOrderLine")
        @OdooModel("sale.order.SaleOrderLine")
    
    private OdooId soLine;

    
    private boolean isIsSoLineEdited;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private String name;

    
    private Object category;

    
    private SaleOrder orderIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.SaleOrder")
        @OdooModel("sale.SaleOrder")
    
    private OdooId orderId;

    
    private UomCategory productUomCategoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.UomCategory")
        @OdooModel("uom.UomCategory")
    
    private OdooId productUomCategoryId;

    
    private ResCurrency currencyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCurrency")
        @OdooModel("res.ResCurrency")
    
    private OdooId currencyId;


    public AccountAnalyticLine() {
    // Constructor
    }


    public Object getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public HrLeave getHolidayIdAsObject() {
        return holidayIdAsObject;
    }

    public OdooId getHolidayId() {
        return holidayId;
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

    public ProjectTask getParentTaskIdAsObject() {
        return parentTaskIdAsObject;
    }

    public OdooId getParentTaskId() {
        return parentTaskId;
    }

    public ResourceCalendarLeaves getGlobalLeaveIdAsObject() {
        return globalLeaveIdAsObject;
    }

    public OdooId getGlobalLeaveId() {
        return globalLeaveId;
    }

    public boolean getIsReadonlyTimesheet() {
        return isReadonlyTimesheet;
    }

    public ProjectTask getTaskIdAsObject() {
        return taskIdAsObject;
    }

    public OdooId getTaskId() {
        return taskId;
    }

    public String getRef() {
        return ref;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Project getProjectIdAsObject() {
        return projectIdAsObject;
    }

    public OdooId getProjectId() {
        return projectId;
    }

    public HrEmployee getManagerIdAsObject() {
        return managerIdAsObject;
    }

    public OdooId getManagerId() {
        return managerId;
    }

    public String getL10nDin5008DocumentTitle() {
        return l10nDin5008DocumentTitle;
    }

    public Product getProductIdAsObject() {
        return productIdAsObject;
    }

    public OdooId getProductId() {
        return productId;
    }

    public boolean getIsAllowBillable() {
        return isAllowBillable;
    }

    public Uom getEncodingUomIdAsObject() {
        return encodingUomIdAsObject;
    }

    public OdooId getEncodingUomId() {
        return encodingUomId;
    }

    public AccountMoveLine getMoveLineIdAsObject() {
        return moveLineIdAsObject;
    }

    public OdooId getMoveLineId() {
        return moveLineId;
    }

    public ResPartner getCommercialPartnerIdAsObject() {
        return commercialPartnerIdAsObject;
    }

    public OdooId getCommercialPartnerId() {
        return commercialPartnerId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public AccountMove getTimesheetInvoiceIdAsObject() {
        return timesheetInvoiceIdAsObject;
    }

    public OdooId getTimesheetInvoiceId() {
        return timesheetInvoiceId;
    }

    public AccountAnalyticAccount getAutoAccountIdAsObject() {
        return autoAccountIdAsObject;
    }

    public OdooId getAutoAccountId() {
        return autoAccountId;
    }

    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public Object getAmount() {
        return amount;
    }

    public Uom getProductUomIdAsObject() {
        return productUomIdAsObject;
    }

    public OdooId getProductUomId() {
        return productUomId;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public Account getGeneralAccountIdAsObject() {
        return generalAccountIdAsObject;
    }

    public OdooId getGeneralAccountId() {
        return generalAccountId;
    }

    public double getUnitAmount() {
        return unitAmount;
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

    public List<SaleOrderLine> getAllowedSoLineIdsAsList() {
        return allowedSoLineIdsAsList;
    }

    public List<Integer> getAllowedSoLineIds() {
        return allowedSoLineIds;
    }

    public Object getTimesheetInvoiceType() {
        return timesheetInvoiceType;
    }

    public Object getL10nDin5008TemplateData() {
        return l10nDin5008TemplateData;
    }

    public AccountAnalyticAccount getAccountIdAsObject() {
        return accountIdAsObject;
    }

    public OdooId getAccountId() {
        return accountId;
    }

    public SaleOrderLine getSoLineAsObject() {
        return soLineAsObject;
    }

    public OdooId getSoLine() {
        return soLine;
    }

    public boolean getIsIsSoLineEdited() {
        return isIsSoLineEdited;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Object getCategory() {
        return category;
    }

    public SaleOrder getOrderIdAsObject() {
        return orderIdAsObject;
    }

    public OdooId getOrderId() {
        return orderId;
    }

    public UomCategory getProductUomCategoryIdAsObject() {
        return productUomCategoryIdAsObject;
    }

    public OdooId getProductUomCategoryId() {
        return productUomCategoryId;
    }

    public ResCurrency getCurrencyIdAsObject() {
        return currencyIdAsObject;
    }

    public OdooId getCurrencyId() {
        return currencyId;
    }



    public void setDate(Object date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setHolidayIdAsObject(HrLeave holidayIdAsObject) {
        this.holidayIdAsObject = holidayIdAsObject;
    }

    public void setHolidayId(OdooId holidayId) {
        this.holidayId = holidayId;
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

    public void setParentTaskIdAsObject(ProjectTask parentTaskIdAsObject) {
        this.parentTaskIdAsObject = parentTaskIdAsObject;
    }

    public void setParentTaskId(OdooId parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public void setGlobalLeaveIdAsObject(ResourceCalendarLeaves globalLeaveIdAsObject) {
        this.globalLeaveIdAsObject = globalLeaveIdAsObject;
    }

    public void setGlobalLeaveId(OdooId globalLeaveId) {
        this.globalLeaveId = globalLeaveId;
    }

    public void setIsReadonlyTimesheet(boolean isReadonlyTimesheet) {
        this.isReadonlyTimesheet = isReadonlyTimesheet;
    }

    public void setTaskIdAsObject(ProjectTask taskIdAsObject) {
        this.taskIdAsObject = taskIdAsObject;
    }

    public void setTaskId(OdooId taskId) {
        this.taskId = taskId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setProjectIdAsObject(Project projectIdAsObject) {
        this.projectIdAsObject = projectIdAsObject;
    }

    public void setProjectId(OdooId projectId) {
        this.projectId = projectId;
    }

    public void setManagerIdAsObject(HrEmployee managerIdAsObject) {
        this.managerIdAsObject = managerIdAsObject;
    }

    public void setManagerId(OdooId managerId) {
        this.managerId = managerId;
    }

    public void setL10nDin5008DocumentTitle(String l10nDin5008DocumentTitle) {
        this.l10nDin5008DocumentTitle = l10nDin5008DocumentTitle;
    }

    public void setProductIdAsObject(Product productIdAsObject) {
        this.productIdAsObject = productIdAsObject;
    }

    public void setProductId(OdooId productId) {
        this.productId = productId;
    }

    public void setIsAllowBillable(boolean isAllowBillable) {
        this.isAllowBillable = isAllowBillable;
    }

    public void setEncodingUomIdAsObject(Uom encodingUomIdAsObject) {
        this.encodingUomIdAsObject = encodingUomIdAsObject;
    }

    public void setEncodingUomId(OdooId encodingUomId) {
        this.encodingUomId = encodingUomId;
    }

    public void setMoveLineIdAsObject(AccountMoveLine moveLineIdAsObject) {
        this.moveLineIdAsObject = moveLineIdAsObject;
    }

    public void setMoveLineId(OdooId moveLineId) {
        this.moveLineId = moveLineId;
    }

    public void setCommercialPartnerIdAsObject(ResPartner commercialPartnerIdAsObject) {
        this.commercialPartnerIdAsObject = commercialPartnerIdAsObject;
    }

    public void setCommercialPartnerId(OdooId commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setTimesheetInvoiceIdAsObject(AccountMove timesheetInvoiceIdAsObject) {
        this.timesheetInvoiceIdAsObject = timesheetInvoiceIdAsObject;
    }

    public void setTimesheetInvoiceId(OdooId timesheetInvoiceId) {
        this.timesheetInvoiceId = timesheetInvoiceId;
    }

    public void setAutoAccountIdAsObject(AccountAnalyticAccount autoAccountIdAsObject) {
        this.autoAccountIdAsObject = autoAccountIdAsObject;
    }

    public void setAutoAccountId(OdooId autoAccountId) {
        this.autoAccountId = autoAccountId;
    }

    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public void setProductUomIdAsObject(Uom productUomIdAsObject) {
        this.productUomIdAsObject = productUomIdAsObject;
    }

    public void setProductUomId(OdooId productUomId) {
        this.productUomId = productUomId;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setGeneralAccountIdAsObject(Account generalAccountIdAsObject) {
        this.generalAccountIdAsObject = generalAccountIdAsObject;
    }

    public void setGeneralAccountId(OdooId generalAccountId) {
        this.generalAccountId = generalAccountId;
    }

    public void setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
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

    public void setAllowedSoLineIdsAsList(List<SaleOrderLine> allowedSoLineIdsAsList) {
        this.allowedSoLineIdsAsList = allowedSoLineIdsAsList;
    }

    public void setAllowedSoLineIds(List<Integer> allowedSoLineIds) {
        this.allowedSoLineIds = allowedSoLineIds;
    }

    public void setTimesheetInvoiceType(Object timesheetInvoiceType) {
        this.timesheetInvoiceType = timesheetInvoiceType;
    }

    public void setL10nDin5008TemplateData(Object l10nDin5008TemplateData) {
        this.l10nDin5008TemplateData = l10nDin5008TemplateData;
    }

    public void setAccountIdAsObject(AccountAnalyticAccount accountIdAsObject) {
        this.accountIdAsObject = accountIdAsObject;
    }

    public void setAccountId(OdooId accountId) {
        this.accountId = accountId;
    }

    public void setSoLineAsObject(SaleOrderLine soLineAsObject) {
        this.soLineAsObject = soLineAsObject;
    }

    public void setSoLine(OdooId soLine) {
        this.soLine = soLine;
    }

    public void setIsIsSoLineEdited(boolean isIsSoLineEdited) {
        this.isIsSoLineEdited = isIsSoLineEdited;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public void setOrderIdAsObject(SaleOrder orderIdAsObject) {
        this.orderIdAsObject = orderIdAsObject;
    }

    public void setOrderId(OdooId orderId) {
        this.orderId = orderId;
    }

    public void setProductUomCategoryIdAsObject(UomCategory productUomCategoryIdAsObject) {
        this.productUomCategoryIdAsObject = productUomCategoryIdAsObject;
    }

    public void setProductUomCategoryId(OdooId productUomCategoryId) {
        this.productUomCategoryId = productUomCategoryId;
    }

    public void setCurrencyIdAsObject(ResCurrency currencyIdAsObject) {
        this.currencyIdAsObject = currencyIdAsObject;
    }

    public void setCurrencyId(OdooId currencyId) {
        this.currencyId = currencyId;
    }



}