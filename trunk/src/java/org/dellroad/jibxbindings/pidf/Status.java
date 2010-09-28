
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf;

import org.dellroad.jibxbindings.pidf.lo.GeoPriv;

/**
 * PIDF {@code <status>} element.
 */
public class Status {

    private Basic basic;
    private GeoPriv geoPriv;

    public Basic getBasic() {
        return this.basic;
    }
    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public GeoPriv getGeoPriv() {
        return this.geoPriv;
    }
    public void setGeoPriv(GeoPriv geoPriv) {
        this.geoPriv = geoPriv;
    }
}

