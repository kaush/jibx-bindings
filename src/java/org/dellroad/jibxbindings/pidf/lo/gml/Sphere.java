
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML sphere.
 */
public class Sphere extends Solid {

    private double[] center;
    private Measure radius;

    public Sphere() {
    }

    public Sphere(String gid, URI srsName, int srsDimension, double[] center, Measure radius) {
        super(gid, srsName, srsDimension);
        this.setCenter(center);
        this.setRadius(radius);
    }

    /**
     * The center of the sphere.
     */
    public double[] getCenter() {
        return this.center;
    }
    public void setCenter(double[] center) {
        this.center = center;
    }

    /**
     * The sphere's {@code <gs:radius>}.
     */
    public Measure getRadius() {
        return this.radius;
    }
    public void setRadius(Measure radius) {
        this.radius = radius;
    }

    @Override
    public void visit(GMLObjectSwitch gmlObjectSwitch) {
        gmlObjectSwitch.caseSphere(this);
    }
}

