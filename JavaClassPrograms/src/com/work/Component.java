package com.work;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class Component extends Applet implements Runnable{
	
	public static String title="My Clock";
	
	//public static int width=600;
	public static int size=600;
	
	public static boolean isRunning=false;
	public static Graphics g;
	public static Image screen;
	
	public static JFrame frame;
	public static void main(String[] args) {
		Component component=new Component();
		frame=new JFrame();
		frame.add(component);
		frame.setSize(size+6, size+26);
		frame.setTitle(title);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		component.start();
	}
	
	public void start()
	{
		init();
		isRunning=true;
		Thread th=new Thread(this);
		th.start();
	}
	public void init()
	{
	screen=createVolatileImage(size, size);	
	}
	public void run()
	{
		while (isRunning) {
			tick();
			render(g);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void tick()
	{
		
	}
	public void render(Graphics g)
	{
		screen=createImage(size,size);
		g=screen.getGraphics();
		
		int center=size/2;
		double time=(int)System.currentTimeMillis();
		int anim;
		int anim2;
		int radius=size-80;
		int anim3,anim4;
		
		//background
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, size, size);
		
		//Circle
		g.setColor(Color.BLACK);
		g.fillOval(20, 20, size-40, size-40);
		
		g.setColor(Color.WHITE);
		g.fillOval(30, 30, size-60	, size-60);
		
		//Lines
		for (int i = 0; i < 60; i++) {
		      radius = size-80;
			time=(i+1)%60/60*Math.PI*2;
			
			anim=(int)((center)+(Math.sin(time)*radius/2));
			anim2=(int)((center)+(Math.cos(time)*radius/2));
			
			radius=size-60;
			anim3=(int)((center)+(Math.sin(time)*radius/2));
			anim4=(int)((center)+(Math.cos(time)*radius/2));
			g.setColor(Color.GREEN);
			g.drawLine(center, center, anim, anim2);
		}
		
		//Second Hand
		radius=size-80;
		time=System.currentTimeMillis()%60000/60000*Math.PI*2;
		anim=(int)((center)+(Math.sin(time)*radius/2));
		anim2=(int)((center)+(Math.cos(time)*radius/2));
		
		
		g.setColor(Color.RED);
		g.drawLine(center, center, anim2, anim);
		g.fillOval(center-5, center-5, 10, 10);
		
		g=getGraphics();
		g.drawImage(screen,0,0,null);
	}
}
