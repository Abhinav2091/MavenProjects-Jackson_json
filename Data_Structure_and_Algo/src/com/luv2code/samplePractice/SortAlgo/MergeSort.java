package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

public class MergeSort {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array,0,array.length);

        Utility.show(array);
    }

    //split phase using recursion
    public static void mergeSort(int[] inputArray, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2)
            return;
        int midIndex = (startIndex + endIndex) / 2;

        //left side sorting
        mergeSort(inputArray, startIndex, midIndex);

        //ride side sorting
        mergeSort(inputArray, midIndex, endIndex);

        //calling merge phase of sorting
        merge(inputArray, startIndex, midIndex, endIndex);

    }

    public static void merge(int[] inputArray, int startIndex, int midIndex, int endIndex) {
        //as array is sorted
        //if left array last element is smaller than right array first element
        //mean array is sort
        if (inputArray[midIndex] >= inputArray[midIndex - 1])
            return;
        int i = startIndex;
        int j = midIndex;
        int tempIndex = 0;
        int[] tempArray = new int[endIndex - startIndex];
        //i<midIndex left array is finished
        //j<endIndex right array is finished
        while (i < midIndex && j < endIndex) {
            tempArray[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }
        //if there is left over in left array only then it will copy midIndex-i
        //as i will be last index of left array
        //so the left over will end up at end of array
        System.arraycopy(inputArray,i,inputArray,startIndex+tempIndex,midIndex-i);
        //now copy temp array to input array
        System.arraycopy(tempArray,0,inputArray,startIndex,tempIndex);
    }
}
