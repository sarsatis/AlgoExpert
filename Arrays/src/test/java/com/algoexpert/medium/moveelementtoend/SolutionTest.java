package com.algoexpert.medium.moveelementtoend;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {
	
	@Test
	  public void TestCase1() {
	    Assert.assertEquals(Solution.moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2), Arrays.asList(4, 1, 3, 2, 2, 2, 2, 2));
	  }
	
	@Test
	  public void TestCase2() {
	    Assert.assertEquals(Solution.moveElementToEnd(new ArrayList<Integer>(), 2), Arrays.asList());
	  }
	
	@Test
	  public void TestCase3() {
	    Assert.assertEquals(Solution.moveElementToEnd(Arrays.asList(1, 2, 4, 5, 6), 3), Arrays.asList(1, 2, 4, 5, 6));
	  }
	
	@Test
	  public void TestCase4() {
	    Assert.assertEquals(Solution.moveElementToEnd(Arrays.asList(3, 3, 3, 3, 3), 3), Arrays.asList(3, 3, 3, 3, 3));
	  }
	
	@Test
	  public void TestCase5() {
	    Assert.assertEquals(Solution.moveElementToEnd(Arrays.asList(3, 1, 2, 4, 5), 3), Arrays.asList(5, 1, 2, 4, 3));
	  }
	
	@Test
	  public void TestCase6() {
	    Assert.assertEquals(Solution.moveElementToEnd(Arrays.asList(5, 1, 2, 5, 5, 3, 4, 6, 7, 5, 8, 9, 10, 11, 5, 5, 12), 5), Arrays.asList(12, 1, 2, 11, 10, 3, 4, 6, 7, 9, 8, 5, 5, 5, 5, 5, 5));
	  }

}
