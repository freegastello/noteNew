package com.glushkoproduction.note2.repository;

import com.glushkoproduction.note2.entity.BookRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookRecord, Long> {
}
