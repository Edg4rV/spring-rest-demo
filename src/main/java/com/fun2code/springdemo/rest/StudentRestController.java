package com.fun2code.springdemo.rest;

import com.fun2code.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Poornima","Patel"));
        studentList.add(new Student("Mario","Rossi"));
        studentList.add(new Student("Mary ","Smith"));


        return  studentList;
    }

}
