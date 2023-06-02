package org.kloc.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) 
	{
		Object key=new Object();
		BlockingQueue<Integer> q=new ArrayBlockingQueue<>(10);
		Thread producer=new Thread(new Runnable() {
			public void run() 
			{
				int count=0;
				while(true)
				{
					synchronized(key)
					{
						try 
						{
							
							q.put(count++);
							
							Thread.sleep(1000);
							System.out.println("Momo producer , plate size is :"+q.size());
							
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		});
		Thread consumer=new Thread(new Runnable(){
			public void run()
			{
				while(true)
				{
					synchronized(key)
					{
						try {	
						q.take();		
						Thread.sleep(800);
						System.out.println("Momo consumed, plate size ="+q.size());
					  }
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		});
		producer.start();
		consumer.start();

	}

}
