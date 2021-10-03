package com.glushkoproduction.note.utils;

import com.glushkoproduction.note.model.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void listToMapTest() {
        Map<Long, Book> map = Converters.listToMap(createBookList());
        printMap(map);
        assertEquals(5, map.size());
    }

    private <K,T> void printMap(Map<K,T> map) {
        for (Map.Entry<K, T> m : map.entrySet()) {
            System.out.println(m.getKey() + " + " + m.getValue());
        }
    }

    private List<Book> createBookList() {
        List<Book> lists = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Book book = new Book();
            book.setId(i);
            book.setCreateDateTime(LocalDateTime.now());
            book.setLastSaveDateTime(LocalDateTime.now().plusSeconds(i));
            book.setName("Name_" + i);
            book.setYear(i + 2000);
            lists.add(book);
        }
        return lists;
    }

}
