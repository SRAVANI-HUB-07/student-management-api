package com.sravani.studentapi.mapper;
import com.sravani.studentapi.dto.StudentRequestDTO;
import com.sravani.studentapi.dto.StudentResponseDTO;
import com.sravani.studentapi.model.Student;
import java.util.List;
import java.util.ArrayList;

public class StudentMapper {
    public static StudentResponseDTO toDTO(Student student)
    {
        return new StudentResponseDTO(student.getId(), student.getName());
    }

    public static List<StudentResponseDTO> toDTOList(List<Student> students)
    {
        List<StudentResponseDTO> dtoList=new ArrayList<>();
        for(Student student:students)
        {
            dtoList.add(toDTO(student));
        }
        return dtoList;
    }

    public static Student toEntity(StudentRequestDTO dto)
    {
        Student student=new Student();
        student.setName(dto.getName());
        return student;
    }
}
