package com.luv2code.samplePractice.challenges;

import com.luv2code.samplePractice.lists.Employee;
import com.luv2code.samplePractice.lists.EmployeeDoubleLinkList;
//add a employee object before a give object in link list.
public class DoubleLinkListChallenge {

    public static void main(String ar[])
    {
        Employee Abhi = new Employee("Abhi", "Sharma", 12);
        Employee Ram = new Employee("Ram", "Naam", 112);
        Employee Ajay = new Employee("Ajay", "Vajay", 1);
        Employee Cool = new Employee("Cool", "Singh", 1112);

        EmployeeDoubleLinkList employeeDoubleLinkList =new EmployeeDoubleLinkList();
        employeeDoubleLinkList.addToFront(Cool);
        employeeDoubleLinkList.addToFront(Ajay);
        employeeDoubleLinkList.addToFront(Ram);
        employeeDoubleLinkList.addBefore(Abhi,Ajay);

        employeeDoubleLinkList.printList();
        System.out.println(employeeDoubleLinkList.getSize());
    }
}
