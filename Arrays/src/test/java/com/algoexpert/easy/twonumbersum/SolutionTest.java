package com.algoexpert.easy.twonumbersum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
	
	@Test
	  public void TestCase1() {
	    int[] expected = {-1,11};
	    Assert.assertArrayEquals(Solution3.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6},10), expected);
	  }

	@Test
	  public void TestCase2() {
	    int[] expected = {4,6};
	    Assert.assertArrayEquals(Solution3.twoNumberSum(new int[] {4,6},10), expected);
	  }
	
	@Test
	  public void TestCase3() {
	    int[] expected = {3,15};
	    Assert.assertArrayEquals(Solution3.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15},18), expected);
	  }
	
	@Test
	  public void TestCase4() {
	    int[] expected = {};
	    Assert.assertArrayEquals(Solution3.twoNumberSum(new int[] {	-21, 301, 12, 4, 65, 56, 210, 356, 9, -47},164), expected);
	  }
	
	
}
