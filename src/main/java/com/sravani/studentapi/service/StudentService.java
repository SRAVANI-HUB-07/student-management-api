package com.sravani.studentapi.service;

import com.sravani.studentapi.model.Student;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sravani.studentapi.repository.StudentRepository;
import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id)
    {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student)
    {
        if(student.getName()==null||student.getName().isBlank())
        {
            throw new RuntimeException("Name cannot be empty");
        }
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent){
        Student existingStudent=studentRepository.findById(id).orElse(null);
        if(existingStudent==null)
            return null;
        existingStudent.setName(updatedStudent.getName());

        return studentRepository.save(existingStudent);
    }

    public boolean deleteStudent(long id)
    {
        if(!studentRepository.existsById(id))
            return false;
        studentRepository.deleteById(id);
        return true;
    }

    public List<Student> getStudentsByName(String name)
    {
        return studentRepository.findByName(name);
    }

    public List<Student> searchStudentsByName(String name)
    {
        return studentRepository.searchByNameUsingQuery(name);
    }
}
