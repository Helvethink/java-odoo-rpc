
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

package ch.helvethink.odoo4java.test.ng.hr;

import ch.helvethink.odoo4java.test.ng.rating.Rating;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.test.ng.hr.HrEmployee;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.hr.HrDepartment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailFollowers;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;;

@OdooObject("hr.attendance")
public class HrAttendance implements OdooObj {

    
    private Date writeDate;

    
    private boolean isMessageIsFollower;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<ResPartner> messagePartnerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private List<Integer> messagePartnerIds;

    
    private int color;

    
    private double inLongitude;

    
    private String inCity;

    
    private String outCity;

    
    private String outIpAddress;

    
    private Object outMode;

    
    private int messageHasErrorCounter;

    
    private Date checkOut;

    
    private String outCountryName;

    
    private boolean isHasMessage;

    
    private String inCountryName;

    
    private double outLatitude;

    
    private String inBrowser;

    
    private int id;

    
    private double workedHours;

    
    private Date createDate;

    
    private String inIpAddress;

    
    private int messageAttachmentCount;

    
    private double overtimeHours;

    
    private HrDepartment departmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrDepartment")
        @OdooModel("hr.HrDepartment")
    
    private OdooId departmentId;

    
    private Date checkIn;

    
    private boolean isMessageHasSmsError;

    
    private List<MailFollowers> messageFollowerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailFollowers")
        @OdooModel("mail.MailFollowers")
    
    private List<Integer> messageFollowerIds;

    
    private double inLatitude;

    
    private Object inMode;

    
    private double outLongitude;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<Rating> ratingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.rating.Rating")
        @OdooModel("rating.Rating")
    
    private List<Integer> ratingIds;

    
    private boolean isMessageHasError;

    
    private boolean isMessageNeedaction;

    
    private HrEmployee employeeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.hr.HrEmployee")
        @OdooModel("hr.HrEmployee")
    
    private OdooId employeeId;

    
    private int messageNeedactionCounter;

    
    private List<MailMessage> websiteMessageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> websiteMessageIds;

    
    private List<MailMessage> messageIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private List<Integer> messageIds;

    
    private String outBrowser;


