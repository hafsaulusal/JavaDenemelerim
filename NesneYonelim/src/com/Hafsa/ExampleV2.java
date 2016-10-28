package com.Hafsa;

import java.net.NetworkInterface;
import java.util.Scanner;

public class ExampleV2 {

	public static void main(String[] args) {
		
		/*Scanner scanner=new Scanner(System.in);
		String sayi,ileti;
		
		sayi=scanner.nextLine();
		
		switch (sayi) {
		case "1":
			ileti="1 sayýsý";
			break;
		case "2":
			ileti="2 sayisi";
			break;
		case "3":
			ileti="3 sayisi";
			break;
		default:
			ileti="sayi girmedi";
			break;
		}
		System.out.println(ileti);
		
		 
		int a=5;
		boolean b=(3>2)?(3<a):(3>a);
		System.out.println(b);
		*/
		/*
		Overload overload=new Overload();
		overload.test(20);
		overload.test(2,4,6);
		overload.test(4,7);	
		*/
		/*
		OverridingExtends ext=new OverridingExtends(4, 20, 30);
		ext.show();
		ext.showata();
		 */
		ExThread exThread=new ExThread(10);exThread.start();
		ExThread exThread2=new ExThread(100);exThread2.start();
		ExThread exThread3=new ExThread(104);exThread3.start();
		ExThread exThread4=new ExThread(102);	exThread4.start();
		
	

	
	}

}
