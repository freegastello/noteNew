package com.glushkoproduction.note2.config;

import com.glushkoproduction.note2.Service.BookService;
import com.glushkoproduction.note2.Service.NoteService;
import com.glushkoproduction.note2.entity.Book;
import com.glushkoproduction.note2.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.glushkoproduction.note2.utils.MagicNumber.*;

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
            note.setHeading("Заголовок_" + i);
            note.setCreateDateTime(createLocal.plusSeconds(i));
            note.setLastSaveDateTime(createLocal.plusHours(num_7 + i));
            note.setRecording("Много текста_0" + i);
            noteService.myAdd(note);
        }
    }

    public void generateEntityBook() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < num_4; i++) {
            LocalDateTime createLocal = LocalDateTime.now().minusDays(1);
            Book book = new Book();
            book.setName("Имя_Book_" + i);
            book.setCreateDateTime(createLocal.plusSeconds(i));
            book.setLastSaveDateTime(createLocal.plusHours(num_7 + i));
            book.setYear(num_2000 + i);
            bookList.add(book);
        }
        bookService.saveAll(bookList);
    }

}
