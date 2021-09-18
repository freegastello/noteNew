package com.glushkoproduction.note2.Service.impl;

import com.glushkoproduction.note2.Service.BookService;
import com.glushkoproduction.note2.dto.ModelListBook;
import com.glushkoproduction.note2.entity.Book;
import com.glushkoproduction.note2.repository.BookRepository;
import com.glushkoproduction.note2.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public void setNoteRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<ModelListBook> findAll() {
        List<Book> bookList = bookRepository.findAll();
        return createModelListBook(bookList);
    }

    @Override
    public void saveAll(List<Book> bookList) {
        bookRepository.saveAll(bookList);
    }

    @Override
    public Book getById(long id) {
        return bookRepository.getById(id);
    }


    List<ModelListBook> createModelListBook(List<Book> list){
        List<ModelListBook> modelListBooks = new ArrayList<>();
        for (Book book : list) {
            ModelListBook modelBook = new ModelListBook();
            modelBook.setId(String.valueOf(book.getId()));
            modelBook.setCreateDate(DateUtil.localDateTimeToStringDate(book.getCreateDateTime()));
            modelBook.setCreateTime(DateUtil.localDateTimeToStringTime(book.getCreateDateTime()));
            modelBook.setLastSaveDate(DateUtil.localDateTimeToStringDate(book.getLastSaveDateTime()));
            modelBook.setLastSaveTime(DateUtil.localDateTimeToStringTime(book.getLastSaveDateTime()));
            modelBook.setName(book.getName());
            modelBook.setYear(String.valueOf(book.getYear()));
            modelListBooks.add(modelBook);
        }
        return modelListBooks;
    }

}
