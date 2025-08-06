package com.example.CRUD.JPA.repository;

import com.example.CRUD.JPA.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

}
