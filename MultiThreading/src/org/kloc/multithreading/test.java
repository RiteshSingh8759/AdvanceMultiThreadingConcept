package org.kloc.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class test {

	public static void main(String[] args) throws InterruptedException 
	{
		BlockingQueue<Integer> bqueue=new ArrayBlockingQueue<>(5);
		Production p=new Production(bqueue);
		Consumer c=new Consumer(bqueue);
		p.start();
	
		c.start();	
	}
}
