package org.kloc.multithreading;

public class copyConstructor 
{
	String name;
	String leetcode;
	
	public copyConstructor(String name, String leetcode) {
		super();
		this.name = name;
		this.leetcode = leetcode;
	}
	public copyConstructor(copyConstructor c)
	{
		c.name=name;
		c.leetcode=leetcode;
	}

	public static void main(String[] args) 
	{
		copyConstructor ct=new copyConstructor("ritesh","ritesh8759@gmail.com");
		copyConstructor cs=new copyConstructor(ct);
		System.out.println(ct);
		System.out.println(cs);
	}
	@Override
	public String toString() {
		return "copyConstructor [name=" + name + ", leetcode=" + leetcode + "]";
	}

}
