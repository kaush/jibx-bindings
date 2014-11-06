
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML geometric primitives.
 */
public abstract class GeometricPrimitive extends Geometry {

    protected GeometricPrimitive() {
    }

    protected GeometricPrimitive(String gid, URI srsName, int srsDimension) {
        super(gid, srsName, srsDimension);
    }
}

