
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf;

import java.net.URI;

public class Contact {

    private URI uri;
    private float priority;

    public float getPriority() {
        return this.priority;
    }
    public void setPriority(float priority) {
        this.priority = priority;
    }

    public URI getURI() {
        return this.uri;
    }
    public void setURI(URI uri) {
        this.uri = uri;
    }
}

