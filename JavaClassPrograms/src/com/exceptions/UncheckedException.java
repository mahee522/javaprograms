package com.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncheckedException {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		int j=Integer.parseInt(br.readLine());
		try{
		System.out.println(i/j);
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println(ae.getClass());
			System.out.println(ae.getStackTrace());
			System.out.println("Denomenator value does't zero");
		}
		finally
		{
			System.out.println("class exited");
		}
	}
}
