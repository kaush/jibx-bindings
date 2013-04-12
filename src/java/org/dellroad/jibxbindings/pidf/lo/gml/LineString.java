
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML LineStrings.
 *
 * This class assumes the nested element is {@code gml:posList}.
 * The {@code <gml:pos>} and {@code <gml:pointProperty>} options are not supported.
 */
public class LineString extends Curve {

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
        gmlObjectSwitch.caseLineString(this);
    }
}

