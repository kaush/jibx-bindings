
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.net.URI;

/**
 * The {@code <ad:EmergencyCallDataReference>} element.
 */
public class EmergencyCallDataReference {

    private String purpose;                     // mandatory
    private URI ref;                            // mandatory

    public String getPurpose() {
        return this.purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public URI getRef() {
        return this.ref;
    }
    public void setRef(URI ref) {
        this.ref = ref;
    }
}

