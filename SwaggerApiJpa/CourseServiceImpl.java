package com.example.Course.Course.Service;

import com.example.Course.Course.Repo.CourseRepository;
import com.example.Course.Course.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CouresService{
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public String upsert(Course course) {
        courseRepository.save(course);
        return "Success";
    }

    @Override
    public Course getBYId(Integer cid) {
        Optional<Course> findById = courseRepository.findById(cid);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourse() {

        return courseRepository.findAll();
    }

    @Override
    public String deleteById(Integer cid) {
        if(courseRepository.existsById(cid)){
            courseRepository.deleteById(cid);
            return "Delete Succuess";
        }else{
            return "no record found";
        }

    }
}
