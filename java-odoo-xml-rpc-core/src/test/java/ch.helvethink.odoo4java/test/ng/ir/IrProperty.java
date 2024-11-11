
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

package ch.helvethink.odoo4java.test.ng.ir;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields;
import java.util.Date;;

@OdooObject("ir.property")
public class IrProperty implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private double valueFloat;

    
    private Object valueBinary;

    
    private String valueReference;

    
    private Date valueDatetime;

    
    private Object type;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object valueText;

    
    private int valueInteger;

    
    private IrModelFields fieldsIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.model.IrModelFields")
        @OdooModel("ir.model.IrModelFields")
    
    private OdooId fieldsId;

    
    private String resId;

    
    private String name;

    
    private int id;

    
    private Date createDate;


    public IrProperty() {
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public double getValueFloat() {
        return valueFloat;
    }

    public Object getValueBinary() {
        return valueBinary;
    }

    public String getValueReference() {
        return valueReference;
    }

    public Date getValueDatetime() {
        return valueDatetime;
    }

    public Object getType() {
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

    public Object getValueText() {
        return valueText;
    }

    public int getValueInteger() {
        return valueInteger;
    }

    public IrModelFields getFieldsIdAsObject() {
        return fieldsIdAsObject;
    }

    public OdooId getFieldsId() {
        return fieldsId;
    }

    public String getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setValueFloat(double valueFloat) {
        this.valueFloat = valueFloat;
    }

    public void setValueBinary(Object valueBinary) {
        this.valueBinary = valueBinary;
    }

    public void setValueReference(String valueReference) {
        this.valueReference = valueReference;
    }

    public void setValueDatetime(Date valueDatetime) {
        this.valueDatetime = valueDatetime;
    }

    public void setType(Object type) {
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

    public void setValueText(Object valueText) {
        this.valueText = valueText;
    }

    public void setValueInteger(int valueInteger) {
        this.valueInteger = valueInteger;
    }

    public void setFieldsIdAsObject(IrModelFields fieldsIdAsObject) {
        this.fieldsIdAsObject = fieldsIdAsObject;
    }

    public void setFieldsId(OdooId fieldsId) {
        this.fieldsId = fieldsId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}