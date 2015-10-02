package com.javaprogam.exceptions;

public class ExceptionThrow {
	
	static void sample()
	{
		try{
			System.out.println("Inside sample");
			throw new ArithmeticException("Exception info");
		}
		catch(Exception ne)
		{
			System.out.println(ne);
		}
		
	}
	public static void main(String[] args) {
		ExceptionThrow.sample();

	}

}
