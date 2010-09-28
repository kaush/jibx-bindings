
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML circle.
 */
public class Circle extends Surface {

    private double[] center;
    private Measure radius;

    /**
     * The center of the circle.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The circle's {@code <gs:radius>}.
     */
    public Measure getRadius() {
        return this.radius;
    }
    public void setRadius(Measure radius) {
        this.radius = radius;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseCircle(this);
    }
}

