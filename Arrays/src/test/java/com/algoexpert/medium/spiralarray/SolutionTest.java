package com.algoexpert.medium.spiralarray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.*;

public class SolutionTest {

    @Test
    public void TestCase1() {
        int[][] input = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> output = Solution1.spiralTraverse(input);
        Assert.assertEquals(expected,output);
    }

    @Test
    public void TestCase2() {
        int[][] input = {
                {1, 2, 3, 4},
                {10, 11, 12, 5},
                {9, 8, 7, 6}
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> output = Solution1.spiralTraverse(input);
        Assert.assertEquals(expected,output);
    }

    @Test
    public void TestCase3() {
        int[][] input = {
                {1, 2, 3},
                {12, 13, 4},
                {11, 14, 5},
                {10, 15, 6},
                {9, 8, 7}
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15);
        List<Integer> output = Solution1.spiralTraverse(input);
        Assert.assertEquals(expected,output);
    }
}
