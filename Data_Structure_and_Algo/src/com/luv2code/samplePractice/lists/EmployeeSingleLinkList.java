package com.luv2code.samplePractice.lists;

public class EmployeeSingleLinkList {

    private EmployeeSingleLinkListNode head;

    private int size = 0;

    public void addToFront(Employee employee) {
        EmployeeSingleLinkListNode node = new EmployeeSingleLinkListNode(employee);
        //inserting node in front of the list
        node.setEmployeeSingleLinkListNode(head);
        //and after inserting point to the next field
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeSingleLinkListNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getEmployeeSingleLinkListNode();
        }

        System.out.print(" null ");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeSingleLinkListNode removeFromFront() {//if node is null don't do any thing
        if (isEmpty())
            return null;

        //else set remove node to so it will return the node we are removing;
        EmployeeSingleLinkListNode removeNode = head;
        //set head to next node it is pointing
        head = head.getEmployeeSingleLinkListNode();
        //decrement the size as we removed one node
        size--;
        return removeNode;
    }


}
