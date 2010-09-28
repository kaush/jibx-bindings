
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML linear ring.
 *
 * This class assumes the nested element is {@code gml:posList}.
 * The {@code <gml:pos>} and {@code <gml:pointProperty>} options are not supported.
 */
public class LinearRing extends Geometry {

    private double[] posList;

    /**
     * The {@code posList} element.
     */
    public double[] getPosList() {
        return this.posList;
    }
    public void setPosList(double[] posList) {
        this.posList = posList;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseLinearRing(this);
    }
}

