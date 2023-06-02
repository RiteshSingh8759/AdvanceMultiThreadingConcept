package org.kloc.multithreading;

public class DeadLock  
{
	final static String s1="Ritesh";
	final static String s2="siya";
	public static void main(String[] args) 
	{
		Thread t1=new Thread() {
			public void run()
			{
				synchronized (s1)
				{
					try {
						System.out.println("hii...ritesh");
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						
					}
					synchronized (s2) {
						try {
							System.out.println("hii...avinash");
							Thread.sleep(1000);
						}
						catch(InterruptedException e)
						{
							
						}
					}
				}
			}
		};
		//----------------
		Thread t2=new Thread() {
			public void run()
			{
				synchronized (s2)
				{
					try {
						System.out.println("hii...ankush");
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						
					}
					synchronized (s1) {
						try {
							System.out.println("hii...jilani");
							Thread.sleep(1000);
						}
						catch(InterruptedException e)
						{
							
						}
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
