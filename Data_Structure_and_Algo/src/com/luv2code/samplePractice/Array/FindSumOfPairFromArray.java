//program to find pair from array using using brute force method and hashmap

package com.luv2code.samplePractice.Array;

import java.util.HashMap;

public class FindSumOfPairFromArray {
	
	public static void main(String ar[])
	{
		int array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
		findPairsEqualsToXUsingHashing(array,15);
	}



static void bruteForce(int arr[],int givenNo)
{
	
	if (arr.length < 2)
	return;

System.out.println("The pair whose sum is equal to 15 using brute force method: ");
for (int i = 0; i < arr.length; i++) {
	for (int j = i + 1; j < arr.length; j++) {
		int tempSum = arr[i] + arr[j];

		if (tempSum == givenNo) {
			System.out.println(arr[i] + " " + arr[j]);
		}
	}
}
}


public static void findPairsEqualsToXUsingHashing(int arr[], int givenNo) {
	HashMap<Integer, Integer> elementIndexMap = new HashMap<Integer, Integer>();
	System.out.println("The pair whose sum is equal to 15 : ");
	for (int i = 0; i < arr.length; i++) {
		elementIndexMap.put(arr[i], i);
	}
	System.out.println(elementIndexMap.toString());
	
	for (int i = 0; i < arr.length; i++) {
		// we have used elementIndexMap.get(X-arr[i])!=i to avoid using same
		// element twice
		//Check for arr[i],  if X-arr[i] is present in HashMap.
		//	If yes, we have found the pair and print it.
		if (elementIndexMap.get(givenNo - arr[i]) != null && elementIndexMap.get(givenNo - arr[i]) != i) //
		{
			System.out.println(arr[i] + " " + (givenNo - arr[i]));
		}
	}
}

}