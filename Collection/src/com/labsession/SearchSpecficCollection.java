package com.labsession;

import java.util.ArrayList;

//15 search the specified collection in this collection
public class SearchSpecficCollection {
	public static void main(String args[])
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(89);
		al.add(67);
		al.add(56);
		al.add(45);
		System.out.println(al);
		al.indexOf(67);
		System.out.println(al.indexOf(67));
	}

}
