
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;

/**
 * GML measure objects.
 */
public class Measure {

    private URI uom;
    private double value;

    public Measure() {
    }

    public Measure(URI uom, double value) {
        this.setUOM(uom);
        this.setValue(value);
    }

    /**
     * The measure's Unit of Measurement (UOM).
     *
     * @see Constants
     */
    public URI getUOM() {
        return this.uom;
    }
    public void setUOM(URI uom) {
        this.uom = uom;
    }

    /**
     * The measure's value.
     */
    public double getValue() {
        return this.value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}

