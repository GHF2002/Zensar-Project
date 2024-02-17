package com.concurrancy;

public class DemoThreading extends Thread{

	Thread t1,t2;

	public DemoThreading() {
		t1=new Thread(this);
		t1.start();
		
		t2=new Thread(this);
		t2.start();
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		System.out.println("run is called....");
		synchronized(this)
		{
				if(Thread.currentThread()==t1)
				{
					for(int i=0;i<50;i++)
					{
						System.out.println("Java......by t1");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
		}		
		synchronized(this)
		{
		
		if(Thread.currentThread()==t2)
		{
			for(int i=0;i<50;i++)
			{
				System.out.println("Rocks......by t2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i==25)
					notify();

			}
		}
		}
	}
	public static void main(String[] args)
	{
		DemoThreading d1=new DemoThreading();
		DemoThreading d2=new DemoThreading();

		Thread th1= new Thread();
		Thread th2= new Thread();

		// setting priority
		th2.setPriority(2);
				
		
		//Get no of active threads
		System.out.println(Thread.activeCount());
	
		// get the priority of thread
		System.out.println(th2.getPriority());

		System.out.println("Is th1 is alive:"+th2.isAlive());

		System.out.println(th1.toString());

	//	d2.suspend();
		System.out.println("Threading");
	}
	
}