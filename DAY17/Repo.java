package com.example.student.studentTaskjpa.Repo;

import com.example.student.studentTaskjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface Repo extends JpaRepository<Student, Long> {

}
