
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
 * Transcription statuses.
 */
public enum TranscriptionStatus implements XMLEnum {
    IN_PROGRESS("in-progress"),
    COMPLETED("completed"),
    FAILED("failed");

    private final String xmlName;

    private TranscriptionStatus(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static TranscriptionStatus deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, TranscriptionStatus.values());
    }
}

