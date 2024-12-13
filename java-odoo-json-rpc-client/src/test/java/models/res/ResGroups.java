
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
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("res.groups")
public class ResGroups implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("api_key_duration")
        private double apiKeyDuration;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        private List<ResUsers> usersAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("users")
        private List<Integer> users;
    

    
        @JsonProperty("full_name")
        private String fullName;
    

    
        private List<ResGroups> impliedIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResGroups")
        @OdooModel("res.ResGroups")
        @JsonProperty("implied_ids")
        private List<Integer> impliedIds;
    

    
        private List<ResGroups> transImpliedIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResGroups")
        @OdooModel("res.ResGroups")
        @JsonProperty("trans_implied_ids")
        private List<Integer> transImpliedIds;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("comment")
        private Object comment;
    

    
        @JsonProperty("share")
        private boolean isShare;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    


    public ResGroups() {
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

    public int getColor() {
        return color;
    }

    public double getApiKeyDuration() {
        return apiKeyDuration;
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

    public List<ResUsers> getUsersAsList() {
        return usersAsList;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public String getFullName() {
        return fullName;
    }

    public List<ResGroups> getImpliedIdsAsList() {
        return impliedIdsAsList;
    }

    public List<Integer> getImpliedIds() {
        return impliedIds;
    }

    public List<ResGroups> getTransImpliedIdsAsList() {
        return transImpliedIdsAsList;
    }

    public List<Integer> getTransImpliedIds() {
        return transImpliedIds;
    }

    public String getName() {
        return name;
    }

    public Object getComment() {
        return comment;
    }

    public boolean getIsShare() {
        return isShare;
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

    public void setColor(int color) {
        this.color = color;
    }

    public void setApiKeyDuration(double apiKeyDuration) {
        this.apiKeyDuration = apiKeyDuration;
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

    public void setUsersAsList(List<ResUsers> usersAsList) {
        this.usersAsList = usersAsList;
    }

    public void setUsers(List<Integer> users) {
        this.users = users;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setImpliedIdsAsList(List<ResGroups> impliedIdsAsList) {
        this.impliedIdsAsList = impliedIdsAsList;
    }

    public void setImpliedIds(List<Integer> impliedIds) {
        this.impliedIds = impliedIds;
    }

    public void setTransImpliedIdsAsList(List<ResGroups> transImpliedIdsAsList) {
        this.transImpliedIdsAsList = transImpliedIdsAsList;
    }

    public void setTransImpliedIds(List<Integer> transImpliedIds) {
        this.transImpliedIds = transImpliedIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

    public void setIsShare(boolean isShare) {
        this.isShare = isShare;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}