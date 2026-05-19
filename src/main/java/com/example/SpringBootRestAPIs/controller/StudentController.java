package com.example.SpringBootRestAPIs.controller;

import com.example.SpringBootRestAPIs.dto.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public StudentDTO getStudents() {
        return new StudentDTO(1L, "Farhad Dubey", "farhaddubey003@gmail.com");
    }

    @GetMapping("/students/{id}")
    public StudentDTO getStudentById() {
        return new StudentDTO(1L, "Farhad Dubey", "farhaddubey003@gmail.com");
    }
}
