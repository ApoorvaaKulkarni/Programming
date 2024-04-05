//package com.example.student.studentTaskjpa.Service;
//
//import com.example.student.studentTaskjpa.entity.Student;
//
//import java.util.ArrayList;
//
//public interface studentService {
//    ArrayList<Student> findAllStudent();
//    Student findAllStudentById(long id);
//    void addstudent();
//    void deleteAllData();
//}
package com.example.student.studentTaskjpa.Service;

import com.example.student.studentTaskjpa.entity.Student;

import java.util.ArrayList;

public interface studentService {
    ArrayList<Student> findAllStudent();
    Student findAllStudentById(long id);
    void addstudent();
    void deleteAllData();
}
