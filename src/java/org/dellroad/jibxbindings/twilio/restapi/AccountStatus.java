
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
 * Account status.
 */
public enum AccountStatus implements XMLEnum {
    ACTIVE("active"),
    SUSPENDED("suspended"),
    CLOSED("closed");

    private final String xmlName;

    private AccountStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static AccountStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, AccountStatus.values());
    }
}

