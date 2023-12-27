package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {
	public static void main(String args[])
	{
		TreeMap<Customer, Order>tmap=new TreeMap<>();
		tmap.put(new Customer (1, "anuj" , 987756098), new Order( 101, "Laptop" , 45000));
		tmap.put(new Customer (1, "anuj" , 987756098), new Order( 102, "pendrive" , 1000));
		
		tmap.put(new Customer (2, "Nilam" , 987754457), new Order( 103, "HardDisk" , 63000));
		
		tmap.put(new Customer (3, "Pratiksha" , 987756768), new Order( 104, "mobilephone" , 23000));
		
		tmap.put(new Customer (4, "neha" , 987756098), new Order( 101, "charger" , 670));
		
		tmap.put(new Customer (5, "dipti" , 987756656), new Order( 101, "hedphone" , 72000));
		
	for(Map.Entry<Customer, Order> e: tmap.entrySet())
		
	{
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		System.out.println("------------------------");
	}
		
	}

}
