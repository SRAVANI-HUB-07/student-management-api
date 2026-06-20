package com.sravani.studentapi.controller;

import com.sravani.studentapi.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sravani.studentapi.model.Student;
import com.sravani.studentapi.service.StudentService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import jakarta.validation.Valid;
import com.sravani.studentapi.dto.StudentResponseDTO;
import com.sravani.studentapi.mapper.StudentMapper;
import com.sravani.studentapi.dto.StudentRequestDTO;

@RestController
public class StudentController {



    final private StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentResponseDTO>> getStudents()
    {
        List<Student> students=studentService.getStudents();
        List<StudentResponseDTO> dtoList=StudentMapper.toDTOList(students);

        return ResponseEntity.ok(dtoList);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Long id)
    {
        Student student=studentService.getStudentById(id);
        if(student==null)
        {
            return ResponseEntity.notFound().build();
        }
        StudentResponseDTO dto = StudentMapper.toDTO(student);

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/students/name/{name}")
    public ResponseEntity<List<StudentResponseDTO>> getStudentsByName(@PathVariable String name)
    {
        List<Student> students=studentService.getStudentsByName(name);

        if(students.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        List<StudentResponseDTO> dtoList=StudentMapper.toDTOList(students);
        return ResponseEntity.ok(dtoList);
    }

    @GetMapping("/students/query/{name}")
    public ResponseEntity<List<StudentResponseDTO>> searchStudentsByName(@PathVariable String name)
    {
        List<Student> students=studentService.searchStudentsByName(name);
        if(students.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        List<StudentResponseDTO> dtoList=StudentMapper.toDTOList(students);
        return ResponseEntity.ok(dtoList);

    }


    @PostMapping("/students")
    public ResponseEntity<StudentResponseDTO> createStudent(@Valid @RequestBody StudentRequestDTO studentRequestDTO)
    {
        Student student=StudentMapper.toEntity(studentRequestDTO);
        Student createdStudent=studentService.createStudent(student);
        return ResponseEntity.ok(StudentMapper.toDTO(createdStudent));


    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @Valid @RequestBody Student updatedStudent)
    {
        Student student=studentService.updateStudent(id,updatedStudent);
        if(student==null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id)
    {
        boolean deleted=studentService.deleteStudent(id);
        if(!deleted)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
