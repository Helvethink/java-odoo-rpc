
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

package ch.helvethink.odoo4java.test.ng.slide.channel;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.test.ng.slide.SlideChannel;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.slide.Slide;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;;

@OdooObject("slide.channel.partner")
public class SlideChannelPartner implements OdooObj {

    
    private Date writeDate;

    
    private int completion;

    
    private String partnerEmail;

    
    private Date lastInvitationDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private int completedSlidesCount;

    
    private ResUsers channelUserIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId channelUserId;

    
    private boolean isActive;

    
    private Object channelEnroll;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object channelVisibility;

    
    private GenericWebsite channelWebsiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId channelWebsiteId;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private String invitationLink;

    
    private Object memberStatus;

    
    private int id;

    
    private Object channelType;

    
    private Date createDate;

    
    private SlideChannel channelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideChannel")
        @OdooModel("slide.SlideChannel")
    
    private OdooId channelId;

    
    private Slide nextSlideIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private OdooId nextSlideId;


    public SlideChannelPartner() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getCompletion() {
        return completion;
    }

    public String getPartnerEmail() {
        return partnerEmail;
    }

    public Date getLastInvitationDate() {
        return lastInvitationDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public int getCompletedSlidesCount() {
        return completedSlidesCount;
    }

    public ResUsers getChannelUserIdAsObject() {
        return channelUserIdAsObject;
    }

    public OdooId getChannelUserId() {
        return channelUserId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getChannelEnroll() {
        return channelEnroll;
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

    public Object getChannelVisibility() {
        return channelVisibility;
    }

    public GenericWebsite getChannelWebsiteIdAsObject() {
        return channelWebsiteIdAsObject;
    }

    public OdooId getChannelWebsiteId() {
        return channelWebsiteId;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public String getInvitationLink() {
        return invitationLink;
    }

    public Object getMemberStatus() {
        return memberStatus;
    }

    public int getId() {
        return id;
    }

    public Object getChannelType() {
        return channelType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public SlideChannel getChannelIdAsObject() {
        return channelIdAsObject;
    }

    public OdooId getChannelId() {
        return channelId;
    }

    public Slide getNextSlideIdAsObject() {
        return nextSlideIdAsObject;
    }

    public OdooId getNextSlideId() {
        return nextSlideId;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    public void setPartnerEmail(String partnerEmail) {
        this.partnerEmail = partnerEmail;
    }

    public void setLastInvitationDate(Date lastInvitationDate) {
        this.lastInvitationDate = lastInvitationDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCompletedSlidesCount(int completedSlidesCount) {
        this.completedSlidesCount = completedSlidesCount;
    }

    public void setChannelUserIdAsObject(ResUsers channelUserIdAsObject) {
        this.channelUserIdAsObject = channelUserIdAsObject;
    }

    public void setChannelUserId(OdooId channelUserId) {
        this.channelUserId = channelUserId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setChannelEnroll(Object channelEnroll) {
        this.channelEnroll = channelEnroll;
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

    public void setChannelVisibility(Object channelVisibility) {
        this.channelVisibility = channelVisibility;
    }

    public void setChannelWebsiteIdAsObject(GenericWebsite channelWebsiteIdAsObject) {
        this.channelWebsiteIdAsObject = channelWebsiteIdAsObject;
    }

    public void setChannelWebsiteId(OdooId channelWebsiteId) {
        this.channelWebsiteId = channelWebsiteId;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setInvitationLink(String invitationLink) {
        this.invitationLink = invitationLink;
    }

    public void setMemberStatus(Object memberStatus) {
        this.memberStatus = memberStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChannelType(Object channelType) {
        this.channelType = channelType;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setChannelIdAsObject(SlideChannel channelIdAsObject) {
        this.channelIdAsObject = channelIdAsObject;
    }

    public void setChannelId(OdooId channelId) {
        this.channelId = channelId;
    }

    public void setNextSlideIdAsObject(Slide nextSlideIdAsObject) {
        this.nextSlideIdAsObject = nextSlideIdAsObject;
    }

    public void setNextSlideId(OdooId nextSlideId) {
        this.nextSlideId = nextSlideId;
    }



}