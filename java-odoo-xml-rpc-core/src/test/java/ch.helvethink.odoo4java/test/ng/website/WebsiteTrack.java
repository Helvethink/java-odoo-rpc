
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

package ch.helvethink.odoo4java.test.ng.website;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.website.WebsitePage;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import java.util.Date;;

@OdooObject("website.track")
public class WebsiteTrack implements OdooObj {

    
    private WebsitePage pageIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsitePage")
        @OdooModel("website.WebsitePage")
    
    private OdooId pageId;

    
    private Date visitDatetime;

    
    private WebsiteVisitor visitorIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.website.WebsiteVisitor")
        @OdooModel("website.WebsiteVisitor")
    
    private OdooId visitorId;

    
    private int id;

    
    private String displayName;

    
    private Object url;


    public WebsiteTrack() {
    // Constructor
    }


    public WebsitePage getPageIdAsObject() {
        return pageIdAsObject;
    }

    public OdooId getPageId() {
        return pageId;
    }

    public Date getVisitDatetime() {
        return visitDatetime;
    }

    public WebsiteVisitor getVisitorIdAsObject() {
        return visitorIdAsObject;
    }

    public OdooId getVisitorId() {
        return visitorId;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getUrl() {
        return url;
    }



    public void setPageIdAsObject(WebsitePage pageIdAsObject) {
        this.pageIdAsObject = pageIdAsObject;
    }

    public void setPageId(OdooId pageId) {
        this.pageId = pageId;
    }

    public void setVisitDatetime(Date visitDatetime) {
        this.visitDatetime = visitDatetime;
    }

    public void setVisitorIdAsObject(WebsiteVisitor visitorIdAsObject) {
        this.visitorIdAsObject = visitorIdAsObject;
    }

    public void setVisitorId(OdooId visitorId) {
        this.visitorId = visitorId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUrl(Object url) {
        this.url = url;
    }



}