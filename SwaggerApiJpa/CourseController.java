
package com.example.Course.Course.controller;

import com.example.Course.Course.Service.CouresService;
import com.example.Course.Course.course.Course;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Course Details", version = "1.0",description = "Api"))

public class CourseController {

    @Autowired
    public CouresService couresService;

    @PostMapping("/Course")
    @Operation(summary = "Create a new course")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully added the course"),
            @ApiResponse(responseCode = "404", description = "Course not added", content = @Content)
    })
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        String status = couresService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/Course/{cid}")
    @Operation(summary = "Get a course by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the course",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))}),
            @ApiResponse(responseCode = "404", description = "Course not found", content = @Content)})
    public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
        Course course = couresService.getBYId(cid);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping("/AllCourse")
    @Operation(summary = "Get all courses")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> allCourses = couresService.getAllCourse();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }

    @PutMapping("/Courses")
    @Operation(summary = "Update a course")
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        String status = couresService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @DeleteMapping("/Course/{cid}")
    @Operation(summary = "Delete a course by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleted the course",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))}),
            @ApiResponse(responseCode = "401", description = "Unauthorized user", content = @Content),
            @ApiResponse(responseCode = "404", description = "Course not found", content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid course id", content = @Content)})
    public ResponseEntity<String> deleteCourse(@PathVariable Integer cid) {
        String status = couresService.deleteById(cid);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
