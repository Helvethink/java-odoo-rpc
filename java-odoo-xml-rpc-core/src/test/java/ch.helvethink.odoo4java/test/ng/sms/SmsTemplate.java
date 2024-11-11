
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

package ch.helvethink.odoo4java.test.ng.sms;

import ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("sms.template")
public class SmsTemplate implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String templateFs;

    
    private IrModel modelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId modelId;

    
    private String body;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String renderModel;

    
    private String name;

    
    private String model;

    
    private IrActionsAct_window sidebarActionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.actions.IrActionsAct_window")
        @OdooModel("ir.actions.IrActionsAct_window")
    
    private OdooId sidebarActionId;

    
    private int id;

    
    private String lang;

    
    private Date createDate;


    public SmsTemplate() {
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

    public String getTemplateFs() {
        return templateFs;
    }

    public IrModel getModelIdAsObject() {
        return modelIdAsObject;
    }

    public OdooId getModelId() {
        return modelId;
    }

    public String getBody() {
        return body;
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

    public String getRenderModel() {
        return renderModel;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public IrActionsAct_window getSidebarActionIdAsObject() {
        return sidebarActionIdAsObject;
    }

    public OdooId getSidebarActionId() {
        return sidebarActionId;
    }

    public int getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }

    public Date getCreateDate() {
        return createDate;
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

    public void setTemplateFs(String templateFs) {
        this.templateFs = templateFs;
    }

    public void setModelIdAsObject(IrModel modelIdAsObject) {
        this.modelIdAsObject = modelIdAsObject;
    }

    public void setModelId(OdooId modelId) {
        this.modelId = modelId;
    }

    public void setBody(String body) {
        this.body = body;
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

    public void setRenderModel(String renderModel) {
        this.renderModel = renderModel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSidebarActionIdAsObject(IrActionsAct_window sidebarActionIdAsObject) {
        this.sidebarActionIdAsObject = sidebarActionIdAsObject;
    }

    public void setSidebarActionId(OdooId sidebarActionId) {
        this.sidebarActionId = sidebarActionId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}