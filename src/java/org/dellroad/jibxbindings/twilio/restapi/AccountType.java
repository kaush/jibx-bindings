
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
 * Account type.
 */
public enum AccountType implements XMLEnum {
    TRIAL("Trial"),
    FULL("Full");

    private final String xmlName;

    private AccountType(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static AccountType deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, AccountType.values());
    }
}

