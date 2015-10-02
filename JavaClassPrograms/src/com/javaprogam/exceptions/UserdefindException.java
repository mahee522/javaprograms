package com.javaprogam.exceptions;

public class UserdefindException extends Exception{
 private static int actno[]={100,1001,1002,1003};
 private static String name[]={"aaa","bbb","ccc","ddd"};
 
 private static double bal[]={9000.00,20000.00,30000.00,40000.00};
 
 public UserdefindException() {
	// TODO Auto-generated constructor stub
}
 public UserdefindException(String str)
 {
	 super(str);
 }
 public static void main(String[] args) {
	try{
		System.out.println("ACCNO: "+"\t\t"+"Customer"+"\t\t"+"Balance");
		for(int i=0;i<4;i++)
		{
			System.out.println(actno[i]+"\t\t"+name[i]+"\t\t"+bal[i]);

		if(bal[i]<10000)
		{
			UserdefindException ue=new UserdefindException("Balance is low");
			System.out.println("");
			throw ue;
		}
	}
	}
		catch (UserdefindException ue) {
			ue.printStackTrace();
		}
			// TODO: handle exception
		}
}

