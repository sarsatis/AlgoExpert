package com.algoexpert.easy.twonumbersum;

import java.util.Arrays;

public class Solution3 {

	// O(nlogn) space| O(1) time
	public static int[] twoNumberSum(int[] array, int targetSum) {
		// To improve the space complexity we use this approach but there is a hit in time complexity but better than 1st solution
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		// While loop to run until there is no overlap between left and right pointers
		//Check one note for more descriptive explanation
		while (left < right) {
			int currentSum = array[left] + array[right];
			if (currentSum == targetSum) {
				return new int[] { array[left], array[right] };
			} else if (currentSum < targetSum) {
				left += 1;
			} else if (currentSum > targetSum) {
				right -= 1;
			}
		}
		return new int[0];
	}

}
