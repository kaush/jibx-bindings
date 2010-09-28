
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * GML arc band.
 */
public class ArcBand extends Surface {

    private double[] center;
    private Measure innerRadius;
    private Measure outerRadius;
    private Measure startAngle;
    private Measure openingAngle;

    /**
     * The center of the arc band.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The {@code <gs:innerRadius>}.
     */
    public Measure getInnerRadius() {
        return this.innerRadius;
    }
    public void setInnerRadius(Measure innerRadius) {
        this.innerRadius = innerRadius;
    }

    /**
     * The {@code <gs:outerRadius>}.
     */
    public Measure getOuterRadius() {
        return this.outerRadius;
    }
    public void setOuterRadius(Measure outerRadius) {
        this.outerRadius = outerRadius;
    }

    /**
     * The {@code <gs:startAngle>}.
     */
    public Measure getStartAngle() {
        return this.startAngle;
    }
    public void setStartAngle(Measure startAngle) {
        this.startAngle = startAngle;
    }

    /**
     * The {@code <gs:openingAngle>}.
     */
    public Measure getOpeningAngle() {
        return this.openingAngle;
    }
    public void setOpeningAngle(Measure openingAngle) {
        this.openingAngle = openingAngle;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseArcBand(this);
    }
}

