package com.stream;

import com.example.model.Employee;
import com.example.model.MockData;

import java.util.List;
import java.util.stream.IntStream;

public class StreamRangeChapter1 {
    public static void main(String[] args) {
        List<Employee> employeeList = MockData.getEmployeeObjectList();

        //iterateEmpList(employeeList);
        intIterateStream();
    }

    private static void iterateEmpList(List<Employee> employeeList) {
        IntStream.range(0,employeeList.size())
                .forEach(index ->{
                    System.out.println("Id :"+ employeeList.get(index).getEmpId()+", Name : "+employeeList.get(index).getEmpName());

                });
    }
    private static void intIterateStream() {
        IntStream.iterate(1,operand -> operand+1).limit(20).forEach(System.out::println);
    }
}
