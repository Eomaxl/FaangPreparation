package com.faang.prep.array.FindMajorityElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveElementToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> numberList = new ArrayList<Integer>();
        for(int i=0; i< size; i++){
            System.out.println("Enter the number :");
            int num = sc.nextInt();
            numberList.add(num);
        }
        List<Integer> result = moveElementToEnd(numberList,2);
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i =0;
        int j =array.size() - 1;
        while( i < j){
            while (i < j && array.get(j) == toMove) j--;
            if (array.get(i) == toMove) swap(i, j , array);
            i++;
        }
        return array;
    }

    public static void swap (int i, int j, List<Integer> array) {
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }
}
