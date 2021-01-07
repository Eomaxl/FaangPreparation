package com.faang.prep.array.FindMajorityElements;
import java.util.*;
import java.lang.*;

public class SmallestDifference {

    /*Approach one*/
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int difference = Integer.MAX_VALUE;
        int numOne =0, numTwo = 0;
        for(int i=0; i< arrayOne.length; i++) {
            for(int j=0; j< arrayTwo.length; j++) {
                int tempDif = Math.abs(arrayOne[i] - arrayTwo[j]);
                if(tempDif < difference) {
                    numOne = arrayOne[i];
                    numTwo = arrayTwo[j];
                }
            }
        }

        return new int[] {numOne, numTwo};
    }

    /*Approach Two*/
    public static int[] smallestDifferenceAp2(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                idxOne++;
            } else if (secondNum < firstNum ) {
                current = firstNum - secondNum;
                idxTwo++;
            } else {
                return new int[] {firstNum, secondNum};
            }
            if (smallest > current) {
                smallest = current;
                smallestPair = new int[] {firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}
