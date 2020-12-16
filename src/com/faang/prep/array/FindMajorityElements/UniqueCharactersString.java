package com.faang.prep.array.FindMajorityElements;

import java.util.*;

/**
 * Ramu has an array of strings. He want to find a string s such that it is a concatenation of sub-sequence of given array and have unique characters.Since,he has just started coding so he needs your help.
 * A sub-sequence of an array is a set of elements that can be obtained by deleting some elements(posssibly none) from the array and keeping the order same.
 * Print the maximum possible length of s.
 *
 * Input Format:
 * The first line of input contains an interger n -the length of array.Next n lines contains the element(strings) of the array
 * 3
 * ab
 * cd
 * ab
 * Sampler Output:
 * 4
 *
 * */

public class UniqueCharactersString {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i< size; i++) {
            String str = sc.next();
            arr.add(str);
        }
        System.out.println("The maximum length of the string is :"+maxLength(arr));
    }

    private static int maxLength(List<String> arr, int i, String ans) {
        // Base Case
        if(i == arr.size()) {
            int[] freq = new int[26];
            for(int k =0; k < ans.length(); k++) {
                if(freq[ans.charAt(k) - 'a'] == 1) {
                    return 0;
                }
                freq[ans.charAt(k) - 'a']++;
            }
            return ans.length();
        }

        //recursive cases
       int op1 = Integer.MIN_VALUE, op2 = op1;

       if(ans.length() + arr.get(i).length() <= 26) {
           op1 = maxLength(arr, i + 1, ans + arr.get(i));
       }

       op2 = maxLength(arr, i + 1, ans);
       return Math.max(op1, op2);
    }

    public static int maxLength(List<String> arr) {
        return maxLength(arr, 0, "");
    }
}
