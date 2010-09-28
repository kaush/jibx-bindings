
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Superclass for GML geometry objects.
 */
public abstract class Geometry extends GMLObject {

    private String gid;
    private URI srsName;
    private int srsDimension;
    private List<String> axisLabels = new ArrayList<String>();
    private List<String> uomLabels = new ArrayList<String>();

    protected Geometry() {
    }

    /**
     * The {@code gid} attribute.
     */
    public String getGid() {
        return this.gid;
    }
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * The {@code srsName} attribute.
     */
    public URI getSrsName() {
        return this.srsName;
    }
    public void setSrsName(URI srsName) {
        this.srsName = srsName;
    }

    /**
     * The {@code srsDimension} attribute.
     */
    public int getSrsDimension() {
        return this.srsDimension;
    }
    public void setSrsDimension(int srsDimension) {
        this.srsDimension = srsDimension;
    }

    /**
     * The {@code axisLabels} attribute.
     */
    public List<String> getAxisLabels() {
        return this.axisLabels;
    }
    public void setAxisLabels(List<String> axisLabels) {
        this.axisLabels = axisLabels;
    }

    /**
     * The {@code uomLabels} attribute.
     */
    public List<String> getUomLabels() {
        return this.uomLabels;
    }
    public void setUomLabels(List<String> uomLabels) {
        this.uomLabels = uomLabels;
    }
}

