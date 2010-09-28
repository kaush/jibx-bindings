
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML ellipse.
 */
public class Ellipse extends Surface {

    private double[] center;
    private Measure semiMajorAxis;
    private Measure semiMinorAxis;
    private Measure orientation;

    /**
     * The center of the ellipse.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The ellipse's {@code <gs:semiMajorAxis>}.
     */
    public Measure getSemiMajorAxis() {
        return this.semiMajorAxis;
    }
    public void setSemiMajorAxis(Measure semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    /**
     * The ellipse's {@code <gs:semiMinorAxis>}.
     */
    public Measure getSemiMinorAxis() {
        return this.semiMinorAxis;
    }
    public void setSemiMinorAxis(Measure semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    /**
     * The ellipse's {@code <gs:orientation>}.
     */
    public Measure getOrientation() {
        return this.orientation;
    }
    public void setOrientation(Measure orientation) {
        this.orientation = orientation;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseEllipse(this);
    }
}

