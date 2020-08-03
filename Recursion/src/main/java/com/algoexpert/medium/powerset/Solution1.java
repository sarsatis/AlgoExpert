package com.algoexpert.medium.powerset;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    //Iterative Solution
    // result powerset= [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    public static List<List<Integer>> powerset(List<Integer> array) {
        //Initializing result variable where subsets are stored
        List<List<Integer>> subsets = new ArrayList();
        // Adding [[]] empty array as the 1st element
        subsets.add(new ArrayList<Integer>());
        // For each element in array
        for (Integer ele : array) {
            int length = subsets.size();
            // Add element to each element in subset to form powerset
            for (int i = 0; i < length; i++) {
                // During 1st iteration [[],[1]]
                // During 2st iteration [[],[1],[2],[1,2]]
                // During 3rd iteration [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
                List<Integer> currentSubset = new ArrayList(subsets.get(i));
                currentSubset.add(ele);
                subsets.add(currentSubset);
            }

        }
        return subsets;
    }
}