    public HrAttendance() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public boolean getIsMessageIsFollower() {
        return isMessageIsFollower;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public List<ResPartner> getMessagePartnerIdsAsList() {
        return messagePartnerIdsAsList;
    }

    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    public int getColor() {
        return color;
    }

    public double getInLongitude() {
        return inLongitude;
    }

    public String getInCity() {
        return inCity;
    }

    public String getOutCity() {
        return outCity;
    }

    public String getOutIpAddress() {
        return outIpAddress;
    }

    public Object getOutMode() {
        return outMode;
    }

    public int getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public String getOutCountryName() {
        return outCountryName;
    }

    public boolean getIsHasMessage() {
        return isHasMessage;
    }

    public String getInCountryName() {
        return inCountryName;
    }

    public double getOutLatitude() {
        return outLatitude;
    }

    public String getInBrowser() {
        return inBrowser;
    }

    public int getId() {
        return id;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getInIpAddress() {
        return inIpAddress;
    }

    public int getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public HrDepartment getDepartmentIdAsObject() {
        return departmentIdAsObject;
    }

    public OdooId getDepartmentId() {
        return departmentId;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public boolean getIsMessageHasSmsError() {
        return isMessageHasSmsError;
    }

    public List<MailFollowers> getMessageFollowerIdsAsList() {
        return messageFollowerIdsAsList;
    }

    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    public double getInLatitude() {
        return inLatitude;
    }

    public Object getInMode() {
        return inMode;
    }

    public double getOutLongitude() {
        return outLongitude;
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

    public List<Rating> getRatingIdsAsList() {
        return ratingIdsAsList;
    }

    public List<Integer> getRatingIds() {
        return ratingIds;
    }

    public boolean getIsMessageHasError() {
        return isMessageHasError;
    }

    public boolean getIsMessageNeedaction() {
        return isMessageNeedaction;
    }

    public HrEmployee getEmployeeIdAsObject() {
        return employeeIdAsObject;
    }

    public OdooId getEmployeeId() {
        return employeeId;
    }

    public int getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    public List<MailMessage> getWebsiteMessageIdsAsList() {
        return websiteMessageIdsAsList;
    }

    public List<Integer> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    public List<MailMessage> getMessageIdsAsList() {
        return messageIdsAsList;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public String getOutBrowser() {
        return outBrowser;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setIsMessageIsFollower(boolean isMessageIsFollower) {
        this.isMessageIsFollower = isMessageIsFollower;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setMessagePartnerIdsAsList(List<ResPartner> messagePartnerIdsAsList) {
        this.messagePartnerIdsAsList = messagePartnerIdsAsList;
    }

    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setInLongitude(double inLongitude) {
        this.inLongitude = inLongitude;
    }

    public void setInCity(String inCity) {
        this.inCity = inCity;
    }

    public void setOutCity(String outCity) {
        this.outCity = outCity;
    }

    public void setOutIpAddress(String outIpAddress) {
        this.outIpAddress = outIpAddress;
    }

    public void setOutMode(Object outMode) {
        this.outMode = outMode;
    }

    public void setMessageHasErrorCounter(int messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void setOutCountryName(String outCountryName) {
        this.outCountryName = outCountryName;
    }

    public void setIsHasMessage(boolean isHasMessage) {
        this.isHasMessage = isHasMessage;
    }

    public void setInCountryName(String inCountryName) {
        this.inCountryName = inCountryName;
    }

    public void setOutLatitude(double outLatitude) {
        this.outLatitude = outLatitude;
    }

    public void setInBrowser(String inBrowser) {
        this.inBrowser = inBrowser;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setInIpAddress(String inIpAddress) {
        this.inIpAddress = inIpAddress;
    }

    public void setMessageAttachmentCount(int messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void setDepartmentIdAsObject(HrDepartment departmentIdAsObject) {
        this.departmentIdAsObject = departmentIdAsObject;
    }

    public void setDepartmentId(OdooId departmentId) {
        this.departmentId = departmentId;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setIsMessageHasSmsError(boolean isMessageHasSmsError) {
        this.isMessageHasSmsError = isMessageHasSmsError;
    }

    public void setMessageFollowerIdsAsList(List<MailFollowers> messageFollowerIdsAsList) {
        this.messageFollowerIdsAsList = messageFollowerIdsAsList;
    }

    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    public void setInLatitude(double inLatitude) {
        this.inLatitude = inLatitude;
    }

    public void setInMode(Object inMode) {
        this.inMode = inMode;
    }

    public void setOutLongitude(double outLongitude) {
        this.outLongitude = outLongitude;
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

    public void setRatingIdsAsList(List<Rating> ratingIdsAsList) {
        this.ratingIdsAsList = ratingIdsAsList;
    }

    public void setRatingIds(List<Integer> ratingIds) {
        this.ratingIds = ratingIds;
    }

    public void setIsMessageHasError(boolean isMessageHasError) {
        this.isMessageHasError = isMessageHasError;
    }

    public void setIsMessageNeedaction(boolean isMessageNeedaction) {
        this.isMessageNeedaction = isMessageNeedaction;
    }

    public void setEmployeeIdAsObject(HrEmployee employeeIdAsObject) {
        this.employeeIdAsObject = employeeIdAsObject;
    }

    public void setEmployeeId(OdooId employeeId) {
        this.employeeId = employeeId;
    }

    public void setMessageNeedactionCounter(int messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    public void setWebsiteMessageIdsAsList(List<MailMessage> websiteMessageIdsAsList) {
        this.websiteMessageIdsAsList = websiteMessageIdsAsList;
    }

    public void setWebsiteMessageIds(List<Integer> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    public void setMessageIdsAsList(List<MailMessage> messageIdsAsList) {
        this.messageIdsAsList = messageIdsAsList;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public void setOutBrowser(String outBrowser) {
        this.outBrowser = outBrowser;
    }



}