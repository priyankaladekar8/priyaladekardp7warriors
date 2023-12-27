package com.task;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeLinkedList {
	public static void main(String args[])
	{
		LinkedList<Bike>list=new LinkedList<>();
		
		list.add(new Bike(11, "honda", 70000, 2010));
		list.add(new Bike(12, "shine", 80000, 2020));
		list.add(new Bike(13, "jupitar", 90000, 2008));
		list.addFirst(new Bike(14, "splendar", 60000, 2004));
		list.addLast(new Bike(15, "royal-enfield", 40000, 2020));
		list.add(new Bike(16, "honda", 20000, 2025));
		
		for(Bike b: list)
		{
			System.out.println(b);
		}
		System.out.println("---------------");
		Collections.sort(list);
		for(Bike b: list)
		{
			System.out.println(b);
		}
		System.out.println("------------");
		
		Iterator<Bike>itr=list.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getModelyear()<2010)
				itr.remove();
		}
		for(Bike b: list)
		{
			System.out.println(b);
		}
	}
}

		