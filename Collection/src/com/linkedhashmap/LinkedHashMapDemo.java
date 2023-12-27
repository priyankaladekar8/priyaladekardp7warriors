package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String args[])
	{
		LinkedHashMap<String, Double>lhm=new LinkedHashMap<>();
		lhm.put("suraj" , 89.0);
		lhm.put("priyanka", 90.0);
		lhm.put("pralay", 67.0);
		lhm.put("Pratiksha", 56.0);
		lhm.put("shivam", 76.0);
		lhm.put("harshada", 55.0);
		for(Map.Entry<String, Double> e: lhm.entrySet())
		{
			System.out.println(e.getKey()+""+e.getValue());
		}
		System.out.println(lhm.get("pralay"));
			
	}

}
