package com.arratlist;

import java.util.ArrayList;
import java.util.List;

public class GenericArraysList {
	public static void main(String args[])
	{
		//list<Integer>list1=new ArrayList<Interger>();
		List<Integer>list1=new ArrayList<>();
		list1.add(12);
		list1.add(89);
		list1.add(67);
		list1.add(56);
		System.out.println(list1);
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
			int data=list1.get(i)+10;
			list1.set(i, data);
		}
		System.out.println(list1);
	}

}
