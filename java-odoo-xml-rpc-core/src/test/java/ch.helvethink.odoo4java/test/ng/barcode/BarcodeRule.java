
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

package ch.helvethink.odoo4java.test.ng.barcode;

import ch.helvethink.odoo4java.test.ng.barcode.BarcodeNomenclature;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("barcode.rule")
public class BarcodeRule implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String pattern;

    
    private Object encoding;

    
    private Object type;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int sequence;

    
    private String name;

    
    private BarcodeNomenclature barcodeNomenclatureIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.barcode.BarcodeNomenclature")
        @OdooModel("barcode.BarcodeNomenclature")
    
    private OdooId barcodeNomenclatureId;

    
    private String alias;

    
    private int id;

    
    private Date createDate;


    public BarcodeRule() {
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

    public String getPattern() {
        return pattern;
    }

    public Object getEncoding() {
        return encoding;
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

    public int getSequence() {
        return sequence;
    }

    public String getName() {
        return name;
    }

    public BarcodeNomenclature getBarcodeNomenclatureIdAsObject() {
        return barcodeNomenclatureIdAsObject;
    }

    public OdooId getBarcodeNomenclatureId() {
        return barcodeNomenclatureId;
    }

    public String getAlias() {
        return alias;
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

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setEncoding(Object encoding) {
        this.encoding = encoding;
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

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcodeNomenclatureIdAsObject(BarcodeNomenclature barcodeNomenclatureIdAsObject) {
        this.barcodeNomenclatureIdAsObject = barcodeNomenclatureIdAsObject;
    }

    public void setBarcodeNomenclatureId(OdooId barcodeNomenclatureId) {
        this.barcodeNomenclatureId = barcodeNomenclatureId;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}