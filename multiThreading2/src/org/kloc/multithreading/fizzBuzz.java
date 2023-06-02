package org.kloc.multithreading;

import java.util.Scanner;

public class fizzBuzz 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value = ");
		int n=sc.nextInt();
		Thread1 t1=new Thread1(n);
		Thread2 t2=new Thread2(n);
		Thread3 t3=new Thread3(n);
		t1.start();
		t2.start();
		t3.start();
	
	}
}
class Thread1 extends Thread
{
	int a;
	public Thread1(int n)
	{
		this.a=n;
	}
	public void run()
	{
		if(a%3==0&&a%5==0)
		{
			System.out.println("FizzBuzz");
			
		}
	}
}
class Thread2 extends Thread
{
	int b;
	public Thread2(int n)
	{
		this.b=n;
	}
	public void run()
	{
		if(b%3==0)
		{
			System.out.println("Fizz");
		}
	}
}
class Thread3 extends Thread
{
	int c;
	public Thread3(int n)
	{
		this.c=n;
	}
	public void run()
	{
		if(c%5==0)
		{
			System.out.println("Buzz");
		}
	}
}

