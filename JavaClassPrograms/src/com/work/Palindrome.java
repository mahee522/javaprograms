package com.work;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * @param args
		 */
		int number = sc.nextInt();
		int copy = number;
		int sum = 0;
		while (number != 0) {
			int result = number % 10;
			sum = sum * 10 + result;
			number = number / 10;
		}
		if (sum == copy)
			System.out.println(copy + " is palindromw number");
		else
			System.out.println(copy + " is not plaindrome");
	}

}
