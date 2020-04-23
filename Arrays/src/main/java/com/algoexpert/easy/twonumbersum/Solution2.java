package com.algoexpert.easy.twonumbersum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	
	//O(n) time | O(n) space
	//To Improve the time complexity we use this solution of checking values against map 
	public static int[] twoNumberSum(int[] array, int targetSum) {
	    Map<Integer,Boolean> nums=new HashMap<Integer, Boolean>();
			//For each number in array we calculate its y i.e x+y=targetSum so here we know x and targetSum so y=targetSum-x
	    	//Once we find y we check weather this y is available in map if available thats the result else update map values accordingly 
			for(int num:array){
				int potentialMatch=targetSum-num;
				if(nums.containsKey(potentialMatch)){
					return new int[]{potentialMatch,num};
				}else{
					nums.put(num,true);
				}
			}
	    return new int[0];
	  }

}
