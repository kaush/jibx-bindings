
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo.ecd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The {@code <svc:EmergencyCallData.ServiceInfo>} element.
 */
public class ServiceInfo extends AbstractDataProviderReferencing {

    private String serviceEnvironment;                      // mandatory
    private List<String> serviceTypes = new ArrayList<>();  // mandatory (one or more)
    private String serviceMobility;                         // mandatory

    public ServiceInfo() {
    }

    public ServiceInfo(String dataProviderReference, String serviceMobility, String... serviceTypes) {
        super(dataProviderReference);
        this.setServiceMobility(serviceMobility);
        this.serviceTypes.addAll(Arrays.asList(serviceTypes));
    }

    public String getServiceEnvironment() {
        return this.serviceEnvironment;
    }
    public void setServiceEnvironment(String serviceEnvironment) {
        this.serviceEnvironment = serviceEnvironment;
    }

    public List<String> getServiceTypes() {
        return this.serviceTypes;
    }
    public void setServiceTypes(List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public String getServiceMobility() {
        return this.serviceMobility;
    }
    public void setServiceMobility(String serviceMobility) {
        this.serviceMobility = serviceMobility;
    }
}

