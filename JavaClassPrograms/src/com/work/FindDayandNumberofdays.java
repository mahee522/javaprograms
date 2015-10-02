package com.work;

import java.util.Scanner;

public class FindDayandNumberofdays {
	public static void main(String[] args) {
		 //create Scanner
		  Scanner sc = new Scanner(System.in);
		  // Read month(MM) input
		  System.out.println("enter a month MM : "); 
		  int month = sc.nextInt();
		  //Read year(yyyy) input
		  System.out.println("enter a year yyyy : "); 
		  int year = sc.nextInt();

		  /*switch statement    
		   */
		  
		  switch (month) {
		  //case-1 will print january
		  case 1:
		   System.out.println("January " + year + " had 31 days");
		   break;
		   //case 2 will print feb month
		  case 2:
		   /*
		    * case 2 is february, so
		    * here we need to check is it leap year or non-leap year
		    * to find out year is leap or not 
		    * year%4==0 && year%100!=0
		    *    or
		    *  year % 400==0
		    */
		   if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) 
		   {
		    System.out.println("February" + year + " had 29 days");
		   } else {
		    System.out.println("February" + year + " had 28 days");
		   }
		   break;
		   //case 3 will print march
		  case 3:
		   System.out.println("March " + year + " had 31 days");
		   break;
		   //case 4 will print april
		  case 4:
		   System.out.println("April " + year + " had 30 days");
		   break;
		   //case 5 will print may
		  case 5:
		   System.out.println("May " + year + " had 31 days");
		   break;
		   //case 6 will print june
		  case 6:
		   System.out.println("June " + year + " had 30 days");
		   break;
		   //case 7 will print July
		  case 7:
		   System.out.println("July " + year + " had 31 days");
		   break;
		   //case 8 will print August
		  case 8:
		   System.out.println("August " + year + " had 31 days");
		   break;
		   //case 9 will print September
		  case 9:
		   System.out.println("September " + year + " had 30 days");
		   break;
		   //case 10 will print October
		  case 10:
		   System.out.println("October " + year + " had 31 days");
		   break;
		   //case 11 will print November
		  case 11:
		   System.out.println("November " + year + " had 30 days");
		   break;
		   //case 12 will print December
		  case 12:
		   System.out.println("December " + year + " had 31 days");
		   break;

		  default:
		   System.out.println("enter valid month and year"); 
		   break;
		  }
	}
}
