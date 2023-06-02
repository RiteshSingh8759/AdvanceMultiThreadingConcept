package org.kloc.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool 
{
    public static void main(String[] args) {
	int count=Runtime.getRuntime().availableProcessors();
	System.out.println(count);
	ExecutorService service=Executors.newCachedThreadPool();
	int j=0;
	//submit the task for execution
	for(int i=0;i<100;i++)
	{
		service.execute(new Task());
		j++;
	}
	System.out.println(j);
	
   }
}
class Task implements Runnable
{
   @Override
   public void run() {
	System.out.println("Hii Ritesh"+"Thread Name:"+Thread.currentThread().getName());
	
	
}
}
