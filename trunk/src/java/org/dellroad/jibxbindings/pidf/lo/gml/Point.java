
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML {@code <point>} objects.
 */
public class Point extends GeometricPrimitive {

    private double[] pos;

    /**
     * The {@code pos} element.
     */
    public double[] getPos() {
        return this.pos;
    }
    public void setPos(double[] pos) {
        this.pos = pos;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.casePoint(this);
    }
}

