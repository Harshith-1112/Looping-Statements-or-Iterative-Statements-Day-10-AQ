package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }

        sc.close();
    }
}
