package com.algoexpert.hard.subsortarray;

public class Solution {

    public static int[] subarraySort(int[] array) {
        int minOutOfOrderNum = Integer.MAX_VALUE;
        int maxOutOfOrderNum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (outOfOrder(num, array, i)) {
                minOutOfOrderNum = Integer.min(minOutOfOrderNum, num);
                maxOutOfOrderNum = Integer.max(maxOutOfOrderNum, num);
            }
        }
        if (minOutOfOrderNum == Integer.MAX_VALUE)
            return new int[]{
                    -1, -1
            };
        int subArrayLeftIdx = 0;
        while (array[subArrayLeftIdx] <= minOutOfOrderNum)
            subArrayLeftIdx++;
        int subArrayRightIdx = array.length - 1;
        while (array[subArrayRightIdx] >= maxOutOfOrderNum)
            subArrayRightIdx--;
        return new int[]{subArrayLeftIdx, subArrayRightIdx};
    }

    private static boolean outOfOrder(int num, int[] array, int i) {
        if (i == 0) {
            return num > array[i + 1];
        }
        if (i == array.length - 1) {
            return array[i - 1] > num;
        }
        return num > array[i + 1] || num < array[i - 1];
    }
}
