package com.labsession;

import java.util.ArrayList;
import java.util.Iterator;

//5 iterate the elements of arrayList using iterator

public class IterateElements {
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("java");
		al.add("HTML");
		al.add("SpringBoot");
		al.add("bootStrap");
		System.out.println(al);
	
		//Iterate method
		Iterator<String>itr=al.iterator();
		for( int i=0; i<al.size(); i++)
		{
			System.out.println(itr.next());
		}
			
	}

}
