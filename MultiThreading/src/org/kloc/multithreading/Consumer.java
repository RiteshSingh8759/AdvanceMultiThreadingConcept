package org.kloc.multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread
{
	BlockingQueue<Integer> obj;

	public Consumer(BlockingQueue<Integer> obj) {
		super();
		this.obj = obj;
	}
	 public void run()
	{
		int i=0;
		while(i<4)
		{
			try {
			   System.out.println("Consumer : "+obj.take());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			i++;
		}
	}
}
