
// package com.company;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter one number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();

        int sum = first + second;
        System.out.println("the two number of sum is " + sum);

    }
}