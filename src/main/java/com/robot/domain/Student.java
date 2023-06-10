package com.robot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private String specialty;

    @Override
    public String toString() {
        return "Student {" + name + ", age = " + age + ", specialty = '" + specialty + "'}/n";
    }
}
