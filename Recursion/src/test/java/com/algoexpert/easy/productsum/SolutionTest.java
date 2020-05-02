package com.algoexpert.easy.productsum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class SolutionTest {
	
	/*Some more examples
	
	1) {"array": [1, 2, 3, 4, 5]} result :- 15
	2) {"array": [1, 2, [3], 4, 5]} result :- 18
	3) {"array": [[1, 2], 3, [4, 5]]} result :- 27
	4) {
		  "array": [
		    9,
		    [2, -3, 4],
		    1,
		    [1, 1, [1, 1, 1]],
		    [[[[3, 4, 1]]], 8],
		    [1, 2, 3, 4, 5, [6, 7], -7],
		    [1, [2, 3, [4, 5]], [6, 0, [7, 0, -8]], -7],
		    [1, -3, 2, [1, -3, 2, [1, -3, 2], [1, -3, 2, [1, -3, 2]], [1, -3, 2]]],
		    -3
		  ]
		}
		
		result :- 1351
	
	*/

	@Test
	public void TestCase1() {
		List<Object> arr=new ArrayList<Object>();
		arr.add(0, 5);
		arr.add(1, 2);
		List<Object> arr1=new ArrayList<Object>();
		arr1.add(0,7);
		arr1.add(1,-1);
		arr.add(2, arr1);
		arr.add(3, 3);
		List<Object> arr2=new ArrayList<Object>();
		arr2.add(0,6);
		List<Object> arr3=new ArrayList<Object>();
		arr3.add(0,-13);
		arr3.add(1,8);
		arr2.add(1,arr3);
		arr2.add(2,4);
		arr.add(4, arr2);
		assertThat(Solution.productSum(arr)).isEqualTo(12);
	}
	
	@Test
	public void TestCase2() {
		List<Object> arr=new ArrayList<Object>();
		List<Object> arr1=new ArrayList<Object>();
		List<Object> arr2=new ArrayList<Object>();
		List<Object> arr3=new ArrayList<Object>();
		List<Object> arr4=new ArrayList<Object>();
		List<Object> arr5=new ArrayList<Object>();
		arr5.add(5);
		arr1.add(arr2);
		arr2.add(arr3);
		arr3.add(arr4);
		arr4.add(arr5);
		arr.add(arr1);
		assertThat(Solution.productSum(arr)).isEqualTo(3600);
	}


}
