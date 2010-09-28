
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo;

import java.net.URI;
import java.util.Date;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code &lt;usage-rules&gt;} element as defined in RFC 4119.
 */
public class UsageRules {

    private boolean retransmissionAllowed;
    private Date retentionExpiry;
    private URI externalRuleset;
    private LangContent noteWell;

    public boolean isRetransmissionAllowed() {
        return this.retransmissionAllowed;
    }
    public void setRetransmissionAllowed(boolean retransmissionAllowed) {
        this.retransmissionAllowed = retransmissionAllowed;
    }

    public Date getRetentionExpiry() {
        return this.retentionExpiry;
    }
    public void setRetentionExpiry(Date retentionExpiry) {
        this.retentionExpiry = retentionExpiry;
    }

    public URI getExternalRuleset() {
        return this.externalRuleset;
    }
    public void setExternalRuleset(URI externalRuleset) {
        this.externalRuleset = externalRuleset;
    }

    public LangContent getNoteWell() {
        return this.noteWell;
    }
    public void setNoteWell(LangContent noteWell) {
        this.noteWell = noteWell;
    }
}

