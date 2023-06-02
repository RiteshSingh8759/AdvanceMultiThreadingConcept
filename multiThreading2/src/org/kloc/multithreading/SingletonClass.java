package org.kloc.multithreading;

public class SingletonClass 
{
	static SingletonClass st;
	private SingletonClass()
	{
		System.out.println("hii-----");
	}
	static SingletonClass getInstance()
	{
		if(st==null)
		{
			st= new SingletonClass();
			return st;
		}
		else {
			return st;
		}
	}
	public static void main(String[] args) 
	{
		SingletonClass s=SingletonClass.getInstance();
		SingletonClass s1=SingletonClass.getInstance();
		SingletonClass s2=SingletonClass.getInstance();
		SingletonClass s3=SingletonClass.getInstance();
		SingletonClass s4=SingletonClass.getInstance();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
