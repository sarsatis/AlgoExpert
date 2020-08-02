package com.algoexpert.medium.permutation;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        getPermutations(0, array, permutations);
        return permutations;
    }

    private static void getPermutations(int i, List<Integer> array, List<List<Integer>> permutations) {
        if (i == array.size() - 1) {
            permutations.add(new ArrayList<Integer>(array));
        } else {
            for (int j = i; j < array.size(); j++) {
                swap(array, i, j);
                getPermutations(i + 1, array, permutations);
                swap(array, i, j);
            }
        }

    }

    private static void swap(List<Integer> array, int i, int j) {
        Integer tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }
}
