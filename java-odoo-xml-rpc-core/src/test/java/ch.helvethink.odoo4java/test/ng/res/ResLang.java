
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

package ch.helvethink.odoo4java.test.ng.res;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("res.lang")
public class ResLang implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String code;

    
    private String timeFormat;

    
    private String decimalPoint;

    
    private Object flagImage;

    
    private boolean isActive;

    
    private Object weekStart;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String grouping;

    
    private String thousandsSep;

    
    private String name;

    
    private String urlCode;

    
    private String dateFormat;

    
    private int id;

    
    private String isoCode;

    
    private Date createDate;

    
    private Object direction;

    
    private String flagImageUrl;


    public ResLang() {
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

    public String getTimeFormat() {
        return timeFormat;
    }

    public String getDecimalPoint() {
        return decimalPoint;
    }

    public Object getFlagImage() {
        return flagImage;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getWeekStart() {
        return weekStart;
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

    public String getGrouping() {
        return grouping;
    }

    public String getThousandsSep() {
        return thousandsSep;
    }

    public String getName() {
        return name;
    }

    public String getUrlCode() {
        return urlCode;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public int getId() {
        return id;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getDirection() {
        return direction;
    }

    public String getFlagImageUrl() {
        return flagImageUrl;
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

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public void setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public void setFlagImage(Object flagImage) {
        this.flagImage = flagImage;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setWeekStart(Object weekStart) {
        this.weekStart = weekStart;
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

    public void setGrouping(String grouping) {
        this.grouping = grouping;
    }

    public void setThousandsSep(String thousandsSep) {
        this.thousandsSep = thousandsSep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrlCode(String urlCode) {
        this.urlCode = urlCode;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDirection(Object direction) {
        this.direction = direction;
    }

    public void setFlagImageUrl(String flagImageUrl) {
        this.flagImageUrl = flagImageUrl;
    }



}