
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
 * Transcription types. These are not documented so I'm just guessing.
 */
public enum TranscriptionType implements XMLEnum {
    FAST("fast"),
    MEDIUM("medium"),
    SLOW("slow");

    private final String xmlName;

    private TranscriptionType(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static TranscriptionType deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, TranscriptionType.values());
    }
}

