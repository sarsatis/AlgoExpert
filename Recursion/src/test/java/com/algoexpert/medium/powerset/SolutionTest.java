package com.algoexpert.medium.powerset;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {


    @Test
    public void TestCase1() {
        List<List<Integer>> output = Solution2.powerset(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        Assert.assertTrue(output.size() == 8);
        Assert.assertTrue(contains(output, new int[]{}));
        Assert.assertTrue(contains(output, new int[]{1}));
        Assert.assertTrue(contains(output, new int[]{2}));
        Assert.assertTrue(contains(output, new int[]{1, 2}));
        Assert.assertTrue(contains(output, new int[]{3}));
        Assert.assertTrue(contains(output, new int[]{1, 3}));
        Assert.assertTrue(contains(output, new int[]{2, 3}));
        Assert.assertTrue(contains(output, new int[]{1, 2, 3}));
    }

    public boolean contains(List<List<Integer>> arr1, int[] arr2) {
        for (List<Integer> subArr : arr1) {
            Collections.sort(subArr);
            if (compare(subArr, arr2)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
