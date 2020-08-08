package com.luv2code.samplePractice.lists;

public class LinkList {
    public static void main(String ar[]) {
        //SingleLinkList();
        DoubleLinkList();
    }

    public static void SingleLinkList() {


        Employee Abhi = new Employee("Abhi", "Sharma", 12);
        Employee Ram = new Employee("Ram", "Naam", 112);
        Employee Ajay = new Employee("Ajay", "Vajay", 1);
        Employee Cool = new Employee("Cool", "Singh", 1112);

        EmployeeSingleLinkList employeeSingleLinkList = new EmployeeSingleLinkList();
        //if head is null link list is empty
        System.out.println(employeeSingleLinkList.isEmpty());
        //adding in reverse order so i get my last element added in the front of node
        employeeSingleLinkList.addToFront(Cool);
        employeeSingleLinkList.addToFront(Ajay);
        employeeSingleLinkList.addToFront(Ram);
        employeeSingleLinkList.addToFront(Abhi);
        System.out.println("Removed Node->"+ employeeSingleLinkList.removeFromFront());
        employeeSingleLinkList.printList();
        System.out.print("\n");
        System.out.println("Size-->"+ employeeSingleLinkList.getSize());
        System.out.println(employeeSingleLinkList.isEmpty());

    }

    public static void DoubleLinkList()
    {
        Employee Abhi = new Employee("Abhi", "Sharma", 12);
        Employee Ram = new Employee("Ram", "Naam", 112);
        Employee Ajay = new Employee("Ajay", "Vajay", 1);
        Employee Cool = new Employee("Cool", "Singh", 1112);

        EmployeeDoubleLinkList employeeDoubleLinkList =new EmployeeDoubleLinkList();

        employeeDoubleLinkList.addToFront(Cool);
        employeeDoubleLinkList.addToFront(Ajay);
        employeeDoubleLinkList.addToFront(Ram);
        employeeDoubleLinkList.addToTail(Abhi);
        employeeDoubleLinkList.removeFromFront();
        employeeDoubleLinkList.removeFromEnd();


        employeeDoubleLinkList.printList();
        System.out.println(employeeDoubleLinkList.getSize());
    }
}
