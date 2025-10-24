package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second; // next Fibonacci number
            first = second;
            second = next;
        }

        sc.close();
    }
}
