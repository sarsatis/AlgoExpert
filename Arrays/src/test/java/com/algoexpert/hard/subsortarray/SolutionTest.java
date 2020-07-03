package com.algoexpert.hard.subsortarray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void test() {
        int[] expected = {3, 9};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}));
    }

    @Test
    public void test1() {
        int[] expected = {-1, -1};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{1, 2}));
    }

    @Test
    public void test2() {
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{2, 1}));
    }

    @Test
    public void test3() {
        int[] expected = {4, 9};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19}));
    }

    @Test
    public void test4() {
        int[] expected = {1, 11};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57}));
    }

    @Test
    public void test5() {
        int[] expected = {6, 7};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11}));
    }

    @Test
    public void test6() {
        int[] expected = {-1, -1};
        Assert.assertArrayEquals(expected, Solution.subarraySort(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89}));
    }

}
