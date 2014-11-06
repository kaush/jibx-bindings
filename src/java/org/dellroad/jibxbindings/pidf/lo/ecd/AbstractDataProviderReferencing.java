
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

/**
 * Support superclass.
 */
public abstract class AbstractDataProviderReferencing {

    private String dataProviderReference;                   // mandatory

    protected AbstractDataProviderReferencing() {
    }

    protected AbstractDataProviderReferencing(String dataProviderReference) {
        this.setDataProviderReference(dataProviderReference);
    }

    public String getDataProviderReference() {
        return this.dataProviderReference;
    }
    public void setDataProviderReference(String dataProviderReference) {
        this.dataProviderReference = dataProviderReference;
    }
}

