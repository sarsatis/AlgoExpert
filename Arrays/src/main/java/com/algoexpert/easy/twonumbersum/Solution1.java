package com.algoexpert.easy.twonumbersum;

public class Solution1 {
	
	//O(n^2) time | O(1) space
	public static int[] twoNumberSum(int[] array, int targetSum) {
		//Uses 2 for loops hence runs slow
	    for(int i=0;i<array.length;i++){
				int firstNum=array[i];
				for(int j=i+1;j<array.length;j++){
					int secondNum=array[j];
					//just comparison if firstSum+SecondSum is equal to target sum we return result
					if(firstNum+secondNum==targetSum){
						return new int[]{firstNum,secondNum};
					}
				}
			}
	    return new int[0];
	  }

}
