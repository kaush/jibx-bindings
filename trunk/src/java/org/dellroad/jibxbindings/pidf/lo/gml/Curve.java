
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML curves.
 */
public abstract class Curve extends GeometricPrimitive {

    protected Curve() {
    }

    protected Curve(String gid, URI srsName, int srsDimension) {
        super(gid, srsName, srsDimension);
    }
}

