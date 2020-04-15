package com.algoexpert.easy.fibonacci;

class Solution1 {
	
	//Normal Recursion Approach
	  public static int getNthFib(int n) {
	    // Write your code here.
			if(n==2){
				return 1;
			}else if(n==1){
				return 0;
			}else{
				return getNthFib(n-1) + getNthFib(n-2);
			}
	  }
	}

