package com.exception.userdefined;

public class UserDefinedExceptionMain extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int actno[]={10000,9000,15000,60000};
	private static String name[]={"abc","xyz","pqr","ijk"};
	private static double bal[]={10000,7000,5000,9000};

public UserDefinedExceptionMain() {
}
UserDefinedExceptionMain(String str)
{
	super(str);
}
public static void main(String[] args) {
	try{
		System.out.println("Accto"+"\t\t"+"name\t\t"+"bal");
		for (int i = 0; i < 4; i++) 
		{
				System.out.println(actno[i]+"\t\t"+name[i]+"\t\t"+bal[i]);
		
				if(bal[i]<6000)
				{
				UserDefinedExceptionMain um=new UserDefinedExceptionMain("The bal is low at "+bal[i]); 
					throw um;
			
				}
		}
	}
		catch (UserDefinedExceptionMain um) {
			um.printStackTrace();
		}
	}
	
}

