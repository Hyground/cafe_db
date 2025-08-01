package com.cafeumg.cdfs.repository;

import com.cafeumg.cdfs.entities.Typ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypRepository extends JpaRepository<Typ, Integer> {
    Typ findByType_name(String type_name);
}