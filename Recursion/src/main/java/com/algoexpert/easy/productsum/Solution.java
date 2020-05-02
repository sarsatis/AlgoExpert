package com.algoexpert.easy.productsum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

/*	O(n) time| O(d) space
	n is the number of elements in the array
	d is the depth of the array */
	public static int productSum(List<Object> array) {
		return productSumHelper(array, 1);
	}

	//Helper method to perform recursion
	public static int productSumHelper(List<Object> array, int multiplier) {
		int sum = 0;
		//Iterating through array
		for (Object element : array) {
			//If element is of type array, If its array then we call recursion by increasing depth and passing sub array
			if (element instanceof List<?>) {
				@SuppressWarnings("unchecked")
				ArrayList<Object> e1 = (ArrayList<Object>) element;
				sum += productSumHelper(e1, multiplier + 1);
			} else {
				sum += (Integer) element;
			}
		}
		
		//Returning the total sum
		return sum * multiplier;
	}

}
