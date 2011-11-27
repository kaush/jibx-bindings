
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio.twiml;

import org.dellroad.jibxbindings.XMLEnum;

/**
 * Specifies the language used in {@link Say} elements.
 */
public enum Language implements XMLEnum {
    EN("en"),
    ES("es"),
    FR("fr"),
    DE("de");

    private final String xmlName;

    private Language(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }
}
