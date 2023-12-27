package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//2
public class IteratingHashMap {
	
	public static void main(String[] args) {
		
      HashMap<String, Double> hm= new HashMap<>();
		
		hm.put("Kailash", 89.6);
		hm.put("Neha", 89.6);
		hm.put("Anuj", 90.4);
		hm.put("Aniket", 99.3);
		hm.put("Vishal", 84.5);
		
		// 1st way
		System.out.println(hm);
		
		// 2nd way
		
		System.out.println("=====================================");
		
		Set<String> keys =hm.keySet();
		
		for(String s: keys)
		{
			System.out.println(s+"--->"+ hm.get(s));
		}
		
		System.out.println("=====================================");
		// 3rd way
		
		Iterator<String> itr= keys.iterator(); 
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+"--->"+hm.get(k));
		}
		
		
		System.out.println("=====================================");
		//4th way
		
	   Collection<Double> marks  =hm.values();
	   for(Double m: marks)
	   {
		   System.out.println(m);
	   }
	  
		System.out.println("=====================================");
		// 5th way
		
		Set<Entry<String, Double>> entries=hm.entrySet();
		
		for(Entry<String,Double> e:entries)
		{
			System.out.println(e.getKey()+"=="+e.getValue());
		}
		
		System.out.println("=====================================");
		
		// 6th way
		 
		
		for(Map.Entry<String, Double> e:hm.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
		
	}
	
	

}
