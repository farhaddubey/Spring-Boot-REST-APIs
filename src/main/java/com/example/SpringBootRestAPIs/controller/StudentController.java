package com.example.SpringBootRestAPIs.controller;

import com.example.SpringBootRestAPIs.dto.AddStudentRequestDto;
import com.example.SpringBootRestAPIs.dto.StudentDTO;
import com.example.SpringBootRestAPIs.entity.Student;
import com.example.SpringBootRestAPIs.repository.StudentRepository;
import com.example.SpringBootRestAPIs.service.StudentService;
import com.sun.net.httpserver.HttpsServer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
//@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentById(id));
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDTO> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.ok(studentService.updateStudent(id, addStudentRequestDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDTO> updatePartialStudent(@PathVariable Long id,
                                                           @RequestBody Map<String, Object> updates) {
        return ResponseEntity.ok(studentService.updatePartialStudent(id, updates));
    }


}
