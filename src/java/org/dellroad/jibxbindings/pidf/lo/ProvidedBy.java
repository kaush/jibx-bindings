
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.util.ArrayList;
import java.util.List;

import org.dellroad.jibxbindings.pidf.lo.ecd.EmergencyCallDataReference;
import org.dellroad.jibxbindings.pidf.lo.ecd.EmergencyCallDataValue;

/**
 * The {@code <gp:provided-by>} element as defined in RFC 4119.
 */
public class ProvidedBy {

    private String dataProviderReference;
    private List<EmergencyCallDataReference> references = new ArrayList<>();
    private List<EmergencyCallDataValue> values = new ArrayList<>();

    public String getDataProviderReference() {
        return this.dataProviderReference;
    }
    public void setDataProviderReference(String dataProviderReference) {
        this.dataProviderReference = dataProviderReference;
    }

    public List<EmergencyCallDataReference> getReferences() {
        return this.references;
    }
    public void setReferences(List<EmergencyCallDataReference> references) {
        this.references = references;
    }

    public List<EmergencyCallDataValue> getValues() {
        return this.values;
    }
    public void setValues(List<EmergencyCallDataValue> values) {
        this.values = values;
    }
}

