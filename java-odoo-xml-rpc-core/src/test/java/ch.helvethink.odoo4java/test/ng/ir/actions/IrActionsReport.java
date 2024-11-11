
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

package ch.helvethink.odoo4java.test.ng.ir.actions;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.report.ReportPaperformat;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.res.ResGroups;;

@OdooObject("ir.actions.report")
public class IrActionsReport implements OdooObj {

    
    private Date writeDate;

    
    private String reportFile;

    
    private Object bindingType;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String printReportName;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private Object reportType;

    
    private String type;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<ResGroups> groupsIdAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResGroups")
        @OdooModel("res.ResGroups")
    
    private List<Integer> groupsId;

    
    private boolean isMulti;

    
    private Object help;

    
    private String attachment;

    
    private IrModel bindingModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId bindingModelId;

    
    private boolean isAttachmentUse;

    
    private String name;

    
    private ReportPaperformat paperformatIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.report.ReportPaperformat")
        @OdooModel("report.ReportPaperformat")
    
    private OdooId paperformatId;

    
    private String bindingViewTypes;

    
    private String model;

    
    private String xmlId;

    
    private int id;

    
    private Date createDate;

    
    private String reportName;


    public IrActionsReport() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public String getReportFile() {
        return reportFile;
    }

    public Object getBindingType() {
        return bindingType;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getPrintReportName() {
        return printReportName;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public Object getReportType() {
        return reportType;
    }

    public String getType() {
        return type;
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

    public List<ResGroups> getGroupsIdAsList() {
        return groupsIdAsList;
    }

    public List<Integer> getGroupsId() {
        return groupsId;
    }

    public boolean getIsMulti() {
        return isMulti;
    }

    public Object getHelp() {
        return help;
    }

    public String getAttachment() {
        return attachment;
    }

    public IrModel getBindingModelIdAsObject() {
        return bindingModelIdAsObject;
    }

    public OdooId getBindingModelId() {
        return bindingModelId;
    }

    public boolean getIsAttachmentUse() {
        return isAttachmentUse;
    }

    public String getName() {
        return name;
    }

    public ReportPaperformat getPaperformatIdAsObject() {
        return paperformatIdAsObject;
    }

    public OdooId getPaperformatId() {
        return paperformatId;
    }

    public String getBindingViewTypes() {
        return bindingViewTypes;
    }

    public String getModel() {
        return model;
    }

    public String getXmlId() {
        return xmlId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getReportName() {
        return reportName;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setReportFile(String reportFile) {
        this.reportFile = reportFile;
    }

    public void setBindingType(Object bindingType) {
        this.bindingType = bindingType;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setPrintReportName(String printReportName) {
        this.printReportName = printReportName;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setReportType(Object reportType) {
        this.reportType = reportType;
    }

    public void setType(String type) {
        this.type = type;
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

    public void setGroupsIdAsList(List<ResGroups> groupsIdAsList) {
        this.groupsIdAsList = groupsIdAsList;
    }

    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    public void setIsMulti(boolean isMulti) {
        this.isMulti = isMulti;
    }

    public void setHelp(Object help) {
        this.help = help;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public void setBindingModelIdAsObject(IrModel bindingModelIdAsObject) {
        this.bindingModelIdAsObject = bindingModelIdAsObject;
    }

    public void setBindingModelId(OdooId bindingModelId) {
        this.bindingModelId = bindingModelId;
    }

    public void setIsAttachmentUse(boolean isAttachmentUse) {
        this.isAttachmentUse = isAttachmentUse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaperformatIdAsObject(ReportPaperformat paperformatIdAsObject) {
        this.paperformatIdAsObject = paperformatIdAsObject;
    }

    public void setPaperformatId(OdooId paperformatId) {
        this.paperformatId = paperformatId;
    }

    public void setBindingViewTypes(String bindingViewTypes) {
        this.bindingViewTypes = bindingViewTypes;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }



}