package com.algoexpert.medium.longestpeak;

public class Solution {

    public static int longestPeak ( int[] array){
        //Initializing longest peak variable
        int longestPeak = 0;

        //Starting while loop from 1 because to have a peak left side should be decreasing
        int i=1;


        while(i < array.length-1){

            //sequence of number is set to be peak if middle number is greater than left and right number
            // 132 it is a peak this is what we are checking below
            boolean isPeak = array[i-1] < array[i] && array[i] > array[i+1];
            if (!isPeak) {
                i++;
                continue;
            }

            // If it is peak traverse through left and right to see until where this peak expands
            int leftIdx = i-2;

            while (leftIdx>=0 && array[leftIdx] < array[leftIdx+1]){
                leftIdx--;
            }

            int rightIdx = i+2;
            while (rightIdx<array.length && array[rightIdx]<array[rightIdx-1]){
                rightIdx++;
            }

            int currentMaxPeak = rightIdx-leftIdx-1;
            longestPeak=Integer.max(longestPeak,currentMaxPeak);

            // To point i at right index because we don't want to traverse numbers which are already constituting for a peak
            i= rightIdx;
        }
        return longestPeak;
    }
}
