
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.held;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The {@code <held:locationUriSet>} XML element.
 */
public class LocationUriSet implements Cloneable {

    private Date expires;
    private List<URI> locationURIs = new ArrayList<URI>();

    public Date getExpires() {
        return this.expires;
    }
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public List<URI> getLocationURIs() {
        return this.locationURIs;
    }
    public void setLocationURIs(List<URI> locationURIs) {
        this.locationURIs = locationURIs;
    }

// Cloneable

    @Override
    public LocationUriSet clone() {
        final LocationUriSet clone;
        try {
            clone = (LocationUriSet)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.locationURIs = this.locationURIs != null ? new ArrayList<>(this.locationURIs) : null;
        return clone;
    }
}

