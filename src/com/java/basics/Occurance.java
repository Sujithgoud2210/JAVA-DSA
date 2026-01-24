package com.java.basics;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int rem;
        int find, count = 0;
        System.out.println("enter a number");
        number = sc.nextInt();
        System.out.println("enter finding number");
        find = sc.nextInt();
        while (number > 0) {
            rem = number % 10;
            if (rem == find) {
                count++;
            }
            number = number / 10;
        }
        System.out.println("the occurance of " + find + " is " + count + "times");

    }
}
