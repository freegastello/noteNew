package com.glushkoproduction.note.repository;

import com.glushkoproduction.note.model.entity.BookRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookRecord, Long> {
}
