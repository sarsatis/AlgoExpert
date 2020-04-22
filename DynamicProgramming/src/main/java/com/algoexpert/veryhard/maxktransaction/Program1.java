package com.algoexpert.veryhard.maxktransaction;
class Program1 {
  public static int maxProfitWithKTransactions(int[] prices, int k) {
    //If prices array is falsy/null return 0 i.e maximum profit
		if(prices.length == 0){
			return 0;
		}
		//Initializing the profits array d is column t is rows
	  //Here k+1 because we know any ways row 0 will be filled with 0's
		int[][] profits=new int[k+1][prices.length];
		for(int t=1;t < k+1 ; t++){
			//Temp variable to store minimum value at a given point
			int maxThusFar = Integer.MIN_VALUE;
			for(int d=1;d< prices.length;d++){
				//Here t=transaction and d os days
				maxThusFar=Math.max(maxThusFar,profits[t-1][d-1]-prices[d-1]);
				profits[t][d]= Math.max(profits[t][d-1],maxThusFar+prices[d]);
			}
		}
		//Returning the last value in the last column
    return profits[k][prices.length -1];
  }
}
