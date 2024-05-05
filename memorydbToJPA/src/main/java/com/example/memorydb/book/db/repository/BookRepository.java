package com.example.memorydb.book.db.repository;

import com.example.memorydb.book.db.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
