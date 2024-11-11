
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

package ch.helvethink.odoo4java.test.ng.website.seo;

import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.OdooObj;;

@OdooObject("website.seo.metadata")
public class WebsiteSeoMetadata implements OdooObj {

    
    private boolean isIsSeoOptimized;

    
    private String websiteMetaKeywords;

    
    private String websiteMetaTitle;

    
    private Object websiteMetaDescription;

    
    private String websiteMetaOgImg;

    
    private String seoName;


    public WebsiteSeoMetadata() {
    // Constructor
    }


    public boolean getIsIsSeoOptimized() {
        return isIsSeoOptimized;
    }

    public String getWebsiteMetaKeywords() {
        return websiteMetaKeywords;
    }

    public String getWebsiteMetaTitle() {
        return websiteMetaTitle;
    }

    public Object getWebsiteMetaDescription() {
        return websiteMetaDescription;
    }

    public String getWebsiteMetaOgImg() {
        return websiteMetaOgImg;
    }

    public String getSeoName() {
        return seoName;
    }



    public void setIsIsSeoOptimized(boolean isIsSeoOptimized) {
        this.isIsSeoOptimized = isIsSeoOptimized;
    }

    public void setWebsiteMetaKeywords(String websiteMetaKeywords) {
        this.websiteMetaKeywords = websiteMetaKeywords;
    }

    public void setWebsiteMetaTitle(String websiteMetaTitle) {
        this.websiteMetaTitle = websiteMetaTitle;
    }

    public void setWebsiteMetaDescription(Object websiteMetaDescription) {
        this.websiteMetaDescription = websiteMetaDescription;
    }

    public void setWebsiteMetaOgImg(String websiteMetaOgImg) {
        this.websiteMetaOgImg = websiteMetaOgImg;
    }

    public void setSeoName(String seoName) {
        this.seoName = seoName;
    }



}