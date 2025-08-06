package com.example.CRUD.JPA.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    public Teacher(String name, String email_id, String fav_course) {
        this.name = name;
        this.email_id = email_id;
        this.fav_course = fav_course;
    }

    public Teacher() {

    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private String name;
    private String email_id;
    private String fav_course;

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getFav_course() {
        return fav_course;
    }

    public void setFav_course(String fav_course) {
        this.fav_course = fav_course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
