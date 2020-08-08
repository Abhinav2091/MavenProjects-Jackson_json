package com.luv2code.samplePractice.challenges;

import com.luv2code.samplePractice.commanService.Utility;

public class RadixSortWithString {
    public static void main(String ar[]) {
        String array[] = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        //do radix sort
        //radix is 26 coz we have 26 char
        //and width is  5 in array
        radixSort(array,26,5);

        Utility.show(array);
    }

    public static void radixSort(String[] input, int radix, int width) {
        //loop for width so it will iterate each digit individually
        for (int i = width-1; i >=0; i--) {
            //sort each position starting from 0 then once tens and hundred
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {
        //number of items in array
        int numItems = input.length;
        //create count array so we will count the number for postion
        //we have 1-10 so  count array will be equal 10
        int[] countArray = new int[radix];

        //iterate for every value in array
        for (String value : input) {
            //it will return the char starting from right and increment the count array so we know the count for digit
            countArray[getIndex(position, value)]++;

        }
        // adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }
//copy temp array to input array
        for (int i = 0; i < numItems; i++) {
            input[i] = temp[i];
        }

    }

    public static int getIndex(int position, String value) {
        //return digit from it position
        //as char are nomeric value in undercover
        //so we can find the index of our char in array by sub it by char 'a'
        //it's only for lower case also a=97b=98,c=99 ....
        //therefore b index will be 98-97=1 ...
        return value.charAt(position)-'a';
    }
}
