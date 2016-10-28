package com.Hafsa;

import java.util.Iterator;
import java.util.Vector;

public class ExVector {
	
	public static void Vector1() {
		Vector <String> v=new Vector<String>();
		System.out.println(v.size()); //0
		System.out.println(v.capacity()); //10
		v.add("Hafsa");
		v.add("ulusal");
		v.add("ulusal"); 
		System.out.println(v.size());//3
		System.out.println(v.capacity()); //10
	}
	
	public static void Vector2() {
		Vector<Integer>	vector=new Vector<Integer>();
		vector.add(new Integer(5));
		vector.add(3);
		vector.add(new Integer(6));
		for(int i:vector)
			System.out.println(i);
		}
	
	public static void Vector3() {
		Vector<String> vector=new Vector<String>();
		vector.add("Hafsa");
		vector.add("ulusal");
		vector.add(1,"mustuk");
		System.out.println(vector.size());
		for(String i:vector)
			System.out.println(i);
	}
	
	public static void Vector4() {
		Vector<String> vector=new Vector<String>();
		vector.add("Hafsa");
		vector.add("ulusal");
		vector.add(1,"mustuk");
		
		Iterator iterator =vector.iterator();
		for(int i=0;i<vector.size();i++)
			System.out.println(iterator.next());
	}

	public static void main(String[] args) {
		//Vector1();
		//Vector2();
		//Vector3();
		Vector4();
	}

}
