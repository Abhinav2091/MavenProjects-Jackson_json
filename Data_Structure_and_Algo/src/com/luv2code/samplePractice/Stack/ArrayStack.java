package com.luv2code.samplePractice.Stack;

import com.luv2code.samplePractice.lists.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {//capacity is max no of item in stack
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {//if stack is full we need to resize the array
        if (top == stack.length) {
            //need to resize the backing array
            //double the size of array.
            Employee[] newArray = new Employee[2 * stack.length];
            //copy the previous array to new array
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            //assign the new array to stack filed
            stack = newArray;
        }
        //now assign the employee to the top of stack
        stack[top++] = employee;
    }

public Employee pop()
{
    if(isEmpty())
    {//if it is empty throw the exception
        throw new EmptyStackException();
    }
    //top contain the index of next element because it is started with 0
    Employee employee =stack[--top];
    stack[top] =null;
    return employee;
}

    public Employee peek()
    {
        if(isEmpty())
        {//if it is empty throw the exception
            throw new EmptyStackException();
        }
      //we don't want to change value of top so we won't use --top here;
        return stack[top-1];
    }
public boolean isEmpty()
{
    return top==0;
}

public int size()
{
    return top;
}

public void printStack()
{
    for(int i=top-1;i>=0;i--)
    {
        System.out.println(stack[i]);
    }
}
}
