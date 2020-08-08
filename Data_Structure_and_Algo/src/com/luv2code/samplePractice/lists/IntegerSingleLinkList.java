package com.luv2code.samplePractice.lists;

public class IntegerSingleLinkList {

    private IntegerSingleLinkListNode head;
    private int size =0;

    public IntegerSingleLinkListNode getHead() {
        return head;
    }

    public void setHead(IntegerSingleLinkListNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }
    public void addToFront(int value) {
        IntegerSingleLinkListNode node = new IntegerSingleLinkListNode(value);
        //inserting node in front of the list
        node.setIntegerSingleLinkListNode(head);
        //and after inserting point to the next field
        head = node;
        size++;
    }

    public void addInSortedForm(int value)
    {
        //if there is no value or first number is greater than the value
        if(head ==null || head.getValue()>=value) {
            addToFront(value);
            return;
        }

        //find the insertion Point
        //getIntegerSingleLinkListNode = next node
        IntegerSingleLinkListNode current= head.getIntegerSingleLinkListNode();
        IntegerSingleLinkListNode previous= head;
        while(current!=null && current.getValue()<value)
        {
            previous=current;
            current=current.getIntegerSingleLinkListNode();
        }
        IntegerSingleLinkListNode newNode =new IntegerSingleLinkListNode(value);
        newNode.setIntegerSingleLinkListNode(current);
        previous.setIntegerSingleLinkListNode(newNode);
        size++;

    }

    public void printList() {
        IntegerSingleLinkListNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.toString());
            System.out.print(" -> ");
            current = current.getIntegerSingleLinkListNode();
        }

        System.out.print(" null ");
    }
}
