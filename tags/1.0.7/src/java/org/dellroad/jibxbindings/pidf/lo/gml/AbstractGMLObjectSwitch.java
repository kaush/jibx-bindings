
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.gml;

/**
 * Adapter class for the {@link GMLObjectSwitch} interface.
 */
public class AbstractGMLObjectSwitch implements GMLObjectSwitch {

    protected AbstractGMLObjectSwitch() {
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     */
    @Override
    public void casePoint(Point point) {
        caseDefault(point);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     */
    @Override
    public void casePolygon(Polygon polygon) {
        caseSurface(polygon);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     */
    @Override
    public void caseCircle(Circle circle) {
        caseSurface(circle);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     */
    @Override
    public void caseEllipse(Ellipse ellipse) {
        caseSurface(ellipse);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSurface}.
     */
    @Override
    public void caseArcBand(ArcBand arcBand) {
        caseSurface(arcBand);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSolid}.
     */
    @Override
    public void caseSphere(Sphere sphere) {
        caseSolid(sphere);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSolid}.
     */
    @Override
    public void caseEllipsoid(Ellipsoid ellipsoid) {
        caseSolid(ellipsoid);
    }

    /**
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseSolid}.
     */
    @Override
    public void casePrism(Prism prism) {
        caseSolid(prism);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     */
    @Override
    public void caseLineString(LineString lineString) {
        caseDefault(lineString);
    }

    /**
     * {@inheritDoc}
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     */
    @Override
    public void caseLinearRing(LinearRing linearRing) {
        caseDefault(linearRing);
    }

    /**
     * Roll-up method for {@link Surface} subclasses.
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     */
    protected void caseSurface(Surface surface) {
        caseDefault(surface);
    }

    /**
     * Roll-up method for {@link Solid} subclasses.
     * The implementation in {@link AbstractGMLObjectSwitch} delegates to {@link #caseDefault}.
     */
    protected void caseSolid(Solid solid) {
        caseDefault(solid);
    }

    /**
     * Roll-up method for all cases.
     * The implementation in {@link AbstractGMLObjectSwitch} does nothing.
     */
    protected void caseDefault(GMLObject object) {
    }
}

