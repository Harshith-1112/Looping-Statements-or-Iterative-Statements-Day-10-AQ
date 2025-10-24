package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input limit
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        sc.close();
    }
}
