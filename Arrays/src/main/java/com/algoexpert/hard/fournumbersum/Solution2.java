package com.algoexpert.hard.fournumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

	//This is similar to 3 number sum where we use while loop pointer to calculate 4number sum
	// O(n^3) time  | O(n^2) space
	// Easier but slower see solution for better time complexity but difficult
	// For comments or if any doubt in understanding the program check 3number sum problem
	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
	    Arrays.sort(array);
			List<Integer[]> result=new ArrayList<Integer[]>();
			for(int i=0;i<array.length-1;i++){
				for(int j=i+1;j<array.length-1;j++){
					int left=j+1;
					int right=array.length-1;
					
					while(left<right){
						int currentSum=array[i]+array[j]+array[left]+array[right];
						if(currentSum==targetSum){
							Integer[] quadPair={array[i],array[j],array[left],array[right]};
							result.add(quadPair);
							left+=1;
							right-=1;
						}else if(currentSum<targetSum){
							left+=1;
						}else if(currentSum>targetSum){
							right-=1;
						}
					}
					
				}
			}
	    return result;
	  }
}
