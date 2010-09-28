
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML ellipsoid.
 */
public class Ellipsoid extends Solid {

    private double[] center;
    private Measure semiMajorAxis;
    private Measure semiMinorAxis;
    private Measure verticalAxis;
    private Measure orientation;

    /**
     * The center of the ellipsoid.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The ellipsoid's {@code <gs:semiMajorAxis>}.
     */
    public Measure getSemiMajorAxis() {
        return this.semiMajorAxis;
    }
    public void setSemiMajorAxis(Measure semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    /**
     * The ellipsoid's {@code <gs:semiMinorAxis>}.
     */
    public Measure getSemiMinorAxis() {
        return this.semiMinorAxis;
    }
    public void setSemiMinorAxis(Measure semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    /**
     * The ellipsoid's {@code <gs:verticalAxis>}.
     */
    public Measure getVerticalAxis() {
        return this.verticalAxis;
    }
    public void setVerticalAxis(Measure verticalAxis) {
        this.verticalAxis = verticalAxis;
    }

    /**
     * The ellipsoid's {@code <gs:orientation>}.
     */
    public Measure getOrientation() {
        return this.orientation;
    }
    public void setOrientation(Measure orientation) {
        this.orientation = orientation;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseEllipsoid(this);
    }
}

