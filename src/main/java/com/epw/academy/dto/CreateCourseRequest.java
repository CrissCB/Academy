package com.epw.academy.dto;

import java.time.Instant;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCourseRequest {
 
    @NotBlank(message = "Name is required")
    @Size(max = 120, message = "Title must be <= 120 chars")
    private String name;

    @Size(max = 2000, message = "Description must be <= 2000 char")
    private String description;

    private int durationHours = 60;

    private LocalDate startDate;
    private Instant endDate;

}