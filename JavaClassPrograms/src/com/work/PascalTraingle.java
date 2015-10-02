package com.work;

import java.util.Scanner;

public class PascalTraingle {

	public static void main(String[] args) {
		//Create Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter traingl size");
		//Read limit
		int num=sc.nextInt();
		//for loop
		for (int i = 1; i <=num; i++) 
		{
			System.out.print(" ");
			for (int j = num; j >i; j--) 
			{
				System.out.print("  ");
			}
			for (int j=i; j>1; j--) 
			{ 
				System.out.print(" "+j); 
			} // end for j 
			
			for (int j=1; j<=i; j++) 
			{ 
				System.out.print(" "+j); 
			}
			System.out.println();
			
			
		}	//end of the for loop	
		
	}
	}


