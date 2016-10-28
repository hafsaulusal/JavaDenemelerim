package com.Hafsa;

public class ExThread extends Thread {
	int sayi;
	public ExThread(int a) {
		sayi=a;
	}
	
	public void Run()
	{
		int j=0;
		while(j<=3){
			yaz();
			j++;
		}
	}
	public void yaz()
	{
		System.out.println(sayi);
	}

}
