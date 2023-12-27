package com.collectionassingment;

import java.util.ArrayList;

public class ArrayListCommanName {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Dog");
		al.add("cat");
		al.add("moncky");
		al.add("elephant");
		al.add("birds");
		System.out.println("al"+al);
		System.out.println("=========================");
		
		ArrayList<String>a2=new ArrayList<>();
		a2.add("mango");
		a2.add("birds");
		a2.add("cat");
		a2.add("apple");
	
		System.out.println("a2 "+a2);
		System.out.println("============================");
		
		
		al.retainAll(a2); //forcommon elements
		
		System.out.println("commonElement:"+al);
		
	}

}
