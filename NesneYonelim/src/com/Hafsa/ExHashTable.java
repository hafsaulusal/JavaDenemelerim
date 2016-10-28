package com.Hafsa;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.omg.CosNaming.IstringHelper;

public class ExHashTable {
	
	public static void HashT1() {
		int key;
		Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();
		hashtable.put(new Integer(40), "hafsa");
		hashtable.put(new Integer(30), "ulusal");
		
		Enumeration enumeration=hashtable.keys();
		while (enumeration.hasMoreElements()) {
			key=(int) enumeration.nextElement();
			String value=(String)hashtable.get(key);
			System.out.println(key+" "+value);
		}

	}
	
	public static void Hash2() {
		Hashtable hashtable=new Hashtable();
		for(int i=0;i<100;i++)
		{
			Integer integer=new Integer(i);
			hashtable.put(integer,i);
		}
		System.out.println(hashtable);
		System.out.println(hashtable.get(new Integer(5)));
		
		Enumeration enumeration=hashtable.keys();
		while (enumeration.hasMoreElements()) {
			int key=(int) enumeration.nextElement();
			System.out.println(key);
		}
		
	}
	
	private static void Hash3() {
		Hashtable hashtable=new Hashtable();
		hashtable.put("1", "hafsa");
		hashtable.put("2","ulusal");
		
		Collection collection=hashtable.values();
		
		Iterator iterator=collection.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		Enumeration enumeration=hashtable.keys();
		while (enumeration.hasMoreElements()) {
			String key=(String) enumeration.nextElement();
			System.out.println(key);
		}
	}
	
	public static void Hash4() {
		Hashtable<Integer, String> hashtable=new Hashtable<Integer,String>();
		hashtable.put(1, "hafsa");
		hashtable.put(2, "ulusal");
		
		Collection collection=hashtable.values();
		Iterator iterator=collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Enumeration enumeration=hashtable.keys();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashT1();
		//Hash2();
		Hash4();
	}

}
