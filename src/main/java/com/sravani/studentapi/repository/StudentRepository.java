package com.sravani.studentapi.repository;
import com.sravani.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student,Long>
{
    List<Student> findByName(String name);

    @Query("SELECT s FROM Student s WHERE s.name=:name")
    List<Student> searchByNameUsingQuery(@Param("name") String name);
}
