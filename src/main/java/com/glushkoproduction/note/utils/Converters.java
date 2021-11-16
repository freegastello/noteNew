package com.glushkoproduction.note.utils;

import com.glushkoproduction.note.model.Book;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Converters {
    public static Map<Long, Book> listToMap(List<Book> list) {
        return list.stream().collect(Collectors.toMap(Book::getId, item -> item));
    }
}
