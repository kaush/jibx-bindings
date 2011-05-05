
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio;

/**
 * TwiML <code>&lt;Reject&gt;</code> verb.
 */
public class Reject implements Verb {

    private RejectReason reason = RejectReason.REJECTED;

    public RejectReason getReason() {
        return this.reason;
    }
    public void setReason(RejectReason reason) {
        this.reason = reason;
    }
}

