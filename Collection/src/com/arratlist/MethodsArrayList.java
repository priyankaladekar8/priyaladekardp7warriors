package com.arratlist;

import java.util.ArrayList;

public class MethodsArrayList {
	public static void main(String args[])
	{
		ArrayList<String> a1=new ArrayList<>();
		System.out.println(a1.isEmpty());
		a1.add("java");
		a1.add("python");
		a1.add("Angular");
		a1.add("Spring");
		a1.add("java");
		a1.add(null);
		a1.add(null);
		System.out.println(a1.isEmpty());
		System.out.println(a1);
		System.out.println("-----------");
		
		//difference set and add\
		a1.add(2,"HTML");
		System.out.println(a1);//add and shift
		
		a1.set(5,"Devops");
		System.out.println(a1);//replace
		
		ArrayList<String> al2=new ArrayList<>(5);
		al2.add(".net");
		al2.add("SQL");
		
		ArrayList<String> al3=new ArrayList<>(5);
		al3.add(".net");
		al3.add("SQL");
		al3.add("java");
		al3.add("React");
		System.out.println(al2);
		//a1.addAll(a12);
		//System.out.println(a1);
		
		a1.addAll(2,al2);
		System.out.println(a1);
		System.out.println(a1.contains("java"));
		System.out.println(a1.contains("React"));
		System.out.println(a1.containsAll(al3));//al elements of al3 must be present in a1
		System.out.println(a1.size());
		
		//remove
		System.out.println(a1.remove(4));//return elements
		System.out.println(a1.remove("HTML"));
		//system.out.println(a1.remove("java"();//return boolean
		//a1.removeAll(al3);//remove all elements which matches al3
		//system.out.println(a1);
		a1.retainAll(al3);//keep only those elements which matches al3 and removes rest
		System.out.println(a1);
		
		
	
		
		
		
	}

}
