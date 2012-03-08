
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
 * SMS statuses.
 */
public enum SMSStatus implements XMLEnum {
    QUEUED("queued"),
    SENDING("sending"),
    SENT("sent"),
    FAILED("failed");

    private final String xmlName;

    private SMSStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static SMSStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, SMSStatus.values());
    }
}

