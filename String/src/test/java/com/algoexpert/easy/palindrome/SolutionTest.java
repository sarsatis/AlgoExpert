package com.algoexpert.easy.palindrome;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SolutionTest {

	
	@Test
	public void TestCase1() {
		assertThat(Solution4.isPalindrome("abcdcba")).isEqualTo(true);
	}
	
	@Test
	public void TestCase2() {
		assertThat(Solution4.isPalindrome("a")).isEqualTo(true);
	}
	
	@Test
	public void TestCase3() {
		assertThat(Solution4.isPalindrome("ab")).isEqualTo(false);
	}
	
	@Test
	public void TestCase4() {
		assertThat(Solution4.isPalindrome("abb")).isEqualTo(false);
	}
	
	@Test
	public void TestCase5() {
		assertThat(Solution4.isPalindrome("abcdefghihgfedcba")).isEqualTo(true);
	}
}
