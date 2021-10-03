package com.glushkoproduction.note2.model.entity;

import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Where(clause = "DELETED = 0")
@Table(name = "book")
public class BookRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "CREATE_DATE_TIME")
    private LocalDateTime createDateTime;
    @Column(name = "LAST_SAVE_DATE_TIME")
    private LocalDateTime lastSaveDateTime;
    @Column(name = "NAME")
    private String name;
    @Column(name = "YEAR")
    private int year;
    @Column(name = "DELETED")
    private int deleted;

    public BookRecord() {
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
                '}';
    }

}
