package com.luv2code.samplePractice.Stack;

import com.luv2code.samplePractice.lists.Employee;

public class ArrayStackMainClass {
    public static void main(String ar[])
    {
        ArrayStack stack =new ArrayStack(10);
        //will throw error as no value is there in stack
        //stack.peek();
        stack.push(new Employee("Abhinav", "Sharma", 1));
        stack.push(new Employee("Abhi", "Kumar", 13));
        stack.push(new Employee("Himanshu", "Tiwari", 1456));
        stack.push(new Employee("Sid", "Singh", 10000));

        stack.printStack();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        stack.printStack();
        System.out.println(stack.size());

    }
}
