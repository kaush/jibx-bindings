
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML polygon.
 */
public class Polygon extends Surface {

    private LinearRing exterior;

    /**
     * The polygon's {@code <gml:exterior>}.
     */
    public LinearRing getExterior() {
        return this.exterior;
    }
    public void setExterior(LinearRing exterior) {
        this.exterior = exterior;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.casePolygon(this);
    }
}

