
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code <gp:EmergencyCallDataValue>} element.
 */
public class EmergencyCallDataValue {

    private List<ProviderInfo> providerInfos = new ArrayList<>();
    private List<ServiceInfo> serviceInfos = new ArrayList<>();
    private List<DeviceInfo> deviceInfos = new ArrayList<>();
    private List<SubscriberInfo> subscriberInfos = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();

    public List<ProviderInfo> getProviderInfos() {
        return this.providerInfos;
    }
    public void setProviderInfos(List<ProviderInfo> providerInfos) {
        this.providerInfos = providerInfos;
    }

    public List<ServiceInfo> getServiceInfos() {
        return this.serviceInfos;
    }
    public void setServiceInfos(List<ServiceInfo> serviceInfos) {
        this.serviceInfos = serviceInfos;
    }

    public List<DeviceInfo> getDeviceInfos() {
        return this.deviceInfos;
    }
    public void setDeviceInfos(List<DeviceInfo> deviceInfos) {
        this.deviceInfos = deviceInfos;
    }

    public List<SubscriberInfo> getSubscriberInfos() {
        return this.subscriberInfos;
    }
    public void setSubscriberInfos(List<SubscriberInfo> subscriberInfos) {
        this.subscriberInfos = subscriberInfos;
    }

    public List<Comment> getComments() {
        return this.comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

