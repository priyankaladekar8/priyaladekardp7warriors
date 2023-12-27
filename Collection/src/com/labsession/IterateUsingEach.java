package com.labsession;

import java.util.ArrayList;
//6. wap to iterate thought all elements in an arrayList using for each

public class IterateUsingEach {
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("java");
		al.add("HTML");
		al.add("SpringBoot");
		al.add("bootStrap");
		
		System.out.println(al);
		System.out.println("after for each");
		
		
		///for each
		for(String s: al)
		{
			
		System.out.println(al);
		break;
		}
	
	}

}
