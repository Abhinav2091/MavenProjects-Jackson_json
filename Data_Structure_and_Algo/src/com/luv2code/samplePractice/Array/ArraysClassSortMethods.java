package com.luv2code.samplePractice.Array;

import com.luv2code.samplePractice.commanService.Utility;

import java.util.Arrays;

public class ArraysClassSortMethods {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};

        //Arrays.sort(array);
        Arrays.parallelSort(array);

        Utility.show(array);
    }
}
