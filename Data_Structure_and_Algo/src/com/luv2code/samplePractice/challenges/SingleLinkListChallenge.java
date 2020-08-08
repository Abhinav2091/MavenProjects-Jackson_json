package com.luv2code.samplePractice.challenges;


import com.luv2code.samplePractice.lists.IntegerSingleLinkList;

//add a single Integer link list in sorted order
public class SingleLinkListChallenge {
    public static void main(String ar[])
    {


        System.out.println("Test");
        IntegerSingleLinkList employeeSingleLinkList = new IntegerSingleLinkList();
        employeeSingleLinkList.addInSortedForm(3);
        employeeSingleLinkList.addInSortedForm(1);
        employeeSingleLinkList.addInSortedForm(17);
        employeeSingleLinkList.addInSortedForm(30);
        employeeSingleLinkList.addInSortedForm(-1);
        employeeSingleLinkList.addInSortedForm(3);

        employeeSingleLinkList.printList();
        System.out.println(employeeSingleLinkList.getSize());

    }
}
