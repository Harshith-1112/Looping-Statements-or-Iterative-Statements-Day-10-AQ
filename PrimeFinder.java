package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input upper limit
        System.out.print("Enter the upper limit: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
