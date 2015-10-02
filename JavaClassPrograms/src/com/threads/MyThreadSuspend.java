package com.threads;
import java.util.ArrayList;
import java.util.List;
 
public class MyThreadSuspend {
    public static void main(String a[])
    {
        List<ExmpThread> list = new ArrayList<ExmpThread>();
        for(int i=0;i<4;i++)
        {
            ExmpThread et = new ExmpThread(i+10);
            et.setName("MyThread"+i);
            list.add(et);
            et.start();
            System.out.println(  et.isAlive());
        }
        for(ExmpThread et:list)
        {
            try {
                et.join();
                
            } catch (InterruptedException ex) { }
        }
    }
}
 
class ExmpThread extends Thread{
    private int suspendCount;
    public ExmpThread(int count){
        this.suspendCount = count;
    }
    public void run()
    {
        for(int i=0;i<50;i++){
            if(i%suspendCount == 0){
                try {
                    System.out.println("Thread Sleep: " + getName()+"===>"+i);
                    Thread.sleep(500);
                } catch (InterruptedException ex) { }
            }
        }
    }
}
