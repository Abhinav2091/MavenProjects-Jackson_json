package com.luv2code.samplePractice.lists;

public class EmployeeSingleLinkListNode {
    private Employee employee;
    private EmployeeSingleLinkListNode employeeSingleLinkListNode;

    public EmployeeSingleLinkListNode(Employee employee) {
        this.employee = employee;

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeSingleLinkListNode getEmployeeSingleLinkListNode() {
        return employeeSingleLinkListNode;
    }

    public void setEmployeeSingleLinkListNode(EmployeeSingleLinkListNode employeeNextNode) {
        this.employeeSingleLinkListNode = employeeNextNode;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
