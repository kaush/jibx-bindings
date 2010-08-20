
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tuple {

    private String id;
    private Status status;
    private Contact contact;
    private List<Note> notes = new ArrayList<Note>();
    private Date timestamp;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return this.status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Contact getContact() {
        return this.contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Note> getNotes() {
        return this.notes;
    }
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

