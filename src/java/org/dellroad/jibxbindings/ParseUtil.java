
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jibx.runtime.JiBXParseException;

/**
 * JiBX parsing utility methods.
 */
public final class ParseUtil {

    private static final String[] BOOLEAN_TRUES = { "1", "true", "yes" };
    private static final String[] BOOLEAN_FALSES = { "0", "false", "no" };

    private static final Pattern RFC3339_FORMAT
      = Pattern.compile("(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(\\.\\d+)?)(Z|([-+]\\d{2}:\\d{2}))");

    private ParseUtil() {
    }

    /**
     * Deserialize an {@link URI}.
     *
     * @see #serializeURI
     */
    public static URI deserializeURI(String string) throws JiBXParseException {
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            throw new JiBXParseException("invalid URI", string, e);
        }
    }

    /**
     * Serialize an {@link URI}.
     *
     * @see #deserializeURI
     */
    public static String serializeURI(URI uri) {
        return uri.toString();
    }

    /**
     * JiBX {@link String} deserializer that normalizes a string as is required by the {@code xsd:token} XSD type.
     * This removes leading and trailing whitespace, and collapses all interior whitespace
     * down to a single space character.
     *
     * @throws NullPointerException if {@code string} is null
     */
    public static String normalize(String string) {
        return string.trim().replaceAll("\\s+", " ");
    }

    /**
     * JiBX {@link String} deserializer support method that verifies that the input string matches the
     * given regular expression. This method can be invoked by custom deserializers that supply the
     * regular expression to it.
     *
     * @throws NullPointerException if {@code string} of {@code regex} is null
     * @throws JiBXParseException if {@code string} does not match {@code regex}
     * @throws java.util.regex.PatternSyntaxException if {@code regex} is not a valid regular expression
     */
    public static String deserializeMatching(String regex, String string) throws JiBXParseException {
        if (!string.matches(regex))
            throw new JiBXParseException("input does not match pattern \"" + regex + "\"", string);
        return string;
    }

    /**
     * Boolean parser that allows "yes" and "no" as well as the usual "true", "false", "0", "1".
     *
     * @throws JiBXParseException if the value is not recognizable as a boolean
     */
    public static boolean deserializeBoolean(String string) throws JiBXParseException {
        for (String s : BOOLEAN_TRUES) {
            if (string.equalsIgnoreCase(s))
                return true;
        }
        for (String s : BOOLEAN_FALSES) {
            if (string.equalsIgnoreCase(s))
                return false;
        }
        throw new JiBXParseException("invalid Boolean value", string);
    }

    /**
     * Deserialize a timestamp in RFC 3339 format.
     *
     * @see #serializeRFC3339Timestamp
     * @see <a href="http://tools.ietf.org/html/rfc3339">RFC 3339</a>
     */
    public static Date deserializeRFC3339Timestamp(String string) throws JiBXParseException {
        Matcher matcher = RFC3339_FORMAT.matcher(string);
        if (!matcher.matches())
            throw new JiBXParseException("incorrectly formatted timestamp", string);
        TimeZone timeZone = TimeZone.getTimeZone("GMT" + (matcher.group(4) != null ? matcher.group(4) : ""));
        Calendar cal = new GregorianCalendar(timeZone, Locale.US);
        String fmt = "y-M-d'T'H:m:s" + (matcher.group(2) != null ?  ".S" : "");
        SimpleDateFormat dateFormat = new SimpleDateFormat(fmt);
        dateFormat.setLenient(false);
        dateFormat.setTimeZone(timeZone);
        dateFormat.setCalendar(cal);
        try {
            return dateFormat.parse(matcher.group(1));
        } catch (ParseException e) {
            throw new JiBXParseException("incorrectly formatted timestamp", string, e);
        }
    }

    /**
     * Serialize a timestamp in RFC 3339 format.
     *
     * @see #deserializeRFC3339Timestamp
     * @see <a href="http://tools.ietf.org/html/rfc3339">RFC 3339</a>
     */
    public static String serializeRFC3339Timestamp(Date timestamp) {
        if (timestamp == null)
            return null;
        TimeZone gmt = TimeZone.getTimeZone("GMT");
        Calendar cal = new GregorianCalendar(gmt, Locale.US);
        cal.setTime(timestamp);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        dateFormat.setTimeZone(gmt);
        dateFormat.setCalendar(cal);
        return dateFormat.format(timestamp);
    }

    /**
     * Deserialize a list of strings. The strings are separated by whitespace.
     *
     * @see #serializeStringList
     */
    public static List<String> deserializeStringList(String string) throws JiBXParseException {
        string = string.trim();
        if (string.length() == 0)
            return Collections.<String>emptyList();
        return Arrays.asList(string.split("\\s"));
    }

    /**
     * Serialize a list of strings. The strings are separated by space characters.
     *
     * @see #deserializeStringList
     */
    public static String serializeStringList(List<String> list) {
        if (list == null)
            return null;
        StringBuilder buf = new StringBuilder();
        for (String string : list) {
            if (buf.length() > 0)
                buf.append(' ');
            buf.append(string);
        }
        return buf.toString();
    }

    /**
     * Deserialize an array of {@code double} values.
     *
     * @see #serializeDoubleArray
     */
    public static double[] deserializeDoubleArray(String string) throws JiBXParseException {
        List<String> strings = ParseUtil.deserializeStringList(string);
        double[] values = new double[strings.size()];
        int i = 0;
        for (String doubleString : strings) {
            try {
                values[i++] = Double.parseDouble(doubleString);
            } catch (NumberFormatException e) {
                throw new JiBXParseException("invalid double value", doubleString, e);
            }
        }
        return values;
    }

    /**
     * Serialize an array of {@code double} values.
     *
     * @see #deserializeDoubleArray
     */
    public static String serializeDoubleArray(double[] values) {
        if (values == null)
            return null;
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (i > 0)
                buf.append(' ');
            buf.append(values[i]);
        }
        return buf.toString();
    }
}
