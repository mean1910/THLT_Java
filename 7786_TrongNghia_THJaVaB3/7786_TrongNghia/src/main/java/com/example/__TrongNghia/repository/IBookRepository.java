package com.example.__TrongNghia.repository;

import com.example.__TrongNghia.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IBookRepository extends JpaRepository<Book, Long> {
}
