package com.algoexpert.hard.fournumbersum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {

	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		Map<Integer, List<Integer[]>> newPairs = new HashMap<Integer, List<Integer[]>>();
		List<Integer[]> quadruplet = new ArrayList<Integer[]>();

		//Initial pass to get the 1st number
		//Check one note for proper explanation for what is p , diff, q and all
		for (int i = 1; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// Computing P
				int currentSum = array[i] + array[j];
				// Computing difference
				int difference = targetSum - currentSum;
				// Checking weather this difference exists in HT
				if (newPairs.containsKey(difference)) {
					//If exists for all the pairs we add the quadruplet
					for (Integer[] pair : newPairs.get(difference)) {
						Integer[] result = { pair[0], pair[1], array[i], array[j] };
						quadruplet.add(result);
					}
				}
			}

			// Computing Q to populate hashmap
			for (int k = 0; k < i; k++) {
				//K is the current value i is the previous values
				int currentSum = array[k] + array[i];
				Integer[] pair = { array[i], array[k] };
				//If pairs does not exists adding into hasmap
				if (!newPairs.containsKey(currentSum)) {
					List<Integer[]> pairGroup = new ArrayList<Integer[]>();
					pairGroup.add(pair);
					newPairs.put(currentSum, pairGroup);
				} 
				//If pairs exists updating the hashmap
				else {
					newPairs.get(currentSum).add(pair);
				}
			}
		}
		return quadruplet;
	}

}
