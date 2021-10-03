package com.glushkoproduction.note.repository;

import com.glushkoproduction.note.model.entity.NoteRecord;

import java.util.List;

public interface NoteRepository {
    List<NoteRecord> myAll();
    List<NoteRecord> myFindById(long id);
    void myAdd(NoteRecord note);
}
