package com.luv2code.samplePractice.challenges;

import java.util.*;

public class ConvieInterviewQuestion {

    public static void main(String ar[]) {
        List<Integer> givenList = new ArrayList<>();
        givenList.add(4);
        givenList.add(2);
        givenList.add(1);
        givenList.add(3);

        // boolean result = isAsending(givenList);
        //System.out.println(result);
        /*List<Integer> result = createFizzBuzz(10);
        for (Integer value : result) {
            System.out.println(value);
        }*/

        List<Integer> result=removeAll(givenList,3);
        for(Integer value:result)
        {
            System.out.println(value);
        }
    }


    public static boolean isAsending(List<Integer> finalList) {

        boolean flag = true;

        for (int i = 0; i < finalList.size(); i++) {
            for (int j = 0; j < finalList.size(); j++) {
                Integer firstElement = finalList.get(i);
                Integer numberToCompare = finalList.get(j);
                if (i != j) {
                    if (firstElement > numberToCompare) {
                        flag = false;
                        return flag;
                    }
                }

            }
            break;

        }
        return flag;

    }


    public static List<Integer> createFizzBuzz(Integer highestNumber) {


        List<Integer> givenList = new ArrayList<>();
        for (int i = 0; i <= highestNumber; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                givenList.add(0);
            } else if (i % 2 == 0) {
                givenList.add(-i);
            } else if (i % 3 != 0) {
                givenList.add(i);
            }


        }
//to remove Zero from my list
        givenList.remove(0);
        return givenList;

    }


    public static List<Integer> removeAll(List<Integer> finalList,Integer numberToRemoved)
    {
        for(int i=0;i<finalList.size();i++)
        {
            if(finalList.get(i)== numberToRemoved)
            {
                finalList.remove(i);
                i--;
            }

        }
        return finalList;

    }

}
