package com.java.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("enter two numbers ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of two numbers is = " + sum);
    }
}
