package com.example.CRUD.JPA.service;

import com.example.CRUD.JPA.model.Teacher;
import com.example.CRUD.JPA.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherData;

    public List<Teacher> teacherMethod() {
        return teacherData.findAll();
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherData.save(teacher);
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherData.save(teacher);
    }
}

