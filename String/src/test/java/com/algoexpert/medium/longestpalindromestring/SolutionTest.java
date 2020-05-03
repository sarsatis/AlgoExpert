package com.algoexpert.medium.longestpalindromestring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void TestCase1() {
		assertThat(Solution2.longestPalindromicSubstring("abccbait's highnoon")).isEqualTo("abccba");
	}
	
	@Test
	public void TestCase2() {
		assertThat(Solution2.longestPalindromicSubstring("abaxyzzyxf")).isEqualTo("xyzzyx");
	}
	
	@Test
	public void TestCase3() {
		assertThat(Solution2.longestPalindromicSubstring("a")).isEqualTo("a");
	}
	
	@Test
	public void TestCase5() {
		assertThat(Solution2.longestPalindromicSubstring("it's highnoon")).isEqualTo("noon");
	}
	
	@Test
	public void TestCase6() {
		assertThat(Solution2.longestPalindromicSubstring("noon high it is")).isEqualTo("noon");
	}
	
	@Test
	public void TestCase7() {
		assertThat(Solution2.longestPalindromicSubstring("abcdefgfedcbazzzzzzzzzzzzzzzzzzzz")).isEqualTo("zzzzzzzzzzzzzzzzzzzz");
	}
	
	@Test
	public void TestCase8() {
		assertThat(Solution2.longestPalindromicSubstring("abcdefgfedcba")).isEqualTo("abcdefgfedcba");
	}
	
	@Test
	public void TestCase9() {
		assertThat(Solution2.longestPalindromicSubstring("abcdefghfedcbaa")).isEqualTo("aa");
	}
	
	@Test
	public void TestCase10() {
		assertThat(Solution2.longestPalindromicSubstring("zzzzzzz2345abbbba5432zzbbababa")).isEqualTo("zz2345abbbba5432zz");
	}
	
	@Test
	public void TestCase11() {
		assertThat(Solution2.longestPalindromicSubstring("z234a5abbbba54a32z")).isEqualTo("5abbbba5");
	}
	
	@Test
	public void TestCase12() {
		assertThat(Solution2.longestPalindromicSubstring("z234a5abbba54a32z")).isEqualTo("5abbba5");
	}
	
	
	
	
}
