package com.hashmap;

import java.util.HashMap;
//1
public class HashMapDemo {
	public static void main(String args[])
	{
		HashMap<String, Double>hm=new HashMap<>(); //<>generics
		
		hm.put("kailash", 89.6);
		hm.put(null,  0.0); //return 0
		hm.put(null, 100.0);//replace 0 with 100
		hm.put("neha", 89.6);
		hm.put("anuj", 99.9);
		hm.put("aniket", 99.3);
		hm.put("vishal", 84.5);
		
		
		System.out.println(hm);
		System.out.println("Size "+hm.size() );
		//get
		System.out.println("marks of vishal: "+hm.get("vishal"));
		System.out.println("Suraj: "+hm.containsKey("suraj"));
		System.out.println("anuj :"+hm.containsKey("anuj"));
		System.out.println("89.6 "+hm.containsValue(89.6));
		
		//putIfAbsent
		System.out.println(hm.putIfAbsent("neha",65.3));
		System.out.println(hm);
		System.out.println(hm.putIfAbsent("suraj", 78.4));
		System.out.println(hm);
		
		
		
		
		
		
	}

}
