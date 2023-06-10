package com.robot.service;

import com.robot.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentList() {
        return List.of(new Student("Jack", 19, "History"),
                        new Student("Bob", 21, "Physics"),
                        new Student("Anna", 20, "Literature"),
                        new Student("Mariya", 22, "Computer science")
        );
    }
}
