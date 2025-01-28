package com.forrestgump.courseapi;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Optional<Course> findById(Long id) {
        return courseRepository.findById(id);
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

    public Course update(Long id, Course updatedCourse) {
        return courseRepository.findById(id)
                .map(course -> {
                    course.setTitle(updatedCourse.getTitle());
                    course.setDescription(updatedCourse.getDescription());
                    course.setWorkload(updatedCourse.getWorkload());
                    course.setPrice(updatedCourse.getPrice());
                    course.setInstructor(updatedCourse.getInstructor());
                    course.setPublished(updatedCourse.isPublished());
                    course.setCategory(updatedCourse.getCategory());
                    course.setImageUrl(updatedCourse.getImageUrl());
                    return courseRepository.save(course);
                }).orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
}
