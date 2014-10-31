
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.util.ArrayList;
import java.util.List;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code <pi:EmergencyCallData.Comment>} element.
 */
public class Comment {

    private String dataProviderReference;                   // mandatory
    private List<LangContent> comments = new ArrayList<>();

    public String getDataProviderReference() {
        return this.dataProviderReference;
    }
    public void setDataProviderReference(String dataProviderReference) {
        this.dataProviderReference = dataProviderReference;
    }

    public List<LangContent> getComments() {
        return this.comments;
    }
    public void setComments(List<LangContent> comments) {
        this.comments = comments;
    }
}

