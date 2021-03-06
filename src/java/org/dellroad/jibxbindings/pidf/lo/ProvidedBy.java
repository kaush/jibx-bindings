
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
public class ProvidedBy implements Cloneable {

    private List<EmergencyCallDataReference> references = new ArrayList<>();
    private List<EmergencyCallDataValue> values = new ArrayList<>();

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

// Cloneable

    @Override
    public ProvidedBy clone() {
        final ProvidedBy clone;
        try {
            clone = (ProvidedBy)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        if (this.references != null) {
            clone.references = new ArrayList<>(this.references.size());
            for (EmergencyCallDataReference reference : this.references)
                clone.references.add(reference.clone());
        }
        if (this.values != null) {
            clone.values = new ArrayList<>(this.values.size());
            for (EmergencyCallDataValue value : this.values)
                clone.values.add(value.clone());
        }
        return clone;
    }
}

