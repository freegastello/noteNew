package com.glushkoproduction.note.Service;

import com.glushkoproduction.note.dto.ModelListNote;
import com.glushkoproduction.note.model.Note;

import java.util.List;

public interface NoteService {
    List<ModelListNote> myAll();
    List<Note> myFindById(long id);
    void myAdd(Note note);
}
