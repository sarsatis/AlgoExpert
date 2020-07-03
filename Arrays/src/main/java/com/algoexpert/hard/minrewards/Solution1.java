package com.algoexpert.hard.minrewards;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution1 {

    public static int minRewards(int[] scores) {
        int[] rewards = new int[scores.length];
        Arrays.fill(rewards, 1);

        //Iterating through the array
        for (int i = 1; i < scores.length - 1; i++) {
            int j = i - 1;
            //if current element is greater than previous element then increment rewards array
            if (scores[i] > scores[j]) {
                rewards[i] = rewards[j] + 1;
            } else {
                while (j >= 0 && scores[j] > scores[j + 1]) {
                    rewards[j] = Math.max(rewards[j], rewards[j + 1] + 1);
                    j -= 1;
                }
            }

        }

        return IntStream.of(rewards).sum();
    }
}
