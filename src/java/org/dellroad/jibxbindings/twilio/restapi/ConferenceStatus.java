
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
 * Conference statuses.
 */
public enum ConferenceStatus implements XMLEnum {
    INIT("init"),
    IN_PROGRESS("in-progress"),
    COMPLETED("completed");

    private final String xmlName;

    private ConferenceStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static ConferenceStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, ConferenceStatus.values());
    }
}

