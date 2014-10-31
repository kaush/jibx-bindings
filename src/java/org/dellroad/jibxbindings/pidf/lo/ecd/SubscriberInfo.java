
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import ezvcard.VCard;

/**
 * The {@code <pi:EmergencyCallData.SubscriberInfo>} element.
 */
public class SubscriberInfo {

    private boolean privacyRequested;                       // mandatory
    private String dataProviderReference;                   // mandatory
    private VCard subscriberData;

    public boolean isPrivacyRequested() {
        return this.privacyRequested;
    }
    public void setPrivacyRequested(boolean privacyRequested) {
        this.privacyRequested = privacyRequested;
    }

    public String getDataProviderReference() {
        return this.dataProviderReference;
    }
    public void setDataProviderReference(String dataProviderReference) {
        this.dataProviderReference = dataProviderReference;
    }

    public VCard getSubscriberData() {
        return this.subscriberData;
    }
    public void setSubscriberData(VCard subscriberData) {
        this.subscriberData = subscriberData;
    }

// JiBX

    public boolean hasSubscriberData() {
        return this.getSubscriberData() != null;
    }
}

