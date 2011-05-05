
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio;

/**
 * Specifies voice used in {@link Say} elements.
 */
public enum Voice implements TwilioEnum {
    MAN("man"),
    WOMAN("woman");

    private final String xmlName;

    private Voice(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }
}

