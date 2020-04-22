package com.algoexpert.veryhard.maxktransaction;

public class Program2 {
	public static int maxProfitWithKTransactions(int[] prices, int k) {
		
		//O(nk) | O(n)
		//Difference between earlier solution and this solution is 
		//We are not initializing the array to reduce space complexity
		
		if (prices.length == 0) {
			return 0;
		}
		int[] evenProfits = new int[prices.length];
		int[] oddProfits = new int[prices.length];

		
		for (int i = 0; i < prices.length; i++) {
			evenProfits[i] = 0;
			oddProfits[i] = 0;
		}
		//Here 1 and K+1 because we are not worried about row 0 
		//since it wil be 0 always at any given day
		for (int t = 1; t < k + 1; t++) {
			int maxThusFar = Integer.MIN_VALUE;
			//To swap even profits and odd profits below logic is written 
			int[] currentProfits = new int[prices.length];
			int[] previousProfits = new int[prices.length];
			if (t % 2 == 1) {
				currentProfits = oddProfits;
				previousProfits = evenProfits;
			} else {
				currentProfits = evenProfits;
				previousProfits = oddProfits;
			}

			for (int d = 1; d < prices.length; d++) {
				maxThusFar = Math.max(maxThusFar, previousProfits[d - 1] - prices[d - 1]);
				currentProfits[d] = Math.max(currentProfits[d - 1], maxThusFar + prices[d]);
			}
		}

		return k % 2 == 0 ? evenProfits[prices.length - 1] : oddProfits[prices.length - 1];

	}
}
