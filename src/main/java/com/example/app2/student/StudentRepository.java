package com.example.app2.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    //SELECT * FROM Student where email
    Optional<Student> findStudentByEmail(String email);

}

