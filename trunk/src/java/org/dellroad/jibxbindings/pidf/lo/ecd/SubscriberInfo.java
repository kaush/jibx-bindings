
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
public class SubscriberInfo extends AbstractDataProviderReferencing {

    private boolean privacyRequested;                       // mandatory
    private VCard subscriberData;

    public SubscriberInfo() {
    }

    public SubscriberInfo(String dataProviderReference, boolean privacyRequested, VCard subscriberData) {
        super(dataProviderReference);
        this.setPrivacyRequested(privacyRequested);
        this.setSubscriberData(subscriberData);
    }

    public boolean isPrivacyRequested() {
        return this.privacyRequested;
    }
    public void setPrivacyRequested(boolean privacyRequested) {
        this.privacyRequested = privacyRequested;
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

