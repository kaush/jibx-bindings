# jibx-bindings
Automatically exported from code.google.com/p/jibx-bindings

Overview

The jibx-bindings project seeks to provide a library of Java classes and their corresponding pre-compiled JiBX bindings for various common public XML document formats.

By including JiBX along with the appropriate pre-compiled binding JARs from jibx-bindings, your application is all set up for fast and efficient conversion between XML and Java.

While the pre-compiled concrete bindings in jibx-bindings provide immediately usable code, all of the binding modules in jibx-bindings are designed using modular abstract mapping definitions, so you can easily define new bindings that pull from existing XML schemas simply by including these definitions in your own binding.

Unlike bindings auto-generated from XSD schema files, jibx-bindings Java classes and JiBX binding files are all hand crafted and developer friendly, based on the principle that the Java object is primary, while the XML document is just an expression of it.


Modules and Dependencies

Each module is bundled into its own JAR file. There is also a core JAR file on which all other modules depend. Of course all modules depends on JiBX as well. No other dependencies outside of JiBX are required unless noted below.

The currently included modules are:

pidf

Support for the Presence Information Data Format (PIDF) specified by RFC 3863 and RFC 5491, including PIDF-LO and HELD (RFC 5985). View the Javadocs here.

twilio

Support for the Twilio REST API and TwiML. View the Javadocs here.

vCard

Support for XML encoding of vCards is provided by VCardMarshaller, which is a JiBX marshaller/unmarshaller that wraps the ez-vcard library.
