package com.cafeumg.cdfs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "presentation")
public class Presentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_presentation;

    private String presentation_name;

    public Presentation() {}

    public Presentation(Integer id_presentation, String presentation_name) {
        this.id_presentation = id_presentation;
        this.presentation_name = presentation_name;
    }

    public Integer getId_presentation() {
        return id_presentation;
    }

    public void setId_presentation(Integer id_presentation) {
        this.id_presentation = id_presentation;
    }

    public String getPresentation_name() {
        return presentation_name;
    }

    public void setPresentation_name(String presentation_name) {
        this.presentation_name = presentation_name;
    }
}