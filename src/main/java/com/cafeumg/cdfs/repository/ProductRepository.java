package com.cafeumg.cdfs.repository;


import com.cafeumg.cdfs.entities.Product;
import com.cafeumg.cdfs.entities.Category;
import com.cafeumg.cdfs.entities.Typ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(Category category);
    List<Product> findByType(Typ type);
}