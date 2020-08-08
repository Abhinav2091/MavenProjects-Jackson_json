package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

//use concept of pivot
//pivot is a element whose left element are smaller than it
//and right is greater than it
//hence at end pivot is at sorted position in array
public class QuickSort {
    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        Utility.show(array);
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2)
            return;
        int pivotIndex = partition(input, startIndex, endIndex);

        //do same for left side of pivot
        quickSort(input, startIndex, pivotIndex);
        //now do the same for right side
        //start index id +1 from pivot index in array
        quickSort(input, pivotIndex + 1, endIndex);

    }

    public static int partition(int[] input, int startIndex, int endIndex) {
        //using First element of array as Pivot
        int pivot = input[startIndex];
        int i = startIndex;
        int j = endIndex;
        //when they both cross
        while (i < j) {   //Note:: empty loop
            //we will decrement array unless we find number less than pivot
            while (i < j && input[--j] >= pivot) ;
            //if the number hasn't crossed each other
            if (i < j) {
                input[i] = input[j];
            }

            //Note:: empty loop
            //we will increment array unless we find greater number than pivot
            while (i < j && input[++i] >= pivot) ;
            //if the number hasn't crossed each other
            if (i < j) {
                input[j] = input[i];
            }


        }
        input[j] = pivot;
        return j;
    }
}
