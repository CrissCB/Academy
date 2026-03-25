package com.epw.academy.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epw.academy.dto.CourseResponse;
import com.epw.academy.dto.CreateCourseRequest;
import com.epw.academy.entity.Course;
import com.epw.academy.repository.CourseRepository;
import com.epw.academy.service.CourseService;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository){
        this.repository = repository;
    }

    @Override
    public CourseResponse create(CreateCourseRequest request) {
        Course c = new Course();
        c.setName(request.getName());
        c.setDescription(request.getDescription());
        c.setDurationHours(request.getDurationHours());
        c.setStartDate(request.getStartDate());
        c.setEndDate(request.getEndDate());

        Course save = repository.save(c);
        return toResponse(save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CourseResponse> list() {
        return repository.findAll().stream().map(this::toResponse).toList();
    }

    private CourseResponse toResponse(Course c){
        CourseResponse r = new CourseResponse();

        r.setId(c.getId());
        r.setName(c.getName());
        r.setDescription(c.getDescription());
        r.setDurationHours(c.getDurationHours());
        r.setStartDate(c.getStartDate());
        r.setEndDate(c.getEndDate());
        r.setCreatedAt(c.getCreatedAt());

        return r;
    }
    
}
