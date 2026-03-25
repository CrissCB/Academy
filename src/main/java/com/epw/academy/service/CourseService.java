package com.epw.academy.service;

import java.util.List;

import com.epw.academy.dto.CourseResponse;
import com.epw.academy.dto.CreateCourseRequest;

public interface CourseService {
    CourseResponse create(CreateCourseRequest request);
    List<CourseResponse> list();
}
