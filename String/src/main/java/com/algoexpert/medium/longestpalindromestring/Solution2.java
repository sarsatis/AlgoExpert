package com.algoexpert.medium.longestpalindromestring;

public class Solution2 {

	// O(n^2) Time | O(1) space
	// Comparing the adjacent characters
	// Check one note for detailed explanation
	public static String longestPalindromicSubstring(String str) {
		//We have this variable to have O(1) space
		//In this variable we store the starting index and ending index of the longest palindrome to be returned
		//Initially it is set to 0,1 because which is one character
		int[] currentLongest = { 0, 1 };
		
		//Here we start from 1 and until the string length
		for (int i = 1; i < str.length(); i++) {
			
			//To get the starting and ending indices of the odd string i.e aba 
			//Notice here we are sending i-1 and i+1 i.e left and right char of the selected char
			int[] odd = getLongestPalindromeFrom(str, i - 1, i + 1);
			
			//To get the starting and ending indices of the even string i.e aa
			//Notice here we are sending i-1 and i i.e left and current char 
			int[] even = getLongestPalindromeFrom(str, i - 1, i);
			
			//We are getting the max value by comparing odd array with even array
			int longest[] = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
			
			//If the obtained is bigger than the currentLongest we are setting that values
			currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
			
		}
		
		//we return the substring of values which are stored in currentLongest arrya
		return str.substring(currentLongest[0], currentLongest[1]);
	}

	//Helper method to get the indexes for odd and even length string
	public static int[] getLongestPalindromeFrom(String str, int leftIdx, int rightIdx) {
		//Iterating until its inside the length
		while (leftIdx >= 0 && rightIdx < str.length()) {
			//If character doesn't match return break
			if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
				break;
			}
			leftIdx--;
			rightIdx++;
		}
		
		//Note here we add +1 to left index only because it would have increased before applying break
		return new int[] { leftIdx + 1, rightIdx };
	}

}
