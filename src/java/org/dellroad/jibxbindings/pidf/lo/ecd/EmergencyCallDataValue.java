
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
public class EmergencyCallDataValue implements Cloneable {

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

// Cloneable

    @Override
    public EmergencyCallDataValue clone() {
        final EmergencyCallDataValue clone;
        try {
            clone = (EmergencyCallDataValue)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        if (this.providerInfos != null) {
            clone.providerInfos = new ArrayList<>(this.providerInfos.size());
            for (ProviderInfo providerInfo : this.providerInfos)
                clone.providerInfos.add(providerInfo.clone());
        }
        if (this.serviceInfos != null) {
            clone.serviceInfos = new ArrayList<>(this.serviceInfos.size());
            for (ServiceInfo serviceInfo : this.serviceInfos)
                clone.serviceInfos.add(serviceInfo.clone());
        }
        if (this.deviceInfos != null) {
            clone.deviceInfos = new ArrayList<>(this.deviceInfos.size());
            for (DeviceInfo deviceInfo : this.deviceInfos)
                clone.deviceInfos.add(deviceInfo.clone());
        }
        if (this.subscriberInfos != null) {
            clone.subscriberInfos = new ArrayList<>(this.subscriberInfos.size());
            for (SubscriberInfo subscriberInfo : this.subscriberInfos)
                clone.subscriberInfos.add(subscriberInfo.clone());
        }
        if (this.comments != null) {
            clone.comments = new ArrayList<>(this.comments.size());
            for (Comment comment : this.comments)
                clone.comments.add(comment.clone());
        }
        return clone;
    }
}

