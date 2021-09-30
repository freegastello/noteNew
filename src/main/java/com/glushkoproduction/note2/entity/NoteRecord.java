package com.glushkoproduction.note2.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "note")
public class NoteRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "CREATE_DATE_TIME")
    private LocalDateTime createDateTime;
    @Column(name = "LAST_SAVE_DATE_TIME")
    private LocalDateTime lastSaveDateTime;
    @Column(name = "HEADING")
    private String heading;
    @Column(name = "RECORDING")
    private String recording;

    public NoteRecord() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getLastSaveDateTime() {
        return lastSaveDateTime;
    }

    public void setLastSaveDateTime(LocalDateTime lastSaveDateTime) {
        this.lastSaveDateTime = lastSaveDateTime;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", createDateTime=" + createDateTime +
                ", lastSaveDateTime=" + lastSaveDateTime +
                ", heading='" + heading + '\'' +
                ", recording='" + recording + '\'' +
                '}';
    }
}
