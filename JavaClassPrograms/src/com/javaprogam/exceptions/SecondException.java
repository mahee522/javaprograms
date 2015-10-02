package com.javaprogam.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondException {
	String name;
	int rollNo;
	public SecondException(String name,int rollNo) {
	this.name=name;
	this.rollNo=rollNo;
	}
	
	void read()
	{
			System.out.println("My name is: "+name);
			System.out.println("My roll number is "+rollNo);
	}
	
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter name");
			String s=br.readLine();
			System.out.println("Enter Rollnumber");
			int i=Integer.parseInt(br.readLine());
			
			SecondException se=new SecondException(s, i);
			se.read();
		}
		catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
