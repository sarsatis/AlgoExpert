package com.algoexpert.hard.fournumbersum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import com.algoexpert.hard.fournumbersum.Solution1;



public class SolutionTest {
	
	@Test
	public void TestCase1() {
		List<Integer[]> expected = Arrays.asList(new Integer[] { 6, 7, 4, -1}, new Integer[] { 6, 7, 1, 2});
		
		assertThat(Solution1.fourNumberSum(new int[] { 7, 6, 4, -1, 1, 2 }, 16)).containsSubsequence(expected);
	}
	
	
	@Test
	public void TestCase2() {
		//List<Integer[]> expected = Arrays.asList(new Integer[] {});
		List<Integer[]> expected =new ArrayList<Integer[]>();
		assertThat(Solution1.fourNumberSum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 }, 5)).containsAll(expected);
	}
	
	@Test
	public void TestCase3() {
		List<Integer[]> expected = Arrays.asList(new Integer[] { -5, 5, -2, 2}, new Integer[] { -5, 5, 3, -3}, new Integer[] { 2, -2, 3, -3});
		assertThat(Solution1.fourNumberSum(new int[] { 5, -5, -2, 2, 3, -3 }, 0)).hasSameElementsAs(expected);
	}


}
