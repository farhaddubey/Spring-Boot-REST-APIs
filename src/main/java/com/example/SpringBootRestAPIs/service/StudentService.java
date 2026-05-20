package com.example.SpringBootRestAPIs.service;

import com.example.SpringBootRestAPIs.dto.AddStudentRequestDto;
import com.example.SpringBootRestAPIs.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);

    StudentDTO createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDTO updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
}
