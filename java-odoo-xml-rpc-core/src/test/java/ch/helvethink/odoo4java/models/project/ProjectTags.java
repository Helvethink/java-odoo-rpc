
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

package ch.helvethink.odoo4java.models.project;

import ch.helvethink.odoo4java.models.*;
import ch.helvethink.odoo4java.models.res.ResUsers;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@OdooObject("project.tags")
public class ProjectTags implements OdooObj {

    
        @JsonProperty("write_date")
        private Date writeDate;
    

    
        private ResUsers writeUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("write_uid")
        private OdooId writeUid;
    

    
        @JsonProperty("color")
        private int color;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("id")
        private int id;
    

    
        private List<ProjectTask> taskIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.ProjectTask")
        @OdooModel("project.ProjectTask")
        @JsonProperty("task_ids")
        private List<Integer> taskIds;
    

    
        @JsonProperty("display_name")
        private String displayName;
    

    
        private ResUsers createUidAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.res.ResUsers")
        @OdooModel("res.ResUsers")
        @JsonProperty("create_uid")
        private OdooId createUid;
    

    
        @JsonProperty("create_date")
        private Date createDate;
    

    
        private List<Project> projectIdsAsList;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.project.Project")
        @OdooModel("project.Project")
        @JsonProperty("project_ids")
        private List<Integer> projectIds;
    


    public ProjectTags() {
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

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<ProjectTask> getTaskIdsAsList() {
        return taskIdsAsList;
    }

    public List<Integer> getTaskIds() {
        return taskIds;
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

    public Date getCreateDate() {
        return createDate;
    }

    public List<Project> getProjectIdsAsList() {
        return projectIdsAsList;
    }

    public List<Integer> getProjectIds() {
        return projectIds;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskIdsAsList(List<ProjectTask> taskIdsAsList) {
        this.taskIdsAsList = taskIdsAsList;
    }

    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setProjectIdsAsList(List<Project> projectIdsAsList) {
        this.projectIdsAsList = projectIdsAsList;
    }

    public void setProjectIds(List<Integer> projectIds) {
        this.projectIds = projectIds;
    }



}