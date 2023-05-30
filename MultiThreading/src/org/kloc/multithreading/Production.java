package org.kloc.multithreading;

import java.util.concurrent.BlockingQueue;

public class Production extends Thread
{
	BlockingQueue<Integer> obj;
	public Production(BlockingQueue<Integer> obj) {
		super();
		this.obj = obj;
	}
	public  void run()
	{
		for(int i=1;i<=4;i++)
		{
			try 
			{
			    obj.put(i);
			    System.out.println("Production : "+ i);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
