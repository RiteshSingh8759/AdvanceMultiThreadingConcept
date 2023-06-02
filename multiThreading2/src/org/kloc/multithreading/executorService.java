package org.kloc.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class executorService implements Callable<String> 
{
	int i;
	public executorService(int i)
	{
		this.i=i;
	}
//	@Override
//	public void run() 
//	{
//		System.out.println(i+"");	
//	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("thread "+i);
		return "from thread "+i;
	}
	public static void main(String[] args) throws InterruptedException 
	{
//		ExecutorService es=Executors.newFixedThreadPool(2);
//		System.out.println(new Date());
//		for(int i=1;i<=25;i++)
//		{
//			es.execute(new executorService(i));
//		}
//		es.shutdown();
//		es.awaitTermination(6, TimeUnit.SECONDS);
//		System.out.println(new Date());
		//--------By using submit by runnable-------
//		ExecutorService es=Executors.newFixedThreadPool(2);
//		List<Future<String>> future=new ArrayList<>();
//		System.out.println(new Date());
//		for(int i=1;i<=10;i++)
//		{
//			future.add((Future<String>) (es.submit(new executorService(i))));
//		}
//		es.shutdown();
//		es.awaitTermination(6, TimeUnit.SECONDS);
//		future.forEach(e->{
//			try {
//				System.out.println(e.get());
//			} catch (InterruptedException | ExecutionException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		});
//		System.out.println(new Date());
		//-------By using Callable interface---------
		ExecutorService es=Executors.newFixedThreadPool(2);
		List<Future<String>> future=new ArrayList<>();
		System.out.println(new Date());
		for(int i=1;i<=10;i++)
		{
			
			future.add((Future<String>) (es.submit(new executorService(i))));
		}
		es.shutdown();
		es.awaitTermination(6, TimeUnit.SECONDS);
		future.forEach(e->{
			try {
				System.out.println(e.get());
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		System.out.println(new Date());
	}
}
