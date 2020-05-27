package com.algoexpert.medium.monotonicarray;

public class Solution {

	public static boolean isMonotonic(int[] array) {
		boolean isIncreasing = true;
		boolean isDecreasing = true;

		//Iterating through entire array
		for (int i = 0; i < array.length - 1; i++) {
			//Both the if are checking if there are mixture of numbers i.e increasing or decreasing
			if (array[i] > array[i + 1]) {
				isIncreasing = false;
			}
			if (array[i] < array[i + 1]) {
				isDecreasing = false;
			}
		}
		
//		Simple logic where we are checking elements in an array is increasing or decreasing.
//		If its only increasing then also it is monotonic array
//		If its only decreasing then also it is monotonic array
//		If all the values are equal then also it is monotonic array
		return isIncreasing || isDecreasing;
	}
}
