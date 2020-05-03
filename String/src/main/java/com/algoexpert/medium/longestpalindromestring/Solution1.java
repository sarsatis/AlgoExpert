package com.algoexpert.medium.longestpalindromestring;

public class Solution1 {

	// O(n^3) Time | O(1) space
	// Get the sub string approach
	public static String longestPalindromicSubstring(String str) {
		String longest = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String substring = str.substring(i, j + 1);
				if (substring.length() > longest.length() && isPalindrome(substring)) {
					longest = substring;
				}
			}
		}
		return longest;
	}

	public static boolean isPalindrome(String str) {
		int leftIdx = 0;
		int rightIdx = str.length() - 1;
		while (leftIdx < rightIdx) {
			if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
				return false;
			}
			leftIdx++;
			rightIdx--;
		}
		return true;

	}
}
