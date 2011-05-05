
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwilioParseTest extends ParseTestSupport {

    // Valid cases

    @Test(dataProvider = "validResponses")
    public void testValidResponse(URL url) throws Exception {
        super.testValidParse(url, Response.class);
    }

    @DataProvider(name = "validResponses")
    public Object[][] validResponses() throws IOException {
        return genCases("response");
    }

    @Test(dataProvider = "validTwilioResponses")
    public void testValidTwilioResponse(URL url) throws Exception {
        super.testValidParse(url, TwilioResponse.class);
    }

    @DataProvider(name = "validTwilioResponses")
    public Object[][] validTwilioResponses() throws IOException {
        return genCases("twilioResponse");
    }

    // Invalid cases

/*
    @Test(dataProvider = "invalidCases")
    public void testInvalid(URL url) throws Exception {
        super.testInvalidParse(url, Response.class);
    }

    @DataProvider(name = "invalidCases")
    public Object[][] invalidCases() throws IOException {
        return genCases("response-invalid");
    }
*/
}

