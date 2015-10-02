package com.work;

import java.util.Scanner;

public class Problem3_11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter month(MM): ");
	int month=sc.nextInt();
	
	System.out.println("Enter year(yyyy)");
	int year=sc.nextInt();
	
	switch (month) {
	case 1:
		System.out.println("January "+year+"had 31 days");
		break;
	case 2:
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		{
			System.out.println("Febrauary "+year+"had days 29");
		}
		else
		{
			System.out.println("Febrauary "+year+"had days 28");
		}
		break;
	case 3:
		System.out.println("March "+year+"had 31 days");
		break;
	case 4:
		System.out.println("April "+year+"had 30 days");
		break;
	case 5:
		System.out.println();

	default:
		break;
	}
			
}
}
