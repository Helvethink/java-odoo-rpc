
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

@OdooObject("ir.profile")
public class IrProfile implements OdooObj {

    
    private Object tracesAsync;

    
    private int entryCount;

    
    private String session;

    
    private Object speedscopeUrl;

    
    private Object initStackTrace;

    
    private String displayName;

    
    private Object sql;

    
    private Object speedscope;

    
    private double duration;

    
    private Object qweb;

    
    private Object tracesSync;

    
    private String name;

    
    private int sqlCount;

    
    private int id;

    
    private Date createDate;


    public IrProfile() {
    // Constructor
    }


    public Object getTracesAsync() {
        return tracesAsync;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public String getSession() {
        return session;
    }

    public Object getSpeedscopeUrl() {
        return speedscopeUrl;
    }

    public Object getInitStackTrace() {
        return initStackTrace;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getSql() {
        return sql;
    }

    public Object getSpeedscope() {
        return speedscope;
    }

    public double getDuration() {
        return duration;
    }

    public Object getQweb() {
        return qweb;
    }

    public Object getTracesSync() {
        return tracesSync;
    }

    public String getName() {
        return name;
    }

    public int getSqlCount() {
        return sqlCount;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }



    public void setTracesAsync(Object tracesAsync) {
        this.tracesAsync = tracesAsync;
    }

    public void setEntryCount(int entryCount) {
        this.entryCount = entryCount;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setSpeedscopeUrl(Object speedscopeUrl) {
        this.speedscopeUrl = speedscopeUrl;
    }

    public void setInitStackTrace(Object initStackTrace) {
        this.initStackTrace = initStackTrace;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setSql(Object sql) {
        this.sql = sql;
    }

    public void setSpeedscope(Object speedscope) {
        this.speedscope = speedscope;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setQweb(Object qweb) {
        this.qweb = qweb;
    }

    public void setTracesSync(Object tracesSync) {
        this.tracesSync = tracesSync;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSqlCount(int sqlCount) {
        this.sqlCount = sqlCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}