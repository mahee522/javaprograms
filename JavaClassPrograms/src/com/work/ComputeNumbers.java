package com.work;

import java.util.Scanner;

public class ComputeNumbers {

	public static void main(String[] args) {
		//name integers
		int total = 0;
		int positivenums = 0;
		int negativenums = 0;
		int count = 0 ;
		float average ;
		//Create Scanner
		Scanner inputvalue = new Scanner(System.in);
		// initial input and continue until 0 is entered
		System.out.println( "Enter an int value (The program exits if the input is 0): ");
		int n = inputvalue.nextInt();
		while(n != 0)
		{
			count++;
			total += n;
			if(n>0)
			{
				positivenums++;
			}
			else if(n<0)
			{
				negativenums++;
			}
			n = inputvalue.nextInt();
		}
		// end result of user input
		average = total / count;
		System.out.println("Number of positive numbers = "+ positivenums);
		System.out.println("Number of negative numbers = "+ negativenums);
		System.out.println("Average of numbers  = "+ average);


	}

}
