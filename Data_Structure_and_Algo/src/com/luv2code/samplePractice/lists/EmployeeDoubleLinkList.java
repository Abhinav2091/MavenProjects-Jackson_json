package com.luv2code.samplePractice.lists;

public class EmployeeDoubleLinkList {

    private EmployeeDoubleLinkListNode head;
    private EmployeeDoubleLinkListNode tail;
    private int size;

    //Challenge to Add object before the existing employee
    public boolean addBefore(Employee newEmployee,Employee existingEmployee)
    {
        //check if list is empty or not
        if(existingEmployee == null)
            return false;

        //find the existing employee
        EmployeeDoubleLinkListNode current=head;
        while(current!=null && !current.getEmployee().equals(existingEmployee))
        {
            //if user exist it will be out of the loop and we get the element else it will go to the end of loop return null
        current=current.getNextNode();
        }
        if(current==null)
            return false;
        EmployeeDoubleLinkListNode newNode = new EmployeeDoubleLinkListNode(newEmployee);
        newNode.setPreviousNode(current.getPreviousNode());
        newNode.setNextNode(current);
        current.setPreviousNode(newNode);
        //it can be first field i.e head
        if(head==current)
            head=newNode;
        else
            newNode.getPreviousNode().setNextNode(newNode);
        size++;
        return true;


    }

    public void addToFront(Employee employee) {
        EmployeeDoubleLinkListNode employeeDoubleLinkListNode = new EmployeeDoubleLinkListNode(employee);

        if (head == null) {
            tail = employeeDoubleLinkListNode;
        } else {
            head.setPreviousNode(employeeDoubleLinkListNode);
            //inserting node in front of the list
            employeeDoubleLinkListNode.setNextNode(head);
        }
        //and after inserting point to the next field
        head = employeeDoubleLinkListNode;
        size++;
    }

    public void addToTail(Employee employee) {
        EmployeeDoubleLinkListNode employeeDoubleLinkListNode = new EmployeeDoubleLinkListNode(employee);

        if (tail == null)
            head = employeeDoubleLinkListNode;
        else {
            tail.setNextNode(employeeDoubleLinkListNode);
            employeeDoubleLinkListNode.setPreviousNode(tail);
        }
        tail = employeeDoubleLinkListNode;
        size++;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeDoubleLinkListNode removeFromFront() {
        if (isEmpty())
            return null;

        //else set remove node to so it will return the node we are removing;
        EmployeeDoubleLinkListNode removeNode = head;
        if (head.getNextNode() == null) {
            tail = null;
        } else {
            head.getNextNode().setPreviousNode(null);
        }
        //set head to next node it is pointing
        head = head.getNextNode();
        //decrement the size as we removed one node
        size--;
        removeNode.setNextNode(null);
        return removeNode;

    }

    public EmployeeDoubleLinkListNode removeFromEnd() {
        if (isEmpty())
            return null;

        //else set remove node to so it will return the node we are removing;
        EmployeeDoubleLinkListNode removeNode = tail;
        if (tail.getPreviousNode() == null) {
            head=null;
        } else {
            tail.getPreviousNode().setNextNode(null);
        }
        //set head to next node it is pointing
        tail = tail.getPreviousNode();
        //decrement the size as we removed one node
        size--;
        removeNode.setPreviousNode(null);
        return removeNode;

    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeDoubleLinkListNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNextNode();
        }

        System.out.print(" null ");
    }
}
