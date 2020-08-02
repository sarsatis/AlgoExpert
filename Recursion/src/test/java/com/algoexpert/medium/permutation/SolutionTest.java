package com.algoexpert.medium.permutation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<List<Integer>> perms = Solution1.getPermutations(input);
        Assert.assertEquals(perms.size(), 6);
        Assert.assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
        Assert.assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 2))));
        Assert.assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 3))));
        Assert.assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 1))));
        Assert.assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 2))));
        Assert.assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 1))));
    }

    public boolean contains(List<List<Integer>> arr1, List<Integer> arr2) {
        for (List<Integer> subArray : arr1) {
            if (subArray.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}
