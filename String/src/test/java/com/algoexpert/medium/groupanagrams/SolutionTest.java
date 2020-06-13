package com.algoexpert.medium.groupanagrams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    @Test
    public void TestCase1() {
        List<String> words =
                new ArrayList<String>(Arrays.asList("yo", "act", "flop", "tac", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
        List<List<String>> output = Solution.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }

    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }
}
