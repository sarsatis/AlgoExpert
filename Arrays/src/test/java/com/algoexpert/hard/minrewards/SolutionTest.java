package com.algoexpert.hard.minrewards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void TestCase1() {
        assertThat(Solution1.minRewards(new int[]{8, 4, 2, 1, 3, 6, 7, 9, 5})).isEqualTo(25);
    }

    @Test
    public void TestCase2() {
        assertThat(Solution1.minRewards(new int[]{1})).isEqualTo(1);
    }

    @Test
    public void TestCase3() {
        assertThat(Solution1.minRewards(new int[]{3, 5})).isEqualTo(3);
    }

    @Test
    public void TestCase4() {
        assertThat(Solution1.minRewards(new int[]{4, 2, 1, 3})).isEqualTo(8);
    }

    @Test
    public void TestCase5() {
        assertThat(Solution1.minRewards(new int[]{2, 20, 13, 12, 11, 8, 4, 3, 1, 5, 6, 7, 9, 0})).isEqualTo(52);
    }

    @Test
    public void TestCase6() {
        assertThat(Solution1.minRewards(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9})).isEqualTo(15);
    }

    @Test
    public void TestCase7() {
        assertThat(Solution1.minRewards(new int[]{800,
                400,
                20,
                10,
                30,
                61,
                70,
                90,
                17,
                21,
                22,
                13,
                12,
                11,
                8,
                4,
                2,
                1,
                3,
                6,
                7,
                9,
                0,
                68,
                55,
                67,
                57,
                60,
                51,
                661,
                50,
                65,
                53})).isEqualTo(93);
    }

}
