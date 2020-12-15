package com.faang.prep.array.FindMajorityElements;
import java.util.Scanner;
import java.util.*;


/*  Problem Statement */
/**
 * You have to given an array A of size N.
 * Find all the elements which appear more than floor(N/3) times in the given array.
 * Wait Wait!
 * There is a condition that you have to do your job in O(N) time complexity and O(1) space complexity.
 *
 * Sample Input
 * 8
 * 2 2 3 1 3 2 1 1
 *
 * Sample Output
 * 1 2
 * */

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> res = FindMajorityElement(arr);
        for(int el : res) {
            System.out.print(el+" , ");
        }
    }

    public static List<Integer> FindMajorityElement(int[] arr) {
        int el1 =0, el2 =0, count1 =0, count2 =0;
        for(int n : arr){
            if(n == el1) {
                count1++;
            } else if(n == el2) {
                count2++;
            } else if(count1 == 0) {
                el1 = n;
                count1++;
            } else if(count2 == 0) {
                el2 = n;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        //verification step:
        count1 = 0; count2 = 0;
        for(int n: arr) {
            if(n == el1) {
                count1++;
            } else if(n == el2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if(count1 > arr.length /3) {
            ans.add(el1);
        }
        if(count2 > arr.length / 3) {
            ans.add(el2);
        }

        return ans;
    }
}
