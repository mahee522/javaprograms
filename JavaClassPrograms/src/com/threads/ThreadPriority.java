package com.threads;

public class ThreadPriority extends Thread {

	 public void run() {

	   String tName = Thread.currentThread().getName();
	   Integer tPrio = Thread.currentThread().getPriority();
		 
	   System.out.println(tName + " has priority " + tPrio);
	 }

	 public static void main(String[] args) 
	                      throws InterruptedException {
		 
		 ThreadPriority t1 = new ThreadPriority();
		 ThreadPriority t2 = new ThreadPriority();
		  	
		   t1.start();
		   t2.start();

	   ThreadPriority t3 = new ThreadPriority();
	   ThreadPriority t4 = new ThreadPriority();
	   ThreadPriority t5 = new ThreadPriority();

	   t3.setPriority(Thread.MAX_PRIORITY);	
	   t4.setPriority(Thread.MIN_PRIORITY);	
	   t5.setPriority(Thread.NORM_PRIORITY);	
	  
	   t3.start();
	   t4.start();
	   t5.start();
	   
	 }
	}