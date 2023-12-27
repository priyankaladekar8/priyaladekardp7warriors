package com.labsession;

import java.util.ArrayList;
//10 wap to ratain all elements from arraylist

public class ReatainAllElements {
	public static void main(String args[])
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(7);
		al.add(6);
		al.add(8);
		al.add(3);
		al.add(2);
		System.out.println(al);
		
		
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(7);
		al2.add(6);
		al2.add(8);
		
		al.retainAll(al2);
		System.out.println(al);
		
		
		
	}

}
