package com.exam.scheduler.repository;

import com.exam.scheduler.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CourseRepository extends MongoRepository<Course, String> {
    Course findByName(String course);
}
