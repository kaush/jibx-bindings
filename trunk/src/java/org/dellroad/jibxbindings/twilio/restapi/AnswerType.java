
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
 * Type of thing that answered a call.
 */
public enum AnswerType implements XMLEnum {
    HUMAN("human"),
    MACHINE("machine");

    private final String xmlName;

    private AnswerType(String xmlName) {
        this.xmlName = xmlName;
    }

    @Override
    public String getXMLName() {
        return this.xmlName;
    }

    public static AnswerType deserializeXML(String string) throws JiBXParseException {
        return ParseUtil.deserializeXMLEnum(string, AnswerType.values());
    }
}

