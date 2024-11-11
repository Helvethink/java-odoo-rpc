
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

package ch.helvethink.odoo4java.test.ng.rating;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResPartner;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.ir.IrModel;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.mail.MailMessage;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("rating.rating")
public class Rating implements OdooObj {

    
    private boolean isConsumed;

    
    private Date writeDate;

    
    private ResPartner publisherIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId publisherId;

    
    private boolean isIsInternal;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String resModel;

    
    private Date publisherDatetime;

    
    private double rating;

    
    private String resName;

    
    private String parentResName;

    
    private Object feedback;

    
    private Object parentRef;

    
    private ResPartner partnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId partnerId;

    
    private Object resId;

    
    private String parentResModel;

    
    private IrModel parentResModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId parentResModelId;

    
    private int id;

    
    private Date createDate;

    
    private String ratedPartnerName;

    
    private ResPartner ratedPartnerIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResPartner")
        @OdooModel("res.ResPartner")
    
    private OdooId ratedPartnerId;

    
    private IrModel resModelIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrModel")
        @OdooModel("ir.IrModel")
    
    private OdooId resModelId;

    
    private Object ratingText;

    
    private MailMessage messageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailMessage")
        @OdooModel("mail.MailMessage")
    
    private OdooId messageId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private int parentResId;

    
    private Object ratingImage;

    
    private String accessToken;

    
    private String ratingImageUrl;

    
    private Object resourceRef;

    
    private Object publisherComment;


    public Rating() {
    // Constructor
    }


    public boolean getIsConsumed() {
        return isConsumed;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public ResPartner getPublisherIdAsObject() {
        return publisherIdAsObject;
    }

    public OdooId getPublisherId() {
        return publisherId;
    }

    public boolean getIsIsInternal() {
        return isIsInternal;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getResModel() {
        return resModel;
    }

    public Date getPublisherDatetime() {
        return publisherDatetime;
    }

    public double getRating() {
        return rating;
    }

    public String getResName() {
        return resName;
    }

    public String getParentResName() {
        return parentResName;
    }

    public Object getFeedback() {
        return feedback;
    }

    public Object getParentRef() {
        return parentRef;
    }

    public ResPartner getPartnerIdAsObject() {
        return partnerIdAsObject;
    }

    public OdooId getPartnerId() {
        return partnerId;
    }

    public Object getResId() {
        return resId;
    }

    public String getParentResModel() {
        return parentResModel;
    }

    public IrModel getParentResModelIdAsObject() {
        return parentResModelIdAsObject;
    }

    public OdooId getParentResModelId() {
        return parentResModelId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getRatedPartnerName() {
        return ratedPartnerName;
    }

    public ResPartner getRatedPartnerIdAsObject() {
        return ratedPartnerIdAsObject;
    }

    public OdooId getRatedPartnerId() {
        return ratedPartnerId;
    }

    public IrModel getResModelIdAsObject() {
        return resModelIdAsObject;
    }

    public OdooId getResModelId() {
        return resModelId;
    }

    public Object getRatingText() {
        return ratingText;
    }

    public MailMessage getMessageIdAsObject() {
        return messageIdAsObject;
    }

    public OdooId getMessageId() {
        return messageId;
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

    public int getParentResId() {
        return parentResId;
    }

    public Object getRatingImage() {
        return ratingImage;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRatingImageUrl() {
        return ratingImageUrl;
    }

    public Object getResourceRef() {
        return resourceRef;
    }

    public Object getPublisherComment() {
        return publisherComment;
    }



    public void setIsConsumed(boolean isConsumed) {
        this.isConsumed = isConsumed;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setPublisherIdAsObject(ResPartner publisherIdAsObject) {
        this.publisherIdAsObject = publisherIdAsObject;
    }

    public void setPublisherId(OdooId publisherId) {
        this.publisherId = publisherId;
    }

    public void setIsIsInternal(boolean isIsInternal) {
        this.isIsInternal = isIsInternal;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setPublisherDatetime(Date publisherDatetime) {
        this.publisherDatetime = publisherDatetime;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public void setParentResName(String parentResName) {
        this.parentResName = parentResName;
    }

    public void setFeedback(Object feedback) {
        this.feedback = feedback;
    }

    public void setParentRef(Object parentRef) {
        this.parentRef = parentRef;
    }

    public void setPartnerIdAsObject(ResPartner partnerIdAsObject) {
        this.partnerIdAsObject = partnerIdAsObject;
    }

    public void setPartnerId(OdooId partnerId) {
        this.partnerId = partnerId;
    }

    public void setResId(Object resId) {
        this.resId = resId;
    }

    public void setParentResModel(String parentResModel) {
        this.parentResModel = parentResModel;
    }

    public void setParentResModelIdAsObject(IrModel parentResModelIdAsObject) {
        this.parentResModelIdAsObject = parentResModelIdAsObject;
    }

    public void setParentResModelId(OdooId parentResModelId) {
        this.parentResModelId = parentResModelId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRatedPartnerName(String ratedPartnerName) {
        this.ratedPartnerName = ratedPartnerName;
    }

    public void setRatedPartnerIdAsObject(ResPartner ratedPartnerIdAsObject) {
        this.ratedPartnerIdAsObject = ratedPartnerIdAsObject;
    }

    public void setRatedPartnerId(OdooId ratedPartnerId) {
        this.ratedPartnerId = ratedPartnerId;
    }

    public void setResModelIdAsObject(IrModel resModelIdAsObject) {
        this.resModelIdAsObject = resModelIdAsObject;
    }

    public void setResModelId(OdooId resModelId) {
        this.resModelId = resModelId;
    }

    public void setRatingText(Object ratingText) {
        this.ratingText = ratingText;
    }

    public void setMessageIdAsObject(MailMessage messageIdAsObject) {
        this.messageIdAsObject = messageIdAsObject;
    }

    public void setMessageId(OdooId messageId) {
        this.messageId = messageId;
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

    public void setParentResId(int parentResId) {
        this.parentResId = parentResId;
    }

    public void setRatingImage(Object ratingImage) {
        this.ratingImage = ratingImage;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setRatingImageUrl(String ratingImageUrl) {
        this.ratingImageUrl = ratingImageUrl;
    }

    public void setResourceRef(Object resourceRef) {
        this.resourceRef = resourceRef;
    }

    public void setPublisherComment(Object publisherComment) {
        this.publisherComment = publisherComment;
    }



}