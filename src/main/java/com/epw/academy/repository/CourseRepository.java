package com.epw.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epw.academy.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
