package com.glushkoproduction.note.service.impl;

import com.glushkoproduction.note.service.BookService;
import com.glushkoproduction.note.dto.ModelListBook;
import com.glushkoproduction.note.model.Book;
import com.glushkoproduction.note.model.entity.BookRecord;
import com.glushkoproduction.note.repository.BookRepository;
import com.glushkoproduction.note.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<ModelListBook> findAll() {
        List<BookRecord> bookRecordList = bookRepository.findAll();
        return createModelListBook(bookRecordList);
    }

    @Override
    public void saveAll(List<Book> bookList) {
        List<BookRecord> bookRecordList = booksToBookRecords(bookList);
        bookRepository.saveAll(bookRecordList);
    }

    @Override
    public Book getById(long id) {
        BookRecord bookRecord = bookRepository.getById(id);
        return bookRecordToBook(bookRecord);
    }

    private List<ModelListBook> createModelListBook(List<BookRecord> list){
        List<ModelListBook> modelListBooks = new ArrayList<>();
        for (BookRecord book : list) {
            ModelListBook modelBook = new ModelListBook();
            modelBook.setId(String.valueOf(book.getId()));
            modelBook.setCreateDate(DateUtil.localDateTimeToStringDate(book.getCreateDateTime()));
            modelBook.setCreateTime(DateUtil.localDateTimeToStringTime(book.getCreateDateTime()));
            modelBook.setLastSaveDate(DateUtil.localDateTimeToStringDate(book.getLastSaveDateTime()));
            modelBook.setLastSaveTime(DateUtil.localDateTimeToStringTime(book.getLastSaveDateTime()));
            modelBook.setName(book.getName());
            modelBook.setYear(String.valueOf(book.getYear()));
            modelBook.setDeleted(book.getDeleted());
            modelListBooks.add(modelBook);
        }
        return modelListBooks;
    }

    private Book bookRecordToBook(BookRecord bookRecord) {
            Book book = new Book();
            book.setId(bookRecord.getId());
            book.setCreateDateTime(bookRecord.getCreateDateTime());
            book.setLastSaveDateTime(bookRecord.getLastSaveDateTime());
            book.setName(bookRecord.getName());
            book.setYear(bookRecord.getYear());
            book.setDeleted(bookRecord.getDeleted());
        return book;
    }

    private List<Book> bookRecordsToBooks(List<BookRecord> bookRecordList) {
        List<Book> bookList = new ArrayList<>();
        for (BookRecord b : bookRecordList) {
            Book book = new Book();
            book.setId(b.getId());
            book.setCreateDateTime(b.getCreateDateTime());
            book.setLastSaveDateTime(b.getLastSaveDateTime());
            book.setName(b.getName());
            book.setYear(b.getYear());
            book.setDeleted(b.getDeleted());
            bookList.add(book);
        }
        return bookList;
    }

    private BookRecord bookToBookRecord(Book book) {
            BookRecord bookRecord = new BookRecord();
            bookRecord.setCreateDateTime(book.getCreateDateTime());
            bookRecord.setLastSaveDateTime(book.getLastSaveDateTime());
            bookRecord.setName(book.getName());
            bookRecord.setYear(book.getYear());
            bookRecord.setDeleted(book.getDeleted());
        return bookRecord;
    }

    private List<BookRecord> booksToBookRecords(List<Book> bookList) {
        List<BookRecord> bookRecordList = new ArrayList<>();
        for (Book b : bookList) {
            BookRecord bookRecord = new BookRecord();
            bookRecord.setCreateDateTime(b.getCreateDateTime());
            bookRecord.setLastSaveDateTime(b.getLastSaveDateTime());
            bookRecord.setName(b.getName());
            bookRecord.setYear(b.getYear());
            bookRecord.setDeleted(b.getDeleted());
            bookRecordList.add(bookRecord);
        }
        return bookRecordList;
    }

}
