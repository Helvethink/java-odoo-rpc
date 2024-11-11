
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

package ch.helvethink.odoo4java.test.ng.uom;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.uom.UomCategory;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("uom.uom")
public class Uom implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String fiscalCountryCodes;

    
    private int color;

    
    private Object uomType;

    
    private double rounding;

    
    private boolean isActive;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private UomCategory categoryIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.uom.UomCategory")
        @OdooModel("uom.UomCategory")
    
    private OdooId categoryId;

    
    private double factorInv;

    
    private String timesheetWidget;

    
    private String name;

    
    private int id;

    
    private double factor;

    
    private Date createDate;

    
    private double ratio;


    public Uom() {
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

    public String getFiscalCountryCodes() {
        return fiscalCountryCodes;
    }

    public int getColor() {
        return color;
    }

    public Object getUomType() {
        return uomType;
    }

    public double getRounding() {
        return rounding;
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

    public UomCategory getCategoryIdAsObject() {
        return categoryIdAsObject;
    }

    public OdooId getCategoryId() {
        return categoryId;
    }

    public double getFactorInv() {
        return factorInv;
    }

    public String getTimesheetWidget() {
        return timesheetWidget;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getFactor() {
        return factor;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public double getRatio() {
        return ratio;
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

    public void setFiscalCountryCodes(String fiscalCountryCodes) {
        this.fiscalCountryCodes = fiscalCountryCodes;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setUomType(Object uomType) {
        this.uomType = uomType;
    }

    public void setRounding(double rounding) {
        this.rounding = rounding;
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

    public void setCategoryIdAsObject(UomCategory categoryIdAsObject) {
        this.categoryIdAsObject = categoryIdAsObject;
    }

    public void setCategoryId(OdooId categoryId) {
        this.categoryId = categoryId;
    }

    public void setFactorInv(double factorInv) {
        this.factorInv = factorInv;
    }

    public void setTimesheetWidget(String timesheetWidget) {
        this.timesheetWidget = timesheetWidget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }



}