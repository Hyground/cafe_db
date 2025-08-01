package com.cafeumg.cdfs.repository;

import com.cafeumg.cdfs.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByCategory_name(String category_name);
}