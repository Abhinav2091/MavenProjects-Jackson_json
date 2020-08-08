package com.luv2code.samplePractice.challenges;

import com.luv2code.samplePractice.commanService.Utility;


public class InsertionSortUsingRecursion {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(array, array.length);
        Utility.show(array);
    }

    public static void insertionSort(int[] input, int numItem) {
        if (numItem < 2)
            return;

        insertionSort(input, numItem - 1);

        int newElement = input[numItem - 1];
        int i;
        for (i = numItem - 1; i > 0 && input[i - 1] > newElement; i--) {

            input[i] = input[i - 1];
        }
        input[i] = newElement;


    }
}
