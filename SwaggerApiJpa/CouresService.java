package com.example.Course.Course.Service;

import com.example.Course.Course.course.Course;

import java.util.List;

public interface CouresService {
    public String upsert(Course course);

    public Course getBYId(Integer cid);

    public List<Course> getAllCourse();
    public  String deleteById(Integer cid);
}
