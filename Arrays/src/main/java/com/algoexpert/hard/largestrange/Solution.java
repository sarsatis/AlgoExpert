package com.algoexpert.hard.largestrange;

import java.util.HashMap;

public class Solution {
	
	public static int[] largestRange(int[] array) {
		//Initializing the variable to send the result 
		//Since result is a range between 2 number so Initializing array of size 2
		int[] bestRange=new int[2];
		
		//Initializing this variable to capture the longest range
		int longestRange=0;
		
		// To add all the numbers in the array and boolean values to check weather th
		HashMap<Integer, Boolean> visitedNumbers=new HashMap<Integer, Boolean>();
		
		//Loop to fill hashmap with values and its corresponding false boolean value
		for (int num : array) {
			visitedNumbers.put(num, false);
		}
		
		//Iterating through main array actual logic implementation
		for (int num : array) {
			//if loop to skip number if its already visited
			if(visitedNumbers.get(num)){
				continue;
			}
			//if not visited flipping the numbers boolean value 
			visitedNumbers.replace(num, true);
			
			//Setting current range to 1 since we know that at this point we are deling with 1number range
			int currentRange=1;
			
			//Calculating left number and right number with subtracting and adding
			int left=num-1;
			int right=num+1;
			
			//Running this while loop until the number is found in the hashmap
			//If found we are updating its boolean value ,adding +1 to current range ,subtracting 1 from left to check next number
			while(visitedNumbers.containsKey(left)) {
				visitedNumbers.replace(left, true);
				currentRange+=1;
				left-=1;
			}
			
			//Same operations as above for loop for right value
			while(visitedNumbers.containsKey(right)) {
				visitedNumbers.replace(right, true);
				currentRange+=1;
				right+=1;
			}
			
			//Once all the while loops are completed checking the current Range is greater than 
			//longest range if yes the setting the best range and updating the longestRange value.
			if(currentRange > longestRange) {
				longestRange=currentRange;
				bestRange=new int[] {left+1,right-1};
			}
		}
		
		return bestRange;
	  }

}
