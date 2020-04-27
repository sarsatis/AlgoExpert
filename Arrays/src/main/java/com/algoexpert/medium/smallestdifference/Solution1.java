package com.algoexpert.medium.smallestdifference;

import java.util.Arrays;

public class Solution1 {

	// O(nlogn) + O(mlogm) time | O(1) space
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		
		//Sorting the two arrays
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		
		//Setting maximum values initially for ease of comparision
		int current = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		//Initializing the index of both the arrays
		int arrayOneIdx = 0;
		int arrayTwoIdx = 0;
		int[] smallestDifference = new int[2];

		//Iterating until length of arrays
		while (arrayOneIdx < arrayOne.length && arrayTwoIdx < arrayTwo.length) {
			int firstNum = arrayOne[arrayOneIdx];
			int secondNum = arrayTwo[arrayTwoIdx];
			//If 1st num is lesser we increment arrayOne
			if (firstNum < secondNum) {
				current = secondNum - firstNum;
				arrayOneIdx += 1;
			}
			//If 2nd num is lesser we increment arrayTwo
			else if (secondNum < firstNum) {
				current = firstNum - secondNum;
				arrayTwoIdx += 1;
			} 
			//Else we send the result
			else {
				return new int[] { firstNum, secondNum };
			}
			//Here we compare the smallest with the current value if its smallest then we update the smallestDifference array
			if (smallest > current) {
				smallest = current;
				smallestDifference = new int[] { firstNum, secondNum };
			}

		}

		return smallestDifference;
	}

}
