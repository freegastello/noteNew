package com.glushkoproduction.note2.Service.impl;

import com.glushkoproduction.note2.Service.NoteService;
import com.glushkoproduction.note2.dto.ModelListNote;
import com.glushkoproduction.note2.entity.Note;
import com.glushkoproduction.note2.repository.NoteRepository;
import com.glushkoproduction.note2.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private NoteRepository noteRepository;

    @Autowired
    public void setNoteRepository(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<ModelListNote> myAll() {
        List<Note> noteList = noteRepository.myAll();
        return createModelListNote(noteList);
    }

    @Override
    public List<Note> myFindById(long id) {
        return noteRepository.myFindById(id);
    }

    @Override
    public void myAdd(Note note) {
        noteRepository.myAdd(note);
    }

    List<ModelListNote> createModelListNote(List<Note> list){
        List<ModelListNote> modelListNotes = new ArrayList<>();
        for (Note note : list) {
            ModelListNote modelListNote = new ModelListNote();
            modelListNote.setId(String.valueOf(note.getId()));
            modelListNote.setCreateDate(DateUtil.localDateTimeToStringDate(note.getCreateDateTime()));
            modelListNote.setCreateTime(DateUtil.localDateTimeToStringTime(note.getCreateDateTime()));
            modelListNote.setLastSaveDate(DateUtil.localDateTimeToStringDate(note.getLastSaveDateTime()));
            modelListNote.setLastSaveTime(DateUtil.localDateTimeToStringTime(note.getLastSaveDateTime()));
            modelListNote.setHeading(note.getHeading());
            modelListNote.setRecording(note.getRecording());
            modelListNotes.add(modelListNote);
        }
        return modelListNotes;
    }

}
