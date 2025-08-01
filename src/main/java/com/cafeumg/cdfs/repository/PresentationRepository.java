package com.cafeumg.cdfs.repository;

import com.cafeumg.cdfs.entities.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository extends JpaRepository<Presentation, Integer> {
    Presentation findByPresentation_name(String presentation_name);
}