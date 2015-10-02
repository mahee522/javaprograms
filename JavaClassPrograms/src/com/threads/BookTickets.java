package com.threads;

public class BookTickets {
public static void main(String[] args) {
	Object train=new Object();
	Object compartment=new Object();
	MyTickets ob1=new MyTickets(train,compartment);
	CancelTickets ct=new CancelTickets(train,compartment);
	
	Thread t=new Thread(ob1);
	Thread t2=new Thread(ct);
	t.start();
	t2.start();
	
}
}
class MyTickets extends Thread
{
	Object train,comp;
	public MyTickets(Object train,Object comp) {
	this.comp=comp;
	this.train=train;
	}
	public void run()
	{
		System.out.println("Book ticket locked on tain");
		try
		{
			Thread.sleep(150);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Book ticket now wating to lock on compartment");
		synchronized(comp)
		{
			System.out.println("Book ticket locked on compartment");
		}
	}
}
class CancelTickets extends Thread
{
	Object train,comp;
	public CancelTickets(Object train,Object comp) {
	this.comp=comp;
	this.train=train;
	}
	public void run()
	{
		synchronized (comp) {
			System.out.println("Cancel ticket locked on compartment");
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println("Cncel ticket now wainting to lock on train");
			synchronized (train) {
				System.out.println("Cancel ticket locked on train");
				
			}
		}
	}
}