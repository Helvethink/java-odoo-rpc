
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

package ch.helvethink.odoo4java.test.ng.ir;

import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.OdooObj;
import java.util.Date;;

@OdooObject("ir.logging")
public class IrLogging implements OdooObj {

    
    private Date writeDate;

    
    private int writeUid;

    
    private String level;

    
    private String line;

    
    private int createUid;

    
    private Object type;

    
    private Object message;

    
    private String displayName;

    
    private String path;

    
    private String dbname;

    
    private String func;

    
    private String name;

    
    private int id;

    
    private Date createDate;


    public IrLogging() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public int getWriteUid() {
        return writeUid;
    }

    public String getLevel() {
        return level;
    }

    public String getLine() {
        return line;
    }

    public int getCreateUid() {
        return createUid;
    }

    public Object getType() {
        return type;
    }

    public Object getMessage() {
        return message;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPath() {
        return path;
    }

    public String getDbname() {
        return dbname;
    }

    public String getFunc() {
        return func;
    }

    public String getName() {
        return name;
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

    public void setWriteUid(int writeUid) {
        this.writeUid = writeUid;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setCreateUid(int createUid) {
        this.createUid = createUid;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}