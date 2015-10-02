package com.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErrorandException {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Hello java");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter i value");
		int i=Integer.parseInt(br.readLine());
		System.out.println("Enter j value");
		int j=Integer.parseInt(br.readLine());
		int a[]={10,20,30};
		
		try{
		System.out.println(i/j);
					try{
							for (int k = 0; k < a.length; k++) 
							{
								System.out.println(a[k]);
							}
							int b[]=null;
							try{
								
								System.out.println(b.length);
							}
							catch(Exception p)
							{
								p.printStackTrace();
							}
						}
						catch (ArrayIndexOutOfBoundsException e1) {
							System.out.println("array length is exceeded");
						}
					
						
		}
		catch(ArithmeticException e)
		{
		 System.out.println("J value must not be zero");
		//	e.printStackTrace();
		}
		finally{
			System.out.println("Finally block is must and should executed");
		}
		

	}
	
	

}
