
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
    QUEUED("queued", false),
    RINGING("ringing", false),
    IN_PROGRESS("in-progress", false),
    COMPLETED("completed", true),
    FAILED("failed", true),
    BUSY("busy", true),
    NO_ANSWER("no-answer", true),
    CANCELED("canceled", true);

    private final String xmlName;
    private final boolean terminal;

    private CallStatus(String xmlName, boolean terminal) {
        this.xmlName = xmlName;
        this.terminal = terminal;
    }

    /**
     * Determine whether this represents a terminal state, i.e., the call is hung up.
     */
    public boolean isTerminal() {
        return this.terminal;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static CallStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, CallStatus.values());
    }
}

