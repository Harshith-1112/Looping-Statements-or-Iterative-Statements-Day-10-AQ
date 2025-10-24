package com.codegnan.assignmentquestionday10loop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Input transaction ID
			System.out.print("Enter transaction ID: ");
			int num = scanner.nextInt();

			int sum = 0;
			int temp = (num < 0) ? -num : num; // handle negative numbers

			// For loop to sum digits
			for (; temp > 0; temp /= 10) {
			    sum += temp % 10; // add last digit
			}

			System.out.println(sum);
			scanner.close();
		}
    }
}