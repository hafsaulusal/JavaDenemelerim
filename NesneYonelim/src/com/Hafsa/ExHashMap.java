package com.Hafsa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExHashMap {
	
	public static void HashM1() {
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(new Integer(1), "1");
		hashMap.put(new Integer(2), "2");
		hashMap.put(new Integer(2), "2");
		
		String object=hashMap.get(1);
		System.out.println(object);
		System.out.println(hashMap);	
	}
	
	public static void Hash2() {
		int toplam = 0;
		Map<Integer,Character> map=new HashMap<Integer,Character>();
		
		for(int i=65;i<=90;i++)
			map.put(i,(char) i);
		
		Set<Integer> kSet=map.keySet();
		Iterator<Integer> iterator=kSet.iterator();
		
		while (iterator.hasNext())
		toplam=toplam+iterator.next();
			System.out.println(toplam);
	}
	
	private HashMap hashMap;
	private TreeMap treeMap;
	public void Hash3()
	{
		hashMap=new HashMap();
		hashMap.put(1,"hafsa");
		hashMap.put(2,"ulusal");
		hashMap.put(4,"hafsa");
		hashMap.put(5,"ulusal");
		treeMap=new TreeMap(hashMap);
	}

	public static void main(String[] args) {
	//Hash2();
		ExHashMap exHashMap=new ExHashMap();
		exHashMap.Hash3();
		System.out.println(exHashMap.treeMap);
		System.out.println(exHashMap.hashMap);
	}

}
