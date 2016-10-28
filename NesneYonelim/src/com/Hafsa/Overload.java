package com.Hafsa;

public class Overload {
	
	static int a;
	static boolean b;
	static double c;
	
	void test(int i,int j)
	{
		a=i+j;
		System.out.println(a);
	}
	
	void test(int i,int j,int k)
	{
		b=(i>j)? (j>k):(j<k);
		System.out.println(b);
	}
	
	void test(int i)
	{
		c=i;
		System.out.println(c);
	}

}
