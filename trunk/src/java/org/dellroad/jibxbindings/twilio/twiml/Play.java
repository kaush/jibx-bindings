
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio.twiml;

import java.net.URI;

/**
 * TwiML <code>&lt;Play&gt;</code> verb.
 */
public class Play implements GatherVerb {

    public static final int DEFAULT_LOOP = 1;

    private int loop = DEFAULT_LOOP;
    private URI uri;

    public int getLoop() {
        return this.loop;
    }
    public void setLoop(int loop) {
        this.loop = loop;
    }

    public URI getURI() {
        return this.uri;
    }
    public void setURI(URI uri) {
        this.uri = uri;
    }
}

