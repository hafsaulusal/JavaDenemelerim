package com.Hafsa;

public class ExampleV1 {
	
	static int m=10;
	static int[] a=new int [m];

	public static void main(String[] args) {
	/*	int toplam=0;
		int[] a={1,2,3};
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(int k:a)
			toplam=k+toplam;
		System.out.println(toplam);
	*/	
		//ArrayYaz(a);
		//ArrayOku(a);
		
		GetterSetter getterSetter=new GetterSetter();
		getterSetter.a=10;
		getterSetter.b=20;
		getterSetter.sets(40);
		
		System.out.println(getterSetter.a +" "+getterSetter.b+" "+getterSetter.gets());
	}
	static void ArrayOku(int[] p)
	{
		for(int i=0;i<p.length;i++)
			System.out.println(p[i]);
	}

	static void ArrayYaz(int[] t)
	{
		for(int i=0;i<t.length;i++)
			t[i]=i*3;
	}
	
}
