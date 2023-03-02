package com.smashley.backendproject.data;

import lombok.*;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Getter
@Setter

@Controller
public class Person {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dateJoined;
    private LocalDate dateUpdated;
}
