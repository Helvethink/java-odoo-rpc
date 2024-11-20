
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

package ch.helvethink.odoo4java.models.account;

import ch.helvethink.odoo4java.models.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@OdooObject("account.root")
public class AccountRoot implements OdooObj {

    
        private AccountRoot parentIdAsObject;
    

    
        @FieldRelation("ch.helvethink.odoo4java.models.account.AccountRoot")
        @OdooModel("account.AccountRoot")
        @JsonProperty("parent_id")
        private OdooId parentId;
    

    
        @JsonProperty("name")
        private String name;
    

    
        @JsonProperty("id")
        private int id;
    

    
        @JsonProperty("display_name")
        private String displayName;
    


    public AccountRoot() {
    // Constructor
    }


    public AccountRoot getParentIdAsObject() {
        return parentIdAsObject;
    }

    public OdooId getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }



    public void setParentIdAsObject(AccountRoot parentIdAsObject) {
        this.parentIdAsObject = parentIdAsObject;
    }

    public void setParentId(OdooId parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }



}