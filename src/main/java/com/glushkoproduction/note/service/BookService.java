package com.glushkoproduction.note.service;

import com.glushkoproduction.note.dto.ModelListBook;
import com.glushkoproduction.note.model.Book;

import java.util.List;

public interface BookService {
    List<ModelListBook> findAll();
    void saveAll(List<Book> bookList);
    Book getById(long id);
}
