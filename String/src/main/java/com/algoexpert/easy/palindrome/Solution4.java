package com.algoexpert.easy.palindrome;

public class Solution4 {

	public static boolean isPalindrome(String str) {

		int leftIdx = 0;
		int rightIdx = str.length() - 1;
		while (leftIdx < rightIdx) {
			if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
				return false;
			}

			leftIdx += 1;
			rightIdx -= 1;
		}
		return true;
	}

}
