
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo;

import org.dellroad.jibxbindings.pidf.LangContent;

/**
 * The {@code <gp:geopriv>} element as defined in RFC 4119.
 */
public class GeoPriv {

    private LocationInfo locationInfo;
    private UsageRules usageRules;
    private LangContent method;
    private ProvidedBy providedBy;

    public LocationInfo getLocationInfo() {
        return this.locationInfo;
    }
    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public UsageRules getUsageRules() {
        return this.usageRules;
    }
    public void setUsageRules(UsageRules usageRules) {
        this.usageRules = usageRules;
    }

    public LangContent getMethod() {
        return this.method;
    }
    public void setMethod(LangContent method) {
        this.method = method;
    }

    public ProvidedBy getProvidedBy() {
        return this.providedBy;
    }
    public void setProvidedBy(ProvidedBy providedBy) {
        this.providedBy = providedBy;
    }
}

