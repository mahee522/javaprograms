package com.threads;

 class Availabilty implements Runnable{
	int available=1;
	int wanted;
	public Availabilty(int i) {
	wanted=i;
	}
	public void run()
	{
		synchronized (this) 
		{
			System.out.println("Available berths: "+available);
			if(available>=wanted)
			{
			String name=Thread.currentThread().getName();
			System.out.println(wanted +"Berth reserved for "+name);
			try
			{
				Thread.sleep(1500);
				available=available-wanted;
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		else
			System.out.println("Sorry, no berths");
	}
	}
}
public class Reservation
{
	public static void main(String[] args) {
		Availabilty av=new Availabilty(1);
		Thread t1=new Thread(av);
		Thread t2=new Thread(av);
		t1.setName("FirstPerson");
		t2.setName("Second Person");
		t1.start();
		t2.start();
		
	}
	
}
