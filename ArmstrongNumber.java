package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        // Count number of digits
        int digits = 0;
        for (int t = temp; t > 0; t /= 10) {
            digits++;
        }

        // Calculate sum of digits raised to power of 'digits'
        for (int t = temp; t > 0; t /= 10) {
            int digit = t % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }
            sum += power;
        }

        // Check if Armstrong
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
