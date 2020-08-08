package com.luv2code.samplePractice.lists;

public class EmployeeDoubleLinkListNode {
    private Employee employee;
    private EmployeeDoubleLinkListNode nextNode;
    private EmployeeDoubleLinkListNode previousNode;


    public EmployeeDoubleLinkListNode() {
    }

    public EmployeeDoubleLinkListNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoubleLinkListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeDoubleLinkListNode nextNode) {
        this.nextNode = nextNode;
    }

    public EmployeeDoubleLinkListNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(EmployeeDoubleLinkListNode previousNode) {
        this.previousNode = previousNode;
    }
    @Override
    public String toString() {
        return employee.toString();
    }
}
