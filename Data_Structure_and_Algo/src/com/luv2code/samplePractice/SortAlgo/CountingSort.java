package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

//it only works if we know range of number in array
//no negative
//and it don't compare
public class CountingSort {

    public static void main(String ar[]) {
        int array[] = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(array, 1, 10);
        Utility.show(array);
    }

    //min number range in array
    //max number range in array
    public static void countingSort(int[] input, int min, int max) {
        //create new array with same size
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < input.length; i++) {
            //as array start with zero so we need to minus one value to put it in it's original value in array
            //increment when we find value
            countArray[input[i] - min]++;


        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}
