
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio.restapi;

import org.dellroad.jibxbindings.ParseUtil;
import org.dellroad.jibxbindings.XMLEnum;
import org.jibx.runtime.JiBXParseException;

/**
 * Call statuses.
 */
public enum CallStatus implements XMLEnum {
    QUEUED("queued"),
    RINGING("ringing"),
    IN_PROGRESS("in-progress"),
    COMPLETED("completed"),
    FAILED("failed"),
    BUSY("busy"),
    NO_ANSWER("no-answer"),
    CANCELED("canceled");

    private final String xmlName;

    private CallStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static CallStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, CallStatus.values());
    }
}

