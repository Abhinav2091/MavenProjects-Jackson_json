package com.luv2code.samplePractice.commanService;

import java.util.List;

public class Utility {

    public static void swap(int ar[], int i, int j) {
        if (i == j)
            return;
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;

    }

    public static void show(int array[])
    {
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
    public static void show(String array[])
    {
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }

    public static void show(List<?> list)
    {
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
    }
}

