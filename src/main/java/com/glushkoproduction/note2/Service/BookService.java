package com.glushkoproduction.note2.Service;

import com.glushkoproduction.note2.dto.ModelListBook;
import com.glushkoproduction.note2.entity.Book;

import java.util.List;

public interface BookService {
    List<ModelListBook> findAll();
    void saveAll(List<Book> bookList);
    Book getById(long id);
}
