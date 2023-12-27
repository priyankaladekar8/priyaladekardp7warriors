package com.labsession;

import java.util.ArrayList;

//13 
public class EmptyArray {
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("Angular");
		al.add("Spring");
		al.add("html");
		System.out.println(al);
		System.out.println(al.isEmpty());
		
	}

}
