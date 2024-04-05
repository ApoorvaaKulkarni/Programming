package com.example.student.studentTaskjpa.controller;

import com.example.student.studentTaskjpa.Service.StudentServiceimpl;
import com.example.student.studentTaskjpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class studentController {
    @Autowired
    StudentServiceimpl studentimplservice;

    @PostMapping("/")
    public void add(){
        studentimplservice.addstudent();

    }
    @GetMapping("/findAll")
    public ArrayList<Student> getAllStudent(){
        return studentimplservice.findAllStudent();
    }
    @DeleteMapping("/delete")
    public void delete(){
        studentimplservice.deleteAllData();
    }



}
