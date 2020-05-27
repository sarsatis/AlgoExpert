package com.algoexpert.medium.monotonicarray;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void TestCase1() {
		int[] array = new int[] { -1, -5, -10, -1100, -1100, -1101, -1102, -9001 };
		Assert.assertEquals(Solution.isMonotonic(array), true);
	}

	@Test
	public void TestCase2() {
		int[] array = new int[] { };
		Assert.assertEquals(Solution.isMonotonic(array), true);
	}

	@Test
	public void TestCase3() {
		int[] array = new int[] { 1 };
		Assert.assertEquals(Solution.isMonotonic(array), true);
	}

	@Test
	public void TestCase4() {
		int[] array = new int[] { 1,2 };
		Assert.assertEquals(Solution.isMonotonic(array), true);
	}

	@Test
	public void TestCase5() {
		int[] array = new int[] { 2,1};
		Assert.assertEquals(Solution.isMonotonic(array), true);
	}

	@Test
	public void TestCase6() {
		int[] array = new int[] { 1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 7, 9, 10, 11 };
		Assert.assertEquals(Solution.isMonotonic(array), false);
	}

}
