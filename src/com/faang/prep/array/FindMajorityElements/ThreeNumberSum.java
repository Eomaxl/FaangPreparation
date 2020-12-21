package com.faang.prep.array.FindMajorityElements;
import java.util.*;
/**
 *  Write a function that takes in an non-empty array of distinct integers
 *  and an integer representing a target sum. The function should find all
 *  triplets in the array that sum up to the target sum and return a two dimensional
 *  array of all these triplets. The numbers in each triplet should be ordered
 *  in ascending order, and the triplets themselves should be ordered in ascending
 *  order with respect to the numbers they hold.
 *  If no three numbers sum up to the target sum, the function should return
 *  an empty array.
 *
 *  Sample Input: [12, 3, 1, 2, -6, 5, -8, 6] , target sum = 0;
 *  Sample Output: [[-8, 2, 6], [-8, 3, 5]. [-6, 1, 5]]
 *
 *  Optimal Space and Time Complexity: O(n^2) time | O(n) where n is
 *  the length of the input array.
 * */
public class ThreeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the target value ");
        int target = sc.nextInt();
        System.out.println("Enter the array element :");
        for(int i = 0; i< size; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer[]> res = threeNumberSum(arr,target);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<Integer[]>();
            for(int i=0; i<array.length; i++){
                int left = i + 1;
                int right = array.length - 1;
                while( left < right) {
                    int currentSum = array[i] + array[left] + array[right];
                    if( currentSum == targetSum) {
                        Integer[] newTriplets = {array[i], array[left], array[right]};
                        triplets.add(newTriplets);
                        left++;
                        right--;
                    } else if (currentSum < targetSum) {
                        left++;
                    } else if (currentSum > targetSum) {
                        right--;
                    }
                }
            }
        return triplets;
    }
}
