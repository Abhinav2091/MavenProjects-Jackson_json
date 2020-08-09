package com.luv2code.samplePractice.Stack;

import com.luv2code.samplePractice.lists.Employee;

public class JDKLinkListStackMainClass {

    public static void main(String ar[])
    {
        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);

        LinkedStack linkedStack =new LinkedStack();
        //will return null coz linked list method will return null in that case;
        System.out.println(linkedStack.peek());
        linkedStack.push(Abhinav);
        linkedStack.push(Abhi);
        linkedStack.push(Himanshu);
        linkedStack.push(Sid);
        linkedStack.printStack();
        System.out.println(linkedStack.size());
        System.out.println(linkedStack.peek());
        linkedStack.pop();
        linkedStack.printStack();
        System.out.println(linkedStack.size());

    }
}
