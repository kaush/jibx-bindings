
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML surfaces.
 */
public abstract class Surface extends GeometricPrimitive {

    protected Surface() {
    }

    protected Surface(String gid, URI srsName, int srsDimension) {
        super(gid, srsName, srsDimension);
    }
}

