package org.jfree.date;


import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;

public abstract class SerialDate implements Comparable, Serializable {

    /** For serialization */
    private static final long serialVersionUID = -293716040467423637L;

    /** Date format symbols */
    public static final DateFormatSymbols DATE_FORMAT_SYMBOLS = new SimpleDateFormat().getDateFormatSymbols();

}
