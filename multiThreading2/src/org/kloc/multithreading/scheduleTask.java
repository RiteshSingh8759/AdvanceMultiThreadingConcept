package org.kloc.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class scheduleTask 
{
	public static void main(String[] args) 
	{
		//for scheduling of tasks
		ScheduledExecutorService service=Executors.newScheduledThreadPool(10);
		// task to run after 10 second delay
		service.schedule(new Task1(),1,TimeUnit.SECONDS);
		//task to run repeatedly every 10 seconds
		service.scheduleAtFixedRate(new Task1(),2,1, TimeUnit.SECONDS);
		//task to run repeatedly 10 seconds after previous task completes
		service.scheduleWithFixedDelay(new Task1(),3, 2,TimeUnit.SECONDS);
	}
}
class Task1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("the thread is :"+Thread.currentThread().getName());
		
	}
	
}
