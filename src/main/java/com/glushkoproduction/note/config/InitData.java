package com.glushkoproduction.note.config;

import com.glushkoproduction.note.Service.BookService;
import com.glushkoproduction.note.Service.NoteService;
import com.glushkoproduction.note.model.Book;
import com.glushkoproduction.note.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.glushkoproduction.note.utils.MagicNumber.*;

@Component
public class InitData {
    @Autowired
    NoteService noteService;
    @Autowired
    BookService bookService;

    public void initData() {
        generateEntityNote();
        generateEntityBook();
    }

    public void generateEntityNote() {
        for (int i = 0; i < num_3; i++) {
            LocalDateTime createLocal = LocalDateTime.now().minusDays(num_1);
            Note note = new Note();
            note.setCreateDateTime(createLocal.plusSeconds(i));
            note.setLastSaveDateTime(createLocal.plusHours(num_7 + i));
            note.setHeading("Заголовок_" + i);
            note.setRecording("Много текста_0" + i);
            note.setDeleted(0);
            noteService.myAdd(note);
        }
    }

    public void generateEntityBook() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < num_4; i++) {
            LocalDateTime createLocal = LocalDateTime.now().minusDays(1);
            Book book = new Book();
            book.setCreateDateTime(createLocal.plusSeconds(i));
            book.setLastSaveDateTime(createLocal.plusHours(num_7 + i));
            book.setName("Имя_Book_" + i);
            book.setYear(num_2000 + i);
            book.setDeleted(0);
            bookList.add(book);
        }
        bookService.saveAll(bookList);
    }

}
