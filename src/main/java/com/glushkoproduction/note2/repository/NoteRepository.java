package com.glushkoproduction.note2.repository;

import com.glushkoproduction.note2.entity.Note;

import java.util.List;

public interface NoteRepository {
    List<Note> myAll();
    List<Note> myFindById(long id);
    void myAdd(Note note);
}
