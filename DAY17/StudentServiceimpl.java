package com.example.student.studentTaskjpa.Service;

import com.example.student.studentTaskjpa.Repo.Repo;
import com.example.student.studentTaskjpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceimpl implements studentService{
    @Autowired
    Repo repository;

    @Override
    public ArrayList<Student> findAllStudent() {
        return (ArrayList<Student>) repository.findAll();
    }

    @Override
    public Student findAllStudentById(long id) {
        Optional<Student> opt = repository.findById(id);
        if(opt.isPresent())
            return opt.get();
        else
            return null;
    }

    @Override
    public void addstudent() {
        Student student = new Student("Apoorva", "k", "asda@gmail");
        repository.save(student);

    }

    @Override
    public void deleteAllData() {
        repository.deleteAll();

    }
}
