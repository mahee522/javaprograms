package com.threads;
class MySmpThread   implements Runnable{
	public static int myCount = 0;
    public MySmpThread  (){
         
    }

	@Override
	public void run() {
		while(MySmpThread  .myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MySmpThread  .myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
		
	}
	
}
public class RunThread {

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		MySmpThread   mrt = new MySmpThread  ();
        Thread t = new Thread(mrt);
        t.start();
        while(MySmpThread  .myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MySmpThread  .myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

	}


