package com.exam.scheduler.controller;
import com.exam.scheduler.model.Course;
import com.exam.scheduler.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://mcgillexamscheduler.vercel.app/")
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/name/{courseName}")
    public ResponseEntity<Course> getCourseByName(@PathVariable String courseName) {
        Course course = courseRepository.findByName(courseName);
        return course != null
                ? ResponseEntity.ok(course)
                : ResponseEntity.notFound().build();
    }
}
