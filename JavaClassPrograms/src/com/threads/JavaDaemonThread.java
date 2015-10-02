package com.threads;

public class JavaDaemonThread {
	public static void main(String[] args) throws InterruptedException 
	{
        Thread dt = new Thread(new DaemoneThread());
       
        dt.setDaemon(true);
        dt.start();
        //continue program
        Thread.sleep(30000);
        System.out.println("Finishing program");
    }
 
}
 
class DaemoneThread implements Runnable{
 
    @Override
    public void run() {
    	process p=new process();
        while(true){
            p.processSomething();
        }
    }
 
}
class process{
	
    void processSomething() {
        try {
            System.out.println("Processing daemon thread");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
