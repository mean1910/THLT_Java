package com.example.__TrongNghia.repository;

import com.example.__TrongNghia.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
