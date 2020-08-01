package com.algoexpert.easy.validatesequence;

import java.util.List;

public class Solution2 {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int sequenceIdx = 0;

        for (Integer value : array) {
            if (sequenceIdx == sequence.size()) {
                return true;
            }
            if (value == sequence.get(sequenceIdx)) {
                sequenceIdx += 1;
            }
        }

        return sequence.size() == sequenceIdx;
    }
}
