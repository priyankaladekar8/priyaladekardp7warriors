package com.labsession;

import java.util.ArrayList;

//9 Remove all elements from arrayList

public class RemoveElements {
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("mango");
		al.add("papaya");
		al.add("Guava");
		al.add("apple");
		al.add("banana");
		al.add("jam");
		System.out.println(al);
		
		
		ArrayList<String>al2=new ArrayList<>();
		al2.add("mango");
		al2.add("papaya");
		al2.add("Guava");
		al2.add("apple");
		
		al.removeAll(al2);
		System.out.println(al);
		
		
	
	}

}
