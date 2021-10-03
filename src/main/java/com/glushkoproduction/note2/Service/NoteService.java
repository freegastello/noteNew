package com.glushkoproduction.note2.Service;

import com.glushkoproduction.note2.dto.ModelListNote;
import com.glushkoproduction.note2.model.Note;

import java.util.List;

public interface NoteService {
    List<ModelListNote> myAll();
    List<Note> myFindById(long id);
    void myAdd(Note note);
}
