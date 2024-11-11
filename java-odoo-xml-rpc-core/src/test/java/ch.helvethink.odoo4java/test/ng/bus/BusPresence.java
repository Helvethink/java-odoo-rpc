
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

package ch.helvethink.odoo4java.test.ng.bus;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;
import ch.helvethink.odoo4java.test.ng.mail.MailGuest;;

@OdooObject("bus.presence")
public class BusPresence implements OdooObj {

    
    private Date lastPresence;

    
    private MailGuest guestIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.mail.MailGuest")
        @OdooModel("mail.MailGuest")
    
    private OdooId guestId;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private Date lastPoll;

    
    private int id;

    
    private String displayName;

    
    private Object status;


    public BusPresence() {
    // Constructor
    }


    public Date getLastPresence() {
        return lastPresence;
    }

    public MailGuest getGuestIdAsObject() {
        return guestIdAsObject;
    }

    public OdooId getGuestId() {
        return guestId;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public Date getLastPoll() {
        return lastPoll;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Object getStatus() {
        return status;
    }



    public void setLastPresence(Date lastPresence) {
        this.lastPresence = lastPresence;
    }

    public void setGuestIdAsObject(MailGuest guestIdAsObject) {
        this.guestIdAsObject = guestIdAsObject;
    }

    public void setGuestId(OdooId guestId) {
        this.guestId = guestId;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setLastPoll(Date lastPoll) {
        this.lastPoll = lastPoll;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setStatus(Object status) {
        this.status = status;
    }



}