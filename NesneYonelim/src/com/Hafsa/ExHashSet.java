package com.Hafsa;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPopupMenu.Separator;

public class ExHashSet {
	
	public static void Hash1 () {
		HashSet set=new HashSet();
		set.add("Hafsa");
		set.add(2);
		set.add("ulusal");
		set.add(1);
		set.add(1);
		System.out.println(set);	
	}
	
	public static void Hash2() {
		HashSet<String> hashSet=new HashSet<String>();
		Collection collection=new HashSet();
		collection.add("Hafsa");
		collection.add("ulusal");
		collection.add("samsun");
		
		hashSet.addAll(collection);
		
		Iterator iterator=hashSet.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println(hashSet);
	}
	

	public static void main(String[] args) {
		//Hash1();
		Hash2();
	}

}
