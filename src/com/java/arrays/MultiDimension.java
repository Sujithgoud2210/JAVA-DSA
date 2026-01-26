package com.java.arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        arr={{1,2},{1},{1,2,3}};
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int coloum = 0; coloum <arr[row].length; coloum++) {
                arr[row][coloum] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int coloum = 0; coloum < arr[row].length; coloum++) {
                System.out.print(arr[row][coloum]+" ");
            }
            System.out.println();
        }
    }
}
