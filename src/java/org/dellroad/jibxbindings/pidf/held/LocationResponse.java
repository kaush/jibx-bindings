
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
public class LocationResponse implements Cloneable {

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

// Cloneable

    @Override
    public LocationResponse clone() {
        final LocationResponse clone;
        try {
            clone = (LocationResponse)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.locationUriSet = this.locationUriSet != null ? this.locationUriSet.clone() : null;
        clone.presence = this.presence != null ? this.presence.clone() : null;
        return clone;
    }
}

