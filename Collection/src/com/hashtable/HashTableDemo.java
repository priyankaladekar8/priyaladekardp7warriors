package com.hashtable;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[])
	{
		Hashtable<Integer,String>ht=new Hashtable<>();
		
		System.out.println(ht.put(2, "shahid"));
		System.out.println(ht.put(2, "Hrishikesh"));
		

		ht.put(3, "Shradha");
		ht.put(4, "Pratiksha");
		ht.put(5, "Shivani");
		
		//ht.put(null, "anonymous");//no null keys and no null values
		//ht.put(6, null);
		
		System.out.println(ht);
		
		
	}

}
