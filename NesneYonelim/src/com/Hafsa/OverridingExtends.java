package com.Hafsa;

public class OverridingExtends extends Overriding {

	int k;
	OverridingExtends(int x,int y,int v) {
		super(x, y);
		k=v;
	}
	
	void show()
	{
		System.out.println(k);
	}
	
}
