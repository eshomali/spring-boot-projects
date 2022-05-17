package com.example.app.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController    //allows this class to serve REST endpoints
@RequestMapping(path = "api/v1/student")    //create student api endpoint at localhost:8080/api/v1/student
public class StudentController {

    @GetMapping    //output from server
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Essa",
                        "eshomali@gmail.com",
                        LocalDate.of(1993, 01, 25),
                        29
                )
        );
    }
}
