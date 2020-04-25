package com.algoexpert.medium.threenumbersum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;;

public class SolutionTest {

	@Test
	public void TestCase1() {
		List<Integer[]> expected = Arrays.asList(new Integer[] { -8, 2, 6 }, new Integer[] { -8, 3, 5 },
				new Integer[] { -6, 1, 5 });
		assertThat(Solution1.threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0)).containsAll(expected);
	}
	
	
	@Test
	public void TestCase2() {
		//List<Integer[]> expected = Arrays.asList(new Integer[] {});
		List<Integer[]> expected =new ArrayList<Integer[]>();
		assertThat(Solution1.threeNumberSum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 }, 5)).containsAll(expected);
	}

}
