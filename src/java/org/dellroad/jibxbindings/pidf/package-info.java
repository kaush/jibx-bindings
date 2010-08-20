
/*
 * Copyright (C) 2010 Archie L Cobbs. All rights reserved.
 *
 * $Id$
 */

/**
 * JiBX bindings for the Presence Information Data Format (PIDF).
 *
 * <p>
 * This package includes a JiBX binding having the name {@code pidf}.
 * The binding technically does not adhere to RFC 3863 because it doesn't allow arbitrary nested
 * elements from other namespaces in several locations where supporting that is required. This is
 * because JiBX doesn't support doing that.
 * <p>
 *
 * <p>
 * Several re-usable abstract mappings are defined in this package as listed below by {@code type-name}.
 * <dl>
 * <dt>{@code pidf:contact}</dt>
 * <dd>{@code <contact>} element; represented by {@link org.dellroad.jibxbindings.pidf.Contact}.</dd>
 * <dt>{@code pidf:note}</dt>
 * <dd>{@code <note>} element; represented by {@link org.dellroad.jibxbindings.pidf.LangContent}.</dd>
 * <dt>{@code pidf:presence}</dt>
 * <dd>{@code <presence>} element; represented by {@link org.dellroad.jibxbindings.pidf.Presence}.</dd>
 * <dt>{@code pidf:status}</dt>
 * <dd>{@code <status>} element; represented by {@link org.dellroad.jibxbindings.pidf.Status}.</dd>
 * <dt>{@code pidf:tuple}</dt>
 * <dd>{@code <tuple>} element; represented by {@link org.dellroad.jibxbindings.pidf.Tuple}.</dd>
 * </dl>
 * </p>
 *
 * <p>
 * The {@code type-name}s listed above use the following XML namespace prefixes:
 * <dl>
 * <dt>{@code pidf}</dt>
 * <dd>{@code urn:ietf:params:xml:ns:pidf}</dd>
 * <dl>
 * </p>
 *
 * <p>
 * Note that the elements defined by the abstract mappings live in the null XML namespace. This allows
 * the importing binding to choose the namespace for the mappings by changing the default namespace
 * (see the <a href="http://jibx.sourceforge.net/binding/include-element.html">JiBX docs</a>).
 * </p>
 *
 * @see <a href="http://tools.ietf.org/html/rfc3863">RFC 3863</a>
 * @see <a href="http://jibx-bindings.googlecode.com/">JiBX Bindings</a>
 */
package org.dellroad.jibxbindings.pidf;

