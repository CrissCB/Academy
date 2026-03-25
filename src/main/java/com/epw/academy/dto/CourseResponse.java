package com.epw.academy.dto;

import java.time.Instant;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponse {

    private Long id;
    private String name;
    private String description;
    private int durationHours;
    private LocalDate startDate;
    private Instant endDate;
    private Instant createdAt;

}
