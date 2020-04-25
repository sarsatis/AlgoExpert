package com.algoexpert.medium.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {

	// O(n^2) time | O(n) space
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		//Sorting the array is very important
		Arrays.sort(array);
		List<Integer[]> triplets = new ArrayList<Integer[]>();

		//Formula currentSum= currentNumber+LeftPointer+RightPointer
		//Current number is obtained by this for loop
		for (int i = 0; i < array.length - 2; i++) {
			int left = i + 1;
			int right = array.length - 1;
			//This while loop to increment and decrement based on current sum
			//Look at one note for clearer explanation
			while (left < right) {
				int currentSum = array[i] + array[left] + array[right];
				if (currentSum == targetSum) {
					Integer[] newTriplet = { array[i], array[left], array[right] };
					triplets.add(newTriplet);
					left += 1;
					right -= 1;
				} else if (currentSum < targetSum) {
					left += 1;
				} else if (currentSum > targetSum) {
					right -= 1;
				}
			}
		}
		return triplets;
	}

}
