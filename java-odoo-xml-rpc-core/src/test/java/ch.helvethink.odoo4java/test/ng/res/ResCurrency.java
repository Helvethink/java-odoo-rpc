
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

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.res.currency.ResCurrencyRate;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("res.currency")
public class ResCurrency implements OdooObj {

    
    private Object date;

    
    private Date writeDate;

    
    private String symbol;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String fiscalCountryCodes;

    
    private String currencySubunitLabel;

    
    private List<ResCurrencyRate> rateIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.currency.ResCurrencyRate")
        @OdooModel("res.currency.ResCurrencyRate")
    
    private List<Integer> rateIds;

    
    private double rounding;

    
    private boolean isActive;

    
    private boolean isDisplayRoundingWarning;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String currencyUnitLabel;

    
    private int decimalPlaces;

    
    private String fullName;

    
    private double rate;

    
    private boolean isIsCurrentCompanyCurrency;

    
    private String name;

    
    private double inverseRate;

    
    private String rateString;

    
    private Object position;

    
    private int id;

    
    private Date createDate;


    public ResCurrency() {
    // Constructor
    }


    public Object getDate() {
        return date;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public String getSymbol() {
        return symbol;
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

    public String getCurrencySubunitLabel() {
        return currencySubunitLabel;
    }

    public List<ResCurrencyRate> getRateIdsAsList() {
        return rateIdsAsList;
    }

    public List<Integer> getRateIds() {
        return rateIds;
    }

    public double getRounding() {
        return rounding;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean getIsDisplayRoundingWarning() {
        return isDisplayRoundingWarning;
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

    public String getCurrencyUnitLabel() {
        return currencyUnitLabel;
    }

    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    public String getFullName() {
        return fullName;
    }

    public double getRate() {
        return rate;
    }

    public boolean getIsIsCurrentCompanyCurrency() {
        return isIsCurrentCompanyCurrency;
    }

    public String getName() {
        return name;
    }

    public double getInverseRate() {
        return inverseRate;
    }

    public String getRateString() {
        return rateString;
    }

    public Object getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setDate(Object date) {
        this.date = date;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public void setCurrencySubunitLabel(String currencySubunitLabel) {
        this.currencySubunitLabel = currencySubunitLabel;
    }

    public void setRateIdsAsList(List<ResCurrencyRate> rateIdsAsList) {
        this.rateIdsAsList = rateIdsAsList;
    }

    public void setRateIds(List<Integer> rateIds) {
        this.rateIds = rateIds;
    }

    public void setRounding(double rounding) {
        this.rounding = rounding;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsDisplayRoundingWarning(boolean isDisplayRoundingWarning) {
        this.isDisplayRoundingWarning = isDisplayRoundingWarning;
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

    public void setCurrencyUnitLabel(String currencyUnitLabel) {
        this.currencyUnitLabel = currencyUnitLabel;
    }

    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setIsIsCurrentCompanyCurrency(boolean isIsCurrentCompanyCurrency) {
        this.isIsCurrentCompanyCurrency = isIsCurrentCompanyCurrency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInverseRate(double inverseRate) {
        this.inverseRate = inverseRate;
    }

    public void setRateString(String rateString) {
        this.rateString = rateString;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}