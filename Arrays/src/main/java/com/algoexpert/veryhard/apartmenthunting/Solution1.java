package com.algoexpert.veryhard.apartmenthunting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        int[] maxDistanceAtBlocks = new int[blocks.size()];
        Arrays.fill(maxDistanceAtBlocks, Integer.MIN_VALUE);
        for (int i = 0; i < blocks.size(); i++) {
            for (String req : reqs) {
                int closestReqDistance = Integer.MAX_VALUE;
                for (int j = 0; j < blocks.size(); j++) {
                    if (blocks.get(j).get(req)) {
                        closestReqDistance = Math.min(closestReqDistance, getMinDistance(i, j));
                    }
                }
                maxDistanceAtBlocks[i] = Math.max(maxDistanceAtBlocks[i], closestReqDistance);
            }
        }

        return getInxAtMinValue(maxDistanceAtBlocks);
    }

    private static int getInxAtMinValue(int[] maxDistanceAtBlocks) {
        int minValue = Integer.MAX_VALUE;
        int idxAtMinValue = 0;
        for (int i = 0; i < maxDistanceAtBlocks.length; i++) {
            if (maxDistanceAtBlocks[i] < minValue) {
                minValue = maxDistanceAtBlocks[i];
                idxAtMinValue = i;
            }

        }
        return idxAtMinValue;
    }

    private static int getMinDistance(int i, int j) {
        return Math.abs(i - j);
    }
}
