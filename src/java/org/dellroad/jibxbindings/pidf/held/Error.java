
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.held;

import java.util.ArrayList;
import java.util.List;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code <held:error>} XML element.
 */
public class Error {

    public static final String REQUEST_ERROR = "requestError";
    public static final String XML_ERROR = "xmlError";
    public static final String GENERAL_LIS_ERROR = "generalLisError";
    public static final String LOCATION_UNKNOWN = "locationUnknown";
    public static final String UNSUPPORTED_MESSAGE = "unsupportedMessage";
    public static final String TIMEOUT = "timeout";
    public static final String CANNOT_PROVIDE_LI_TYPE = "cannotProvideLiType";
    public static final String NOT_LOCATABLE = "notLocatable";

    private String code;
    private List<LangContent> messages = new ArrayList<LangContent>();

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public List<LangContent> getMessages() {
        return this.messages;
    }
    public void setMessage(List<LangContent> messages) {
        this.messages = messages;
    }
}

