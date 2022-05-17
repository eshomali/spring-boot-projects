package com.example.app.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service //or @Component is equivalent
public class StudentService {

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
