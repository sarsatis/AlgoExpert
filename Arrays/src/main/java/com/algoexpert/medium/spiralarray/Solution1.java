package com.algoexpert.medium.spiralarray;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    //O(n) Time | O(n) space
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result=new ArrayList<>();
        //Declaring initial 4 variable of 2d array
        int startingRow = 0;
        int endingRow = array.length - 1;
        int startingColumn = 0;
        int endingColumn = array[0].length - 1;
        while(startingRow <= endingRow && startingColumn <= endingColumn){
            //Reading the 1st row
            for (int col = startingColumn; col <= endingColumn; col++) {
                result.add(array[startingRow][col]);
            }

            //Reading the last column
            for (int row = startingRow+1; row <= endingRow; row++) {
                result.add(array[row][endingColumn]);
            }

            //Reading the last row
            for (int col = endingColumn-1; col >= startingColumn; col--) {
                //Handle the edge case when there's a single row in the middle of the matrix. In this case, we don't
                //want to double count the values in the row which we have already counted in the first for loop above.
                //See test case 2 for an example of this edge case
                if (startingRow  == endingRow)
                    break;
                result.add(array[endingRow][col]);
            }

            //Reading 1st column
            for (int row = endingRow-1; row > startingRow; row--) {
                //Handle the edge case when there's a single column in the middle of the matrix. In this case, we don't
                //want to double count the values in the column which we have already counted in the second for loop above.
                //See test case 3 for an example of this edge case
                if (startingColumn == endingColumn)
                    break;
                result.add(array[row][startingColumn]);
            }

            // Once all the elements of outer array is completed we move to inner array so decreasing all the 4 corners of 2d array
            startingRow++;
            endingRow--;
            startingColumn++;
            endingColumn--;
        }
        return result;
    }
}
