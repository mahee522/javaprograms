package com.javaprogam.exceptions;

public class FirstException {

	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			System.out.println(1/0);//ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("devident is no zero");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.getStackTrace());
		}
		finally
		{
			System.out.println("Close the connection");
			
		}

	}

}
