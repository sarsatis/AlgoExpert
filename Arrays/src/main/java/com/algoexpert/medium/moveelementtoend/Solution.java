package com.algoexpert.medium.moveelementtoend;

import java.util.List;

public class Solution {

	// O(n) Time | O(1) Space
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		//Initializing start and End pointers
		int i = 0;
		int j = array.size() - 1;

		// To Check if i hasn't crossed j
		while (i < j) {
			// Here again we are checking i<j because at certain points j will cross i while doing inner loop to avoid this we check inside aswell
			// We also check if the value at j index is equal to move value if it is the we decrement until we get moveValue other than toMove
			while (i < j && array.get(j) == toMove)
				j--;
			//Here we check if value at index i is a move value if it is then we swap i and j elements
			if (array.get(i) == toMove)
				swap(i, j, array);
			
			// After swapping increment i
			i++;
		}
		return array;
	}

	//Swapping operation
	public static void swap(int i, int j, List<Integer> array) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}

}
