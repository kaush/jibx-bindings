
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings;

/**
 * Implemented by {@link Enum}s whose values' XML representations are different from their {@link Enum#name names}.
 * To make use of this interface, specify <code>enum-value-method="getXMLName"</code> in the JiBX binding file.
 */
public interface XMLEnum {

    /**
     * Get the unique string to use to represent this instance in an XML file.
     */
    String getXMLName();
}

