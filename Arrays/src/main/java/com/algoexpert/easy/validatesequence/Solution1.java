package com.algoexpert.easy.validatesequence;

import java.util.List;

public class Solution1 {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIdx = 0;
        int sequenceIdx = 0;

        //Checking if idx are inbound of array and sequence
        while (arrayIdx < array.size() && sequenceIdx < sequence.size()) {
            //comparing array with sequence array
            if (array.get(arrayIdx) == sequence.get(sequenceIdx)) {
                //if both are equal increment sequence idx
                sequenceIdx += 1;
            }
            //else increment array idx
            arrayIdx += 1;
        }
        //return if sequence size is equal to sequence idx
        return sequence.size() == sequenceIdx;
    }
}
