package com.luv2code.samplePractice.SortAlgo;

import com.luv2code.samplePractice.commanService.Utility;

public class ShellSorting {
    public static void main(String ar[]) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;

            }
        }

        Utility.show(array);
    }
}
