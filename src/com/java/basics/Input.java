package com.java.basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextInt());
        int rollno;
        System.out.print("enter a roll number = ");
        rollno=sc.nextInt();
        System.out.println(rollno);
    }
}
