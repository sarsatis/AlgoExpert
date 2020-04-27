package com.algoexpert.medium.smallestdifference;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class SolutionTest {
	
	@Test
	public void TestCase1() {
		assertThat(Solution1.smallestDifference(new int[] {-1, 5, 10, 20, 28, 3},new int[] {26, 134, 135, 15, 17})).isEqualTo(new int[] {28,26});
	}
	
	@Test
	public void TestCase2() {
		assertThat(Solution1.smallestDifference(new int[] {10, 0, 20, 25},new int[] {1005, 1006, 1014, 1032, 1031})).isEqualTo(new int[] {25,1005});
	}
	
	@Test
	public void TestCase3() {
		assertThat(Solution1.smallestDifference(new int[] {10, 0, 20, 25, 2200},new int[] {1005, 1006, 1014, 1032, 1031})).isEqualTo(new int[] {25,1005});
	}
	
	@Test
	public void TestCase4() {
		assertThat(Solution1.smallestDifference(new int[] {10, 0, 20, 25, 2000},new int[] {1005, 1006, 1014, 1032, 1031})).isEqualTo(new int[] {2000, 1032});
	}
	
	@Test
	public void TestCase5() {
		assertThat(Solution1.smallestDifference(new int[] {240, 124, 86, 111, 2, 84, 954, 27, 89},new int[] {1, 3, 954, 19, 8})).isEqualTo(new int[] {954,954});
	}
	
	@Test
	public void TestCase6() {
		assertThat(Solution1.smallestDifference(new int[] {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123},new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530})).isEqualTo(new int[] {-123,-124});
	}
	
	@Test
	public void TestCase7() {
		assertThat(Solution1.smallestDifference(new int[] {},new int[] {})).isEqualTo(new int[] {0,0});
	}

}
