package com.glushkoproduction.note2.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DateUtilTest {
    @Test
    void localDateTimeToStringDateTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDate = DateUtil.localDateTimeToStringDate(localDateTime);
        assertNotNull(formattedDate);
    }

    @Test
    void localDateTimeToStringTimeTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedTime = DateUtil.localDateTimeToStringTime(localDateTime);
        assertNotNull(formattedTime);
    }
}
