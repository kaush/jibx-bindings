
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
 * API versions. Enum values are ordered from most recent to oldest.
 */
public enum APIVersion implements XMLEnum {
    V_2008_08_01("2008-08-01"),
    V_2010_04_01("2010-04-01");

    /**
     * The API version that this library version adheres to (always the first enum value).
     */
    public static final APIVersion CURRENT = APIVersion.values()[0];

    private final String xmlName;

    private APIVersion(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static APIVersion deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, APIVersion.values());
    }
}

