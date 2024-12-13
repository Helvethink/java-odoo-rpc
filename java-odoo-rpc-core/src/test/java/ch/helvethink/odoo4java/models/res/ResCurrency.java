
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

package ch.helvethink.odoo4java.models.res;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.res.currency.ResCurrencyRate;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.currency")
public class ResCurrency implements OdooObj {

    
        @JsonProperty("date")
        private Date date;
    

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        @JsonProperty("symbol")
        private String symbol;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("fiscal_country_codes")
        private String fiscalCountryCodes;
    

    
        @JsonProperty("currency_subunit_label")
        private String currencySubunitLabel;
    

    
        private List<ResCurrencyRate> rateIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.currency.ResCurrencyRate")
        @OdooModel("res.currency.ResCurrencyRate")
        @JsonProperty("rate_ids")
        private List<Integer> rateIds;
    

    
        @JsonProperty("rounding")
        private double rounding;
    

    
        @JsonProperty("active")
        private boolean isActive;
    

    
        @JsonProperty("display_rounding_warning")
        private boolean isDisplayRoundingWarning;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("currency_unit_label")
        private String currencyUnitLabel;
    

    
        @JsonProperty("decimal_places")
        private int decimalPlaces;
    

    
        @JsonProperty("full_name")
        private String fullName;
    

    
        @JsonProperty("rate")
        private double rate;
    

    
        @JsonProperty("is_current_company_currency")
        private boolean isIsCurrentCompanyCurrency;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("iso_numeric")
        private int isoNumeric;
    

    
        @JsonProperty("inverse_rate")
        private double inverseRate;
    

    
        @JsonProperty("rate_string")
        private String rateString;
    

    
        @JsonProperty("position")
        private Object position;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public ResCurrency() {
    // Constructor
    }


    public Date getDate() {
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

    public int getIsoNumeric() {
        return isoNumeric;
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



    public void setDate(Date date) {
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

    public void setIsoNumeric(int isoNumeric) {
        this.isoNumeric = isoNumeric;
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