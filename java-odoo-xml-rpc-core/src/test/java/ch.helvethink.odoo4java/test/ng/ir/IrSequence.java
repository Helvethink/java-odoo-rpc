
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

import java.util.List;
import ch.helvethink.odoo4java.test.ng.ir.sequence.IrSequenceDate_range;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("ir.sequence")
public class IrSequence implements OdooObj {

    
    private Date writeDate;

    
    private int padding;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private String prefix;

    
    private Object implementation;

    
    private int numberNextActual;

    
    private boolean isActive;

    
    private String suffix;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int numberNext;

    
    private String name;

    
    private int numberIncrement;

    
    private int id;

    
    private Date createDate;

    
    private boolean isUseDateRange;

    
    private List<IrSequenceDate_range> dateRangeIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.sequence.IrSequenceDate_range")
        @OdooModel("ir.sequence.IrSequenceDate_range")
    
    private List<Integer> dateRangeIds;


    public IrSequence() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getPadding() {
        return padding;
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

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public String getPrefix() {
        return prefix;
    }

    public Object getImplementation() {
        return implementation;
    }

    public int getNumberNextActual() {
        return numberNextActual;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getSuffix() {
        return suffix;
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

    public int getNumberNext() {
        return numberNext;
    }

    public String getName() {
        return name;
    }

    public int getNumberIncrement() {
        return numberIncrement;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsUseDateRange() {
        return isUseDateRange;
    }

    public List<IrSequenceDate_range> getDateRangeIdsAsList() {
        return dateRangeIdsAsList;
    }

    public List<Integer> getDateRangeIds() {
        return dateRangeIds;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPadding(int padding) {
        this.padding = padding;
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

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setImplementation(Object implementation) {
        this.implementation = implementation;
    }

    public void setNumberNextActual(int numberNextActual) {
        this.numberNextActual = numberNextActual;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

    public void setNumberNext(int numberNext) {
        this.numberNext = numberNext;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberIncrement(int numberIncrement) {
        this.numberIncrement = numberIncrement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsUseDateRange(boolean isUseDateRange) {
        this.isUseDateRange = isUseDateRange;
    }

    public void setDateRangeIdsAsList(List<IrSequenceDate_range> dateRangeIdsAsList) {
        this.dateRangeIdsAsList = dateRangeIdsAsList;
    }

    public void setDateRangeIds(List<Integer> dateRangeIds) {
        this.dateRangeIds = dateRangeIds;
    }



}