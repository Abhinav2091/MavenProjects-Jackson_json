package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

//get the index of largest number and swap it at the end of the loop to the end location
public class SelectionSort {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            int largestIndex = 0;
            for (int i = 0; i <= lastIndex; i++) {
                if (array[i] > array[largestIndex])
                    largestIndex = i;
            }
            Utility.swap(array, lastIndex, largestIndex);

        }
        Utility.show(array);

    }

}
