package com.example.app2.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//*service layer carries the business logic*
@Service //or @Component
public class StudentService {
    private final StudentRepository studentRepository;
     @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
     //*for a static data*
//    public List<Student> getStudents()
//    {
//        return List.of(new Student(
//                1L,
//                "Poxxie",
//                "poxxie@gmail.com",
//                LocalDate.of(2011, Month.FEBRUARY,13),
//                12
//        ));
//
//
//    }

    //*for dynamic data gotten from db*
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }



}
