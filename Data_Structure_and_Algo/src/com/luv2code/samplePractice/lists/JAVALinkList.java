package com.luv2code.samplePractice.lists;

import java.util.LinkedList;

public class JAVALinkList {
    public static void main(String ar[]) {

        Employee Abhi = new Employee("Abhi", "Sharma", 12);
        Employee Ram = new Employee("Ram", "Naam", 112);
        Employee Ajay = new Employee("Ajay", "Vajay", 1);
        Employee Cool = new Employee("Cool", "Singh", 1112);

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(Cool);
        linkedList.addFirst(Ajay);
        linkedList.addFirst(Ram);
        linkedList.addLast(Abhi); //or you can use add simple it will add at the end.
        linkedList.removeFirst();
        linkedList.removeLast();

        for(Employee employee:linkedList)
        {
            System.out.println(employee);
        }
    }
}
