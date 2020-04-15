package com.algoexpert.easy.fibonacci;

public class Solution3 {
	//Iterative Approach
	public static int getNthFib(int n) {
	    // Write your code here.
			int[] storage=new int[]{0,1};
			int counter=3;
			while(counter <= n){
				int nextFib=storage[0]+storage[1];
				storage[0]=storage[1];
				storage[1]=nextFib;
				counter++;
			}
			
		//This ternary operation to handle 0
	    return n > 1 ? storage[1] : storage[0];
	  }

}
