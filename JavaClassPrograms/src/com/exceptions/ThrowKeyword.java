package com.exceptions;

public class ThrowKeyword {
	static void show()
	{
		System.out.println("inside show method");
		throw new ArrayIndexOutOfBoundsException("inside show methodarithematic exception is occured");
	}
	public static void main(String[] args) {
		show();
	}

}
