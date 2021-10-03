package com.glushkoproduction.note2.model;

import java.time.LocalDateTime;

public class Book {
    private long id;
    private LocalDateTime createDateTime = LocalDateTime.now();
    private LocalDateTime lastSaveDateTime;
    private String name;
    private int year;
    private int deleted;

    public Book() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", createDateTime=" + createDateTime +
                ", lastSaveDateTime=" + lastSaveDateTime +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", deleted=" + deleted +
                '}';
    }
}
