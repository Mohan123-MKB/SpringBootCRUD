package com.example.CRUD.JPA.controller;

import com.example.CRUD.JPA.model.Teacher;
import com.example.CRUD.JPA.service.TeacherService; // Ensure this import is correct
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public List<Teacher> availableTeacher() {
        return teacherService.teacherMethod();
    }

    @PostMapping("/teacherEnroll")
    public Teacher enrollTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    @PutMapping("/teacherUpdate")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateTeacher(teacher);
    }

}
