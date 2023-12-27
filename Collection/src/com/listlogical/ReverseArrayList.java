package com.listlogical;

import java.util.ArrayList;

public class ReverseArrayList {
	static void reveseList(ArrayList<String>list)
	{
		for(int i=0, j=list.size()-1; i<list.size()/2; i++, j--)
		{
			String temp=list.get(i);
			list.set(i,  list.get(j));
			list.set(j,  temp);
		}
	}
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("Mango");
		al.add("papaya");
		al.add("banana");
		al.add("cherry");
		al.add("guava");
		System.out.println("before"+al);
		
		reveseList(al);
		System.out.println("after"+al);
		
	}

}
