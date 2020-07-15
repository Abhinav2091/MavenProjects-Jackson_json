package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

//swap the biggest number to next and eventually the biggest number will be at end
public class BubbleSort {

    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            for (int j = 0; j < lastIndex; j++) {
                if (array[j] > array[j + 1])
                    Utility.swap(array, j, j + 1);
            }
        }
        Utility.show(array);


    }


}
