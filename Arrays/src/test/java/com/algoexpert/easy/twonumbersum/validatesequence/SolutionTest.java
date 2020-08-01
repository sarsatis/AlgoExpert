package com.algoexpert.easy.twonumbersum.validatesequence;

import com.algoexpert.easy.validatesequence.Solution2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void TestCase1() {
        boolean validSubsequence = Solution2.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10));
        Assert.assertEquals(true, validSubsequence);
    }
}
