package com.glushkoproduction.note.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static final String LOCAL_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    public static final String TIME_FORMAT = "HH:mm:ss";

    public static String localDateTimeToStringDate(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return localDateTime.format(formatter);
    }

    public static String localDateTimeToStringTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIME_FORMAT);
        return localDateTime.format(formatter);
    }



}
