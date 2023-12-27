package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {
	public static void main(String[]args)
	{
		LinkedList<String>al=new LinkedList<>();
		al.add("mango");
		al.add("cherry");
		al.add("banana");
		al.add("Orange");
		al.add("Kiwi");
		
		ListIterator<String>litr=al.listIterator(al.size());
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("--------------------");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("------------------------");
		//using enhance for loop
		
		for(String s: al)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------");
		
		//iterator 
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------");
		
		//using list iterator: forward
		
		ListIterator<String>litr1=al.listIterator();
		while(litr1.hasNext())
		{
			System.out.println(litr1.next());
		}
		System.out.println("----------------------");
		
		//list iterator :backward
		
		ListIterator<String>litr11=al.listIterator(al.size());
		
		while(litr11.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("------------------------");
		

	}

}
