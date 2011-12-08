
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.pidf.lo;

import org.dellroad.jibxbindings.ParseUtil;
import org.jibx.runtime.JiBXParseException;

/**
 * The {@code <ca:civicAddress>} element as defined in RFC 5139.
 */
public class CivicAddress {

// CHECKSTYLE OFF: MemberName
// CHECKSTYLE OFF: ParameterNameCheck
    private String country;
    private CAValue A1;
    private CAValue A2;
    private CAValue A3;
    private CAValue A4;
    private CAValue A5;
    private CAValue A6;
    private CAValue PRM;
    private CAValue PRD;
    private CAValue RD;
    private CAValue STS;
    private CAValue POD;
    private CAValue POM;
    private CAValue RDSEC;
    private CAValue RDBR;
    private CAValue RDSUBBR;
    private CAValue HNO;
    private CAValue HNS;
    private CAValue LMK;
    private CAValue LOC;
    private CAValue FLR;
    private CAValue NAM;
    private CAValue PC;
    private CAValue BLD;
    private CAValue UNIT;
    private CAValue ROOM;
    private CAValue SEAT;
    private CAValue PLC;
    private CAValue PCN;
    private CAValue POBOX;
    private CAValue ADDCODE;

    /**
     * Get country code, which (if not null) should always be a two-letter, all-caps country code.
     */
    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public CAValue getA1() {
        return this.A1;
    }
    public void setA1(CAValue A1) {
        this.A1 = A1;
    }

    public CAValue getA2() {
        return this.A2;
    }
    public void setA2(CAValue A2) {
        this.A2 = A2;
    }

    public CAValue getA3() {
        return this.A3;
    }
    public void setA3(CAValue A3) {
        this.A3 = A3;
    }

    public CAValue getA4() {
        return this.A4;
    }
    public void setA4(CAValue A4) {
        this.A4 = A4;
    }

    public CAValue getA5() {
        return this.A5;
    }
    public void setA5(CAValue A5) {
        this.A5 = A5;
    }

    public CAValue getA6() {
        return this.A6;
    }
    public void setA6(CAValue A6) {
        this.A6 = A6;
    }

    public CAValue getPRM() {
        return this.PRM;
    }
    public void setPRM(CAValue PRM) {
        this.PRM = PRM;
    }

    public CAValue getPRD() {
        return this.PRD;
    }
    public void setPRD(CAValue PRD) {
        this.PRD = PRD;
    }

    public CAValue getRD() {
        return this.RD;
    }
    public void setRD(CAValue RD) {
        this.RD = RD;
    }

    public CAValue getSTS() {
        return this.STS;
    }
    public void setSTS(CAValue STS) {
        this.STS = STS;
    }

    public CAValue getPOD() {
        return this.POD;
    }
    public void setPOD(CAValue POD) {
        this.POD = POD;
    }

    public CAValue getPOM() {
        return this.POM;
    }
    public void setPOM(CAValue POM) {
        this.POM = POM;
    }

    public CAValue getRDSEC() {
        return this.RDSEC;
    }
    public void setRDSEC(CAValue RDSEC) {
        this.RDSEC = RDSEC;
    }

    public CAValue getRDBR() {
        return this.RDBR;
    }
    public void setRDBR(CAValue RDBR) {
        this.RDBR = RDBR;
    }

    public CAValue getRDSUBBR() {
        return this.RDSUBBR;
    }
    public void setRDSUBBR(CAValue RDSUBBR) {
        this.RDSUBBR = RDSUBBR;
    }

    public CAValue getHNO() {
        return this.HNO;
    }
    public void setHNO(CAValue HNO) {
        this.HNO = HNO;
    }

    public CAValue getHNS() {
        return this.HNS;
    }
    public void setHNS(CAValue HNS) {
        this.HNS = HNS;
    }

    public CAValue getLMK() {
        return this.LMK;
    }
    public void setLMK(CAValue LMK) {
        this.LMK = LMK;
    }

    public CAValue getLOC() {
        return this.LOC;
    }
    public void setLOC(CAValue LOC) {
        this.LOC = LOC;
    }

    public CAValue getFLR() {
        return this.FLR;
    }
    public void setFLR(CAValue FLR) {
        this.FLR = FLR;
    }

    public CAValue getNAM() {
        return this.NAM;
    }
    public void setNAM(CAValue NAM) {
        this.NAM = NAM;
    }

    public CAValue getPC() {
        return this.PC;
    }
    public void setPC(CAValue PC) {
        this.PC = PC;
    }

    public CAValue getBLD() {
        return this.BLD;
    }
    public void setBLD(CAValue BLD) {
        this.BLD = BLD;
    }

    public CAValue getUNIT() {
        return this.UNIT;
    }
    public void setUNIT(CAValue UNIT) {
        this.UNIT = UNIT;
    }

    public CAValue getROOM() {
        return this.ROOM;
    }
    public void setROOM(CAValue ROOM) {
        this.ROOM = ROOM;
    }

    public CAValue getSEAT() {
        return this.SEAT;
    }
    public void setSEAT(CAValue SEAT) {
        this.SEAT = SEAT;
    }

    public CAValue getPLC() {
        return this.PLC;
    }
    public void setPLC(CAValue PLC) {
        this.PLC = PLC;
    }

    public CAValue getPCN() {
        return this.PCN;
    }
    public void setPCN(CAValue PCN) {
        this.PCN = PCN;
    }

    public CAValue getPOBOX() {
        return this.POBOX;
    }
    public void setPOBOX(CAValue POBOX) {
        this.POBOX = POBOX;
    }

    public CAValue getADDCODE() {
        return this.ADDCODE;
    }
    public void setADDCODE(CAValue ADDCODE) {
        this.ADDCODE = ADDCODE;
    }
// CHECKSTYLE ON: MemberName
// CHECKSTYLE ON: ParameterNameCheck

    /**
     * Deserialize the {@link #getCountry country} value, which must be a two-letter, all-caps country code.
     */
    public static String deserializeCountry(String string) throws JiBXParseException {
        return ParseUtil.deserializeMatching("[A-Z]{2}", string);
    }
}

