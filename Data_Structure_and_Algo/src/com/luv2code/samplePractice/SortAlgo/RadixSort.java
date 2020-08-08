package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

public class RadixSort {
    public static void main(String ar[]) {
        int array[] = {4725, 4586, 1330, 8792, 1594, 5729};
//radix is range of number i.e is 1-10 and width is 4 for all element in this array
        radixSort(array, 10, 4);
        Utility.show(array);
    }

    public static void radixSort(int[] input, int radix, int width) {
        //loop for width so it will iterate each digit individually
        for (int i = 0; i < width; i++) {
            //sort each position starting from 0 then once tens and hundred
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        //number of items in array
        int numItems = input.length;
        //create count array so we will count the number for postion
        //we have 1-10 so  count array will be equal 10
        int[] countArray = new int[radix];

        //iterate for every value in array
        for (int value : input) {
            //it will return the digit starting from right and increment the count array so we know the count for digit
            countArray[getDigit(position, value, radix)]++;

        }
        // adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
//copy temp array to input array
        for (int i = 0; i < numItems; i++) {
            input[i] = temp[i];
        }

    }

    public static int getDigit(int position, int value, int radix) {
        //return digit from it position
        return value / (int) Math.pow(radix, position) % radix;
    }
}
