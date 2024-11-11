
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

package ch.helvethink.odoo4java.test.ng.sale.order;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.sale.order.template.SaleOrderTemplateLine;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.sale.order.template.SaleOrderTemplateOption;
import ch.helvethink.odoo4java.test.ng.account.AccountJournal;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.test.ng.mail.MailTemplate;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("sale.order.template")
public class SaleOrderTemplate implements OdooObj {

    
    private AccountJournal journalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.account.AccountJournal")
        @OdooModel("account.AccountJournal")
    
    private OdooId journalId;

    
    private Date writeDate;

    
    private Object note;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private boolean isRequireSignature;

    
    private int numberOfDays;

    
    private boolean isRequirePayment;

    
    private Object saleFooter;

    
    private String saleFooterName;

    
    private double prepaymentPercent;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<SaleOrderTemplateLine> saleOrderTemplateLineIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.template.SaleOrderTemplateLine")
        @OdooModel("sale.order.template.SaleOrderTemplateLine")
    
    private List<Integer> saleOrderTemplateLineIds;

    
    private Object saleHeader;

    
    private String saleHeaderName;

    
    private String name;

    
    private List<SaleOrderTemplateOption> saleOrderTemplateOptionIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.sale.order.template.SaleOrderTemplateOption")
        @OdooModel("sale.order.template.SaleOrderTemplateOption")
    
    private List<Integer> saleOrderTemplateOptionIds;

    
    private int id;

    
    private MailTemplate mailTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailTemplate")
        @OdooModel("mail.MailTemplate")
    
    private OdooId mailTemplateId;

    
    private Date createDate;


    public SaleOrderTemplate() {
    // Constructor
    }


    public AccountJournal getJournalIdAsObject() {
        return journalIdAsObject;
    }

    public OdooId getJournalId() {
        return journalId;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public Object getNote() {
        return note;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public boolean getIsRequireSignature() {
        return isRequireSignature;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public boolean getIsRequirePayment() {
        return isRequirePayment;
    }

    public Object getSaleFooter() {
        return saleFooter;
    }

    public String getSaleFooterName() {
        return saleFooterName;
    }

    public double getPrepaymentPercent() {
        return prepaymentPercent;
    }

    public boolean getIsActive() {
        return isActive;
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

    public List<SaleOrderTemplateLine> getSaleOrderTemplateLineIdsAsList() {
        return saleOrderTemplateLineIdsAsList;
    }

    public List<Integer> getSaleOrderTemplateLineIds() {
        return saleOrderTemplateLineIds;
    }

    public Object getSaleHeader() {
        return saleHeader;
    }

    public String getSaleHeaderName() {
        return saleHeaderName;
    }

    public String getName() {
        return name;
    }

    public List<SaleOrderTemplateOption> getSaleOrderTemplateOptionIdsAsList() {
        return saleOrderTemplateOptionIdsAsList;
    }

    public List<Integer> getSaleOrderTemplateOptionIds() {
        return saleOrderTemplateOptionIds;
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

    public Date getCreateDate() {
        return createDate;
    }



    public void setJournalIdAsObject(AccountJournal journalIdAsObject) {
        this.journalIdAsObject = journalIdAsObject;
    }

    public void setJournalId(OdooId journalId) {
        this.journalId = journalId;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setIsRequireSignature(boolean isRequireSignature) {
        this.isRequireSignature = isRequireSignature;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setIsRequirePayment(boolean isRequirePayment) {
        this.isRequirePayment = isRequirePayment;
    }

    public void setSaleFooter(Object saleFooter) {
        this.saleFooter = saleFooter;
    }

    public void setSaleFooterName(String saleFooterName) {
        this.saleFooterName = saleFooterName;
    }

    public void setPrepaymentPercent(double prepaymentPercent) {
        this.prepaymentPercent = prepaymentPercent;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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

    public void setSaleOrderTemplateLineIdsAsList(List<SaleOrderTemplateLine> saleOrderTemplateLineIdsAsList) {
        this.saleOrderTemplateLineIdsAsList = saleOrderTemplateLineIdsAsList;
    }

    public void setSaleOrderTemplateLineIds(List<Integer> saleOrderTemplateLineIds) {
        this.saleOrderTemplateLineIds = saleOrderTemplateLineIds;
    }

    public void setSaleHeader(Object saleHeader) {
        this.saleHeader = saleHeader;
    }

    public void setSaleHeaderName(String saleHeaderName) {
        this.saleHeaderName = saleHeaderName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaleOrderTemplateOptionIdsAsList(List<SaleOrderTemplateOption> saleOrderTemplateOptionIdsAsList) {
        this.saleOrderTemplateOptionIdsAsList = saleOrderTemplateOptionIdsAsList;
    }

    public void setSaleOrderTemplateOptionIds(List<Integer> saleOrderTemplateOptionIds) {
        this.saleOrderTemplateOptionIds = saleOrderTemplateOptionIds;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}