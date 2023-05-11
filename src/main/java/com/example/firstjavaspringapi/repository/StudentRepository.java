package com.example.firstjavaspringapi.repository;

import com.example.firstjavaspringapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Essentially is an orm mapping to the Student entity with the primary key of type Long
    // e.g. Student.findAll() is now available
}
