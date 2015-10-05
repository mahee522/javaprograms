package com.work;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;

public class AnalogClock extends Applet implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String name="My Clock 1.2.3";
	
	public static int dialsize=600;
	
	public static boolean isRunning=false;
	
	public static Graphics g;
	
	public static Image screen;
	
	public static JFrame frame;
	
	public Numbers number;
	
	public static void main(String[] args) {
		
		AnalogClock analogClock=new AnalogClock();
		
		frame=new JFrame();
		frame.add(analogClock);
		frame.setSize(dialsize+6, dialsize+28);
		frame.setTitle(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		analogClock.start();
	}
	
	public void start()
	{
		requestFocus();
		
		number = new Numbers();
		
		isRunning=true;
		Thread th=new Thread(this);
		th.start();
	}
	
	public void run()
	{
		screen=createVolatileImage(dialsize, dialsize);
		while (isRunning) {
			tick();
			render(g);
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void tick()
	{
		
	}
	public int center = dialsize/2;
	public double time;
	public int animation1;
	public int animation2;
	public int radius=(dialsize-40) / 2;
	public int animation3;
	public int animation4;
	
	public void render(Graphics g)
	{
		
		//Drawing to image
		screen=createImage(dialsize,dialsize);
		g=screen.getGraphics();
		
		
		
		//Drawing background
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, dialsize, dialsize);
		
		//Drawing the frame(outside circle)
		g.setColor(Color.BLACK);
		g.fillOval(5, 5, dialsize-10, dialsize-10);
		g.setColor(Color.WHITE);
		g.fillOval(20, 20, dialsize-40	, dialsize-40);
		
		
		number.render(g);
		
		//Lines
		for (int i = 0; i < 60; i++) 
		{
			 //int p=i % 60.0 / 60 * Math.PI * 2;    
			radius = dialsize - 40;
			animation1=center + (int) ((Math.sin(i % 60.0 / 60 * Math.PI * 2)*(radius/2)));
			animation2=center - (int) ((Math.cos(i % 60.0 / 60 * Math.PI * 2)*(radius/2)));
			radius = dialsize - 60;
			animation3=center + (int) ((Math.sin(i % 60.0 / 60 * Math.PI * 2)*(radius/2)));
			animation4=center - (int) ((Math.cos(i % 60.0 / 60 * Math.PI * 2)*(radius/2)));
			g.setColor(Color.BLUE);
			g.drawLine(animation1, animation2, animation3, animation4);
		
			if(i % 5==0)
			{
				g.drawLine(animation1 + 1, animation2,animation3 + 1, animation4);
				g.drawLine(animation1, animation2 + 1, animation3, animation4 + 1);
				g.drawLine(animation1 - 1, animation2, animation3 - 1, animation4);
				g.drawLine(animation1 , animation2 - 1, animation3, animation4 - 1);
				 
				
			}
		}
		
		
		//math for hour Hand
		
		radius=dialsize-140;
		
		int t = (int) (System.currentTimeMillis()+18300000) + 3600000 + 3600000 + 3600000 + 3600000 +360000;
		animation1 = center + (int) ((Math.sin(t % 43200000.0 / 43200000 * Math.PI * 2) * (radius/2))) + 7;
		animation2 = center - (int) ((Math.cos(t % 43200000.0 / 43200000 * Math.PI * 2) * (radius/2))) + 7;
		
		//Drawing the hour hand
		g.setColor(Color.BLACK);
		g.fillOval(center - 8, center - 8, 16, 16);
		g.drawLine(center, center, animation1, animation2);
		g.drawLine(center + 1, center, animation1 + 1, animation2);
		g.drawLine(center, center + 1, animation1, animation2 + 1);
		g.drawLine(center - 1, center, animation1 - 1, animation2);
		g.drawLine(center, center - 1, animation1, animation2 - 1);
		g.drawLine(center + 1, center + 1, animation1, animation2);
		g.drawLine(center + 1, center - 1, animation1, animation2);
		g.drawLine(center - 1, center + 1, animation1, animation2);
		g.drawLine(center - 1, center - 1, animation1, animation2);
		
		
		//minute Hand
		
				radius=dialsize-90;
				int m=(int) (System.currentTimeMillis())+360000;
				animation1=center + (int) ((Math.sin(m % 3600000.0 / 3600000 * Math.PI * 2)*(radius / 2)));
				animation2=center -  (int) ((Math.cos(m % 3600000.0 / 3600000 * Math.PI *2)*(radius / 2)));
				
				
				g.setColor(Color.black);
				g.drawLine(center, center, animation1, animation2);
				g.drawLine(center + 1, center,animation1 + 1, animation2);
				g.drawLine(center, center + 1, animation1, animation2 + 1);
				g.drawLine(center - 1, center, animation1 - 1, animation2);
				g.drawLine(center , center - 1, animation1, animation2 - 1);
				 
				
		//Math for Second Hand
				
		DateFormat dateFormat = new SimpleDateFormat("ss");
		Calendar cal= Calendar.getInstance();
		String s = dateFormat.format(cal.getTime());
				
		radius=dialsize - 70;
		//time=System.currentTimeMillis()%60000.0/60000*Math.PI;
		animation1 = center + (int) ((Math.sin(Integer.parseInt(s) % 60.0 / 60 * Math.PI*2) * (radius / 2)));
		animation2 = center - (int) ((Math.cos(Integer.parseInt(s) % 60.0 / 60 * Math.PI*2) * (radius /2 )));
		
		//Drawing the second hand
		g.setColor(Color.red);
		g.drawLine(center, center, animation1, animation2);
		g.drawLine(center + 1, center,animation1 + 1, animation2);
		g.drawLine(center, center + 1, animation1, animation2 + 1);
		g.drawLine(center - 1, center, animation1 - 1, animation2);
		g.drawLine(center, center - 1, animation1, animation2 - 1);
		
		//Center circle
		
		g.fillOval(center - 5, center - 5, 10, 10);
		g.setColor(Color.black);
		g.fillOval(center - 2, center - 2, 4, 4);
	    
		
		g=getGraphics();
		g.drawImage(screen, 0, 0, dialsize, dialsize, this);
		g.dispose();
	}
}
