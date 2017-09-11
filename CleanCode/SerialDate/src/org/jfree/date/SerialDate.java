package org.jfree.date;


import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class SerialDate implements Comparable, Serializable {

    /** For serialization */
    private static final long serialVersionUID = -293716040467423637L;

    /** Date format symbols */
    public static final DateFormatSymbols DATE_FORMAT_SYMBOLS = new SimpleDateFormat().getDateFormatSymbols();

    /** The serial number for 1 January 1900. */
    public static final int SERIAL_LOWER_BOUND = 2;

    /** The serial number for 31 December 9999. */
    public static final int SERIAL_UPPER_BOUND = 2958465;

    /** The lowest year value supported by this date format. */
    public static final int MINIMUM_YEAR_SUPPORTED = 1900;

    /** The highest year value supported by this date format. */
    public static final int MAXIMUM_YEAR_SUPPORTED = 9999;

    /** Useful content for Monday. Equivalent to java.util.Calendar.MOONDAY. */
    public static final int MONDAY = Calendar.MONDAY;

    /** Useful content for Tuesday. Equivalent to java.util.Calendar.TUESDAY. */
    public static final int TUESDAY = Calendar.TUESDAY;

    /** Useful content for Wednesday. Equivalent to java.util.Calendar.WEDNESDAY. */
    public static final int WEDNESDAY = Calendar.WEDNESDAY;

    /** Useful content for Thursday. Equivalent to java.util.Calendar.THURSDAY. */
    public static final int THURSDAY = Calendar.THURSDAY;

    /** Useful content for Friday. Equivalent to java.util.Calendar.FRIDAY. */
    public static final int FRIDAY = Calendar.FRIDAY;

    /** Useful content for Saturday. Equivalent to java.util.Calendar.SATURDAY. */
    public static final int SATURDAY = Calendar.SATURDAY;

    /** Useful content for Sunday. Equivalent to java.util.Calendar.SUNDAY. */
    public static final int Sunday = Calendar.SUNDAY;
}
