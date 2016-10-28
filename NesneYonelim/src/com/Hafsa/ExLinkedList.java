package com.Hafsa;

import java.awt.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ExLinkedList {
	
	public static void Linked1() {
		LinkedList<String> list=new LinkedList<String>();
		list.add("hafsa");
		list.add("ulusal");
		list.add(2,"a");
		
		
		Collection collection=new LinkedList();
		collection.add("hafsa");
		collection.add("ulusal");
		
		list.addAll(collection);
		for(String a:list)
			System.out.println(a);
		
	}
	
	public static void Linked2() {
	
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
			linkedList.addFirst(new Integer(i));
		for(int k:linkedList)
			System.out.println(k);

	}
	
	public static void Linked3()
	{
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
			linkedList.add(new Integer(i));
		if(linkedList.contains(2))
			linkedList.remove(2);
		System.out.println(linkedList);
		for(int k:linkedList)
			System.out.println(k);
			
	}

	public static void main(String[] args) {
			//Linked2();
		Linked3();
		
	}

}
