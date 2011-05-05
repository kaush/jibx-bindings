
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio;

import java.net.URI;
import java.util.Date;

/**
 * Represents a <code>&lt;OutgoingCallerId&gt;</code>.
 */
public class OutgoingCallerId implements TwilioResponseContent {

    private String sid;
    private String accountSid;
    private String friendlyName;
    private String phoneNumber;
    private Date dateCreated;
    private Date dateUpdated;
    private URI uri;

    public String getSid() {
        return this.sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAccountSid() {
        return this.accountSid;
    }
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return this.dateUpdated;
    }
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public URI getUri() {
        return this.uri;
    }
    public void setUri(URI uri) {
        this.uri = uri;
    }
}

