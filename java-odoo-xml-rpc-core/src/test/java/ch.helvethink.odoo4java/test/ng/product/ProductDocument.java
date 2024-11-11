
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

package ch.helvethink.odoo4java.test.ng.product;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.discuss.voice.DiscussVoiceMetadata;
import ch.helvethink.odoo4java.test.ng.ir.IrAttachment;
import ch.helvethink.odoo4java.test.ng.theme.ir.ThemeIrAttachment;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import ch.helvethink.odoo4java.test.ng.generic.GenericWebsite;
import java.util.Date;
import java.util.List;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("product.document")
public class ProductDocument implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String resModel;

    
    private Object description;

    
    private String resName;

    
    private Object type;

    
    private int imageHeight;

    
    private boolean isPublic;

    
    private Object resId;

    
    private Object attachedOn;

    
    private String checksum;

    
    private ThemeIrAttachment themeTemplateIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.theme.ir.ThemeIrAttachment")
        @OdooModel("theme.ir.ThemeIrAttachment")
    
    private OdooId themeTemplateId;

    
    private int id;

    
    private Date createDate;

    
    private String key;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Object datas;

    
    private IrAttachment irAttachmentIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId irAttachmentId;

    
    private boolean isActive;

    
    private Object raw;

    
    private Object dbDatas;

    
    private String storeFname;

    
    private int imageWidth;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<DiscussVoiceMetadata> voiceIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.discuss.voice.DiscussVoiceMetadata")
        @OdooModel("discuss.voice.DiscussVoiceMetadata")
    
    private List<Integer> voiceIds;

    
    private String imageSrc;

    
    private String url;

    
    private int fileSize;

    
    private String accessToken;

    
    private Object indexContent;

    
    private String localUrl;

    
    private String name;

    
    private String mimetype;

    
    private String resField;

    
    private IrAttachment originalIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.IrAttachment")
        @OdooModel("ir.IrAttachment")
    
    private OdooId originalId;

    
    private GenericWebsite websiteIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.generic.GenericWebsite")
        @OdooModel("generic.GenericWebsite")
    
    private OdooId websiteId;


    public ProductDocument() {
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

    public String getResModel() {
        return resModel;
    }

    public Object getDescription() {
        return description;
    }

    public String getResName() {
        return resName;
    }

    public Object getType() {
        return type;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public Object getResId() {
        return resId;
    }

    public Object getAttachedOn() {
        return attachedOn;
    }

    public String getChecksum() {
        return checksum;
    }

    public ThemeIrAttachment getThemeTemplateIdAsObject() {
        return themeTemplateIdAsObject;
    }

    public OdooId getThemeTemplateId() {
        return themeTemplateId;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getKey() {
        return key;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Object getDatas() {
        return datas;
    }

    public IrAttachment getIrAttachmentIdAsObject() {
        return irAttachmentIdAsObject;
    }

    public OdooId getIrAttachmentId() {
        return irAttachmentId;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Object getRaw() {
        return raw;
    }

    public Object getDbDatas() {
        return dbDatas;
    }

    public String getStoreFname() {
        return storeFname;
    }

    public int getImageWidth() {
        return imageWidth;
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

    public List<DiscussVoiceMetadata> getVoiceIdsAsList() {
        return voiceIdsAsList;
    }

    public List<Integer> getVoiceIds() {
        return voiceIds;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public String getUrl() {
        return url;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public Object getIndexContent() {
        return indexContent;
    }

    public String getLocalUrl() {
        return localUrl;
    }

    public String getName() {
        return name;
    }

    public String getMimetype() {
        return mimetype;
    }

    public String getResField() {
        return resField;
    }

    public IrAttachment getOriginalIdAsObject() {
        return originalIdAsObject;
    }

    public OdooId getOriginalId() {
        return originalId;
    }

    public GenericWebsite getWebsiteIdAsObject() {
        return websiteIdAsObject;
    }

    public OdooId getWebsiteId() {
        return websiteId;
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

    public void setResModel(String resModel) {
        this.resModel = resModel;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public void setResId(Object resId) {
        this.resId = resId;
    }

    public void setAttachedOn(Object attachedOn) {
        this.attachedOn = attachedOn;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public void setThemeTemplateIdAsObject(ThemeIrAttachment themeTemplateIdAsObject) {
        this.themeTemplateIdAsObject = themeTemplateIdAsObject;
    }

    public void setThemeTemplateId(OdooId themeTemplateId) {
        this.themeTemplateId = themeTemplateId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

    public void setIrAttachmentIdAsObject(IrAttachment irAttachmentIdAsObject) {
        this.irAttachmentIdAsObject = irAttachmentIdAsObject;
    }

    public void setIrAttachmentId(OdooId irAttachmentId) {
        this.irAttachmentId = irAttachmentId;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setRaw(Object raw) {
        this.raw = raw;
    }

    public void setDbDatas(Object dbDatas) {
        this.dbDatas = dbDatas;
    }

    public void setStoreFname(String storeFname) {
        this.storeFname = storeFname;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
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

    public void setVoiceIdsAsList(List<DiscussVoiceMetadata> voiceIdsAsList) {
        this.voiceIdsAsList = voiceIdsAsList;
    }

    public void setVoiceIds(List<Integer> voiceIds) {
        this.voiceIds = voiceIds;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setIndexContent(Object indexContent) {
        this.indexContent = indexContent;
    }

    public void setLocalUrl(String localUrl) {
        this.localUrl = localUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public void setResField(String resField) {
        this.resField = resField;
    }

    public void setOriginalIdAsObject(IrAttachment originalIdAsObject) {
        this.originalIdAsObject = originalIdAsObject;
    }

    public void setOriginalId(OdooId originalId) {
        this.originalId = originalId;
    }

    public void setWebsiteIdAsObject(GenericWebsite websiteIdAsObject) {
        this.websiteIdAsObject = websiteIdAsObject;
    }

    public void setWebsiteId(OdooId websiteId) {
        this.websiteId = websiteId;
    }



}