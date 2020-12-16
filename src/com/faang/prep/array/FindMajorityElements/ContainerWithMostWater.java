package com.faang.prep.array.FindMajorityElements;
import java.util.*;

/**
 * In Coding blocks test Kartik bhaiya gave students an array of n non-negative integers a1, a2, …, an
 * ,where each represents a point at coordinate (i, ai). n vertical lines are drawn such that
 * the two endpoints of line i is at (i, ai) and (i, 0).
 * The task is to find two lines, which together with x-axis forms a container,
 * such that the container contains the most water.
 * Note: You may not slant the container.
 *
 * Sample Input
 * 9
 * 1 8 6 2 5 4 8 3 7
 *
 * Sample Output
 * 49
 *
 * */
public class ContainerWithMostWater {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0 ; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the maximum units :"+countMaxUnit(arr));
    }

    public static int countMaxUnit(int [] arr) {

        return 0;
    }
}
