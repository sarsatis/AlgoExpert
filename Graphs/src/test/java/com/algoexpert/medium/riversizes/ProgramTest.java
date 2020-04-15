package com.algoexpert.medium.riversizes;

//Add, edit, or remove tests in this file.
//Treat it as your playground!

import java.util.*;

import org.junit.Assert;
import org.junit.Test;



public class ProgramTest {
	
	@Test
	  public void TestCase1() {
	    int[][] input = {{0}};
	    int[] expected = {};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase2() {
	    int[][] input = {{1}};
	    int[] expected = {1};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase3() {
	    int[][] input = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}};
	    int[] expected = {1, 2, 3};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase4() {
	    int[][] input = {
	      {1, 0, 0, 1},
	      {1, 0, 1, 0},
	      {0, 0, 1, 0},
	      {1, 1, 1, 0},
	    };
	    int[] expected = {1, 2, 5};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase5() {
	    int[][] input = {
	      {1, 0, 0, 1, 0},
	      {1, 0, 1, 0, 0},
	      {0, 0, 1, 0, 1},
	      {1, 0, 1, 0, 1},
	      {1, 0, 1, 1, 0},
	    };
	    int[] expected = {1, 2, 2, 2, 5};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase6() {
	    int[][] input = {
	      {1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0},
	      {1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0},
	      {0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1},
	      {1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0},
	      {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1},
	    };
	    int[] expected = {1, 1, 2, 2, 5, 21};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase7() {
	    int[][] input = {
	      {1, 0, 0, 0, 0, 0, 1},
	      {0, 1, 0, 0, 0, 1, 0},
	      {0, 0, 1, 0, 1, 0, 0},
	      {0, 0, 0, 1, 0, 0, 0},
	      {0, 0, 1, 0, 1, 0, 0},
	      {0, 1, 0, 0, 0, 1, 0},
	      {1, 0, 0, 0, 0, 0, 1},
	    };
	    int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase8() {
	    int[][] input = {
	      {1, 0, 0, 0, 0, 0, 1},
	      {0, 1, 0, 0, 0, 1, 0},
	      {0, 0, 1, 0, 1, 0, 0},
	      {0, 0, 1, 1, 1, 0, 0},
	      {0, 0, 1, 0, 1, 0, 0},
	      {0, 1, 0, 0, 0, 1, 0},
	      {1, 0, 0, 0, 0, 0, 1},
	    };
	    int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 7};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase9() {
	    int[][] input = {
	      {0, 0, 0, 0, 0, 0, 0},
	      {0, 0, 0, 0, 0, 0, 0},
	      {0, 0, 0, 0, 0, 0, 0},
	      {0, 0, 0, 0, 0, 0, 0},
	      {0, 0, 0, 0, 0, 0, 0},
	      {0, 0, 0, 0, 0, 0, 0},
	      {0, 0, 0, 0, 0, 0, 0},
	    };
	    int[] expected = {};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase10() {
	    int[][] input = {
	      {1, 1, 1, 1, 1, 1, 1},
	      {1, 1, 1, 1, 1, 1, 1},
	      {1, 1, 1, 1, 1, 1, 1},
	      {1, 1, 1, 1, 1, 1, 1},
	      {1, 1, 1, 1, 1, 1, 1},
	      {1, 1, 1, 1, 1, 1, 1},
	      {1, 1, 1, 1, 1, 1, 1},
	    };
	    int[] expected = {49};
	    List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }

	  @Test
	  public void TestCase11() {
	    int[][] input = {
	      {1, 1, 0, 0, 0, 0, 1, 1},
	      {1, 0, 1, 1, 1, 1, 0, 1},
	      {0, 1, 1, 0, 0, 0, 1, 1},
	    };
	    int[] expected = {3, 5, 6};
		List<Integer> output = Solution1.riverSizes(input);
	    Collections.sort(output);
	    int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	  }


	@Test
	public void TestCase12() {
	 int[][] input = {
	   {1, 1, 0},
	   {1, 0, 1},
	   {1, 1, 1},
	   {1, 1, 0},
	   {1, 0, 1},
	   {0, 1, 0},
	   {1, 0, 0},
	   {1, 0, 0},
	   {0, 0, 0},
	   {1, 0, 0},
	   {1, 0, 1},
	   {1, 1, 1},
	 };
	 int[] expected = {1, 1, 2, 6, 10};
	 List<Integer> output = Solution1.riverSizes(input);
	 Collections.sort(output);
	 int[] arr = output.stream().mapToInt(i -> i).toArray();
	 Assert.assertArrayEquals(expected, arr);
	}


}

