package org.kloc.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WhyNotFuture 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		ExecutorService service=Executors.newFixedThreadPool(10);
		//it cannot be manually completed
		// Multiple Futures cannot be chained together
		// we can not combine multiple futures together
		// No proper Exception Handling
		Future<List<Integer>> future1=service.submit(()->{
			//u are doing Api call
			System.out.println("Thread : "+Thread.currentThread().getName());		 
			return Arrays.asList(1,2,3,4,5,6);
		});
		Future<List<Integer>> future2=service.submit(()->{
			//u are doing Api call
			System.out.println("Thread : "+Thread.currentThread().getName());		 
			return Arrays.asList(2,5,32,5,23);
		});
		Future<List<Integer>> future3=service.submit(()->{
			//u are doing Api call
			System.out.println("Thread : "+Thread.currentThread().getName());		 
			return Arrays.asList(1,9,7,5,4,32,2);
		});
		List<Integer> list1=future1.get();
		System.out.println(list1);
		List<Integer> list2=future2.get();
		System.out.println(list2);
		List<Integer> list3=future3.get();
		System.out.println(list3);
	}
	private static void Delay(int min)
	{
		try {
			TimeUnit.MINUTES.sleep(min);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
