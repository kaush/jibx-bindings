
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio;

import java.net.URI;

/**
 * TwiML <code>&lt;Redirect&gt;</code> verb.
 */
public class Redirect implements Verb {

    private Method method = Method.POST;
    private URI target;

    public Method getMethod() {
        return this.method;
    }
    public void setMethod(Method method) {
        this.method = method;
    }

    public URI getTarget() {
        return this.target;
    }
    public void setTarget(URI target) {
        this.target = target;
    }
}

