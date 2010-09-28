
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * Superclass for GML objects.
 */
public abstract class GMLObject {

    private String gmlId;

    protected GMLObject() {
    }

    /**
     * The id from the {@code gml:id} attribute.
     */
    public String getGMLId() {
        return this.gmlId;
    }
    public void setGMLId(String gmlId) {
        this.gmlId = gmlId;
    }

    /**
     * Apply {@link GMLObjectSwitch} visitor pattern.
     */
    public abstract void visit(GMLObjectSwitch gmlObjectSwitch);
}

