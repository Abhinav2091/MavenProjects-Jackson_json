package com.luv2code.samplePractice.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorMain {

    public static void main(String arp[])
    {
        Vector<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Abhinav", "Sharma", 1));
        employeeList.add(new Employee("Abhi", "Kumar", 13));
        employeeList.add(new Employee("Himanshu", "Tiwari", 1456));
        employeeList.add(new Employee("Sid", "Singh", 10000));

        employeeList.forEach(employee -> System.out.println(employee));

    }
}
