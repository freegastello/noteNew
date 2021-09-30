package com.glushkoproduction.note2.repository;

import com.glushkoproduction.note2.entity.NoteRecord;

import java.util.List;

public interface NoteRepository {
    List<NoteRecord> myAll();
    List<NoteRecord> myFindById(long id);
    void myAdd(NoteRecord note);
}
