
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.net.URI;

/**
 * Represents a <code>&lt;RestException&gt;</code>.
 */
public class RestException implements TwilioResponseContent {

    private int status;
    private String message;
    private String code;
    private URI moreInfo;

    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public URI getMoreInfo() {
        return this.moreInfo;
    }
    public void setMoreInfo(URI moreInfo) {
        this.moreInfo = moreInfo;
    }
}

