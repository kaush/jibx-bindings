
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.held;

import org.dellroad.jibxbindings.pidf.Presence;

/**
 * The {@code <held:locationResponse>} XML element.
 */
public class LocationResponse {

    private LocationUriSet locationUriSet;
    private Presence presence;

    public LocationUriSet getLocationUriSet() {
        return this.locationUriSet;
    }
    public void setLocationUriSet(LocationUriSet locationUriSet) {
        this.locationUriSet = locationUriSet;
    }

    public Presence getPresence() {
        return this.presence;
    }
    public void setPresence(Presence presence) {
        this.presence = presence;
    }
}

