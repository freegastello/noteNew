package com.glushkoproduction.note.service.impl;

import com.glushkoproduction.note.service.NoteService;
import com.glushkoproduction.note.dto.ModelListNote;
import com.glushkoproduction.note.model.Note;
import com.glushkoproduction.note.model.entity.NoteRecord;
import com.glushkoproduction.note.repository.NoteRepository;
import com.glushkoproduction.note.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<ModelListNote> myAll() {
        List<NoteRecord> nrList = noteRepository.myAll();
        return createModelListNote(nrList);
    }

    @Override
    public List<Note> myFindById(long id) {
        List<NoteRecord> nrList = noteRepository.myFindById(id);
        return noteRecordsToNotes(nrList);
    }

    @Override
    public void myAdd(Note note) {
        NoteRecord nr = noteToNoteRecord(note);
        noteRepository.myAdd(nr);
    }

    List<ModelListNote> createModelListNote(List<NoteRecord> list){
        List<ModelListNote> modelListNotes = new ArrayList<>();
        for (NoteRecord n : list) {
            ModelListNote modelListNote = new ModelListNote();
            modelListNote.setId(String.valueOf(n.getId()));
            modelListNote.setCreateDate(DateUtil.localDateTimeToStringDate(n.getCreateDateTime()));
            modelListNote.setCreateTime(DateUtil.localDateTimeToStringTime(n.getCreateDateTime()));
            modelListNote.setLastSaveDate(DateUtil.localDateTimeToStringDate(n.getLastSaveDateTime()));
            modelListNote.setLastSaveTime(DateUtil.localDateTimeToStringTime(n.getLastSaveDateTime()));
            modelListNote.setHeading(n.getHeading());
            modelListNote.setRecording(n.getRecording());
            modelListNote.setDeleted(n.getDeleted());
            modelListNotes.add(modelListNote);
        }
        return modelListNotes;
    }

    private Note noteRecordToNote(NoteRecord noteRecord) {
        Note note = new Note();
        note.setCreateDateTime(noteRecord.getCreateDateTime());
        note.setLastSaveDateTime(noteRecord.getLastSaveDateTime());
        note.setHeading(noteRecord.getHeading());
        note.setRecording(noteRecord.getRecording());
        note.setDeleted(noteRecord.getDeleted());
        return note;
    }

    private List<Note> noteRecordsToNotes(List<NoteRecord> noteRecordList) {
        List<Note> noteList = new ArrayList<>();
        for (NoteRecord nr : noteRecordList) {
            Note note = new Note();
            note.setId(nr.getId());
            note.setCreateDateTime(nr.getCreateDateTime());
            note.setLastSaveDateTime(nr.getLastSaveDateTime());
            note.setHeading(nr.getHeading());
            note.setRecording(nr.getRecording());
            note.setDeleted(nr.getDeleted());
            noteList.add(note);
        }
        return noteList;
    }

    private NoteRecord noteToNoteRecord(Note note) {
        NoteRecord nr = new NoteRecord();
        nr.setCreateDateTime(note.getCreateDateTime());
        nr.setLastSaveDateTime(note.getLastSaveDateTime());
        nr.setHeading(note.getHeading());
        nr.setRecording(note.getRecording());
        nr.setDeleted(note.getDeleted());
        return nr;
    }

    private List<NoteRecord> notesToNoteRecords(List<Note> noteList) {
        List<NoteRecord> nrList = new ArrayList<>();
        for (Note n : noteList) {
            NoteRecord nr = new NoteRecord();
            nr.setCreateDateTime(n.getCreateDateTime());
            nr.setLastSaveDateTime(n.getLastSaveDateTime());
            nr.setHeading(n.getHeading());
            nr.setRecording(n.getRecording());
            nr.setDeleted(n.getDeleted());
            nrList.add(nr);
        }
        return nrList;
    }
}
