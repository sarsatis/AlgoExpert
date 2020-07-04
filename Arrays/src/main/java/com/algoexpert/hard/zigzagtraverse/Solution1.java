package com.algoexpert.hard.zigzagtraverse;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {

        int height = array.size() - 1;
        int width = array.get(0).size() - 1;
        int row = 0;
        int col = 0;
        List<Integer> result = new ArrayList<>();
        boolean goingDown = true;

        //Iteration the 2d array until inbound
        while (!isOutOfBound(row, col, height, width)) {
            result.add(array.get(row).get(col));
            if (goingDown) {
                if (col == 0 || row == height) {
                    goingDown = false;
                    if (row == height)
                        col++;
                    else
                        row++;
                } else {
                    row++;
                    col--;
                }
            } else {
                if (row == 0 || col == width) {
                    goingDown = true;
                    if (col == width) {
                        row++;
                    } else {
                        col++;
                    }
                } else {
                    row--;
                    col++;
                }
            }

        }
        return result;
    }

    //Helper method to check all 4 corners
    private static boolean isOutOfBound(int row, int col, int height, int width) {
        return row > height || row < 0 || col > width || col < 0;
    }


}
