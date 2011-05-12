
/*
 * Copyright (C) 2011 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.util.Date;

/**
 * Represents a <code>&lt;Call&gt;</code>.
 */
public class Call extends SidAccountResource implements TwilioResponseContent {

    private String parentCallSid;
    private String to;
    private String from;
    private String phoneNumberSid;
    private CallStatus status;
    private Date startTime;
    private Date endTime;
    private int duration;
    private double price;
    private CallDirection direction;
    private AnswerType answeredBy;
    private String forwardedFrom;
    private String callerName;
    private APIVersion apiVersion;

    public String getParentCallSid() {
        return this.parentCallSid;
    }
    public void setParentCallSid(String parentCallSid) {
        this.parentCallSid = parentCallSid;
    }

    public String getTo() {
        return this.to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return this.from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getPhoneNumberSid() {
        return this.phoneNumberSid;
    }
    public void setPhoneNumberSid(String phoneNumberSid) {
        this.phoneNumberSid = phoneNumberSid;
    }

    public CallStatus getStatus() {
        return this.status;
    }
    public void setStatus(CallStatus status) {
        this.status = status;
    }

    public Date getStartTime() {
        return this.startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getDuration() {
        return this.duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public CallDirection getDirection() {
        return this.direction;
    }
    public void setDirection(CallDirection direction) {
        this.direction = direction;
    }

    public AnswerType getAnsweredBy() {
        return this.answeredBy;
    }
    public void setAnsweredBy(AnswerType answeredBy) {
        this.answeredBy = answeredBy;
    }

    public String getForwardedFrom() {
        return this.forwardedFrom;
    }
    public void setForwardedFrom(String forwardedFrom) {
        this.forwardedFrom = forwardedFrom;
    }

    public String getCallerName() {
        return this.callerName;
    }
    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public APIVersion getAPIVersion() {
        return this.apiVersion;
    }
    public void setAPIVersion(APIVersion apiVersion) {
        this.apiVersion = apiVersion;
    }
}
