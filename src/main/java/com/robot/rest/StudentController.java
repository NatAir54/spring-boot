package com.robot.rest;

import com.robot.domain.Student;
import com.robot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RequiredArgsConstructor
@RestController
public class StudentController {
    private final StudentService STUDENT_SERVICE;

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return STUDENT_SERVICE.getStudentList();
    }
}
