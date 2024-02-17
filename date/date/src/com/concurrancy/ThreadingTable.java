package com.concurrancy;

public class ThreadingTable extends Thread{
	
	Thread t1,t2;
	public ThreadingTable()
	{
		t1=new Thread(this);
		t1.start();
		
		t2=new Thread(this);
		t2.start();
	}
	public synchronized void run()
	{
		System.out.println("Run method call....");
		if(Thread.currentThread()==t1)
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(55*i);
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
			if(Thread.currentThread()==t2)
			{
				for(int i=1;i<10;i++)
				{
					System.out.println(110*i);
					
				}
			}
		}
		
			public static void main(String[] args)
			{
				ThreadingTable t1=new ThreadingTable();
				System.out.println("Multithreading");
			}
		}
	
