package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input PIN
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        // Handle PIN = 0
        if (pin == 0) {
            System.out.println(1);
        } else {
            int count = 0;
            int temp = Math.abs(pin); // Handle negative numbers

            while (temp > 0) {
                temp /= 10;
                count++;
            }

            System.out.println(count);
        }

        sc.close();
    }
}
