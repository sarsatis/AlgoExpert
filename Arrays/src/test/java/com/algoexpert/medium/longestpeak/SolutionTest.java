package com.algoexpert.medium.longestpeak;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        int[] input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int expected = 6;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() {
        int[] input = new int[] {};
        int expected = 0;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3() {
        int[] input = new int[] {1, 3, 2};
        int expected = 3;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test4() {
        int[] input = new int[] {1, 2, 3, 4, 5, 1};
        int expected = 6;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test5() {
        int[] input = new int[] {5, 4, 3, 2, 1, 2, 1};
        int expected = 3;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test6() {
        int[] input = new int[] {5, 4, 3, 2, 1, 2, 10, 12, -3, 5, 6, 7, 10};
        int expected = 5;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test7() {
        int[] input = new int[] {5, 4, 3, 2, 1, 2, 10, 12};
        int expected = 0;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test8() {
        int[] input = new int[] {1, 1, 3, 2, 1};
        int expected = 4;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test9() {
        int[] input = new int[] {1, 2, 3, 4, 5, 1};
        int expected = 6;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test10() {
        int[] input = new int[] {1, 2, 3, 2, 1, 1};
        int expected = 5;
        int actual = Solution.longestPeak(input);
        Assert.assertEquals(expected,actual);
    }
}
