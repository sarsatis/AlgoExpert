package com.algoexpert.medium.powerset;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    //Recursive Solution
    //array = [1,2,3]
    // result powerset= [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    public static List<List<Integer>> powerset(List<Integer> array) {
        return powerset(array, array.size() - 1);
    }

    private static List<List<Integer>> powerset(List<Integer> array, int idx) {
        if (idx < 0) {
            List<List<Integer>> emptySet = new ArrayList();
            emptySet.add(new ArrayList<Integer>());
            return emptySet;
        }
        //During 1 iteration ele = 3
        int ele = array.get(idx);
        //Forming powersets of 3
        System.out.println("ele = " + ele);
        List<List<Integer>> subsets = powerset(array, idx - 1);
        System.out.println("subsets = " + subsets);
        int length = subsets.size();
        for (int i = 0; i < length; i++) {
            List<Integer> currentSubset = new ArrayList(subsets.get(i));
            System.out.println("currentSubset before = " + currentSubset);
            currentSubset.add(ele);
            System.out.println("currentSubset after = " + currentSubset);
            subsets.add(currentSubset);
            System.out.println("subsets = " + subsets);
        }
        return subsets;
    }
}
