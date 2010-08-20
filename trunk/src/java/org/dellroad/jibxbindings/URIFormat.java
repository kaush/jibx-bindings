
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings;

import java.net.URI;
import java.net.URISyntaxException;

import org.jibx.runtime.JiBXParseException;

/**
 * JiBX format for parsing {@link URI}s.
 */
public final class URIFormat {

    private URIFormat() {
    }

    public static URI deserialize(String string) throws JiBXParseException {
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            throw new JiBXParseException("invalid URI", string, e);
        }
    }

    public static String serialize(URI uri) throws JiBXParseException {
        return uri.toString();
    }
}

