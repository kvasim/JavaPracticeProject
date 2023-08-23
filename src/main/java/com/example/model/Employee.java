package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int empId;
    private String empName;
    private String gender;
    private String departmentName;
    private double salary;
    private Instant dob;
}
