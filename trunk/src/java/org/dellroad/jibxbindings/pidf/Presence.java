
/*
 * Copyright (C) Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Top level element in the Presence Information Data Format (PIDF).
 */
public class Presence {

    private URI entity;
    private List<Tuple> tuples = new ArrayList<Tuple>();
    private List<Note> notes = new ArrayList<Note>();

    public URI getEntity() {
        return this.entity;
    }
    public void setEntity(URI entity) {
        this.entity = entity;
    }

    public List<Tuple> getTuples() {
        return this.tuples;
    }
    public void setTuples(List<Tuple> tuples) {
        this.tuples = tuples;
    }

    public List<Note> getNotes() {
        return this.notes;
    }
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}

