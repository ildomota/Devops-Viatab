package com.viatab.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String department;
    private String title;
    private String caption;

    public Story() {
    }

    public Story(String department, String title, String caption) {
        this.department = department;
        this.title = title;
        this.caption = caption;
    }

    public Long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public String getCaption() {
        return caption;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}