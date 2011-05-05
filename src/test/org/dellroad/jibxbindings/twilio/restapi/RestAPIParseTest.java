
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings.twilio.restapi;

import java.io.IOException;
import java.net.URL;

import org.dellroad.jibxbindings.ParseTestSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RestAPIParseTest extends ParseTestSupport {

    // Valid cases

    @Test(dataProvider = "validTwilioResponses")
    public void testValidTwilioResponse(URL url) throws Exception {
        super.testValidParse(url, TwilioResponse.class);
    }

    @DataProvider(name = "validTwilioResponses")
    public Object[][] validTwilioResponses() throws IOException {
        return genCases("twilioResponse");
    }

    // Invalid cases
}

