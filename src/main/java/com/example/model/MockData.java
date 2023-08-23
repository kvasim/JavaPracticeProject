package com.example.model;

import lombok.Builder;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class MockData {

    public static List<Employee> getEmployeeObjectList() {
        return Arrays.asList(getEmployee(1,2000,"HR","Male"),
                getEmployee(2,3000,"IT","FeMale"));

    }

    private static Employee getEmployee(int id, double salary, String dept, String gender) {
        return Employee.builder()
                .departmentName(dept)
                .empId(id)
                .empName("DummyName"+id)
                .salary(salary)
                .gender(gender)
                .build();
    }
}
