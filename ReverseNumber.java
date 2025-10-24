package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num); // handle negative numbers
        int reversed = 0;

        // Reverse using for loop
        for (; temp > 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }

        // If original number was negative, keep sign
        if (num < 0) {
            reversed = -reversed;
        }

        System.out.println(reversed);
        sc.close();
    }
}
