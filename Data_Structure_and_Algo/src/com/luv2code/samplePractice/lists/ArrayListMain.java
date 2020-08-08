package com.luv2code.samplePractice.lists;

import com.luv2code.samplePractice.commanService.Utility;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String ar[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Abhinav", "Sharma", 1));
        employeeList.add(new Employee("Abhi", "Kumar", 13));
        employeeList.add(new Employee("Himanshu", "Tiwari", 1456));
        employeeList.add(new Employee("Sid", "Singh", 10000));

        employeeList.set(1, new Employee("Ajay", "Kumar", 123456789));

        //will  add the object in particular index and move next values
        employeeList.add(1, new Employee("Abhi", "Kumar", 13));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());
        Object[] employeeArray = employeeList.toArray();
        System.out.println(employeeArray.length);
        for (Object employee : employeeArray) {
            System.out.println(employee);
        }
//it will get false as it will compare instance not the content
        //hence to check to content we need to override equals method for employee
        System.out.println(employeeList.contains(new Employee("Ajay", "Kumar", 123456789)));
        System.out.println(employeeList.indexOf(new Employee("Ajay", "Kumar", 123456789)));
    }
}
