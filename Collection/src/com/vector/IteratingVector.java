package com.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String args[])
	{
		Vector<String>lang=new Vector<>(5);
		lang.add("C");
		lang.add("java");
		lang.add("python");
		lang.add("Angular");
		lang.add(".net");
		//1st way
		System.out.println("--------------------------");
		for(int i=0; i<lang.size(); i++)
		{
			System.out.println(lang.get(i));
		}
		System.out.println("----------------------------");
		// 2nd way
		for(String s: lang)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------");
		Iterator <String>itr=lang.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("---------------------------------");
	    
	    //3rd way
	    ListIterator <String>List=lang.listIterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(List.next());
	    }
	    System.out.println("----------------------------------");
	    
	    ListIterator<String>List1=lang.listIterator(lang.size());
	    while(List.hasPrevious())
	    {
	    	System.out.println(List1.previous());
	    }
	    
		
		

		
}
}
