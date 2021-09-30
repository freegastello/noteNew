package com.glushkoproduction.note2.entity;

import java.time.LocalDateTime;

public class Note {
    private long id;
    private LocalDateTime createDateTime;
    private LocalDateTime lastSaveDateTime;
    private String heading;
    private String recording;

    public Note() {
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
