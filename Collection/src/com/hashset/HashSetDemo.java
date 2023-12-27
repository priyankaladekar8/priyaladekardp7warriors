package com.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String args[])
	{
		HashSet<String>hs=new HashSet<>();
		hs.add("java");
		hs.add("c++");
		System.out.println(hs.add("Go"));
		hs.add("sql");
		hs.add("python");
		hs.add("Angular");
		System.out.println(hs.add("Go"));//true //duplicate is not allowed
		hs.add(null); //  print in  0 index only
	
		System.out.println(hs);
		
		HashSet<String> hs2=new HashSet<>();
		
		hs2.add("Java");
		hs2.add("c++");
		hs2.add(".net");
		
		//mathematical operation //union
		hs.addAll(hs2);
		System.out.println(hs);
		
		//difference
		
		hs.removeAll(hs2);
		System.out.println(hs);
		
		//intersection
		hs.retainAll(hs2);
		System.out.println(hs); //commanElements
	}

}
